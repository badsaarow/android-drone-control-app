package com.dji.sdk.sample.internal.controller;

import android.util.Log;
import androidx.annotation.NonNull;
import com.dji.sdk.sample.demo.flightcontroller.VirtualStickView;
import fi.iki.elonen.NanoHTTPD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebServer extends NanoHTTPD {

    public WebServer(String hostname, int port) {
        super(hostname, port);
        DJISampleApplication.getEventBus().register(this);
        Log.i("WebServer", "Start WebServer " + hostname + ":" + port);
    }

    private void listItem(StringBuilder sb, Map.Entry<String, ? extends Object> entry) {
        sb.append("<li><code><b>").append(entry.getKey()).append("</b> = ").append(entry.getValue()).append("</code></li>");
    }


    private String loadAssetFile(String inFile) {
        String tContents = "";

        try {
            InputStream stream = DJISampleApplication.getInstance().getAssets().open(inFile);

            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            tContents = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tContents;
    }

    @Override
    public Response serve(IHTTPSession session) {
        Map<String, List<String>> decodedQueryParameters = decodeParameters(session.getQueryParameterString());

        if (session.getUri().startsWith("/cmd")) {
            String cmd = session.getUri();
            // /cmd?lpx=5lpy=5&rpx=5&rpy=5
            Log.i("WebServer", toString(session.getParms()) + toString(decodedQueryParameters));
            Map<String, String> param = session.getParms();
            this.passCommand(cmd, param);
            return newFixedLengthResponse(Response.Status.OK, MIME_PLAINTEXT, "OK");
            //return newFixedLengthResponse(getHttpStatus(session, decodedQueryParameters));
        }else if (session.getUri().startsWith("/ctl")) {
            String cmd = session.getUri();
            // /ctl?owner=1
            Log.i("WebServer", toString(session.getParms()) + toString(decodedQueryParameters));
            Map<String, String> param =  session.getParms();
            this.passControlCommand(cmd, param);
            return newFixedLengthResponse(Response.Status.OK, MIME_PLAINTEXT, "OK");
                //return newFixedLengthResponse(getHttpStatus(session, decodedQueryParameters))
        } else  if (session.getUri().equals("/")) {
            return newFixedLengthResponse(getHttpStatus(session, decodedQueryParameters));
        } else  if (session.getUri().equals("/")) {
            return newFixedLengthResponse(loadAssetFile("www/index.html"));
        } else if (session.getUri().equals("/control")) {
            return newFixedLengthResponse(loadAssetFile("www/control.html"));
        } else if (session.getUri().equals("/joystick")) {
            return newFixedLengthResponse(loadAssetFile("www/drone_joystick.html"));
        } else if (session.getUri().equals("/gamepad")) {
            return newFixedLengthResponse(loadAssetFile("www/gamepad.html"));
        } else if (session.getUri().endsWith(".js")) {
            return newFixedLengthResponse(loadAssetFile("www" + session.getUri()));
        } else if (session.getUri().endsWith(".css")) {
            return newFixedLengthResponse(loadAssetFile("www" + session.getUri()));
        }

        return newFixedLengthResponse(Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
    }

    @NonNull
    private String getHttpStatus(IHTTPSession session, Map<String, List<String>> decodedQueryParameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head><title>Drone Remote Server</title></head>");
        sb.append("<body>");
        sb.append("<h1>Drone Remote Server</h1>");
        sb.append("<p><blockquote><b>URI</b> = ").append(String.valueOf(session.getUri())).append("<br />");
        sb.append("<b>Method</b> = ").append(String.valueOf(session.getMethod())).append("</blockquote></p>");
        sb.append("<h3>Headers</h3><p><blockquote>").append(toString(session.getHeaders())).append("</blockquote></p>");
        sb.append("<h3>Parms</h3><p><blockquote>").append(toString(session.getParms())).append("</blockquote></p>");
        sb.append("<h3>Parms (multi values?)</h3><p><blockquote>").append(toString(decodedQueryParameters)).append("</blockquote></p>");

        try {
            Map<String, String> files = new HashMap<String, String>();
            session.parseBody(files);
            sb.append("<h3>Files</h3><p><blockquote>").append(toString(files)).append("</blockquote></p>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sb.append("<br/><a href=/control>Controller</a><br/>");
        sb.append("<br/><a href=/joystick>Joystick</a><br/>");
        sb.append("<br/><a href=/gamepad>Joystick Status</a><br/>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    //Announce that the file server accepts partial content requests
    private Response createResponse(Response.Status status, String mimeType,
                                    InputStream message) {
        Response res = newChunkedResponse(status, mimeType, message);
        res.addHeader("Accept-Ranges", "bytes");
        return res;
    }

    /**
     * Serves file from homeDir and its' subdirectories (only). Uses only URI,
     * ignores all headers and HTTP parameters.
     */
    private Response serveFile(String uri, Map<String, String> header,
                               File file, String mime) {
        Response res;
        try {
            // Calculate etag
            String etag = Integer.toHexString((file.getAbsolutePath()
                    + file.lastModified() + "" + file.length()).hashCode());

            // Support (simple) skipping:
            long startFrom = 0;
            long endAt = -1;
            String range = header.get("range");
            if (range != null) {
                if (range.startsWith("bytes=")) {
                    range = range.substring("bytes=".length());
                    int minus = range.indexOf('-');
                    try {
                        if (minus > 0) {
                            startFrom = Long.parseLong(range
                                    .substring(0, minus));
                            endAt = Long.parseLong(range.substring(minus + 1));
                        }
                    } catch (NumberFormatException ignored) {
                    }
                }
            }

            // Change return code and add Content-Range header when skipping is
            // requested
            long fileLen = file.length();
            if (range != null && startFrom >= 0) {
                if (startFrom >= fileLen) {
                    res = newFixedLengthResponse(Response.Status.RANGE_NOT_SATISFIABLE,
                            NanoHTTPD.MIME_PLAINTEXT, "");
                    res.addHeader("Content-Range", "bytes 0-0/" + fileLen);
                    res.addHeader("ETag", etag);
                } else {
                    if (endAt < 0) {
                        endAt = fileLen - 1;
                    }
                    long newLen = endAt - startFrom + 1;
                    if (newLen < 0) {
                        newLen = 0;
                    }

                    final long dataLen = newLen;
                    FileInputStream fis = new FileInputStream(file) {
                        @Override
                        public int available() throws IOException {
                            return (int) dataLen;
                        }
                    };
                    fis.skip(startFrom);

                    res = createResponse(Response.Status.PARTIAL_CONTENT, mime,
                            fis);
                    res.addHeader("Content-Length", "" + dataLen);
                    res.addHeader("Content-Range", "bytes " + startFrom + "-"
                            + endAt + "/" + fileLen);
                    res.addHeader("ETag", etag);
                }
            } else {
                if (etag.equals(header.get("if-none-match")))
                    res = newFixedLengthResponse(Response.Status.NOT_MODIFIED, mime, "");
                else {
                    res = createResponse(Response.Status.OK, mime,
                            new FileInputStream(file));
                    res.addHeader("Content-Length", "" + fileLen);
                    res.addHeader("ETag", etag);
                }
            }
        } catch (IOException ioe) {
            res = newFixedLengthResponse(Response.Status.FORBIDDEN,
                    NanoHTTPD.MIME_PLAINTEXT, "FORBIDDEN: Reading file failed.");
        }

        return res;
    }

    private void passCommand(String cmd, Map<String, String> param) {
        Log.i("WebServer", "passCommand " + cmd + ", " + param.toString());

        //should call every 100ms
        DJISampleApplication.getEventBus().post(new VirtualStickView.WebControlEvent(cmd, param));
    }

    private void passControlCommand(String cmd, Map<String, String> param) {
        Log.i("WebServer", "passCommand " + cmd + ", " + param.toString());

        //ctl?owner=1
        DJISampleApplication.getEventBus().post(new VirtualStickView.WebControlEvent(cmd, param));

    }
    private String toString(Map<String, ? extends Object> map) {
        if (map.size() == 0) {
            return "";
        }
        return unsortedList(map);
    }

    private String unsortedList(Map<String, ? extends Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            listItem(sb, entry);
        }
        sb.append("</ul>");
        return sb.toString();
    }
}
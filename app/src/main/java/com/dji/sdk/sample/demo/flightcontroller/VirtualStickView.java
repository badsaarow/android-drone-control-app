package com.dji.sdk.sample.demo.flightcontroller;

import android.app.Service;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import androidx.annotation.NonNull;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.OnScreenJoystickListener;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.OnScreenJoystick;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import com.squareup.otto.Subscribe;
import dji.common.error.DJIError;
import dji.common.flightcontroller.simulator.InitializationData;
import dji.common.flightcontroller.simulator.SimulatorState;
import dji.common.flightcontroller.virtualstick.*;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import dji.keysdk.FlightControllerKey;
import dji.keysdk.KeyManager;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.flightcontroller.Simulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import static com.google.android.gms.internal.zzahn.runOnUiThread;

/**
 * Class for virtual stick.
 */
public class VirtualStickView extends RelativeLayout
        implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, PresentableView {

    private final static String TAG = "VirtualStickView";
    private static VirtualStickView _this = null;
    private boolean yawControlModeFlag = true;
    private boolean rollPitchControlModeFlag = true;
    private boolean verticalControlModeFlag = true;
    private boolean horizontalCoordinateFlag = true;
    private boolean centralControlFlag = true; // by http.  ignore on screen joystick
    private Button btnEnableVirtualStick;
    private Button btnDisableVirtualStick;
    private Button btnHorizontalCoordinate;
    private Button btnSetYawControlMode;
    private Button btnSetVerticalControlMode;
    private Button btnSetRollPitchControlMode;
    private Button btnUseTabletStick;
    private ToggleButton btnSimulator;
    private Button btnTakeOff;
    private TextView textView;
    private OnScreenJoystick screenJoystickRight;
    private OnScreenJoystick screenJoystickLeft;
    private Timer lostControlSignalTimer;
    private LostControlSignalTask lostControlSignalTask;
    private float pitch; // The velocity (m/s) or angle (degrees) value for pitch
    private float roll;
    private float yaw;
    private float throttle;
    private float lpx, lpy, rpx, rpy;
    private FlightControllerKey isSimulatorActived;
    private FlightController flightController = null;
    private Boolean virtualSticksEnabled = false;

    public VirtualStickView(Context context) {
        super(context);
        init(context);
        _this = this;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setUpListeners();
        DJISampleApplication.getEventBus().register(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        flightController = ModuleVerificationUtil.getFlightController();
        if (flightController != null) {
            flightController.setVirtualStickModeEnabled(false, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    ToastUtils.showToast(djiError + "");
                }
            });
        }

        DJISampleApplication.getEventBus().unregister(this);
        if (null != lostControlSignalTimer) {
            if (lostControlSignalTask != null) {
                lostControlSignalTask.cancel();
            }
            lostControlSignalTimer.cancel();
            lostControlSignalTimer.purge();
            lostControlSignalTimer = null;
            lostControlSignalTask = null;
        }
        tearDownListeners();
        super.onDetachedFromWindow();
    }

    private void init(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_virtual_stick, this, true);

        initAllKeys();
        initUI();
    }

    private void initAllKeys() {
        isSimulatorActived = FlightControllerKey.create(FlightControllerKey.IS_SIMULATOR_ACTIVE);
    }

    private void initUI() {
        btnEnableVirtualStick = findViewById(R.id.btn_enable_virtual_stick);
        btnDisableVirtualStick = findViewById(R.id.btn_disable_virtual_stick);
        btnHorizontalCoordinate = findViewById(R.id.btn_horizontal_coordinate);
        btnSetYawControlMode = findViewById(R.id.btn_yaw_control_mode);
        btnSetVerticalControlMode = findViewById(R.id.btn_vertical_control_mode);
        btnSetRollPitchControlMode = findViewById(R.id.btn_roll_pitch_control_mode);
        btnUseTabletStick = findViewById(R.id.btn_use_tablet_stick);
        btnTakeOff = findViewById(R.id.btn_take_off);

        btnSimulator = findViewById(R.id.btn_start_simulator);

        textView = findViewById(R.id.textview_simulator);

        screenJoystickRight = findViewById(R.id.directionJoystickRight);
        screenJoystickLeft = findViewById(R.id.directionJoystickLeft);

        btnEnableVirtualStick.setOnClickListener(this);
        btnDisableVirtualStick.setOnClickListener(this);
        btnHorizontalCoordinate.setOnClickListener(this);
        btnSetYawControlMode.setOnClickListener(this);
        btnSetVerticalControlMode.setOnClickListener(this);
        btnSetRollPitchControlMode.setOnClickListener(this);
        btnTakeOff.setOnClickListener(this);
        btnUseTabletStick.setOnClickListener(this);
        btnSimulator.setOnCheckedChangeListener(VirtualStickView.this);

        Boolean isSimulatorOn = (Boolean) KeyManager.getInstance().getValue(isSimulatorActived);
        if (isSimulatorOn != null && isSimulatorOn) {
            btnSimulator.setChecked(true);
            textView.setText("Simulator is On.");
        }
    }

    private void setUpListeners() {
        Simulator simulator = ModuleVerificationUtil.getSimulator();
        if (simulator != null) {
            simulator.setStateCallback(new SimulatorState.Callback() {
                @Override
                public void onUpdate(@NonNull final SimulatorState simulatorState) {
                    ToastUtils.setResultToText(textView,
                            "Yaw : "
                                    + simulatorState.getYaw()
                                    + ","
                                    + "X : "
                                    + simulatorState.getPositionX()
                                    + "\n"
                                    + "Y : "
                                    + simulatorState.getPositionY()
                                    + ","
                                    + "Z : "
                                    + simulatorState.getPositionZ());
                }
            });
        } else {
            ToastUtils.setResultToToast("Disconnected!");
        }

        screenJoystickLeft.setJoystickListener(new OnScreenJoystickListener() {

            @Override
            public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
                if (centralControlFlag) return;

                rpx = pX;
                rpy = pY;

                handleStick(lpx, lpy, rpx, rpy);
            }
        });

        screenJoystickRight.setJoystickListener(new OnScreenJoystickListener() {

            @Override
            public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
                if (centralControlFlag) return;

                lpx = pX;
                lpy = pY;
                handleStick(lpx, lpy, rpx, rpy);
            }
        });
    }

    private void tearDownListeners() {
        Simulator simulator = ModuleVerificationUtil.getSimulator();
        if (simulator != null) {
            simulator.setStateCallback(null);
        }
        screenJoystickLeft.setJoystickListener(null);
        screenJoystickRight.setJoystickListener(null);
    }

    @Override
    public void onClick(View v) {
        if (flightController == null) {
            flightController = ModuleVerificationUtil.getFlightController();
        }

        if (flightController == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        try {
            sb.append("YawControlMode: " + flightController.getYawControlMode().toString());
            sb.append(", YawControlMode: " + flightController.getYawControlMode().toString());
            sb.append(", RollPitchControlMode: " + flightController.getRollPitchControlMode().toString());
            sb.append(", VerticalControlMode: " + flightController.getVerticalControlMode().toString());
            sb.append(", RollPitchCoordinateSystem: " + flightController.getRollPitchCoordinateSystem().toString());
            sb.append(", centralControlFlag: " + centralControlFlag);
            sb.append(", isFlightAssistantSupported: " + flightController.isFlightAssistantSupported());
            sb.append(", isLandingGearMovable: " + flightController.isLandingGearMovable());
            sb.append(", isAccessLockerSupported: " + flightController.isAccessLockerSupported());
            sb.append(", isConnected: " + flightController.isConnected());
            sb.append(", isOnboardFChannelAvailable: " + flightController.isOnboardFChannelAvailable());
            sb.append(", isOnboardSDKDeviceAvailable: " + flightController.isOnboardSDKDeviceAvailable());
            sb.append(", isPropellerCalibrationSupported: " + flightController.isPropellerCalibrationSupported());
            sb.append(", isRTKSupported: " + flightController.isRTKSupported());
            sb.append(", isVirtualFenceSupported: " + flightController.isVirtualFenceSupported());
            sb.append(", isVirtualStickAdvancedModeEnabled: " + flightController.isVirtualStickAdvancedModeEnabled());
            sb.append(", isVirtualStickControlModeAvailable: " + flightController.isVirtualStickControlModeAvailable());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.i(TAG, sb.toString());
        textView.setText(sb.toString());

        switch (v.getId()) {
            case R.id.btn_enable_virtual_stick:
                flightController.setRollPitchControlMode(RollPitchControlMode.VELOCITY); // ANGLE
                rollPitchControlModeFlag = true; //false
                flightController.setYawControlMode(YawControlMode.ANGULAR_VELOCITY);
                yawControlModeFlag = true;
                flightController.setVerticalControlMode(VerticalControlMode.VELOCITY);
                verticalControlModeFlag = true;
                flightController.setRollPitchCoordinateSystem(FlightCoordinateSystem.BODY);
                horizontalCoordinateFlag = true;

                flightController.setVirtualStickModeEnabled(true, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (djiError != null) {
                            ToastUtils.showToast(djiError.toString());
                        }
//                        flightController.setVirtualStickAdvancedModeEnabled(true);
                        flightController.getVirtualStickModeEnabled(new CommonCallbacks.CompletionCallbackWith<Boolean>() {
                            @Override
                            public void onSuccess(Boolean aBoolean) {
                                virtualSticksEnabled = aBoolean;
                                if (virtualSticksEnabled) {
                                    btnEnableVirtualStick.setBackgroundColor(Color.GREEN);
                                    startNoControlTimer();
                                } else {
                                    btnEnableVirtualStick.setBackgroundColor(Color.BLUE);
                                    lostControlSignalTask = null;
                                    lostControlSignalTimer = null;
                                }
                            }

                            @Override
                            public void onFailure(DJIError djiError) {
                                btnEnableVirtualStick.setBackgroundColor(Color.RED);
                            }
                        });
                    }
                });
                break;

            case R.id.btn_disable_virtual_stick:
                flightController.setVirtualStickModeEnabled(false, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (djiError != null) {
                            ToastUtils.showToast(djiError.toString());
                        }

                        flightController.getVirtualStickModeEnabled(new CommonCallbacks.CompletionCallbackWith<Boolean>() {
                            @Override
                            public void onSuccess(Boolean aBoolean) {
                                virtualSticksEnabled = aBoolean;
                                if (virtualSticksEnabled) {
                                    btnDisableVirtualStick.setBackgroundColor(Color.BLUE);
                                    startNoControlTimer();
                                } else {
                                    btnDisableVirtualStick.setBackgroundColor(Color.GREEN);
                                    lostControlSignalTask = null;
                                    lostControlSignalTimer = null;
                                }
                            }

                            @Override
                            public void onFailure(DJIError djiError) {
                                btnDisableVirtualStick.setBackgroundColor(Color.RED);
                            }
                        });
                    }
                });
                break;

            case R.id.btn_roll_pitch_control_mode:
                if (rollPitchControlModeFlag) {
                    flightController.setRollPitchControlMode(RollPitchControlMode.ANGLE);
                    rollPitchControlModeFlag = false;
                } else {
                    flightController.setRollPitchControlMode(RollPitchControlMode.VELOCITY);
                    rollPitchControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(flightController.getRollPitchControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_yaw_control_mode:
                if (yawControlModeFlag) {
                    flightController.setYawControlMode(YawControlMode.ANGLE);
                    yawControlModeFlag = false;
                } else {
                    flightController.setYawControlMode(YawControlMode.ANGULAR_VELOCITY);
                    yawControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(flightController.getYawControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_vertical_control_mode:
                if (verticalControlModeFlag) {
                    flightController.setVerticalControlMode(VerticalControlMode.POSITION);
                    verticalControlModeFlag = false;
                } else {
                    flightController.setVerticalControlMode(VerticalControlMode.VELOCITY);
                    verticalControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(flightController.getVerticalControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_horizontal_coordinate:
                if (horizontalCoordinateFlag) {
                    flightController.setRollPitchCoordinateSystem(FlightCoordinateSystem.GROUND);
                    horizontalCoordinateFlag = false;
                } else {
                    flightController.setRollPitchCoordinateSystem(FlightCoordinateSystem.BODY);
                    horizontalCoordinateFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(flightController.getRollPitchCoordinateSystem().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_take_off:

                flightController.startTakeoff(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.showToast(djiError + "");
                    }
                });

                break;

            case R.id.btn_use_tablet_stick:
                centralControlFlag = !centralControlFlag;
                ToastUtils.showToast("centralControlFlag: " + centralControlFlag);
                break;

            default:
                break;
        }
    }

    private void startNoControlTimer() {
        if (null != lostControlSignalTimer) {
            lostControlSignalTimer.cancel();
        } else {
            lostControlSignalTimer = new Timer();
        }

        if (lostControlSignalTask == null) {
            lostControlSignalTask = new LostControlSignalTask();
        }

        try {
            lostControlSignalTimer.schedule(lostControlSignalTask, 5000); // expire after 1s
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.i(TAG, "new Task handleStick " + pitch + ", roll:" + roll + ", yaw:" + yaw + ",throttle:" + throttle);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton == btnSimulator) {
            onClickSimulator(b);
        }
    }

    private void onClickSimulator(boolean isChecked) {
        Simulator simulator = ModuleVerificationUtil.getSimulator();
        if (simulator == null) {
            return;
        }
        if (isChecked) {
            textView.setVisibility(VISIBLE);

            simulator.start(InitializationData.createInstance(new LocationCoordinate2D(23, 113), 10, 10),
                    new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.showToast(djiError + "");
                        }
                    });
        } else {
            textView.setVisibility(INVISIBLE);

            simulator.stop(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    ToastUtils.showToast(djiError + "");
                }
            });
        }
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_virtual_stick;
    }

    @Subscribe
    public void onWebControlEvent(WebControlEvent event) {
        Log.i(TAG, "onWebControlEvent " + event.getCommand() + ", " + event.getParam().toString());
        // /cmd?lpy=5&rpx=5&rpy=5
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (event.getCommand().equals("/cmd")) {
                    _this.handleStick(
                            Float.parseFloat(event.getParam().get("lpx")),
                            Float.parseFloat(event.getParam().get("lpy")),
                            Float.parseFloat(event.getParam().get("rpx")),
                            Float.parseFloat(event.getParam().get("rpy")));
                } else if (event.getCommand().equals("/ctl")) {
                    Log.i(TAG, "ctl");

                    if (flightController == null) {
                        flightController = ModuleVerificationUtil.getFlightController();
                    }

                    if (flightController == null) {
                        return;
                    }

                    Map<String, String> param = event.getParam();
                    String owner = param.get("owner");
                    String takeoff = param.get("takeOff");
                    if (takeoff != null && takeoff.equals("1")) {
                        flightController.startTakeoff(new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                ToastUtils.showToast(djiError + "");
                            }
                        });
                        return;
                    }

                    if (owner != null && owner.equals("1")) {
                        flightController.setVirtualStickModeEnabled(true, new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                if (djiError != null) {
                                    ToastUtils.showToast(djiError.toString());
                                }
//                        flightController.setVirtualStickAdvancedModeEnabled(true);
                                flightController.getVirtualStickModeEnabled(new CommonCallbacks.CompletionCallbackWith<Boolean>() {
                                    @Override
                                    public void onSuccess(Boolean aBoolean) {
                                        virtualSticksEnabled = aBoolean;
                                        if (virtualSticksEnabled) {
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    btnEnableVirtualStick.setBackgroundColor(Color.GREEN);
                                                }
                                            });

                                            startNoControlTimer();
                                        } else {
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    btnEnableVirtualStick.setBackgroundColor(Color.BLUE);
                                                }
                                            });
                                            lostControlSignalTask = null;
                                            lostControlSignalTimer = null;
                                        }
                                    }

                                    @Override
                                    public void onFailure(DJIError djiError) {
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                btnEnableVirtualStick.setBackgroundColor(Color.RED);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        return;
                    }

                    flightController.setVirtualStickModeEnabled(false, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if (djiError != null) {
                                ToastUtils.showToast(djiError.toString());
                            }

                            flightController.getVirtualStickModeEnabled(new CommonCallbacks.CompletionCallbackWith<Boolean>() {
                                @Override
                                public void onSuccess(Boolean aBoolean) {
                                    virtualSticksEnabled = aBoolean;
                                    if (virtualSticksEnabled) {
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                btnDisableVirtualStick.setBackgroundColor(Color.BLUE);
                                            }
                                        });

                                        startNoControlTimer();
                                    } else {
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                btnDisableVirtualStick.setBackgroundColor(Color.GREEN);
                                            }
                                        });

                                        lostControlSignalTask = null;
                                        lostControlSignalTimer = null;
                                    }
                                }

                                @Override
                                public void onFailure(DJIError djiError) {
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            btnDisableVirtualStick.setBackgroundColor(Color.RED);
                                        }
                                    });

                                }
                            });
                        }
                    });
                }
            }
        });
    }

    public void handleStick(float lpX, float lpY, float rpX, float rpY) {
        lpx = lpX;
        lpy = lpY;
        rpx = rpX;
        rpy = rpY;

        if (Math.abs(lpX) < 0.02) {
            lpX = 0;
        }

        if (Math.abs(lpY) < 0.02) {
            lpY = 0;
        }

        if (Math.abs(rpX) < 0.02) {
            rpX = 0;
        }

        if (Math.abs(rpY) < 0.02) {
            rpY = 0;
        }

        pitch = lpX;
        roll = lpY;
        yaw = rpX;
        throttle = rpY;

        if (flightController == null) {
            flightController = ModuleVerificationUtil.getFlightController();
        }

        if (flightController == null) {
            return;
        }

        //if virtual sticks are enabled, send the command, otherwise turn them on
        if (virtualSticksEnabled) {

            if (null != lostControlSignalTimer) {
                lostControlSignalTimer.cancel();
            } else {
                lostControlSignalTimer = new Timer();
            }

            if (lostControlSignalTask == null) {
                lostControlSignalTask = new LostControlSignalTask();
            }
            try {
                lostControlSignalTimer.schedule(lostControlSignalTask, 5000); // expire after 1s
            } catch (Exception e) {
                e.printStackTrace();
            }


            flightController.sendVirtualStickFlightControlData(
                    new FlightControlData(
                            pitch, roll, yaw, throttle
                    ), new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if (djiError != null) {
                                Log.i(TAG, djiError.getDescription());
                                textView.setText(djiError.getDescription());
                            }
                        }
                    }
            );
        }
    }

    public static class WebControlEvent {
        private final String command;
        private final Map<String, String> param;

        public WebControlEvent(String command, Map param) {
            this.command = command;
            this.param = param;
        }

        public String getCommand() {
            return command;
        }

        public Map<String, String> getParam() {
            return param;
        }
    }

    private class LostControlSignalTask extends TimerTask {
        @Override
        public void run() {
            Map<String, String> param = new HashMap<>();
            param.put("owner", "0");
            DJISampleApplication.getEventBus().post(new VirtualStickView.WebControlEvent("/ctl", param));
        }
    }

    private class SendVirtualStickDataTask extends TimerTask {

        @Override
        public void run() {
            if (!ModuleVerificationUtil.isFlightControllerAvailable()) {
                Log.w(TAG, "SendVirtualStickDataTask FlightController is not Availble!");
                return;
            }

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textView.setText("FlightControlData: pitch:" +
                            pitch + ", roll:" +
                            roll + ", yaw:" +
                            yaw + ",throttle:" +
                            throttle + ", lpx:" +
                            lpx + ", lpy:" +
                            lpy + ", rpx:" +
                            rpx + ", rpy:" +
                            rpy);
                }
            });

            DJISampleApplication.getAircraftInstance()
                    .getFlightController()
                    .sendVirtualStickFlightControlData(new FlightControlData(pitch,
                                    roll,
                                    yaw,
                                    throttle),
                            new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {
                                    ToastUtils.showToast(djiError + "");
                                }
                            });
        }
    }
}

# drone

## Preparationis

- Install Android Studio

- Install Flutter
```powershell
scoop install flutter
flutter doctor --android-licenses
```


## Launch

```shell

> adb devices
List of devices attached
ce091609a378171705      unauthorized

> adb tcpip 4455
restarting in TCP mode port: 4455
> adb connect 192.168.123.85:4455
connected to 192.168.123.85:4455
> fluttter devices
fluttter: The term 'fluttter' is not recognized as a name of a cmdlet, function, script file, or executable program.
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
> flutter devices
4 connected devices:

SM G935S (mobile) • 192.168.123.85:4455 • android-arm64  • Android 8.0.0 (API 26)
Windows (desktop) • windows             • windows-x64    • Microsoft Windows [Version 10.0.19044.1706]
Chrome (web)      • chrome              • web-javascript • Google Chrome 98.0.4758.102
Edge (web)        • edge                • web-javascript • Microsoft Edge 101.0.1210.39
> flutter run
Launching lib\main.dart on SM G935S in debug mode...
Running Gradle task 'assembleDebug'...                            202.7s
✓  Built build\app\outputs\flutter-apk\app-debug.apk.
Installing build\app\outputs\flutter-apk\app.apk...               122.8s
Terminate batch job (Y/N)? y
> flutter run
Launching lib\main.dart on SM G935S in debug mode...
Running Gradle task 'assembleDebug'...                             32.5s
✓  Built build\app\outputs\flutter-apk\app-debug.apk.
Syncing files to device SM G935S...                                152ms

Flutter run key commands.
r Hot reload. 🔥🔥🔥
R Hot restart.
h List all available interactive commands.
d Detach (terminate "flutter run" but leave application running).
c Clear the screen
q Quit (terminate the application on the device).

💪 Running with sound null safety 💪

An Observatory debugger and profiler on SM G935S is available at: http://127.0.0.1:10716/wCdmEeAQLFo=/
The Flutter DevTools debugger and profiler on SM G935S is available at: http://127.0.0.1:9100?uri=http://127.0.0.1:10716/wCdmEeAQLFo=/
D/=== DjiPlugin Android( 4777): Connect Drone Started
```

## troubleshooting

```text
An Observatory debugger and profiler on SM G935S is available at: http://127.0.0.1:59425/8BuTgCC9RgI=/
```


## Rebuild plugin

```shell
flutter pub run pigeon \
--input pigeons/messages.dart \
--dart_out lib/messages.dart \
--objc_header_out ios/Classes/messages.h \
--objc_source_out ios/Classes/messages.m \
--objc_prefix FLT \
--java_out android/src/main/java/cloud/dragonx/plugin/flutter/dji/Messages.java \
--java_package "cloud.dragonx.plugin.flutter.dji" 
```
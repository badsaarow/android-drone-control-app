import 'dart:developer' as developer;
import 'dart:async';

import 'dart:isolate';
import 'package:arowana/arowana.dart';

import 'package:dji/flight.dart';
import 'package:dji/messages.dart';
import 'package:flutter/material.dart';

import 'package:flutter/services.dart';
import 'package:dji/dji.dart';

import 'constants.dart';

class HttpChannel extends DefaultChannel{

  @override
  Future prepare() {
    developer.log('current isolate [${Isolate.current.debugName}]');

    return super.prepare();
  }

  @override
  void entryPoint() {
    get('/up', (r){
      // double pitch = 0.0;
      // double roll = 0.0;
      // double yaw = 0.0;
      // double throttle = 0.0;
      Dji.sendStickControl(0.0, 0.0 ,0.0 ,1.0);
      return Response.ok('up');
    });
    get('/down', (r){
      Dji.sendStickControl(0.0, 0.0 ,0.0 ,-1.0);
      return Response.ok('down');
    });
    get('/left', (r){
      Dji.sendStickControl(0.0, 0.0 ,1.0 ,0.0);
      return Response.ok('left');
    });
    get('/right', (r){
      Dji.sendStickControl(0.0, 0.0 ,-1.0 ,0.0);
      return Response.ok('right');
    });
    get('/go', (r){
      Dji.sendStickControl(0.0, 1.0 ,0.0 ,0.0);
      return Response.ok('go');
    });
    get('/back', (r){
      Dji.sendStickControl(0.0, -1.0 ,0.0 ,0.0);
      return Response.ok('back');
    });
    get('/turn_left', (r){
      Dji.sendStickControl(1.0, 0.0 ,0.0 ,0.0);
      return Response.ok('turn left');
    });
    get('/turn_right', (r){
      Dji.sendStickControl(-1.0, 0.0 ,0.0 ,0.0);
      return Response.ok('turn right');
    });
  }
}

class DroneWidget extends StatefulWidget {
  const DroneWidget({Key? key}) : super(key: key);

  @override
  _DroneWidgetState createState() => _DroneWidgetState();
}

class _DroneWidgetState extends State<DroneWidget> implements DjiFlutterApi {
  String _platformVersion = 'Unknown';
  String _droneStatus = 'Disconnected';
  String _droneBatteryPercent = '0';
  String _droneAltitude = '0.0';
  String _droneLatitude = '0.0';
  String _droneLongitude = '0.0';
  String _droneSpeed = '0.0';
  String _droneRoll = '0.0';
  String _dronePitch = '0.0';
  String _droneYaw = '0.0';
  String _droneCommandStatus = '_';

  @override
  void initState() {
    super.initState();

    var app = Application(HttpChannel());
    app.start(numberOfInstances: 2,consoleLogging: true);


    DjiFlutterApi.setup(this);

    _getPlatformVersion();
  }

  // This function is triggered by the Native Host side whenever the Drone Status is changed.
  @override
  void setStatus(Drone drone) async {
    setState(() {
      _droneStatus = drone.status ?? 'Disconnected';
      _droneAltitude = drone.altitude?.toStringAsFixed(2) ?? '0.0';
      _droneBatteryPercent = drone.batteryPercent?.toStringAsFixed(0) ?? '0';
      _droneLatitude = drone.latitude?.toStringAsFixed(7) ?? '0.0';
      _droneLongitude = drone.longitude?.toStringAsFixed(7) ?? '0.0';
      _droneSpeed = drone.speed?.toStringAsFixed(2) ?? '0.0';
      _droneRoll = drone.roll?.toStringAsFixed(3) ?? '0.0';
      _dronePitch = drone.pitch?.toStringAsFixed(3) ?? '0.0';
      _droneYaw = drone.yaw?.toStringAsFixed(3) ?? '0.0';
    });
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  Future<void> _getPlatformVersion() async {
    String platformVersion;

    // Platform messages may fail, so we use a try/catch PlatformException.
    // We also handle the message potentially returning null.
    try {
      platformVersion = await Dji.platformVersion ?? 'Unknown platform version';
    } on PlatformException {
      platformVersion = 'Failed to get platform version.';
    }

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted) return;

    setState(() {
      _platformVersion = platformVersion;
    });
  }

  Future<void> _registerApp() async {
    try {
      developer.log(
        'registerApp requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.registerApp();
    } on PlatformException catch (e) {
      developer.log(
        'registerApp PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'registerApp Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _connectDrone() async {
    try {
      developer.log(
        'connectDrone requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.connectDrone();
    } on PlatformException catch (e) {
      developer.log(
        'connectDrone PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'connectDrone Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _disconnectDrone() async {
    try {
      developer.log(
        'disconnectDrone requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.disconnectDrone();
    } on PlatformException catch (e) {
      developer.log(
        'disconnectDrone PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'disconnectDrone Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _delegateDrone() async {
    try {
      developer.log(
        'delegateDrone requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.delegateDrone();
    } on PlatformException catch (e) {
      developer.log(
        'delegateDrone PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'delegateDrone Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _takeOff() async {
    try {
      developer.log(
        'Takeoff requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.takeOff();
    } on PlatformException catch (e) {
      developer.log(
        'Takeoff PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'Takeoff Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _land() async {
    try {
      developer.log(
        'Land requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.land();
    } on PlatformException catch (e) {
      developer.log(
        'Land PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'Land Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _setRollPitchControlMode(double mode) async {
    try {
      developer.log(
        'setRollPitchControlMode requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.setRollPitchControlMode(mode);
    } on PlatformException catch (e) {
      developer.log(
        'setRollPitchControlMode PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'setRollPitchControlMode Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _setYawControlMode(double mode) async {
    try {
      developer.log(
        'setYawControlMode requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.setYawControlMode(mode);
    } on PlatformException catch (e) {
      developer.log(
        'setYawControlMode PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'setYawControlMode Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }

  Future<void> _setVerticalControlMode(double mode) async {
    try {
      developer.log(
        'setVerticalControlMode requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.setVerticalControlMode(mode);
    } on PlatformException catch (e) {
      developer.log(
        'setVerticalControlMode PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    } catch (e) {
      developer.log(
        'setVerticalControlMode Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
    }
  }


  Future<void> _setVirtualStickMode(bool enabled) async {
    try {
      developer.log(
        '_setVirtualStickMode requested',
        name: kLogKindDjiFlutterPlugin,
      );
      await Dji.setVirtualStickMode(enabled);
      setState(() {
        _droneCommandStatus = 'Stick Mode ' + enabled.toString();
      });
    } on PlatformException catch (e) {
      developer.log(
        '_setVirtualStickMode PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
      setState(() {
        _droneCommandStatus = 'Stick Mode Failed: ' + e.toString();
      });
    } catch (e) {
      developer.log(
        'Land Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
      setState(() {
        _droneCommandStatus = 'Stick Mode Failed: ' + e.toString();
      });
    }
  }

  Future<void> _stickControl(String direction) async {
    try {
      developer.log(
        '_stickControl requested',
        name: kLogKindDjiFlutterPlugin,
      );
      double pitch = 0.0;
      double roll = 0.0;
      double yaw = 0.0;
      double throttle = 0.2;
      switch (direction) {
          case 'up':
            throttle = 0.2;
            break;
          case 'down':
            throttle = -0.2;
            break;
          case 'left':
            yaw = 0.2;
            break;
          case 'right':
            yaw = -0.2;
            break;
          case 'go':
            pitch = 0.2;
            break;
          case 'back':
            pitch = -0.2;
            break;
          case 'turn_left':
            roll = 0.2;
            break;
          case 'turn_right':
            roll = -0.2;
            break;
          default:
            break;
      }
      await Dji.sendStickControl(pitch, roll, yaw, throttle);
      setState(() {
        _droneCommandStatus = 'Stick Control : ' + pitch.toString() + roll.toString() +  yaw.toString() + throttle.toString();
      });
    } on PlatformException catch (e) {
      developer.log(
        '_stickControl PlatformException Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
      setState(() {
        _droneCommandStatus = 'Stick Control Failed: ' + e.toString();
      });
    } catch (e) {
      developer.log(
        'Land Error',
        error: e,
        name: kLogKindDjiFlutterPlugin,
      );
      setState(() {
        _droneCommandStatus = 'Stick Control Failed: ' + e.toString();
      });
    }
  }


  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('sungyong Remote Drone Control App'),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.start,
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Container(
              padding: const EdgeInsets.all(kSpacer),
              height: MediaQuery.of(context).size.height * 0.1,
              color: Colors.black54,
            ),
            Expanded(
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Expanded(
                    flex: 4,
                    child: SingleChildScrollView(
                      child: Padding(
                        padding: const EdgeInsets.symmetric(
                            horizontal: kSpacer, vertical: kSpacer * 0.5),
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.start,
                          crossAxisAlignment: CrossAxisAlignment.stretch,
                          children: [
                            ElevatedButton(
                              key: const Key('registerAppButton'),
                              child: const Text('Register App'),
                              onPressed: () async {
                                await _registerApp();
                              },
                            ),
                            ElevatedButton(
                              key: const Key('connectDroneButton'),
                              child: const Text('Connect'),
                              onPressed: () async {
                                await _connectDrone();
                              },
                            ),
                            ElevatedButton(
                              key: const Key('delegateButton'),
                              child: const Text('Delegate'),
                              onPressed: () async {
                                await _delegateDrone();
                              },
                            ),
                            ElevatedButton(
                              key: const Key('takeOffDroneButton'),
                              child: const Text('Take Off'),
                              onPressed: () async {
                                await _takeOff();
                              },
                            ),
                            ElevatedButton(
                              key: const Key('landDroneButton'),
                              child: const Text('Land'),
                              onPressed: () async {
                                await _land();
                              },
                            ),
                            ElevatedButton(
                              key: const Key('StickModeOn'),
                              child: const Text('StickMode On'),
                              onPressed: () async {
                                await _setVirtualStickMode(true);
                              },
                            ),
                            ElevatedButton(
                              key: const Key('StickModeOff'),
                              child: const Text('StickMode Off'),
                              onPressed: () async {
                                await _setVirtualStickMode(false);
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickUp'),
                              child: const Text('Throttle +'),
                              onPressed: () async {
                                await _stickControl('up');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickDown'),
                              child: const Text('Throttle -'),
                              onPressed: () async {
                                await _stickControl('down');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickLeft'),
                              child: const Text('Yaw +'),
                              onPressed: () async {
                                await _stickControl('left');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickRight'),
                              child: const Text('Yaw -'),
                              onPressed: () async {
                                await _stickControl('right');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickGo'),
                              child: const Text('Pitch +'),
                              onPressed: () async {
                                await _stickControl('go');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickBack'),
                              child: const Text('Pitch -'),
                              onPressed: () async {
                                await _stickControl('back');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickTurnLeft'),
                              child: const Text('Roll +'),
                              onPressed: () async {
                                await _stickControl('turn_left');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('stickTurnRight'),
                              child: const Text('Roll -'),
                              onPressed: () async {
                                await _stickControl('turn_right');
                              },
                            ),
                            ElevatedButton(
                              key: const Key('RollPitchMode'),
                              child: const Text('RollPitchMode'),
                              onPressed: () async {
                                // velocity: 0, position: 1
                                await _setRollPitchControlMode(1);
                              },
                            ),
                            ElevatedButton(
                              key: const Key('YawMode'),
                              child: const Text('RYawMode'),
                              onPressed: () async {
                                await _setYawControlMode(1);
                              },
                            ),
                            ElevatedButton(
                              key: const Key('VerticalMode'),
                              child: const Text('VerticalMode'),
                              onPressed: () async {
                                await _setVerticalControlMode(1);
                              },
                            ),
                            ElevatedButton(
                              key: const Key('disconnectDroneButton'),
                              child: const Text('Disconnect'),
                              onPressed: () async {
                                await _disconnectDrone();
                              },
                            ),
                          ],
                        ),
                      ),
                    ),
                  ),
                  Expanded(
                    flex: 5,
                    child: SingleChildScrollView(
                      child: Padding(
                        padding: const EdgeInsets.all(kSpacer),
                        child: Column(
                          children: [
                            DronePropertyRow(
                              label: 'Running on',
                              value: _platformVersion,
                            ),
                            DronePropertyRow(
                              label: 'Status',
                              value: _droneStatus,
                            ),
                            DronePropertyRow(
                              label: 'Drone Battery',
                              value: _droneBatteryPercent + '%',
                            ),
                            DronePropertyRow(
                              label: 'Altitude',
                              value: _droneAltitude,
                            ),
                            DronePropertyRow(
                              label: 'Latitude',
                              value: _droneLatitude,
                            ),
                            DronePropertyRow(
                              label: 'Longitude',
                              value: _droneLongitude,
                            ),
                            DronePropertyRow(
                              label: 'Speed',
                              value: _droneSpeed,
                            ),
                            DronePropertyRow(
                              label: 'Roll',
                              value: _droneRoll,
                            ),
                            DronePropertyRow(
                              label: 'Pitch',
                              value: _dronePitch,
                            ),
                            DronePropertyRow(
                              label: 'Yaw',
                              value: _droneYaw,
                            ),
                            DronePropertyRow(
                              label: 'CommandStatus',
                              value: _droneCommandStatus,
                            ),
                          ],
                        ),
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class DronePropertyRow extends StatelessWidget {
  const DronePropertyRow({
    Key? key,
    required this.label,
    required this.value,
  }) : super(key: key);

  final String label;
  final String value;

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      crossAxisAlignment: CrossAxisAlignment.center,
      children: [
        Text(
          label,
          style: Theme.of(context).textTheme.bodyText2,
        ),
        Text(
          value,
          style: Theme.of(context).textTheme.bodyText1,
        ),
      ],
    );
  }
}

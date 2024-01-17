import 'package:flutter/material.dart';
import 'drone.dart';

void main() {
  runApp(const DroneApp());
}

class DroneApp extends StatefulWidget {
  const DroneApp({Key? key}) : super(key: key);

  @override
  _DroneAppState createState() => _DroneAppState();
}

class _DroneAppState extends State<DroneApp> {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: DroneWidget());
  }
}

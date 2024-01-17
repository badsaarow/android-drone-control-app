const haveEvents = 'GamepadEvent' in window;
const haveWebkitEvents = 'WebKitGamepadEvent' in window;
const controllers = {};
let controller = null;
const rAF = window.mozRequestAnimationFrame ||
  window.webkitRequestAnimationFrame ||
  window.requestAnimationFrame;

// default config
const config = JSON.parse(window.localStorage.getItem('config')) || {
  autoStabilize: { enabled: true, delay: 0.15 },
  controls: {
    pitch:    { axis: 4, invert: false, deadZone: 0.02, maxSpeed: 1.0 },
    roll:     { axis: 1, invert: true, deadZone: 0.02, maxSpeed: 1.0 },
    yaw:      { axis: 0, invert: false, deadZone: 0.02, maxSpeed: 1.0 },
    throttle: { axis: 2, invert: true, deadZone: 0.02, maxSpeed: 1.0 },
    switchCams: 0,
    hover:      1,
    flip:       2,
    flatTrim:   3,
    takeoff:    6,
    land:       7,
    disableEmergency: 8
  },
  sendingDelayMs: 100,
  customCommands: []
};

window.localStorage.setItem('config', JSON.stringify(config));

const joystick = { lpx: 0.0, lpy: 0.0, rpx: 0.0, rpy: 0.0 };
const droneStatus = {
  interval: null,
  responseDone: true,
  lastTs: Date.now(),
};

let droneIsMoving = false;

function sendMoveCmd() {
  const now = Date.now();
  if (now - droneStatus.lastTs < config.sendingDelayMs)  {
    return;
  }
  console.log('sendMoveCmd:', now - droneStatus.lastTs, now - droneStatus.lastTs < config.sendingDelayMs, now,  droneStatus.lastTs);
  droneStatus.lastTs = now;
  fetch(
      "/cmd?lpx=" +
      joystick.lpx +
      "&lpy=" +
      joystick.lpy +
      "&rpx=" +
      joystick.rpx +
      "&rpy=" +
      joystick.rpy
  ).then((response) => {
    console.log(response)
  }).finally(() => {
    droneStatus.responseDone = true;
  });
}
function startMove() {
  if (droneStatus.interval == null) {
    droneStatus.interval = setInterval(function () {
      sendMoveCmd();
    }, 100);
  }
}
function stopMove() {
  clearInterval(droneStatus.interval);
  droneStatus.interval = null;
}
function stopHere() {
  stopMove();
  const now = Date.now();
  console.log('stopHere:', now - droneStatus.lastTs, now - droneStatus.lastTs < config.sendingDelayMs, now,  droneStatus.lastTs);
  if (now - droneStatus.lastTs < config.sendingDelayMs)  {
    return;
  }

  droneStatus.lastTs = now;
  fetch(
      "/cmd?lpx=" +
      joystick.lpx +
      "&lpy=" +
      joystick.lpy +
      "&rpx=" +
      joystick.rpx +
      "&rpy=" +
      joystick.rpy
  ).then((response) => {
    console.log(response);
  }).finally(() => {
    droneStatus.responseDone = true;
  });
}

const toSendingValue = function(speed, axisConf) {
  let s = speed;
  if (Math.abs(speed) < axisConf.deadZone) s = 0.0;
  if (axisConf.invert) s *= -1;
  return (s * axisConf.maxSpeed).toFixed(2);
};

const sendCommands = function(pitch, roll, yaw, throttle) {
    joystick.lpx = toSendingValue(pitch, config.controls.pitch);
    joystick.lpy = toSendingValue(roll, config.controls.roll);
    joystick.rpx = toSendingValue(yaw, config.controls.yaw);
    joystick.rpy = toSendingValue(throttle, config.controls.throttle);
    document.getElementById('pitch_val').innerText = joystick.lpx;
    document.getElementById('roll_val').innerText = joystick.lpy;
    document.getElementById('yaw_val').innerText = joystick.rpx;
    document.getElementById('throttle_val').innerText = joystick.rpy;
    let msg = 'Send pitch: ' + joystick.lpx;
    msg += ', roll: ' + joystick.lpy;
    msg += ', yaw: ' + joystick.rpx;
    msg += ', throttle: ' + joystick.rpy;
    document.getElementById('sent').innerText = msg;

    const allCtrlsZero = (Math.abs(joystick.lpx) < config.controls.pitch.deadZone &&
        Math.abs(joystick.lpy) < config.controls.roll.deadZone &&
        Math.abs(joystick.rpx) < config.controls.yaw.deadZone &&
        Math.abs(joystick.rpy) < config.controls.throttle.deadZone);

    if (!allCtrlsZero) {
        droneIsMoving = true;
        sendMoveCmd();
    } else {
      droneIsMoving = false;
    }
};


function connecthandler(e) {
  addgamepad(e.gamepad);
}

function addgamepad(gamepad) {
  controllers[gamepad.index] = gamepad;
  const d = document.createElement("div");
  d.setAttribute("id", "controller" + gamepad.index);

  const t = document.createElement("h1");
  t.appendChild(document.createTextNode("gamepad: " + gamepad.id));
  d.appendChild(t);

  const b = document.createElement("div");
  b.className = "buttons";

  for (let i=0; i<gamepad.buttons.length; i++) {
    const e = document.createElement("span");
    e.className = "button";
    //e.id = "b" + i;
    e.innerHTML = i;
    b.appendChild(e);
  }
  d.appendChild(b);

  const a = document.createElement("div");
  a.className = "axes";

  for (let i=0; i<gamepad.axes.length; i++) {
    e = document.createElement("meter");
    e.className = "axis";
    //e.id = "a" + i;
    e.setAttribute("min", "-100");
    e.setAttribute("max", "100");
    e.setAttribute("value", "0");
    e.innerHTML = i + '';
    a.appendChild(e);
  }
  d.appendChild(a);
  document.getElementById("start").style.display = "none";
  document.body.appendChild(d);

  rAF(updateStatus);
}

function disconnecthandler(e) {
  removegamepad(e.gamepad);
}

function removegamepad(gamepad) {
  const d = document.getElementById("controller" + gamepad.index);
  document.body.removeChild(d);
  delete controllers[gamepad.index];
}

function strip(number) {
  return (parseFloat(number).toFixed(2));
}

function updateStatus() {
  scangamepads();

  for (let j in controllers) {
    controller = controllers[j];
    const d = document.getElementById("controller" + j);
    const buttons = d.getElementsByClassName("button");

    for (let i=0; i<controller.buttons.length; i++) {
      const b = buttons[i];
      let val = controller.buttons[i];
      let pressed = val == 1.0;
      let touched = false;
      if (typeof(val) == "object") {
        pressed = val.pressed;
        if ('touched' in val) {
          touched = val.touched;
        }
        val = val.value;
      }
      const pct = Math.round(val * 100) + "%";
      b.style.backgroundSize = pct + " " + pct;
      b.className = "button";
      if (pressed) {
        b.className += " pressed";
      }
      if (touched) {
        b.className += " touched";
      }
    }

    const axes = d.getElementsByClassName("axis");
    for (let i=0; i<controller.axes.length; i++) {
      const a = axes[i];
      a.innerHTML = i + ": " + controller.axes[i].toFixed(2);
      a.setAttribute("value", controller.axes[i]);
    }
  }

  sendCommands(
      strip(controller.axes[config.controls.pitch.axis]),
      strip(controller.axes[config.controls.roll.axis]),
      strip(controller.axes[config.controls.yaw.axis]),
      strip(controller.axes[config.controls.throttle.axis])
  ); //pitch, roll, yaw, throttle);

  rAF(updateStatus);
}

function scangamepads() {
  const gamepads = navigator.getGamepads ? navigator.getGamepads() : (navigator.webkitGetGamepads ? navigator.webkitGetGamepads() : []);
  for (let i = 0; i < gamepads.length; i++) {
    if (gamepads[i] && (gamepads[i].index in controllers)) {
      controllers[gamepads[i].index] = gamepads[i];
    }
  }
}

if (haveEvents) {
  window.addEventListener("gamepadconnected", connecthandler);
  window.addEventListener("gamepaddisconnected", disconnecthandler);
} else if (haveWebkitEvents) {
  window.addEventListener("webkitgamepadconnected", connecthandler);
  window.addEventListener("webkitgamepaddisconnected", disconnecthandler);
} else {
  setInterval(scangamepads, 500);
}
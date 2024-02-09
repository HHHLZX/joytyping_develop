//package org.example.joytyping;
//
//import com.github.strikerx3.jxinput.XInputAxesDelta;
//import com.github.strikerx3.jxinput.XInputButtonsDelta;
//import com.github.strikerx3.jxinput.XInputComponentsDelta;
//import com.github.strikerx3.jxinput.XInputDevice;
//import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
//
//public class test4 {
//    public static void main(String[] args) {
//        // Retrieve all devices检索所有设备
//        XInputDevice[] devices;
//        try {
//            devices = XInputDevice.getAllDevices();
//        } catch (XInputNotLoadedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(devices);
//        // Retrieve the device for player 1检索玩家 1 的设备
//        XInputDevice device = null; // or devices[0]
//        try {
//            device = XInputDevice.getDeviceFor(0);
//        } catch (XInputNotLoadedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(device);
////-------------------------------------------------------------------
//        if (device.poll()) {
//            // Retrieve the delta 检索增量
//            XInputComponentsDelta delta = device.getDelta();
//
//            XInputButtonsDelta buttons = delta.getButtons();
//            XInputAxesDelta axes = delta.getAxes();
//
//
//            // Retrieve button state change检索按钮状态更改
//            if (buttons.isPressed(XInputButton.a)) {
//                // Button A was just pressed按钮 A 刚刚按下
//            } else if (buttons.isReleased(XInputButton.a)) {
//                // Button A was just released按钮 A 刚刚松开
//            }
//
//            // Retrieve axis state change.检索轴状态更改。
//            // The class provides methods for each axis and a method for providing an XInputAxis
//            // 该类为每个轴提供方法，并提供用于提供 XInputAxis 的方法
//            float accelerationDelta = axes.getRTDelta();
//            float brakeDelta = axes.getDelta(XInputAxis.leftTrigger);
//        } else {
//            // Controller is not connected; display a message
//        }
//    }
//}

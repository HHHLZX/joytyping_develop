package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputAxes;
import com.github.strikerx3.jxinput.XInputButtons;
import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;

public class test2 {
    public static void main(String[] args) {
        // Retrieve all devices检索所有设备
        XInputDevice[] devices;
        try {
            devices = XInputDevice.getAllDevices();
        } catch (XInputNotLoadedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(devices);
        // Retrieve the device for player 1检索玩家 1 的设备
        XInputDevice device = null; // or devices[0]
        try {
            device = XInputDevice.getDeviceFor(0);
        } catch (XInputNotLoadedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(device);
        // First we need to poll data.首先，我们需要轮询数据。
        // poll() will return false if the device is not connected
        //如果设备未连接，poll（） 将返回 false
//-----------------------------------------------------------------
        System.out.println("没进入if");
        if (device.poll()) {
            System.out.println("进入if");
            // Retrieve the components检索组件
            XInputComponents components = device.getComponents();
//            获取所有的button
            XInputButtons buttons = components.getButtons();
//            应该是摇杆值（不确定）
            XInputAxes axes = components.getAxes();
            System.out.println(buttons);
            System.out.println(axes);
            // Buttons and axes have public fields (although this is not idiomatic Java)
            //  按钮和轴具有公共字段（尽管这不是惯用的 Java）

            // Retrieve button state 检索按钮状态
            if (buttons.a) {
                System.out.println("按钮A被按下了");
                // The A button is currently pressed
                // 当前按下了 A 按钮
            }
            if (buttons.b) {
                System.out.println("按钮B被按下了");
            }
            // Check if Guide button is supported
            // 检查是否支持“指南”按钮
            if (XInputDevice.isGuideButtonSupported()) {
                // Use it使用它
                if (buttons.guide) {
                    System.out.println("“指南”按钮被按下了");
                    // The Guide button is currently pressed
                    // 当前按下了“指南”按钮
                }
            }
            // Retrieve axis state 检索轴状态
            //右扳机键值
            float acceleration = axes.rt;
            System.out.println(acceleration);
            //左扳机键值
            float brake = axes.lt;
            System.out.println(brake);
        } else {
            // Controller is not connected; display a message
            System.out.println("控制器未连接");
            // 控制器未连接;显示消息
        }
        // This is exactly the same as above 这与上面完全相同
//        device.poll();
//        if (device.isConnected()) {
//            // ...
//        } else {
//            // ...
//        }
    }
}

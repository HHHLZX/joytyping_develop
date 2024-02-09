package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.enums.XInputButton;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
import com.github.strikerx3.jxinput.listener.XInputDeviceListener;

public class test8 {
    public static void main(String[] args) {
        // 获取所有的XInput设备
        try {
            XInputDevice[] devices = XInputDevice.getAllDevices();

            // 假设第一个设备是Xbox手柄，实际情况可能需要进一步判断
            XInputDevice xboxController = devices[0];

            // 添加事件监听器（可选）
            xboxController.addListener(new XInputDeviceListener() {
                @Override
                public void connected() {
                    System.out.println("Controller connected");
                }

                @Override
                public void disconnected() {
                    System.out.println("Controller disconnected");
                }

                @Override
                public void buttonChanged(XInputButton button, boolean pressed) {
                    System.out.println("Button " + button + " " + (pressed ? "pressed" : "released"));
                }
            });
            // 轮询设备以获取最新的状态
            while (true) {
                xboxController.poll();

                // 获取手柄的组件状态
                XInputComponents components = xboxController.getComponents();

                XInputComponents lastComponents = xboxController.getLastComponents();

                // 获取左摇杆的X和Y值
                float leftThumbX = components.getAxes().lx;
                float leftThumbY = components.getAxes().ly;
                // 获取上次左摇杆的X和Y值
                float lastleftThumbX = lastComponents.getAxes().lx;
                float lastleftThumbY = lastComponents.getAxes().ly;

                // 获取右摇杆的X和Y值
                float rightThumbX = components.getAxes().rx;
                float rightThumbY = components.getAxes().ry;
                // 获取右摇杆的X和Y值
                float lastrightThumbX = lastComponents.getAxes().rx;
                float lastrightThumbY = lastComponents.getAxes().ry;
                int a = 1;
                int b = a-1;
                // 打印值
                System.out.println("Left Thumb: X=" + leftThumbX + ", Y=" + leftThumbY+"这次的值");
                System.out.println("Right Thumb: X=" + rightThumbX + ", Y=" + rightThumbY);
                System.out.println("Left Thumb: X=" + lastleftThumbX + ", Y=" + lastleftThumbY+"上次的值");
                System.out.println("Right Thumb: X=" + lastrightThumbX + ", Y=" + lastrightThumbY);

                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }
}

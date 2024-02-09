package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.enums.XInputButton;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
import com.github.strikerx3.jxinput.listener.XInputDeviceListener;


public class test5 {
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
            int a = 0;
            // 轮询设备以获取最新的状态
            while (true) {
                a++;
                xboxController.poll();

                // 获取手柄的组件状态
                XInputComponents components = xboxController.getComponents();

                // 获取左摇杆的X和Y值
                float leftThumbX = components.getAxes().lx;
                float leftThumbY = components.getAxes().ly;

                // 获取右摇杆的X和Y值
                float rightThumbX = components.getAxes().rx;
                float rightThumbY = components.getAxes().ry;

                // 打印值
//                System.out.println("Left Thumb: X=" + leftThumbX + ", Y=" + leftThumbY);
//                System.out.println("Right Thumb: X=" + rightThumbX + ", Y=" + rightThumbY);                System.out.println("Left Thumb: X=" + leftThumbX + ", Y=" + leftThumbY);
                System.out.println(a + "::" + rightThumbX + "::" + rightThumbY);

                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }
}

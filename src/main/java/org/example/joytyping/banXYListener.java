package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
//本软件仅供学习使用，请勿用作商业用途。
public class banXYListener extends Thread {
    public void run() {
        // 获取所有的XInput设备
        try {
            XInputDevice[] devices = XInputDevice.getAllDevices();

            // 假设第一个设备是Xbox手柄，实际情况可能需要进一步判断
            XInputDevice xboxController = devices[0];

//            // 添加事件监听器（可选）
//            xboxController.addListener(new XInputDeviceListener() {
//                @Override
//                public void connected() {
//                    System.out.println("Controller connected");
//                }
//
//                @Override
//                public void disconnected() {
//                    System.out.println("Controller disconnected");
//                }
//
//                @Override
//                public void buttonChanged(XInputButton button, boolean pressed) {
//                    System.out.println("Button " + button + " " + (pressed ? "pressed" : "released"));
//                }
//            });
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
                if (lastleftThumbX * lastleftThumbX + lastleftThumbY * lastleftThumbY < 0.7) {
                    if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.7) {
                        System.out.println("大于0.7");
                        keyBoardInput.pressA();
                    }else {
                        keyBoardInput.releasA();
                    }
                }
                // 打印值
//                System.out.println("Left Thumb: X=" + leftThumbX + ", Y=" + leftThumbY);
//                System.out.println("Right Thumb: X=" + rightThumbX + ", Y=" + rightThumbY);

                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (
                XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }

    public static void banXYListener(boolean b) {
        if (b == true) {
            banXYListener banXYListener = new banXYListener();
            banXYListener.start();
        }
//        else{
//            System.out.println("手柄未连接");
//        }
    }
}

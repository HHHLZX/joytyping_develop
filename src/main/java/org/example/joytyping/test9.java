package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.enums.XInputButton;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
import com.github.strikerx3.jxinput.listener.XInputDeviceListener;
//本软件仅供学习使用，请勿用作商业用途。
public class test9 {

    public static void main(String[] args) {
        try {
            // 获取所有的XInput设备
            XInputDevice[] devices = XInputDevice.getAllDevices();

            // 假设第一个设备是Xbox手柄，实际情况可能需要进一步判断
            XInputDevice xboxController = devices[0];

            // 添加事件监听器
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
                    if (button == XInputButton.LEFT_THUMBSTICK) {
                        if (pressed) {
                            System.out.println("Left Trigger pressed");
                            // 在左扳机键按下时进行手柄震动
                            xboxController.setVibration(32767, 0); // 只设置左马达震动
                        } else {
                            System.out.println("Left Trigger released");
                            // 在左扳机键释放时停止手柄震动
                            xboxController.setVibration(0, 0);
                        }
                    }
                    if (button == XInputButton.A) {
                        if (pressed) {
                            System.out.println("A button pressed");
                            // 在A按钮按下时进行手柄震动
//                            xboxController.setVibration(65535, 0); // 设置左边马达的震动强度
//                            xboxController.setVibration(0, 65535); // 设置左边马达的震动强度
                            xboxController.setVibration(65535, 65535); // 设置左边马达的震动强度
                        } else {
                            System.out.println("A button released");
                            // 在A按钮释放时停止手柄震动
                            xboxController.setVibration(0, 0);
                        }
                    }
                    // Add similar checks for other buttons...
                }
            });

            // 无限循环轮询设备以监听事件
            while (true) {
                xboxController.poll();

                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }
}

package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.enums.XInputButton;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
import com.github.strikerx3.jxinput.listener.XInputDeviceListener;

public class test6 {

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
                    if (button == XInputButton.A) {
                        if (pressed) {
                            System.out.println("A button pressed");
                        } else {
                            System.out.println("A button released");
                        }
                    }
                    if (button == XInputButton.B) {
                        if (pressed) {
                            System.out.println("B button pressed");
                        } else {
                            System.out.println("B button released");
                        }
                    }
                    if (button == XInputButton.X) {
                        if (pressed) {
                            System.out.println("X button pressed");
                        } else {
                            System.out.println("X button released");
                        }
                    }
                    if (button == XInputButton.Y) {
                        if (pressed) {
                            System.out.println("Y button pressed");
                        } else {
                            System.out.println("Y button released");
                        }
                    }
                    if (button == XInputButton.DPAD_UP) {
                        if (pressed) {
                            System.out.println("UP button pressed");
                        } else {
                            System.out.println("UP button released");
                        }
                    }
                    if (button == XInputButton.DPAD_DOWN) {
                        if (pressed) {
                            System.out.println("DOWN button pressed");
                        } else {
                            System.out.println("DOWN button released");
                        }
                    }
                    if (button == XInputButton.DPAD_LEFT) {
                        if (pressed) {
                            System.out.println("LEFT button pressed");
                        } else {
                            System.out.println("LEFT button released");
                        }
                    }
                    if (button == XInputButton.DPAD_RIGHT) {
                        if (pressed) {
                            System.out.println("RIGHT button pressed");
                        } else {
                            System.out.println("RIGHT button released");
                        }
                    }
                    if (button == XInputButton.START) {
                        if (pressed) {
                            System.out.println("START button pressed");
                        } else {
                            System.out.println("START button released");
                        }
                    }
                    if (button == XInputButton.BACK) {
                        if (pressed) {
                            System.out.println("BACK button pressed");
                        } else {
                            System.out.println("BACK button released");
                        }
                    }
                    if (button == XInputButton.LEFT_SHOULDER) {
                        if (pressed) {
                            System.out.println("LB button pressed");
                        } else {
                            System.out.println("LB button released");
                        }
                    }
                    if (button == XInputButton.RIGHT_SHOULDER) {
                        if (pressed) {
                            System.out.println("RB button pressed");
                        } else {
                            System.out.println("RB button released");
                        }
                    }
                    if (button == XInputButton.RIGHT_THUMBSTICK) {
                        if (pressed) {
                            System.out.println("右摇杆 button pressed");
                        } else {
                            System.out.println("右摇杆 button released");
                        }
                    }
                    if (button == XInputButton.LEFT_THUMBSTICK) {
                        if (pressed) {
                            System.out.println("左摇杆 button pressed");
                        } else {
                            System.out.println("左摇杆 button released");
                        }
                    }
                    if (button == XInputButton.UNKNOWN && pressed) {
                        System.out.println("UNKNOWN button pressed");
                    }
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

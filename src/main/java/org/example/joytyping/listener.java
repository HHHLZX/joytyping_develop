package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.enums.XInputButton;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
import com.github.strikerx3.jxinput.listener.XInputDeviceListener;
//本软件仅供学习使用，请勿用作商业用途。
public class listener extends Thread {
    boolean lefttof = false;
    boolean rightttof = false;
    boolean mousetof = false;
    float RX = 0;
    float RY = 0;
    float LX = 0;
    float LY = 0;
    int count = 0;

    public float getRX() {
        return RX;
    }

    public void setRX(float RX) {
        this.RX = RX;
    }

    public float getRY() {
        return RY;
    }

    public void setRY(float RY) {
        this.RY = RY;
    }

    public float getLX() {
        return LX;
    }

    public void setLX(float LX) {
        this.LX = LX;
    }

    public float getLY() {
        return LY;
    }

    public void setLY(float LY) {
        this.LY = LY;
    }

    public void run() {
        // 线程要执行的代码
        System.out.println("新线程执行");
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
                            keyBoardInput.pressAlt();
                        } else {
                            keyBoardInput.releasAlt();
                        }
                    }
                    if (button == XInputButton.B) {
                        if (pressed) {
                            keyBoardInput.pressBackspace();
                        } else {
                            keyBoardInput.releasBackspace();
                        }
                    }
                    if (button == XInputButton.X) {
                        if (pressed) {
                            keyBoardInput.pressTab();
                        } else {
                            keyBoardInput.releasTab();
                        }
                    }
                    if (button == XInputButton.Y) {
                        if (pressed) {
                            keyBoardInput.pressDelete();
                        } else {
                            keyBoardInput.releasDelete();
                        }
                    }
                    if (button == XInputButton.DPAD_UP) {
                        if (pressed) {
                            keyBoardInput.pressUp();
                        } else {
                            keyBoardInput.releasUp();
                        }
                    }
                    if (button == XInputButton.DPAD_DOWN) {
                        if (pressed) {
                            keyBoardInput.pressDown();
                        } else {
                            keyBoardInput.releasDown();
                        }
                    }
                    if (button == XInputButton.DPAD_LEFT) {
                        if (pressed) {
                            keyBoardInput.pressLeft();
                        } else {
                            keyBoardInput.releasLeft();
                        }
                    }
                    if (button == XInputButton.DPAD_RIGHT) {
                        if (pressed) {
                            keyBoardInput.pressRigt();
                        } else {
                            keyBoardInput.releasRight();
                        }
                    }
                    if (button == XInputButton.START) {
                        if (pressed) {
                            keyBoardInput.pressEnd();
                        } else {
                            keyBoardInput.releasEnd();
                        }
                    }
                    if (button == XInputButton.BACK) {
                        if (pressed) {
                            if (mousetof == false) {
                                mousetof = true;
                            } else {
                                mousetof = false;
                            }
//                            keyBoardInput.pressHome();
                        } else {
//                            keyBoardInput.releasHome();
                        }
                    }
                    if (button == XInputButton.LEFT_SHOULDER) {
                        if (mousetof == true) {
                            if (pressed) {
                                mouseInput.pressLeft();
                            } else {
                                mouseInput.releasLeft();
                            }
                        }
                        if (mousetof == false) {
                            if (pressed) {
                                keyBoardInput.pressCtrl();
                            } else {
                                keyBoardInput.releasCtrl();
                            }
                        }
                    }
                    if (button == XInputButton.RIGHT_SHOULDER) {
                        if (mousetof == true) {
                            if (pressed) {
                                mouseInput.pressRight();
                            } else {
                                mouseInput.releasRight();
                            }
                        }
                        if (mousetof == false) {
                            if (pressed) {
                                keyBoardInput.pressSpace();
                            } else {
                                keyBoardInput.releasSpace();
                            }
                        }
                    }
                    if (button == XInputButton.RIGHT_THUMBSTICK) {
                        if (pressed) {
                            System.out.println("右摇杆 button pressed");
                            if (rightttof == false) {
                                rightttof = true;
                            } else {
                                rightttof = false;
                            }
                            System.out.println(rightttof);
//                            keyBoardInput.pressNumlock();
                        } else {
                            System.out.println("右摇杆 button released");
//                            keyBoardInput.releasNumlock();
                        }
                    }
                    if (button == XInputButton.LEFT_THUMBSTICK) {
                        if (mousetof == true) {
                            if (pressed) {
                                mouseInput.pressMiddle();
                            } else {
                                mouseInput.releasMiddle();
                            }
                        }
                        if (mousetof == false) {
                            if (pressed) {
                                System.out.println("左摇杆 button pressed");
                                if (lefttof == false) {
                                    lefttof = true;
                                } else {
                                    lefttof = false;
                                }
                                System.out.println(lefttof);
//                            keyBoardInput.pressCapslock();
                            } else {
                                System.out.println("左摇杆 button released");
//                            keyBoardInput.releasCapslock();
                            }
                        }
                    }
                }
            });
            // 无限循环轮询设备以监听事件
            while (true) {
                xboxController.poll();
                // 获取手柄的组件状态
                XInputComponents components = xboxController.getComponents();
                XInputComponents lastComponents = xboxController.getLastComponents();
                // 获取左摇杆的X和Y值
                float leftThumbX = components.getAxes().lx;
                float leftThumbY = components.getAxes().ly;
                LX = leftThumbX;
                LY = leftThumbY;
                // 获取上次左摇杆的X和Y值
                float lastleftThumbX = lastComponents.getAxes().lx;
                float lastleftThumbY = lastComponents.getAxes().ly;
                // 获取右摇杆的X和Y值
                float rightThumbX = components.getAxes().rx;
                float rightThumbY = components.getAxes().ry;
                RX = rightThumbX;
                RY = rightThumbY;
                // 获取右摇杆的X和Y值
                float lastrightThumbX = lastComponents.getAxes().rx;
                float lastrightThumbY = lastComponents.getAxes().ry;
                // 获取左板机的值
                float LEFT_TRIGGER = components.getAxes().lt;
                float lastLEFT_TRIGGER = lastComponents.getAxes().lt;
                // 获取右摇杆的X和Y值
                float RIGHT_TRIGGER = components.getAxes().rt;
                float lastRIGHT_TRIGGER = lastComponents.getAxes().rt;

                if (lastLEFT_TRIGGER != LEFT_TRIGGER) {
                    if (LEFT_TRIGGER > 0.01) {
                        if (LEFT_TRIGGER < 0.9) {
                            keyBoardInput.pressShift();
                            keyBoardInput.releasEsc();
                        } else {
                            keyBoardInput.releasShift();
                            keyBoardInput.pressEsc();
                        }
                    } else {
                        keyBoardInput.releasEsc();
                        keyBoardInput.releasShift();
                    }
                }
                if (lastRIGHT_TRIGGER != RIGHT_TRIGGER) {
                    if (RIGHT_TRIGGER > 0.01) {
                        if (RIGHT_TRIGGER < 0.9) {
                            keyBoardInput.releasEnter();
                            mousetof = true;
                        } else {
                            keyBoardInput.pressEnter();
                            mousetof = false;
                        }
                    } else {
                        keyBoardInput.releasEnter();
                        mousetof = false;
                    }
                }
                count++;
                if (mousetof == true) {
                    if (leftThumbY > 0.9) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY > 0.75 && leftThumbY < 0.9 && count % 4 == 0) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY > 0.6 && leftThumbY < 0.75 && count % 8 == 0) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY > 0.45 && leftThumbY < 0.6 && count % 11 == 0) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY > 0.3 && leftThumbY < 0.45 && count % 18 == 0) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY > 0.15 && leftThumbY < 0.3 && count % 25 == 0) {
                        mouseInput.mouseWheelUp();
                    }
                    if (leftThumbY < -0.15 && leftThumbY > -0.3 && count % 25 == 0) {
                        mouseInput.mouseWheelDown();
                    }
                    if (leftThumbY < -0.3 && leftThumbY > -0.45 && count % 18 == 0) {
                        mouseInput.mouseWheelDown();
                    }
                    if (leftThumbY < -0.45 && leftThumbY > -0.6 && count % 11 == 0) {
                        mouseInput.mouseWheelDown();
                    }
                    if (leftThumbY < -0.6 && leftThumbY > -0.75 && count % 8 == 0) {
                        mouseInput.mouseWheelDown();
                    }
                    if (leftThumbY < -0.75 && leftThumbY > -0.9 && count % 4 == 0) {
                        mouseInput.mouseWheelDown();
                    }
                    if (leftThumbY < -0.9) {
                        mouseInput.mouseWheelDown();
                    }
//                    ---------------------------------------------------------------------
                    if (rightThumbY > 0.9) {
                        mouseInput.mouseMove(0, -45);
                    }
                    if (rightThumbY > 0.75 && rightThumbY < 0.9) {
                        mouseInput.mouseMove(0, -30);
                    }
                    if (rightThumbY > 0.65 && rightThumbY < 0.75) {
                        mouseInput.mouseMove(0, -10);
                    }
                    if (rightThumbY > 0.55 && rightThumbY < 0.65) {
                        mouseInput.mouseMove(0, -8);
                    }
                    if (rightThumbY > 0.45 && rightThumbY < 0.55) {
                        mouseInput.mouseMove(0, -6);
                    }
                    if (rightThumbY > 0.35 && rightThumbY < 0.45) {
                        mouseInput.mouseMove(0, -3);
                    }
                    if (rightThumbY > 0.25 && rightThumbY < 0.35) {
                        mouseInput.mouseMove(0, -2);
                    }
                    if (rightThumbY > 0.15 && rightThumbY < 0.25) {
                        mouseInput.mouseMove(0, -1);
                    }
                    if (rightThumbY < -0.15 && rightThumbY > -0.25) {
                        mouseInput.mouseMove(0, 1);
                    }
                    if (rightThumbY < -0.25 && rightThumbY > -0.35) {
                        mouseInput.mouseMove(0, 2);
                    }
                    if (rightThumbY < -0.35 && rightThumbY > -0.45) {
                        mouseInput.mouseMove(0, 3);
                    }
                    if (rightThumbY < -0.45 && rightThumbY > -0.55) {
                        mouseInput.mouseMove(0, 6);
                    }
                    if (rightThumbY < -0.55 && rightThumbY > -0.65) {
                        mouseInput.mouseMove(0, 8);
                    }
                    if (rightThumbY < -0.65 && rightThumbY > -0.75) {
                        mouseInput.mouseMove(0, 10);
                    }
                    if (rightThumbY < -0.75 && rightThumbY > -0.9) {
                        mouseInput.mouseMove(0, 30);
                    }
                    if (rightThumbY < -0.9) {
                        mouseInput.mouseMove(0,45 );
                    }
                    if (rightThumbX > 0.9) {
                        mouseInput.mouseMove(45, 0);
                    }
                    if (rightThumbX > 0.75 && rightThumbX < 0.9) {
                        mouseInput.mouseMove(30, 0);
                    }
                    if (rightThumbX > 0.65 && rightThumbX < 0.75) {
                        mouseInput.mouseMove(10, 0);
                    }
                    if (rightThumbX > 0.55 && rightThumbX < 0.65) {
                        mouseInput.mouseMove(8, 0);
                    }
                    if (rightThumbX > 0.45 && rightThumbX < 0.55) {
                        mouseInput.mouseMove(6, 0);
                    }
                    if (rightThumbX > 0.35 && rightThumbX < 0.45) {
                        mouseInput.mouseMove(3, 0);
                    }
                    if (rightThumbX > 0.25 && rightThumbX < 0.35) {
                        mouseInput.mouseMove(2, 0);
                    }
                    if (rightThumbX > 0.15 && rightThumbX < 0.25) {
                        mouseInput.mouseMove(1, 0);
                    }
                    if (rightThumbX < -0.15 && rightThumbX > -0.25) {
                        mouseInput.mouseMove(-1, 0);
                    }
                    if (rightThumbX < -0.25 && rightThumbX > -0.35) {
                        mouseInput.mouseMove(-2, 0);
                    }
                    if (rightThumbX < -0.35 && rightThumbX > -0.45) {
                        mouseInput.mouseMove(-3, 0);
                    }
                    if (rightThumbX < -0.45 && rightThumbX > -0.55) {
                        mouseInput.mouseMove(-6, 0);
                    }
                    if (rightThumbX < -0.55 && rightThumbX > -0.65) {
                        mouseInput.mouseMove(-8, 0);
                    }
                    if (rightThumbX < -0.65 && rightThumbX > -0.75) {
                        mouseInput.mouseMove(-10, 0);
                    }
                    if (rightThumbX < -0.75 && rightThumbX > -0.9) {
                        mouseInput.mouseMove(-30, 0);
                    }
                    if (rightThumbX < -0.9) {
                        mouseInput.mouseMove(-45, 0);
                    }
                }
                if (mousetof == false) {
                    //设置震动
                    if (lastleftThumbX != leftThumbX || lastrightThumbX != rightThumbX) {
                        if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.2 || rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.2) {
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.2 && leftThumbX * leftThumbX + leftThumbY * leftThumbY < 0.7 && rightThumbX * rightThumbX + rightThumbY * rightThumbY < 0.2) {
                                xboxController.setVibration(800, 0);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.7 && rightThumbX * rightThumbX + rightThumbY * rightThumbY < 0.2) {
                                xboxController.setVibration(5600, 0);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY < 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY < 0.7) {
                                xboxController.setVibration(0, 3000);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY < 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.7) {
                                xboxController.setVibration(0, 24000);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.2 && leftThumbX * leftThumbX + leftThumbY * leftThumbY < 0.7 && rightThumbX * rightThumbX + rightThumbY * rightThumbY < 0.7) {
                                xboxController.setVibration(800, 3000);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.7 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY < 0.7) {
                                xboxController.setVibration(5600, 3000);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY < 0.7 && leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.2 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.7) {
                                xboxController.setVibration(800, 24000);
                            }
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.7 && rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.7) {
                                xboxController.setVibration(5600, 24000);
                            }
                        } else {
                            xboxController.setVibration(0, 0); // 设置左边马达的震动强度
                        }
                    }
                    if (lastleftThumbX != leftThumbX) {
                        if (lastleftThumbX * lastleftThumbX + lastleftThumbY * lastleftThumbY < 0.7) {
                            if (leftThumbX * leftThumbX + leftThumbY * leftThumbY > 0.7) {
                                float tanl = 0;
                                if (lefttof == false) {
                                    if (leftThumbY > 0) {
                                        tanl = leftThumbY / leftThumbX;
                                        if (tanl > -0.4816 && tanl < 0.0) {
                                            keyBoardInput.pressA();
                                        }
                                        if (tanl > -1.2540 && tanl < -0.4816) {
                                            keyBoardInput.pressQ();
                                        }
                                        if (tanl > -4.3816 && tanl < -1.2540) {
                                            keyBoardInput.pressW();
                                        }
                                        if (tanl > 4.3809 || tanl < -4.3816) {
                                            keyBoardInput.pressE();
                                        }
                                        if (tanl > 1.2539 && tanl < 4.3809) {
                                            keyBoardInput.pressR();
                                        }
                                        if (tanl > 0.4815 && tanl < 1.2539) {
                                            keyBoardInput.pressD();
                                        }
                                        if (tanl > 0 && tanl < 0.4815) {
                                            keyBoardInput.pressF();
                                        }
                                    }
                                    if (leftThumbY < 0) {
                                        tanl = leftThumbY / leftThumbX;
                                        if (tanl > -0.4816 && tanl < 0.0) {
                                            keyBoardInput.pressG();
                                        }
                                        if (tanl > -1.2540 && tanl < -0.4816) {
                                            keyBoardInput.pressV();
                                        }
                                        if (tanl > -4.3816 && tanl < -1.2540) {
                                            keyBoardInput.pressC();
                                        }
                                        if (tanl > 4.3809 || tanl < -4.3816) {
                                            keyBoardInput.pressX();
                                        }
                                        if (tanl > 1.2539 && tanl < 4.3809) {
                                            System.out.println("未定义");
                                        }
                                        if (tanl > 0.4815 && tanl < 1.2539) {
                                            keyBoardInput.pressZ();
                                        }
                                        if (tanl > 0 && tanl < 0.4815) {
                                            keyBoardInput.pressS();
                                        }
                                    }
                                }
                                if (lefttof == true) {
                                    if (leftThumbY > 0) {
                                        tanl = leftThumbY / leftThumbX;
                                        if (tanl > -0.4816 && tanl < 0.0) {
                                            keyBoardInput.press1();
                                        }
                                        if (tanl > -1.2540 && tanl < -0.4816) {
                                            keyBoardInput.press2();
                                        }
                                        if (tanl > -4.3816 && tanl < -1.2540) {
                                            keyBoardInput.press3();
                                        }
                                        if (tanl > 4.3809 || tanl < -4.3816) {
                                            keyBoardInput.press4();
                                        }
                                        if (tanl > 1.2539 && tanl < 4.3809) {
                                            keyBoardInput.press5();
                                        }
                                        if (tanl > 0.4815 && tanl < 1.2539) {
                                            keyBoardInput.press6();
                                        }
                                        if (tanl > 0 && tanl < 0.4815) {
                                            keyBoardInput.press7();
                                        }
                                    }
                                    if (leftThumbY < 0) {
                                        tanl = leftThumbY / leftThumbX;
                                        if (tanl > -0.4816 && tanl < 0.0) {
                                            keyBoardInput.press8();
                                        }
                                        if (tanl > -1.2540 && tanl < -0.4816) {
                                            keyBoardInput.press9();
                                        }
                                        if (tanl > -4.3816 && tanl < -1.2540) {
                                            keyBoardInput.press0();
                                        }
                                        if (tanl > 4.3809 || tanl < -4.3816) {
                                            keyBoardInput.pressF1();
                                        }
                                        if (tanl > 1.2539 && tanl < 4.3809) {
                                            keyBoardInput.pressF2();
                                        }
                                        if (tanl > 0.4815 && tanl < 1.2539) {
                                            keyBoardInput.pressF5();
                                        }
                                        if (tanl > 0 && tanl < 0.4815) {
                                            keyBoardInput.pressF6();
                                        }
                                    }
                                }
                            } else {
                                keyBoardInput.releasA();
                                keyBoardInput.releasQ();
                                keyBoardInput.releasW();
                                keyBoardInput.releasE();
                                keyBoardInput.releasR();
                                keyBoardInput.releasF();
                                keyBoardInput.releasD();
                                keyBoardInput.releasS();
                                keyBoardInput.releasG();
                                keyBoardInput.releasV();
                                keyBoardInput.releasC();
                                keyBoardInput.releasX();
                                keyBoardInput.releasZ();
                                keyBoardInput.releas1();
                                keyBoardInput.releas2();
                                keyBoardInput.releas3();
                                keyBoardInput.releas4();
                                keyBoardInput.releas5();
                                keyBoardInput.releas6();
                                keyBoardInput.releas7();
                                keyBoardInput.releas8();
                                keyBoardInput.releas9();
                                keyBoardInput.releas0();
                                keyBoardInput.releasF1();
                                keyBoardInput.releasF2();
                                keyBoardInput.releasF5();
                                keyBoardInput.releasF6();
                            }
                        }
                    }
                    if (lastrightThumbX != rightThumbX) {
                        if (lastrightThumbX * lastrightThumbX + lastrightThumbY * lastrightThumbY < 0.7) {
                            if (rightThumbX * rightThumbX + rightThumbY * rightThumbY > 0.7) {
                                float tanR = 0;
                                tanR = rightThumbY / rightThumbX;
                                if (rightttof == false) {
                                    if (rightThumbY > 0) {
                                        if (tanR > -0.4816 && tanR < 0.0) {
                                            keyBoardInput.pressT();
                                        }
                                        if (tanR > -1.2540 && tanR < -0.4816) {
                                            keyBoardInput.pressY();
                                        }
                                        if (tanR > -4.3816 && tanR < -1.2540) {
                                            keyBoardInput.pressU();
                                        }
                                        if (tanR > 4.3809 || tanR < -4.3816) {
                                            keyBoardInput.pressI();
                                        }
                                        if (tanR > 1.2539 && tanR < 4.3809) {
                                            keyBoardInput.pressO();
                                        }
                                        if (tanR > 0.4815 && tanR < 1.2539) {
                                            keyBoardInput.pressP();
                                        }
                                        if (tanR > 0 && tanR < 0.4815) {
                                            keyBoardInput.pressL();
                                        }
                                    }
                                    if (rightThumbY < 0) {
                                        if (tanR > -0.4816 && tanR < 0.0) {
                                            keyBoardInput.pressK();
                                        }
                                        if (tanR > -1.2540 && tanR < -0.4816) {
                                            keyBoardInput.pressM();
                                        }
                                        if (tanR > -4.3816 && tanR < -1.2540) {
                                            System.out.println("未定义");
                                        }
                                        if (tanR > 4.3809 || tanR < -4.3816) {
                                            keyBoardInput.pressN();
                                        }
                                        if (tanR > 1.2539 && tanR < 4.3809) {
                                            keyBoardInput.pressB();
                                        }
                                        if (tanR > 0.4815 && tanR < 1.2539) {
                                            keyBoardInput.pressJ();
                                        }
                                        if (tanR > 0 && tanR < 0.4815) {
                                            keyBoardInput.pressH();
                                        }
                                    }
                                }
                                if (rightttof == true) {
                                    if (rightThumbY > 0) {
                                        if (tanR > -0.4816 && tanR < 0.0) {
                                            keyBoardInput.pressBackquote();
                                        }
                                        if (tanR > -1.2540 && tanR < -0.4816) {
                                            keyBoardInput.pressMinus();
                                        }
                                        if (tanR > -4.3816 && tanR < -1.2540) {
                                            keyBoardInput.pressEquals();
                                        }
                                        if (tanR > 4.3809 || tanR < -4.3816) {
                                            keyBoardInput.pressBackslash();
                                        }
                                        if (tanR > 1.2539 && tanR < 4.3809) {
                                            keyBoardInput.pressOpenbracket();
                                        }
                                        if (tanR > 0.4815 && tanR < 1.2539) {
                                            keyBoardInput.pressClosebracket();
                                        }
                                        if (tanR > 0 && tanR < 0.4815) {
                                            System.out.println("未定义");
                                        }
                                    }
                                    if (rightThumbY < 0) {
                                        if (tanR > -0.4816 && tanR < 0.0) {
                                            keyBoardInput.pressSemicolon();
                                        }
                                        if (tanR > -1.2540 && tanR < -0.4816) {
                                            keyBoardInput.pressQuote();
                                        }
                                        if (tanR > -4.3816 && tanR < -1.2540) {
                                            keyBoardInput.pressComma();
                                        }
                                        if (tanR > 4.3809 || tanR < -4.3816) {
                                            keyBoardInput.pressPeriod();
                                        }
                                        if (tanR > 1.2539 && tanR < 4.3809) {
                                            keyBoardInput.pressSlash();
                                        }
                                        if (tanR > 0.4815 && tanR < 1.2539) {
                                            keyBoardInput.pressF11();
                                        }
                                        if (tanR > 0 && tanR < 0.4815) {
                                            keyBoardInput.pressF12();
                                        }
                                    }
                                }
                            } else {
                                keyBoardInput.releasT();
                                keyBoardInput.releasY();
                                keyBoardInput.releasU();
                                keyBoardInput.releasI();
                                keyBoardInput.releasO();
                                keyBoardInput.releasP();
                                keyBoardInput.releasL();
                                keyBoardInput.releasK();
                                keyBoardInput.releasM();
                                keyBoardInput.releasN();
                                keyBoardInput.releasB();
                                keyBoardInput.releasJ();
                                keyBoardInput.releasH();
                                keyBoardInput.releasBackquote();
                                keyBoardInput.releasMinus();
                                keyBoardInput.releasEquals();
                                keyBoardInput.releasBackslash();
                                keyBoardInput.releasOpenbracket();
                                keyBoardInput.releasClosebracket();
                                keyBoardInput.releasSemicolon();
                                keyBoardInput.releasQuote();
                                keyBoardInput.releasComma();
                                keyBoardInput.releasPeriod();
                                keyBoardInput.releasSlash();
                                keyBoardInput.releasF11();
                                keyBoardInput.releasF12();
                            }
                        }
                    }
                }
                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }

    public static void listener(boolean b) {
        if (b) {
            listener listener = new listener();
            listener.start();
        }
    }
}

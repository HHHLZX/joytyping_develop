package org.example.joytyping;

import java.awt.*;
import java.awt.event.InputEvent;

public class mouseInput {
    public static void pressLeft() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 按下按键
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasLeft() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 松开按键
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressMiddle() {
        try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasMiddle() {
        try {
            Robot robot = new Robot();
            robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressRight() {
        try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasRight() {
        try {
            Robot robot = new Robot();
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void mouseWheelUp() {
        try {
            Robot robot = new Robot();
            robot.mouseWheel(-1); // 向上滚动一个单位
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void mouseWheelDown() {
        try {
            Robot robot = new Robot();
            robot.mouseWheel(1); // 向下滚动一个单位
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void mouseMoveRightSlow() {
        mouseMove(1, 0);
    }
    public static void mouseMoveRightLowspeed() {
        mouseMove(2, 0);
    }
    public static void mouseMoveRightModerate() {
        mouseMove(3, 0);
    }
    public static void mouseMoveLeft() {
        mouseMove(-1, 0);
    }

    public static void mouseMove(int horizontalPixels, int verticalPixels) {
        try {
            Robot robot = new Robot();
            // 获取当前鼠标位置
            Point currentMouseLocation = MouseInfo.getPointerInfo().getLocation();
            int currentX = (int) currentMouseLocation.getX();
            int currentY = (int) currentMouseLocation.getY();
            // 获取所有屏幕设备
            GraphicsDevice[] screens = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
            // 检查鼠标位置是否在某个屏幕上
            GraphicsDevice currentScreen = null;
            for (GraphicsDevice screen : screens) {
                Rectangle bounds = screen.getDefaultConfiguration().getBounds();
                if (currentX >= bounds.x && currentX < bounds.x + bounds.width &&
                        currentY >= bounds.y && currentY < bounds.y + bounds.height) {
                    currentScreen = screen;
                    break;
                }
            }
            if (currentScreen != null) {
                // 计算目标位置
                int targetX = currentX + horizontalPixels;
                int targetY = currentY + verticalPixels;
                // 获取当前屏幕的尺寸和位置
                Rectangle screenBounds = currentScreen.getDefaultConfiguration().getBounds();
                // 确保目标位置在当前屏幕范围内
                targetX = Math.max(screenBounds.x, Math.min(targetX, screenBounds.x + screenBounds.width - 1));
                targetY = Math.max(screenBounds.y, Math.min(targetY, screenBounds.y + screenBounds.height - 1));
                // 移动鼠标
                robot.mouseMove(targetX, targetY);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}

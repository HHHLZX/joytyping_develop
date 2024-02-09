package org.example.joytyping;

import java.awt.*;
import static java.lang.Thread.sleep;
//本软件仅供学习使用，请勿用作商业用途。
public class test10 {

    public static void main(String[] args) {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            while (true) {
                // 向右移动100像素，向下移动50像素
                moveMouse(robot, 100, 50);
                sleep(1000);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 控制鼠标移动指定的水平和垂直像素
    private static void moveMouse(Robot robot, int horizontalPixels, int verticalPixels) {
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
    }
}

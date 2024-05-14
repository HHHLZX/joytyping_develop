package org.example.joytyping;

import java.awt.*;
import java.awt.event.InputEvent;

public class test11 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            while (true) {
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int x = (int) mouseLocation.getX();
                int y = (int) mouseLocation.getY();
                boolean isInputEnabled = isInputEnabled(robot, x, y);
                System.out.println("Mouse at: (" + x + ", " + y + "), Input enabled: " + isInputEnabled);
                Thread.sleep(1000); // Check every second
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static boolean isInputEnabled(Robot robot, int x, int y) {
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // After clicking, check if the mouse pointer has moved from the original position
//        单击后，检查鼠标指针是否已从原始位置移动
        Point newMouseLocation = MouseInfo.getPointerInfo().getLocation();
        return (int) newMouseLocation.getX() != x || (int) newMouseLocation.getY() != y;
    }
}

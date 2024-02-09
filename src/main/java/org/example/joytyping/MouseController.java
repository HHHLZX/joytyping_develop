package org.example.joytyping;

import java.awt.*;
import java.awt.event.InputEvent;
//本软件仅供学习使用，请勿用作商业用途。
public class MouseController {

    public static void main(String[] args) {
        try {
            // 创建Robot对象
            Robot robot = new Robot();

            // 模拟左键按下
            simulateLeftMousePress(robot);

            // 等待一段时间，模拟按下后的延迟
            robot.delay(500);

            // 模拟左键松开
            simulateLeftMouseRelease(robot);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // 模拟左键按下
    private static void simulateLeftMousePress(Robot robot) {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }

    // 模拟左键松开
    private static void simulateLeftMouseRelease(Robot robot) {
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}

package org.example.joytyping;

import java.awt.*;
import java.awt.event.KeyEvent;
//纯单个按键输入
public class SimulateKeyPress1 {
    public static void main(String[] args) {
        try {
            // 创建Robot对象
            Robot robot = new Robot();

            // 模拟按下 'a' 键
            robot.keyPress(KeyEvent.VK_A);

            // 等待一段时间（你可以根据需要调整等待时间）
            robot.delay(100);

            // 松开 'a' 键
            robot.keyRelease(KeyEvent.VK_A);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}


package org.example.joytyping;

import java.awt.*;
import java.awt.event.KeyEvent;
//组合键输入（2个按键）
public class SimulateKeyPress {
    public static void main(String[] args) {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 模拟按下！键
            //先按下shift
            robot.keyPress(KeyEvent.VK_SHIFT);
            //再按下1
            robot.keyPress(KeyEvent.VK_1);
            // 等待一段时间（你可以根据需要调整等待时间）
            robot.delay(100);
            // 松开1键shift键
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_SHIFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

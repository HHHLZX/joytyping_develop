package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputComponents;
import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;
//本软件仅供学习使用，请勿用作商业用途。
public class test7 {
    public static void main(String[] args) {
        // 获取所有的XInput设备
        try {
            XInputDevice[] devices = XInputDevice.getAllDevices();

            // 假设第一个设备是Xbox手柄，实际情况可能需要进一步判断
            XInputDevice xboxController = devices[0];

            // 轮询设备以获取最新的状态
            while (true) {
                xboxController.poll();

                // 获取手柄的组件状态
                XInputComponents components = xboxController.getComponents();

                // 获取左板机的值
                float LEFT_TRIGGER = components.getAxes().lt;

                // 获取右摇杆的X和Y值
                float RIGHT_TRIGGER = components.getAxes().rt;

                // 打印值
                System.out.println("LT:" + LEFT_TRIGGER);
                System.out.println("RT:" + RIGHT_TRIGGER);

                // 等待一段时间，避免频繁轮询
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (XInputNotLoadedException e) {
            e.printStackTrace();
        }
    }
}

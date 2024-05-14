package org.example.joytyping;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;

public class test12 {

    public static void main(String[] args) {
        while (true) {
            // 获取当前鼠标的形状
            Cursor cursor = Cursor.getDefaultCursor();
            // 获取鼠标的形状类型
            int cursorType = cursor.getType();

            switch (cursorType) {
//                case Cursor.DEFAULT_CURSOR:
//                    System.out.println("当前鼠标形状为默认形状。");
//                    break;
                case Cursor.CROSSHAIR_CURSOR:
                    System.out.println("当前鼠标形状为十字形。");
                    break;
                case Cursor.HAND_CURSOR:
                    System.out.println("当前鼠标形状为手形。");
                    break;
                case Cursor.MOVE_CURSOR:
                    System.out.println("当前鼠标形状为移动形状。");
                    break;
                case Cursor.TEXT_CURSOR:
                    System.out.println("当前鼠标形状为文本形状。");
                    break;
                case Cursor.WAIT_CURSOR:
                    System.out.println("当前鼠标形状为等待形状。");
                    break;
//                case Cursor.RESIZE_CURSOR:
//                    System.out.println("当前鼠标形状为调整大小形状。");
//                    break;
                // 其他形状类型的处理
                // 可以参考 Cursor 类的文档来获取更多形状类型
                default:
                    System.out.println("当前鼠标形状为其他形状。");
                    break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

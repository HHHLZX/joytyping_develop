package org.example.joytyping;

import java.awt.*;
import java.awt.event.KeyEvent;

public class keyBoardInput {
    public static void pressCtrl() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 按下按键
            robot.keyPress(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasCtrl() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 释放按键
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressShift() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 按下按键
            robot.keyPress(KeyEvent.VK_SHIFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasShift() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 释放按键
            robot.keyRelease(KeyEvent.VK_SHIFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressEsc() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 按下按键
            robot.keyPress(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasEsc() {
        try {
            // 创建Robot对象
            Robot robot = new Robot();
            // 释放按键
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressSpace() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasSpace() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressCapslock() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasCapslock() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressNumlock() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_NUM_LOCK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasNumlock() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_NUM_LOCK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressEnter() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasEnter() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressAlt() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasAlt() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_ALT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressBackspace() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasBackspace() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressTab() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasTab() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_TAB);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressHome() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_HOME);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasHome() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_HOME);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressEnd() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_END);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasEnd() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_END);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressDelete() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DELETE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasDelete() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_DELETE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static void pressUp() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_UP);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasUp() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_UP);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressDown() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasDown() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_DOWN);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressLeft() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_LEFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasLeft() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_LEFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressRigt() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_RIGHT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasRight() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_RIGHT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressA() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_A);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasA() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_A);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressQ() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_Q);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasQ() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_Q);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressW() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_W);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasW() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_W);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressE() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_E);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasE() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_E);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressR() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_R);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasR() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_R);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressD() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_D);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasD() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_D);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressG() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_G);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasG() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_G);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressV() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_V);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasV() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_V);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressC() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_C);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasC() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_C);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressX() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_X);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasX() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_X);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressZ() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_Z);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasZ() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_Z);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressS() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_S);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasS() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_S);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressT() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_T);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasT() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_T);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressY() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_Y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasY() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_Y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressU() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_U);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasU() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_U);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressI() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_I);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasI() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_I);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressO() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_O);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasO() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_O);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressP() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_P);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasP() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_P);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressL() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_L);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasL() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressK() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_K);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasK() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_K);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressM() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_M);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasM() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_M);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressN() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_N);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasN() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_N);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressB() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_B);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasB() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_B);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressJ() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_J);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasJ() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_J);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressH() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_H);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasH() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_H);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press1() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas1() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press2() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_2);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas2() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_2);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press3() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_3);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas3() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_3);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press4() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_4);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas4() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_4);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press5() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas5() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press6() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_6);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas6() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_6);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press7() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_7);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas7() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_7);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press8() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_8);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas8() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_8);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press9() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_9);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas9() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_9);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press0() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_0);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releas0() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_0);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressBackquote() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasBackquote() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressMinus() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_MINUS);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasMinus() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_MINUS);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressEquals() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_EQUALS);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasEquals() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_EQUALS);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressBackslash() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SLASH);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasBackslash() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_BACK_SLASH);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressOpenbracket() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasOpenbracket() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressClosebracket() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasClosebracket() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressSemicolon() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SEMICOLON);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasSemicolon() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_SEMICOLON);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressQuote() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_QUOTE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasQuote() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_QUOTE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressComma() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_COMMA);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasComma() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_COMMA);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressPeriod() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PERIOD);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasPeriod() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_PERIOD);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressSlash() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SLASH);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasSlash() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_SLASH);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF1() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF1() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF2() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F2);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF2() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F2);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF5() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF5() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF6() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F6);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static void releasF6() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F6);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF11() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F11);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF11() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F11);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressF12() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F12);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void releasF12() {
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_F12);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

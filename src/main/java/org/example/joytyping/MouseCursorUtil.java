//package org.example.joytyping;
//import com.sun.jna.Native;
//import com.sun.jna.Pointer;
//import com.sun.jna.Structure;
//import com.sun.jna.platform.win32.User32;
//import com.sun.jna.platform.win32.WinDef;
//import com.sun.jna.platform.win32.WinNT;
//import com.sun.jna.platform.win32.WinUser;、；‘；
//import java.util.Arrays;
//import java.util.List;
//
//public class MouseCursorUtil {
//
//    public static void main(String[] args) {
//        User32 user32 = User32.INSTAZZNCE;
//
//        // 初始化 CURSORINFO 结构
//        WinUser.MOUSEINPUT cursorInfo = new WinUser.MOUSEINPUT();
//        cursorInfo.cbSize = new WinDef.DWORD(Native.getNativeSize(WinUser.CURSORINFO.class));
//
//        // 获取光标信息
//        if (user32.GetCursorInfo(cursorInfo)) {
//            // 输出光标句柄和位置信息
//            System.out.println("Cursor Handle: " + cursorInfo.hCursor);
//            System.out.println("Cursor Position: (" + cursorInfo.ptScreenPos.x + ", " + cursorInfo.ptScreenPos.y + ")");
//        } else {
//            System.err.println("Failed to get cursor info");
//        }
//    }
//
//    // 定义 CURSORINFO 结构
//    public static class CURSORINFO extends Structure {
//        public WinDef.DWORD cbSize;
//        public WinDef.DWORD flags;
//        public WinDef.HCURSOR hCursor;
//        public WinDef.POINT ptScreenPos;
//
//        @Override
//        protected List<String> getFieldOrder() {
//            return Arrays.asList("cbSize", "flags", "hCursor", "ptScreenPos");
//        }
//
//        public static class ByReference extends CURSORINFO implements Structure.ByReference {
//        }
//
//        public static class ByValue extends CURSORINFO implements Structure.ByValue {
//        }
//    }
//}

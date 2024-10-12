//package org.example.joytyping;
//
//import com.sun.jna.Native;
//import com.sun.jna.Structure;
//import com.sun.jna.platform.win32.WinDef.HCURSOR;
//import com.sun.jna.platform.win32.WinDef.HINSTANCE;
//import com.sun.jna.platform.win32.WinDef.POINT;
//import com.sun.jna.platform.win32.WinUser.CURSORINFO;
//import com.sun.jna.win32.W32APIOptions;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class test13 {
//    // 定义需要的User32接口
//    public interface User32 extends com.sun.jna.platform.win32.User32 {
//        User32 INSTANCE = Native.load("user32", User32.class, W32APIOptions.DEFAULT_OPTIONS);
//
//        boolean GetCursorInfo(CURSORINFO cursorInfo);
//        HCURSOR LoadCursor(HINSTANCE hInstance, int lpCursorName);
//    }
//
//    // 定义CURSORINFO结构
//    @Structure.FieldOrder({"cbSize", "flags", "hCursor", "ptScreenPos"})
//    public static class MyCursorInfo extends Structure {
//        public int cbSize = size();
//        public int flags;
//        public HCURSOR hCursor;
//        public POINT ptScreenPos;
//    }
//
//    // 定义所有鼠标指针形状的ID
//    public static final Map<Integer, String> CURSOR_SHAPES = new HashMap<>();
//    static {
//        CURSOR_SHAPES.put(32512, "IDC_ARROW");
//        CURSOR_SHAPES.put(32513, "IDC_IBEAM");
//        CURSOR_SHAPES.put(32514, "IDC_WAIT");
//        CURSOR_SHAPES.put(32515, "IDC_CROSS");
//        CURSOR_SHAPES.put(32516, "IDC_UPARROW");
//        CURSOR_SHAPES.put(32517, "IDC_SIZE");
//        CURSOR_SHAPES.put(32640, "IDC_ICON");
//        CURSOR_SHAPES.put(32641, "IDC_SIZENWSE");
//        CURSOR_SHAPES.put(32642, "IDC_SIZENESW");
//        CURSOR_SHAPES.put(32643, "IDC_SIZEWE");
//        CURSOR_SHAPES.put(32644, "IDC_SIZENS");
//        CURSOR_SHAPES.put(32645, "IDC_SIZEALL");
//        CURSOR_SHAPES.put(32646, "IDC_NO");
//        CURSOR_SHAPES.put(32648, "IDC_HAND");
//        CURSOR_SHAPES.put(32649, "IDC_APPSTARTING");
//        CURSOR_SHAPES.put(32650, "IDC_HELP");
//    }
//
//    public String getCurrentCursorShape() {
//        MyCursorInfo cursorInfo = new MyCursorInfo();
//        cursorInfo.cbSize = cursorInfo.size();
//
//        if (User32.INSTANCE.GetCursorInfo(cursorInfo)) {
//            for (Map.Entry<Integer, String> entry : CURSOR_SHAPES.entrySet()) {
//                HCURSOR shapeCursor = User32.INSTANCE.LoadCursor(null, entry.getKey());
//                if (cursorInfo.hCursor.equals(shapeCursor)) {
//                    return entry.getValue();
//                }
//            }
//        }
//        return "Unknown";
//    }
//
//    public static void main(String[] args) {
//        MouseCursorUtil util = new MouseCursorUtil();
//        String currentCursorShape = util.getCurrentCursorShape();
//        System.out.println("Current cursor shape: " + currentCursorShape);
//    }
//}

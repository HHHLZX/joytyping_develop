package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.XInputDevice14;
import com.github.strikerx3.jxinput.XInputLibraryVersion;

public class test3 {
    public static void main(String[] args) {
        // Check if XInput 1.3 is available检查 XInput 1.3 是否可用
        if (XInputDevice.isAvailable()) {
            System.out.println("XInput 1.3 可用");
            // XInput 1.3 is available on this platform
        }
        // Check if XInput 1.4 is available
        if (XInputDevice14.isAvailable()) {
            System.out.println("XInput 1.4 可用");
            // XInput 1.4 is available on this platform
        }
        // Get the DLL version, which can be one of the following:
        // 获取 DLL 版本，该版本可以是下列版本之一：
        // - XInputLibraryVersion.NONE: no XInput available
        // - XInputLibraryVersion.XINPUT_1_4: XInput 1.4 (Windows 8 and later)
        // - XInputLibraryVersion.XINPUT_1_3: XInput 1.3 (Windows XP SP1 and later)
        // - XInputLibraryVersion.XINPUT_9_1_0: XInput9 1.0 (Windows Vista only)
        XInputLibraryVersion libVersion = XInputDevice.getLibraryVersion();
        System.out.println(libVersion);
        //我加载的是XINPUT_1_4
    }
}

package org.example.joytyping;

import com.github.strikerx3.jxinput.XInputDevice;
import com.github.strikerx3.jxinput.XInputDevice14;
import com.github.strikerx3.jxinput.XInputLibraryVersion;
import com.github.strikerx3.jxinput.exceptions.XInputNotLoadedException;

//public class test {
//    public static void main(String[] args) {
//        // Check if XInput 1.3 is available
//        if (XInputDevice.isAvailable()) {
//            // XInput 1.3 is available on this platform
//        }
//
//        // Check if XInput 1.4 is available
//        if (XInputDevice14.isAvailable()) {
//            // XInput 1.4 is available on this platform
//        }
////        XInputDevice Xi = new XInputDevice();
//        System.out.println("hello world");
//    }
//}
public class test {
    public static void main(String[] args) throws XInputNotLoadedException {
        // Check if XInput 1.3 is available检查 XInput 1.3 是否可用
        if (XInputDevice.isAvailable()) {
            // XInput 1.3 is available on this platform
            // Add your code to work with XInput 1.3
            XInputDevice device = XInputDevice.getAllDevices()[0]; // Example: Get the first XInput device
            // Add more operations using XInputDevice
        }

        // Check if XInput 1.4 is available
        if (XInputDevice14.isAvailable()) {
            // XInput 1.4 is available on this platform
            // Add your code to work with XInput 1.4
            XInputDevice14 device14 = XInputDevice14.getAllDevices()[0]; // Example: Get the first XInput 1.4 device
            // Add more operations using XInputDevice14
        }

        // Get the DLL version
        XInputLibraryVersion libVersion = XInputDevice.getLibraryVersion();

        // Check the DLL version
        switch (libVersion) {
            case NONE:
                // No XInput available
                break;
            case XINPUT_1_4:
                // XInput 1.4 (Windows 8 and later)
                break;
            case XINPUT_1_3:
                // XInput 1.3 (Windows XP SP1 and later)
                break;
            case XINPUT_9_1_0:
                // XInput9 1.0 (Windows Vista only)
                break;
        }
    }
}


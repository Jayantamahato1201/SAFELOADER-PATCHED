package I;

import android.view.WindowInsets;

public abstract class s0 {
    public static int a(int i2) {
        int b;
        int i3 = 0;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    b = WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    b = WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    b = WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    b = WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    b = WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    b = WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    b = WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    b = WindowInsets.Type.displayCutout();
                }
                i3 |= b;
            }
        }
        return i3;
    }
}

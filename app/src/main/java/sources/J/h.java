package J;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class h {
    public static Object a(int i2, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}

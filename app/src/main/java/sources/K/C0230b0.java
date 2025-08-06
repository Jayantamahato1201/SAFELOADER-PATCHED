package k;

import android.widget.TextView;

/* renamed from: k.b0  reason: case insensitive filesystem */
public abstract class C0230b0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    public static void c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}

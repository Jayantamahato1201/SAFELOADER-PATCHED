package k;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: k.i0  reason: case insensitive filesystem */
public abstract class C0247i0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}

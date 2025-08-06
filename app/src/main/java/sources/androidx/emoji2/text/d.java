package androidx.emoji2.text;

import android.text.TextPaint;

public final class d {
    public static final ThreadLocal b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1149a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1149a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

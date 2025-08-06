package y0;

import B0.d;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import s0.b;
import s0.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4841a = new TextPaint(1);
    public final b b = new b(1, this);

    /* renamed from: c  reason: collision with root package name */
    public float f4842c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4843d = true;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f4844e = new WeakReference((Object) null);
    public d f;

    public j(f fVar) {
        this.f4844e = new WeakReference(fVar);
    }

    public final float a(String str) {
        float f2;
        if (!this.f4843d) {
            return this.f4842c;
        }
        TextPaint textPaint = this.f4841a;
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = textPaint.measureText(str, 0, str.length());
        }
        this.f4842c = f2;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f4843d = false;
        return this.f4842c;
    }
}

package k;

import A.j;
import Q0.l;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import d.a;

/* renamed from: k.w  reason: case insensitive filesystem */
public final class C0273w {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3578a;
    public final j b;

    public C0273w(TextView textView) {
        this.f3578a = textView;
        this.b = new j(textView);
    }

    /* JADX INFO: finally extract failed */
    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f3578a.getContext().obtainStyledAttributes(attributeSet, a.f2199i, i2, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((l) this.b.b).X(z2);
    }

    public final void c(boolean z2) {
        ((l) this.b.b).Y(z2);
    }
}

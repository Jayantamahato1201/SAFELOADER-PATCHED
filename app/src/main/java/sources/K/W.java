package k;

import I.O;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z.C0503b;

public final class W extends C0503b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3424h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f3425i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WeakReference f3426j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0236d0 f3427k;

    public W(C0236d0 d0Var, int i2, int i3, WeakReference weakReference) {
        this.f3427k = d0Var;
        this.f3424h = i2;
        this.f3425i = i3;
        this.f3426j = weakReference;
    }

    public final void i(Typeface typeface) {
        int i2;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f3424h) != -1) {
            if ((this.f3425i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            typeface = C0233c0.a(typeface, i2, z2);
        }
        C0236d0 d0Var = this.f3427k;
        if (d0Var.f3456m) {
            d0Var.f3455l = typeface;
            TextView textView = (TextView) this.f3426j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = O.f393a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new X(textView, typeface, d0Var.f3453j, 0));
                } else {
                    textView.setTypeface(typeface, d0Var.f3453j);
                }
            }
        }
    }

    public final void h(int i2) {
    }
}

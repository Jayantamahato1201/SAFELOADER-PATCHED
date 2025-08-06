package I;

import A.d;
import android.view.View;
import android.view.WindowInsets;

public class p0 extends o0 {

    /* renamed from: n  reason: collision with root package name */
    public d f457n = null;

    /* renamed from: o  reason: collision with root package name */
    public d f458o = null;

    /* renamed from: p  reason: collision with root package name */
    public d f459p = null;

    public p0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    public d g() {
        if (this.f458o == null) {
            this.f458o = d.c(this.f451c.getMandatorySystemGestureInsets());
        }
        return this.f458o;
    }

    public d i() {
        if (this.f457n == null) {
            this.f457n = d.c(this.f451c.getSystemGestureInsets());
        }
        return this.f457n;
    }

    public d k() {
        if (this.f459p == null) {
            this.f459p = d.c(this.f451c.getTappableElementInsets());
        }
        return this.f459p;
    }

    public t0 l(int i2, int i3, int i4, int i5) {
        return t0.g((View) null, this.f451c.inset(i2, i3, i4, i5));
    }

    public void q(d dVar) {
    }
}

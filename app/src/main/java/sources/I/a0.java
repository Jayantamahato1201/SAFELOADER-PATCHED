package I;

import A.d;
import F.c;
import F.p;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;

public final class a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0012d f407a;
    public t0 b;

    public a0(View view, C0012d dVar) {
        t0 t0Var;
        l0 l0Var;
        this.f407a = dVar;
        t0 h2 = O.h(view);
        if (h2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                l0Var = new k0(h2);
            } else if (i2 >= 29) {
                l0Var = new j0(h2);
            } else {
                l0Var = new i0(h2);
            }
            t0Var = l0Var.b();
        } else {
            t0Var = null;
        }
        this.b = t0Var;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r0 r0Var;
        Interpolator interpolator;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view2.isLaidOut()) {
            this.b = t0.g(view, windowInsets);
            return b0.i(view, windowInsets);
        }
        t0 g2 = t0.g(view, windowInsets);
        if (this.b == null) {
            this.b = O.h(view2);
        }
        if (this.b == null) {
            this.b = g2;
            return b0.i(view, windowInsets);
        }
        C0012d j2 = b0.j(view2);
        if (j2 != null && Objects.equals((WindowInsets) j2.b, windowInsets2)) {
            return b0.i(view, windowInsets);
        }
        t0 t0Var = this.b;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            r0Var = g2.f464a;
            if (i2 > 256) {
                break;
            }
            if (!r0Var.f(i2).equals(t0Var.f464a.f(i2))) {
                i3 |= i2;
            }
            i2 <<= 1;
        }
        if (i3 == 0) {
            return b0.i(view, windowInsets);
        }
        t0 t0Var2 = this.b;
        if ((i3 & 8) == 0) {
            interpolator = b0.f411g;
        } else if (r0Var.f(8).f6d > t0Var2.f464a.f(8).f6d) {
            interpolator = b0.f410e;
        } else {
            interpolator = b0.f;
        }
        g0 g0Var = new g0(i3, interpolator, 160);
        g0Var.f430a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(g0Var.f430a.a());
        d f = r0Var.f(i3);
        d f2 = t0Var2.f464a.f(i3);
        int min = Math.min(f.f4a, f2.f4a);
        int i4 = f.b;
        int i5 = f2.b;
        int min2 = Math.min(i4, i5);
        int i6 = f.f5c;
        int i7 = f2.f5c;
        t0 t0Var3 = g2;
        int min3 = Math.min(i6, i7);
        t0 t0Var4 = t0Var2;
        int i8 = f.f6d;
        g0 g0Var2 = g0Var;
        int i9 = f2.f6d;
        c cVar = new c((Object) d.b(min, min2, min3, Math.min(i8, i9)), 2, (Object) d.b(Math.max(f.f4a, f2.f4a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i9)));
        b0.f(view2, windowInsets2, false);
        t0 t0Var5 = t0Var3;
        g0 g0Var3 = g0Var2;
        duration.addUpdateListener(new Y(g0Var3, t0Var5, t0Var4, i3, view2));
        duration.addListener(new Z(g0Var3, view2));
        C0026s.a(view2, new p(view2, g0Var3, cVar, duration));
        this.b = t0Var5;
        return b0.i(view, windowInsets);
    }
}

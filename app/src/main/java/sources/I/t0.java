package I;

import A.d;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public final class t0 {
    public static final t0 b;

    /* renamed from: a  reason: collision with root package name */
    public final r0 f464a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = q0.f460q;
        } else {
            b = r0.b;
        }
    }

    public t0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f464a = new q0(this, windowInsets);
        } else if (i2 >= 29) {
            this.f464a = new p0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f464a = new o0(this, windowInsets);
        } else {
            this.f464a = new n0(this, windowInsets);
        }
    }

    public static d e(d dVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, dVar.f4a - i2);
        int max2 = Math.max(0, dVar.b - i3);
        int max3 = Math.max(0, dVar.f5c - i4);
        int max4 = Math.max(0, dVar.f6d - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return dVar;
        }
        return d.b(max, max2, max3, max4);
    }

    public static t0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        t0 t0Var = new t0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            t0 h2 = O.h(view);
            r0 r0Var = t0Var.f464a;
            r0Var.p(h2);
            r0Var.d(view.getRootView());
        }
        return t0Var;
    }

    public final int a() {
        return this.f464a.j().f6d;
    }

    public final int b() {
        return this.f464a.j().f4a;
    }

    public final int c() {
        return this.f464a.j().f5c;
    }

    public final int d() {
        return this.f464a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        return Objects.equals(this.f464a, ((t0) obj).f464a);
    }

    public final WindowInsets f() {
        r0 r0Var = this.f464a;
        if (r0Var instanceof m0) {
            return ((m0) r0Var).f451c;
        }
        return null;
    }

    public final int hashCode() {
        r0 r0Var = this.f464a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public t0() {
        this.f464a = new r0(this);
    }
}

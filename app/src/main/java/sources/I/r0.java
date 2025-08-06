package I;

import A.d;
import android.os.Build;
import android.view.View;
import java.util.Objects;

public class r0 {
    public static final t0 b;

    /* renamed from: a  reason: collision with root package name */
    public final t0 f461a;

    static {
        l0 l0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            l0Var = new k0();
        } else if (i2 >= 29) {
            l0Var = new j0();
        } else {
            l0Var = new i0();
        }
        b = l0Var.b().f464a.a().f464a.b().f464a.c();
    }

    public r0(t0 t0Var) {
        this.f461a = t0Var;
    }

    public t0 a() {
        return this.f461a;
    }

    public t0 b() {
        return this.f461a;
    }

    public t0 c() {
        return this.f461a;
    }

    public C0017i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n() != r0Var.n() || m() != r0Var.m() || !Objects.equals(j(), r0Var.j()) || !Objects.equals(h(), r0Var.h()) || !Objects.equals(e(), r0Var.e())) {
            return false;
        }
        return true;
    }

    public d f(int i2) {
        return d.f3e;
    }

    public d g() {
        return j();
    }

    public d h() {
        return d.f3e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public d i() {
        return j();
    }

    public d j() {
        return d.f3e;
    }

    public d k() {
        return j();
    }

    public t0 l(int i2, int i3, int i4, int i5) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(d[] dVarArr) {
    }

    public void p(t0 t0Var) {
    }

    public void q(d dVar) {
    }
}

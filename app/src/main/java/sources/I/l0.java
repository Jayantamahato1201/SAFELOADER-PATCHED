package I;

import A.d;
import A.i;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f445a;
    public d[] b;

    public l0() {
        this(new t0());
    }

    public final void a() {
        d[] dVarArr = this.b;
        if (dVarArr != null) {
            d dVar = dVarArr[0];
            d dVar2 = dVarArr[1];
            t0 t0Var = this.f445a;
            if (dVar2 == null) {
                dVar2 = t0Var.f464a.f(2);
            }
            if (dVar == null) {
                dVar = t0Var.f464a.f(1);
            }
            g(d.a(dVar, dVar2));
            d dVar3 = this.b[i.V(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            d dVar4 = this.b[i.V(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            d dVar5 = this.b[i.V(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract t0 b();

    public void c(int i2, d dVar) {
        if (this.b == null) {
            this.b = new d[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.b[i.V(i3)] = dVar;
            }
        }
    }

    public abstract void e(d dVar);

    public abstract void g(d dVar);

    public l0(t0 t0Var) {
        this.f445a = t0Var;
    }

    public void d(d dVar) {
    }

    public void f(d dVar) {
    }

    public void h(d dVar) {
    }
}

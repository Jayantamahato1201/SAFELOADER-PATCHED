package r;

import A.g;
import java.util.ArrayList;
import q.c;
import q.e;
import q.i;

public final class h extends C0472d {

    /* renamed from: d0  reason: collision with root package name */
    public float f4401d0 = -1.0f;
    public int e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f4402f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public C0471c f4403g0 = this.f4336y;

    /* renamed from: h0  reason: collision with root package name */
    public int f4404h0;

    public h() {
        this.f4404h0 = 0;
        this.f4291G.clear();
        this.f4291G.add(this.f4403g0);
        int length = this.f4290F.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f4290F[i2] = this.f4403g0;
        }
    }

    public final void A(e eVar) {
        if (this.f4293I != null) {
            C0471c cVar = this.f4403g0;
            eVar.getClass();
            int m2 = e.m(cVar);
            if (this.f4404h0 == 1) {
                this.f4298N = m2;
                this.f4299O = 0;
                v(this.f4293I.i());
                y(0);
                return;
            }
            this.f4298N = 0;
            this.f4299O = m2;
            y(this.f4293I.l());
            v(0);
        }
    }

    public final void B(int i2) {
        if (this.f4404h0 != i2) {
            this.f4404h0 = i2;
            ArrayList arrayList = this.f4291G;
            arrayList.clear();
            if (this.f4404h0 == 1) {
                this.f4403g0 = this.f4335x;
            } else {
                this.f4403g0 = this.f4336y;
            }
            arrayList.add(this.f4403g0);
            C0471c[] cVarArr = this.f4290F;
            int length = cVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                cVarArr[i3] = this.f4403g0;
            }
        }
    }

    public final void a(e eVar) {
        boolean z2;
        C0473e eVar2 = (C0473e) this.f4293I;
        if (eVar2 != null) {
            C0471c g2 = eVar2.g(2);
            C0471c g3 = eVar2.g(4);
            C0472d dVar = this.f4293I;
            boolean z3 = true;
            if (dVar == null || dVar.f4315c0[0] != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f4404h0 == 0) {
                g2 = eVar2.g(3);
                g3 = eVar2.g(5);
                C0472d dVar2 = this.f4293I;
                if (dVar2 == null || dVar2.f4315c0[1] != 2) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.e0 != -1) {
                i j2 = eVar.j(this.f4403g0);
                eVar.e(j2, eVar.j(g2), this.e0, 8);
                if (z2) {
                    eVar.f(eVar.j(g3), j2, 0, 5);
                }
            } else if (this.f4402f0 != -1) {
                i j3 = eVar.j(this.f4403g0);
                i j4 = eVar.j(g3);
                eVar.e(j3, j4, -this.f4402f0, 8);
                if (z2) {
                    eVar.f(j3, eVar.j(g2), 0, 5);
                    eVar.f(j4, j3, 0, 5);
                }
            } else if (this.f4401d0 != -1.0f) {
                i j5 = eVar.j(this.f4403g0);
                i j6 = eVar.j(g3);
                float f = this.f4401d0;
                c k2 = eVar.k();
                k2.f3814d.i(j5, -1.0f);
                k2.f3814d.i(j6, f);
                eVar.c(k2);
            }
        }
    }

    public final boolean b() {
        return true;
    }

    public final C0471c g(int i2) {
        switch (q.h.b(i2)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f4404h0 == 1) {
                    return this.f4403g0;
                }
                break;
            case 2:
            case 4:
                if (this.f4404h0 == 0) {
                    return this.f4403g0;
                }
                break;
        }
        throw new AssertionError(g.l(i2));
    }
}

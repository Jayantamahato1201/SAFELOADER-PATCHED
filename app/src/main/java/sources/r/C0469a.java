package r;

import A.g;
import q.c;
import q.e;
import q.h;
import q.i;

/* renamed from: r.a  reason: case insensitive filesystem */
public final class C0469a extends i {

    /* renamed from: f0  reason: collision with root package name */
    public int f4263f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4264g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4265h0;

    public final void a(e eVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar2 = eVar;
        C0471c[] cVarArr = this.f4290F;
        C0471c cVar = this.f4335x;
        cVarArr[0] = cVar;
        C0471c cVar2 = this.f4336y;
        int i6 = 2;
        cVarArr[2] = cVar2;
        C0471c cVar3 = this.f4337z;
        cVarArr[1] = cVar3;
        C0471c cVar4 = this.f4286A;
        cVarArr[3] = cVar4;
        for (C0471c cVar5 : cVarArr) {
            cVar5.f4285g = eVar2.j(cVar5);
        }
        int i7 = this.f4263f0;
        if (i7 >= 0 && i7 < 4) {
            C0471c cVar6 = cVarArr[i7];
            int i8 = 0;
            while (true) {
                if (i8 >= this.e0) {
                    z2 = false;
                    break;
                }
                C0472d dVar = this.f4405d0[i8];
                if ((this.f4264g0 || dVar.b()) && ((((i5 = this.f4263f0) == 0 || i5 == 1) && dVar.f4315c0[0] == 3 && dVar.f4335x.f4283d != null && dVar.f4337z.f4283d != null) || ((i5 == 2 || i5 == 3) && dVar.f4315c0[1] == 3 && dVar.f4336y.f4283d != null && dVar.f4286A.f4283d != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            if (cVar.e() || cVar3.e()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cVar2.e() || cVar4.e()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || (((i4 = this.f4263f0) != 0 || !z3) && ((i4 != 2 || !z4) && ((i4 != 1 || !z3) && (i4 != 3 || !z4))))) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            int i9 = 0;
            while (i9 < this.e0) {
                C0472d dVar2 = this.f4405d0[i9];
                if (this.f4264g0 || dVar2.b()) {
                    i j2 = eVar2.j(dVar2.f4290F[this.f4263f0]);
                    int i10 = this.f4263f0;
                    C0471c cVar7 = dVar2.f4290F[i10];
                    cVar7.f4285g = j2;
                    C0471c cVar8 = cVar7.f4283d;
                    if (cVar8 == null || cVar8.b != this) {
                        i3 = 0;
                    } else {
                        i3 = cVar7.f4284e;
                    }
                    if (i10 == 0 || i10 == i6) {
                        c k2 = eVar2.k();
                        i l2 = eVar2.l();
                        l2.f3837d = 0;
                        k2.c(cVar6.f4285g, j2, l2, this.f4265h0 - i3);
                        eVar2.c(k2);
                    } else {
                        c k3 = eVar2.k();
                        i l3 = eVar2.l();
                        l3.f3837d = 0;
                        k3.b(cVar6.f4285g, j2, l3, this.f4265h0 + i3);
                        eVar2.c(k3);
                    }
                    eVar2.e(cVar6.f4285g, j2, this.f4265h0 + i3, i2);
                }
                i9++;
                i6 = 2;
            }
            int i11 = this.f4263f0;
            if (i11 == 0) {
                eVar2.e(cVar3.f4285g, cVar.f4285g, 0, 8);
                eVar2.e(cVar.f4285g, this.f4293I.f4337z.f4285g, 0, 4);
                eVar2.e(cVar.f4285g, this.f4293I.f4335x.f4285g, 0, 0);
            } else if (i11 == 1) {
                eVar2.e(cVar.f4285g, cVar3.f4285g, 0, 8);
                eVar2.e(cVar.f4285g, this.f4293I.f4335x.f4285g, 0, 4);
                eVar2.e(cVar.f4285g, this.f4293I.f4337z.f4285g, 0, 0);
            } else if (i11 == 2) {
                eVar2.e(cVar4.f4285g, cVar2.f4285g, 0, 8);
                eVar2.e(cVar2.f4285g, this.f4293I.f4286A.f4285g, 0, 4);
                eVar2.e(cVar2.f4285g, this.f4293I.f4336y.f4285g, 0, 0);
            } else if (i11 == 3) {
                eVar2.e(cVar2.f4285g, cVar4.f4285g, 0, 8);
                eVar2.e(cVar2.f4285g, this.f4293I.f4336y.f4285g, 0, 4);
                eVar2.e(cVar2.f4285g, this.f4293I.f4286A.f4285g, 0, 0);
            }
        }
    }

    public final boolean b() {
        return true;
    }

    public final String toString() {
        String str = "[Barrier] " + this.f4307W + " {";
        for (int i2 = 0; i2 < this.e0; i2++) {
            C0472d dVar = this.f4405d0[i2];
            if (i2 > 0) {
                str = g.h(str, ", ");
            }
            StringBuilder a2 = h.a(str);
            a2.append(dVar.f4307W);
            str = a2.toString();
        }
        return g.h(str, "}");
    }
}

package r;

import java.util.ArrayList;
import q.e;
import s.C0475b;
import t.C0481f;

public final class g extends i {

    /* renamed from: A0  reason: collision with root package name */
    public float f4367A0;

    /* renamed from: B0  reason: collision with root package name */
    public float f4368B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f4369C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f4370D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f4371E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f4372F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f4373G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f4374H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f4375I0;

    /* renamed from: J0  reason: collision with root package name */
    public ArrayList f4376J0;

    /* renamed from: K0  reason: collision with root package name */
    public C0472d[] f4377K0;

    /* renamed from: L0  reason: collision with root package name */
    public C0472d[] f4378L0;

    /* renamed from: M0  reason: collision with root package name */
    public int[] f4379M0;

    /* renamed from: N0  reason: collision with root package name */
    public C0472d[] f4380N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f4381O0;

    /* renamed from: f0  reason: collision with root package name */
    public int f4382f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f4383g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4384h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f4385i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4386j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4387k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4388l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4389m0;
    public int n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0475b f4390o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0481f f4391p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f4392q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f4393r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f4394s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4395t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f4396u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f4397v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f4398w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f4399x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f4400y0;
    public float z0;

    public final void B() {
        for (int i2 = 0; i2 < this.e0; i2++) {
            C0472d dVar = this.f4405d0[i2];
        }
    }

    public final int C(C0472d dVar, int i2) {
        C0472d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f4315c0;
            if (iArr[1] == 3) {
                int i3 = dVar.f4322k;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (dVar.f4329r * ((float) i2));
                        if (i4 != dVar.i()) {
                            E(iArr[0], dVar.l(), 1, i4, dVar);
                        }
                        return i4;
                    }
                    dVar2 = dVar;
                    if (i3 == 1) {
                        return dVar2.i();
                    }
                    if (i3 == 3) {
                        return (int) ((((float) dVar2.l()) * dVar2.f4296L) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.i();
        }
        return 0;
    }

    public final int D(C0472d dVar, int i2) {
        C0472d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f4315c0;
            if (iArr[0] == 3) {
                int i3 = dVar.f4321j;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (dVar.f4326o * ((float) i2));
                        if (i4 != dVar.l()) {
                            E(1, i4, iArr[1], dVar.i(), dVar);
                        }
                        return i4;
                    }
                    dVar2 = dVar;
                    if (i3 == 1) {
                        return dVar2.l();
                    }
                    if (i3 == 3) {
                        return (int) ((((float) dVar2.i()) * dVar2.f4296L) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.l();
        }
        return 0;
    }

    public final void E(int i2, int i3, int i4, int i5, C0472d dVar) {
        C0481f fVar;
        boolean z2;
        C0472d dVar2;
        while (true) {
            fVar = this.f4391p0;
            if (fVar != null || (dVar2 = this.f4293I) == null) {
                C0475b bVar = this.f4390o0;
                bVar.f4440a = i2;
                bVar.b = i4;
                bVar.f4441c = i3;
                bVar.f4442d = i5;
                fVar.a(dVar, bVar);
                dVar.y(bVar.f4443e);
                dVar.v(bVar.f);
                dVar.f4334w = bVar.f4445h;
                int i6 = bVar.f4444g;
                dVar.f4300P = i6;
            } else {
                this.f4391p0 = ((C0473e) dVar2).f4340g0;
            }
        }
        C0475b bVar2 = this.f4390o0;
        bVar2.f4440a = i2;
        bVar2.b = i4;
        bVar2.f4441c = i3;
        bVar2.f4442d = i5;
        fVar.a(dVar, bVar2);
        dVar.y(bVar2.f4443e);
        dVar.v(bVar2.f);
        dVar.f4334w = bVar2.f4445h;
        int i62 = bVar2.f4444g;
        dVar.f4300P = i62;
        if (i62 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        dVar.f4334w = z2;
    }

    public final void a(e eVar) {
        boolean z2;
        boolean z3;
        C0472d dVar;
        int i2;
        super.a(eVar);
        C0472d dVar2 = this.f4293I;
        if (dVar2 != null) {
            z2 = ((C0473e) dVar2).f4341h0;
        } else {
            z2 = false;
        }
        int i3 = this.f4373G0;
        ArrayList arrayList = this.f4376J0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    f fVar = (f) arrayList.get(i4);
                    if (i4 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    fVar.b(i4, z2, z3);
                }
            } else if (!(i3 != 2 || this.f4379M0 == null || this.f4378L0 == null || this.f4377K0 == null)) {
                for (int i5 = 0; i5 < this.f4381O0; i5++) {
                    this.f4380N0[i5].t();
                }
                int[] iArr = this.f4379M0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                C0472d dVar3 = null;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (z2) {
                        i2 = (i6 - i8) - 1;
                    } else {
                        i2 = i8;
                    }
                    C0472d dVar4 = this.f4378L0[i2];
                    if (!(dVar4 == null || dVar4.f4306V == 8)) {
                        C0471c cVar = dVar4.f4335x;
                        if (i8 == 0) {
                            dVar4.e(cVar, this.f4335x, this.f4386j0);
                            dVar4.f4308X = this.f4392q0;
                            dVar4.f4303S = this.f4398w0;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.e(dVar4.f4337z, this.f4337z, this.f4387k0);
                        }
                        if (i8 > 0) {
                            dVar4.e(cVar, dVar3.f4337z, this.f4369C0);
                            dVar3.e(dVar3.f4337z, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    C0472d dVar5 = this.f4377K0[i9];
                    if (!(dVar5 == null || dVar5.f4306V == 8)) {
                        C0471c cVar2 = dVar5.f4336y;
                        if (i9 == 0) {
                            dVar5.e(cVar2, this.f4336y, this.f4382f0);
                            dVar5.f4309Y = this.f4393r0;
                            dVar5.f4304T = this.f4399x0;
                        }
                        if (i9 == i7 - 1) {
                            dVar5.e(dVar5.f4286A, this.f4286A, this.f4383g0);
                        }
                        if (i9 > 0) {
                            dVar5.e(cVar2, dVar3.f4286A, this.f4370D0);
                            dVar3.e(dVar3.f4286A, cVar2, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f4375I0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        C0472d[] dVarArr = this.f4380N0;
                        if (!(i12 >= dVarArr.length || (dVar = dVarArr[i12]) == null || dVar.f4306V == 8)) {
                            C0472d dVar6 = this.f4378L0[i10];
                            C0472d dVar7 = this.f4377K0[i11];
                            if (dVar != dVar6) {
                                dVar.e(dVar.f4335x, dVar6.f4335x, 0);
                                dVar.e(dVar.f4337z, dVar6.f4337z, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.e(dVar.f4336y, dVar7.f4336y, 0);
                                dVar.e(dVar.f4286A, dVar7.f4286A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z2, true);
        }
        this.f4388l0 = false;
    }
}

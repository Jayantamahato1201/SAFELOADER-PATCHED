package r;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f4351a;
    public C0472d b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f4352c = 0;

    /* renamed from: d  reason: collision with root package name */
    public C0471c f4353d;

    /* renamed from: e  reason: collision with root package name */
    public C0471c f4354e;
    public C0471c f;

    /* renamed from: g  reason: collision with root package name */
    public C0471c f4355g;

    /* renamed from: h  reason: collision with root package name */
    public int f4356h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4357i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4358j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4359k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4360l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f4361m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f4362n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f4363o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f4364p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f4365q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f4366r;

    public f(g gVar, int i2, C0471c cVar, C0471c cVar2, C0471c cVar3, C0471c cVar4, int i3) {
        this.f4366r = gVar;
        this.f4351a = i2;
        this.f4353d = cVar;
        this.f4354e = cVar2;
        this.f = cVar3;
        this.f4355g = cVar4;
        this.f4356h = gVar.f4386j0;
        this.f4357i = gVar.f4382f0;
        this.f4358j = gVar.f4387k0;
        this.f4359k = gVar.f4383g0;
        this.f4365q = i3;
    }

    public final void a(C0472d dVar) {
        int i2 = this.f4351a;
        int i3 = 0;
        g gVar = this.f4366r;
        if (i2 == 0) {
            int D = gVar.D(dVar, this.f4365q);
            if (dVar.f4315c0[0] == 3) {
                this.f4364p++;
                D = 0;
            }
            int i4 = gVar.f4369C0;
            if (dVar.f4306V != 8) {
                i3 = i4;
            }
            this.f4360l = D + i3 + this.f4360l;
            int C2 = gVar.C(dVar, this.f4365q);
            if (this.b == null || this.f4352c < C2) {
                this.b = dVar;
                this.f4352c = C2;
                this.f4361m = C2;
            }
        } else {
            int D2 = gVar.D(dVar, this.f4365q);
            int C3 = gVar.C(dVar, this.f4365q);
            if (dVar.f4315c0[1] == 3) {
                this.f4364p++;
                C3 = 0;
            }
            int i5 = gVar.f4370D0;
            if (dVar.f4306V != 8) {
                i3 = i5;
            }
            this.f4361m = C3 + i3 + this.f4361m;
            if (this.b == null || this.f4352c < D2) {
                this.b = dVar;
                this.f4352c = D2;
                this.f4360l = D2;
            }
        }
        this.f4363o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f4363o
            r2 = 0
            r3 = 0
        L_0x0006:
            r.g r4 = r0.f4366r
            if (r3 >= r1) goto L_0x001e
            int r5 = r0.f4362n
            int r5 = r5 + r3
            int r6 = r4.f4381O0
            if (r5 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            r.d[] r4 = r4.f4380N0
            r4 = r4[r5]
            if (r4 == 0) goto L_0x001b
            r4.t()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02ae
            r.d r3 = r0.b
            if (r3 != 0) goto L_0x0026
            goto L_0x02ae
        L_0x0026:
            if (r21 == 0) goto L_0x002c
            if (r19 != 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = -1
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0031:
            if (r7 >= r1) goto L_0x0051
            if (r20 == 0) goto L_0x0039
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003a
        L_0x0039:
            r10 = r7
        L_0x003a:
            int r11 = r0.f4362n
            int r11 = r11 + r10
            int r10 = r4.f4381O0
            if (r11 < r10) goto L_0x0042
            goto L_0x0051
        L_0x0042:
            r.d[] r10 = r4.f4380N0
            r10 = r10[r11]
            int r10 = r10.f4306V
            if (r10 != 0) goto L_0x004e
            if (r8 != r6) goto L_0x004d
            r8 = r7
        L_0x004d:
            r9 = r7
        L_0x004e:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0051:
            int r7 = r0.f4351a
            if (r7 != 0) goto L_0x0186
            r.d r7 = r0.b
            int r11 = r4.f4393r0
            r7.f4309Y = r11
            int r11 = r0.f4357i
            if (r19 <= 0) goto L_0x0062
            int r12 = r4.f4370D0
            int r11 = r11 + r12
        L_0x0062:
            r.c r12 = r0.f4354e
            r.c r13 = r7.f4336y
            r13.a(r12, r11)
            r.c r11 = r7.f4286A
            if (r21 == 0) goto L_0x0074
            r.c r12 = r0.f4355g
            int r14 = r0.f4359k
            r11.a(r12, r14)
        L_0x0074:
            if (r19 <= 0) goto L_0x007f
            r.c r12 = r0.f4354e
            r.d r12 = r12.b
            r.c r12 = r12.f4286A
            r12.a(r13, r2)
        L_0x007f:
            int r12 = r4.f4372F0
            r14 = 3
            if (r12 != r14) goto L_0x00a6
            boolean r12 = r7.f4334w
            if (r12 != 0) goto L_0x00a6
            r12 = 0
        L_0x0089:
            if (r12 >= r1) goto L_0x00a6
            if (r20 == 0) goto L_0x0091
            int r15 = r1 + -1
            int r15 = r15 - r12
            goto L_0x0092
        L_0x0091:
            r15 = r12
        L_0x0092:
            int r10 = r0.f4362n
            int r10 = r10 + r15
            int r15 = r4.f4381O0
            if (r10 < r15) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            r.d[] r15 = r4.f4380N0
            r10 = r15[r10]
            boolean r15 = r10.f4334w
            if (r15 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            int r12 = r12 + 1
            goto L_0x0089
        L_0x00a6:
            r10 = r7
        L_0x00a7:
            r12 = 0
            r15 = 0
        L_0x00a9:
            if (r15 >= r1) goto L_0x02ae
            if (r20 == 0) goto L_0x00b4
            int r16 = r1 + -1
            int r16 = r16 - r15
        L_0x00b1:
            r17 = 1
            goto L_0x00b7
        L_0x00b4:
            r16 = r15
            goto L_0x00b1
        L_0x00b7:
            int r3 = r0.f4362n
            int r3 = r3 + r16
            int r14 = r4.f4381O0
            if (r3 < r14) goto L_0x00c1
            goto L_0x02ae
        L_0x00c1:
            r.d[] r14 = r4.f4380N0
            r3 = r14[r3]
            if (r15 != 0) goto L_0x00d0
            r.c r14 = r3.f4335x
            r.c r2 = r0.f4353d
            int r6 = r0.f4356h
            r3.e(r14, r2, r6)
        L_0x00d0:
            if (r16 != 0) goto L_0x00f7
            int r2 = r4.f4392q0
            float r6 = r4.f4398w0
            int r14 = r0.f4362n
            if (r14 != 0) goto L_0x00e5
            int r14 = r4.f4394s0
            r16 = r2
            r2 = -1
            if (r14 == r2) goto L_0x00e8
            float r6 = r4.f4400y0
        L_0x00e3:
            r2 = r14
            goto L_0x00f3
        L_0x00e5:
            r16 = r2
            r2 = -1
        L_0x00e8:
            if (r21 == 0) goto L_0x00f1
            int r14 = r4.f4396u0
            if (r14 == r2) goto L_0x00f1
            float r6 = r4.f4367A0
            goto L_0x00e3
        L_0x00f1:
            r2 = r16
        L_0x00f3:
            r3.f4308X = r2
            r3.f4303S = r6
        L_0x00f7:
            int r2 = r1 + -1
            if (r15 != r2) goto L_0x0104
            r.c r2 = r3.f4337z
            r.c r6 = r0.f
            int r14 = r0.f4358j
            r3.e(r2, r6, r14)
        L_0x0104:
            if (r12 == 0) goto L_0x012f
            r.c r2 = r3.f4335x
            int r6 = r4.f4369C0
            r.c r12 = r12.f4337z
            r2.a(r12, r6)
            r.c r2 = r3.f4335x
            if (r15 != r8) goto L_0x011d
            int r6 = r0.f4356h
            boolean r14 = r2.f()
            if (r14 == 0) goto L_0x011d
            r2.f = r6
        L_0x011d:
            r6 = 0
            r12.a(r2, r6)
            int r2 = r9 + 1
            if (r15 != r2) goto L_0x012f
            int r2 = r0.f4358j
            boolean r6 = r12.f()
            if (r6 == 0) goto L_0x012f
            r12.f = r2
        L_0x012f:
            if (r3 == r7) goto L_0x017d
            int r2 = r4.f4372F0
            r6 = 3
            if (r2 != r6) goto L_0x0149
            boolean r12 = r10.f4334w
            if (r12 == 0) goto L_0x0149
            if (r3 == r10) goto L_0x0149
            boolean r12 = r3.f4334w
            if (r12 == 0) goto L_0x0149
            r.c r2 = r3.f4287B
            r.c r12 = r10.f4287B
            r14 = 0
            r2.a(r12, r14)
            goto L_0x017e
        L_0x0149:
            if (r2 == 0) goto L_0x0176
            r12 = 1
            if (r2 == r12) goto L_0x016f
            if (r5 == 0) goto L_0x0163
            r.c r2 = r3.f4336y
            r.c r12 = r0.f4354e
            int r14 = r0.f4357i
            r2.a(r12, r14)
            r.c r2 = r0.f4355g
            int r12 = r0.f4359k
            r.c r14 = r3.f4286A
            r14.a(r2, r12)
            goto L_0x017e
        L_0x0163:
            r.c r2 = r3.f4336y
            r14 = 0
            r2.a(r13, r14)
            r.c r2 = r3.f4286A
            r2.a(r11, r14)
            goto L_0x017e
        L_0x016f:
            r14 = 0
            r.c r2 = r3.f4286A
            r2.a(r11, r14)
            goto L_0x017e
        L_0x0176:
            r14 = 0
            r.c r2 = r3.f4336y
            r2.a(r13, r14)
            goto L_0x017e
        L_0x017d:
            r6 = 3
        L_0x017e:
            int r15 = r15 + 1
            r12 = r3
            r2 = 0
            r6 = -1
            r14 = 3
            goto L_0x00a9
        L_0x0186:
            r.d r2 = r0.b
            int r3 = r4.f4392q0
            r2.f4308X = r3
            int r3 = r0.f4356h
            if (r19 <= 0) goto L_0x0193
            int r6 = r4.f4369C0
            int r3 = r3 + r6
        L_0x0193:
            r.c r6 = r2.f4335x
            r.c r7 = r2.f4337z
            if (r20 == 0) goto L_0x01b4
            r.c r10 = r0.f
            r7.a(r10, r3)
            if (r21 == 0) goto L_0x01a7
            r.c r3 = r0.f4353d
            int r10 = r0.f4358j
            r6.a(r3, r10)
        L_0x01a7:
            if (r19 <= 0) goto L_0x01ce
            r.c r3 = r0.f
            r.d r3 = r3.b
            r.c r3 = r3.f4335x
            r14 = 0
            r3.a(r7, r14)
            goto L_0x01ce
        L_0x01b4:
            r.c r10 = r0.f4353d
            r6.a(r10, r3)
            if (r21 == 0) goto L_0x01c2
            r.c r3 = r0.f
            int r10 = r0.f4358j
            r7.a(r3, r10)
        L_0x01c2:
            if (r19 <= 0) goto L_0x01ce
            r.c r3 = r0.f4353d
            r.d r3 = r3.b
            r.c r3 = r3.f4337z
            r14 = 0
            r3.a(r6, r14)
        L_0x01ce:
            r3 = 0
            r10 = 0
        L_0x01d0:
            if (r3 >= r1) goto L_0x02ae
            int r11 = r0.f4362n
            int r11 = r11 + r3
            int r12 = r4.f4381O0
            if (r11 < r12) goto L_0x01db
            goto L_0x02ae
        L_0x01db:
            r.d[] r12 = r4.f4380N0
            r11 = r12[r11]
            if (r3 != 0) goto L_0x020a
            r.c r12 = r11.f4336y
            r.c r13 = r0.f4354e
            int r14 = r0.f4357i
            r11.e(r12, r13, r14)
            int r12 = r4.f4393r0
            float r13 = r4.f4399x0
            int r14 = r0.f4362n
            if (r14 != 0) goto L_0x01fb
            int r14 = r4.f4395t0
            r15 = -1
            if (r14 == r15) goto L_0x01fc
            float r13 = r4.z0
        L_0x01f9:
            r12 = r14
            goto L_0x0205
        L_0x01fb:
            r15 = -1
        L_0x01fc:
            if (r21 == 0) goto L_0x0205
            int r14 = r4.f4397v0
            if (r14 == r15) goto L_0x0205
            float r13 = r4.f4368B0
            goto L_0x01f9
        L_0x0205:
            r11.f4309Y = r12
            r11.f4304T = r13
            goto L_0x020b
        L_0x020a:
            r15 = -1
        L_0x020b:
            int r12 = r1 + -1
            if (r3 != r12) goto L_0x0218
            r.c r12 = r11.f4286A
            r.c r13 = r0.f4355g
            int r14 = r0.f4359k
            r11.e(r12, r13, r14)
        L_0x0218:
            if (r10 == 0) goto L_0x0245
            r.c r12 = r11.f4336y
            int r13 = r4.f4370D0
            r.c r10 = r10.f4286A
            r12.a(r10, r13)
            r.c r12 = r11.f4336y
            if (r3 != r8) goto L_0x0231
            int r13 = r0.f4357i
            boolean r14 = r12.f()
            if (r14 == 0) goto L_0x0231
            r12.f = r13
        L_0x0231:
            r14 = 0
            r10.a(r12, r14)
            r17 = 1
            int r12 = r9 + 1
            if (r3 != r12) goto L_0x0245
            int r12 = r0.f4359k
            boolean r13 = r10.f()
            if (r13 == 0) goto L_0x0245
            r10.f = r12
        L_0x0245:
            if (r11 == r2) goto L_0x026d
            r10 = 2
            if (r20 == 0) goto L_0x0270
            int r12 = r4.f4371E0
            if (r12 == 0) goto L_0x0267
            r13 = 1
            if (r12 == r13) goto L_0x0260
            if (r12 == r10) goto L_0x0254
            goto L_0x026d
        L_0x0254:
            r.c r10 = r11.f4335x
            r14 = 0
            r10.a(r6, r14)
            r.c r10 = r11.f4337z
            r10.a(r7, r14)
            goto L_0x026d
        L_0x0260:
            r14 = 0
            r.c r10 = r11.f4335x
            r10.a(r6, r14)
            goto L_0x026d
        L_0x0267:
            r14 = 0
            r.c r10 = r11.f4337z
            r10.a(r7, r14)
        L_0x026d:
            r13 = 1
        L_0x026e:
            r14 = 0
            goto L_0x02a9
        L_0x0270:
            int r12 = r4.f4371E0
            if (r12 == 0) goto L_0x02a2
            r13 = 1
            if (r12 == r13) goto L_0x029b
            if (r12 == r10) goto L_0x027a
            goto L_0x026e
        L_0x027a:
            if (r5 == 0) goto L_0x028f
            r.c r10 = r11.f4335x
            r.c r12 = r0.f4353d
            int r14 = r0.f4356h
            r10.a(r12, r14)
            r.c r10 = r0.f
            int r12 = r0.f4358j
            r.c r14 = r11.f4337z
            r14.a(r10, r12)
            goto L_0x026e
        L_0x028f:
            r.c r10 = r11.f4335x
            r14 = 0
            r10.a(r6, r14)
            r.c r10 = r11.f4337z
            r10.a(r7, r14)
            goto L_0x02a9
        L_0x029b:
            r14 = 0
            r.c r10 = r11.f4337z
            r10.a(r7, r14)
            goto L_0x02a9
        L_0x02a2:
            r13 = 1
            r14 = 0
            r.c r10 = r11.f4335x
            r10.a(r6, r14)
        L_0x02a9:
            int r3 = r3 + 1
            r10 = r11
            goto L_0x01d0
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.b(int, boolean, boolean):void");
    }

    public final int c() {
        if (this.f4351a == 1) {
            return this.f4361m - this.f4366r.f4370D0;
        }
        return this.f4361m;
    }

    public final int d() {
        if (this.f4351a == 0) {
            return this.f4360l - this.f4366r.f4369C0;
        }
        return this.f4360l;
    }

    public final void e(int i2) {
        g gVar;
        int i3;
        int i4 = this.f4364p;
        if (i4 != 0) {
            int i5 = this.f4363o;
            int i6 = i2 / i4;
            int i7 = 0;
            while (true) {
                gVar = this.f4366r;
                if (i7 >= i5 || (i3 = this.f4362n + i7) >= gVar.f4381O0) {
                    this.f4360l = 0;
                    this.f4361m = 0;
                    this.b = null;
                    this.f4352c = 0;
                    int i8 = this.f4363o;
                    int i9 = 0;
                } else {
                    C0472d dVar = gVar.f4380N0[i3];
                    if (this.f4351a == 0) {
                        if (dVar != null) {
                            int[] iArr = dVar.f4315c0;
                            if (iArr[0] == 3 && dVar.f4321j == 0) {
                                gVar.E(1, i6, iArr[1], dVar.i(), dVar);
                            }
                        }
                    } else if (dVar != null) {
                        int[] iArr2 = dVar.f4315c0;
                        if (iArr2[1] == 3 && dVar.f4322k == 0) {
                            int i10 = iArr2[0];
                            int i11 = i6;
                            gVar.E(i10, dVar.l(), 1, i11, dVar);
                            i6 = i11;
                        }
                    }
                    i7++;
                }
            }
            this.f4360l = 0;
            this.f4361m = 0;
            this.b = null;
            this.f4352c = 0;
            int i82 = this.f4363o;
            int i92 = 0;
            while (i92 < i82) {
                int i12 = this.f4362n + i92;
                if (i12 < gVar.f4381O0) {
                    C0472d dVar2 = gVar.f4380N0[i12];
                    if (this.f4351a == 0) {
                        int l2 = dVar2.l();
                        int i13 = gVar.f4369C0;
                        if (dVar2.f4306V == 8) {
                            i13 = 0;
                        }
                        this.f4360l = l2 + i13 + this.f4360l;
                        int C2 = gVar.C(dVar2, this.f4365q);
                        if (this.b == null || this.f4352c < C2) {
                            this.b = dVar2;
                            this.f4352c = C2;
                            this.f4361m = C2;
                        }
                    } else {
                        int D = gVar.D(dVar2, this.f4365q);
                        int C3 = gVar.C(dVar2, this.f4365q);
                        int i14 = gVar.f4370D0;
                        if (dVar2.f4306V == 8) {
                            i14 = 0;
                        }
                        this.f4361m = C3 + i14 + this.f4361m;
                        if (this.b == null || this.f4352c < D) {
                            this.b = dVar2;
                            this.f4352c = D;
                            this.f4360l = D;
                        }
                    }
                    i92++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, C0471c cVar, C0471c cVar2, C0471c cVar3, C0471c cVar4, int i3, int i4, int i5, int i6, int i7) {
        this.f4351a = i2;
        this.f4353d = cVar;
        this.f4354e = cVar2;
        this.f = cVar3;
        this.f4355g = cVar4;
        this.f4356h = i3;
        this.f4357i = i4;
        this.f4358j = i5;
        this.f4359k = i6;
        this.f4365q = i7;
    }
}

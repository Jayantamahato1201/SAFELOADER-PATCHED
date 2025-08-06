package s;

import q.h;
import r.C0472d;

public final class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f4469k;

    /* renamed from: l  reason: collision with root package name */
    public C0474a f4470l;

    public final void a(d dVar) {
        int i2;
        float f;
        float f2;
        float f3;
        if (h.b(this.f4478j) != 3) {
            g gVar = this.f4474e;
            if (gVar.f4457c && !gVar.f4463j && this.f4473d == 3) {
                C0472d dVar2 = this.b;
                int i3 = dVar2.f4322k;
                if (i3 == 2) {
                    C0472d dVar3 = dVar2.f4293I;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.f4317e.f4474e;
                        if (gVar2.f4463j) {
                            gVar.d((int) ((((float) gVar2.f4460g) * dVar2.f4329r) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    g gVar3 = dVar2.f4316d.f4474e;
                    if (gVar3.f4463j) {
                        int i4 = dVar2.f4297M;
                        if (i4 == -1) {
                            f = (float) gVar3.f4460g;
                            f2 = dVar2.f4296L;
                        } else if (i4 == 0) {
                            f3 = ((float) gVar3.f4460g) * dVar2.f4296L;
                            i2 = (int) (f3 + 0.5f);
                            gVar.d(i2);
                        } else if (i4 != 1) {
                            i2 = 0;
                            gVar.d(i2);
                        } else {
                            f = (float) gVar3.f4460g;
                            f2 = dVar2.f4296L;
                        }
                        f3 = f / f2;
                        i2 = (int) (f3 + 0.5f);
                        gVar.d(i2);
                    }
                }
            }
            f fVar = this.f4476h;
            if (fVar.f4457c) {
                f fVar2 = this.f4477i;
                if (fVar2.f4457c) {
                    if (!fVar.f4463j || !fVar2.f4463j || !gVar.f4463j) {
                        if (!gVar.f4463j && this.f4473d == 3) {
                            C0472d dVar4 = this.b;
                            if (dVar4.f4321j == 0 && !dVar4.r()) {
                                int i5 = ((f) fVar.f4465l.get(0)).f4460g + fVar.f;
                                int i6 = ((f) fVar2.f4465l.get(0)).f4460g + fVar2.f;
                                fVar.d(i5);
                                fVar2.d(i6);
                                gVar.d(i6 - i5);
                                return;
                            }
                        }
                        if (!gVar.f4463j && this.f4473d == 3 && this.f4471a == 1 && fVar.f4465l.size() > 0 && fVar2.f4465l.size() > 0) {
                            int i7 = (((f) fVar2.f4465l.get(0)).f4460g + fVar2.f) - (((f) fVar.f4465l.get(0)).f4460g + fVar.f);
                            int i8 = gVar.f4466m;
                            if (i7 < i8) {
                                gVar.d(i7);
                            } else {
                                gVar.d(i8);
                            }
                        }
                        if (gVar.f4463j && fVar.f4465l.size() > 0 && fVar2.f4465l.size() > 0) {
                            f fVar3 = (f) fVar.f4465l.get(0);
                            f fVar4 = (f) fVar2.f4465l.get(0);
                            int i9 = fVar3.f4460g;
                            int i10 = fVar.f + i9;
                            int i11 = fVar4.f4460g;
                            int i12 = fVar2.f + i11;
                            float f4 = this.b.f4304T;
                            if (fVar3 == fVar4) {
                                f4 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            fVar.d((int) ((((float) ((i11 - i9) - gVar.f4460g)) * f4) + ((float) i9) + 0.5f));
                            fVar2.d(fVar.f4460g + gVar.f4460g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0472d dVar5 = this.b;
        l(dVar5.f4336y, dVar5.f4286A, 1);
    }

    /* JADX WARNING: type inference failed for: r0v123, types: [s.a, s.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r0 = r14.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            r.d r0 = r14.b
            boolean r1 = r0.f4311a
            s.g r2 = r14.f4474e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.i()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f4463j
            s.f r1 = r14.f4477i
            s.f r3 = r14.f4476h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0082
            r.d r0 = r14.b
            int[] r7 = r0.f4315c0
            r7 = r7[r5]
            r14.f4473d = r7
            boolean r0 = r0.f4334w
            if (r0 == 0) goto L_0x002d
            s.a r0 = new s.a
            r0.<init>(r14)
            r14.f4470l = r0
        L_0x002d:
            int r0 = r14.f4473d
            if (r0 == r4) goto L_0x00ae
            if (r0 != r6) goto L_0x0076
            r.d r7 = r14.b
            r.d r7 = r7.f4293I
            if (r7 == 0) goto L_0x0076
            int[] r8 = r7.f4315c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0076
            int r0 = r7.i()
            r.d r4 = r14.b
            r.c r4 = r4.f4336y
            int r4 = r4.c()
            int r0 = r0 - r4
            r.d r4 = r14.b
            r.c r4 = r4.f4286A
            int r4 = r4.c()
            int r0 = r0 - r4
            s.l r4 = r7.f4317e
            s.f r5 = r4.f4476h
            r.d r6 = r14.b
            r.c r6 = r6.f4336y
            int r6 = r6.c()
            s.m.b(r3, r5, r6)
            s.f r3 = r4.f4477i
            r.d r4 = r14.b
            r.c r4 = r4.f4286A
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0076:
            if (r0 != r5) goto L_0x00ae
            r.d r0 = r14.b
            int r0 = r0.i()
            r2.d(r0)
            goto L_0x00ae
        L_0x0082:
            int r0 = r14.f4473d
            if (r0 != r6) goto L_0x00ae
            r.d r0 = r14.b
            r.d r7 = r0.f4293I
            if (r7 == 0) goto L_0x00ae
            int[] r8 = r7.f4315c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00ae
            s.l r2 = r7.f4317e
            s.f r4 = r2.f4476h
            r.c r0 = r0.f4336y
            int r0 = r0.c()
            s.m.b(r3, r4, r0)
            s.f r0 = r2.f4477i
            r.d r2 = r14.b
            r.c r2 = r2.f4286A
            int r2 = r2.c()
            int r2 = -r2
            s.m.b(r1, r0, r2)
            return
        L_0x00ae:
            boolean r0 = r2.f4463j
            s.f r7 = r14.f4469k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01cd
            r.d r10 = r14.b
            boolean r11 = r10.f4311a
            if (r11 == 0) goto L_0x01cd
            r.c[] r0 = r10.f4290F
            r11 = r0[r9]
            r.c r12 = r11.f4283d
            if (r12 == 0) goto L_0x012d
            r13 = r0[r4]
            r.c r13 = r13.f4283d
            if (r13 == 0) goto L_0x012d
            boolean r0 = r10.r()
            if (r0 == 0) goto L_0x00ea
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f = r0
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f = r0
            goto L_0x0121
        L_0x00ea:
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r9]
            s.f r0 = s.m.h(r0)
            if (r0 == 0) goto L_0x0103
            r.d r2 = r14.b
            r.c[] r2 = r2.f4290F
            r2 = r2[r9]
            int r2 = r2.c()
            s.m.b(r3, r0, r2)
        L_0x0103:
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            s.f r0 = s.m.h(r0)
            if (r0 == 0) goto L_0x011d
            r.d r2 = r14.b
            r.c[] r2 = r2.f4290F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            s.m.b(r1, r0, r2)
        L_0x011d:
            r3.b = r5
            r1.b = r5
        L_0x0121:
            r.d r0 = r14.b
            boolean r1 = r0.f4334w
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f4300P
            s.m.b(r7, r3, r0)
            return
        L_0x012d:
            if (r12 == 0) goto L_0x0153
            s.f r0 = s.m.h(r11)
            if (r0 == 0) goto L_0x035f
            r.d r4 = r14.b
            r.c[] r4 = r4.f4290F
            r4 = r4[r9]
            int r4 = r4.c()
            s.m.b(r3, r0, r4)
            int r0 = r2.f4460g
            s.m.b(r1, r3, r0)
            r.d r0 = r14.b
            boolean r1 = r0.f4334w
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f4300P
            s.m.b(r7, r3, r0)
            return
        L_0x0153:
            r5 = r0[r4]
            r.c r9 = r5.f4283d
            if (r9 == 0) goto L_0x017f
            s.f r0 = s.m.h(r5)
            if (r0 == 0) goto L_0x0173
            r.d r5 = r14.b
            r.c[] r5 = r5.f4290F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r0, r4)
            int r0 = r2.f4460g
            int r0 = -r0
            s.m.b(r3, r1, r0)
        L_0x0173:
            r.d r0 = r14.b
            boolean r1 = r0.f4334w
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f4300P
            s.m.b(r7, r3, r0)
            return
        L_0x017f:
            r0 = r0[r6]
            r.c r4 = r0.f4283d
            if (r4 == 0) goto L_0x019c
            s.f r0 = s.m.h(r0)
            if (r0 == 0) goto L_0x035f
            s.m.b(r7, r0, r8)
            r.d r0 = r14.b
            int r0 = r0.f4300P
            int r0 = -r0
            s.m.b(r3, r7, r0)
            int r0 = r2.f4460g
            s.m.b(r1, r3, r0)
            return
        L_0x019c:
            boolean r0 = r10 instanceof r.i
            if (r0 != 0) goto L_0x035f
            r.d r0 = r10.f4293I
            if (r0 == 0) goto L_0x035f
            r0 = 7
            r.c r0 = r10.g(r0)
            r.c r0 = r0.f4283d
            if (r0 != 0) goto L_0x035f
            r.d r0 = r14.b
            r.d r4 = r0.f4293I
            s.l r4 = r4.f4317e
            s.f r4 = r4.f4476h
            int r0 = r0.n()
            s.m.b(r3, r4, r0)
            int r0 = r2.f4460g
            s.m.b(r1, r3, r0)
            r.d r0 = r14.b
            boolean r1 = r0.f4334w
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f4300P
            s.m.b(r7, r3, r0)
            return
        L_0x01cd:
            if (r0 != 0) goto L_0x0224
            int r0 = r14.f4473d
            if (r0 != r4) goto L_0x0224
            r.d r0 = r14.b
            int r10 = r0.f4322k
            if (r10 == r9) goto L_0x0204
            if (r10 == r4) goto L_0x01dc
            goto L_0x0227
        L_0x01dc:
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0227
            r.d r0 = r14.b
            int r10 = r0.f4321j
            if (r10 != r4) goto L_0x01e9
            goto L_0x0227
        L_0x01e9:
            s.j r0 = r0.f4316d
            s.g r0 = r0.f4474e
            java.util.ArrayList r10 = r2.f4465l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r1)
            goto L_0x0227
        L_0x0204:
            r.d r0 = r0.f4293I
            if (r0 != 0) goto L_0x0209
            goto L_0x0227
        L_0x0209:
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r10 = r2.f4465l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r1)
            goto L_0x0227
        L_0x0224:
            r2.b(r14)
        L_0x0227:
            r.d r0 = r14.b
            r.c[] r10 = r0.f4290F
            r11 = r10[r9]
            r.c r12 = r11.f4283d
            if (r12 == 0) goto L_0x0280
            r13 = r10[r4]
            r.c r13 = r13.f4283d
            if (r13 == 0) goto L_0x0280
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0257
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f = r0
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f = r0
            goto L_0x0273
        L_0x0257:
            r.d r0 = r14.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r9]
            s.f r0 = s.m.h(r0)
            r.d r1 = r14.b
            r.c[] r1 = r1.f4290F
            r1 = r1[r4]
            s.f r1 = s.m.h(r1)
            r0.b(r14)
            r1.b(r14)
            r14.f4478j = r6
        L_0x0273:
            r.d r0 = r14.b
            boolean r0 = r0.f4334w
            if (r0 == 0) goto L_0x0355
            s.a r0 = r14.f4470l
            r14.c(r7, r3, r5, r0)
            goto L_0x0355
        L_0x0280:
            r13 = 0
            if (r12 == 0) goto L_0x02cc
            s.f r0 = s.m.h(r11)
            if (r0 == 0) goto L_0x0355
            r.d r6 = r14.b
            r.c[] r6 = r6.f4290F
            r6 = r6[r9]
            int r6 = r6.c()
            s.m.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            r.d r0 = r14.b
            boolean r0 = r0.f4334w
            if (r0 == 0) goto L_0x02a4
            s.a r0 = r14.f4470l
            r14.c(r7, r3, r5, r0)
        L_0x02a4:
            int r0 = r14.f4473d
            if (r0 != r4) goto L_0x0355
            r.d r0 = r14.b
            float r1 = r0.f4296L
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0355
            s.j r0 = r0.f4316d
            int r1 = r0.f4473d
            if (r1 != r4) goto L_0x0355
            s.g r0 = r0.f4474e
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4465l
            r.d r1 = r14.b
            s.j r1 = r1.f4316d
            s.g r1 = r1.f4474e
            r0.add(r1)
            r2.f4456a = r14
            goto L_0x0355
        L_0x02cc:
            r9 = r10[r4]
            r.c r11 = r9.f4283d
            r12 = -1
            if (r11 == 0) goto L_0x02f6
            s.f r0 = s.m.h(r9)
            if (r0 == 0) goto L_0x0355
            r.d r6 = r14.b
            r.c[] r6 = r6.f4290F
            r4 = r6[r4]
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            r.d r0 = r14.b
            boolean r0 = r0.f4334w
            if (r0 == 0) goto L_0x0355
            s.a r0 = r14.f4470l
            r14.c(r7, r3, r5, r0)
            goto L_0x0355
        L_0x02f6:
            r6 = r10[r6]
            r.c r9 = r6.f4283d
            if (r9 == 0) goto L_0x030e
            s.f r0 = s.m.h(r6)
            if (r0 == 0) goto L_0x0355
            s.m.b(r7, r0, r8)
            s.a r0 = r14.f4470l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0355
        L_0x030e:
            boolean r6 = r0 instanceof r.i
            if (r6 != 0) goto L_0x0355
            r.d r6 = r0.f4293I
            if (r6 == 0) goto L_0x0355
            s.l r6 = r6.f4317e
            s.f r6 = r6.f4476h
            int r0 = r0.n()
            s.m.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            r.d r0 = r14.b
            boolean r0 = r0.f4334w
            if (r0 == 0) goto L_0x032f
            s.a r0 = r14.f4470l
            r14.c(r7, r3, r5, r0)
        L_0x032f:
            int r0 = r14.f4473d
            if (r0 != r4) goto L_0x0355
            r.d r0 = r14.b
            float r1 = r0.f4296L
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0355
            s.j r0 = r0.f4316d
            int r1 = r0.f4473d
            if (r1 != r4) goto L_0x0355
            s.g r0 = r0.f4474e
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4465l
            r.d r1 = r14.b
            s.j r1 = r1.f4316d
            s.g r1 = r1.f4474e
            r0.add(r1)
            r2.f4456a = r14
        L_0x0355:
            java.util.ArrayList r0 = r2.f4465l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x035f
            r2.f4457c = r5
        L_0x035f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.l.d():void");
    }

    public final void e() {
        f fVar = this.f4476h;
        if (fVar.f4463j) {
            this.b.f4299O = fVar.f4460g;
        }
    }

    public final void f() {
        this.f4472c = null;
        this.f4476h.c();
        this.f4477i.c();
        this.f4469k.c();
        this.f4474e.c();
        this.f4475g = false;
    }

    public final boolean k() {
        if (this.f4473d != 3 || this.b.f4322k == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f4475g = false;
        f fVar = this.f4476h;
        fVar.c();
        fVar.f4463j = false;
        f fVar2 = this.f4477i;
        fVar2.c();
        fVar2.f4463j = false;
        f fVar3 = this.f4469k;
        fVar3.c();
        fVar3.f4463j = false;
        this.f4474e.f4463j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.f4307W;
    }
}

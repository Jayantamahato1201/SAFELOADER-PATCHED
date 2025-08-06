package s;

public final class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4467k = new int[2];

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f) + 0.5f);
            int i10 = (int) ((((float) i7) / f) + 0.5f);
            if (i9 <= i7) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0246, code lost:
        if (r7 != 1) goto L_0x02aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(s.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f4478j
            int r1 = q.h.b(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x038e
            s.g r1 = r0.f4474e
            boolean r4 = r1.f4463j
            s.f r5 = r0.f4476h
            s.f r6 = r0.f4477i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x0026
            int r4 = r0.f4473d
            if (r4 != r3) goto L_0x0026
            r.d r4 = r0.b
            int r9 = r4.f4321j
            r10 = 2
            if (r9 == r10) goto L_0x028f
            if (r9 == r3) goto L_0x002a
        L_0x0026:
            r24 = 1056964608(0x3f000000, float:0.5)
            goto L_0x02aa
        L_0x002a:
            int r9 = r4.f4322k
            r10 = -1
            if (r9 == 0) goto L_0x0063
            if (r9 != r3) goto L_0x0032
            goto L_0x0063
        L_0x0032:
            int r9 = r4.f4297M
            if (r9 == r10) goto L_0x0055
            if (r9 == 0) goto L_0x004a
            if (r9 == r8) goto L_0x003c
            r4 = 0
            goto L_0x005f
        L_0x003c:
            s.l r9 = r4.f4317e
            s.g r9 = r9.f4474e
            int r9 = r9.f4460g
            float r9 = (float) r9
            float r4 = r4.f4296L
        L_0x0045:
            float r9 = r9 * r4
        L_0x0047:
            float r9 = r9 + r7
            int r4 = (int) r9
            goto L_0x005f
        L_0x004a:
            s.l r9 = r4.f4317e
            s.g r9 = r9.f4474e
            int r9 = r9.f4460g
            float r9 = (float) r9
            float r4 = r4.f4296L
            float r9 = r9 / r4
            goto L_0x0047
        L_0x0055:
            s.l r9 = r4.f4317e
            s.g r9 = r9.f4474e
            int r9 = r9.f4460g
            float r9 = (float) r9
            float r4 = r4.f4296L
            goto L_0x0045
        L_0x005f:
            r1.d(r4)
            goto L_0x0026
        L_0x0063:
            s.l r9 = r4.f4317e
            s.f r11 = r9.f4476h
            s.f r9 = r9.f4477i
            r.c r12 = r4.f4335x
            r.c r12 = r12.f4283d
            if (r12 == 0) goto L_0x0071
            r12 = 1
            goto L_0x0072
        L_0x0071:
            r12 = 0
        L_0x0072:
            r.c r13 = r4.f4336y
            r.c r13 = r13.f4283d
            if (r13 == 0) goto L_0x007a
            r13 = 1
            goto L_0x007b
        L_0x007a:
            r13 = 0
        L_0x007b:
            r.c r14 = r4.f4337z
            r.c r14 = r14.f4283d
            if (r14 == 0) goto L_0x0083
            r14 = 1
            goto L_0x0084
        L_0x0083:
            r14 = 0
        L_0x0084:
            r.c r15 = r4.f4286A
            r.c r15 = r15.f4283d
            if (r15 == 0) goto L_0x008e
            r15 = 1
        L_0x008b:
            r24 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0090
        L_0x008e:
            r15 = 0
            goto L_0x008b
        L_0x0090:
            int r7 = r4.f4297M
            if (r12 == 0) goto L_0x019e
            if (r13 == 0) goto L_0x019e
            if (r14 == 0) goto L_0x019e
            if (r15 == 0) goto L_0x019e
            float r4 = r4.f4296L
            boolean r10 = r11.f4463j
            int[] r16 = f4467k
            if (r10 == 0) goto L_0x00f0
            boolean r10 = r9.f4463j
            if (r10 == 0) goto L_0x00f0
            boolean r3 = r5.f4457c
            if (r3 == 0) goto L_0x038d
            boolean r3 = r6.f4457c
            if (r3 != 0) goto L_0x00b0
            goto L_0x038d
        L_0x00b0:
            java.util.ArrayList r3 = r5.f4465l
            java.lang.Object r3 = r3.get(r2)
            s.f r3 = (s.f) r3
            int r3 = r3.f4460g
            int r5 = r5.f
            int r17 = r3 + r5
            java.util.ArrayList r3 = r6.f4465l
            java.lang.Object r3 = r3.get(r2)
            s.f r3 = (s.f) r3
            int r3 = r3.f4460g
            int r5 = r6.f
            int r18 = r3 - r5
            int r3 = r11.f4460g
            int r5 = r11.f
            int r19 = r3 + r5
            int r3 = r9.f4460g
            int r5 = r9.f
            int r20 = r3 - r5
            r21 = r4
            r22 = r7
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r16[r2]
            r1.d(r2)
            r.d r1 = r0.b
            s.l r1 = r1.f4317e
            s.g r1 = r1.f4474e
            r2 = r16[r8]
            r1.d(r2)
            return
        L_0x00f0:
            r21 = r4
            r22 = r7
            boolean r4 = r5.f4463j
            java.util.ArrayList r7 = r11.f4465l
            if (r4 == 0) goto L_0x0141
            boolean r4 = r6.f4463j
            if (r4 == 0) goto L_0x0141
            boolean r4 = r11.f4457c
            if (r4 == 0) goto L_0x038d
            boolean r4 = r9.f4457c
            if (r4 != 0) goto L_0x0108
            goto L_0x038d
        L_0x0108:
            int r4 = r5.f4460g
            int r10 = r5.f
            int r17 = r4 + r10
            int r4 = r6.f4460g
            int r10 = r6.f
            int r18 = r4 - r10
            java.lang.Object r4 = r7.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r10 = r11.f
            int r19 = r4 + r10
            java.util.ArrayList r4 = r9.f4465l
            java.lang.Object r4 = r4.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r10 = r9.f
            int r20 = r4 - r10
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r2]
            r1.d(r4)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r10 = r16[r8]
            r4.d(r10)
        L_0x0141:
            boolean r4 = r5.f4457c
            if (r4 == 0) goto L_0x038d
            boolean r4 = r6.f4457c
            if (r4 == 0) goto L_0x038d
            boolean r4 = r11.f4457c
            if (r4 == 0) goto L_0x038d
            boolean r4 = r9.f4457c
            if (r4 != 0) goto L_0x0153
            goto L_0x038d
        L_0x0153:
            java.util.ArrayList r4 = r5.f4465l
            java.lang.Object r4 = r4.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r10 = r5.f
            int r17 = r4 + r10
            java.util.ArrayList r4 = r6.f4465l
            java.lang.Object r4 = r4.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r10 = r6.f
            int r18 = r4 - r10
            java.lang.Object r4 = r7.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r7 = r11.f
            int r19 = r4 + r7
            java.util.ArrayList r4 = r9.f4465l
            java.lang.Object r4 = r4.get(r2)
            s.f r4 = (s.f) r4
            int r4 = r4.f4460g
            int r7 = r9.f
            int r20 = r4 - r7
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r2]
            r1.d(r4)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r7 = r16[r8]
            r4.d(r7)
            goto L_0x02aa
        L_0x019e:
            if (r12 == 0) goto L_0x0218
            if (r14 == 0) goto L_0x0218
            boolean r9 = r5.f4457c
            if (r9 == 0) goto L_0x038d
            boolean r9 = r6.f4457c
            if (r9 != 0) goto L_0x01ac
            goto L_0x038d
        L_0x01ac:
            float r4 = r4.f4296L
            java.util.ArrayList r9 = r5.f4465l
            java.lang.Object r9 = r9.get(r2)
            s.f r9 = (s.f) r9
            int r9 = r9.f4460g
            int r11 = r5.f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f4465l
            java.lang.Object r11 = r11.get(r2)
            s.f r11 = (s.f) r11
            int r11 = r11.f4460g
            int r12 = r6.f
            int r11 = r11 - r12
            if (r7 == r10) goto L_0x01f4
            if (r7 == 0) goto L_0x01f4
            if (r7 == r8) goto L_0x01d0
            goto L_0x02aa
        L_0x01d0:
            int r11 = r11 - r9
            int r7 = r0.g(r11, r2)
            float r9 = (float) r7
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e6
            float r7 = (float) r10
            float r7 = r7 * r4
            float r7 = r7 + r24
            int r7 = (int) r7
        L_0x01e6:
            r1.d(r7)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r4.d(r10)
            goto L_0x02aa
        L_0x01f4:
            int r11 = r11 - r9
            int r7 = r0.g(r11, r2)
            float r9 = (float) r7
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x020a
            float r7 = (float) r10
            float r7 = r7 / r4
            float r7 = r7 + r24
            int r7 = (int) r7
        L_0x020a:
            r1.d(r7)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r4.d(r10)
            goto L_0x02aa
        L_0x0218:
            if (r13 == 0) goto L_0x02aa
            if (r15 == 0) goto L_0x02aa
            boolean r12 = r11.f4457c
            if (r12 == 0) goto L_0x038d
            boolean r12 = r9.f4457c
            if (r12 != 0) goto L_0x0226
            goto L_0x038d
        L_0x0226:
            float r4 = r4.f4296L
            java.util.ArrayList r12 = r11.f4465l
            java.lang.Object r12 = r12.get(r2)
            s.f r12 = (s.f) r12
            int r12 = r12.f4460g
            int r11 = r11.f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f4465l
            java.lang.Object r11 = r11.get(r2)
            s.f r11 = (s.f) r11
            int r11 = r11.f4460g
            int r9 = r9.f
            int r11 = r11 - r9
            if (r7 == r10) goto L_0x026c
            if (r7 == 0) goto L_0x0249
            if (r7 == r8) goto L_0x026c
            goto L_0x02aa
        L_0x0249:
            int r11 = r11 - r12
            int r7 = r0.g(r11, r8)
            float r9 = (float) r7
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x025f
            float r7 = (float) r10
            float r7 = r7 / r4
            float r7 = r7 + r24
            int r7 = (int) r7
        L_0x025f:
            r1.d(r10)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r4.d(r7)
            goto L_0x02aa
        L_0x026c:
            int r11 = r11 - r12
            int r7 = r0.g(r11, r8)
            float r9 = (float) r7
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0282
            float r7 = (float) r10
            float r7 = r7 * r4
            float r7 = r7 + r24
            int r7 = (int) r7
        L_0x0282:
            r1.d(r10)
            r.d r4 = r0.b
            s.l r4 = r4.f4317e
            s.g r4 = r4.f4474e
            r4.d(r7)
            goto L_0x02aa
        L_0x028f:
            r24 = 1056964608(0x3f000000, float:0.5)
            r.d r7 = r4.f4293I
            if (r7 == 0) goto L_0x02aa
            s.j r7 = r7.f4316d
            s.g r7 = r7.f4474e
            boolean r9 = r7.f4463j
            if (r9 == 0) goto L_0x02aa
            float r4 = r4.f4326o
            int r7 = r7.f4460g
            float r7 = (float) r7
            float r7 = r7 * r4
            float r7 = r7 + r24
            int r4 = (int) r7
            r1.d(r4)
        L_0x02aa:
            boolean r4 = r5.f4457c
            if (r4 == 0) goto L_0x038d
            boolean r4 = r6.f4457c
            if (r4 != 0) goto L_0x02b4
            goto L_0x038d
        L_0x02b4:
            boolean r4 = r5.f4463j
            if (r4 == 0) goto L_0x02c2
            boolean r4 = r6.f4463j
            if (r4 == 0) goto L_0x02c2
            boolean r4 = r1.f4463j
            if (r4 == 0) goto L_0x02c2
            goto L_0x038d
        L_0x02c2:
            boolean r4 = r1.f4463j
            if (r4 != 0) goto L_0x02fc
            int r4 = r0.f4473d
            if (r4 != r3) goto L_0x02fc
            r.d r4 = r0.b
            int r7 = r4.f4321j
            if (r7 != 0) goto L_0x02fc
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x02fc
            java.util.ArrayList r3 = r5.f4465l
            java.lang.Object r3 = r3.get(r2)
            s.f r3 = (s.f) r3
            java.util.ArrayList r4 = r6.f4465l
            java.lang.Object r2 = r4.get(r2)
            s.f r2 = (s.f) r2
            int r3 = r3.f4460g
            int r4 = r5.f
            int r3 = r3 + r4
            int r2 = r2.f4460g
            int r4 = r6.f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02fc:
            boolean r4 = r1.f4463j
            if (r4 != 0) goto L_0x034c
            int r4 = r0.f4473d
            if (r4 != r3) goto L_0x034c
            int r3 = r0.f4471a
            if (r3 != r8) goto L_0x034c
            java.util.ArrayList r3 = r5.f4465l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x034c
            java.util.ArrayList r3 = r6.f4465l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x034c
            java.util.ArrayList r3 = r5.f4465l
            java.lang.Object r3 = r3.get(r2)
            s.f r3 = (s.f) r3
            java.util.ArrayList r4 = r6.f4465l
            java.lang.Object r4 = r4.get(r2)
            s.f r4 = (s.f) r4
            int r3 = r3.f4460g
            int r7 = r5.f
            int r3 = r3 + r7
            int r4 = r4.f4460g
            int r7 = r6.f
            int r4 = r4 + r7
            int r4 = r4 - r3
            int r3 = r1.f4466m
            int r3 = java.lang.Math.min(r4, r3)
            r.d r4 = r0.b
            int r7 = r4.f4325n
            int r4 = r4.f4324m
            int r3 = java.lang.Math.max(r4, r3)
            if (r7 <= 0) goto L_0x0349
            int r3 = java.lang.Math.min(r7, r3)
        L_0x0349:
            r1.d(r3)
        L_0x034c:
            boolean r3 = r1.f4463j
            if (r3 != 0) goto L_0x0351
            goto L_0x038d
        L_0x0351:
            java.util.ArrayList r3 = r5.f4465l
            java.lang.Object r3 = r3.get(r2)
            s.f r3 = (s.f) r3
            java.util.ArrayList r4 = r6.f4465l
            java.lang.Object r2 = r4.get(r2)
            s.f r2 = (s.f) r2
            int r4 = r3.f4460g
            int r7 = r5.f
            int r7 = r7 + r4
            int r8 = r2.f4460g
            int r9 = r6.f
            int r9 = r9 + r8
            r.d r10 = r0.b
            float r10 = r10.f4303S
            if (r3 != r2) goto L_0x0374
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0376
        L_0x0374:
            r4 = r7
            r8 = r9
        L_0x0376:
            int r8 = r8 - r4
            int r2 = r1.f4460g
            int r8 = r8 - r2
            float r2 = (float) r4
            float r2 = r2 + r24
            float r3 = (float) r8
            float r3 = r3 * r10
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f4460g
            int r1 = r1.f4460g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x038d:
            return
        L_0x038e:
            r.d r1 = r0.b
            r.c r3 = r1.f4335x
            r.c r1 = r1.f4337z
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.a(s.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0 = r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            r.d r0 = r11.b
            boolean r1 = r0.f4311a
            s.g r2 = r11.f4474e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.l()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f4463j
            s.f r1 = r11.f4477i
            s.f r3 = r11.f4476h
            r4 = 1
            r5 = 3
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0078
            r.d r0 = r11.b
            int[] r8 = r0.f4315c0
            r8 = r8[r7]
            r11.f4473d = r8
            if (r8 == r5) goto L_0x00ac
            if (r8 != r6) goto L_0x006e
            r.d r9 = r0.f4293I
            if (r9 == 0) goto L_0x0031
            int[] r10 = r9.f4315c0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0037
        L_0x0031:
            int[] r10 = r9.f4315c0
            r10 = r10[r7]
            if (r10 != r6) goto L_0x006e
        L_0x0037:
            int r0 = r9.l()
            r.d r4 = r11.b
            r.c r4 = r4.f4335x
            int r4 = r4.c()
            int r0 = r0 - r4
            r.d r4 = r11.b
            r.c r4 = r4.f4337z
            int r4 = r4.c()
            int r0 = r0 - r4
            s.j r4 = r9.f4316d
            s.f r5 = r4.f4476h
            r.d r6 = r11.b
            r.c r6 = r6.f4335x
            int r6 = r6.c()
            s.m.b(r3, r5, r6)
            s.f r3 = r4.f4477i
            r.d r4 = r11.b
            r.c r4 = r4.f4337z
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006e:
            if (r8 != r4) goto L_0x00ac
            int r0 = r0.l()
            r2.d(r0)
            goto L_0x00ac
        L_0x0078:
            int r0 = r11.f4473d
            if (r0 != r6) goto L_0x00ac
            r.d r0 = r11.b
            r.d r8 = r0.f4293I
            if (r8 == 0) goto L_0x0088
            int[] r9 = r8.f4315c0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x008e
        L_0x0088:
            int[] r9 = r8.f4315c0
            r9 = r9[r7]
            if (r9 != r6) goto L_0x00ac
        L_0x008e:
            s.j r2 = r8.f4316d
            s.f r2 = r2.f4476h
            r.c r0 = r0.f4335x
            int r0 = r0.c()
            s.m.b(r3, r2, r0)
            s.j r0 = r8.f4316d
            s.f r0 = r0.f4477i
            r.d r2 = r11.b
            r.c r2 = r2.f4337z
            int r2 = r2.c()
            int r2 = -r2
            s.m.b(r1, r0, r2)
            return
        L_0x00ac:
            boolean r0 = r2.f4463j
            if (r0 == 0) goto L_0x017e
            r.d r0 = r11.b
            boolean r8 = r0.f4311a
            if (r8 == 0) goto L_0x017e
            r.c[] r5 = r0.f4290F
            r6 = r5[r7]
            r.c r8 = r6.f4283d
            if (r8 == 0) goto L_0x011c
            r9 = r5[r4]
            r.c r9 = r9.f4283d
            if (r9 == 0) goto L_0x011c
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00e4
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f = r0
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f = r0
            return
        L_0x00e4:
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r7]
            s.f r0 = s.m.h(r0)
            if (r0 == 0) goto L_0x00fd
            r.d r2 = r11.b
            r.c[] r2 = r2.f4290F
            r2 = r2[r7]
            int r2 = r2.c()
            s.m.b(r3, r0, r2)
        L_0x00fd:
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            s.f r0 = s.m.h(r0)
            if (r0 == 0) goto L_0x0117
            r.d r2 = r11.b
            r.c[] r2 = r2.f4290F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            s.m.b(r1, r0, r2)
        L_0x0117:
            r3.b = r4
            r1.b = r4
            return
        L_0x011c:
            if (r8 == 0) goto L_0x0137
            s.f r0 = s.m.h(r6)
            if (r0 == 0) goto L_0x030f
            r.d r4 = r11.b
            r.c[] r4 = r4.f4290F
            r4 = r4[r7]
            int r4 = r4.c()
            s.m.b(r3, r0, r4)
            int r0 = r2.f4460g
            s.m.b(r1, r3, r0)
            return
        L_0x0137:
            r5 = r5[r4]
            r.c r6 = r5.f4283d
            if (r6 == 0) goto L_0x0158
            s.f r0 = s.m.h(r5)
            if (r0 == 0) goto L_0x030f
            r.d r5 = r11.b
            r.c[] r5 = r5.f4290F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r0, r4)
            int r0 = r2.f4460g
            int r0 = -r0
            s.m.b(r3, r1, r0)
            return
        L_0x0158:
            boolean r4 = r0 instanceof r.i
            if (r4 != 0) goto L_0x030f
            r.d r4 = r0.f4293I
            if (r4 == 0) goto L_0x030f
            r4 = 7
            r.c r0 = r0.g(r4)
            r.c r0 = r0.f4283d
            if (r0 != 0) goto L_0x030f
            r.d r0 = r11.b
            r.d r4 = r0.f4293I
            s.j r4 = r4.f4316d
            s.f r4 = r4.f4476h
            int r0 = r0.m()
            s.m.b(r3, r4, r0)
            int r0 = r2.f4460g
            s.m.b(r1, r3, r0)
            return
        L_0x017e:
            int r0 = r11.f4473d
            if (r0 != r5) goto L_0x0274
            r.d r0 = r11.b
            int r8 = r0.f4321j
            r9 = 2
            if (r8 == r9) goto L_0x0255
            if (r8 == r5) goto L_0x018d
            goto L_0x0274
        L_0x018d:
            int r8 = r0.f4322k
            if (r8 != r5) goto L_0x021a
            r3.f4456a = r11
            r1.f4456a = r11
            s.l r5 = r0.f4317e
            s.f r8 = r5.f4476h
            r8.f4456a = r11
            s.f r5 = r5.f4477i
            r5.f4456a = r11
            r2.f4456a = r11
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x01ef
            java.util.ArrayList r0 = r2.f4465l
            r.d r5 = r11.b
            s.l r5 = r5.f4317e
            s.g r5 = r5.f4474e
            r0.add(r5)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.g r5 = r0.f4474e
            r5.f4456a = r11
            java.util.ArrayList r5 = r2.f4465l
            s.f r0 = r0.f4476h
            r5.add(r0)
            java.util.ArrayList r0 = r2.f4465l
            r.d r5 = r11.b
            s.l r5 = r5.f4317e
            s.f r5 = r5.f4477i
            r0.add(r5)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.f r0 = r0.f4476h
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.f r0 = r0.f4477i
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            goto L_0x0274
        L_0x01ef:
            r.d r0 = r11.b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x020e
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r0 = r0.f4465l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4464k
            r.d r5 = r11.b
            s.l r5 = r5.f4317e
            s.g r5 = r5.f4474e
            r0.add(r5)
            goto L_0x0274
        L_0x020e:
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r0 = r0.f4465l
            r0.add(r2)
            goto L_0x0274
        L_0x021a:
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r5 = r2.f4465l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.f r0 = r0.f4476h
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r.d r0 = r11.b
            s.l r0 = r0.f4317e
            s.f r0 = r0.f4477i
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r2.b = r4
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r1)
            java.util.ArrayList r0 = r3.f4465l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f4465l
            r0.add(r2)
            goto L_0x0274
        L_0x0255:
            r.d r0 = r0.f4293I
            if (r0 != 0) goto L_0x025a
            goto L_0x0274
        L_0x025a:
            s.l r0 = r0.f4317e
            s.g r0 = r0.f4474e
            java.util.ArrayList r5 = r2.f4465l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f4464k
            r0.add(r2)
            r2.b = r4
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4464k
            r0.add(r1)
        L_0x0274:
            r.d r0 = r11.b
            r.c[] r5 = r0.f4290F
            r8 = r5[r7]
            r.c r9 = r8.f4283d
            if (r9 == 0) goto L_0x02c1
            r10 = r5[r4]
            r.c r10 = r10.f4283d
            if (r10 == 0) goto L_0x02c1
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x02a4
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f = r0
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f = r0
            return
        L_0x02a4:
            r.d r0 = r11.b
            r.c[] r0 = r0.f4290F
            r0 = r0[r7]
            s.f r0 = s.m.h(r0)
            r.d r1 = r11.b
            r.c[] r1 = r1.f4290F
            r1 = r1[r4]
            s.f r1 = s.m.h(r1)
            r0.b(r11)
            r1.b(r11)
            r11.f4478j = r6
            return
        L_0x02c1:
            if (r9 == 0) goto L_0x02da
            s.f r0 = s.m.h(r8)
            if (r0 == 0) goto L_0x030f
            r.d r5 = r11.b
            r.c[] r5 = r5.f4290F
            r5 = r5[r7]
            int r5 = r5.c()
            s.m.b(r3, r0, r5)
            r11.c(r1, r3, r4, r2)
            return
        L_0x02da:
            r5 = r5[r4]
            r.c r6 = r5.f4283d
            if (r6 == 0) goto L_0x02f9
            s.f r0 = s.m.h(r5)
            if (r0 == 0) goto L_0x030f
            r.d r5 = r11.b
            r.c[] r5 = r5.f4290F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            s.m.b(r1, r0, r4)
            r0 = -1
            r11.c(r3, r1, r0, r2)
            return
        L_0x02f9:
            boolean r5 = r0 instanceof r.i
            if (r5 != 0) goto L_0x030f
            r.d r5 = r0.f4293I
            if (r5 == 0) goto L_0x030f
            s.j r5 = r5.f4316d
            s.f r5 = r5.f4476h
            int r0 = r0.m()
            s.m.b(r3, r5, r0)
            r11.c(r1, r3, r4, r2)
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.d():void");
    }

    public final void e() {
        f fVar = this.f4476h;
        if (fVar.f4463j) {
            this.b.f4298N = fVar.f4460g;
        }
    }

    public final void f() {
        this.f4472c = null;
        this.f4476h.c();
        this.f4477i.c();
        this.f4474e.c();
        this.f4475g = false;
    }

    public final boolean k() {
        if (this.f4473d != 3 || this.b.f4321j == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f4475g = false;
        f fVar = this.f4476h;
        fVar.c();
        fVar.f4463j = false;
        f fVar2 = this.f4477i;
        fVar2.c();
        fVar2.f4463j = false;
        this.f4474e.f4463j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.f4307W;
    }
}

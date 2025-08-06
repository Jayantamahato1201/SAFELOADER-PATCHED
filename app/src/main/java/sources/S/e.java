package s;

import java.util.ArrayList;
import java.util.HashSet;
import r.C0472d;
import r.C0473e;
import r.h;
import r.i;
import t.C0481f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public C0473e f4450a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4451c;

    /* renamed from: d  reason: collision with root package name */
    public C0473e f4452d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f4453e;
    public C0481f f;

    /* renamed from: g  reason: collision with root package name */
    public C0475b f4454g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f4455h;

    /* JADX WARNING: type inference failed for: r13v2, types: [s.k, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(s.f r10, int r11, java.util.ArrayList r12, s.k r13) {
        /*
            r9 = this;
            s.m r10 = r10.f4458d
            s.k r0 = r10.f4472c
            if (r0 != 0) goto L_0x00db
            r.e r0 = r9.f4450a
            s.j r1 = r0.f4316d
            if (r10 == r1) goto L_0x00db
            s.l r0 = r0.f4317e
            if (r10 != r0) goto L_0x0012
            goto L_0x00db
        L_0x0012:
            if (r13 != 0) goto L_0x0028
            s.k r13 = new s.k
            r13.<init>()
            r0 = 0
            r13.f4468a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.b = r0
            r13.f4468a = r10
            r12.add(r13)
        L_0x0028:
            r10.f4472c = r13
            java.util.ArrayList r0 = r13.b
            r0.add(r10)
            s.f r0 = r10.f4476h
            java.util.ArrayList r1 = r0.f4464k
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x0039:
            if (r4 >= r2) goto L_0x004d
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            s.d r5 = (s.d) r5
            boolean r6 = r5 instanceof s.f
            if (r6 == 0) goto L_0x0039
            s.f r5 = (s.f) r5
            r9.a(r5, r11, r12, r13)
            goto L_0x0039
        L_0x004d:
            s.f r1 = r10.f4477i
            java.util.ArrayList r2 = r1.f4464k
            int r4 = r2.size()
            r5 = 0
        L_0x0056:
            if (r5 >= r4) goto L_0x006a
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            s.d r6 = (s.d) r6
            boolean r7 = r6 instanceof s.f
            if (r7 == 0) goto L_0x0056
            s.f r6 = (s.f) r6
            r9.a(r6, r11, r12, r13)
            goto L_0x0056
        L_0x006a:
            r2 = 1
            if (r11 != r2) goto L_0x0091
            boolean r4 = r10 instanceof s.l
            if (r4 == 0) goto L_0x0091
            r4 = r10
            s.l r4 = (s.l) r4
            s.f r4 = r4.f4469k
            java.util.ArrayList r4 = r4.f4464k
            int r5 = r4.size()
            r6 = 0
        L_0x007d:
            if (r6 >= r5) goto L_0x0091
            java.lang.Object r7 = r4.get(r6)
            int r6 = r6 + 1
            s.d r7 = (s.d) r7
            boolean r8 = r7 instanceof s.f
            if (r8 == 0) goto L_0x007d
            s.f r7 = (s.f) r7
            r9.a(r7, r11, r12, r13)
            goto L_0x007d
        L_0x0091:
            java.util.ArrayList r0 = r0.f4465l
            int r4 = r0.size()
            r5 = 0
        L_0x0098:
            if (r5 >= r4) goto L_0x00a6
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            s.f r6 = (s.f) r6
            r9.a(r6, r11, r12, r13)
            goto L_0x0098
        L_0x00a6:
            java.util.ArrayList r0 = r1.f4465l
            int r1 = r0.size()
            r4 = 0
        L_0x00ad:
            if (r4 >= r1) goto L_0x00bb
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            s.f r5 = (s.f) r5
            r9.a(r5, r11, r12, r13)
            goto L_0x00ad
        L_0x00bb:
            if (r11 != r2) goto L_0x00db
            boolean r0 = r10 instanceof s.l
            if (r0 == 0) goto L_0x00db
            s.l r10 = (s.l) r10
            s.f r10 = r10.f4469k
            java.util.ArrayList r10 = r10.f4465l
            int r0 = r10.size()
        L_0x00cb:
            if (r3 >= r0) goto L_0x00db
            java.lang.Object r1 = r10.get(r3)
            int r3 = r3 + 1
            s.f r1 = (s.f) r1
            r9.a(r1, r11, r12, r13)     // Catch:{ all -> 0x00d9 }
            goto L_0x00cb
        L_0x00d9:
            r10 = move-exception
            throw r10
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.a(s.f, int, java.util.ArrayList, s.k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b9, code lost:
        if (r5 != r3) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0142, code lost:
        if (r5 == 4) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(r.C0473e r25) {
        /*
            r24 = this;
            r0 = r25
            java.util.ArrayList r1 = r0.f4338d0
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x032e
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            r11 = r5
            r.d r11 = (r.C0472d) r11
            int[] r5 = r11.f4315c0
            r6 = r5[r3]
            r12 = 1
            r5 = r5[r12]
            int r7 = r11.f4306V
            r8 = 8
            if (r7 != r8) goto L_0x0025
            r11.f4311a = r12
            goto L_0x000a
        L_0x0025:
            float r7 = r11.f4326o
            r8 = 3
            r13 = 1065353216(0x3f800000, float:1.0)
            r9 = 2
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x0033
            if (r6 != r8) goto L_0x0033
            r11.f4321j = r9
        L_0x0033:
            float r10 = r11.f4329r
            int r14 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x003d
            if (r5 != r8) goto L_0x003d
            r11.f4322k = r9
        L_0x003d:
            float r14 = r11.f4296L
            r15 = 0
            r16 = r7
            r7 = 2
            r17 = 0
            r3 = 1
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x006c
            if (r6 != r8) goto L_0x0053
            if (r5 == r7) goto L_0x0050
            if (r5 != r3) goto L_0x0053
        L_0x0050:
            r11.f4321j = r8
            goto L_0x006c
        L_0x0053:
            if (r5 != r8) goto L_0x005c
            if (r6 == r7) goto L_0x0059
            if (r6 != r3) goto L_0x005c
        L_0x0059:
            r11.f4322k = r8
            goto L_0x006c
        L_0x005c:
            if (r6 != r8) goto L_0x006c
            if (r5 != r8) goto L_0x006c
            int r14 = r11.f4321j
            if (r14 != 0) goto L_0x0066
            r11.f4321j = r8
        L_0x0066:
            int r14 = r11.f4322k
            if (r14 != 0) goto L_0x006c
            r11.f4322k = r8
        L_0x006c:
            r.c r14 = r11.f4337z
            r.c r15 = r11.f4335x
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r8) goto L_0x0081
            int r13 = r11.f4321j
            if (r13 != r12) goto L_0x0081
            r.c r13 = r15.f4283d
            if (r13 == 0) goto L_0x0080
            r.c r13 = r14.f4283d
            if (r13 != 0) goto L_0x0081
        L_0x0080:
            r6 = 2
        L_0x0081:
            r.c r13 = r11.f4286A
            r.c r9 = r11.f4336y
            if (r5 != r8) goto L_0x0094
            int r8 = r11.f4322k
            if (r8 != r12) goto L_0x0094
            r.c r8 = r9.f4283d
            if (r8 == 0) goto L_0x0093
            r.c r8 = r13.f4283d
            if (r8 != 0) goto L_0x0094
        L_0x0093:
            r5 = 2
        L_0x0094:
            s.j r8 = r11.f4316d
            r8.f4473d = r6
            int r12 = r11.f4321j
            r8.f4471a = r12
            r21 = r8
            s.l r8 = r11.f4317e
            r8.f4473d = r5
            int r7 = r11.f4322k
            r8.f4471a = r7
            r22 = r1
            r1 = 4
            if (r6 == r1) goto L_0x00b3
            if (r6 == r3) goto L_0x00b3
            r3 = 2
            if (r6 != r3) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r1 = 1
            goto L_0x00c1
        L_0x00b3:
            r3 = 2
        L_0x00b4:
            if (r5 == r1) goto L_0x00bb
            r1 = 1
            if (r5 == r1) goto L_0x00bb
            if (r5 != r3) goto L_0x00c1
        L_0x00bb:
            r3 = r8
            r1 = r21
            r7 = 1
            goto L_0x02e8
        L_0x00c1:
            int[] r9 = r0.f4315c0
            r.c[] r13 = r11.f4290F
            r14 = 1056964608(0x3f000000, float:0.5)
            r15 = 3
            if (r6 != r15) goto L_0x01a3
            if (r5 == r3) goto L_0x00da
            if (r5 != r1) goto L_0x00cf
            goto L_0x00da
        L_0x00cf:
            r3 = r8
            r8 = r9
            r1 = r21
            r9 = 2
            r14 = 3
            r15 = 1
            r23 = 1056964608(0x3f000000, float:0.5)
            goto L_0x01ac
        L_0x00da:
            if (r12 != r15) goto L_0x011b
            if (r5 != r3) goto L_0x00ec
            r10 = 0
            r1 = r8
            r8 = 0
            r9 = r3
            r7 = 2
            r6 = r24
            r3 = r1
            r1 = r21
            r6.f(r7, r8, r9, r10, r11)
            goto L_0x00ef
        L_0x00ec:
            r3 = r8
            r1 = r21
        L_0x00ef:
            int r10 = r11.i()
            float r5 = (float) r10
            float r6 = r11.f4296L
            float r5 = r5 * r6
            float r5 = r5 + r14
            int r8 = (int) r5
            r7 = 1
            r9 = r7
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r8 = 1
            r11.f4311a = r8
        L_0x0116:
            r1 = r22
            r3 = 0
            goto L_0x000a
        L_0x011b:
            r3 = r8
            r1 = r21
            r8 = 1
            r15 = 1
            if (r12 != r8) goto L_0x0134
            r8 = 0
            r10 = 0
            r7 = 2
            r6 = r24
            r9 = r5
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r3 = r11.l()
            r1.f4466m = r3
            goto L_0x0116
        L_0x0134:
            r8 = r9
            r21 = 2
            r9 = r5
            r5 = 2
            if (r12 != r5) goto L_0x0175
            r5 = r8[r17]
            if (r5 == r15) goto L_0x0149
            r14 = 4
            r23 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r14) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            r5 = r9
            r9 = 2
        L_0x0147:
            r14 = 3
            goto L_0x01ac
        L_0x0149:
            r23 = 1056964608(0x3f000000, float:0.5)
        L_0x014b:
            int r5 = r0.l()
            float r5 = (float) r5
            float r7 = r16 * r5
            float r7 = r7 + r23
            int r8 = (int) r7
            int r10 = r11.i()
            r7 = 1
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x0175:
            r5 = 1
            r23 = 1056964608(0x3f000000, float:0.5)
            r14 = r13[r17]
            r.c r14 = r14.f4283d
            if (r14 == 0) goto L_0x0184
            r14 = r13[r5]
            r.c r5 = r14.f4283d
            if (r5 != 0) goto L_0x0145
        L_0x0184:
            r8 = 0
            r10 = 0
            r7 = 2
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x01a3:
            r3 = r8
            r8 = r9
            r1 = r21
            r9 = 2
            r15 = 1
            r23 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0147
        L_0x01ac:
            if (r5 != r14) goto L_0x01b3
            if (r6 == r9) goto L_0x01b9
            if (r6 != r15) goto L_0x01b3
            goto L_0x01b9
        L_0x01b3:
            r9 = r5
            r5 = 1
            r21 = 2
            goto L_0x0280
        L_0x01b9:
            if (r7 != r14) goto L_0x01f7
            if (r6 != r9) goto L_0x01c6
            r10 = 0
            r8 = 0
            r7 = 2
            r9 = r7
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
        L_0x01c6:
            int r8 = r11.l()
            float r5 = r11.f4296L
            int r6 = r11.f4297M
            r7 = -1
            if (r6 != r7) goto L_0x01d3
            float r5 = r18 / r5
        L_0x01d3:
            float r6 = (float) r8
            float r6 = r6 * r5
            float r6 = r6 + r23
            int r10 = (int) r6
            r9 = r15
            r7 = 1
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r9 = 1
            r11.f4311a = r9
            goto L_0x0116
        L_0x01f7:
            r9 = 1
            r21 = 2
            if (r7 != r9) goto L_0x020f
            r10 = 0
            r8 = 0
            r9 = 2
            r7 = r6
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.f4466m = r3
            goto L_0x0116
        L_0x020f:
            r14 = r6
            r6 = 2
            if (r7 != r6) goto L_0x024c
            r6 = r8[r9]
            if (r6 == r15) goto L_0x0220
            r9 = 4
            if (r6 != r9) goto L_0x021b
            goto L_0x0220
        L_0x021b:
            r9 = r5
            r6 = r14
        L_0x021d:
            r5 = 1
            r14 = 3
            goto L_0x0280
        L_0x0220:
            int r8 = r11.l()
            int r5 = r0.i()
            float r5 = (float) r5
            float r10 = r10 * r5
            float r10 = r10 + r23
            int r10 = (int) r10
            r9 = 1
            r6 = r24
            r7 = r14
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x024c:
            r6 = r14
            r19 = 2
            r9 = r13[r19]
            r.c r9 = r9.f4283d
            if (r9 == 0) goto L_0x0260
            r20 = 3
            r9 = r13[r20]
            r.c r9 = r9.f4283d
            if (r9 != 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r9 = r5
            goto L_0x021d
        L_0x0260:
            r8 = 0
            r10 = 0
            r7 = 2
            r6 = r24
            r9 = r5
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x0280:
            if (r6 != r14) goto L_0x0116
            if (r9 != r14) goto L_0x0116
            if (r12 == r5) goto L_0x02cc
            if (r7 != r5) goto L_0x0289
            goto L_0x02cc
        L_0x0289:
            r6 = 2
            if (r7 != r6) goto L_0x0116
            if (r12 != r6) goto L_0x0116
            r6 = r8[r17]
            if (r6 == r15) goto L_0x0294
            if (r6 != r15) goto L_0x0116
        L_0x0294:
            r6 = r8[r5]
            if (r6 == r15) goto L_0x029a
            if (r6 != r15) goto L_0x0116
        L_0x029a:
            int r5 = r0.l()
            float r5 = (float) r5
            float r7 = r16 * r5
            float r7 = r7 + r23
            int r8 = (int) r7
            int r5 = r0.i()
            float r5 = (float) r5
            float r10 = r10 * r5
            float r10 = r10 + r23
            int r10 = (int) r10
            r9 = r15
            r7 = 1
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x02cc:
            r10 = 0
            r8 = 0
            r9 = r21
            r7 = 2
            r6 = r24
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.f4466m = r5
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.f4466m = r3
            goto L_0x0116
        L_0x02e8:
            int r8 = r11.l()
            r10 = 4
            if (r6 != r10) goto L_0x02fb
            int r6 = r0.l()
            int r8 = r15.f4284e
            int r6 = r6 - r8
            int r8 = r14.f4284e
            int r8 = r6 - r8
            r6 = 1
        L_0x02fb:
            int r12 = r11.i()
            if (r5 != r10) goto L_0x0312
            int r5 = r0.i()
            int r9 = r9.f4284e
            int r5 = r5 - r9
            int r9 = r13.f4284e
            int r12 = r5 - r9
            r9 = 1
        L_0x030d:
            r7 = r6
            r10 = r12
            r6 = r24
            goto L_0x0314
        L_0x0312:
            r9 = r5
            goto L_0x030d
        L_0x0314:
            r6.f(r7, r8, r9, r10, r11)
            s.g r1 = r1.f4474e
            int r5 = r11.l()
            r1.d(r5)
            s.g r1 = r3.f4474e
            int r3 = r11.i()
            r1.d(r3)
            r5 = 1
            r11.f4311a = r5
            goto L_0x0116
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.b(r.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f4453e;
        arrayList.clear();
        C0473e eVar = this.f4452d;
        eVar.f4316d.f();
        l lVar = eVar.f4317e;
        lVar.f();
        arrayList.add(eVar.f4316d);
        arrayList.add(lVar);
        ArrayList arrayList2 = eVar.f4338d0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            C0472d dVar = (C0472d) obj;
            if (dVar instanceof h) {
                m mVar = new m(dVar);
                dVar.f4316d.f();
                dVar.f4317e.f();
                mVar.f = ((h) dVar).f4404h0;
                arrayList.add(mVar);
            } else {
                if (dVar.q()) {
                    if (dVar.b == null) {
                        dVar.b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.b);
                } else {
                    arrayList.add(dVar.f4316d);
                }
                if (dVar.r()) {
                    if (dVar.f4314c == null) {
                        dVar.f4314c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f4314c);
                } else {
                    arrayList.add(dVar.f4317e);
                }
                if (dVar instanceof i) {
                    arrayList.add(new m(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((m) obj2).f();
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList.get(i4);
            i4++;
            m mVar2 = (m) obj3;
            if (mVar2.b != eVar) {
                mVar2.d();
            }
        }
        ArrayList arrayList3 = this.f4455h;
        arrayList3.clear();
        C0473e eVar2 = this.f4450a;
        e(eVar2.f4316d, 0, arrayList3);
        e(eVar2.f4317e, 1, arrayList3);
        this.b = false;
    }

    public final int d(C0473e eVar, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long j2;
        m mVar;
        m mVar2;
        float f2;
        long j3;
        C0473e eVar2 = eVar;
        int i5 = i2;
        ArrayList arrayList2 = this.f4455h;
        int size = arrayList2.size();
        int i6 = 0;
        long j4 = 0;
        while (i6 < size) {
            m mVar3 = ((k) arrayList2.get(i6)).f4468a;
            if (!(mVar3 instanceof c) ? i5 != 0 ? (mVar3 instanceof l) : (mVar3 instanceof j) : ((c) mVar3).f == i5) {
                if (i5 == 0) {
                    mVar = eVar2.f4316d;
                } else {
                    mVar = eVar2.f4317e;
                }
                f fVar = mVar.f4476h;
                if (i5 == 0) {
                    mVar2 = eVar2.f4316d;
                } else {
                    mVar2 = eVar2.f4317e;
                }
                f fVar2 = mVar2.f4477i;
                boolean contains = mVar3.f4476h.f4465l.contains(fVar);
                f fVar3 = mVar3.f4477i;
                boolean contains2 = fVar3.f4465l.contains(fVar2);
                long j5 = mVar3.j();
                f fVar4 = mVar3.f4476h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i4 = size;
                    i3 = i6;
                    if (contains) {
                        j2 = Math.max(k.b(fVar4, (long) fVar4.f), ((long) fVar4.f) + j5);
                    } else if (contains2) {
                        j2 = Math.max(-k.a(fVar3, (long) fVar3.f), ((long) (-fVar3.f)) + j5);
                    } else {
                        j2 = (mVar3.j() + ((long) fVar4.f)) - ((long) fVar3.f);
                    }
                } else {
                    long b2 = k.b(fVar4, 0);
                    ArrayList arrayList3 = arrayList2;
                    i4 = size;
                    long a2 = k.a(fVar3, 0);
                    long j6 = b2 - j5;
                    int i7 = fVar3.f;
                    arrayList = arrayList3;
                    i3 = i6;
                    if (j6 >= ((long) (-i7))) {
                        j6 += (long) i7;
                    }
                    long j7 = (long) fVar4.f;
                    long j8 = ((-a2) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    C0472d dVar = mVar3.b;
                    if (i5 == 0) {
                        f2 = dVar.f4303S;
                    } else if (i5 == 1) {
                        f2 = dVar.f4304T;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f) {
                        j3 = (long) ((((float) j6) / (1.0f - f2)) + (((float) j8) / f2));
                    } else {
                        j3 = 0;
                    }
                    float f3 = (float) j3;
                    j2 = (((long) fVar4.f) + ((((long) ((f3 * f2) + 0.5f)) + j5) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - ((long) fVar3.f);
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                i3 = i6;
                j2 = 0;
            }
            j4 = Math.max(j4, j2);
            i6 = i3 + 1;
            eVar2 = eVar;
            size = i4;
            arrayList2 = arrayList;
        }
        return (int) j4;
    }

    public final void e(m mVar, int i2, ArrayList arrayList) {
        f fVar;
        ArrayList arrayList2 = mVar.f4476h.f4464k;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            fVar = mVar.f4477i;
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList2.get(i4);
            i4++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i2, arrayList, (k) null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f4476h, i2, arrayList, (k) null);
            }
        }
        ArrayList arrayList3 = fVar.f4464k;
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, arrayList, (k) null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f4477i, i2, arrayList, (k) null);
            }
        }
        if (i2 == 1) {
            ArrayList arrayList4 = ((l) mVar).f4469k.f4464k;
            int size3 = arrayList4.size();
            while (i3 < size3) {
                Object obj3 = arrayList4.get(i3);
                i3++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, arrayList, (k) null);
                }
            }
        }
    }

    public final void f(int i2, int i3, int i4, int i5, C0472d dVar) {
        boolean z2;
        C0475b bVar = this.f4454g;
        bVar.f4440a = i2;
        bVar.b = i4;
        bVar.f4441c = i3;
        bVar.f4442d = i5;
        this.f.a(dVar, bVar);
        dVar.y(bVar.f4443e);
        dVar.v(bVar.f);
        dVar.f4334w = bVar.f4445h;
        int i6 = bVar.f4444g;
        dVar.f4300P = i6;
        if (i6 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        dVar.f4334w = z2;
    }

    public final void g() {
        boolean z2;
        boolean z3;
        C0474a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f4450a.f4338d0;
        int size = arrayList.size();
        char c2 = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            C0472d dVar = (C0472d) arrayList.get(i2);
            if (!dVar.f4311a) {
                int[] iArr = dVar.f4315c0;
                int i4 = iArr[c2];
                int i5 = iArr[1];
                int i6 = dVar.f4321j;
                int i7 = dVar.f4322k;
                if (i4 == 2 || (i4 == 3 && i6 == 1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i5 == 2 || (i5 == 3 && i7 == 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j jVar = dVar.f4316d;
                g gVar = jVar.f4474e;
                boolean z4 = gVar.f4463j;
                l lVar = dVar.f4317e;
                g gVar2 = lVar.f4474e;
                boolean z5 = gVar2.f4463j;
                boolean z6 = z2;
                if (z4 && z5) {
                    eVar.f(1, gVar.f4460g, 1, gVar2.f4460g, dVar);
                    dVar.f4311a = true;
                } else if (z4 && z3) {
                    f(1, gVar.f4460g, 2, gVar2.f4460g, dVar);
                    if (i5 == 3) {
                        lVar.f4474e.f4466m = dVar.i();
                    } else {
                        lVar.f4474e.d(dVar.i());
                        dVar.f4311a = true;
                    }
                } else if (z5 && z6) {
                    f(2, gVar.f4460g, 1, gVar2.f4460g, dVar);
                    if (i4 == 3) {
                        jVar.f4474e.f4466m = dVar.l();
                    } else {
                        jVar.f4474e.d(dVar.l());
                        dVar.f4311a = true;
                    }
                }
                if (dVar.f4311a && (aVar = lVar.f4470l) != null) {
                    aVar.d(dVar.f4300P);
                }
                c2 = 0;
                eVar = this;
            }
            i2 = i3;
        }
    }
}

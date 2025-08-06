package r;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f4406a = new boolean[3];

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: r.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0267, code lost:
        if (r8.b == r6) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        if (r5.b == r7) goto L_0x0108;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0556 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(r.C0473e r39, q.e r40, int r41) {
        /*
            r0 = r39
            r1 = r40
            if (r41 != 0) goto L_0x000e
            int r2 = r0.f4345l0
            r.b[] r3 = r0.f4347o0
            r14 = 0
        L_0x000b:
            r12 = r2
            r13 = r3
            goto L_0x0014
        L_0x000e:
            int r2 = r0.f4346m0
            r.b[] r3 = r0.n0
            r14 = 2
            goto L_0x000b
        L_0x0014:
            r15 = 0
        L_0x0015:
            if (r15 >= r12) goto L_0x06cb
            r2 = r13[r15]
            boolean r3 = r2.f4280q
            r.d r4 = r2.f4266a
            r5 = 3
            r8 = 8
            r16 = 0
            if (r3 != 0) goto L_0x014d
            int r3 = r2.f4275l
            int r9 = r3 * 2
            r7 = r4
            r11 = r7
            r17 = 0
            r18 = 0
        L_0x002e:
            if (r17 != 0) goto L_0x0117
            r19 = 1
            int r6 = r2.f4272i
            int r6 = r6 + 1
            r2.f4272i = r6
            r.d[] r6 = r7.f4313b0
            r6[r3] = r16
            r.d[] r6 = r7.f4312a0
            r6[r3] = r16
            int r6 = r7.f4306V
            r.c[] r10 = r7.f4290F
            if (r6 == r8) goto L_0x00e8
            r7.h(r3)
            r6 = r10[r9]
            r6.c()
            int r6 = r9 + 1
            r21 = r10[r6]
            r21.c()
            r21 = r10[r9]
            r21.c()
            r6 = r10[r6]
            r6.c()
            r.d r6 = r2.b
            if (r6 != 0) goto L_0x0065
            r2.b = r7
        L_0x0065:
            r2.f4268d = r7
            int[] r6 = r7.f4315c0
            r6 = r6[r3]
            if (r6 != r5) goto L_0x00e8
            int[] r8 = r7.f4323l
            r8 = r8[r3]
            if (r8 == 0) goto L_0x007c
            if (r8 == r5) goto L_0x007c
            r5 = 2
            if (r8 != r5) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r23 = r3
            goto L_0x00ce
        L_0x007c:
            int r5 = r2.f4273j
            int r5 = r5 + 1
            r2.f4273j = r5
            float[] r5 = r7.f4310Z
            r5 = r5[r3]
            int r23 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r23 <= 0) goto L_0x0092
            r23 = r3
            float r3 = r2.f4274k
            float r3 = r3 + r5
            r2.f4274k = r3
            goto L_0x0094
        L_0x0092:
            r23 = r3
        L_0x0094:
            int r3 = r7.f4306V
            r24 = r5
            r5 = 8
            if (r3 == r5) goto L_0x00be
            r3 = 3
            if (r6 != r3) goto L_0x00be
            if (r8 == 0) goto L_0x00a3
            if (r8 != r3) goto L_0x00be
        L_0x00a3:
            int r3 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ab
            r3 = 1
            r2.f4277n = r3
            goto L_0x00ae
        L_0x00ab:
            r3 = 1
            r2.f4278o = r3
        L_0x00ae:
            java.util.ArrayList r3 = r2.f4271h
            if (r3 != 0) goto L_0x00b9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f4271h = r3
        L_0x00b9:
            java.util.ArrayList r3 = r2.f4271h
            r3.add(r7)
        L_0x00be:
            r.d r3 = r2.f
            if (r3 != 0) goto L_0x00c4
            r2.f = r7
        L_0x00c4:
            r.d r3 = r2.f4270g
            if (r3 == 0) goto L_0x00cc
            r.d[] r3 = r3.f4312a0
            r3[r23] = r7
        L_0x00cc:
            r2.f4270g = r7
        L_0x00ce:
            if (r23 != 0) goto L_0x00dc
            int r3 = r7.f4321j
            if (r3 == 0) goto L_0x00d5
            goto L_0x00ea
        L_0x00d5:
            int r3 = r7.f4324m
            if (r3 != 0) goto L_0x00ea
            int r3 = r7.f4325n
            goto L_0x00ea
        L_0x00dc:
            int r3 = r7.f4322k
            if (r3 == 0) goto L_0x00e1
            goto L_0x00ea
        L_0x00e1:
            int r3 = r7.f4327p
            if (r3 != 0) goto L_0x00ea
            int r3 = r7.f4328q
            goto L_0x00ea
        L_0x00e8:
            r23 = r3
        L_0x00ea:
            if (r11 == r7) goto L_0x00f0
            r.d[] r3 = r11.f4313b0
            r3[r23] = r7
        L_0x00f0:
            int r3 = r9 + 1
            r3 = r10[r3]
            r.c r3 = r3.f4283d
            if (r3 == 0) goto L_0x0106
            r.d r3 = r3.b
            r.c[] r5 = r3.f4290F
            r5 = r5[r9]
            r.c r5 = r5.f4283d
            if (r5 == 0) goto L_0x0106
            r.d r5 = r5.b
            if (r5 == r7) goto L_0x0108
        L_0x0106:
            r3 = r16
        L_0x0108:
            if (r3 == 0) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r3 = r7
            r17 = 1
        L_0x010e:
            r11 = r7
            r5 = 3
            r8 = 8
            r7 = r3
            r3 = r23
            goto L_0x002e
        L_0x0117:
            r23 = r3
            r.d r3 = r2.b
            if (r3 == 0) goto L_0x0124
            r.c[] r3 = r3.f4290F
            r3 = r3[r9]
            r3.c()
        L_0x0124:
            r.d r3 = r2.f4268d
            if (r3 == 0) goto L_0x0131
            int r9 = r9 + 1
            r.c[] r3 = r3.f4290F
            r3 = r3[r9]
            r3.c()
        L_0x0131:
            r2.f4267c = r7
            if (r23 != 0) goto L_0x013c
            boolean r3 = r2.f4276m
            if (r3 == 0) goto L_0x013c
            r2.f4269e = r7
            goto L_0x013e
        L_0x013c:
            r2.f4269e = r4
        L_0x013e:
            boolean r3 = r2.f4278o
            if (r3 == 0) goto L_0x0148
            boolean r3 = r2.f4277n
            if (r3 == 0) goto L_0x0148
            r3 = 1
            goto L_0x0149
        L_0x0148:
            r3 = 0
        L_0x0149:
            r2.f4279p = r3
        L_0x014b:
            r3 = 1
            goto L_0x0150
        L_0x014d:
            r18 = 0
            goto L_0x014b
        L_0x0150:
            r2.f4280q = r3
            r.d r10 = r2.f4267c
            r.d r11 = r2.b
            r.d r3 = r2.f4268d
            r.d r5 = r2.f4269e
            float r6 = r2.f4274k
            int[] r7 = r0.f4315c0
            r7 = r7[r41]
            r8 = 2
            if (r7 != r8) goto L_0x0165
            r7 = 1
            goto L_0x0166
        L_0x0165:
            r7 = 0
        L_0x0166:
            if (r41 != 0) goto L_0x018c
            int r9 = r5.f4308X
            if (r9 != 0) goto L_0x0170
            r19 = 1
        L_0x016e:
            r8 = 1
            goto L_0x0173
        L_0x0170:
            r19 = 0
            goto L_0x016e
        L_0x0173:
            if (r9 != r8) goto L_0x0179
            r17 = 1
        L_0x0177:
            r8 = 2
            goto L_0x017c
        L_0x0179:
            r17 = 0
            goto L_0x0177
        L_0x017c:
            if (r9 != r8) goto L_0x0180
            r9 = 1
            goto L_0x0181
        L_0x0180:
            r9 = 0
        L_0x0181:
            r25 = r7
            r20 = r17
            r23 = r19
            r8 = 0
            r17 = r6
            r6 = r4
            goto L_0x01ad
        L_0x018c:
            int r9 = r5.f4309Y
            if (r9 != 0) goto L_0x0194
            r20 = 1
        L_0x0192:
            r8 = 1
            goto L_0x0197
        L_0x0194:
            r20 = 0
            goto L_0x0192
        L_0x0197:
            if (r9 != r8) goto L_0x019e
            r8 = 1
        L_0x019a:
            r17 = r6
            r6 = 2
            goto L_0x01a0
        L_0x019e:
            r8 = 0
            goto L_0x019a
        L_0x01a0:
            if (r9 != r6) goto L_0x01a4
            r9 = 1
            goto L_0x01a5
        L_0x01a4:
            r9 = 0
        L_0x01a5:
            r6 = r4
            r25 = r7
            r23 = r20
            r20 = r8
            r8 = 0
        L_0x01ad:
            r.c[] r7 = r0.f4290F
            r26 = r7
            if (r8 != 0) goto L_0x027a
            r.c[] r7 = r6.f4290F
            r7 = r7[r14]
            if (r9 == 0) goto L_0x01bc
            r28 = 1
            goto L_0x01be
        L_0x01bc:
            r28 = 4
        L_0x01be:
            int r30 = r7.c()
            r31 = r8
            int[] r8 = r6.f4315c0
            r32 = r8
            r8 = r32[r41]
            r33 = r9
            r9 = 3
            if (r8 != r9) goto L_0x01d7
            int[] r8 = r6.f4323l
            r8 = r8[r41]
            if (r8 != 0) goto L_0x01d7
            r8 = 1
            goto L_0x01d8
        L_0x01d7:
            r8 = 0
        L_0x01d8:
            r.c r9 = r7.f4283d
            if (r9 == 0) goto L_0x01e4
            if (r6 == r4) goto L_0x01e4
            int r9 = r9.c()
            int r30 = r9 + r30
        L_0x01e4:
            r9 = r30
            if (r33 == 0) goto L_0x01ee
            if (r6 == r4) goto L_0x01ee
            if (r6 == r11) goto L_0x01ee
            r28 = 5
        L_0x01ee:
            r30 = r8
            r.c r8 = r7.f4283d
            if (r8 == 0) goto L_0x0222
            if (r6 != r11) goto L_0x0203
            r34 = r12
            q.i r12 = r7.f4285g
            q.i r8 = r8.f4285g
            r35 = r13
            r13 = 6
            r1.f(r12, r8, r9, r13)
            goto L_0x0210
        L_0x0203:
            r34 = r12
            r35 = r13
            q.i r12 = r7.f4285g
            q.i r8 = r8.f4285g
            r13 = 8
            r1.f(r12, r8, r9, r13)
        L_0x0210:
            if (r30 == 0) goto L_0x0216
            if (r33 != 0) goto L_0x0216
            r8 = 5
            goto L_0x0218
        L_0x0216:
            r8 = r28
        L_0x0218:
            q.i r12 = r7.f4285g
            r.c r7 = r7.f4283d
            q.i r7 = r7.f4285g
            r1.e(r12, r7, r9, r8)
            goto L_0x0226
        L_0x0222:
            r34 = r12
            r35 = r13
        L_0x0226:
            r.c[] r7 = r6.f4290F
            if (r25 == 0) goto L_0x0253
            int r8 = r6.f4306V
            r13 = 8
            if (r8 == r13) goto L_0x0245
            r8 = r32[r41]
            r9 = 3
            if (r8 != r9) goto L_0x0245
            int r8 = r14 + 1
            r8 = r7[r8]
            q.i r8 = r8.f4285g
            r9 = r7[r14]
            q.i r9 = r9.f4285g
            r12 = 0
            r13 = 5
            r1.f(r8, r9, r12, r13)
            goto L_0x0246
        L_0x0245:
            r12 = 0
        L_0x0246:
            r8 = r7[r14]
            q.i r8 = r8.f4285g
            r9 = r26[r14]
            q.i r9 = r9.f4285g
            r13 = 8
            r1.f(r8, r9, r12, r13)
        L_0x0253:
            int r8 = r14 + 1
            r7 = r7[r8]
            r.c r7 = r7.f4283d
            if (r7 == 0) goto L_0x0269
            r.d r7 = r7.b
            r.c[] r8 = r7.f4290F
            r8 = r8[r14]
            r.c r8 = r8.f4283d
            if (r8 == 0) goto L_0x0269
            r.d r8 = r8.b
            if (r8 == r6) goto L_0x026b
        L_0x0269:
            r7 = r16
        L_0x026b:
            if (r7 == 0) goto L_0x0271
            r6 = r7
            r8 = r31
            goto L_0x0272
        L_0x0271:
            r8 = 1
        L_0x0272:
            r9 = r33
            r12 = r34
            r13 = r35
            goto L_0x01ad
        L_0x027a:
            r33 = r9
            r34 = r12
            r35 = r13
            if (r3 == 0) goto L_0x02dc
            r.c[] r6 = r10.f4290F
            int r7 = r14 + 1
            r6 = r6[r7]
            r.c r6 = r6.f4283d
            if (r6 == 0) goto L_0x02dc
            r.c[] r6 = r3.f4290F
            r6 = r6[r7]
            int[] r8 = r3.f4315c0
            r8 = r8[r41]
            r9 = 3
            if (r8 != r9) goto L_0x02b3
            int[] r8 = r3.f4323l
            r8 = r8[r41]
            if (r8 != 0) goto L_0x02b3
            if (r33 != 0) goto L_0x02b3
            r.c r8 = r6.f4283d
            r.d r9 = r8.b
            if (r9 != r0) goto L_0x02b3
            q.i r9 = r6.f4285g
            q.i r8 = r8.f4285g
            int r12 = r6.c()
            int r12 = -r12
            r13 = 5
            r1.e(r9, r8, r12, r13)
            goto L_0x02c9
        L_0x02b3:
            r13 = 5
            if (r33 == 0) goto L_0x02c9
            r.c r8 = r6.f4283d
            r.d r9 = r8.b
            if (r9 != r0) goto L_0x02c9
            q.i r9 = r6.f4285g
            q.i r8 = r8.f4285g
            int r12 = r6.c()
            int r12 = -r12
            r13 = 4
            r1.e(r9, r8, r12, r13)
        L_0x02c9:
            q.i r8 = r6.f4285g
            r.c[] r9 = r10.f4290F
            r7 = r9[r7]
            r.c r7 = r7.f4283d
            q.i r7 = r7.f4285g
            int r6 = r6.c()
            int r6 = -r6
            r13 = 6
            r1.g(r8, r7, r6, r13)
        L_0x02dc:
            if (r25 == 0) goto L_0x02f3
            int r6 = r14 + 1
            r7 = r26[r6]
            q.i r7 = r7.f4285g
            r.c[] r8 = r10.f4290F
            r6 = r8[r6]
            q.i r8 = r6.f4285g
            int r6 = r6.c()
            r13 = 8
            r1.f(r7, r8, r6, r13)
        L_0x02f3:
            java.util.ArrayList r6 = r2.f4271h
            if (r6 == 0) goto L_0x0416
            int r7 = r6.size()
            r8 = 1
            if (r7 <= r8) goto L_0x0416
            boolean r9 = r2.f4277n
            if (r9 == 0) goto L_0x030b
            boolean r9 = r2.f4279p
            if (r9 != 0) goto L_0x030b
            int r9 = r2.f4273j
            float r9 = (float) r9
            r17 = r9
        L_0x030b:
            r9 = r16
            r12 = 0
            r13 = 0
        L_0x030f:
            if (r12 >= r7) goto L_0x0416
            java.lang.Object r19 = r6.get(r12)
            r8 = r19
            r.d r8 = (r.C0472d) r8
            float[] r0 = r8.f4310Z
            r0 = r0[r41]
            r19 = r0
            r.c[] r0 = r8.f4290F
            r25 = r0
            int r26 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r26 >= 0) goto L_0x0348
            boolean r0 = r2.f4279p
            if (r0 == 0) goto L_0x0340
            int r0 = r14 + 1
            r0 = r25[r0]
            q.i r0 = r0.f4285g
            r8 = r25[r14]
            q.i r8 = r8.f4285g
            r27 = r6
            r28 = r7
            r6 = 0
            r7 = 4
            r1.e(r0, r8, r6, r7)
            r8 = 0
            goto L_0x035f
        L_0x0340:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0342:
            r27 = r6
            r28 = r7
            r7 = 4
            goto L_0x034b
        L_0x0348:
            r0 = r19
            goto L_0x0342
        L_0x034b:
            int r6 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r6 != 0) goto L_0x0367
            int r0 = r14 + 1
            r0 = r25[r0]
            q.i r0 = r0.f4285g
            r6 = r25[r14]
            q.i r6 = r6.f4285g
            r7 = 8
            r8 = 0
            r1.e(r0, r6, r8, r7)
        L_0x035f:
            r30 = r12
            r26 = r14
            r19 = 0
            goto L_0x0409
        L_0x0367:
            r19 = 0
            if (r9 == 0) goto L_0x03fd
            r.c[] r7 = r9.f4290F
            r9 = r7[r14]
            q.i r9 = r9.f4285g
            int r30 = r14 + 1
            r7 = r7[r30]
            q.i r7 = r7.f4285g
            r31 = r0
            r0 = r25[r14]
            q.i r0 = r0.f4285g
            r32 = r6
            r6 = r25[r30]
            q.i r6 = r6.f4285g
            r25 = r8
            q.c r8 = r1.k()
            r30 = r12
            r12 = 0
            r8.b = r12
            r18 = 0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r36 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r36 == 0) goto L_0x039a
            int r36 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r36 != 0) goto L_0x03a1
        L_0x039a:
            r26 = r14
            r12 = 1065353216(0x3f800000, float:1.0)
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x03e5
        L_0x03a1:
            int r36 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r36 != 0) goto L_0x03b4
            q.b r0 = r8.f3814d
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.i(r9, r6)
            q.b r0 = r8.f3814d
            r0.i(r7, r12)
        L_0x03b1:
            r26 = r14
            goto L_0x03f9
        L_0x03b4:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r32 != 0) goto L_0x03c5
            q.b r7 = r8.f3814d
            r7.i(r0, r12)
            q.b r0 = r8.f3814d
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.i(r6, r7)
            goto L_0x03b1
        L_0x03c5:
            float r13 = r13 / r17
            float r26 = r31 / r17
            float r13 = r13 / r26
            r26 = r14
            q.b r14 = r8.f3814d
            r14.i(r9, r12)
            q.b r9 = r8.f3814d
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.i(r7, r14)
            q.b r7 = r8.f3814d
            r7.i(r6, r13)
            q.b r6 = r8.f3814d
            float r7 = -r13
            r6.i(r0, r7)
            goto L_0x03f9
        L_0x03e5:
            q.b r13 = r8.f3814d
            r13.i(r9, r12)
            q.b r9 = r8.f3814d
            r9.i(r7, r14)
            q.b r7 = r8.f3814d
            r7.i(r6, r12)
            q.b r6 = r8.f3814d
            r6.i(r0, r14)
        L_0x03f9:
            r1.c(r8)
            goto L_0x0405
        L_0x03fd:
            r31 = r0
            r25 = r8
            r30 = r12
            r26 = r14
        L_0x0405:
            r9 = r25
            r13 = r31
        L_0x0409:
            int r12 = r30 + 1
            r0 = r39
            r14 = r26
            r6 = r27
            r7 = r28
            r8 = 1
            goto L_0x030f
        L_0x0416:
            r26 = r14
            r19 = 0
            if (r11 == 0) goto L_0x0421
            if (r11 == r3) goto L_0x0425
            if (r33 == 0) goto L_0x0421
            goto L_0x0425
        L_0x0421:
            r0 = r3
            r17 = 2
            goto L_0x0479
        L_0x0425:
            r.c[] r0 = r4.f4290F
            r0 = r0[r26]
            r.c[] r2 = r10.f4290F
            int r14 = r26 + 1
            r2 = r2[r14]
            r.c r0 = r0.f4283d
            if (r0 == 0) goto L_0x0436
            q.i r0 = r0.f4285g
            goto L_0x0438
        L_0x0436:
            r0 = r16
        L_0x0438:
            r.c r2 = r2.f4283d
            if (r2 == 0) goto L_0x0440
            q.i r2 = r2.f4285g
            r6 = r2
            goto L_0x0442
        L_0x0440:
            r6 = r16
        L_0x0442:
            r.c[] r2 = r11.f4290F
            r2 = r2[r26]
            r.c[] r4 = r3.f4290F
            r4 = r4[r14]
            if (r0 == 0) goto L_0x0472
            if (r6 == 0) goto L_0x0472
            if (r41 != 0) goto L_0x0453
            float r5 = r5.f4303S
            goto L_0x0455
        L_0x0453:
            float r5 = r5.f4304T
        L_0x0455:
            int r7 = r2.c()
            int r8 = r4.c()
            q.i r2 = r2.f4285g
            q.i r4 = r4.f4285g
            r9 = 7
            r17 = r3
            r3 = r0
            r0 = r17
            r17 = r7
            r7 = r4
            r4 = r17
            r17 = 2
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0475
        L_0x0472:
            r0 = r3
            r17 = 2
        L_0x0475:
            r1 = r40
            goto L_0x0668
        L_0x0479:
            if (r23 == 0) goto L_0x055d
            if (r11 == 0) goto L_0x055d
            int r1 = r2.f4273j
            if (r1 <= 0) goto L_0x0488
            int r2 = r2.f4272i
            if (r2 != r1) goto L_0x0488
            r22 = 1
            goto L_0x048a
        L_0x0488:
            r22 = 0
        L_0x048a:
            r12 = r11
            r13 = r12
        L_0x048c:
            if (r12 == 0) goto L_0x0475
            r.d[] r1 = r12.f4313b0
            r1 = r1[r41]
            r14 = r1
        L_0x0493:
            if (r14 == 0) goto L_0x04a0
            int r1 = r14.f4306V
            r5 = 8
            if (r1 != r5) goto L_0x04a2
            r.d[] r1 = r14.f4313b0
            r14 = r1[r41]
            goto L_0x0493
        L_0x04a0:
            r5 = 8
        L_0x04a2:
            if (r14 != 0) goto L_0x04b1
            if (r12 != r0) goto L_0x04a7
            goto L_0x04b1
        L_0x04a7:
            r37 = r4
            r18 = r13
            r13 = 8
            r29 = 5
            goto L_0x0550
        L_0x04b1:
            r.c[] r1 = r12.f4290F
            r2 = r1[r26]
            q.i r3 = r2.f4285g
            r.c r6 = r2.f4283d
            if (r6 == 0) goto L_0x04be
            q.i r6 = r6.f4285g
            goto L_0x04c0
        L_0x04be:
            r6 = r16
        L_0x04c0:
            if (r13 == r12) goto L_0x04cb
            r.c[] r6 = r13.f4290F
            int r7 = r26 + 1
            r6 = r6[r7]
            q.i r6 = r6.f4285g
            goto L_0x04dc
        L_0x04cb:
            if (r12 != r11) goto L_0x04dc
            if (r13 != r12) goto L_0x04dc
            r.c[] r6 = r4.f4290F
            r6 = r6[r26]
            r.c r6 = r6.f4283d
            if (r6 == 0) goto L_0x04da
            q.i r6 = r6.f4285g
            goto L_0x04dc
        L_0x04da:
            r6 = r16
        L_0x04dc:
            int r2 = r2.c()
            int r7 = r26 + 1
            r8 = r1[r7]
            int r8 = r8.c()
            if (r14 == 0) goto L_0x04f5
            r.c[] r9 = r14.f4290F
            r9 = r9[r26]
            q.i r5 = r9.f4285g
            r1 = r1[r7]
            q.i r1 = r1.f4285g
            goto L_0x0506
        L_0x04f5:
            r.c[] r5 = r10.f4290F
            r5 = r5[r7]
            r.c r9 = r5.f4283d
            if (r9 == 0) goto L_0x0500
            q.i r5 = r9.f4285g
            goto L_0x0502
        L_0x0500:
            r5 = r16
        L_0x0502:
            r1 = r1[r7]
            q.i r1 = r1.f4285g
        L_0x0506:
            if (r9 == 0) goto L_0x050d
            int r9 = r9.c()
            int r8 = r8 + r9
        L_0x050d:
            if (r13 == 0) goto L_0x0518
            r.c[] r9 = r13.f4290F
            r9 = r9[r7]
            int r9 = r9.c()
            int r2 = r2 + r9
        L_0x0518:
            if (r3 == 0) goto L_0x04a7
            if (r6 == 0) goto L_0x04a7
            if (r5 == 0) goto L_0x04a7
            if (r1 == 0) goto L_0x04a7
            if (r12 != r11) goto L_0x052a
            r.c[] r2 = r11.f4290F
            r2 = r2[r26]
            int r2 = r2.c()
        L_0x052a:
            if (r12 != r0) goto L_0x0534
            r.c[] r8 = r0.f4290F
            r7 = r8[r7]
            int r8 = r7.c()
        L_0x0534:
            if (r22 == 0) goto L_0x053e
            r9 = 8
        L_0x0538:
            r7 = r4
            r4 = r2
            r2 = r3
            r3 = r6
            r6 = r5
            goto L_0x0540
        L_0x053e:
            r9 = 5
            goto L_0x0538
        L_0x0540:
            r5 = 1056964608(0x3f000000, float:0.5)
            r37 = r7
            r18 = r13
            r13 = 8
            r29 = 5
            r7 = r1
            r1 = r40
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0550:
            int r1 = r12.f4306V
            if (r1 == r13) goto L_0x0556
            r18 = r12
        L_0x0556:
            r12 = r14
            r13 = r18
            r4 = r37
            goto L_0x048c
        L_0x055d:
            r37 = r4
            r13 = 8
            if (r20 == 0) goto L_0x0475
            if (r11 == 0) goto L_0x0475
            int r1 = r2.f4273j
            if (r1 <= 0) goto L_0x0570
            int r2 = r2.f4272i
            if (r2 != r1) goto L_0x0570
            r22 = 1
            goto L_0x0572
        L_0x0570:
            r22 = 0
        L_0x0572:
            r12 = r11
            r14 = r12
        L_0x0574:
            if (r12 == 0) goto L_0x0613
            r.d[] r1 = r12.f4313b0
            r1 = r1[r41]
        L_0x057a:
            if (r1 == 0) goto L_0x0585
            int r2 = r1.f4306V
            if (r2 != r13) goto L_0x0585
            r.d[] r1 = r1.f4313b0
            r1 = r1[r41]
            goto L_0x057a
        L_0x0585:
            if (r12 == r11) goto L_0x0607
            if (r12 == r0) goto L_0x0607
            if (r1 == 0) goto L_0x0607
            if (r1 != r0) goto L_0x058f
            r1 = r16
        L_0x058f:
            r.c[] r2 = r12.f4290F
            r3 = r2[r26]
            r4 = r2
            q.i r2 = r3.f4285g
            r.c[] r5 = r14.f4290F
            int r6 = r26 + 1
            r5 = r5[r6]
            q.i r5 = r5.f4285g
            int r3 = r3.c()
            r7 = r4[r6]
            int r7 = r7.c()
            if (r1 == 0) goto L_0x05ba
            r.c[] r4 = r1.f4290F
            r4 = r4[r26]
            q.i r8 = r4.f4285g
            r.c r9 = r4.f4283d
            if (r9 == 0) goto L_0x05b7
            q.i r9 = r9.f4285g
            goto L_0x05cf
        L_0x05b7:
            r9 = r16
            goto L_0x05cf
        L_0x05ba:
            r.c[] r8 = r0.f4290F
            r8 = r8[r26]
            if (r8 == 0) goto L_0x05c3
            q.i r9 = r8.f4285g
            goto L_0x05c5
        L_0x05c3:
            r9 = r16
        L_0x05c5:
            r4 = r4[r6]
            q.i r4 = r4.f4285g
            r38 = r9
            r9 = r4
            r4 = r8
            r8 = r38
        L_0x05cf:
            if (r4 == 0) goto L_0x05d6
            int r4 = r4.c()
            int r7 = r7 + r4
        L_0x05d6:
            r.c[] r4 = r14.f4290F
            r4 = r4[r6]
            int r4 = r4.c()
            int r4 = r4 + r3
            r6 = r8
            r8 = r7
            r7 = r9
            if (r22 == 0) goto L_0x05e7
            r9 = 8
            goto L_0x05e8
        L_0x05e7:
            r9 = 4
        L_0x05e8:
            if (r2 == 0) goto L_0x05fe
            if (r5 == 0) goto L_0x05fe
            if (r6 == 0) goto L_0x05fe
            if (r7 == 0) goto L_0x05fe
            r3 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r18 = r1
            r28 = 4
            r1 = r40
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            goto L_0x0604
        L_0x05fe:
            r2 = r40
            r18 = r1
            r28 = 4
        L_0x0604:
            r1 = r18
            goto L_0x060b
        L_0x0607:
            r2 = r40
            r28 = 4
        L_0x060b:
            int r3 = r12.f4306V
            if (r3 == r13) goto L_0x0610
            r14 = r12
        L_0x0610:
            r12 = r1
            goto L_0x0574
        L_0x0613:
            r2 = r40
            r.c[] r1 = r11.f4290F
            r1 = r1[r26]
            r7 = r37
            r.c[] r3 = r7.f4290F
            r3 = r3[r26]
            r.c r3 = r3.f4283d
            r.c[] r4 = r0.f4290F
            int r14 = r26 + 1
            r12 = r4[r14]
            r.c[] r4 = r10.f4290F
            r4 = r4[r14]
            r.c r13 = r4.f4283d
            r9 = 5
            if (r3 == 0) goto L_0x063d
            if (r11 == r0) goto L_0x063f
            q.i r4 = r1.f4285g
            q.i r3 = r3.f4285g
            int r1 = r1.c()
            r2.e(r4, r3, r1, r9)
        L_0x063d:
            r1 = r2
            goto L_0x0658
        L_0x063f:
            if (r13 == 0) goto L_0x063d
            q.i r2 = r1.f4285g
            q.i r3 = r3.f4285g
            int r4 = r1.c()
            q.i r6 = r12.f4285g
            q.i r7 = r13.f4285g
            int r8 = r12.c()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r40
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0658:
            if (r13 == 0) goto L_0x0668
            if (r11 == r0) goto L_0x0668
            q.i r2 = r12.f4285g
            q.i r3 = r13.f4285g
            int r4 = r12.c()
            int r4 = -r4
            r1.e(r2, r3, r4, r9)
        L_0x0668:
            if (r23 != 0) goto L_0x066c
            if (r20 == 0) goto L_0x06bd
        L_0x066c:
            if (r11 == 0) goto L_0x06bd
            if (r11 == r0) goto L_0x06bd
            r.c[] r2 = r11.f4290F
            r3 = r2[r26]
            r.c[] r4 = r0.f4290F
            int r14 = r26 + 1
            r4 = r4[r14]
            r.c r5 = r3.f4283d
            if (r5 == 0) goto L_0x0681
            q.i r5 = r5.f4285g
            goto L_0x0683
        L_0x0681:
            r5 = r16
        L_0x0683:
            r.c r6 = r4.f4283d
            if (r6 == 0) goto L_0x068a
            q.i r6 = r6.f4285g
            goto L_0x068c
        L_0x068a:
            r6 = r16
        L_0x068c:
            if (r10 == r0) goto L_0x069c
            r.c[] r6 = r10.f4290F
            r6 = r6[r14]
            r.c r6 = r6.f4283d
            if (r6 == 0) goto L_0x069a
            q.i r6 = r6.f4285g
            r16 = r6
        L_0x069a:
            r6 = r16
        L_0x069c:
            if (r11 != r0) goto L_0x06a0
            r4 = r2[r14]
        L_0x06a0:
            if (r5 == 0) goto L_0x06bd
            if (r6 == 0) goto L_0x06bd
            int r2 = r3.c()
            r.c[] r0 = r0.f4290F
            r0 = r0[r14]
            int r8 = r0.c()
            q.i r0 = r3.f4285g
            q.i r7 = r4.f4285g
            r9 = 5
            r3 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r4 = r2
            r2 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06bd:
            int r15 = r15 + 1
            r0 = r39
            r1 = r40
            r14 = r26
            r12 = r34
            r13 = r35
            goto L_0x0015
        L_0x06cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.j.a(r.e, q.e, int):void");
    }
}

package z;

/* renamed from: z.c  reason: case insensitive filesystem */
public abstract class C0504c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4858a = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C0504c.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0348
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x0337
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0337
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0040
            if (r10 > r3) goto L_0x0040
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0046
        L_0x0040:
            r34 = r3
            r16 = 1
            goto L_0x032b
        L_0x0046:
            int[] r9 = w.C0491a.f4745a
            if (r2 != 0) goto L_0x004f
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x0053
        L_0x004f:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x0053:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            r15 = 31
            if (r13 == r10) goto L_0x0092
            java.lang.ThreadLocal r10 = f4858a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x0072
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x0074
        L_0x0072:
            r12 = r16
        L_0x0074:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L_0x0080
            if (r10 > r15) goto L_0x0080
            goto L_0x0092
        L_0x0080:
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008d }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008d }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008d }
            goto L_0x0096
        L_0x008d:
            int r10 = r9.getColor(r7, r14)
            goto L_0x0096
        L_0x0092:
            int r10 = r9.getColor(r7, r14)
        L_0x0096:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a3
            float r11 = r9.getFloat(r4, r13)
            goto L_0x00b0
        L_0x00a3:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00ae
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b0
        L_0x00ae:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b0:
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 4
            r16 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r15) goto L_0x00c5
            r12 = 2
            boolean r15 = r9.hasValue(r12)
            if (r15 == 0) goto L_0x00c5
            float r4 = r9.getFloat(r12, r4)
            goto L_0x00c9
        L_0x00c5:
            float r4 = r9.getFloat(r14, r4)
        L_0x00c9:
            r9.recycle()
            int r9 = r1.getAttributeCount()
            int[] r12 = new int[r9]
            r13 = 0
            r15 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            if (r15 >= r9) goto L_0x0105
            int r14 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto L_0x00fe
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto L_0x00fe
            r7 = 2130903084(0x7f03002c, float:1.7412976E38)
            if (r14 == r7) goto L_0x00fe
            r7 = 2130903619(0x7f030243, float:1.7414061E38)
            if (r14 == r7) goto L_0x00fe
            int r7 = r13 + 1
            r0 = 0
            boolean r20 = r1.getAttributeBooleanValue(r15, r0)
            if (r20 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            int r14 = -r14
        L_0x00fb:
            r12[r13] = r14
            r13 = r7
        L_0x00fe:
            int r15 = r15 + 1
            r0 = r36
            r7 = 0
            r14 = 4
            goto L_0x00d6
        L_0x0105:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r13)
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x0116
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x0116
            r12 = 1
            goto L_0x0117
        L_0x0116:
            r12 = 0
        L_0x0117:
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0123
            if (r12 != 0) goto L_0x0123
            r31 = r0
            r34 = r3
            goto L_0x02e6
        L_0x0123:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = A.i.l(r11, r14, r13)
            if (r12 == 0) goto L_0x02da
            z.a r10 = z.C0502a.a(r10)
            z.o r12 = z.C0516o.f4872k
            float r13 = r10.b
            double r14 = (double) r13
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r22 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r22 < 0) goto L_0x015c
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 0
            int r22 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x015c
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r22 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r22 < 0) goto L_0x0162
        L_0x015c:
            r31 = r0
            r34 = r3
            goto L_0x02d5
        L_0x0162:
            float r10 = r10.f4849a
            int r14 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x016a
            r10 = 0
            goto L_0x0170
        L_0x016a:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0170:
            r15 = r13
            r7 = 0
            r20 = 1
            r21 = 0
            r22 = 1120403456(0x42c80000, float:100.0)
        L_0x0178:
            float r23 = r21 - r13
            float r23 = java.lang.Math.abs(r23)
            r24 = 1053609165(0x3ecccccd, float:0.4)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 < 0) goto L_0x02c5
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 1148846080(0x447a0000, float:1000.0)
            r25 = 0
            r26 = 1120403456(0x42c80000, float:100.0)
            r27 = 0
        L_0x018f:
            float r28 = r25 - r26
            float r28 = java.lang.Math.abs(r28)
            r29 = 1008981770(0x3c23d70a, float:0.01)
            r30 = 1073741824(0x40000000, float:2.0)
            int r28 = (r28 > r29 ? 1 : (r28 == r29 ? 0 : -1))
            if (r28 <= 0) goto L_0x0287
            float r28 = r26 - r25
            float r28 = r28 / r30
            r29 = 0
            float r9 = r28 + r25
            z.a r14 = z.C0502a.b(r9, r15, r10)
            r31 = r0
            z.o r0 = z.C0516o.f4872k
            int r0 = r14.c(r0)
            int r14 = android.graphics.Color.red(r0)
            float r14 = z.C0503b.f(r14)
            int r32 = android.graphics.Color.green(r0)
            float r32 = z.C0503b.f(r32)
            int r33 = android.graphics.Color.blue(r0)
            float r33 = z.C0503b.f(r33)
            float[][] r34 = z.C0503b.f4855d
            r34 = r34[r16]
            r19 = 0
            r35 = r34[r19]
            float r14 = r14 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r14
            r17 = 2
            r14 = r34[r17]
            float r33 = r33 * r14
            float r33 = r33 + r32
            float r14 = r33 / r22
            r32 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
            if (r32 > 0) goto L_0x01f3
            r32 = 1147261687(0x4461d2f7, float:903.2963)
            float r14 = r14 * r32
            r32 = r0
            goto L_0x0203
        L_0x01f3:
            r32 = r0
            double r0 = (double) r14
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r14 = r0 - r1
        L_0x0203:
            float r0 = r4 - r14
            float r0 = java.lang.Math.abs(r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0266
            z.a r1 = z.C0502a.a(r32)
            r32 = r0
            float r0 = r1.f4850c
            float r2 = r1.b
            z.a r0 = z.C0502a.b(r0, r2, r10)
            float r2 = r1.f4851d
            r33 = r2
            float r2 = r0.f4851d
            float r2 = r33 - r2
            r33 = r2
            float r2 = r1.f4852e
            r34 = r2
            float r2 = r0.f4852e
            float r2 = r34 - r2
            r34 = r2
            float r2 = r1.f
            float r0 = r0.f
            float r2 = r2 - r0
            float r0 = r33 * r33
            float r33 = r34 * r34
            float r33 = r33 + r0
            float r2 = r2 * r2
            float r2 = r2 + r33
            r33 = r1
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            r34 = r3
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 > 0) goto L_0x0268
            r24 = r0
            r23 = r32
            r27 = r33
            goto L_0x0268
        L_0x0266:
            r34 = r3
        L_0x0268:
            int r0 = (r23 > r29 ? 1 : (r23 == r29 ? 0 : -1))
            if (r0 != 0) goto L_0x0273
            int r0 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r0 != 0) goto L_0x0273
        L_0x0270:
            r0 = r27
            goto L_0x0290
        L_0x0273:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            r25 = r9
            goto L_0x027c
        L_0x027a:
            r26 = r9
        L_0x027c:
            r1 = r38
            r2 = r39
            r0 = r31
            r3 = r34
            r9 = 0
            goto L_0x018f
        L_0x0287:
            r31 = r0
            r34 = r3
            r17 = 2
            r29 = 0
            goto L_0x0270
        L_0x0290:
            if (r20 == 0) goto L_0x02ad
            if (r0 == 0) goto L_0x029a
            int r0 = r0.c(r12)
        L_0x0298:
            r10 = r0
            goto L_0x02de
        L_0x029a:
            float r0 = r13 - r21
            float r0 = r0 / r30
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r0 = r31
            r3 = r34
            r9 = 0
            r20 = 0
            goto L_0x0178
        L_0x02ad:
            if (r0 != 0) goto L_0x02b1
            r13 = r15
            goto L_0x02b4
        L_0x02b1:
            r7 = r0
            r21 = r15
        L_0x02b4:
            float r0 = r13 - r21
            float r0 = r0 / r30
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r0 = r31
            r3 = r34
            r9 = 0
            goto L_0x0178
        L_0x02c5:
            r31 = r0
            r34 = r3
            if (r7 != 0) goto L_0x02d0
            int r0 = z.C0503b.e(r4)
            goto L_0x0298
        L_0x02d0:
            int r0 = r7.c(r12)
            goto L_0x0298
        L_0x02d5:
            int r0 = z.C0503b.e(r4)
            goto L_0x0298
        L_0x02da:
            r31 = r0
            r34 = r3
        L_0x02de:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02e6:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x02fc
            r1 = 4
            if (r8 > r1) goto L_0x02f3
            r1 = 8
            goto L_0x02f5
        L_0x02f3:
            int r1 = r8 * 2
        L_0x02f5:
            int[] r1 = new int[r1]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r1, r14, r8)
            r5 = r1
        L_0x02fc:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x031a
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            int r2 = r8 * 2
        L_0x030f:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r14 = 0
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            r6 = r1
        L_0x031a:
            r6[r8] = r31
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r3 = r34
            r4 = 1
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x032b:
            r0 = r36
            r1 = r38
            r2 = r39
            r3 = r34
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x0337:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r0, r14, r8)
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0348:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C0504c.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}

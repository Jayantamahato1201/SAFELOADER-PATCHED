package g;

import B.d;
import Q0.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: g.e  reason: case insensitive filesystem */
public final class C0162e extends C0164g implements d {

    /* renamed from: n  reason: collision with root package name */
    public C0159b f2772n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2773o;

    /* renamed from: p  reason: collision with root package name */
    public C0159b f2774p;

    /* renamed from: q  reason: collision with root package name */
    public l f2775q;

    /* renamed from: r  reason: collision with root package name */
    public int f2776r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f2777s = -1;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2778t;

    public C0162e(C0159b bVar, Resources resources) {
        this.f2784e = 255;
        this.f2785g = -1;
        d(new C0159b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0279, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.C0162e e(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            java.lang.String r5 = r2.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x027a
            g.e r5 = new g.e
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = h.C0172c.f2897a
            android.content.res.TypedArray r7 = z.C0503b.g(r1, r4, r3, r7)
            r8 = 1
            boolean r9 = r7.getBoolean(r8, r8)
            r5.setVisible(r9, r8)
            g.b r9 = r5.f2774p
            int r10 = r9.f2746d
            int r11 = h.C0171b.b(r7)
            r10 = r10 | r11
            r9.f2746d = r10
            boolean r10 = r9.f2750i
            r11 = 2
            boolean r10 = r7.getBoolean(r11, r10)
            r9.f2750i = r10
            boolean r10 = r9.f2753l
            r12 = 3
            boolean r10 = r7.getBoolean(r12, r10)
            r9.f2753l = r10
            int r10 = r9.f2766y
            r13 = 4
            int r10 = r7.getInt(r13, r10)
            r9.f2766y = r10
            r10 = 5
            int r14 = r9.f2767z
            int r10 = r7.getInt(r10, r14)
            r9.f2767z = r10
            boolean r9 = r9.f2764w
            r10 = 0
            boolean r9 = r7.getBoolean(r10, r9)
            r5.setDither(r9)
            g.b r9 = r5.f2781a
            if (r1 == 0) goto L_0x007e
            r9.b = r1
            android.util.DisplayMetrics r14 = r1.getDisplayMetrics()
            int r14 = r14.densityDpi
            if (r14 != 0) goto L_0x0073
            r14 = 160(0xa0, float:2.24E-43)
        L_0x0073:
            int r15 = r9.f2745c
            r9.f2745c = r14
            if (r15 == r14) goto L_0x0081
            r9.f2754m = r10
            r9.f2751j = r10
            goto L_0x0081
        L_0x007e:
            r9.getClass()
        L_0x0081:
            r7.recycle()
            int r7 = r2.getDepth()
            int r7 = r7 + r8
        L_0x0089:
            int r9 = r2.next()
            if (r9 == r8) goto L_0x0272
            int r14 = r2.getDepth()
            if (r14 >= r7) goto L_0x0097
            if (r9 == r12) goto L_0x0272
        L_0x0097:
            if (r9 == r11) goto L_0x009a
            goto L_0x0089
        L_0x009a:
            if (r14 <= r7) goto L_0x009d
            goto L_0x0089
        L_0x009d:
            java.lang.String r9 = r2.getName()
            java.lang.String r14 = "item"
            boolean r9 = r9.equals(r14)
            r14 = -1
            if (r9 == 0) goto L_0x016e
            int[] r9 = h.C0172c.b
            android.content.res.TypedArray r9 = z.C0503b.g(r1, r4, r3, r9)
            int r15 = r9.getResourceId(r10, r10)
            int r14 = r9.getResourceId(r8, r14)
            if (r14 <= 0) goto L_0x00c3
            k.U0 r6 = k.U0.d()
            android.graphics.drawable.Drawable r6 = r6.f(r0, r14)
            goto L_0x00c4
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            r9.recycle()
            int r9 = r3.getAttributeCount()
            int[] r14 = new int[r9]
            r8 = 0
            r12 = 0
        L_0x00cf:
            if (r12 >= r9) goto L_0x00f3
            int r11 = r3.getAttributeNameResource(r12)
            if (r11 == 0) goto L_0x00ee
            r13 = 16842960(0x10100d0, float:2.369414E-38)
            if (r11 == r13) goto L_0x00ee
            r13 = 16843161(0x1010199, float:2.3694704E-38)
            if (r11 == r13) goto L_0x00ee
            int r13 = r8 + 1
            boolean r16 = r3.getAttributeBooleanValue(r12, r10)
            if (r16 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            int r11 = -r11
        L_0x00eb:
            r14[r8] = r11
            r8 = r13
        L_0x00ee:
            int r12 = r12 + 1
            r11 = 2
            r13 = 4
            goto L_0x00cf
        L_0x00f3:
            int[] r8 = android.util.StateSet.trimStateSet(r14, r8)
            java.lang.String r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x0139
        L_0x00fb:
            int r6 = r2.next()
            r11 = 4
            if (r6 != r11) goto L_0x0103
            goto L_0x00fb
        L_0x0103:
            r11 = 2
            if (r6 != r11) goto L_0x0120
            java.lang.String r6 = r2.getName()
            java.lang.String r11 = "vector"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x011b
            g0.q r6 = new g0.q
            r6.<init>()
            r6.inflate(r1, r2, r3, r4)
            goto L_0x0139
        L_0x011b:
            android.graphics.drawable.Drawable r6 = h.C0171b.a(r25, r26, r27, r28)
            goto L_0x0139
        L_0x0120:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0139:
            if (r6 == 0) goto L_0x0155
            g.b r9 = r5.f2774p
            int r6 = r9.a(r6)
            int[][] r11 = r9.f2741H
            r11[r6] = r8
            n.l r8 = r9.f2743J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r8.d(r6, r9)
        L_0x014e:
            r6 = 0
            r8 = 1
        L_0x0150:
            r11 = 2
            r12 = 3
            r13 = 4
            goto L_0x0089
        L_0x0155:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016e:
            java.lang.String r6 = r2.getName()
            java.lang.String r8 = "transition"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x026c
            int[] r6 = h.C0172c.f2898c
            android.content.res.TypedArray r6 = z.C0503b.g(r1, r4, r3, r6)
            r11 = 2
            int r8 = r6.getResourceId(r11, r14)
            r9 = 1
            int r11 = r6.getResourceId(r9, r14)
            int r12 = r6.getResourceId(r10, r14)
            if (r12 <= 0) goto L_0x019a
            k.U0 r13 = k.U0.d()
            android.graphics.drawable.Drawable r12 = r13.f(r0, r12)
        L_0x0198:
            r13 = 3
            goto L_0x019c
        L_0x019a:
            r12 = 0
            goto L_0x0198
        L_0x019c:
            boolean r15 = r6.getBoolean(r13, r10)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01e6
        L_0x01a7:
            int r12 = r2.next()
            r9 = 4
            if (r12 != r9) goto L_0x01b0
            r9 = 1
            goto L_0x01a7
        L_0x01b0:
            r9 = 2
            if (r12 != r9) goto L_0x01cd
            java.lang.String r12 = r2.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r12.equals(r9)
            if (r9 == 0) goto L_0x01c8
            g0.e r12 = new g0.e
            r12.<init>(r0)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01e6
        L_0x01c8:
            android.graphics.drawable.Drawable r12 = h.C0171b.a(r25, r26, r27, r28)
            goto L_0x01e6
        L_0x01cd:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            if (r12 == 0) goto L_0x0253
            if (r8 == r14) goto L_0x0238
            if (r11 == r14) goto L_0x0238
            g.b r6 = r5.f2774p
            int r9 = r6.a(r12)
            long r13 = (long) r8
            r8 = 32
            long r16 = r13 << r8
            long r11 = (long) r11
            r18 = r9
            r19 = 32
            long r8 = r16 | r11
            if (r15 == 0) goto L_0x0206
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0208
        L_0x0206:
            r16 = 0
        L_0x0208:
            n.e r10 = r6.f2742I
            r0 = r18
            long r0 = (long) r0
            long r20 = r0 | r16
            r22 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r10.a(r8, r0)
            if (r15 == 0) goto L_0x022f
            long r0 = r11 << r19
            long r0 = r0 | r13
            n.e r6 = r6.f2742I
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            long r8 = r22 | r8
            long r8 = r8 | r16
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.a(r0, r8)
        L_0x022f:
            r0 = r24
            r1 = r25
            r6 = 0
            r8 = 1
            r10 = 0
            goto L_0x0150
        L_0x0238:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0253:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x026c:
            r0 = r24
            r1 = r25
            goto L_0x014e
        L_0x0272:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x027a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0162e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.e");
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public final void d(C0159b bVar) {
        this.f2781a = bVar;
        int i2 = this.f2785g;
        if (i2 >= 0) {
            Drawable d2 = bVar.d(i2);
            this.f2782c = d2;
            if (d2 != null) {
                b(d2);
            }
        }
        this.f2783d = null;
        this.f2772n = bVar;
        this.f2774p = bVar;
    }

    public final Drawable f() {
        if (!this.f2773o) {
            super.mutate();
            C0159b bVar = this.f2772n;
            bVar.f2742I = bVar.f2742I.clone();
            bVar.f2743J = bVar.f2743J.clone();
            this.f2773o = true;
        }
        return this;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        l lVar = this.f2775q;
        if (lVar != null) {
            lVar.b0();
            this.f2775q = null;
            c(this.f2776r);
            this.f2776r = -1;
            this.f2777s = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.f2778t) {
            f();
            C0159b bVar = this.f2774p;
            bVar.f2742I = bVar.f2742I.clone();
            bVar.f2743J = bVar.f2743J.clone();
            this.f2778t = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (c(r3) != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            g.b r2 = r0.f2774p
            int r3 = r2.e(r1)
            if (r3 < 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            int[] r3 = android.util.StateSet.WILD_CARD
            int r3 = r2.e(r3)
        L_0x0013:
            int r2 = r0.f2785g
            r4 = 0
            if (r3 == r2) goto L_0x0109
            Q0.l r5 = r0.f2775q
            r6 = 1
            if (r5 == 0) goto L_0x003d
            int r2 = r0.f2776r
            if (r3 != r2) goto L_0x0023
            goto L_0x0108
        L_0x0023:
            int r2 = r0.f2777s
            if (r3 != r2) goto L_0x0038
            boolean r2 = r5.g()
            if (r2 == 0) goto L_0x0038
            r5.W()
            int r2 = r0.f2777s
            r0.f2776r = r2
            r0.f2777s = r3
            goto L_0x0108
        L_0x0038:
            int r2 = r0.f2776r
            r5.b0()
        L_0x003d:
            r5 = 0
            r0.f2775q = r5
            r5 = -1
            r0.f2777s = r5
            r0.f2776r = r5
            g.b r5 = r0.f2774p
            if (r2 >= 0) goto L_0x004e
            r5.getClass()
            r7 = 0
            goto L_0x005e
        L_0x004e:
            n.l r7 = r5.f2743J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r7.c(r2, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x005e:
            if (r3 >= 0) goto L_0x0062
            r8 = 0
            goto L_0x0072
        L_0x0062:
            n.l r8 = r5.f2743J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r8.c(r3, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x0072:
            if (r8 == 0) goto L_0x0102
            if (r7 != 0) goto L_0x0078
            goto L_0x0102
        L_0x0078:
            long r9 = (long) r7
            r7 = 32
            long r9 = r9 << r7
            long r7 = (long) r8
            long r7 = r7 | r9
            n.e r9 = r5.f2742I
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r9 = r9.e(r7, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = (int) r12
            if (r9 >= 0) goto L_0x0094
            goto L_0x0102
        L_0x0094:
            n.e r12 = r5.f2742I
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r12.e(r7, r13)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00b2
            r12 = 1
            goto L_0x00b3
        L_0x00b2:
            r12 = 0
        L_0x00b3:
            r0.c(r9)
            android.graphics.drawable.Drawable r9 = r0.f2782c
            boolean r13 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r13 == 0) goto L_0x00df
            n.e r5 = r5.f2742I
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r5 = r5.e(r7, r10)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r10
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00d7
            r4 = 1
        L_0x00d7:
            g.c r5 = new g.c
            android.graphics.drawable.AnimationDrawable r9 = (android.graphics.drawable.AnimationDrawable) r9
            r5.<init>(r9, r4, r12)
            goto L_0x00f8
        L_0x00df:
            boolean r5 = r9 instanceof g0.C0169e
            if (r5 == 0) goto L_0x00ec
            g.a r5 = new g.a
            g0.e r9 = (g0.C0169e) r9
            r4 = 1
            r5.<init>(r9, r4)
            goto L_0x00f8
        L_0x00ec:
            boolean r5 = r9 instanceof android.graphics.drawable.Animatable
            if (r5 == 0) goto L_0x0102
            g.a r5 = new g.a
            android.graphics.drawable.Animatable r9 = (android.graphics.drawable.Animatable) r9
            r4 = 0
            r5.<init>(r9, r4)
        L_0x00f8:
            r5.a0()
            r0.f2775q = r5
            r0.f2777s = r2
            r0.f2776r = r3
            goto L_0x0108
        L_0x0102:
            boolean r2 = r0.c(r3)
            if (r2 == 0) goto L_0x0109
        L_0x0108:
            r4 = 1
        L_0x0109:
            android.graphics.drawable.Drawable r2 = r0.f2782c
            if (r2 == 0) goto L_0x0113
            boolean r1 = r2.setState(r1)
            r1 = r1 | r4
            return r1
        L_0x0113:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0162e.onStateChange(int[]):boolean");
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        l lVar = this.f2775q;
        if (lVar != null && (visible || z3)) {
            if (z2) {
                lVar.a0();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}

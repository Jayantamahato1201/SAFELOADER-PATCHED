package h1;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import d1.A;
import java.net.ProtocolException;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2922a = 1;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2923c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2924d;

    public /* synthetic */ h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01df, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r23.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h1.h a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r29.getXml(r30)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x029b
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = z.C0504c.b(r0, r3, r4, r1)
            h1.h r1 = new h1.h
            int r2 = r0.getDefaultColor()
            r1.<init>((android.graphics.Shader) r8, (android.content.res.ColorStateList) r0, (int) r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x027b
            int[] r2 = w.C0491a.f4747d
            android.content.res.TypedArray r2 = z.C0503b.g(r0, r1, r4, r2)
            java.lang.String r5 = "http://schemas.android.com/apk/res/android"
            java.lang.String r9 = "startX"
            java.lang.String r9 = r3.getAttributeValue(r5, r9)
            r10 = 0
            if (r9 == 0) goto L_0x007a
            r9 = 1
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            r11 = 0
            if (r9 != 0) goto L_0x0080
            r13 = 0
            goto L_0x0087
        L_0x0080:
            r9 = 8
            float r9 = r2.getFloat(r9, r11)
            r13 = r9
        L_0x0087:
            java.lang.String r9 = "startY"
            java.lang.String r9 = r3.getAttributeValue(r5, r9)
            if (r9 == 0) goto L_0x0097
            r9 = 9
            float r9 = r2.getFloat(r9, r11)
            r14 = r9
            goto L_0x0098
        L_0x0097:
            r14 = 0
        L_0x0098:
            java.lang.String r9 = "endX"
            java.lang.String r9 = r3.getAttributeValue(r5, r9)
            if (r9 == 0) goto L_0x00a8
            r9 = 10
            float r9 = r2.getFloat(r9, r11)
            r15 = r9
            goto L_0x00a9
        L_0x00a8:
            r15 = 0
        L_0x00a9:
            java.lang.String r9 = "endY"
            java.lang.String r9 = r3.getAttributeValue(r5, r9)
            if (r9 == 0) goto L_0x00ba
            r9 = 11
            float r9 = r2.getFloat(r9, r11)
            r16 = r9
            goto L_0x00bc
        L_0x00ba:
            r16 = 0
        L_0x00bc:
            java.lang.String r9 = "centerX"
            java.lang.String r9 = r3.getAttributeValue(r5, r9)
            if (r9 == 0) goto L_0x00c6
            r9 = 1
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            r12 = 3
            if (r9 != 0) goto L_0x00cc
            r9 = 0
            goto L_0x00d0
        L_0x00cc:
            float r9 = r2.getFloat(r12, r11)
        L_0x00d0:
            java.lang.String r8 = "centerY"
            java.lang.String r8 = r3.getAttributeValue(r5, r8)
            if (r8 == 0) goto L_0x00de
            r8 = 4
            float r8 = r2.getFloat(r8, r11)
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            java.lang.String r12 = "type"
            java.lang.String r12 = r3.getAttributeValue(r5, r12)
            if (r12 == 0) goto L_0x00e9
            r12 = 1
            goto L_0x00ea
        L_0x00e9:
            r12 = 0
        L_0x00ea:
            if (r12 != 0) goto L_0x00ee
            r12 = 0
            goto L_0x00f2
        L_0x00ee:
            int r12 = r2.getInt(r6, r10)
        L_0x00f2:
            java.lang.String r6 = "startColor"
            java.lang.String r6 = r3.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x00ff
            int r6 = r2.getColor(r10, r10)
            goto L_0x0100
        L_0x00ff:
            r6 = 0
        L_0x0100:
            java.lang.String r11 = "centerColor"
            java.lang.String r20 = r3.getAttributeValue(r5, r11)
            if (r20 == 0) goto L_0x010b
            r20 = 1
            goto L_0x010d
        L_0x010b:
            r20 = 0
        L_0x010d:
            java.lang.String r11 = r3.getAttributeValue(r5, r11)
            if (r11 == 0) goto L_0x0119
            r11 = 7
            int r11 = r2.getColor(r11, r10)
            goto L_0x011a
        L_0x0119:
            r11 = 0
        L_0x011a:
            java.lang.String r7 = "endColor"
            java.lang.String r7 = r3.getAttributeValue(r5, r7)
            if (r7 == 0) goto L_0x012a
            r7 = 1
            int r22 = r2.getColor(r7, r10)
            r7 = r22
            goto L_0x012b
        L_0x012a:
            r7 = 0
        L_0x012b:
            java.lang.String r10 = "tileMode"
            java.lang.String r10 = r3.getAttributeValue(r5, r10)
            if (r10 == 0) goto L_0x013d
            r10 = 6
            r22 = r13
            r13 = 0
            int r10 = r2.getInt(r10, r13)
            r13 = r10
            goto L_0x0140
        L_0x013d:
            r22 = r13
            r13 = 0
        L_0x0140:
            java.lang.String r10 = "gradientRadius"
            java.lang.String r5 = r3.getAttributeValue(r5, r10)
            if (r5 == 0) goto L_0x0150
            r5 = 5
            r10 = 0
            float r5 = r2.getFloat(r5, r10)
            r10 = r5
            goto L_0x0151
        L_0x0150:
            r10 = 0
        L_0x0151:
            r2.recycle()
            int r2 = r3.getDepth()
            r5 = 1
            int r2 = r2 + r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r23 = r3
            r3 = 20
            r5.<init>(r3)
            r24 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
        L_0x016a:
            int r3 = r23.next()
            r25 = r14
            r14 = 1
            if (r3 == r14) goto L_0x01e0
            int r14 = r23.getDepth()
            r26 = r15
            if (r14 >= r2) goto L_0x017e
            r15 = 3
            if (r3 == r15) goto L_0x01e2
        L_0x017e:
            r15 = 2
            if (r3 == r15) goto L_0x0186
        L_0x0181:
            r14 = r25
            r15 = r26
            goto L_0x016a
        L_0x0186:
            if (r14 > r2) goto L_0x0181
            java.lang.String r3 = r23.getName()
            java.lang.String r14 = "item"
            boolean r3 = r3.equals(r14)
            if (r3 != 0) goto L_0x0195
            goto L_0x0181
        L_0x0195:
            int[] r3 = w.C0491a.f4748e
            android.content.res.TypedArray r3 = z.C0503b.g(r0, r1, r4, r3)
            r14 = 0
            boolean r15 = r3.hasValue(r14)
            r14 = 1
            boolean r21 = r3.hasValue(r14)
            if (r15 == 0) goto L_0x01c5
            if (r21 == 0) goto L_0x01c5
            r15 = 0
            int r27 = r3.getColor(r15, r15)
            r15 = 0
            float r28 = r3.getFloat(r14, r15)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r27)
            r10.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r28)
            r5.add(r3)
            goto L_0x0181
        L_0x01c5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e0:
            r26 = r15
        L_0x01e2:
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x01ee
            F.c r0 = new F.c
            r0.<init>((java.util.ArrayList) r10, (java.util.ArrayList) r5)
            goto L_0x01ef
        L_0x01ee:
            r0 = 0
        L_0x01ef:
            if (r0 == 0) goto L_0x01f3
        L_0x01f1:
            r14 = 1
            goto L_0x0201
        L_0x01f3:
            if (r20 == 0) goto L_0x01fb
            F.c r0 = new F.c
            r0.<init>((int) r6, (int) r11, (int) r7)
            goto L_0x01f1
        L_0x01fb:
            F.c r0 = new F.c
            r0.<init>((int) r6, (int) r7)
            goto L_0x01f1
        L_0x0201:
            if (r12 == r14) goto L_0x023b
            r15 = 2
            if (r12 == r15) goto L_0x022d
            android.graphics.LinearGradient r12 = new android.graphics.LinearGradient
            if (r13 == r14) goto L_0x0214
            if (r13 == r15) goto L_0x0211
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x020e:
            r19 = r1
            goto L_0x0217
        L_0x0211:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x020e
        L_0x0214:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x020e
        L_0x0217:
            java.lang.Object r1 = r0.b
            r17 = r1
            int[] r17 = (int[]) r17
            java.lang.Object r0 = r0.f194c
            r18 = r0
            float[] r18 = (float[]) r18
            r13 = r22
            r14 = r25
            r15 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x026b
        L_0x022d:
            android.graphics.SweepGradient r12 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.f194c
            float[] r0 = (float[]) r0
            r12.<init>(r9, r8, r1, r0)
            goto L_0x026b
        L_0x023b:
            r19 = 0
            int r1 = (r24 > r19 ? 1 : (r24 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0273
            android.graphics.RadialGradient r17 = new android.graphics.RadialGradient
            r14 = 1
            if (r13 == r14) goto L_0x0251
            r15 = 2
            if (r13 == r15) goto L_0x024e
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x024b:
            r23 = r1
            goto L_0x0254
        L_0x024e:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x024b
        L_0x0251:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x024b
        L_0x0254:
            java.lang.Object r1 = r0.b
            r21 = r1
            int[] r21 = (int[]) r21
            java.lang.Object r0 = r0.f194c
            r22 = r0
            float[] r22 = (float[]) r22
            r19 = r8
            r18 = r9
            r20 = r24
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r12 = r17
        L_0x026b:
            h1.h r0 = new h1.h
            r1 = 0
            r13 = 0
            r0.<init>((android.graphics.Shader) r12, (android.content.res.ColorStateList) r1, (int) r13)
            return r0
        L_0x0273:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x027b:
            r23 = r3
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x029b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.h.a(android.content.res.Resources, int, android.content.res.Resources$Theme):h1.h");
    }

    public static h c(String str) {
        int i2;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        A a2 = A.f2221g;
        if (startsWith) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    a2 = A.f2222h;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new h(a2, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public boolean b() {
        ColorStateList colorStateList;
        if (((Shader) this.f2923c) != null || (colorStateList = (ColorStateList) this.f2924d) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        switch (this.f2922a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((A) this.f2923c) == A.f2221g) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(this.b);
                String str2 = (String) this.f2924d;
                if (str2 != null) {
                    sb.append(' ');
                    sb.append(str2);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public h(A a2, int i2, String str) {
        this.f2923c = a2;
        this.b = i2;
        this.f2924d = str;
    }

    public h(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2923c = shader;
        this.f2924d = colorStateList;
        this.b = i2;
    }
}

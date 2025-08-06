package d1;

import java.util.ArrayList;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public String f2359a;
    public String b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f2360c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f2361d;

    /* renamed from: e  reason: collision with root package name */
    public int f2362e = -1;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f2363g;

    /* renamed from: h  reason: collision with root package name */
    public String f2364h;

    public s() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final t a() {
        if (this.f2359a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.f2361d != null) {
            return new t(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fa, code lost:
        if (r2 <= 65535) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r14 == ':') goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x01d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(d1.t r26, java.lang.String r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = r2.length()
            r9 = 0
            int r4 = e1.c.r(r2, r9, r3)
            int r3 = r2.length()
            int r10 = e1.c.s(r2, r4, r3)
            int r3 = r10 - r4
            r8 = 2
            r11 = 58
            r12 = -1
            if (r3 >= r8) goto L_0x0021
        L_0x001f:
            r3 = -1
            goto L_0x0061
        L_0x0021:
            char r3 = r2.charAt(r4)
            r5 = 90
            r6 = 65
            r7 = 122(0x7a, float:1.71E-43)
            r13 = 97
            if (r3 < r13) goto L_0x0031
            if (r3 <= r7) goto L_0x0036
        L_0x0031:
            if (r3 < r6) goto L_0x001f
            if (r3 <= r5) goto L_0x0036
            goto L_0x001f
        L_0x0036:
            int r3 = r4 + 1
        L_0x0038:
            if (r3 >= r10) goto L_0x001f
            char r14 = r2.charAt(r3)
            if (r14 < r13) goto L_0x0042
            if (r14 <= r7) goto L_0x005e
        L_0x0042:
            if (r14 < r6) goto L_0x0046
            if (r14 <= r5) goto L_0x005e
        L_0x0046:
            r15 = 48
            if (r14 < r15) goto L_0x004e
            r15 = 57
            if (r14 <= r15) goto L_0x005e
        L_0x004e:
            r15 = 43
            if (r14 == r15) goto L_0x005e
            r15 = 45
            if (r14 == r15) goto L_0x005e
            r15 = 46
            if (r14 != r15) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            if (r14 != r11) goto L_0x001f
            goto L_0x0061
        L_0x005e:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0061:
            if (r3 == r12) goto L_0x008d
            r3 = 1
            java.lang.String r5 = "https:"
            r6 = 0
            r7 = 6
            boolean r3 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x0077
            java.lang.String r2 = "https"
            r0.f2359a = r2
            int r4 = r4 + 6
            r2 = r27
            goto L_0x0093
        L_0x0077:
            r3 = 1
            java.lang.String r5 = "http:"
            r6 = 0
            r7 = 5
            r2 = r27
            boolean r3 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x008b
            java.lang.String r3 = "http"
            r0.f2359a = r3
            int r4 = r4 + 5
            goto L_0x0093
        L_0x008b:
            r1 = 3
            return r1
        L_0x008d:
            if (r1 == 0) goto L_0x0324
            java.lang.String r3 = r1.f2366a
            r0.f2359a = r3
        L_0x0093:
            r3 = r4
            r5 = 0
        L_0x0095:
            r13 = 47
            r14 = 92
            if (r3 >= r10) goto L_0x00a8
            char r6 = r2.charAt(r3)
            if (r6 == r14) goto L_0x00a3
            if (r6 != r13) goto L_0x00a8
        L_0x00a3:
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L_0x0095
        L_0x00a8:
            java.util.ArrayList r15 = r0.f
            r16 = 1
            r3 = 63
            r6 = 35
            if (r5 >= r8) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            java.lang.String r7 = r1.f2366a
            java.lang.String r8 = r0.f2359a
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00bf
            goto L_0x010a
        L_0x00bf:
            java.lang.String r5 = r1.f()
            r0.b = r5
            java.lang.String r5 = r1.c()
            r0.f2360c = r5
            java.lang.String r5 = r1.f2368d
            r0.f2361d = r5
            int r5 = r1.f2369e
            r0.f2362e = r5
            r15.clear()
            java.util.ArrayList r5 = r1.d()
            r15.addAll(r5)
            if (r4 == r10) goto L_0x00e5
            char r5 = r2.charAt(r4)
            if (r5 != r6) goto L_0x0107
        L_0x00e5:
            java.lang.String r17 = r1.e()
            if (r17 == 0) goto L_0x0104
            int r19 = r17.length()
            r21 = 1
            r22 = 0
            r18 = 0
            java.lang.String r20 = " \"'<>#"
            r23 = 1
            r24 = 1
            java.lang.String r1 = d1.t.a(r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r1 = d1.t.k(r1)
            goto L_0x0105
        L_0x0104:
            r1 = 0
        L_0x0105:
            r0.f2363g = r1
        L_0x0107:
            r1 = r2
            goto L_0x0220
        L_0x010a:
            int r4 = r4 + r5
            r17 = 0
            r18 = 0
        L_0x010f:
            java.lang.String r1 = "@/\\?#"
            int r1 = e1.c.i(r2, r4, r10, r1)
            if (r1 == r10) goto L_0x011c
            char r5 = r2.charAt(r1)
            goto L_0x011d
        L_0x011c:
            r5 = -1
        L_0x011d:
            if (r5 == r12) goto L_0x01b7
            if (r5 == r6) goto L_0x01b7
            if (r5 == r13) goto L_0x01b7
            if (r5 == r14) goto L_0x01b7
            if (r5 == r3) goto L_0x01b7
            r7 = 64
            if (r5 == r7) goto L_0x012e
            r1 = r2
            goto L_0x01ac
        L_0x012e:
            java.lang.String r5 = "%40"
            if (r17 != 0) goto L_0x0184
            r7 = 63
            int r3 = e1.c.h(r2, r4, r1, r11)
            r8 = 35
            r6 = 0
            r19 = 63
            r7 = 0
            r2 = r4
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r20 = r5
            r5 = 1
            r21 = 35
            r8 = 1
            r14 = r1
            r13 = r20
            r1 = r27
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r18 == 0) goto L_0x0166
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r0.b
            r1.append(r4)
            r1.append(r13)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x0166:
            r0.b = r2
            if (r3 == r14) goto L_0x017e
            int r2 = r3 + 1
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r8 = 1
            r1 = r27
            r3 = r14
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f2360c = r2
            r17 = 1
            goto L_0x017f
        L_0x017e:
            r3 = r14
        L_0x017f:
            r1 = r27
            r18 = 1
            goto L_0x01a9
        L_0x0184:
            r3 = r1
            r2 = r4
            r13 = r5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = r0.f2360c
            r14.append(r1)
            r14.append(r13)
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r8 = 1
            r1 = r27
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            r0.f2360c = r2
        L_0x01a9:
            int r2 = r3 + 1
            r4 = r2
        L_0x01ac:
            r2 = r1
            r3 = 63
            r6 = 35
            r13 = 47
            r14 = 92
            goto L_0x010f
        L_0x01b7:
            r3 = r1
            r1 = r2
            r2 = r4
            r4 = r2
        L_0x01bb:
            if (r4 >= r3) goto L_0x01d7
            char r5 = r1.charAt(r4)
            if (r5 == r11) goto L_0x01d8
            r6 = 91
            if (r5 == r6) goto L_0x01c8
            goto L_0x01d4
        L_0x01c8:
            int r4 = r4 + 1
            if (r4 >= r3) goto L_0x01d4
            char r5 = r1.charAt(r4)
            r6 = 93
            if (r5 != r6) goto L_0x01c8
        L_0x01d4:
            int r4 = r4 + 1
            goto L_0x01bb
        L_0x01d7:
            r4 = r3
        L_0x01d8:
            int r5 = r4 + 1
            if (r5 >= r3) goto L_0x0207
            java.lang.String r2 = d1.t.h(r1, r2, r4, r9)
            java.lang.String r2 = e1.c.b(r2)
            r0.f2361d = r2
            java.lang.String r4 = ""
            r8 = 1
            r2 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NumberFormatException -> 0x01ff }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01ff }
            if (r2 <= 0) goto L_0x01fd
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r4) goto L_0x01fd
            goto L_0x0201
        L_0x01fd:
            r2 = -1
            goto L_0x0201
        L_0x01ff:
            goto L_0x01fd
        L_0x0201:
            r0.f2362e = r2
            if (r2 != r12) goto L_0x0219
            r1 = 4
            return r1
        L_0x0207:
            java.lang.String r2 = d1.t.h(r1, r2, r4, r9)
            java.lang.String r2 = e1.c.b(r2)
            r0.f2361d = r2
            java.lang.String r2 = r0.f2359a
            int r2 = d1.t.b(r2)
            r0.f2362e = r2
        L_0x0219:
            java.lang.String r2 = r0.f2361d
            if (r2 != 0) goto L_0x021f
            r1 = 5
            return r1
        L_0x021f:
            r4 = r3
        L_0x0220:
            java.lang.String r2 = "?#"
            int r11 = e1.c.i(r1, r4, r10, r2)
            if (r4 != r11) goto L_0x022a
            goto L_0x02e6
        L_0x022a:
            char r2 = r1.charAt(r4)
            java.lang.String r12 = ""
            r3 = 47
            if (r2 == r3) goto L_0x0243
            r3 = 92
            if (r2 != r3) goto L_0x0239
            goto L_0x0243
        L_0x0239:
            int r2 = r15.size()
            int r2 = r2 + -1
            r15.set(r2, r12)
            goto L_0x024b
        L_0x0243:
            r15.clear()
            r15.add(r12)
            int r4 = r4 + 1
        L_0x024b:
            r2 = r4
        L_0x024c:
            if (r2 >= r11) goto L_0x02e6
            java.lang.String r3 = "/\\"
            int r3 = e1.c.i(r1, r2, r11, r3)
            if (r3 >= r11) goto L_0x0258
            r13 = 1
            goto L_0x0259
        L_0x0258:
            r13 = 0
        L_0x0259:
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"<>^`{}|/\\?#"
            r5 = 1
            r8 = 1
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r4 = "."
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x02df
            java.lang.String r4 = "%2e"
            boolean r4 = r2.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0274
            goto L_0x02df
        L_0x0274:
            java.lang.String r4 = ".."
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x02ba
            java.lang.String r4 = "%2e."
            boolean r4 = r2.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x02ba
            java.lang.String r4 = ".%2e"
            boolean r4 = r2.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x02ba
            java.lang.String r4 = "%2e%2e"
            boolean r4 = r2.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0295
            goto L_0x02ba
        L_0x0295:
            int r4 = r15.size()
            int r4 = r4 + -1
            java.lang.Object r4 = r15.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x02b1
            int r4 = r15.size()
            int r4 = r4 + -1
            r15.set(r4, r2)
            goto L_0x02b4
        L_0x02b1:
            r15.add(r2)
        L_0x02b4:
            if (r13 == 0) goto L_0x02df
            r15.add(r12)
            goto L_0x02df
        L_0x02ba:
            int r2 = r15.size()
            int r2 = r2 + -1
            java.lang.Object r2 = r15.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02dc
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x02dc
            int r2 = r15.size()
            int r2 = r2 + -1
            r15.set(r2, r12)
            goto L_0x02df
        L_0x02dc:
            r15.add(r12)
        L_0x02df:
            if (r13 == 0) goto L_0x02e3
            int r3 = r3 + 1
        L_0x02e3:
            r2 = r3
            goto L_0x024c
        L_0x02e6:
            if (r11 >= r10) goto L_0x030a
            char r2 = r1.charAt(r11)
            r7 = 63
            if (r2 != r7) goto L_0x030a
            r9 = 35
            int r3 = e1.c.h(r1, r11, r10, r9)
            int r2 = r11 + 1
            r6 = 0
            r7 = 1
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r8 = 1
            java.lang.String r2 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r2 = d1.t.k(r2)
            r0.f2363g = r2
            r11 = r3
            goto L_0x030c
        L_0x030a:
            r9 = 35
        L_0x030c:
            if (r11 >= r10) goto L_0x0323
            char r2 = r1.charAt(r11)
            if (r2 != r9) goto L_0x0323
            int r2 = r11 + 1
            r6 = 0
            r7 = 0
            java.lang.String r4 = ""
            r5 = 1
            r8 = 0
            r3 = r10
            java.lang.String r1 = d1.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f2364h = r1
        L_0x0323:
            return r16
        L_0x0324:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.s.b(d1.t, java.lang.String):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2359a);
        sb.append("://");
        if (!this.b.isEmpty() || !this.f2360c.isEmpty()) {
            sb.append(this.b);
            if (!this.f2360c.isEmpty()) {
                sb.append(':');
                sb.append(this.f2360c);
            }
            sb.append('@');
        }
        if (this.f2361d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f2361d);
            sb.append(']');
        } else {
            sb.append(this.f2361d);
        }
        int i2 = this.f2362e;
        if (i2 == -1) {
            i2 = t.b(this.f2359a);
        }
        if (i2 != t.b(this.f2359a)) {
            sb.append(':');
            sb.append(i2);
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (this.f2363g != null) {
            sb.append('?');
            t.g(sb, this.f2363g);
        }
        if (this.f2364h != null) {
            sb.append('#');
            sb.append(this.f2364h);
        }
        return sb.toString();
    }
}

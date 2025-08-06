package d1;

import b0.C0095t;
import java.util.concurrent.TimeUnit;

/* renamed from: d1.i  reason: case insensitive filesystem */
public final class C0116i {

    /* renamed from: n  reason: collision with root package name */
    public static final C0116i f2304n;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2305a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2306c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2307d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2308e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2309g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2310h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2311i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2312j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2313k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2314l;

    /* renamed from: m  reason: collision with root package name */
    public String f2315m;

    static {
        C0095t tVar = new C0095t();
        tVar.f1770a = true;
        new C0116i(tVar);
        C0095t tVar2 = new C0095t();
        tVar2.f1772d = true;
        int i2 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        tVar2.f1771c = i2;
        f2304n = new C0116i(tVar2);
    }

    public C0116i(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f2305a = z2;
        this.b = z3;
        this.f2306c = i2;
        this.f2307d = i3;
        this.f2308e = z4;
        this.f = z5;
        this.f2309g = z6;
        this.f2310h = i4;
        this.f2311i = i5;
        this.f2312j = z7;
        this.f2313k = z8;
        this.f2314l = z9;
        this.f2315m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d1.C0116i a(d1.r r23) {
        /*
            r0 = r23
            int r1 = r0.d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0158
            java.lang.String r2 = r0.b(r6)
            r22 = 1
            java.lang.String r4 = r0.e(r6)
            java.lang.String r5 = "Cache-Control"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0034
            if (r8 == 0) goto L_0x0032
        L_0x0030:
            r7 = 0
            goto L_0x003d
        L_0x0032:
            r8 = r4
            goto L_0x003d
        L_0x0034:
            java.lang.String r5 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x0151
            goto L_0x0030
        L_0x003d:
            r2 = 0
        L_0x003e:
            int r5 = r4.length()
            if (r2 >= r5) goto L_0x0151
            java.lang.String r5 = "=,;"
            int r5 = h1.e.e(r2, r4, r5)
            java.lang.String r2 = r4.substring(r2, r5)
            java.lang.String r2 = r2.trim()
            int r3 = r4.length()
            if (r5 == r3) goto L_0x00ab
            char r3 = r4.charAt(r5)
            r0 = 44
            if (r3 == r0) goto L_0x00ab
            char r0 = r4.charAt(r5)
            r3 = 59
            if (r0 != r3) goto L_0x007c
            goto L_0x00ab
        L_0x0069:
            int r0 = r4.length()
            if (r5 >= r0) goto L_0x007f
            char r0 = r4.charAt(r5)
            r3 = 32
            if (r0 == r3) goto L_0x007c
            r3 = 9
            if (r0 == r3) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            int r5 = r5 + 1
            goto L_0x0069
        L_0x007f:
            int r0 = r4.length()
            if (r5 >= r0) goto L_0x009c
            char r0 = r4.charAt(r5)
            r3 = 34
            if (r0 != r3) goto L_0x009c
            int r5 = r5 + 1
            java.lang.String r0 = "\""
            int r0 = h1.e.e(r5, r4, r0)
            java.lang.String r3 = r4.substring(r5, r0)
            int r0 = r0 + 1
            goto L_0x00af
        L_0x009c:
            java.lang.String r0 = ",;"
            int r0 = h1.e.e(r5, r4, r0)
            java.lang.String r3 = r4.substring(r5, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00ab:
            int r5 = r5 + 1
            r0 = r5
            r3 = 0
        L_0x00af:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00bb
            r5 = -1
            r9 = 1
            goto L_0x014c
        L_0x00bb:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c7
            r5 = -1
            r10 = 1
            goto L_0x014c
        L_0x00c7:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d7
            r5 = -1
            int r2 = h1.e.c(r5, r3)
            r11 = r2
            goto L_0x014c
        L_0x00d7:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e7
            r5 = -1
            int r2 = h1.e.c(r5, r3)
            r12 = r2
            goto L_0x014c
        L_0x00e7:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f2
            r5 = -1
            r13 = 1
            goto L_0x014c
        L_0x00f2:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00fd
            r5 = -1
            r14 = 1
            goto L_0x014c
        L_0x00fd:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0108
            r5 = -1
            r15 = 1
            goto L_0x014c
        L_0x0108:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x011b
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = h1.e.c(r2, r3)
            r16 = r2
            r5 = -1
            goto L_0x014c
        L_0x011b:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x012b
            r5 = -1
            int r2 = h1.e.c(r5, r3)
            r17 = r2
            goto L_0x014c
        L_0x012b:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0137
            r18 = 1
            goto L_0x014c
        L_0x0137:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0142
            r19 = 1
            goto L_0x014c
        L_0x0142:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x014c
            r20 = 1
        L_0x014c:
            r2 = r0
            r0 = r23
            goto L_0x003e
        L_0x0151:
            r5 = -1
            int r6 = r6 + 1
            r0 = r23
            goto L_0x001a
        L_0x0158:
            if (r7 != 0) goto L_0x015d
            r21 = 0
            goto L_0x015f
        L_0x015d:
            r21 = r8
        L_0x015f:
            d1.i r8 = new d1.i
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0116i.a(d1.r):d1.i");
    }

    public final String toString() {
        String str;
        String str2 = this.f2315m;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2305a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i2 = this.f2306c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f2307d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f2308e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.f2309g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f2310h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f2311i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f2312j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2313k) {
            sb.append("no-transform, ");
        }
        if (this.f2314l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.f2315m = str;
        return str;
    }

    public C0116i(C0095t tVar) {
        this.f2305a = tVar.f1770a;
        this.b = tVar.b;
        this.f2306c = -1;
        this.f2307d = -1;
        this.f2308e = false;
        this.f = false;
        this.f2309g = false;
        this.f2310h = tVar.f1771c;
        this.f2311i = -1;
        this.f2312j = tVar.f1772d;
        this.f2313k = false;
        this.f2314l = false;
    }
}

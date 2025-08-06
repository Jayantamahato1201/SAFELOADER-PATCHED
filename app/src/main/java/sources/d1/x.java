package d1;

import Q0.l;
import e1.c;
import java.util.ArrayList;
import java.util.List;
import o1.f;
import o1.h;

public final class x extends l {

    /* renamed from: p  reason: collision with root package name */
    public static final v f2376p = v.a("multipart/form-data");

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f2377q = {58, 32};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f2378r = {13, 10};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f2379s = {45, 45};

    /* renamed from: l  reason: collision with root package name */
    public final h f2380l;

    /* renamed from: m  reason: collision with root package name */
    public final v f2381m;

    /* renamed from: n  reason: collision with root package name */
    public final List f2382n;

    /* renamed from: o  reason: collision with root package name */
    public long f2383o = -1;

    static {
        v.a("multipart/mixed");
        v.a("multipart/alternative");
        v.a("multipart/digest");
        v.a("multipart/parallel");
    }

    public x(h hVar, v vVar, ArrayList arrayList) {
        this.f2380l = hVar;
        this.f2381m = v.a(vVar + "; boundary=" + hVar.o());
        this.f2382n = c.l(arrayList);
    }

    public static void f0(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public final void e0(f fVar) {
        g0(fVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: o1.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g0(o1.f r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            o1.e r1 = new o1.e
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List r3 = r0.f2382n
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x0019:
            o1.h r9 = r0.f2380l
            byte[] r10 = f2379s
            byte[] r11 = f2378r
            if (r8 >= r4) goto L_0x009b
            java.lang.Object r12 = r3.get(r8)
            d1.w r12 = (d1.w) r12
            d1.r r13 = r12.f2375a
            r1.b(r10)
            r1.d(r9)
            r1.b(r11)
            int r9 = r13.d()
            r10 = 0
        L_0x0037:
            if (r10 >= r9) goto L_0x0055
            java.lang.String r14 = r13.b(r10)
            o1.f r14 = r1.h(r14)
            byte[] r15 = f2377q
            o1.f r14 = r14.b(r15)
            java.lang.String r15 = r13.e(r10)
            o1.f r14 = r14.h(r15)
            r14.b(r11)
            int r10 = r10 + 1
            goto L_0x0037
        L_0x0055:
            Q0.l r9 = r12.b
            d1.v r10 = r9.s()
            if (r10 == 0) goto L_0x006c
            java.lang.String r12 = "Content-Type: "
            o1.f r12 = r1.h(r12)
            java.lang.String r10 = r10.f2374a
            o1.f r10 = r12.h(r10)
            r10.b(r11)
        L_0x006c:
            long r12 = r9.r()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0084
            java.lang.String r10 = "Content-Length: "
            o1.f r10 = r1.h(r10)
            o1.f r10 = r10.i(r12)
            r10.b(r11)
            goto L_0x008a
        L_0x0084:
            if (r18 == 0) goto L_0x008a
            r2.k()
            return r14
        L_0x008a:
            r1.b(r11)
            if (r18 == 0) goto L_0x0091
            long r6 = r6 + r12
            goto L_0x0094
        L_0x0091:
            r9.e0(r1)
        L_0x0094:
            r1.b(r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x009b:
            r1.b(r10)
            r1.d(r9)
            r1.b(r10)
            r1.b(r11)
            if (r18 == 0) goto L_0x00af
            long r3 = r2.f3745g
            long r6 = r6 + r3
            r2.k()
        L_0x00af:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x.g0(o1.f, boolean):long");
    }

    public final long r() {
        long j2 = this.f2383o;
        if (j2 != -1) {
            return j2;
        }
        long g02 = g0((f) null, true);
        this.f2383o = g02;
        return g02;
    }

    public final v s() {
        return this.f2381m;
    }
}

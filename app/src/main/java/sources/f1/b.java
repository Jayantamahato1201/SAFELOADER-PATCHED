package f1;

import d1.C;
import d1.F;
import d1.G;
import d1.u;
import d1.z;
import h1.c;
import h1.f;
import java.io.IOException;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2697a;
    public final Object b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f2697a = i2;
        this.b = obj;
    }

    /* JADX INFO: finally extract failed */
    private final G b(f fVar) {
        C c2 = fVar.f;
        g1.f fVar2 = fVar.b;
        boolean z2 = !c2.b.equals("GET");
        z zVar = (z) this.b;
        fVar2.getClass();
        int i2 = fVar.f2917i;
        int i3 = fVar.f2918j;
        int i4 = fVar.f2919k;
        zVar.getClass();
        try {
            c i5 = fVar2.d(i2, i3, i4, zVar.f2427z, z2).i(zVar, fVar, fVar2);
            synchronized (fVar2.f2889d) {
                fVar2.f2896l = i5;
            }
            return fVar.b(c2, fVar2, i5, fVar2.a());
        } catch (IOException e2) {
            throw new g1.c(e2);
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
    }

    public static boolean c(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static G d(G g2) {
        if (g2 == null || g2.f2255l == null) {
            return g2;
        }
        F m2 = g2.m();
        m2.f2244g = null;
        return m2.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: d1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: f1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: f1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: f1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: f1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: d1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: d1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: f1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v75, resolved type: f1.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0510 A[SYNTHETIC, Splitter:B:205:0x0510] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d1.G a(h1.f r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r2 = 0
            r3 = -1
            int r8 = r1.f2697a
            switch(r8) {
                case 0: goto L_0x014f;
                case 1: goto L_0x014a;
                default: goto L_0x000c;
            }
        L_0x000c:
            d1.C r7 = r0.f
            F.g r8 = r7.a()
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "Content-Length"
            Q0.l r11 = r7.f2233d
            if (r11 == 0) goto L_0x0042
            d1.v r12 = r11.s()
            if (r12 == 0) goto L_0x0025
            java.lang.String r12 = r12.f2374a
            r8.h(r9, r12)
        L_0x0025:
            long r11 = r11.r()
            java.lang.String r13 = "Transfer-Encoding"
            int r14 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r14 == 0) goto L_0x003a
            java.lang.String r11 = java.lang.Long.toString(r11)
            r8.h(r10, r11)
            r8.m(r13)
            goto L_0x0042
        L_0x003a:
            java.lang.String r11 = "chunked"
            r8.h(r13, r11)
            r8.m(r10)
        L_0x0042:
            d1.r r11 = r7.f2232c
            java.lang.String r12 = "Host"
            java.lang.String r13 = r11.a(r12)
            d1.t r14 = r7.f2231a
            if (r13 != 0) goto L_0x0055
            java.lang.String r13 = e1.c.k(r14, r2)
            r8.h(r12, r13)
        L_0x0055:
            java.lang.String r12 = "Connection"
            java.lang.String r13 = r11.a(r12)
            if (r13 != 0) goto L_0x0062
            java.lang.String r13 = "Keep-Alive"
            r8.h(r12, r13)
        L_0x0062:
            java.lang.String r12 = "Accept-Encoding"
            java.lang.String r13 = r11.a(r12)
            java.lang.String r15 = "gzip"
            if (r13 != 0) goto L_0x0079
            java.lang.String r13 = "Range"
            java.lang.String r13 = r11.a(r13)
            if (r13 != 0) goto L_0x0079
            r8.h(r12, r15)
            r12 = 1
            goto L_0x007a
        L_0x0079:
            r12 = 0
        L_0x007a:
            java.lang.Object r13 = r1.b
            d1.b r13 = (d1.C0109b) r13
            r13.getClass()
            r16 = 0
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            boolean r17 = r2.isEmpty()
            if (r17 != 0) goto L_0x00c6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r2.size()
            r6 = 0
            r18 = 1
        L_0x0097:
            if (r6 >= r4) goto L_0x00bc
            if (r6 <= 0) goto L_0x00a0
            java.lang.String r5 = "; "
            r3.append(r5)
        L_0x00a0:
            java.lang.Object r5 = r2.get(r6)
            d1.p r5 = (d1.p) r5
            r19 = r2
            java.lang.String r2 = r5.f2348a
            r3.append(r2)
            r2 = 61
            r3.append(r2)
            java.lang.String r2 = r5.b
            r3.append(r2)
            int r6 = r6 + 1
            r2 = r19
            goto L_0x0097
        L_0x00bc:
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "Cookie"
            r8.h(r3, r2)
            goto L_0x00c8
        L_0x00c6:
            r18 = 1
        L_0x00c8:
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = r11.a(r2)
            if (r3 != 0) goto L_0x00d5
            java.lang.String r3 = "okhttp/3.10.0"
            r8.h(r2, r3)
        L_0x00d5:
            d1.C r2 = r8.a()
            d1.G r0 = r0.a(r2)
            d1.r r2 = r0.f2254k
            h1.e.d(r13, r14, r2)
            d1.F r3 = r0.m()
            r3.f2240a = r7
            if (r12 == 0) goto L_0x0145
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = r0.l(r4)
            boolean r5 = r15.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0145
            boolean r5 = h1.e.b(r0)
            if (r5 == 0) goto L_0x0145
            o1.l r5 = new o1.l
            d1.I r6 = r0.f2255l
            o1.g r6 = r6.l()
            r5.<init>(r6)
            A.j r2 = r2.c()
            r2.C(r4)
            r2.C(r10)
            java.lang.Object r2 = r2.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            A.j r4 = new A.j
            r6 = 23
            r4.<init>((int) r6)
            java.lang.Object r6 = r4.b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Collections.addAll(r6, r2)
            r3.f = r4
            r0.l(r9)
            d1.H r0 = new d1.H
            java.util.logging.Logger r2 = o1.o.f3758a
            o1.q r2 = new o1.q
            r2.<init>(r5)
            r4 = 1
            r5 = -1
            r0.<init>(r5, r2, r4)
            r3.f2244g = r0
        L_0x0145:
            d1.G r0 = r3.a()
            return r0
        L_0x014a:
            d1.G r0 = r32.b(r33)
            return r0
        L_0x014f:
            r16 = 0
            java.lang.Object r2 = r1.b
            A.j r2 = (A.j) r2
            r3 = 0
            if (r2 == 0) goto L_0x0221
            d1.C r4 = r0.f
            java.lang.Object r2 = r2.b
            d1.h r2 = (d1.C0115h) r2
            r2.getClass()
            d1.t r5 = r4.f2231a
            java.lang.String r5 = r5.f2371h
            o1.h r5 = o1.h.f(r5)
            java.lang.String r6 = "MD5"
            o1.h r5 = r5.e(r6)
            java.lang.String r5 = r5.h()
            f1.g r2 = r2.f2303g     // Catch:{ IOException -> 0x0221 }
            f1.f r2 = r2.n(r5)     // Catch:{ IOException -> 0x0221 }
            if (r2 != 0) goto L_0x017d
            goto L_0x0221
        L_0x017d:
            d1.g r5 = new d1.g     // Catch:{ IOException -> 0x021e }
            o1.v[] r6 = r2.f2711h     // Catch:{ IOException -> 0x021e }
            r6 = r6[r16]     // Catch:{ IOException -> 0x021e }
            r5.<init>((o1.v) r6)     // Catch:{ IOException -> 0x021e }
            d1.r r6 = r5.b     // Catch:{ IOException -> 0x021e }
            java.lang.String r8 = r5.f2296c     // Catch:{ IOException -> 0x021e }
            java.lang.String r9 = r5.f2295a     // Catch:{ IOException -> 0x021e }
            java.lang.String r10 = "Content-Type"
            d1.r r11 = r5.f2299g
            r11.a(r10)
            java.lang.String r10 = "Content-Length"
            java.lang.String r10 = r11.a(r10)
            F.g r12 = new F.g
            r12.<init>()
            r12.o(r9)
            r12.i(r8, r3)
            A.j r13 = r6.c()
            r12.f199d = r13
            d1.C r12 = r12.a()
            d1.F r13 = new d1.F
            r13.<init>()
            r13.f2240a = r12
            d1.A r12 = r5.f2297d
            r13.b = r12
            int r12 = r5.f2298e
            r13.f2241c = r12
            java.lang.String r12 = r5.f
            r13.f2242d = r12
            A.j r11 = r11.c()
            r13.f = r11
            d1.f r11 = new d1.f
            r11.<init>(r2, r10)
            r13.f2244g = r11
            d1.q r2 = r5.f2300h
            r13.f2243e = r2
            long r10 = r5.f2301i
            r13.f2248k = r10
            long r10 = r5.f2302j
            r13.f2249l = r10
            d1.G r2 = r13.a()
            d1.t r5 = r4.f2231a
            java.lang.String r5 = r5.f2371h
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0218
            java.lang.String r5 = r4.b
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0218
            int r5 = h1.e.f2910a
            d1.r r5 = r2.f2254k
            java.util.Set r5 = h1.e.f(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x01fc:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0222
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r9 = r6.f(r8)
            d1.r r10 = r4.f2232c
            java.util.List r8 = r10.f(r8)
            boolean r8 = e1.c.j(r9, r8)
            if (r8 != 0) goto L_0x01fc
        L_0x0218:
            d1.I r2 = r2.f2255l
            e1.c.d(r2)
            goto L_0x0221
        L_0x021e:
            e1.c.d(r2)
        L_0x0221:
            r2 = r3
        L_0x0222:
            long r4 = java.lang.System.currentTimeMillis()
            d1.C r6 = r0.f
            if (r2 == 0) goto L_0x029a
            long r11 = r2.f2259p
            long r13 = r2.f2260q
            d1.r r15 = r2.f2254k
            int r9 = r15.d()
            r21 = r3
            r23 = r21
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r10 = 0
            r22 = -1
        L_0x0243:
            if (r10 >= r9) goto L_0x0297
            java.lang.String r3 = r15.b(r10)
            java.lang.String r7 = r15.e(r10)
            java.lang.String r8 = "Date"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto L_0x025e
            java.util.Date r21 = h1.d.a(r7)
            r27 = r7
        L_0x025b:
            r18 = 1
            goto L_0x0293
        L_0x025e:
            java.lang.String r8 = "Expires"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto L_0x026b
            java.util.Date r24 = h1.d.a(r7)
            goto L_0x025b
        L_0x026b:
            java.lang.String r8 = "Last-Modified"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto L_0x027a
            java.util.Date r23 = h1.d.a(r7)
            r26 = r7
            goto L_0x025b
        L_0x027a:
            java.lang.String r8 = "ETag"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto L_0x0285
            r25 = r7
            goto L_0x025b
        L_0x0285:
            java.lang.String r8 = "Age"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x025b
            r3 = -1
            int r22 = h1.e.c(r3, r7)
            goto L_0x025b
        L_0x0293:
            int r10 = r10 + 1
            r3 = 0
            goto L_0x0243
        L_0x0297:
            r3 = r22
            goto L_0x02ab
        L_0x029a:
            r3 = -1
            r11 = 0
            r13 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x02ab:
            if (r2 != 0) goto L_0x02b7
            F.c r3 = new F.c
            r4 = 0
            r5 = 18
            r3.<init>((java.lang.Object) r6, (int) r5, (java.lang.Object) r4)
            goto L_0x048c
        L_0x02b7:
            d1.t r7 = r6.f2231a
            java.lang.String r7 = r7.f2366a
            java.lang.String r8 = "https"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02d1
            d1.q r7 = r2.f2253j
            if (r7 != 0) goto L_0x02d1
            F.c r3 = new F.c
            r7 = 0
            r8 = 18
            r3.<init>((java.lang.Object) r6, (int) r8, (java.lang.Object) r7)
            goto L_0x048c
        L_0x02d1:
            r7 = 0
            r8 = 18
            boolean r9 = F.c.z(r2, r6)
            if (r9 != 0) goto L_0x02e1
            F.c r3 = new F.c
            r3.<init>((java.lang.Object) r6, (int) r8, (java.lang.Object) r7)
            goto L_0x048c
        L_0x02e1:
            d1.i r7 = r6.f
            if (r7 == 0) goto L_0x02e6
            goto L_0x02ee
        L_0x02e6:
            d1.r r7 = r6.f2232c
            d1.i r7 = d1.C0116i.a(r7)
            r6.f = r7
        L_0x02ee:
            boolean r8 = r7.f2305a
            if (r8 != 0) goto L_0x0484
            d1.r r8 = r6.f2232c
            java.lang.String r9 = "If-Modified-Since"
            java.lang.String r10 = r8.a(r9)
            if (r10 != 0) goto L_0x0484
            java.lang.String r10 = "If-None-Match"
            java.lang.String r15 = r8.a(r10)
            if (r15 == 0) goto L_0x0306
            goto L_0x0484
        L_0x0306:
            d1.i r15 = r2.k()
            r28 = r4
            boolean r4 = r15.f2314l
            if (r4 == 0) goto L_0x031a
            F.c r3 = new F.c
            r4 = 0
            r5 = 18
            r3.<init>((java.lang.Object) r4, (int) r5, (java.lang.Object) r2)
            goto L_0x048c
        L_0x031a:
            if (r21 == 0) goto L_0x032e
            long r4 = r21.getTime()
            long r4 = r13 - r4
            r22 = r8
            r30 = r9
            r8 = 0
            long r4 = java.lang.Math.max(r8, r4)
        L_0x032c:
            r8 = -1
            goto L_0x0335
        L_0x032e:
            r22 = r8
            r30 = r9
            r4 = 0
            goto L_0x032c
        L_0x0335:
            if (r3 == r8) goto L_0x0345
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r31 = r10
            long r9 = (long) r3
            long r8 = r8.toMillis(r9)
            long r4 = java.lang.Math.max(r4, r8)
            goto L_0x0347
        L_0x0345:
            r31 = r10
        L_0x0347:
            long r8 = r13 - r11
            long r28 = r28 - r13
            long r4 = r4 + r8
            long r4 = r4 + r28
            d1.i r3 = r2.k()
            int r3 = r3.f2306c
            r8 = -1
            if (r3 == r8) goto L_0x0361
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = (long) r3
            long r8 = r8.toMillis(r9)
        L_0x035e:
            r19 = 0
            goto L_0x03ae
        L_0x0361:
            if (r24 == 0) goto L_0x0378
            if (r21 == 0) goto L_0x0369
            long r13 = r21.getTime()
        L_0x0369:
            long r8 = r24.getTime()
            long r8 = r8 - r13
            r19 = 0
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0375
            goto L_0x035e
        L_0x0375:
            r8 = 0
            goto L_0x035e
        L_0x0378:
            if (r23 == 0) goto L_0x03ab
            d1.C r3 = r2.f
            d1.t r3 = r3.f2231a
            java.util.List r3 = r3.f
            if (r3 != 0) goto L_0x0384
            r3 = 0
            goto L_0x0390
        L_0x0384:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            d1.t.g(r8, r3)
            java.lang.String r3 = r8.toString()
        L_0x0390:
            if (r3 != 0) goto L_0x03ab
            if (r21 == 0) goto L_0x0398
            long r11 = r21.getTime()
        L_0x0398:
            long r8 = r23.getTime()
            long r11 = r11 - r8
            r19 = 0
            int r3 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x03a8
            r8 = 10
            long r8 = r11 / r8
            goto L_0x03ae
        L_0x03a8:
            r8 = r19
            goto L_0x03ae
        L_0x03ab:
            r19 = 0
            goto L_0x03a8
        L_0x03ae:
            int r3 = r7.f2306c
            r10 = -1
            if (r3 == r10) goto L_0x03be
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r3
            long r11 = r11.toMillis(r12)
            long r8 = java.lang.Math.min(r8, r11)
        L_0x03be:
            int r3 = r7.f2311i
            if (r3 == r10) goto L_0x03ca
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r3
            long r11 = r11.toMillis(r12)
            goto L_0x03cc
        L_0x03ca:
            r11 = r19
        L_0x03cc:
            boolean r3 = r15.f2309g
            if (r3 != 0) goto L_0x03dd
            int r3 = r7.f2310h
            if (r3 == r10) goto L_0x03dd
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r3
            long r13 = r7.toMillis(r13)
            r19 = r13
        L_0x03dd:
            boolean r3 = r15.f2305a
            if (r3 != 0) goto L_0x042c
            long r11 = r11 + r4
            long r19 = r8 + r19
            int r3 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x042c
            d1.F r3 = r2.m()
            java.lang.String r7 = "Warning"
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x03ff
            A.j r8 = r3.f
            java.lang.String r9 = "110 HttpURLConnection \"Response is stale\""
            r8.getClass()
            A.j.u(r7, r9)
            r8.t(r7, r9)
        L_0x03ff:
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x041e
            d1.i r4 = r2.k()
            int r4 = r4.f2306c
            r8 = -1
            if (r4 != r8) goto L_0x041e
            if (r24 != 0) goto L_0x041e
            A.j r4 = r3.f
            java.lang.String r5 = "113 HttpURLConnection \"Heuristic expiration\""
            r4.getClass()
            A.j.u(r7, r5)
            r4.t(r7, r5)
        L_0x041e:
            F.c r4 = new F.c
            d1.G r3 = r3.a()
            r5 = 18
            r7 = 0
            r4.<init>((java.lang.Object) r7, (int) r5, (java.lang.Object) r3)
        L_0x042a:
            r3 = r4
            goto L_0x048c
        L_0x042c:
            if (r25 == 0) goto L_0x0433
            r3 = r25
            r9 = r31
            goto L_0x043f
        L_0x0433:
            if (r23 == 0) goto L_0x043a
            r3 = r26
        L_0x0437:
            r9 = r30
            goto L_0x043f
        L_0x043a:
            if (r21 == 0) goto L_0x047b
            r3 = r27
            goto L_0x0437
        L_0x043f:
            A.j r4 = r22.c()
            d1.b r5 = d1.C0109b.f2283e
            r5.getClass()
            r4.t(r9, r3)
            F.g r3 = r6.a()
            java.lang.Object r4 = r4.b
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            A.j r5 = new A.j
            r7 = 23
            r5.<init>((int) r7)
            java.lang.Object r7 = r5.b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Collections.addAll(r7, r4)
            r3.f199d = r5
            d1.C r3 = r3.a()
            F.c r4 = new F.c
            r5 = 18
            r4.<init>((java.lang.Object) r3, (int) r5, (java.lang.Object) r2)
            goto L_0x042a
        L_0x047b:
            r5 = 18
            F.c r3 = new F.c
            r4 = 0
            r3.<init>((java.lang.Object) r6, (int) r5, (java.lang.Object) r4)
            goto L_0x048c
        L_0x0484:
            r4 = 0
            r5 = 18
            F.c r3 = new F.c
            r3.<init>((java.lang.Object) r6, (int) r5, (java.lang.Object) r4)
        L_0x048c:
            java.lang.Object r4 = r3.b
            d1.C r4 = (d1.C) r4
            if (r4 == 0) goto L_0x04ac
            d1.i r4 = r6.f
            if (r4 == 0) goto L_0x0497
            goto L_0x049f
        L_0x0497:
            d1.r r4 = r6.f2232c
            d1.i r4 = d1.C0116i.a(r4)
            r6.f = r4
        L_0x049f:
            boolean r4 = r4.f2312j
            if (r4 == 0) goto L_0x04ac
            F.c r3 = new F.c
            r4 = 0
            r5 = 18
            r3.<init>((java.lang.Object) r4, (int) r5, (java.lang.Object) r4)
            goto L_0x04ad
        L_0x04ac:
            r4 = 0
        L_0x04ad:
            java.lang.Object r5 = r3.b
            d1.C r5 = (d1.C) r5
            java.lang.Object r3 = r3.f194c
            d1.G r3 = (d1.G) r3
            java.lang.Object r6 = r1.b
            A.j r6 = (A.j) r6
            if (r6 == 0) goto L_0x04c1
            java.lang.Object r6 = r6.b
            d1.h r6 = (d1.C0115h) r6
            monitor-enter(r6)
            monitor-exit(r6)
        L_0x04c1:
            if (r2 == 0) goto L_0x04ca
            if (r3 != 0) goto L_0x04ca
            d1.I r6 = r2.f2255l
            e1.c.d(r6)
        L_0x04ca:
            if (r5 != 0) goto L_0x04f7
            if (r3 != 0) goto L_0x04f7
            d1.F r2 = new d1.F
            r2.<init>()
            d1.C r0 = r0.f
            r2.f2240a = r0
            d1.A r0 = d1.A.f2222h
            r2.b = r0
            r0 = 504(0x1f8, float:7.06E-43)
            r2.f2241c = r0
            java.lang.String r0 = "Unsatisfiable Request (only-if-cached)"
            r2.f2242d = r0
            d1.H r0 = e1.c.f2614c
            r2.f2244g = r0
            r5 = -1
            r2.f2248k = r5
            long r3 = java.lang.System.currentTimeMillis()
            r2.f2249l = r3
            d1.G r0 = r2.a()
            goto L_0x073b
        L_0x04f7:
            if (r5 != 0) goto L_0x0510
            d1.F r0 = r3.m()
            d1.G r2 = d(r3)
            if (r2 == 0) goto L_0x0508
            java.lang.String r3 = "cacheResponse"
            d1.F.b(r3, r2)
        L_0x0508:
            r0.f2246i = r2
            d1.G r0 = r0.a()
            goto L_0x073b
        L_0x0510:
            d1.G r0 = r0.a(r5)     // Catch:{ all -> 0x073c }
            if (r3 == 0) goto L_0x064f
            int r2 = r0.f2251h
            r6 = 304(0x130, float:4.26E-43)
            if (r2 != r6) goto L_0x064a
            d1.F r2 = r3.m()
            d1.r r5 = r3.f2254k
            d1.r r6 = r0.f2254k
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            int r8 = r5.d()
            r9 = 0
        L_0x0530:
            if (r9 >= r8) goto L_0x0585
            java.lang.String r10 = r5.b(r9)
            java.lang.String r11 = r5.e(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x054d
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x054d
        L_0x054a:
            r18 = 1
            goto L_0x0582
        L_0x054d:
            java.lang.String r12 = "Content-Length"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 != 0) goto L_0x0572
            java.lang.String r12 = "Content-Encoding"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 != 0) goto L_0x0572
            java.lang.String r12 = "Content-Type"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x0566
            goto L_0x0572
        L_0x0566:
            boolean r12 = c(r10)
            if (r12 == 0) goto L_0x0572
            java.lang.String r12 = r6.a(r10)
            if (r12 != 0) goto L_0x054a
        L_0x0572:
            d1.b r12 = d1.C0109b.f2283e
            r12.getClass()
            r7.add(r10)
            java.lang.String r10 = r11.trim()
            r7.add(r10)
            goto L_0x054a
        L_0x0582:
            int r9 = r9 + 1
            goto L_0x0530
        L_0x0585:
            int r5 = r6.d()
            r8 = 0
        L_0x058a:
            if (r8 >= r5) goto L_0x05c7
            java.lang.String r9 = r6.b(r8)
            java.lang.String r10 = "Content-Length"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x05c2
            java.lang.String r10 = "Content-Encoding"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x05c2
            java.lang.String r10 = "Content-Type"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 == 0) goto L_0x05a9
            goto L_0x05c2
        L_0x05a9:
            boolean r10 = c(r9)
            if (r10 == 0) goto L_0x05c2
            d1.b r10 = d1.C0109b.f2283e
            java.lang.String r11 = r6.e(r8)
            r10.getClass()
            r7.add(r9)
            java.lang.String r9 = r11.trim()
            r7.add(r9)
        L_0x05c2:
            r18 = 1
            int r8 = r8 + 1
            goto L_0x058a
        L_0x05c7:
            int r5 = r7.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            A.j r6 = new A.j
            r7 = 23
            r6.<init>((int) r7)
            java.lang.Object r7 = r6.b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Collections.addAll(r7, r5)
            r2.f = r6
            long r5 = r0.f2259p
            r2.f2248k = r5
            long r5 = r0.f2260q
            r2.f2249l = r5
            d1.G r5 = d(r3)
            if (r5 == 0) goto L_0x05f6
            java.lang.String r6 = "cacheResponse"
            d1.F.b(r6, r5)
        L_0x05f6:
            r2.f2246i = r5
            d1.G r5 = d(r0)
            if (r5 == 0) goto L_0x0603
            java.lang.String r6 = "networkResponse"
            d1.F.b(r6, r5)
        L_0x0603:
            r2.f2245h = r5
            d1.G r2 = r2.a()
            d1.I r0 = r0.f2255l
            r0.close()
            java.lang.Object r0 = r1.b
            A.j r0 = (A.j) r0
            r0.D()
            java.lang.Object r0 = r1.b
            A.j r0 = (A.j) r0
            java.lang.Object r0 = r0.b
            d1.h r0 = (d1.C0115h) r0
            r0.getClass()
            d1.g r0 = new d1.g
            r0.<init>((d1.G) r2)
            d1.I r3 = r3.f2255l
            d1.f r3 = (d1.C0113f) r3
            f1.f r3 = r3.f
            java.lang.String r5 = r3.f     // Catch:{ IOException -> 0x0640 }
            long r6 = r3.f2710g     // Catch:{ IOException -> 0x0640 }
            f1.g r3 = r3.f2712i     // Catch:{ IOException -> 0x0640 }
            f1.d r3 = r3.m(r5, r6)     // Catch:{ IOException -> 0x0640 }
            if (r3 == 0) goto L_0x0647
            r0.c(r3)     // Catch:{ IOException -> 0x063e }
            r3.b()     // Catch:{ IOException -> 0x063e }
            goto L_0x0647
        L_0x063e:
            goto L_0x0642
        L_0x0640:
            r3 = r4
        L_0x0642:
            if (r3 == 0) goto L_0x0647
            r3.a()     // Catch:{ IOException -> 0x0647 }
        L_0x0647:
            r0 = r2
            goto L_0x073b
        L_0x064a:
            d1.I r2 = r3.f2255l
            e1.c.d(r2)
        L_0x064f:
            d1.F r2 = r0.m()
            d1.G r3 = d(r3)
            if (r3 == 0) goto L_0x065e
            java.lang.String r6 = "cacheResponse"
            d1.F.b(r6, r3)
        L_0x065e:
            r2.f2246i = r3
            d1.G r0 = d(r0)
            if (r0 == 0) goto L_0x066b
            java.lang.String r3 = "networkResponse"
            d1.F.b(r3, r0)
        L_0x066b:
            r2.f2245h = r0
            d1.G r0 = r2.a()
            java.lang.Object r2 = r1.b
            A.j r2 = (A.j) r2
            if (r2 == 0) goto L_0x073b
            boolean r2 = h1.e.b(r0)
            if (r2 == 0) goto L_0x0728
            boolean r2 = F.c.z(r0, r5)
            if (r2 == 0) goto L_0x0728
            java.lang.Object r2 = r1.b
            A.j r2 = (A.j) r2
            java.lang.Object r2 = r2.b
            d1.h r2 = (d1.C0115h) r2
            r2.getClass()
            d1.C r3 = r0.f
            java.lang.String r3 = r3.b
            boolean r5 = Q0.l.A(r3)
            d1.C r6 = r0.f
            if (r5 == 0) goto L_0x06a0
            r2.l(r6)     // Catch:{ IOException -> 0x069e }
            goto L_0x06ec
        L_0x069e:
            goto L_0x06ec
        L_0x06a0:
            java.lang.String r5 = "GET"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x06a9
            goto L_0x06ec
        L_0x06a9:
            d1.r r3 = r0.f2254k
            java.util.Set r3 = h1.e.f(r3)
            java.lang.String r5 = "*"
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x06b8
            goto L_0x06ec
        L_0x06b8:
            d1.g r3 = new d1.g
            r3.<init>((d1.G) r0)
            f1.g r5 = r2.f2303g     // Catch:{ IOException -> 0x06e5 }
            d1.t r6 = r6.f2231a     // Catch:{ IOException -> 0x06e5 }
            java.lang.String r6 = r6.f2371h     // Catch:{ IOException -> 0x06e5 }
            o1.h r6 = o1.h.f(r6)     // Catch:{ IOException -> 0x06e5 }
            java.lang.String r7 = "MD5"
            o1.h r6 = r6.e(r7)     // Catch:{ IOException -> 0x06e5 }
            java.lang.String r6 = r6.h()     // Catch:{ IOException -> 0x06e5 }
            r7 = -1
            f1.d r5 = r5.m(r6, r7)     // Catch:{ IOException -> 0x06e5 }
            if (r5 != 0) goto L_0x06da
            goto L_0x06ec
        L_0x06da:
            r3.c(r5)     // Catch:{ IOException -> 0x06e3 }
            d1.d r3 = new d1.d     // Catch:{ IOException -> 0x06e3 }
            r3.<init>(r2, r5)     // Catch:{ IOException -> 0x06e3 }
            goto L_0x06ed
        L_0x06e3:
            goto L_0x06e7
        L_0x06e5:
            r5 = r4
        L_0x06e7:
            if (r5 == 0) goto L_0x06ec
            r5.a()     // Catch:{ IOException -> 0x069e }
        L_0x06ec:
            r3 = r4
        L_0x06ed:
            if (r3 != 0) goto L_0x06f0
            goto L_0x073b
        L_0x06f0:
            d1.c r2 = r3.f2287c
            if (r2 != 0) goto L_0x06f5
            goto L_0x073b
        L_0x06f5:
            d1.I r4 = r0.f2255l
            o1.g r4 = r4.l()
            java.util.logging.Logger r5 = o1.o.f3758a
            o1.p r5 = new o1.p
            r5.<init>(r2)
            f1.a r2 = new f1.a
            r2.<init>(r4, r3, r5)
            java.lang.String r3 = "Content-Type"
            r0.l(r3)
            d1.I r3 = r0.f2255l
            long r3 = r3.k()
            d1.F r0 = r0.m()
            d1.H r5 = new d1.H
            o1.q r6 = new o1.q
            r6.<init>(r2)
            r2 = 1
            r5.<init>(r3, r6, r2)
            r0.f2244g = r5
            d1.G r0 = r0.a()
            goto L_0x073b
        L_0x0728:
            java.lang.String r2 = r5.b
            boolean r2 = Q0.l.A(r2)
            if (r2 == 0) goto L_0x073b
            java.lang.Object r2 = r1.b     // Catch:{ IOException -> 0x073b }
            A.j r2 = (A.j) r2     // Catch:{ IOException -> 0x073b }
            java.lang.Object r2 = r2.b     // Catch:{ IOException -> 0x073b }
            d1.h r2 = (d1.C0115h) r2     // Catch:{ IOException -> 0x073b }
            r2.l(r5)     // Catch:{ IOException -> 0x073b }
        L_0x073b:
            return r0
        L_0x073c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0744
            d1.I r2 = r2.f2255l
            e1.c.d(r2)
        L_0x0744:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b.a(h1.f):d1.G");
    }
}

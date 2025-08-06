package h1;

import d1.C0108a;
import d1.C0117j;
import d1.G;
import d1.t;
import d1.u;
import d1.z;
import javax.net.ssl.SSLSocketFactory;
import n1.c;

public final class g implements u {

    /* renamed from: a  reason: collision with root package name */
    public final z f2921a;
    public Object b;

    public g(z zVar) {
        this.f2921a = zVar;
    }

    public static boolean d(G g2, t tVar) {
        t tVar2 = g2.f.f2231a;
        if (!tVar2.f2368d.equals(tVar.f2368d) || tVar2.f2369e != tVar.f2369e || !tVar2.f2366a.equals(tVar.f2366a)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [g1.b, d1.I, h1.c] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r16 > 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        if (r16 == 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
        if (r12.equals("HEAD") == false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0185 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d1.G a(h1.f r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            d1.C r0 = r2.f
            d1.B r6 = r2.f2915g
            d1.b r7 = r2.f2916h
            g1.f r3 = new g1.f
            d1.z r4 = r1.f2921a
            d1.m r4 = r4.f2423v
            d1.t r5 = r0.f2231a
            d1.a r5 = r1.b(r5)
            java.lang.Object r8 = r1.b
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 0
            r4 = r3
            r5 = r10
            r8 = 0
            r3 = r0
        L_0x0020:
            r11 = 1
            d1.G r0 = r2.b(r3, r4, r10, r10)     // Catch:{ c -> 0x01fb, IOException -> 0x01ee }
            if (r5 == 0) goto L_0x0048
            d1.F r0 = r0.m()
            d1.F r3 = r5.m()
            r3.f2244g = r10
            d1.G r3 = r3.a()
            d1.I r5 = r3.f2255l
            if (r5 != 0) goto L_0x0040
            r0.f2247j = r3
            d1.G r0 = r0.a()
            goto L_0x0048
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "priorResponse.body != null"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            d1.J r3 = r4.f2888c
            d1.C r5 = r0.f
            java.lang.String r12 = r5.b
            java.lang.String r13 = "GET"
            d1.z r14 = r1.f2921a
            int r15 = r0.f2251h
            r9 = 307(0x133, float:4.3E-43)
            if (r15 == r9) goto L_0x00ec
            r9 = 308(0x134, float:4.32E-43)
            if (r15 == r9) goto L_0x00ec
            r9 = 401(0x191, float:5.62E-43)
            if (r15 == r9) goto L_0x00e6
            d1.G r9 = r0.f2258o
            r16 = 2147483647(0x7fffffff, float:NaN)
            r10 = 503(0x1f7, float:7.05E-43)
            if (r15 == r10) goto L_0x00c3
            r10 = 407(0x197, float:5.7E-43)
            if (r15 == r10) goto L_0x00a4
            r3 = 408(0x198, float:5.72E-43)
            if (r15 == r3) goto L_0x0077
            switch(r15) {
                case 300: goto L_0x00fc;
                case 301: goto L_0x00fc;
                case 302: goto L_0x00fc;
                case 303: goto L_0x00fc;
                default: goto L_0x0074;
            }
        L_0x0074:
            r9 = 0
            goto L_0x0183
        L_0x0077:
            boolean r10 = r14.f2427z
            if (r10 != 0) goto L_0x007c
            goto L_0x0074
        L_0x007c:
            if (r9 == 0) goto L_0x0083
            int r9 = r9.f2251h
            if (r9 != r3) goto L_0x0083
            goto L_0x0074
        L_0x0083:
            java.lang.String r3 = "Retry-After"
            java.lang.String r3 = r0.l(r3)
            if (r3 != 0) goto L_0x008e
            r16 = 0
            goto L_0x009e
        L_0x008e:
            java.lang.String r9 = "\\d+"
            boolean r9 = r3.matches(r9)
            if (r9 == 0) goto L_0x009e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r16 = r3.intValue()
        L_0x009e:
            if (r16 <= 0) goto L_0x00a1
            goto L_0x0074
        L_0x00a1:
            r9 = r5
            goto L_0x0183
        L_0x00a4:
            if (r3 == 0) goto L_0x00a9
            java.net.Proxy r3 = r3.b
            goto L_0x00ad
        L_0x00a9:
            r14.getClass()
            r3 = 0
        L_0x00ad:
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP
            if (r3 != r5) goto L_0x00bb
            d1.b r3 = r14.f2421t
            r3.getClass()
            goto L_0x0074
        L_0x00bb:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r2)
            throw r0
        L_0x00c3:
            if (r9 == 0) goto L_0x00ca
            int r3 = r9.f2251h
            if (r3 != r10) goto L_0x00ca
            goto L_0x0074
        L_0x00ca:
            java.lang.String r3 = "Retry-After"
            java.lang.String r3 = r0.l(r3)
            if (r3 != 0) goto L_0x00d3
            goto L_0x00e3
        L_0x00d3:
            java.lang.String r9 = "\\d+"
            boolean r9 = r3.matches(r9)
            if (r9 == 0) goto L_0x00e3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r16 = r3.intValue()
        L_0x00e3:
            if (r16 != 0) goto L_0x0074
            goto L_0x00a1
        L_0x00e6:
            d1.b r3 = r14.f2422u
            r3.getClass()
            goto L_0x0074
        L_0x00ec:
            boolean r3 = r12.equals(r13)
            if (r3 != 0) goto L_0x00fc
            java.lang.String r3 = "HEAD"
            boolean r3 = r12.equals(r3)
            if (r3 != 0) goto L_0x00fc
            goto L_0x0074
        L_0x00fc:
            boolean r3 = r14.f2426y
            if (r3 != 0) goto L_0x0102
            goto L_0x0074
        L_0x0102:
            java.lang.String r3 = "Location"
            java.lang.String r3 = r0.l(r3)
            if (r3 != 0) goto L_0x010c
            goto L_0x0074
        L_0x010c:
            d1.t r9 = r5.f2231a
            r9.getClass()
            d1.s r10 = new d1.s
            r10.<init>()
            int r3 = r10.b(r9, r3)
            if (r3 != r11) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r10 = 0
        L_0x011e:
            if (r10 == 0) goto L_0x0125
            d1.t r3 = r10.a()
            goto L_0x0126
        L_0x0125:
            r3 = 0
        L_0x0126:
            if (r3 != 0) goto L_0x012a
            goto L_0x0074
        L_0x012a:
            d1.t r9 = r5.f2231a
            java.lang.String r9 = r9.f2366a
            java.lang.String r10 = r3.f2366a
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x013c
            boolean r9 = r14.f2425x
            if (r9 != 0) goto L_0x013c
            goto L_0x0074
        L_0x013c:
            F.g r9 = r5.a()
            boolean r10 = Q0.l.Q(r12)
            if (r10 == 0) goto L_0x0171
            java.lang.String r10 = "PROPFIND"
            boolean r11 = r12.equals(r10)
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L_0x0157
            r10 = 0
            r9.i(r13, r10)
            goto L_0x0160
        L_0x0157:
            if (r11 == 0) goto L_0x015c
            Q0.l r10 = r5.f2233d
            goto L_0x015d
        L_0x015c:
            r10 = 0
        L_0x015d:
            r9.i(r12, r10)
        L_0x0160:
            if (r11 != 0) goto L_0x0171
            java.lang.String r5 = "Transfer-Encoding"
            r9.m(r5)
            java.lang.String r5 = "Content-Length"
            r9.m(r5)
            java.lang.String r5 = "Content-Type"
            r9.m(r5)
        L_0x0171:
            boolean r5 = d(r0, r3)
            if (r5 != 0) goto L_0x017c
            java.lang.String r5 = "Authorization"
            r9.m(r5)
        L_0x017c:
            r9.f198c = r3
            d1.C r3 = r9.a()
            r9 = r3
        L_0x0183:
            if (r9 != 0) goto L_0x0189
            r4.f()
            return r0
        L_0x0189:
            d1.I r3 = r0.f2255l
            e1.c.d(r3)
            int r10 = r8 + 1
            r3 = 20
            if (r10 > r3) goto L_0x01dc
            d1.t r3 = r9.f2231a
            boolean r3 = d(r0, r3)
            if (r3 != 0) goto L_0x01b2
            r4.f()
            g1.f r3 = new g1.f
            d1.z r4 = r1.f2921a
            d1.m r4 = r4.f2423v
            d1.t r5 = r9.f2231a
            d1.a r5 = r1.b(r5)
            java.lang.Object r8 = r1.b
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = r3
            goto L_0x01ba
        L_0x01b2:
            d1.m r3 = r4.f2889d
            monitor-enter(r3)
            h1.c r5 = r4.f2896l     // Catch:{ all -> 0x01d9 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
            if (r5 != 0) goto L_0x01c0
        L_0x01ba:
            r5 = r0
            r3 = r9
            r8 = r10
        L_0x01bd:
            r10 = 0
            goto L_0x0020
        L_0x01c0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Closing the body of "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
            throw r0
        L_0x01dc:
            r4.f()
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Too many follow-up requests: "
            java.lang.String r2 = A.g.f(r10, r2)
            r0.<init>(r2)
            throw r0
        L_0x01eb:
            r0 = move-exception
            r10 = 0
            goto L_0x0209
        L_0x01ee:
            r0 = move-exception
            boolean r9 = r0 instanceof j1.C0220a     // Catch:{ all -> 0x01eb }
            r9 = r9 ^ r11
            boolean r9 = r1.c(r0, r4, r9, r3)     // Catch:{ all -> 0x01eb }
            if (r9 == 0) goto L_0x01fa
            r10 = 0
            goto L_0x0205
        L_0x01fa:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01fb:
            r0 = move-exception
            java.io.IOException r9 = r0.f     // Catch:{ all -> 0x01eb }
            r10 = 0
            boolean r9 = r1.c(r9, r4, r10, r3)     // Catch:{ all -> 0x01eb }
            if (r9 == 0) goto L_0x0206
        L_0x0205:
            goto L_0x01bd
        L_0x0206:
            java.io.IOException r0 = r0.f     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x0209:
            r4.g(r10)
            r4.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.a(h1.f):d1.G");
    }

    public final C0108a b(t tVar) {
        C0117j jVar;
        c cVar;
        SSLSocketFactory sSLSocketFactory;
        boolean equals = tVar.f2366a.equals("https");
        z zVar = this.f2921a;
        if (equals) {
            sSLSocketFactory = zVar.f2417p;
            cVar = zVar.f2419r;
            jVar = zVar.f2420s;
        } else {
            sSLSocketFactory = null;
            cVar = null;
            jVar = null;
        }
        return new C0108a(tVar.f2368d, tVar.f2369e, zVar.f2424w, zVar.f2416o, sSLSocketFactory, cVar, jVar, zVar.f2421t, zVar.f2408g, zVar.f2409h, zVar.f2413l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5 == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.io.IOException r3, g1.f r4, boolean r5, d1.C r6) {
        /*
            r2 = this;
            r4.g(r3)
            d1.z r0 = r2.f2921a
            boolean r0 = r0.f2427z
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x002b
        L_0x000b:
            if (r5 == 0) goto L_0x000f
            Q0.l r6 = r6.f2233d
        L_0x000f:
            boolean r6 = r3 instanceof java.net.ProtocolException
            if (r6 == 0) goto L_0x0014
            return r1
        L_0x0014:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L_0x001f
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L_0x002b
            if (r5 != 0) goto L_0x002b
            goto L_0x0031
        L_0x001f:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x002c
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x002c
        L_0x002b:
            return r1
        L_0x002c:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0031
            return r1
        L_0x0031:
            d1.J r3 = r4.f2888c
            if (r3 != 0) goto L_0x005d
            F.l r3 = r4.b
            if (r3 == 0) goto L_0x0046
            int r5 = r3.f210a
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r5 >= r3) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            g1.d r3 = r4.f2891g
            int r4 = r3.f2884e
            java.util.List r5 = r3.f2883d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            java.util.ArrayList r3 = r3.f2885g
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            return r1
        L_0x005d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.c(java.io.IOException, g1.f, boolean, d1.C):boolean");
    }
}

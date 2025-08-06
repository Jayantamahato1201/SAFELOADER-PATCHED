package g1;

import d1.A;
import d1.C;
import d1.C0108a;
import d1.C0109b;
import d1.F;
import d1.G;
import d1.J;
import d1.m;
import d1.q;
import d1.t;
import d1.z;
import e1.c;
import h1.e;
import h1.f;
import j1.h;
import j1.o;
import j1.s;
import j1.y;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import l1.g;
import o1.p;
import o1.x;

public final class b extends o {
    public final m b;

    /* renamed from: c  reason: collision with root package name */
    public final J f2868c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f2869d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f2870e;
    public q f;

    /* renamed from: g  reason: collision with root package name */
    public A f2871g;

    /* renamed from: h  reason: collision with root package name */
    public s f2872h;

    /* renamed from: i  reason: collision with root package name */
    public o1.q f2873i;

    /* renamed from: j  reason: collision with root package name */
    public p f2874j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2875k;

    /* renamed from: l  reason: collision with root package name */
    public int f2876l;

    /* renamed from: m  reason: collision with root package name */
    public int f2877m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f2878n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f2879o = Long.MAX_VALUE;

    public b(m mVar, J j2) {
        this.b = mVar;
        this.f2868c = j2;
    }

    public final void a(s sVar) {
        synchronized (this.b) {
            this.f2877m = sVar.n();
        }
    }

    public final void b(y yVar) {
        yVar.c(5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r10, int r11, int r12, boolean r13, d1.C0109b r14) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            d1.A r2 = r9.f2871g
            if (r2 != 0) goto L_0x0116
            d1.J r2 = r9.f2868c
            d1.a r2 = r2.f2264a
            java.util.List r3 = r2.f
            g1.a r4 = new g1.a
            r4.<init>(r3)
            javax.net.ssl.SSLSocketFactory r2 = r2.f2277h
            if (r2 != 0) goto L_0x004e
            d1.o r2 = d1.o.f
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0041
            d1.J r2 = r9.f2868c
            d1.a r2 = r2.f2264a
            d1.t r2 = r2.f2272a
            java.lang.String r2 = r2.f2368d
            l1.g r3 = l1.g.f3649a
            boolean r3 = r3.j(r2)
            if (r3 == 0) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            g1.c r10 = new g1.c
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication to "
            java.lang.String r13 = " not permitted by network security policy"
            java.lang.String r12 = A.g.i(r12, r2, r13)
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x0041:
            g1.c r10 = new g1.c
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication not enabled for client"
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x004e:
            r2 = 0
            r3 = r2
        L_0x0050:
            d1.J r5 = r9.f2868c     // Catch:{ IOException -> 0x006f }
            d1.a r6 = r5.f2264a     // Catch:{ IOException -> 0x006f }
            javax.net.ssl.SSLSocketFactory r6 = r6.f2277h     // Catch:{ IOException -> 0x006f }
            if (r6 == 0) goto L_0x0064
            java.net.Proxy r5 = r5.b     // Catch:{ IOException -> 0x006f }
            java.net.Proxy$Type r5 = r5.type()     // Catch:{ IOException -> 0x006f }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x006f }
            if (r5 != r6) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x0071
            r9.e(r10, r11, r12, r14)     // Catch:{ IOException -> 0x006f }
            java.net.Socket r5 = r9.f2869d     // Catch:{ IOException -> 0x006f }
            if (r5 != 0) goto L_0x0074
            goto L_0x007e
        L_0x006f:
            r5 = move-exception
            goto L_0x00b7
        L_0x0071:
            r9.d(r10, r11, r14)     // Catch:{ IOException -> 0x006f }
        L_0x0074:
            r9.f(r4, r14)     // Catch:{ IOException -> 0x006f }
            d1.J r5 = r9.f2868c     // Catch:{ IOException -> 0x006f }
            java.net.InetSocketAddress r5 = r5.f2265c     // Catch:{ IOException -> 0x006f }
            r14.getClass()     // Catch:{ IOException -> 0x006f }
        L_0x007e:
            d1.J r10 = r9.f2868c
            d1.a r11 = r10.f2264a
            javax.net.ssl.SSLSocketFactory r11 = r11.f2277h
            if (r11 == 0) goto L_0x00a2
            java.net.Proxy r10 = r10.b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x00a2
            java.net.Socket r10 = r9.f2869d
            if (r10 == 0) goto L_0x0095
            goto L_0x00a2
        L_0x0095:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Too many tunnel connections attempted: 21"
            r10.<init>(r11)
            g1.c r11 = new g1.c
            r11.<init>(r10)
            throw r11
        L_0x00a2:
            j1.s r10 = r9.f2872h
            if (r10 == 0) goto L_0x00b6
            d1.m r10 = r9.b
            monitor-enter(r10)
            j1.s r11 = r9.f2872h     // Catch:{ all -> 0x00b3 }
            int r11 = r11.n()     // Catch:{ all -> 0x00b3 }
            r9.f2877m = r11     // Catch:{ all -> 0x00b3 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b6
        L_0x00b3:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
            throw r11
        L_0x00b6:
            return
        L_0x00b7:
            java.net.Socket r6 = r9.f2870e
            e1.c.e(r6)
            java.net.Socket r6 = r9.f2869d
            e1.c.e(r6)
            r9.f2870e = r2
            r9.f2869d = r2
            r9.f2873i = r2
            r9.f2874j = r2
            r9.f = r2
            r9.f2871g = r2
            r9.f2872h = r2
            d1.J r6 = r9.f2868c
            java.net.InetSocketAddress r6 = r6.f2265c
            r14.getClass()
            if (r3 != 0) goto L_0x00de
            g1.c r3 = new g1.c
            r3.<init>(r5)
            goto L_0x00ed
        L_0x00de:
            java.io.IOException r6 = r3.f
            java.lang.reflect.Method r7 = g1.c.f2880g
            if (r7 == 0) goto L_0x00eb
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
            r8[r0] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
            r7.invoke(r5, r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
        L_0x00eb:
            r3.f = r5
        L_0x00ed:
            if (r13 == 0) goto L_0x0115
            r4.f2867d = r1
            boolean r6 = r4.f2866c
            if (r6 == 0) goto L_0x0115
            boolean r6 = r5 instanceof java.net.ProtocolException
            if (r6 != 0) goto L_0x0115
            boolean r6 = r5 instanceof java.io.InterruptedIOException
            if (r6 != 0) goto L_0x0115
            boolean r6 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L_0x0109
            java.lang.Throwable r7 = r5.getCause()
            boolean r7 = r7 instanceof java.security.cert.CertificateException
            if (r7 != 0) goto L_0x0115
        L_0x0109:
            boolean r7 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r7 != 0) goto L_0x0115
            if (r6 != 0) goto L_0x0050
            boolean r5 = r5 instanceof javax.net.ssl.SSLProtocolException
            if (r5 == 0) goto L_0x0115
            goto L_0x0050
        L_0x0115:
            throw r3
        L_0x0116:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "already connected"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.c(int, int, int, boolean, d1.b):void");
    }

    public final void d(int i2, int i3, C0109b bVar) {
        Socket socket;
        J j2 = this.f2868c;
        Proxy proxy = j2.b;
        InetSocketAddress inetSocketAddress = j2.f2265c;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = j2.f2264a.f2273c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f2869d = socket;
        bVar.getClass();
        this.f2869d.setSoTimeout(i3);
        try {
            g.f3649a.f(this.f2869d, inetSocketAddress, i2);
            try {
                this.f2873i = new o1.q(o1.o.d(this.f2869d));
                this.f2874j = new p(o1.o.a(this.f2869d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, C0109b bVar) {
        F.g gVar = new F.g();
        J j2 = this.f2868c;
        t tVar = j2.f2264a.f2272a;
        if (tVar != null) {
            gVar.f198c = tVar;
            gVar.h("Host", c.k(tVar, true));
            gVar.h("Proxy-Connection", "Keep-Alive");
            gVar.h("User-Agent", "okhttp/3.10.0");
            C a2 = gVar.a();
            d(i2, i3, bVar);
            o1.q qVar = this.f2873i;
            i1.g gVar2 = new i1.g((z) null, (f) null, qVar, this.f2874j);
            x a3 = qVar.f3761g.a();
            long j3 = (long) i3;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a3.g(j3);
            this.f2874j.f3759g.a().g((long) i4);
            gVar2.h(a2.f2232c, "CONNECT " + c.k(a2.f2231a, true) + " HTTP/1.1");
            gVar2.b();
            F e2 = gVar2.e(false);
            e2.f2240a = a2;
            G a4 = e2.a();
            long a5 = e.a(a4);
            if (a5 == -1) {
                a5 = 0;
            }
            i1.e g2 = gVar2.g(a5);
            c.q(g2, Integer.MAX_VALUE);
            g2.close();
            int i5 = a4.f2251h;
            if (i5 != 200) {
                if (i5 == 407) {
                    j2.f2264a.f2274d.getClass();
                    throw new IOException("Failed to authenticate with proxy");
                }
                throw new IOException(A.g.f(i5, "Unexpected response code for CONNECT: "));
            } else if (!this.f2873i.f.m() || !this.f2874j.f.m()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            throw new NullPointerException("url == null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v21, types: [j1.m, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b2 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(g1.a r10, d1.C0109b r11) {
        /*
            r9 = this;
            d1.J r0 = r9.f2868c
            d1.a r0 = r0.f2264a
            javax.net.ssl.SSLSocketFactory r0 = r0.f2277h
            if (r0 != 0) goto L_0x0011
            d1.A r10 = d1.A.f2222h
            r9.f2871g = r10
            java.net.Socket r10 = r9.f2869d
            r9.f2870e = r10
            return
        L_0x0011:
            r11.getClass()
            java.lang.String r11 = "Hostname "
            d1.J r0 = r9.f2868c
            d1.a r0 = r0.f2264a
            javax.net.ssl.SSLSocketFactory r1 = r0.f2277h
            d1.t r2 = r0.f2272a
            r3 = 0
            java.net.Socket r4 = r9.f2869d     // Catch:{ AssertionError -> 0x01ab }
            java.lang.String r5 = r2.f2368d     // Catch:{ AssertionError -> 0x01ab }
            int r6 = r2.f2369e     // Catch:{ AssertionError -> 0x01ab }
            r7 = 1
            java.net.Socket r1 = r1.createSocket(r4, r5, r6, r7)     // Catch:{ AssertionError -> 0x01ab }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x01ab }
            d1.o r10 = r10.a(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r10 = r10.b
            if (r10 == 0) goto L_0x0046
            l1.g r4 = l1.g.f3649a     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r5 = r2.f2368d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.List r6 = r0.f2275e     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r4.e(r1, r5, r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r10 = move-exception
            r3 = r1
            goto L_0x01b9
        L_0x0042:
            r10 = move-exception
            r3 = r1
            goto L_0x01ac
        L_0x0046:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            javax.net.ssl.SSLSession r4 = r1.getSession()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r5 = r4.getProtocol()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r6 = "NONE"
            boolean r5 = r6.equals(r5)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r5 != 0) goto L_0x01a1
            java.lang.String r5 = "SSL_NULL_WITH_NULL_NULL"
            java.lang.String r6 = r4.getCipherSuite()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r5 = r5.equals(r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r5 != 0) goto L_0x01a1
            d1.q r5 = d1.q.a(r4)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            n1.c r6 = r0.f2278i     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r8 = r2.f2368d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r4 = r6.verify(r8, r4)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.List r6 = r5.f2356c
            r8 = 0
            if (r4 == 0) goto L_0x015f
            d1.j r11 = r0.f2279j     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r0 = r2.f2368d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.a(r0, r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r10 == 0) goto L_0x0085
            l1.g r10 = l1.g.f3649a     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r3 = r10.h(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x0085:
            r9.f2870e = r1     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            o1.b r10 = o1.o.d(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            o1.q r11 = new o1.q     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.f2873i = r11     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.net.Socket r10 = r9.f2870e     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            o1.a r10 = o1.o.a(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            o1.p r11 = new o1.p     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.f2874j = r11     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.f = r5     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r3 == 0) goto L_0x00a8
            d1.A r10 = d1.A.a(r3)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            goto L_0x00aa
        L_0x00a8:
            d1.A r10 = d1.A.f2222h     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x00aa:
            r9.f2871g = r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            l1.g r10 = l1.g.f3649a
            r10.a(r1)
            d1.A r10 = r9.f2871g
            d1.A r11 = d1.A.f2224j
            if (r10 != r11) goto L_0x015e
            java.net.Socket r10 = r9.f2870e
            r10.setSoTimeout(r8)
            j1.m r10 = new j1.m
            r10.<init>()
            j1.n r11 = j1.o.f3254a
            r10.f3253e = r11
            r10.f = r7
            java.net.Socket r11 = r9.f2870e
            d1.J r0 = r9.f2868c
            d1.a r0 = r0.f2264a
            d1.t r0 = r0.f2272a
            java.lang.String r0 = r0.f2368d
            o1.q r1 = r9.f2873i
            o1.p r2 = r9.f2874j
            r10.f3250a = r11
            r10.b = r0
            r10.f3251c = r1
            r10.f3252d = r2
            r10.f3253e = r9
            j1.s r11 = new j1.s
            r11.<init>(r10)
            r9.f2872h = r11
            j1.z r10 = r11.f3280w
            java.lang.String r0 = ">> CONNECTION "
            monitor-enter(r10)
            boolean r1 = r10.f3315j     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x0154
            boolean r1 = r10.f3312g     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x00f5
            monitor-exit(r10)
            goto L_0x0130
        L_0x00f5:
            java.util.logging.Logger r1 = j1.z.f3311l     // Catch:{ all -> 0x0119 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0119 }
            boolean r2 = r1.isLoggable(r2)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x011b
            o1.h r2 = j1.f.f3227a     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = r2.h()     // Catch:{ all -> 0x0119 }
            byte[] r3 = e1.c.f2613a     // Catch:{ all -> 0x0119 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r3.<init>(r0)     // Catch:{ all -> 0x0119 }
            r3.append(r2)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0119 }
            r1.fine(r0)     // Catch:{ all -> 0x0119 }
            goto L_0x011b
        L_0x0119:
            r11 = move-exception
            goto L_0x015c
        L_0x011b:
            o1.p r0 = r10.f     // Catch:{ all -> 0x0119 }
            o1.h r1 = j1.f.f3227a     // Catch:{ all -> 0x0119 }
            byte[] r1 = r1.f     // Catch:{ all -> 0x0119 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0119 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0119 }
            r0.b(r1)     // Catch:{ all -> 0x0119 }
            o1.p r0 = r10.f     // Catch:{ all -> 0x0119 }
            r0.flush()     // Catch:{ all -> 0x0119 }
            monitor-exit(r10)
        L_0x0130:
            j1.z r10 = r11.f3280w
            j1.D r0 = r11.f3276s
            r10.r(r0)
            j1.D r10 = r11.f3276s
            int r10 = r10.a()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r10 == r0) goto L_0x0149
            j1.z r1 = r11.f3280w
            int r10 = r10 - r0
            long r2 = (long) r10
            r1.t(r8, r2)
        L_0x0149:
            java.lang.Thread r10 = new java.lang.Thread
            j1.q r11 = r11.f3281x
            r10.<init>(r11)
            r10.start()
            return
        L_0x0154:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "closed"
            r11.<init>(r0)     // Catch:{ all -> 0x0119 }
            throw r11     // Catch:{ all -> 0x0119 }
        L_0x015c:
            monitor-exit(r10)     // Catch:{ all -> 0x0119 }
            throw r11
        L_0x015e:
            return
        L_0x015f:
            java.lang.Object r10 = r6.get(r8)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.<init>(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = r2.f2368d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = " not verified:\n    certificate: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = d1.C0117j.b(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "\n    DN: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.security.Principal r11 = r10.getSubjectDN()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = r11.getName()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "\n    subjectAltNames: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.ArrayList r10 = n1.c.a(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r10 = r3.toString()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r0.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            throw r0     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x01a1:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "a valid ssl session was not established"
            r10.<init>(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            throw r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x01a9:
            r10 = move-exception
            goto L_0x01b9
        L_0x01ab:
            r10 = move-exception
        L_0x01ac:
            boolean r11 = e1.c.o(r10)     // Catch:{ all -> 0x01a9 }
            if (r11 == 0) goto L_0x01b8
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x01a9 }
            r11.<init>(r10)     // Catch:{ all -> 0x01a9 }
            throw r11     // Catch:{ all -> 0x01a9 }
        L_0x01b8:
            throw r10     // Catch:{ all -> 0x01a9 }
        L_0x01b9:
            if (r3 == 0) goto L_0x01c0
            l1.g r11 = l1.g.f3649a
            r11.a(r3)
        L_0x01c0:
            e1.c.e(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.f(g1.a, d1.b):void");
    }

    public final boolean g(C0108a aVar, J j2) {
        Proxy.Type type;
        if (this.f2878n.size() >= this.f2877m || this.f2875k) {
            return false;
        }
        C0109b bVar = C0109b.f2283e;
        J j3 = this.f2868c;
        C0108a aVar2 = j3.f2264a;
        bVar.getClass();
        if (!aVar2.a(aVar)) {
            return false;
        }
        t tVar = aVar.f2272a;
        if (tVar.f2368d.equals(j3.f2264a.f2272a.f2368d)) {
            return true;
        }
        if (this.f2872h == null || j2 == null || j2.b.type() != (type = Proxy.Type.DIRECT) || j3.b.type() != type) {
            return false;
        }
        if (!j3.f2265c.equals(j2.f2265c) || j2.f2264a.f2278i != n1.c.f3712a || !j(tVar)) {
            return false;
        }
        try {
            aVar.f2279j.a(tVar.f2368d, this.f.f2356c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean h(boolean z2) {
        int soTimeout;
        boolean z3;
        if (!this.f2870e.isClosed() && !this.f2870e.isInputShutdown() && !this.f2870e.isOutputShutdown()) {
            s sVar = this.f2872h;
            if (sVar != null) {
                synchronized (sVar) {
                    z3 = sVar.f3269l;
                }
                return !z3;
            }
            if (z2) {
                try {
                    soTimeout = this.f2870e.getSoTimeout();
                    this.f2870e.setSoTimeout(1);
                    if (this.f2873i.k()) {
                        this.f2870e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f2870e.setSoTimeout(soTimeout);
                    return true;
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    this.f2870e.setSoTimeout(soTimeout);
                    throw th;
                }
            }
            return true;
        }
        return false;
    }

    public final h1.c i(z zVar, f fVar, f fVar2) {
        if (this.f2872h != null) {
            return new h(fVar, fVar2, this.f2872h);
        }
        Socket socket = this.f2870e;
        int i2 = fVar.f2918j;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2873i.f3761g.a().g((long) i2);
        this.f2874j.f3759g.a().g((long) fVar.f2919k);
        return new i1.g(zVar, fVar2, this.f2873i, this.f2874j);
    }

    public final boolean j(t tVar) {
        int i2 = tVar.f2369e;
        t tVar2 = this.f2868c.f2264a.f2272a;
        if (i2 == tVar2.f2369e) {
            String str = tVar.f2368d;
            if (str.equals(tVar2.f2368d)) {
                return true;
            }
            q qVar = this.f;
            if (qVar == null || !n1.c.c(str, (X509Certificate) qVar.f2356c.get(0))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        J j2 = this.f2868c;
        sb.append(j2.f2264a.f2272a.f2368d);
        sb.append(":");
        sb.append(j2.f2264a.f2272a.f2369e);
        sb.append(", proxy=");
        sb.append(j2.b);
        sb.append(" hostAddress=");
        sb.append(j2.f2265c);
        sb.append(" cipherSuite=");
        q qVar = this.f;
        if (qVar != null) {
            obj = qVar.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2871g);
        sb.append('}');
        return sb.toString();
    }
}

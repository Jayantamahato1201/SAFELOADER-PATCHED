package j1;

import d1.C;
import d1.G;
import d1.H;
import d1.r;
import d1.t;
import h1.c;
import h1.e;
import h1.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import o1.o;
import o1.q;
import o1.u;

public final class h implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final List f3233e;
    public static final List f;

    /* renamed from: a  reason: collision with root package name */
    public final f f3234a;
    public final g1.f b;

    /* renamed from: c  reason: collision with root package name */
    public final s f3235c;

    /* renamed from: d  reason: collision with root package name */
    public y f3236d;

    static {
        o1.h f2 = o1.h.f("connection");
        o1.h f3 = o1.h.f("host");
        o1.h f4 = o1.h.f("keep-alive");
        o1.h f5 = o1.h.f("proxy-connection");
        o1.h f6 = o1.h.f("transfer-encoding");
        o1.h f7 = o1.h.f("te");
        o1.h f8 = o1.h.f("encoding");
        o1.h f9 = o1.h.f("upgrade");
        f3233e = e1.c.m(f2, f3, f4, f5, f7, f6, f8, f9, C0221b.f, C0221b.f3209g, C0221b.f3210h, C0221b.f3211i);
        f = e1.c.m(f2, f3, f4, f5, f7, f6, f8, f9);
    }

    public h(f fVar, g1.f fVar2, s sVar) {
        this.f3234a = fVar;
        this.b = fVar2;
        this.f3235c = sVar;
    }

    public final u a(C c2, long j2) {
        return this.f3236d.e();
    }

    public final void b() {
        this.f3236d.e().close();
    }

    public final H c(G g2) {
        this.b.f2890e.getClass();
        g2.l("Content-Type");
        long a2 = e.a(g2);
        g gVar = new g(this, this.f3236d.f3306g);
        Logger logger = o.f3758a;
        return new H(a2, new q(gVar), 1);
    }

    public final void d() {
        this.f3235c.flush();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d1.F e(boolean r10) {
        /*
            r9 = this;
            j1.y r0 = r9.f3236d
            monitor-enter(r0)
            boolean r1 = r0.f()     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00ec
            j1.x r1 = r0.f3308i     // Catch:{ all -> 0x00e4 }
            r1.i()     // Catch:{ all -> 0x00e4 }
        L_0x000e:
            java.util.ArrayList r1 = r0.f3305e     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0023
            int r1 = r0.f3310k     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0023
            r0.wait()     // Catch:{ InterruptedException -> 0x001a }
            goto L_0x000e
        L_0x001a:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0020 }
            r10.<init>()     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r10 = move-exception
            goto L_0x00e6
        L_0x0023:
            j1.x r1 = r0.f3308i     // Catch:{ all -> 0x00e4 }
            r1.n()     // Catch:{ all -> 0x00e4 }
            java.util.ArrayList r1 = r0.f3305e     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00dc
            r2 = 0
            r0.f3305e = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r0)
            A.j r0 = new A.j
            r3 = 23
            r0.<init>((int) r3)
            int r3 = r1.size()
            r4 = 0
            r5 = r2
        L_0x003d:
            r6 = 100
            if (r4 >= r3) goto L_0x0092
            java.lang.Object r7 = r1.get(r4)
            j1.b r7 = (j1.C0221b) r7
            if (r7 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x008f
            int r7 = r5.b
            if (r7 != r6) goto L_0x008f
            A.j r0 = new A.j
            r5 = 23
            r0.<init>((int) r5)
            r5 = r2
            goto L_0x008f
        L_0x0058:
            o1.h r6 = r7.b
            java.lang.String r6 = r6.o()
            o1.h r8 = j1.C0221b.f3208e
            o1.h r7 = r7.f3212a
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x007b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "HTTP/1.1 "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            h1.h r5 = h1.h.c(r5)
            goto L_0x008f
        L_0x007b:
            java.util.List r8 = f
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto L_0x008f
            d1.b r8 = d1.C0109b.f2283e
            java.lang.String r7 = r7.o()
            r8.getClass()
            r0.t(r7, r6)
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0092:
            if (r5 == 0) goto L_0x00d4
            d1.F r1 = new d1.F
            r1.<init>()
            d1.A r3 = d1.A.f2224j
            r1.b = r3
            int r3 = r5.b
            r1.f2241c = r3
            java.lang.Object r3 = r5.f2924d
            java.lang.String r3 = (java.lang.String) r3
            r1.f2242d = r3
            java.lang.Object r0 = r0.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            A.j r3 = new A.j
            r4 = 23
            r3.<init>((int) r4)
            java.lang.Object r4 = r3.b
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Collections.addAll(r4, r0)
            r1.f = r3
            if (r10 == 0) goto L_0x00d3
            d1.b r10 = d1.C0109b.f2283e
            r10.getClass()
            int r10 = r1.f2241c
            if (r10 != r6) goto L_0x00d3
            return r2
        L_0x00d3:
            return r1
        L_0x00d4:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r10.<init>(r0)
            throw r10
        L_0x00dc:
            j1.E r10 = new j1.E     // Catch:{ all -> 0x00e4 }
            int r1 = r0.f3310k     // Catch:{ all -> 0x00e4 }
            r10.<init>(r1)     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r10 = move-exception
            goto L_0x00f4
        L_0x00e6:
            j1.x r1 = r0.f3308i     // Catch:{ all -> 0x00e4 }
            r1.n()     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00ec:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "servers cannot read response headers"
            r10.<init>(r1)     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00f4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.h.e(boolean):d1.F");
    }

    public final void f(C c2) {
        boolean z2;
        int i2;
        y yVar;
        if (this.f3236d == null) {
            boolean z3 = true;
            if (c2.f2233d != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            r rVar = c2.f2232c;
            ArrayList arrayList = new ArrayList(rVar.d() + 4);
            arrayList.add(new C0221b(C0221b.f, c2.b));
            o1.h hVar = C0221b.f3209g;
            t tVar = c2.f2231a;
            String str = tVar.f2371h;
            int indexOf = str.indexOf(47, tVar.f2366a.length() + 3);
            String substring = str.substring(indexOf, e1.c.i(str, indexOf, str.length(), "?#"));
            String e2 = tVar.e();
            if (e2 != null) {
                substring = substring + '?' + e2;
            }
            arrayList.add(new C0221b(hVar, substring));
            String a2 = c2.f2232c.a("Host");
            if (a2 != null) {
                arrayList.add(new C0221b(C0221b.f3211i, a2));
            }
            arrayList.add(new C0221b(C0221b.f3210h, tVar.f2366a));
            int d2 = rVar.d();
            for (int i3 = 0; i3 < d2; i3++) {
                o1.h f2 = o1.h.f(rVar.b(i3).toLowerCase(Locale.US));
                if (!f3233e.contains(f2)) {
                    arrayList.add(new C0221b(f2, rVar.e(i3)));
                }
            }
            s sVar = this.f3235c;
            boolean z4 = !z2;
            synchronized (sVar.f3280w) {
                synchronized (sVar) {
                    try {
                        if (sVar.f3268k > 1073741823) {
                            sVar.p(5);
                        }
                        if (!sVar.f3269l) {
                            i2 = sVar.f3268k;
                            sVar.f3268k = i2 + 2;
                            yVar = new y(i2, sVar, z4, false, arrayList);
                            if (z2 && sVar.f3275r != 0) {
                                if (yVar.b != 0) {
                                    z3 = false;
                                }
                            }
                            if (yVar.g()) {
                                sVar.f3265h.put(Integer.valueOf(i2), yVar);
                            }
                        } else {
                            throw new IOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sVar.f3280w.s(z4, i2, arrayList);
            }
            if (z3) {
                sVar.f3280w.flush();
            }
            this.f3236d = yVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yVar.f3308i.g((long) this.f3234a.f2918j);
            this.f3236d.f3309j.g((long) this.f3234a.f2919k);
        }
    }
}

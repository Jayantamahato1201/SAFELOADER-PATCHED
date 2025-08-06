package g1;

import F.l;
import d1.B;
import d1.C0108a;
import d1.C0109b;
import d1.J;
import d1.m;
import h1.c;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final C0108a f2887a;
    public l b;

    /* renamed from: c  reason: collision with root package name */
    public J f2888c;

    /* renamed from: d  reason: collision with root package name */
    public final m f2889d;

    /* renamed from: e  reason: collision with root package name */
    public final C0109b f2890e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final d f2891g;

    /* renamed from: h  reason: collision with root package name */
    public int f2892h;

    /* renamed from: i  reason: collision with root package name */
    public b f2893i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2894j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2895k;

    /* renamed from: l  reason: collision with root package name */
    public c f2896l;

    public f(m mVar, C0108a aVar, B b2, C0109b bVar, Object obj) {
        this.f2889d = mVar;
        this.f2887a = aVar;
        this.f2890e = bVar;
        C0109b.f2283e.getClass();
        this.f2891g = new d(aVar, mVar.f2336e, b2, bVar);
        this.f = obj;
    }

    public final synchronized b a() {
        return this.f2893i;
    }

    public final Socket b(boolean z2, boolean z3, boolean z4) {
        Socket socket;
        if (z4) {
            this.f2896l = null;
        }
        if (z3) {
            this.f2895k = true;
        }
        b bVar = this.f2893i;
        if (bVar != null) {
            if (z2) {
                bVar.f2875k = true;
            }
            if (this.f2896l == null && (this.f2895k || bVar.f2875k)) {
                ArrayList arrayList = bVar.f2878n;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((Reference) arrayList.get(i2)).get() == this) {
                        arrayList.remove(i2);
                        if (this.f2893i.f2878n.isEmpty()) {
                            this.f2893i.f2879o = System.nanoTime();
                            C0109b bVar2 = C0109b.f2283e;
                            b bVar3 = this.f2893i;
                            bVar2.getClass();
                            m mVar = this.f2889d;
                            mVar.getClass();
                            if (bVar3.f2875k || mVar.f2333a == 0) {
                                mVar.f2335d.remove(bVar3);
                                socket = this.f2893i.f2870e;
                                this.f2893i = null;
                                return socket;
                            }
                            mVar.notifyAll();
                        }
                        socket = null;
                        this.f2893i = null;
                        return socket;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: d1.J} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g1.b c(int r15, int r16, int r17, boolean r18) {
        /*
            r14 = this;
            d1.m r1 = r14.f2889d
            monitor-enter(r1)
            boolean r0 = r14.f2895k     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x017c
            h1.c r0 = r14.f2896l     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0174
            g1.b r0 = r14.f2893i     // Catch:{ all -> 0x0042 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001b
            boolean r5 = r0.f2875k     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x001b
            java.net.Socket r5 = r14.b(r2, r2, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x001c
        L_0x001b:
            r5 = r4
        L_0x001c:
            g1.b r6 = r14.f2893i     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r6 = r4
        L_0x0023:
            boolean r7 = r14.f2894j     // Catch:{ all -> 0x0042 }
            if (r7 != 0) goto L_0x0028
            r0 = r4
        L_0x0028:
            if (r6 != 0) goto L_0x0046
            d1.b r7 = d1.C0109b.f2283e     // Catch:{ all -> 0x0042 }
            d1.m r8 = r14.f2889d     // Catch:{ all -> 0x0042 }
            d1.a r9 = r14.f2887a     // Catch:{ all -> 0x0042 }
            r7.getClass()     // Catch:{ all -> 0x0042 }
            d1.C0109b.b(r8, r9, r14, r4)     // Catch:{ all -> 0x0042 }
            g1.b r7 = r14.f2893i     // Catch:{ all -> 0x0042 }
            if (r7 == 0) goto L_0x003e
            r6 = r7
            r8 = 1
            r7 = r4
            goto L_0x0048
        L_0x003e:
            d1.J r7 = r14.f2888c     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r8 = 0
            goto L_0x0048
        L_0x0042:
            r0 = move-exception
            r15 = r0
            goto L_0x0184
        L_0x0046:
            r7 = r4
            goto L_0x0040
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            e1.c.e(r5)
            if (r0 == 0) goto L_0x0053
            d1.b r0 = r14.f2890e
            r0.getClass()
        L_0x0053:
            if (r8 == 0) goto L_0x005a
            d1.b r0 = r14.f2890e
            r0.getClass()
        L_0x005a:
            if (r6 == 0) goto L_0x005d
            return r6
        L_0x005d:
            if (r7 != 0) goto L_0x007a
            F.l r0 = r14.b
            if (r0 == 0) goto L_0x0070
            int r1 = r0.f210a
            java.lang.Object r0 = r0.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            g1.d r0 = r14.f2891g
            F.l r0 = r0.b()
            r14.b = r0
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            d1.m r5 = r14.f2889d
            monitor-enter(r5)
            if (r0 == 0) goto L_0x00b7
            F.l r0 = r14.b     // Catch:{ all -> 0x00b0 }
            r0.getClass()     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00b0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = r1.size()     // Catch:{ all -> 0x00b0 }
            r9 = 0
        L_0x0093:
            if (r9 >= r0) goto L_0x00b7
            java.lang.Object r10 = r1.get(r9)     // Catch:{ all -> 0x00b0 }
            d1.J r10 = (d1.J) r10     // Catch:{ all -> 0x00b0 }
            d1.b r11 = d1.C0109b.f2283e     // Catch:{ all -> 0x00b0 }
            d1.m r12 = r14.f2889d     // Catch:{ all -> 0x00b0 }
            d1.a r13 = r14.f2887a     // Catch:{ all -> 0x00b0 }
            r11.getClass()     // Catch:{ all -> 0x00b0 }
            d1.C0109b.b(r12, r13, r14, r10)     // Catch:{ all -> 0x00b0 }
            g1.b r11 = r14.f2893i     // Catch:{ all -> 0x00b0 }
            if (r11 == 0) goto L_0x00b4
            r14.f2888c = r10     // Catch:{ all -> 0x00b0 }
            r6 = r11
            r8 = 1
            goto L_0x00b7
        L_0x00b0:
            r0 = move-exception
            r15 = r0
            goto L_0x0172
        L_0x00b4:
            int r9 = r9 + 1
            goto L_0x0093
        L_0x00b7:
            if (r8 != 0) goto L_0x010c
            if (r7 != 0) goto L_0x00e6
            F.l r0 = r14.b     // Catch:{ all -> 0x00b0 }
            int r1 = r0.f210a     // Catch:{ all -> 0x00b0 }
            java.lang.Object r6 = r0.b     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x00b0 }
            int r6 = r6.size()     // Catch:{ all -> 0x00b0 }
            if (r1 >= r6) goto L_0x00cb
            r1 = 1
            goto L_0x00cc
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            if (r1 == 0) goto L_0x00e0
            int r1 = r0.f210a     // Catch:{ all -> 0x00b0 }
            int r6 = r1 + 1
            r0.f210a = r6     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00b0 }
            r7 = r0
            d1.J r7 = (d1.J) r7     // Catch:{ all -> 0x00b0 }
            goto L_0x00e6
        L_0x00e0:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00b0 }
            r15.<init>()     // Catch:{ all -> 0x00b0 }
            throw r15     // Catch:{ all -> 0x00b0 }
        L_0x00e6:
            r14.f2888c = r7     // Catch:{ all -> 0x00b0 }
            r14.f2892h = r2     // Catch:{ all -> 0x00b0 }
            g1.b r6 = new g1.b     // Catch:{ all -> 0x00b0 }
            d1.m r0 = r14.f2889d     // Catch:{ all -> 0x00b0 }
            r6.<init>(r0, r7)     // Catch:{ all -> 0x00b0 }
            g1.b r0 = r14.f2893i     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0106
            r14.f2893i = r6     // Catch:{ all -> 0x00b0 }
            r14.f2894j = r2     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = r6.f2878n     // Catch:{ all -> 0x00b0 }
            g1.e r1 = new g1.e     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r14.f     // Catch:{ all -> 0x00b0 }
            r1.<init>(r14, r7)     // Catch:{ all -> 0x00b0 }
            r0.add(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x010c
        L_0x0106:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b0 }
            r15.<init>()     // Catch:{ all -> 0x00b0 }
            throw r15     // Catch:{ all -> 0x00b0 }
        L_0x010c:
            monitor-exit(r5)     // Catch:{ all -> 0x00b0 }
            if (r8 == 0) goto L_0x0115
            d1.b r15 = r14.f2890e
            r15.getClass()
            return r6
        L_0x0115:
            d1.b r11 = r14.f2890e
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r6.c(r7, r8, r9, r10, r11)
            d1.b r15 = d1.C0109b.f2283e
            r15.getClass()
            d1.m r15 = r14.f2889d
            A.j r15 = r15.f2336e
            d1.J r0 = r6.f2868c
            r15.v(r0)
            d1.m r15 = r14.f2889d
            monitor-enter(r15)
            r14.f2894j = r3     // Catch:{ all -> 0x0164 }
            d1.b r0 = d1.C0109b.f2283e     // Catch:{ all -> 0x0164 }
            d1.m r1 = r14.f2889d     // Catch:{ all -> 0x0164 }
            r0.getClass()     // Catch:{ all -> 0x0164 }
            boolean r0 = r1.f     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x0148
            r1.f = r3     // Catch:{ all -> 0x0164 }
            java.util.concurrent.ThreadPoolExecutor r0 = d1.m.f2332g     // Catch:{ all -> 0x0164 }
            H0.E r5 = r1.f2334c     // Catch:{ all -> 0x0164 }
            r0.execute(r5)     // Catch:{ all -> 0x0164 }
        L_0x0148:
            java.util.ArrayDeque r0 = r1.f2335d     // Catch:{ all -> 0x0164 }
            r0.add(r6)     // Catch:{ all -> 0x0164 }
            j1.s r0 = r6.f2872h     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0152
            r2 = 1
        L_0x0152:
            if (r2 == 0) goto L_0x0166
            d1.b r0 = d1.C0109b.f2283e     // Catch:{ all -> 0x0164 }
            d1.m r1 = r14.f2889d     // Catch:{ all -> 0x0164 }
            d1.a r2 = r14.f2887a     // Catch:{ all -> 0x0164 }
            r0.getClass()     // Catch:{ all -> 0x0164 }
            java.net.Socket r4 = d1.C0109b.a(r1, r2, r14)     // Catch:{ all -> 0x0164 }
            g1.b r6 = r14.f2893i     // Catch:{ all -> 0x0164 }
            goto L_0x0166
        L_0x0164:
            r0 = move-exception
            goto L_0x0170
        L_0x0166:
            monitor-exit(r15)     // Catch:{ all -> 0x0164 }
            e1.c.e(r4)
            d1.b r15 = r14.f2890e
            r15.getClass()
            return r6
        L_0x0170:
            monitor-exit(r15)     // Catch:{ all -> 0x0164 }
            throw r0
        L_0x0172:
            monitor-exit(r5)     // Catch:{ all -> 0x00b0 }
            throw r15
        L_0x0174:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "codec != null"
            r15.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r15     // Catch:{ all -> 0x0042 }
        L_0x017c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "released"
            r15.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r15     // Catch:{ all -> 0x0042 }
        L_0x0184:
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.c(int, int, int, boolean):g1.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0.h(r8) != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g1.b d(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r3 = this;
        L_0x0000:
            g1.b r0 = r3.c(r4, r5, r6, r7)
            d1.m r1 = r3.f2889d
            monitor-enter(r1)
            int r2 = r0.f2876l     // Catch:{ all -> 0x000d }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            return r0
        L_0x000d:
            r4 = move-exception
            goto L_0x001b
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            boolean r1 = r0.h(r8)
            if (r1 != 0) goto L_0x001a
            r3.e()
            goto L_0x0000
        L_0x001a:
            return r0
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.d(int, int, int, boolean, boolean):g1.b");
    }

    public final void e() {
        b bVar;
        Socket b2;
        synchronized (this.f2889d) {
            bVar = this.f2893i;
            b2 = b(true, false, false);
            if (this.f2893i != null) {
                bVar = null;
            }
        }
        e1.c.e(b2);
        if (bVar != null) {
            this.f2890e.getClass();
        }
    }

    public final void f() {
        b bVar;
        Socket b2;
        synchronized (this.f2889d) {
            bVar = this.f2893i;
            b2 = b(false, true, false);
            if (this.f2893i != null) {
                bVar = null;
            }
        }
        e1.c.e(b2);
        if (bVar != null) {
            this.f2890e.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.io.IOException r7) {
        /*
            r6 = this;
            d1.m r0 = r6.f2889d
            monitor-enter(r0)
            boolean r1 = r7 instanceof j1.E     // Catch:{ all -> 0x0017 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0022
            j1.E r7 = (j1.E) r7     // Catch:{ all -> 0x0017 }
            int r7 = r7.f     // Catch:{ all -> 0x0017 }
            r1 = 5
            if (r7 != r1) goto L_0x0019
            int r5 = r6.f2892h     // Catch:{ all -> 0x0017 }
            int r5 = r5 + r3
            r6.f2892h = r5     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r7 = move-exception
            goto L_0x0063
        L_0x0019:
            if (r7 != r1) goto L_0x001f
            int r7 = r6.f2892h     // Catch:{ all -> 0x0017 }
            if (r7 <= r3) goto L_0x0046
        L_0x001f:
            r6.f2888c = r4     // Catch:{ all -> 0x0017 }
            goto L_0x0044
        L_0x0022:
            g1.b r1 = r6.f2893i     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0046
            j1.s r5 = r1.f2872h     // Catch:{ all -> 0x0017 }
            if (r5 == 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x0033
            boolean r5 = r7 instanceof j1.C0220a     // Catch:{ all -> 0x0017 }
            if (r5 == 0) goto L_0x0046
        L_0x0033:
            int r1 = r1.f2876l     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0044
            d1.J r1 = r6.f2888c     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            g1.d r5 = r6.f2891g     // Catch:{ all -> 0x0017 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0017 }
        L_0x0042:
            r6.f2888c = r4     // Catch:{ all -> 0x0017 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            g1.b r1 = r6.f2893i     // Catch:{ all -> 0x0017 }
            java.net.Socket r7 = r6.b(r7, r2, r3)     // Catch:{ all -> 0x0017 }
            g1.b r2 = r6.f2893i     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.f2894j     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            e1.c.e(r7)
            if (r4 == 0) goto L_0x0062
            d1.b r7 = r6.f2890e
            r7.getClass()
        L_0x0062:
            return
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.g(java.io.IOException):void");
    }

    public final void h(boolean z2, c cVar, IOException iOException) {
        b bVar;
        Socket b2;
        boolean z3;
        this.f2890e.getClass();
        synchronized (this.f2889d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f2896l) {
                        if (!z2) {
                            this.f2893i.f2876l++;
                        }
                        bVar = this.f2893i;
                        b2 = b(z2, false, true);
                        if (this.f2893i != null) {
                            bVar = null;
                        }
                        z3 = this.f2895k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f2896l + " but was " + cVar);
        }
        e1.c.e(b2);
        if (bVar != null) {
            this.f2890e.getClass();
        }
        if (iOException != null) {
            this.f2890e.getClass();
        } else if (z3) {
            this.f2890e.getClass();
        }
    }

    public final String toString() {
        b a2 = a();
        if (a2 != null) {
            return a2.toString();
        }
        return this.f2887a.toString();
    }
}

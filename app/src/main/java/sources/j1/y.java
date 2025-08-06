package j1;

import java.io.IOException;
import java.util.ArrayList;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public long f3302a = 0;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3303c;

    /* renamed from: d  reason: collision with root package name */
    public final s f3304d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f3305e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final w f3306g;

    /* renamed from: h  reason: collision with root package name */
    public final v f3307h;

    /* renamed from: i  reason: collision with root package name */
    public final x f3308i = new x(0, this);

    /* renamed from: j  reason: collision with root package name */
    public final x f3309j = new x(0, this);

    /* renamed from: k  reason: collision with root package name */
    public int f3310k = 0;

    public y(int i2, s sVar, boolean z2, boolean z3, ArrayList arrayList) {
        if (sVar != null) {
            this.f3303c = i2;
            this.f3304d = sVar;
            this.b = (long) sVar.f3277t.a();
            w wVar = new w(this, (long) sVar.f3276s.a());
            this.f3306g = wVar;
            v vVar = new v(this);
            this.f3307h = vVar;
            wVar.f3298j = z3;
            vVar.f3293h = z2;
            return;
        }
        throw new NullPointerException("connection == null");
    }

    public final void a() {
        boolean z2;
        boolean g2;
        synchronized (this) {
            try {
                w wVar = this.f3306g;
                if (!wVar.f3298j && wVar.f3297i) {
                    v vVar = this.f3307h;
                    if (!vVar.f3293h) {
                        if (vVar.f3292g) {
                        }
                    }
                    z2 = true;
                    g2 = g();
                }
                z2 = false;
                g2 = g();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            c(6);
        } else if (!g2) {
            this.f3304d.o(this.f3303c);
        }
    }

    public final void b() {
        v vVar = this.f3307h;
        if (vVar.f3292g) {
            throw new IOException("stream closed");
        } else if (vVar.f3293h) {
            throw new IOException("stream finished");
        } else if (this.f3310k != 0) {
            throw new E(this.f3310k);
        }
    }

    public final void c(int i2) {
        if (d(i2)) {
            this.f3304d.f3280w.q(this.f3303c, i2);
        }
    }

    public final boolean d(int i2) {
        synchronized (this) {
            try {
                if (this.f3310k != 0) {
                    return false;
                }
                if (this.f3306g.f3298j && this.f3307h.f3293h) {
                    return false;
                }
                this.f3310k = i2;
                notifyAll();
                this.f3304d.o(this.f3303c);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final v e() {
        synchronized (this) {
            try {
                if (!this.f) {
                    if (!f()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return this.f3307h;
    }

    public final boolean f() {
        boolean z2;
        if ((this.f3303c & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3304d.f == z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f3310k     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            j1.w r0 = r3.f3306g     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.f3298j     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            boolean r0 = r0.f3297i     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            goto L_0x0015
        L_0x0013:
            r0 = move-exception
            goto L_0x0028
        L_0x0015:
            j1.v r0 = r3.f3307h     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.f3293h     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x001f
            boolean r0 = r0.f3292g     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            boolean r0 = r3.f     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r3)
            return r1
        L_0x0025:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.y.g():boolean");
    }

    public final void h() {
        boolean g2;
        synchronized (this) {
            this.f3306g.f3298j = true;
            g2 = g();
            notifyAll();
        }
        if (!g2) {
            this.f3304d.o(this.f3303c);
        }
    }

    public final void i(ArrayList arrayList) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            try {
                this.f = true;
                if (this.f3305e == null) {
                    this.f3305e = arrayList;
                    z2 = g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f3305e);
                    arrayList2.add((Object) null);
                    arrayList2.addAll(arrayList);
                    this.f3305e = arrayList2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z2) {
            this.f3304d.o(this.f3303c);
        }
    }

    public final synchronized void j(int i2) {
        if (this.f3310k == 0) {
            this.f3310k = i2;
            notifyAll();
        }
    }
}

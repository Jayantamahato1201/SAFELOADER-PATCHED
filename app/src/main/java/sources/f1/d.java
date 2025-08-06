package f1;

import java.io.IOException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f2701a;
    public final boolean[] b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2702c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2703d;

    public d(g gVar, e eVar) {
        boolean[] zArr;
        this.f2703d = gVar;
        this.f2701a = eVar;
        if (eVar.f2707e) {
            zArr = null;
        } else {
            zArr = new boolean[gVar.f2720m];
        }
        this.b = zArr;
    }

    public final void a() {
        synchronized (this.f2703d) {
            try {
                if (!this.f2702c) {
                    if (this.f2701a.f == this) {
                        this.f2703d.l(this, false);
                    }
                    this.f2702c = true;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f2703d) {
            try {
                if (!this.f2702c) {
                    if (this.f2701a.f == this) {
                        this.f2703d.l(this, true);
                    }
                    this.f2702c = true;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        e eVar = this.f2701a;
        if (eVar.f == this) {
            int i2 = 0;
            while (true) {
                g gVar = this.f2703d;
                if (i2 < gVar.f2720m) {
                    try {
                        gVar.f.a(eVar.f2706d[i2]);
                    } catch (IOException unused) {
                    }
                    i2++;
                } else {
                    eVar.f = null;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.Object, o1.u] */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.lang.Object, o1.x] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, o1.x] */
    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, o1.u] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.getParentFile().mkdirs();
        r2 = o1.o.f3758a;
        r4 = new o1.a((o1.x) new java.lang.Object(), (java.io.OutputStream) new java.io.FileOutputStream(r6));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o1.u d(int r6) {
        /*
            r5 = this;
            r0 = 1
            f1.g r1 = r5.f2703d
            monitor-enter(r1)
            boolean r2 = r5.f2702c     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0070
            f1.e r2 = r5.f2701a     // Catch:{ all -> 0x0017 }
            f1.d r3 = r2.f     // Catch:{ all -> 0x0017 }
            if (r3 == r5) goto L_0x0019
            java.util.logging.Logger r6 = o1.o.f3758a     // Catch:{ all -> 0x0017 }
            o1.n r6 = new o1.n     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0017:
            r6 = move-exception
            goto L_0x0076
        L_0x0019:
            boolean r3 = r2.f2707e     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0021
            boolean[] r3 = r5.b     // Catch:{ all -> 0x0017 }
            r3[r6] = r0     // Catch:{ all -> 0x0017 }
        L_0x0021:
            java.io.File[] r2 = r2.f2706d     // Catch:{ all -> 0x0017 }
            r6 = r2[r6]     // Catch:{ all -> 0x0017 }
            f1.g r2 = r5.f2703d     // Catch:{ FileNotFoundException -> 0x0067 }
            k1.a r2 = r2.f     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.getClass()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.util.logging.Logger r2 = o1.o.f3758a     // Catch:{ FileNotFoundException -> 0x0048 }
            if (r6 == 0) goto L_0x0040
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0048 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0048 }
            o1.x r3 = new o1.x     // Catch:{ FileNotFoundException -> 0x0048 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0048 }
            o1.a r4 = new o1.a     // Catch:{ FileNotFoundException -> 0x0048 }
            r4.<init>((o1.x) r3, (java.io.OutputStream) r2)     // Catch:{ FileNotFoundException -> 0x0048 }
            goto L_0x0060
        L_0x0040:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x0048 }
            java.lang.String r3 = "file == null"
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0048 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0048 }
        L_0x0048:
            java.io.File r2 = r6.getParentFile()     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.mkdirs()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.util.logging.Logger r2 = o1.o.f3758a     // Catch:{ FileNotFoundException -> 0x0067 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0067 }
            o1.x r6 = new o1.x     // Catch:{ FileNotFoundException -> 0x0067 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0067 }
            o1.a r4 = new o1.a     // Catch:{ FileNotFoundException -> 0x0067 }
            r4.<init>((o1.x) r6, (java.io.OutputStream) r2)     // Catch:{ FileNotFoundException -> 0x0067 }
        L_0x0060:
            f1.c r6 = new f1.c     // Catch:{ all -> 0x0017 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0067:
            java.util.logging.Logger r6 = o1.o.f3758a     // Catch:{ all -> 0x0017 }
            o1.n r6 = new o1.n     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0070:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            throw r6     // Catch:{ all -> 0x0017 }
        L_0x0076:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.d(int):o1.u");
    }
}

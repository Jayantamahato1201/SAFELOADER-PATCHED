package j1;

import o1.e;
import o1.u;
import o1.x;

public final class v implements u, AutoCloseable {
    public final e f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f3292g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3293h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ y f3294i;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, o1.e] */
    public v(y yVar) {
        this.f3294i = yVar;
    }

    public final x a() {
        return this.f3294i.f3309j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        r0 = r13.f3294i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0.f3307h.f3293h != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r13.f.f3745g <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r13.f.f3745g <= 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        k(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0.f3304d.q(r0.f3303c, true, (o1.e) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r3 = r13.f3294i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r13.f3292g = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r13.f3294i.f3304d.flush();
        r13.f3294i.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            j1.y r1 = r13.f3294i
            monitor-enter(r1)
            boolean r0 = r13.f3292g     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r0 = move-exception
            goto L_0x004c
        L_0x000b:
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            j1.y r0 = r13.f3294i
            j1.v r1 = r0.f3307h
            boolean r1 = r1.f3293h
            r2 = 1
            if (r1 != 0) goto L_0x0036
            o1.e r1 = r13.f
            long r3 = r1.f3745g
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x002b
        L_0x001f:
            o1.e r0 = r13.f
            long r0 = r0.f3745g
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
            r13.k(r2)
            goto L_0x001f
        L_0x002b:
            j1.s r7 = r0.f3304d
            int r8 = r0.f3303c
            r11 = 0
            r9 = 1
            r10 = 0
            r7.q(r8, r9, r10, r11)
        L_0x0036:
            j1.y r3 = r13.f3294i
            monitor-enter(r3)
            r13.f3292g = r2     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            j1.y r0 = r13.f3294i
            j1.s r0 = r0.f3304d
            r0.flush()
            j1.y r0 = r13.f3294i
            r0.a()
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0
        L_0x004c:
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.v.close():void");
    }

    public final void flush() {
        synchronized (this.f3294i) {
            this.f3294i.b();
        }
        while (this.f.f3745g > 0) {
            k(false);
            this.f3294i.f3304d.flush();
        }
    }

    public final void g(e eVar, long j2) {
        e eVar2 = this.f;
        eVar2.g(eVar, j2);
        while (eVar2.f3745g >= 16384) {
            k(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.f3309j.n();
        r12.f3294i.b();
        r10 = java.lang.Math.min(r12.f3294i.b, r12.f.f3745g);
        r0 = r12.f3294i;
        r0.b -= r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(boolean r13) {
        /*
            r12 = this;
            j1.y r1 = r12.f3294i
            monitor-enter(r1)
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x007d }
            j1.x r0 = r0.f3309j     // Catch:{ all -> 0x007d }
            r0.i()     // Catch:{ all -> 0x007d }
        L_0x000a:
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x002a }
            long r2 = r0.b     // Catch:{ all -> 0x002a }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x002d
            boolean r2 = r12.f3293h     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002d
            boolean r2 = r12.f3292g     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002d
            int r2 = r0.f3310k     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002d
            r0.wait()     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x000a
        L_0x0024:
            java.io.InterruptedIOException r13 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r13.<init>()     // Catch:{ all -> 0x002a }
            throw r13     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r13 = r0
            goto L_0x0080
        L_0x002d:
            j1.x r0 = r0.f3309j     // Catch:{ all -> 0x007d }
            r0.n()     // Catch:{ all -> 0x007d }
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x007d }
            r0.b()     // Catch:{ all -> 0x007d }
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x007d }
            long r2 = r0.b     // Catch:{ all -> 0x007d }
            o1.e r0 = r12.f     // Catch:{ all -> 0x007d }
            long r4 = r0.f3745g     // Catch:{ all -> 0x007d }
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x007d }
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x007d }
            long r2 = r0.b     // Catch:{ all -> 0x007d }
            long r2 = r2 - r10
            r0.b = r2     // Catch:{ all -> 0x007d }
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            j1.x r0 = r0.f3309j
            r0.i()
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x0063 }
            j1.s r6 = r0.f3304d     // Catch:{ all -> 0x0063 }
            int r7 = r0.f3303c     // Catch:{ all -> 0x0063 }
            if (r13 == 0) goto L_0x0066
            o1.e r13 = r12.f     // Catch:{ all -> 0x0063 }
            long r0 = r13.f3745g     // Catch:{ all -> 0x0063 }
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0066
            r13 = 1
            r8 = 1
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r13 = r0
            goto L_0x0075
        L_0x0066:
            r13 = 0
            r8 = 0
        L_0x0068:
            o1.e r9 = r12.f     // Catch:{ all -> 0x0063 }
            r6.q(r7, r8, r9, r10)     // Catch:{ all -> 0x0063 }
            j1.y r13 = r12.f3294i
            j1.x r13 = r13.f3309j
            r13.n()
            return
        L_0x0075:
            j1.y r0 = r12.f3294i
            j1.x r0 = r0.f3309j
            r0.n()
            throw r13
        L_0x007d:
            r0 = move-exception
            r13 = r0
            goto L_0x0088
        L_0x0080:
            j1.y r0 = r12.f3294i     // Catch:{ all -> 0x007d }
            j1.x r0 = r0.f3309j     // Catch:{ all -> 0x007d }
            r0.n()     // Catch:{ all -> 0x007d }
            throw r13     // Catch:{ all -> 0x007d }
        L_0x0088:
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.v.k(boolean):void");
    }
}

package j1;

import o1.e;
import o1.v;
import o1.x;

public final class w implements v, AutoCloseable {
    public final e f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final e f3295g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final long f3296h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3297i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3298j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ y f3299k;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, o1.e] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, o1.e] */
    public w(y yVar, long j2) {
        this.f3299k = yVar;
        this.f3296h = j2;
    }

    public final x a() {
        return this.f3299k.f3308i;
    }

    public final void close() {
        synchronized (this.f3299k) {
            this.f3297i = true;
            this.f3295g.k();
            this.f3299k.notifyAll();
        }
        this.f3299k.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r9 = r8.f3299k.f3304d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10 = r8.f3299k.f3304d;
        r4 = r10.f3274q + r0;
        r10.f3274q = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r4 < ((long) (r10.f3276s.a() / 2))) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        r10 = r8.f3299k.f3304d;
        r10.s(0, r10.f3274q);
        r8.f3299k.f3304d.f3274q = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(o1.e r9, long r10) {
        /*
            r8 = this;
            j1.y r10 = r8.f3299k
            monitor-enter(r10)
            j1.y r11 = r8.f3299k     // Catch:{ all -> 0x0048 }
            j1.x r0 = r11.f3308i     // Catch:{ all -> 0x0048 }
            r0.i()     // Catch:{ all -> 0x0048 }
        L_0x000a:
            o1.e r0 = r8.f3295g     // Catch:{ all -> 0x002a }
            long r0 = r0.f3745g     // Catch:{ all -> 0x002a }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            boolean r0 = r8.f3298j     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            boolean r0 = r8.f3297i     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            int r0 = r11.f3310k     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            r11.wait()     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x000a
        L_0x0024:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x002a:
            r9 = move-exception
            goto L_0x00bd
        L_0x002d:
            j1.x r11 = r11.f3308i     // Catch:{ all -> 0x0048 }
            r11.n()     // Catch:{ all -> 0x0048 }
            boolean r11 = r8.f3297i     // Catch:{ all -> 0x0048 }
            if (r11 != 0) goto L_0x00b5
            j1.y r11 = r8.f3299k     // Catch:{ all -> 0x0048 }
            int r0 = r11.f3310k     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x00ad
            o1.e r11 = r8.f3295g     // Catch:{ all -> 0x0048 }
            long r0 = r11.f3745g     // Catch:{ all -> 0x0048 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x004b
            r0 = -1
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r9 = move-exception
            goto L_0x00c3
        L_0x004b:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0048 }
            long r0 = r11.f(r9, r0)     // Catch:{ all -> 0x0048 }
            j1.y r9 = r8.f3299k     // Catch:{ all -> 0x0048 }
            long r4 = r9.f3302a     // Catch:{ all -> 0x0048 }
            long r4 = r4 + r0
            r9.f3302a = r4     // Catch:{ all -> 0x0048 }
            j1.s r9 = r9.f3304d     // Catch:{ all -> 0x0048 }
            j1.D r9 = r9.f3276s     // Catch:{ all -> 0x0048 }
            int r9 = r9.a()     // Catch:{ all -> 0x0048 }
            int r9 = r9 / 2
            long r6 = (long) r9     // Catch:{ all -> 0x0048 }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x007a
            j1.y r9 = r8.f3299k     // Catch:{ all -> 0x0048 }
            j1.s r11 = r9.f3304d     // Catch:{ all -> 0x0048 }
            int r4 = r9.f3303c     // Catch:{ all -> 0x0048 }
            long r5 = r9.f3302a     // Catch:{ all -> 0x0048 }
            r11.s(r4, r5)     // Catch:{ all -> 0x0048 }
            j1.y r9 = r8.f3299k     // Catch:{ all -> 0x0048 }
            r9.f3302a = r2     // Catch:{ all -> 0x0048 }
        L_0x007a:
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            j1.y r9 = r8.f3299k
            j1.s r9 = r9.f3304d
            monitor-enter(r9)
            j1.y r10 = r8.f3299k     // Catch:{ all -> 0x00a7 }
            j1.s r10 = r10.f3304d     // Catch:{ all -> 0x00a7 }
            long r4 = r10.f3274q     // Catch:{ all -> 0x00a7 }
            long r4 = r4 + r0
            r10.f3274q = r4     // Catch:{ all -> 0x00a7 }
            j1.D r10 = r10.f3276s     // Catch:{ all -> 0x00a7 }
            int r10 = r10.a()     // Catch:{ all -> 0x00a7 }
            int r10 = r10 / 2
            long r10 = (long) r10     // Catch:{ all -> 0x00a7 }
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x00a9
            j1.y r10 = r8.f3299k     // Catch:{ all -> 0x00a7 }
            j1.s r10 = r10.f3304d     // Catch:{ all -> 0x00a7 }
            long r4 = r10.f3274q     // Catch:{ all -> 0x00a7 }
            r11 = 0
            r10.s(r11, r4)     // Catch:{ all -> 0x00a7 }
            j1.y r10 = r8.f3299k     // Catch:{ all -> 0x00a7 }
            j1.s r10 = r10.f3304d     // Catch:{ all -> 0x00a7 }
            r10.f3274q = r2     // Catch:{ all -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
            r10 = move-exception
            goto L_0x00ab
        L_0x00a9:
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00ab:
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            throw r10
        L_0x00ad:
            j1.E r9 = new j1.E     // Catch:{ all -> 0x0048 }
            int r11 = r11.f3310k     // Catch:{ all -> 0x0048 }
            r9.<init>(r11)     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00b5:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0048 }
            java.lang.String r11 = "stream closed"
            r9.<init>(r11)     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00bd:
            j1.x r11 = r11.f3308i     // Catch:{ all -> 0x0048 }
            r11.n()     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00c3:
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.w.f(o1.e, long):long");
    }
}

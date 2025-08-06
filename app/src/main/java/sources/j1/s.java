package j1;

import A.g;
import e1.b;
import e1.c;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class s implements Closeable, AutoCloseable {

    /* renamed from: z  reason: collision with root package name */
    public static final ThreadPoolExecutor f3263z;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final o f3264g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f3265h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final String f3266i;

    /* renamed from: j  reason: collision with root package name */
    public int f3267j;

    /* renamed from: k  reason: collision with root package name */
    public int f3268k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3269l;

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3270m;

    /* renamed from: n  reason: collision with root package name */
    public final ThreadPoolExecutor f3271n;

    /* renamed from: o  reason: collision with root package name */
    public final C f3272o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3273p;

    /* renamed from: q  reason: collision with root package name */
    public long f3274q = 0;

    /* renamed from: r  reason: collision with root package name */
    public long f3275r;

    /* renamed from: s  reason: collision with root package name */
    public final D f3276s;

    /* renamed from: t  reason: collision with root package name */
    public final D f3277t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3278u;

    /* renamed from: v  reason: collision with root package name */
    public final Socket f3279v;

    /* renamed from: w  reason: collision with root package name */
    public final z f3280w;

    /* renamed from: x  reason: collision with root package name */
    public final q f3281x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashSet f3282y;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.f2613a;
        f3263z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new b("OkHttp Http2Connection", true));
    }

    public s(m mVar) {
        int i2;
        m mVar2 = mVar;
        D d2 = new D();
        this.f3276s = d2;
        D d3 = new D();
        this.f3277t = d3;
        this.f3278u = false;
        this.f3282y = new LinkedHashSet();
        this.f3272o = C.f3205a;
        boolean z2 = mVar2.f;
        this.f = z2;
        this.f3264g = mVar2.f3253e;
        if (z2) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f3268k = i2;
        if (z2) {
            this.f3268k = i2 + 2;
        }
        if (z2) {
            d2.b(7, 16777216);
        }
        String str = mVar2.b;
        this.f3266i = str;
        byte[] bArr = c.f2613a;
        Locale locale = Locale.US;
        this.f3270m = new ScheduledThreadPoolExecutor(1, new b(g.i("OkHttp ", str, " Writer"), false));
        this.f3271n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(g.i("OkHttp ", str, " Push Observer"), true));
        d3.b(7, 65535);
        d3.b(5, 16384);
        this.f3275r = (long) d3.a();
        this.f3279v = mVar2.f3250a;
        this.f3280w = new z(mVar2.f3252d, z2);
        this.f3281x = new q(this, new u(mVar2.f3251c, z2));
    }

    public final void close() {
        k(1, 6);
    }

    public final void flush() {
        this.f3280w.flush();
    }

    public final void k(int i2, int i3) {
        y[] yVarArr = null;
        try {
            p(i2);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            try {
                if (!this.f3265h.isEmpty()) {
                    yVarArr = (y[]) this.f3265h.values().toArray(new y[this.f3265h.size()]);
                    this.f3265h.clear();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (yVarArr != null) {
            for (y c2 : yVarArr) {
                try {
                    c2.c(i3);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f3280w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f3279v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f3270m.shutdown();
        this.f3271n.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void l() {
        try {
            k(2, 2);
        } catch (IOException unused) {
        }
    }

    public final synchronized y m(int i2) {
        return (y) this.f3265h.get(Integer.valueOf(i2));
    }

    public final synchronized int n() {
        int i2;
        D d2 = this.f3277t;
        if ((d2.b & 16) != 0) {
            i2 = d2.f3206a[4];
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return i2;
    }

    public final synchronized y o(int i2) {
        y yVar;
        yVar = (y) this.f3265h.remove(Integer.valueOf(i2));
        notifyAll();
        return yVar;
    }

    public final void p(int i2) {
        synchronized (this.f3280w) {
            synchronized (this) {
                if (!this.f3269l) {
                    this.f3269l = true;
                    int i3 = this.f3267j;
                    this.f3280w.n(c.f2613a, i3, i2);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f3280w.f3314i);
        r6 = (long) r3;
        r8.f3275r -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r9, boolean r10, o1.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            j1.z r12 = r8.f3280w
            r12.l(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x005e
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f3275r     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0032
            java.util.LinkedHashMap r3 = r8.f3265h     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            r9 = move-exception
            goto L_0x005c
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0032:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0028 }
            int r4 = (int) r3     // Catch:{ all -> 0x0028 }
            j1.z r3 = r8.f3280w     // Catch:{ all -> 0x0028 }
            int r3 = r3.f3314i     // Catch:{ all -> 0x0028 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0028 }
            long r4 = r8.f3275r     // Catch:{ all -> 0x0028 }
            long r6 = (long) r3     // Catch:{ all -> 0x0028 }
            long r4 = r4 - r6
            r8.f3275r = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            long r12 = r12 - r6
            j1.z r4 = r8.f3280w
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.l(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0028 }
            r9.<init>()     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x005c:
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.s.q(int, boolean, o1.e, long):void");
    }

    public final void r(int i2, int i3) {
        try {
            this.f3270m.execute(new i(this, new Object[]{this.f3266i, Integer.valueOf(i2)}, i2, i3));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void s(int i2, long j2) {
        try {
            this.f3270m.execute(new j(this, new Object[]{this.f3266i, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}

package q1;

import k.C0241f0;

/* renamed from: q1.d0  reason: case insensitive filesystem */
public final /* synthetic */ class C0333d0 implements Runnable {
    public final /* synthetic */ int f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Q2 f4073g;

    public /* synthetic */ C0333d0(int i2, Q2 q2) {
        this.f4073g = q2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r3.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r2.isEmpty() == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r2 = q1.C0339e0.f4083d;
        r1 = r1.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        ((q1.C0413q2) r2.f3459a).c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0008, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            q1.Q2 r0 = r6.f4073g
            q1.u2 r0 = r0.f3973n     // Catch:{ Exception -> 0x0066 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0066 }
        L_0x0008:
            r1 = r0
            q1.k2 r1 = (q1.C0377k2) r1     // Catch:{ Exception -> 0x0066 }
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0066 }
            if (r2 == 0) goto L_0x0066
            java.lang.Object r1 = r1.next()     // Catch:{ Exception -> 0x0066 }
            q1.g3 r1 = (q1.C0354g3) r1     // Catch:{ Exception -> 0x0066 }
            android.os.IBinder r2 = r1.f4104e     // Catch:{ Exception -> 0x0066 }
            if (r2 == 0) goto L_0x0023
            java.util.concurrent.ConcurrentHashMap r3 = q1.C0339e0.f4082c     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r2 = r3.remove(r2)     // Catch:{ Exception -> 0x0066 }
            q1.g3 r2 = (q1.C0354g3) r2     // Catch:{ Exception -> 0x0066 }
        L_0x0023:
            java.util.Deque r2 = r1.f4105g     // Catch:{ Exception -> 0x0066 }
            if (r2 != 0) goto L_0x0028
            goto L_0x0008
        L_0x0028:
            java.util.Iterator r3 = r2.descendingIterator()     // Catch:{ Exception -> 0x0066 }
        L_0x002c:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0066 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0066 }
            T0.a r5 = q1.C0339e0.f4085g     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r5 = r5.a()     // Catch:{ Exception -> 0x0066 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0066 }
            if (r4 == 0) goto L_0x0008
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0066 }
            q1.g3 r4 = (q1.C0354g3) r4     // Catch:{ Exception -> 0x0066 }
            boolean r4 = U0.i.a(r4, r1)     // Catch:{ Exception -> 0x0066 }
            if (r4 == 0) goto L_0x002c
            r3.remove()     // Catch:{ Exception -> 0x0066 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0066 }
            if (r2 == 0) goto L_0x0008
            k.f0 r2 = q1.C0339e0.f4083d     // Catch:{ Exception -> 0x0066 }
            int r1 = r1.f     // Catch:{ Exception -> 0x0066 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r3 = r2.f3459a     // Catch:{ all -> 0x0063 }
            q1.q2 r3 = (q1.C0413q2) r3     // Catch:{ all -> 0x0063 }
            r3.c(r1)     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0008
        L_0x0063:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0066 }
            throw r0     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0333d0.a():void");
    }

    public final void run() {
        boolean z2;
        switch (this.f) {
            case 0:
                a();
                return;
            default:
                H.o(this.f4073g);
                if (C0360h3.f4114d == 0) {
                    int i2 = 1;
                    while (true) {
                        if (i2 < 25) {
                            try {
                                C0241f0 f0Var = C0360h3.f4112a;
                                synchronized (f0Var) {
                                    C0413q2 q2Var = (C0413q2) f0Var.f3459a;
                                    if (H.a(q2Var.f4178c, i2, q2Var.f4177a) >= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                if (z2) {
                                    i2++;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    i2 = 0;
                    d5.b.execute(new V2(i2, 0));
                    C0360h3.f4114d = i2;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C0333d0(Q2 q2) {
        this.f4073g = q2;
    }
}

package q1;

import android.os.IBinder;

/* renamed from: q1.t  reason: case insensitive filesystem */
public final /* synthetic */ class C0427t implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IBinder f4187g;

    public /* synthetic */ C0427t(IBinder iBinder, int i2) {
        this.f = i2;
        this.f4187g = iBinder;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|4|5|6|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.f
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0046;
                case 2: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.os.IBinder r0 = r5.f4187g
            q1.F r1 = q1.F.f3877c
            r1.getClass()
            android.os.IInterface r1 = r1.b()     // Catch:{ Exception -> 0x0016 }
            q1.s0 r1 = (q1.C0422s0) r1     // Catch:{ Exception -> 0x0016 }
            r1.z0(r0)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0022
        L_0x0016:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0022 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0022 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0022 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            android.os.IBinder r0 = r5.f4187g
            r1 = r0
            q1.C3 r1 = (q1.C3) r1     // Catch:{ Exception -> 0x0045 }
            q1.Q2 r1 = r1.f3866a     // Catch:{ Exception -> 0x0045 }
            q1.a3 r1 = r1.f3967h     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0031
            r1.h0(r0)     // Catch:{ Exception -> 0x0045 }
        L_0x0031:
            r1 = r0
            q1.C3 r1 = (q1.C3) r1     // Catch:{ Exception -> 0x0045 }
            q1.Q2 r1 = r1.f3866a     // Catch:{ Exception -> 0x0045 }
            q1.q2 r1 = r1.f3971l     // Catch:{ Exception -> 0x0045 }
            q1.C3 r0 = (q1.C3) r0     // Catch:{ Exception -> 0x0045 }
            android.content.pm.ServiceInfo r0 = r0.b     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x0045 }
            int r0 = r0.hashCode()     // Catch:{ Exception -> 0x0045 }
            r1.c(r0)     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return
        L_0x0046:
            android.os.IBinder r0 = r5.f4187g
            java.util.concurrent.ConcurrentHashMap r1 = q1.C0339e0.f4082c     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ Exception -> 0x0093 }
            q1.g3 r0 = (q1.C0354g3) r0     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x0093
            q1.Q2 r1 = r0.f4102c     // Catch:{ Exception -> 0x0093 }
            q1.u2 r1 = r1.f3973n     // Catch:{ Exception -> 0x0093 }
            q1.q2 r1 = r1.f     // Catch:{ Exception -> 0x0093 }
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x0093 }
            r1.c(r2)     // Catch:{ Exception -> 0x0093 }
            java.util.Deque r1 = r0.f4105g     // Catch:{ Exception -> 0x0093 }
            if (r1 == 0) goto L_0x0093
            java.util.Iterator r2 = r1.descendingIterator()     // Catch:{ Exception -> 0x0093 }
            if (r2 == 0) goto L_0x0093
        L_0x0069:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0093 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0093 }
            boolean r3 = U0.i.a(r3, r0)     // Catch:{ Exception -> 0x0093 }
            if (r3 == 0) goto L_0x0069
            r2.remove()     // Catch:{ Exception -> 0x0093 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0093 }
            if (r1 == 0) goto L_0x0093
            k.f0 r1 = q1.C0339e0.f4083d     // Catch:{ Exception -> 0x0093 }
            int r0 = r0.f     // Catch:{ Exception -> 0x0093 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r2 = r1.f3459a     // Catch:{ all -> 0x0090 }
            q1.q2 r2 = (q1.C0413q2) r2     // Catch:{ all -> 0x0090 }
            r2.c(r0)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0093 }
            throw r0     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            return
        L_0x0094:
            android.os.IBinder r0 = r5.f4187g
            java.util.Map r1 = q1.C0433u.f4206r     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ Exception -> 0x00cd }
            android.app.Service r0 = (android.app.Service) r0     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x00cd
            r0.onDestroy()     // Catch:{ Exception -> 0x00cd }
            q1.C0 r1 = q1.C0433u.f4212x     // Catch:{ Exception -> 0x00cd }
            r2 = 0
            r1.c(r0, r2)     // Catch:{ Exception -> 0x00cd }
            android.content.Context r1 = r0.getBaseContext()     // Catch:{ Exception -> 0x00cd }
            java.lang.Class r2 = q1.C0433u.f4208t     // Catch:{ Exception -> 0x00cd }
            boolean r2 = r2.isInstance(r1)     // Catch:{ Exception -> 0x00cd }
            if (r2 == 0) goto L_0x00cd
            q1.C0 r2 = q1.C0433u.f4211w     // Catch:{ Exception -> 0x00cd }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00cd }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00cd }
            r4 = 0
            r3[r4] = r0     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = "Service"
            r4 = 1
            r3[r4] = r0     // Catch:{ Exception -> 0x00cd }
            r2.b(r1, r3)     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0427t.run():void");
    }
}

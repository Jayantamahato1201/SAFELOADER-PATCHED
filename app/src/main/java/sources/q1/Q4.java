package q1;

public final /* synthetic */ class Q4 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3976g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3977h;

    public /* synthetic */ Q4(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.f3976g = obj;
        this.f3977h = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3976g
            android.content.IIntentReceiver r0 = (android.content.IIntentReceiver) r0
            q1.T3 r1 = q1.T3.f3994c
            java.lang.Object r2 = r4.f3977h
            android.content.IntentFilter r2 = (android.content.IntentFilter) r2
            r1.getClass()
            android.os.IInterface r1 = r1.b()     // Catch:{ Exception -> 0x001d }
            q1.b4 r1 = (q1.C0325b4) r1     // Catch:{ Exception -> 0x001d }
            int r3 = q1.H.f3901s     // Catch:{ Exception -> 0x001d }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x001d }
            r1.q0(r3, r0, r2)     // Catch:{ Exception -> 0x001d }
            goto L_0x0029
        L_0x001d:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0029 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0029 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0029 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Q4.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3977h
            java.lang.Object r1 = r8.f3976g
            int r2 = r8.f
            switch(r2) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0084;
                case 2: goto L_0x006d;
                default: goto L_0x0009;
            }
        L_0x0009:
            q1.C3 r1 = (q1.C3) r1
            q1.u2 r2 = r1.f
            android.os.IBinder r0 = (android.os.IBinder) r0
            q1.Q2 r3 = r1.f3866a
            q1.q2 r4 = r2.f     // Catch:{ Exception -> 0x006c }
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x006c }
            r4.c(r5)     // Catch:{ Exception -> 0x006c }
            q1.u2 r4 = r3.f3970k     // Catch:{ Exception -> 0x006c }
            q1.q2 r4 = r4.f     // Catch:{ Exception -> 0x006c }
            int r0 = r0.hashCode()     // Catch:{ Exception -> 0x006c }
            r4.c(r0)     // Catch:{ Exception -> 0x006c }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x006c }
            if (r0 == 0) goto L_0x006c
            q1.a3 r0 = r3.f3967h     // Catch:{ Exception -> 0x006c }
            if (r0 == 0) goto L_0x006c
            android.os.IBinder r2 = r0.asBinder()     // Catch:{ Exception -> 0x006c }
            boolean r2 = r2.isBinderAlive()     // Catch:{ Exception -> 0x006c }
            if (r2 == 0) goto L_0x006c
            L0.b r2 = r1.f3867c     // Catch:{ Exception -> 0x006c }
            android.content.pm.ServiceInfo r4 = r1.b
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r2.f     // Catch:{ Exception -> 0x006c }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x006c }
            if (r2 != 0) goto L_0x0057
        L_0x0045:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x006c }
            r2.<init>()     // Catch:{ Exception -> 0x006c }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Exception -> 0x006c }
            java.lang.String r6 = r4.packageName     // Catch:{ Exception -> 0x006c }
            java.lang.String r7 = r4.name     // Catch:{ Exception -> 0x006c }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x006c }
            android.content.Intent r2 = r2.setComponent(r5)     // Catch:{ Exception -> 0x006c }
        L_0x0057:
            r0.N(r1, r2)     // Catch:{ Exception -> 0x006c }
            int r2 = r1.f3868d     // Catch:{ Exception -> 0x006c }
            if (r2 > 0) goto L_0x006c
            q1.q2 r2 = r3.f3971l     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r4.name     // Catch:{ Exception -> 0x006c }
            int r3 = r3.hashCode()     // Catch:{ Exception -> 0x006c }
            r2.c(r3)     // Catch:{ Exception -> 0x006c }
            r0.h0(r1)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            return
        L_0x006d:
            q1.X3 r1 = (q1.X3) r1
            q1.X3 r0 = (q1.X3) r0
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x0075:
            r0 = 1
        L_0x0076:
            q1.V.f(r1, r0)     // Catch:{ Exception -> 0x0083 }
            q1.K2 r0 = q1.K2.b     // Catch:{ Exception -> 0x0083 }
            android.content.pm.PackageInfo r1 = r1.f4034c     // Catch:{ Exception -> 0x0083 }
            r0.getClass()     // Catch:{ Exception -> 0x0083 }
            q1.K2.W0(r1)     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            return
        L_0x0084:
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = q1.F3.f3882a     // Catch:{ Exception -> 0x00a2 }
            T0.l r2 = q1.S1.f3986a     // Catch:{ Exception -> 0x00a2 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00a2 }
            java.io.File r3 = q1.F3.b     // Catch:{ Exception -> 0x00a2 }
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x00a2 }
            q1.S1.a(r2)     // Catch:{ Exception -> 0x00a2 }
            q1.X3 r0 = (q1.X3) r0
            if (r0 == 0) goto L_0x00a2
            q1.K2 r1 = q1.K2.b     // Catch:{ Exception -> 0x00a2 }
            android.content.pm.PackageInfo r0 = r0.f4034c     // Catch:{ Exception -> 0x00a2 }
            r1.getClass()     // Catch:{ Exception -> 0x00a2 }
            q1.K2.Y0(r0)     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            return
        L_0x00a3:
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Q4.run():void");
    }
}

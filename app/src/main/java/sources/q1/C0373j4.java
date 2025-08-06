package q1;

/* renamed from: q1.j4  reason: case insensitive filesystem */
public final /* synthetic */ class C0373j4 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4127g;

    public /* synthetic */ C0373j4(int i2, Object obj) {
        this.f = i2;
        this.f4127g = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4127g
            android.content.IIntentReceiver r0 = (android.content.IIntentReceiver) r0
            q1.T3 r1 = q1.T3.f3994c
            r1.getClass()
            android.os.IInterface r1 = r1.b()     // Catch:{ Exception -> 0x0017 }
            q1.b4 r1 = (q1.C0325b4) r1     // Catch:{ Exception -> 0x0017 }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x0017 }
            r1.m(r0)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0023
        L_0x0017:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0023 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0023 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0023 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0373j4.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.f
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x007f;
                case 2: goto L_0x0067;
                case 3: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            q1.T3 r0 = q1.T3.f3994c
            java.lang.Object r1 = r5.f4127g
            android.content.Intent r1 = (android.content.Intent) r1
            r0.getClass()
            android.os.IInterface r0 = r0.b()     // Catch:{ Exception -> 0x001c }
            q1.b4 r0 = (q1.C0325b4) r0     // Catch:{ Exception -> 0x001c }
            int r2 = q1.H.f3901s     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = q1.H.f3898p     // Catch:{ Exception -> 0x001c }
            r0.g0(r1, r3, r2)     // Catch:{ Exception -> 0x001c }
            goto L_0x0028
        L_0x001c:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0028 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0028 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0028 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r0 = r5.f4127g
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            android.content.pm.PackageManager$ComponentEnabledSetting r1 = J.f.c(r1)
            android.content.ComponentName r2 = r1.getComponentName()
            if (r2 != 0) goto L_0x0046
            goto L_0x0031
        L_0x0046:
            q1.E4 r3 = q1.K2.f3929c
            java.lang.String r4 = r2.getPackageName()
            java.lang.Object r3 = r3.get(r4)
            q1.X3 r3 = (q1.X3) r3
            if (r3 != 0) goto L_0x0055
            goto L_0x0031
        L_0x0055:
            int r1 = r1.getEnabledState()
            java.lang.String r2 = r2.getClassName()
            q1.r2 r3 = r3.f4037g
            r3.c(r1, r2)
            r3.d()
            goto L_0x0031
        L_0x0066:
            return
        L_0x0067:
            java.lang.Object r0 = r5.f4127g
            q1.X3 r0 = (q1.X3) r0
            r1 = 0
            q1.V.f(r0, r1)     // Catch:{ all -> 0x007e }
            q1.K2 r1 = q1.K2.b     // Catch:{ all -> 0x007e }
            android.content.pm.PackageInfo r2 = r0.f4034c     // Catch:{ all -> 0x007e }
            r1.getClass()     // Catch:{ all -> 0x007e }
            q1.K2.W0(r2)     // Catch:{ all -> 0x007e }
            q1.r2 r0 = r0.f4037g     // Catch:{ all -> 0x007e }
            r0.b()     // Catch:{ all -> 0x007e }
        L_0x007e:
            return
        L_0x007f:
            java.lang.Object r0 = r5.f4127g
            java.util.concurrent.Future[] r0 = (java.util.concurrent.Future[]) r0
            r1 = 0
        L_0x0084:
            r2 = 5
            if (r1 >= r2) goto L_0x008f
            r2 = r0[r1]     // Catch:{ Exception -> 0x0092 }
            r2.get()     // Catch:{ Exception -> 0x0092 }
            int r1 = r1 + 1
            goto L_0x0084
        L_0x008f:
            q1.C0388m1.d()     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            return
        L_0x0093:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0373j4.run():void");
    }
}

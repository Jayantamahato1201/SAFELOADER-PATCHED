package q1;

import j1.D;

public final class I1 extends V4 {
    public static final I1 b = new V4();

    /* renamed from: c  reason: collision with root package name */
    public static final C0351g0 f3910c = new C0351g0("service");

    /* renamed from: d  reason: collision with root package name */
    public static final C0351g0 f3911d = new C0351g0("extras");

    /* renamed from: e  reason: collision with root package name */
    public static final D f3912e = new D(8);

    /* JADX WARNING: type inference failed for: r6v0, types: [top.bienvenido.mundo.common.ext.MundoServiceConnection, android.os.IBinder] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|11|(1:13)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.app.job.JobInfo r8) {
        /*
            android.content.ComponentName r0 = r8.getService()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r2 = q1.C0394n1.b
            boolean r1 = U0.i.a(r1, r2)
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r1 = r0.getClassName()
            int r1 = r1.hashCode()
            j1.D r3 = f3912e
            boolean r1 = r3.c(r1)
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r4 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            if (r1 == 0) goto L_0x0058
            q1.T3 r1 = q1.T3.f3994c
            r1.getClass()
            android.os.IInterface r1 = r1.b()     // Catch:{ Exception -> 0x0043 }
            q1.b4 r1 = (q1.C0325b4) r1     // Catch:{ Exception -> 0x0043 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0043 }
            r5.<init>()     // Catch:{ Exception -> 0x0043 }
            android.content.Intent r5 = r5.setComponent(r0)     // Catch:{ Exception -> 0x0043 }
            top.bienvenido.mundo.common.ext.MundoServiceConnection r6 = new top.bienvenido.mundo.common.ext.MundoServiceConnection     // Catch:{ Exception -> 0x0043 }
            r7 = 0
            r6.<init>(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = q1.H.f3898p     // Catch:{ Exception -> 0x0043 }
            r1.n(r5, r6, r7)     // Catch:{ Exception -> 0x0043 }
            goto L_0x004f
        L_0x0043:
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x004e }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x004e }
            r5.<init>(r1, r4)     // Catch:{ Exception -> 0x004e }
            r1.startService(r5)     // Catch:{ Exception -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            int r1 = r3.b
            r5 = 1024(0x400, float:1.435E-42)
            if (r1 <= r5) goto L_0x0058
            r1 = 0
            r3.b = r1
        L_0x0058:
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            android.os.PersistableBundle r3 = r8.getExtras()
            java.lang.String r5 = "mundo_base_bundle"
            r1.putPersistableBundle(r5, r3)
            java.lang.String r0 = r0.flattenToString()
            java.lang.String r3 = "mundo_base_string"
            r1.putString(r3, r0)
            q1.g0 r0 = f3911d
            java.lang.Object r0 = r0.f4098c
            q1.C0 r0 = (q1.C0) r0
            r0.c(r8, r1)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = r4.getName()
            int r3 = q1.H.f3901s
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r0.<init>(r2, r1)
            q1.g0 r1 = f3910c
            java.lang.Object r1 = r1.f4098c
            q1.C0 r1 = (q1.C0) r1
            r1.c(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.I1.d(android.app.job.JobInfo):void");
    }

    public final void b() {
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        C0412q1 c2 = C0388m1.c("jobscheduler", s3, (String) null);
        if (c2 != null) {
            c2.a(new int[]{2027195101, -697920873, -1594257912}, new C0376k1(3));
        }
    }
}

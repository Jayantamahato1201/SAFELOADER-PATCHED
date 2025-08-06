package q1;

public final class G3 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final G3 f3884d = new C0376k1(3);

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0 = q1.C0394n1.f4143a;
        r0.startService(new android.content.Intent(r0, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            boolean r0 = q1.H.f3895m
            if (r0 == 0) goto L_0x0081
            java.lang.Class[] r0 = r8.getParameterTypes()     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            int r2 = r9.length     // Catch:{ Exception -> 0x0081 }
            r3 = 0
        L_0x000c:
            if (r3 >= r2) goto L_0x001a
            r4 = r9[r3]     // Catch:{ Exception -> 0x0081 }
            boolean r4 = r1.isInstance(r4)     // Catch:{ Exception -> 0x0081 }
            if (r4 == 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x001a:
            r3 = -1
        L_0x001b:
            if (r3 < 0) goto L_0x0081
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            int r0 = M0.d.C0(r1, r0)     // Catch:{ Exception -> 0x0081 }
            r1 = 0
            if (r0 < 0) goto L_0x002b
            r0 = r9[r0]     // Catch:{ Exception -> 0x0081 }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x0081 }
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r2 = r9[r3]     // Catch:{ Exception -> 0x0081 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x0081 }
            q1.F r4 = q1.F.f3877c     // Catch:{ Exception -> 0x0081 }
            r4.getClass()     // Catch:{ Exception -> 0x0081 }
            android.os.IInterface r4 = r4.b()     // Catch:{ Exception -> 0x0042 }
            q1.s0 r4 = (q1.C0422s0) r4     // Catch:{ Exception -> 0x0042 }
            int r5 = q1.H.f3901s     // Catch:{ Exception -> 0x0042 }
            android.content.Intent r0 = r4.N0(r0, r2, r5)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0051
        L_0x0042:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x004f }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x004f }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r5 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r4.<init>(r0, r5)     // Catch:{ Exception -> 0x004f }
            r0.startService(r4)     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            r0 = r1
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r9[r3] = r0     // Catch:{ Exception -> 0x0081 }
            goto L_0x0081
        L_0x0056:
            java.lang.String r0 = q1.C0446w0.f4224a     // Catch:{ Exception -> 0x0081 }
            java.lang.String r0 = r2.getScheme()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = "https"
            boolean r0 = U0.i.a(r0, r4)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x007b
            android.net.Uri r0 = r2.getData()     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = r0.getHost()     // Catch:{ Exception -> 0x0081 }
        L_0x006e:
            java.lang.String r0 = "m.facebook.com"
            boolean r0 = U0.i.a(r1, r0)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x007b
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)     // Catch:{ Exception -> 0x0081 }
        L_0x007b:
            android.content.Intent r0 = q1.C0446w0.b(r2)     // Catch:{ Exception -> 0x0081 }
            r9[r3] = r0     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            java.lang.Object r7 = super.a(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.G3.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public final void d(C0412q1 q1Var) {
        q1Var.a(new int[]{-1528850031, 1188583438, -1938750181, 1002006553, -764358898, -932892417, 1441231458}, this);
        C0376k1 k1Var = new C0376k1(3);
        C0413q2 q2Var = q1Var.f4174a;
        q2Var.b(1076229154, k1Var);
        q2Var.b(-346076689, new C0376k1(3));
        q2Var.b(1965957592, new C0376k1(5));
        q2Var.b(1621249213, new Object());
    }
}

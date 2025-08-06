package q1;

public final class Z0 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final Z0 f4043d = new C0376k1(3);

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|(3:16|17|18)(1:15)|21|22|(2:24|(2:26|56)(1:55))(2:27|(7:31|(1:33)(1:34)|35|(1:37)(1:38)|39|(1:44)(1:43)|(2:48|54)))|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9 = q1.C0394n1.f4143a;
        r9.startService(new android.content.Intent(r9, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ Exception -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) {
        /*
            r16 = this;
            r0 = r19
            java.lang.Class<android.content.Intent[]> r1 = android.content.Intent[].class
            java.lang.Object r1 = q1.L3.b(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            android.content.Intent[] r1 = (android.content.Intent[]) r1     // Catch:{ Exception -> 0x00c8 }
            boolean r2 = q1.H.f3895m     // Catch:{ Exception -> 0x00c8 }
            if (r2 == 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00c8
            r2 = 0
            r3 = r0[r2]     // Catch:{ Exception -> 0x00c8 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x00c8 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00c8 }
            int r4 = r1.length     // Catch:{ Exception -> 0x00c8 }
            r5 = 0
        L_0x001b:
            if (r5 >= r4) goto L_0x00c8
            r6 = r1[r5]     // Catch:{ Exception -> 0x00c8 }
            r7 = 0
            r8 = 1
            if (r3 == r8) goto L_0x002d
            r9 = 2
            if (r3 == r9) goto L_0x002d
            r9 = 4
            if (r3 == r9) goto L_0x002d
            r9 = 5
            if (r3 == r9) goto L_0x002d
            goto L_0x005d
        L_0x002d:
            q1.F r9 = q1.F.f3877c     // Catch:{ Exception -> 0x00c8 }
            r9.getClass()     // Catch:{ Exception -> 0x00c8 }
            android.os.IInterface r9 = r9.b()     // Catch:{ Exception -> 0x0051 }
            q1.s0 r9 = (q1.C0422s0) r9     // Catch:{ Exception -> 0x0051 }
            int r10 = q1.H.f3901s     // Catch:{ Exception -> 0x0051 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0051 }
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r12 = (long) r3     // Catch:{ Exception -> 0x0051 }
            r14 = 32
            long r12 = r12 << r14
            r14 = -4294967296(0xffffffff00000000, double:NaN)
            long r12 = r12 & r14
            long r10 = r10 | r12
            android.content.Intent r7 = r9.l0(r10, r6)     // Catch:{ Exception -> 0x0051 }
            goto L_0x005d
        L_0x0051:
            android.content.Context r9 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x005d }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ Exception -> 0x005d }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r11 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r10.<init>(r9, r11)     // Catch:{ Exception -> 0x005d }
            r9.startService(r10)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            int r9 = r0.length     // Catch:{ Exception -> 0x00c8 }
            int r9 = r9 + -3
            r10 = r0[r9]     // Catch:{ Exception -> 0x00c8 }
            if (r7 == 0) goto L_0x007e
            r1[r5] = r7     // Catch:{ Exception -> 0x00c8 }
            boolean r6 = r10 instanceof java.lang.Integer     // Catch:{ Exception -> 0x00c8 }
            if (r6 == 0) goto L_0x00c4
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ Exception -> 0x00c8 }
            int r6 = r10.intValue()     // Catch:{ Exception -> 0x00c8 }
            r7 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r6 = r6 & r7
            r7 = 50331648(0x3000000, float:3.761582E-37)
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00c8 }
            r0[r9] = r6     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00c4
        L_0x007e:
            boolean r7 = q1.T4.f4005k     // Catch:{ Exception -> 0x00c8 }
            if (r7 == 0) goto L_0x00c4
            boolean r7 = r10 instanceof java.lang.Integer     // Catch:{ Exception -> 0x00c8 }
            if (r7 == 0) goto L_0x00c4
            r7 = r10
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ Exception -> 0x00c8 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x00c8 }
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r11 = r11 & r7
            if (r11 == 0) goto L_0x0094
            r11 = 1
            goto L_0x0095
        L_0x0094:
            r11 = 0
        L_0x0095:
            r12 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r7 & r12
            if (r7 == 0) goto L_0x009c
            r7 = 1
            goto L_0x009d
        L_0x009c:
            r7 = 0
        L_0x009d:
            android.content.ComponentName r12 = r6.getComponent()     // Catch:{ Exception -> 0x00c8 }
            if (r12 != 0) goto L_0x00aa
            java.lang.String r6 = r6.getPackage()     // Catch:{ Exception -> 0x00c8 }
            if (r6 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r8 = 0
        L_0x00ab:
            if (r11 != 0) goto L_0x00c4
            if (r7 == 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c4
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ Exception -> 0x00c8 }
            int r6 = r10.intValue()     // Catch:{ Exception -> 0x00c8 }
            r7 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r6 = r6 & r7
            r7 = 83886080(0x5000000, float:6.018531E-36)
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00c8 }
            r0[r9] = r6     // Catch:{ Exception -> 0x00c8 }
        L_0x00c4:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x00c8:
            java.lang.Object r0 = super.a(r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z0.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}

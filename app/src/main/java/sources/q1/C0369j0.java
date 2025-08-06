package q1;

/* renamed from: q1.j0  reason: case insensitive filesystem */
public final class C0369j0 extends V4 {
    public static final C0369j0 b = new V4();

    public static final void d(C0369j0 j0Var, Object[] objArr) {
        j0Var.getClass();
        try {
            Number number = objArr[1];
            if ((number instanceof Number) && (number.longValue() & 4194304) != 0) {
                if (number instanceof Long) {
                    objArr[1] = Long.valueOf(number.longValue() & -4194305);
                } else {
                    objArr[1] = Integer.valueOf(number.intValue() & -4194305);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:48|49|(1:54)(1:53)|55|56|57|58|59|60|(2:62|74)(4:63|(1:68)(1:67)|69|71)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0282 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0260 A[SYNTHETIC, Splitter:B:48:0x0260] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x028a A[Catch:{ Exception -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x028b A[Catch:{ Exception -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r13 = this;
            r0 = -2055791732(0xffffffff85771b8c, float:-1.1618944E-35)
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 3
            q1.C0 r5 = q1.C0.f3864a
            q1.k1 r6 = q1.C0458y0.b
            r13.f4021a = r6
            android.content.pm.IPackageManager r6 = android.app.ActivityThread.getPackageManager()
            if (r6 != 0) goto L_0x0015
            goto L_0x02c0
        L_0x0015:
            java.lang.String r7 = "package"
            q1.q1 r6 = r13.a(r7, r6)
            if (r6 != 0) goto L_0x001f
            goto L_0x02c0
        L_0x001f:
            java.lang.Class<android.app.ActivityThread> r7 = android.app.ActivityThread.class
            java.lang.String r8 = "sPackageManager"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0051 }
            r7.setAccessible(r3)     // Catch:{ Exception -> 0x0051 }
            int r8 = r7.getModifiers()     // Catch:{ Exception -> 0x0051 }
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch:{ Exception -> 0x0051 }
            if (r8 != 0) goto L_0x004b
            java.lang.Class r8 = r7.getType()     // Catch:{ Exception -> 0x0051 }
            boolean r8 = r8.isPrimitive()     // Catch:{ Exception -> 0x0051 }
            if (r8 == 0) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            sun.misc.Unsafe r8 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0051 }
            long r7 = r8.objectFieldOffset(r7)     // Catch:{ Exception -> 0x0051 }
            q1.t0 r9 = new q1.t0     // Catch:{ Exception -> 0x0051 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0052
        L_0x004b:
            q1.g0 r9 = new q1.g0     // Catch:{ Exception -> 0x0051 }
            r9.<init>(r7, r1)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0052
        L_0x0051:
            r9 = r5
        L_0x0052:
            java.lang.Object r7 = r6.f4176d
            r8 = 0
            r9.c(r8, r7)
            q1.z4 r7 = q1.C0468z4.f4261c
            q1.q2 r9 = r6.f4174a
            r10 = 686218487(0x28e6dcf7, float:2.5630958E-14)
            r9.b(r10, r7)
            q1.h1 r7 = new q1.h1
            q1.i3 r10 = q1.C0366i3.f4117n
            r7.<init>(r10)
            r10 = 871155123(0x33ecc5b3, float:1.1025568E-7)
            r9.b(r10, r7)
            q1.h1 r7 = new q1.h1
            q1.P3 r10 = q1.P3.f3958n
            r7.<init>(r10)
            r10 = 1207111861(0x47f310b5, float:124449.414)
            r9.b(r10, r7)
            q1.k1 r7 = new q1.k1
            r10 = 7
            r7.<init>(r10)
            r10 = 1326102014(0x4f0ab5fe, float:2.32718285E9)
            r9.b(r10, r7)
            q1.h1 r7 = new q1.h1
            q1.Z3 r10 = q1.Z3.f4045n
            r7.<init>(r10)
            r10 = -1039974701(0xffffffffc2033ed3, float:-32.81135)
            r9.b(r10, r7)
            q1.h1 r7 = new q1.h1
            q1.e r10 = q1.C0338e.f4081n
            r7.<init>(r10)
            r10 = 1725989837(0x66e083cd, float:5.301207E23)
            r9.b(r10, r7)
            q1.N1 r7 = new q1.N1
            q1.j r10 = q1.C0368j.f4122n
            r7.<init>(r10)
            r10 = 1600494599(0x5f659c07, float:1.6545107E19)
            r9.b(r10, r7)
            q1.N1 r7 = new q1.N1
            q1.v r10 = q1.C0439v.f4219n
            r7.<init>(r10)
            r10 = -150905391(0xfffffffff7015dd1, float:-2.6238637E33)
            r9.b(r10, r7)
            q1.L r7 = new q1.L
            r7.<init>(r2)
            r10 = 268353758(0xffec0de, float:2.5120623E-29)
            r9.b(r10, r7)
            q1.L r7 = new q1.L
            r7.<init>(r3)
            boolean r10 = q1.T4.f4010p
            if (r10 == 0) goto L_0x00da
            boolean r10 = q1.T4.f4003i
            if (r10 == 0) goto L_0x00da
            q1.h1 r10 = new q1.h1
            r10.<init>(r3, r7)
            r7 = r10
        L_0x00da:
            r10 = -1710913560(0xffffffff9a0587e8, float:-2.761354E-23)
            r9.b(r10, r7)
            q1.P r7 = new q1.P
            r7.<init>(r4)
            r10 = -1550050946(0xffffffffa39c197e, float:-1.692435E-17)
            r9.b(r10, r7)
            q1.o1 r7 = new q1.o1
            r7.<init>(r4)
            r10 = -432049674(0xffffffffe63f71f6, float:-2.2601855E23)
            r9.b(r10, r7)
            q1.r1 r7 = new q1.r1
            r7.<init>(r4)
            r10 = -59811990(0xfffffffffc6f576a, float:-4.9709277E36)
            r9.b(r10, r7)
            r7 = 12
            int[] r7 = new int[r7]
            r7 = {263663077, 653544665, 1321112681, -125888630, -1017315255, 1036223380, -2055791732, -2120318040, 1647146784, 1762051604, 689134333, 1556563560} // fill-array
            q1.S3 r10 = q1.C0458y0.f4243c
            r6.a(r7, r10)
            r7 = 1051878911(0x3eb265ff, float:0.34843442)
            r11 = 1784040466(0x6a564c12, float:6.476734E25)
            int[] r7 = new int[]{r7, r11}
            q1.h0 r11 = q1.C0458y0.f
            r6.a(r7, r11)
            r7 = -1463700733(0xffffffffa8c1b303, float:-2.1504938E-14)
            r11 = 125212131(0x77695e3, float:1.8551031E-34)
            r12 = -254077928(0xfffffffff0db1418, float:-5.4241207E29)
            int[] r7 = new int[]{r11, r12, r7}
            q1.h0 r11 = q1.C0458y0.f4244d
            r6.a(r7, r11)
            boolean r7 = q1.T4.f3997a
            if (r7 == 0) goto L_0x01c4
            r7 = 964371846(0x397b2586, float:2.3951204E-4)
            r11 = -1655019925(0xffffffff9d5a666b, float:-2.8905009E-21)
            int[] r7 = new int[]{r7, r11}
            boolean r11 = q1.T4.f3998c
            if (r11 == 0) goto L_0x0145
            T0.l r11 = q1.C0459y1.f4250a
            android.content.pm.ParceledListSlice r11 = q1.M1.f3937a
            goto L_0x0147
        L_0x0145:
            java.util.List r11 = java.util.Collections.EMPTY_LIST
        L_0x0147:
            q1.h0 r12 = new q1.h0
            r12.<init>((java.lang.Object) r11)
            r6.a(r7, r12)
            boolean r6 = q1.T4.f
            if (r6 == 0) goto L_0x01c4
            r9.b(r0, r10)
            boolean r0 = q1.T4.f4002h
            if (r0 == 0) goto L_0x01c4
            q1.k1 r0 = new q1.k1
            r0.<init>(r1)
            r6 = -1354875218(0xffffffffaf3e3eae, float:-1.7302668E-10)
            r9.b(r6, r0)
            q1.d r0 = new q1.d     // Catch:{ Exception -> 0x0197 }
            r0.<init>()     // Catch:{ Exception -> 0x0197 }
            java.lang.Class<android.content.pm.PackageManager> r6 = android.content.pm.PackageManager.class
            java.lang.String r7 = "sPackageInfoCache"
            r0.a(r6, r7)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r7 = "sApplicationInfoCache"
            r0.a(r6, r7)     // Catch:{ Exception -> 0x0197 }
            java.lang.Class<android.permission.PermissionManager> r6 = android.permission.PermissionManager.class
            java.lang.String r7 = "sPackageNamePermissionCache"
            r0.a(r6, r7)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r7 = "sPermissionCache"
            r0.a(r6, r7)     // Catch:{ Exception -> 0x0197 }
            boolean r6 = q1.T4.f4003i     // Catch:{ Exception -> 0x0197 }
            if (r6 == 0) goto L_0x019e
            android.content.Context r6 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0197 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0197 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x0197 }
            boolean r7 = q1.T4.f4007m     // Catch:{ Exception -> 0x0197 }
            if (r7 == 0) goto L_0x0199
            java.lang.String r7 = "sGetPackagesForUidCache"
            goto L_0x019b
        L_0x0197:
            goto L_0x019e
        L_0x0199:
            java.lang.String r7 = "mGetPackagesForUidCache"
        L_0x019b:
            r0.a(r6, r7)     // Catch:{ Exception -> 0x0197 }
        L_0x019e:
            boolean r0 = q1.T4.f4003i
            if (r0 == 0) goto L_0x01c4
            q1.B1 r0 = new q1.B1
            r0.<init>(r4)
            r6 = -945173823(0xffffffffc7a9cac1, float:-86933.51)
            r9.b(r6, r0)
            q1.h0 r0 = q1.C0458y0.f4245e
            r6 = -132294875(0xfffffffff81d5725, float:-1.276497E34)
            r9.b(r6, r0)
            boolean r0 = q1.T4.f4004j
            if (r0 == 0) goto L_0x01c4
            q1.G1 r0 = new q1.G1
            r0.<init>(r4)
            r6 = -1854171575(0xffffffff917b9649, float:-1.9846719E-28)
            r9.b(r6, r0)
        L_0x01c4:
            q1.h0 r0 = q1.C0458y0.f4245e
            r6 = -548994423(0xffffffffdf470289, float:-1.4340175E19)
            r9.b(r6, r0)
            q1.W1 r0 = new q1.W1
            r0.<init>(r2)
            r6 = -109758974(0xfffffffff9753602, float:-7.957551E34)
            r9.b(r6, r0)
            q1.j2 r0 = new q1.j2
            r0.<init>(r2)
            r6 = -297395415(0xffffffffee461b29, float:-1.5327717E28)
            r9.b(r6, r0)
            q1.W1 r0 = new q1.W1
            r0.<init>(r3)
            r6 = 1374193809(0x51e88891, float:1.24840452E11)
            r9.b(r6, r0)
            q1.j2 r0 = new q1.j2
            r0.<init>(r3)
            r6 = -564624472(0xffffffffde5883a8, float:-3.90037456E18)
            r9.b(r6, r0)
            q1.W1 r0 = new q1.W1
            r0.<init>(r1)
            r1 = 1786110784(0x6a75e340, float:7.4314995E25)
            r9.b(r1, r0)
            q1.W1 r0 = new q1.W1
            r0.<init>(r4)
            r1 = -1530208819(0xffffffffa4caddcd, float:-8.797928E-17)
            r9.b(r1, r0)
            q1.D3 r0 = new q1.D3
            r0.<init>(r4)
            r1 = -1280559169(0xffffffffb3ac37bf, float:-8.019514E-8)
            r9.b(r1, r0)
            q1.I3 r0 = new q1.I3
            r0.<init>()
            r1 = 1700882705(0x65616911, float:6.652941E22)
            r9.b(r1, r0)
            q1.x4 r0 = q1.C0456x4.f4237a
            r1 = -268426720(0xfffffffff0002220, float:-1.5862134E29)
            r9.b(r1, r0)
            q1.X4 r0 = q1.C0456x4.b
            r1 = -923564278(0xffffffffc8f3870a, float:-498744.3)
            r9.b(r1, r0)
            q1.X4 r0 = q1.C0456x4.f4238c
            r1 = -1422431960(0xffffffffab376928, float:-6.5160594E-13)
            r9.b(r1, r0)
            q1.X4 r0 = q1.C0456x4.f4239d
            r1 = -1118934913(0xffffffffbd4e687f, float:-0.050392624)
            r9.b(r1, r0)
            q1.k1 r0 = q1.C0456x4.f4240e
            r1 = 433060184(0x19cff958, float:2.1504007E-23)
            r9.b(r1, r0)
            q1.k1 r0 = q1.C0458y0.b
            r1 = 268289313(0xffdc521, float:2.5023657E-29)
            r9.b(r1, r0)
            q1.k1 r0 = q1.C0456x4.f
            r1 = -2128065382(0xffffffff81284c9a, float:-3.0911686E-38)
            r9.b(r1, r0)
            boolean r0 = q1.T4.f4010p
            if (r0 == 0) goto L_0x02c0
            boolean r0 = q1.T4.f4009o     // Catch:{ Exception -> 0x02c0 }
            if (r0 == 0) goto L_0x026b
            boolean r1 = q1.T4.f4003i     // Catch:{ Exception -> 0x02c0 }
            if (r1 == 0) goto L_0x026b
            java.lang.String r1 = "hihonor.android.app.HwApiCacheMangerEx"
            goto L_0x026d
        L_0x026b:
            java.lang.String r1 = "huawei.android.app.HwApiCacheMangerEx"
        L_0x026d:
            java.lang.String r4 = "getDefault"
            java.lang.Class[] r6 = q1.H.f3886c     // Catch:{ Exception -> 0x02c0 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0282 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r6)     // Catch:{ Exception -> 0x0282 }
            r1.setAccessible(r3)     // Catch:{ Exception -> 0x0282 }
            q1.g0 r4 = new q1.g0     // Catch:{ Exception -> 0x0282 }
            r4.<init>(r1, r3)     // Catch:{ Exception -> 0x0282 }
            r5 = r4
        L_0x0282:
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02c0 }
            java.lang.Object r1 = r5.b(r8, r1)     // Catch:{ Exception -> 0x02c0 }
            if (r1 != 0) goto L_0x028b
            goto L_0x02c0
        L_0x028b:
            java.lang.String r2 = "mPkg"
            q1.g0 r3 = new q1.g0     // Catch:{ Exception -> 0x02c0 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02c0 }
            java.lang.Object r2 = r3.f4098c     // Catch:{ Exception -> 0x02c0 }
            q1.C0 r2 = (q1.C0) r2     // Catch:{ Exception -> 0x02c0 }
            r2.c(r1, r8)     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r2 = "bCanCache"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x02c0 }
            q1.g0 r4 = new q1.g0     // Catch:{ Exception -> 0x02c0 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02c0 }
            java.lang.Object r2 = r4.f4098c     // Catch:{ Exception -> 0x02c0 }
            q1.C0 r2 = (q1.C0) r2     // Catch:{ Exception -> 0x02c0 }
            r2.c(r1, r3)     // Catch:{ Exception -> 0x02c0 }
            if (r0 == 0) goto L_0x02b2
            boolean r0 = q1.T4.f4003i     // Catch:{ Exception -> 0x02c0 }
            if (r0 == 0) goto L_0x02b2
            java.lang.String r0 = "sUseCache"
            goto L_0x02b4
        L_0x02b2:
            java.lang.String r0 = "USE_CACHE"
        L_0x02b4:
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x02c0 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02c0 }
            java.lang.Object r0 = r2.f4098c     // Catch:{ Exception -> 0x02c0 }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ Exception -> 0x02c0 }
            r0.c(r1, r3)     // Catch:{ Exception -> 0x02c0 }
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0369j0.b():void");
    }
}

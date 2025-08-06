package q1;

import k.C0241f0;

/* renamed from: q1.h3  reason: case insensitive filesystem */
public abstract class C0360h3 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0241f0 f4112a = new C0241f0(3);
    public static final C0241f0 b = new C0241f0(3);

    /* renamed from: c  reason: collision with root package name */
    public static final C0241f0 f4113c = new C0241f0(3);

    /* renamed from: d  reason: collision with root package name */
    public static int f4114d;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q1.Q2 a(java.lang.String r1, java.lang.String r2) {
        /*
            k.f0 r0 = f4113c     // Catch:{ Exception -> 0x001b }
            int r1 = r1.hashCode()     // Catch:{ Exception -> 0x001b }
            int r2 = r2.hashCode()     // Catch:{ Exception -> 0x001b }
            int r2 = r2 + r1
            monitor-enter(r0)     // Catch:{ Exception -> 0x001b }
            java.lang.Object r1 = r0.f3459a     // Catch:{ all -> 0x0018 }
            q1.q2 r1 = (q1.C0413q2) r1     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.a(r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            q1.Q2 r1 = (q1.Q2) r1     // Catch:{ Exception -> 0x001b }
            return r1
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x001b }
            throw r1     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0360h3.a(java.lang.String, java.lang.String):q1.Q2");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[Catch:{ all -> 0x00c3, Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ all -> 0x00c3, Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089 A[Catch:{ all -> 0x00c3, Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[Catch:{ all -> 0x00c3, Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q1.Q2 b(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r0 = 1
            r1 = 0
            r2 = 49845(0xc2b5, float:6.9848E-41)
            r3 = 0
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r2, r3)     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ all -> 0x0016 }
            goto L_0x0018
        L_0x0016:
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 != 0) goto L_0x001c
            goto L_0x00c7
        L_0x001c:
            java.lang.String r2 = "4d8d125513ece5140dc3b59d8d856f7e5d87572ca9f82f0f9d9201bdc33e079e89e70d712faf60bfc71172cb58165e44be5f454f7106c6"
            r4 = 49852(0xc2bc, float:6.9858E-41)
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r4, r2)     // Catch:{ all -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ Exception -> 0x00c7 }
            if (r2 != 0) goto L_0x002d
            goto L_0x00c7
        L_0x002d:
            java.lang.reflect.Constructor r4 = r2.getConstructor(r3)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r4 = r4.newInstance(r3)     // Catch:{ Exception -> 0x00c7 }
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4     // Catch:{ Exception -> 0x00c7 }
            r4.packageName = r11     // Catch:{ Exception -> 0x00c7 }
            r4.processName = r12     // Catch:{ Exception -> 0x00c7 }
            r4.name = r13     // Catch:{ Exception -> 0x00c7 }
            q1.K2 r12 = q1.K2.b     // Catch:{ Exception -> 0x00c7 }
            r12.getClass()     // Catch:{ Exception -> 0x00c7 }
            boolean r12 = r12.B0(r11)     // Catch:{ Exception -> 0x0068 }
            if (r12 != 0) goto L_0x0068
            q1.E4 r12 = q1.K2.f3930d     // Catch:{ Exception -> 0x0068 }
            q1.z r5 = new q1.z     // Catch:{ Exception -> 0x0068 }
            q1.u2 r6 = new q1.u2     // Catch:{ Exception -> 0x0068 }
            r6.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x0068 }
            r5.<init>(r11, r6)     // Catch:{ Exception -> 0x0068 }
            r12.put(r11, r5)     // Catch:{ Exception -> 0x0068 }
            q1.n2 r12 = q1.C0395n2.b     // Catch:{ Exception -> 0x0068 }
            r12.getClass()     // Catch:{ Exception -> 0x0068 }
            i0.l r12 = new i0.l     // Catch:{ Exception -> 0x0068 }
            r13 = 11
            r12.<init>(r13)     // Catch:{ Exception -> 0x0068 }
            java.util.concurrent.ExecutorService r13 = q1.d5.b     // Catch:{ Exception -> 0x0068 }
            r13.execute(r12)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            java.lang.Class[] r12 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00c7 }
            r12[r1] = r2     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Constructor r12 = r2.getConstructor(r12)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00c7 }
            r13[r1] = r4     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r12 = r12.newInstance(r13)     // Catch:{ Exception -> 0x00c7 }
            android.content.pm.ApplicationInfo r12 = (android.content.pm.ApplicationInfo) r12     // Catch:{ Exception -> 0x00c7 }
            int r13 = f4114d     // Catch:{ Exception -> 0x00c7 }
            if (r13 == 0) goto L_0x0082
            f4114d = r1     // Catch:{ Exception -> 0x00c7 }
        L_0x0080:
            r9 = r13
            goto L_0x0087
        L_0x0082:
            int r13 = d()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0080
        L_0x0087:
            if (r9 != 0) goto L_0x008a
            goto L_0x00c7
        L_0x008a:
            q1.K2 r13 = q1.K2.b     // Catch:{ Exception -> 0x00c7 }
            r13.getClass()     // Catch:{ Exception -> 0x00c7 }
            q1.E4 r13 = q1.K2.f3929c     // Catch:{ Exception -> 0x00c7 }
            boolean r8 = r13.containsKey(r11)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r11 = r12.packageName     // Catch:{ Exception -> 0x00c7 }
            int r10 = q1.H.b(r11, r8)     // Catch:{ Exception -> 0x00c7 }
            q1.Q2 r4 = new q1.Q2     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = r12.packageName     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r6 = r12.processName     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = r12.name     // Catch:{ Exception -> 0x00c7 }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00c7 }
            k.f0 r11 = f4112a     // Catch:{ Exception -> 0x00c7 }
            monitor-enter(r11)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r12 = r11.f3459a     // Catch:{ all -> 0x00c3 }
            q1.q2 r12 = (q1.C0413q2) r12     // Catch:{ all -> 0x00c3 }
            r12.b(r9, r4)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00c3 }
            k.f0 r11 = f4113c     // Catch:{ Exception -> 0x00c7 }
            int r12 = r6.hashCode()     // Catch:{ Exception -> 0x00c7 }
            int r13 = r7.hashCode()     // Catch:{ Exception -> 0x00c7 }
            int r13 = r13 + r12
            r11.f(r13, r4)     // Catch:{ Exception -> 0x00c7 }
            q1.H.i(r9, r4)     // Catch:{ Exception -> 0x00c7 }
            return r4
        L_0x00c3:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch:{ Exception -> 0x00c7 }
            throw r12     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0360h3.b(java.lang.String, java.lang.String, java.lang.String):q1.Q2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(q1.Q2 r3) {
        /*
            q1.c3 r0 = q1.C0330c3.b     // Catch:{ Exception -> 0x003e }
            r0.V0(r3)     // Catch:{ Exception -> 0x003e }
            k.f0 r0 = f4112a     // Catch:{ Exception -> 0x003e }
            int r1 = r3.f3965e     // Catch:{ Exception -> 0x003e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x003e }
            java.lang.Object r2 = r0.f3459a     // Catch:{ all -> 0x003b }
            q1.q2 r2 = (q1.C0413q2) r2     // Catch:{ all -> 0x003b }
            r2.c(r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            k.f0 r0 = b     // Catch:{ Exception -> 0x003e }
            int r1 = r3.f3968i     // Catch:{ Exception -> 0x003e }
            r0.g(r1)     // Catch:{ Exception -> 0x003e }
            k.f0 r0 = f4113c     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = r3.b     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r3.f3963c     // Catch:{ Exception -> 0x003e }
            int r1 = r1.hashCode()     // Catch:{ Exception -> 0x003e }
            int r2 = r2.hashCode()     // Catch:{ Exception -> 0x003e }
            int r2 = r2 + r1
            r0.g(r2)     // Catch:{ Exception -> 0x003e }
            q1.e0 r0 = q1.C0339e0.b     // Catch:{ Exception -> 0x003e }
            r0.getClass()     // Catch:{ Exception -> 0x003e }
            q1.d0 r0 = new q1.d0     // Catch:{ Exception -> 0x003e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x003e }
            java.util.concurrent.ExecutorService r3 = q1.d5.f4080a     // Catch:{ Exception -> 0x003e }
            r3.execute(r0)     // Catch:{ Exception -> 0x003e }
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x003e }
            throw r3     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0360h3.c(q1.Q2):void");
    }

    public static int d() {
        boolean z2;
        int i2 = 1;
        while (i2 < 25) {
            try {
                C0241f0 f0Var = f4112a;
                synchronized (f0Var) {
                    C0413q2 q2Var = (C0413q2) f0Var.f3459a;
                    if (H.a(q2Var.f4178c, i2, q2Var.f4177a) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return i2;
                }
                i2++;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static Q2 e(String str, String str2, String str3) {
        Q2 a2 = a(str2, str3);
        if (a2 != null) {
            return a2;
        }
        Q2 b2 = b(str, str2, str3);
        if (b2 == null) {
            return null;
        }
        b2.f3969j.block(10000);
        if (b2.f3966g) {
            return b2;
        }
        return null;
    }
}

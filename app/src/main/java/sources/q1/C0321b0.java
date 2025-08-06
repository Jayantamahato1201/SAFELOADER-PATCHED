package q1;

import android.content.pm.ActivityInfo;

/* renamed from: q1.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C0321b0 implements Runnable {
    public final /* synthetic */ int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f4060g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ActivityInfo f4061h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4062i;

    public /* synthetic */ C0321b0(ActivityInfo activityInfo, String str, String str2) {
        this.f4061h = activityInfo;
        this.f4060g = str;
        this.f4062i = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1 A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = r12.f4062i
            android.content.pm.ActivityInfo r1 = r12.f4061h
            java.lang.String r2 = r12.f4060g
            r3 = 1
            r4 = 0
            int r5 = r12.f
            switch(r5) {
                case 0: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            k.f0 r3 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0014 }
            java.lang.String r1 = r1.processName     // Catch:{ Exception -> 0x0014 }
            q1.C0360h3.b(r2, r1, r0)     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            boolean r5 = q1.H.p()     // Catch:{ Exception -> 0x00e9 }
            if (r5 != 0) goto L_0x0031
            boolean r0 = q1.T4.f     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00e9
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00e9 }
            java.util.concurrent.Executor r0 = r0.getMainExecutor()     // Catch:{ Exception -> 0x00e9 }
            i0.l r1 = new i0.l     // Catch:{ Exception -> 0x00e9 }
            r2 = 8
            r1.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            r0.execute(r1)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x0031:
            java.lang.String r5 = "4d8d125513ece5200dc3b59d8d856f7e5d87572ca9f82f0fa4915b99dd3a6bf7ea86791840c129d1a10602"
            r6 = 49852(0xc2bc, float:6.9858E-41)
            r7 = 0
            java.lang.Object r5 = top.bienvenido.mundo.common.initialize.MNative.a(r6, r5)     // Catch:{ all -> 0x003c }
            goto L_0x003d
        L_0x003c:
            r5 = r7
        L_0x003d:
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ Exception -> 0x00e9 }
            if (r5 != 0) goto L_0x0043
            goto L_0x00e9
        L_0x0043:
            if (r1 != 0) goto L_0x004d
            android.content.pm.ActivityInfo r1 = q1.H.c(r2)     // Catch:{ Exception -> 0x00e9 }
            if (r1 != 0) goto L_0x004d
            goto L_0x00e9
        L_0x004d:
            k.f0 r8 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r8 = r1.processName     // Catch:{ Exception -> 0x00e9 }
            q1.Q2 r0 = q1.C0360h3.e(r2, r8, r0)     // Catch:{ Exception -> 0x00e9 }
            if (r0 != 0) goto L_0x0059
            goto L_0x00e9
        L_0x0059:
            java.lang.String r2 = "4d8d125516ece52706cca78ecc806a3e59c67036b8f33c449fedcd5c17b9ea70d284791909c12ca7c01207ae20645e54d43e332e5f12d7af858074261d1280b73105508cf5c4314f74cf8e8600191b37b9"
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r6, r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r2 = r7
        L_0x0061:
            java.io.Serializable r2 = (java.io.Serializable) r2     // Catch:{ Exception -> 0x00e9 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x00e9 }
            if (r2 == 0) goto L_0x006c
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            q1.e0 r8 = q1.C0339e0.b     // Catch:{ Exception -> 0x00e9 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00e9 }
            r9[r4] = r5     // Catch:{ Exception -> 0x00e9 }
            java.lang.reflect.Constructor r9 = r5.getConstructor(r9)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00e9 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r4] = r11     // Catch:{ Exception -> 0x00e9 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r10)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r10 = "4d8d1255119eff5702c9a3808b882539509c5c36b8b83a42999640929d032abea4"
            java.lang.Object r10 = top.bienvenido.mundo.common.initialize.MNative.a(r6, r10)     // Catch:{ all -> 0x0088 }
            goto L_0x0089
        L_0x0088:
            r10 = r7
        L_0x0089:
            java.io.Serializable r10 = (java.io.Serializable) r10     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00e9 }
            r11[r4] = r10     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r5 = r5.newInstance(r11)     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r10 = "800e76220af7811805c3a58a8c9825335f9c5c3fa3e4220fa1be7ab2f0062ea5"
            r11 = 49847(0xc2b7, float:6.985E-41)
            java.lang.Object r10 = top.bienvenido.mundo.common.initialize.MNative.a(r11, r10)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a5
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r10 = r7
        L_0x00a6:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r5 = r5.addCategory(r10)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r10 = "4d8d125516ece52706cca78ecc806a3e59c67036b8f33c449fedcd5c17b9ea70d284791909c12ca7c01207ae20645e54d43e332e5f12d7af858074261d1280b73105508cf5c4314f74cf8e8600093b37b9"
            java.lang.Object r6 = top.bienvenido.mundo.common.initialize.MNative.a(r6, r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
            r6 = r7
        L_0x00b6:
            java.io.Serializable r6 = (java.io.Serializable) r6     // Catch:{ Exception -> 0x00e9 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x00c1
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            r2 = r2 | r6
            android.content.Intent r2 = r5.addFlags(r2)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00e9 }
            r3[r4] = r2     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r2 = r9.newInstance(r3)     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x00e9 }
            r8.getClass()     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r1 = q1.C0339e0.Z0(r7, r2, r0, r1)     // Catch:{ Exception -> 0x00e9 }
            if (r1 == 0) goto L_0x00e9
            boolean r0 = r0.f3966g     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00e9
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00e9 }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.addFlags(r2)     // Catch:{ Exception -> 0x00e9 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0321b0.run():void");
    }

    public /* synthetic */ C0321b0(String str, ActivityInfo activityInfo, String str2) {
        this.f4060g = str;
        this.f4061h = activityInfo;
        this.f4062i = str2;
    }
}

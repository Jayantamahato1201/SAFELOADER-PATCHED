package q1;

public final class C4 extends V4 {
    public static final C4 b = new V4();

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            q1.p0 r2 = q1.C0458y0.f4248i
            r0.f4021a = r2
            java.lang.String r3 = "appwidget"
            r4 = 0
            q1.C0388m1.c(r3, r2, r4)
            q1.S3 r3 = q1.C0458y0.f4243c
            r0.f4021a = r3
            java.lang.String r15 = "search"
            java.lang.String r16 = "media_router"
            java.lang.String r5 = "usb"
            java.lang.String r6 = "consumer_ir"
            java.lang.String r7 = "telecom"
            java.lang.String r8 = "lock_settings"
            java.lang.String r9 = "backup"
            java.lang.String r10 = "print"
            java.lang.String r11 = "launcherapps"
            java.lang.String r12 = "imms"
            java.lang.String r13 = "restrictions"
            java.lang.String r14 = "isms"
            java.lang.String r17 = "statusbar"
            java.lang.String r18 = "accessibility"
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            r0.c(r3)
            java.lang.String r3 = "alarm"
            q1.L3 r5 = r0.f4021a
            q1.q1 r3 = q1.C0388m1.c(r3, r5, r4)
            if (r3 == 0) goto L_0x0048
            q1.u0 r5 = q1.C0458y0.f4249j
            q1.q2 r3 = r3.f4174a
            r6 = 113762(0x1bc62, float:1.59415E-40)
            r3.b(r6, r5)
        L_0x0048:
            java.lang.String r3 = "audio"
            q1.L3 r5 = r0.f4021a
            q1.q1 r3 = q1.C0388m1.c(r3, r5, r4)
            q1.C0 r5 = q1.C0.f3864a
            r6 = 1
            if (r3 == 0) goto L_0x008d
            java.lang.Class<android.media.AudioManager> r7 = android.media.AudioManager.class
            java.lang.String r8 = "sService"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0087 }
            r7.setAccessible(r6)     // Catch:{ Exception -> 0x0087 }
            int r8 = r7.getModifiers()     // Catch:{ Exception -> 0x0087 }
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch:{ Exception -> 0x0087 }
            if (r8 != 0) goto L_0x0081
            java.lang.Class r8 = r7.getType()     // Catch:{ Exception -> 0x0087 }
            boolean r8 = r8.isPrimitive()     // Catch:{ Exception -> 0x0087 }
            if (r8 == 0) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            sun.misc.Unsafe r8 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0087 }
            long r7 = r8.objectFieldOffset(r7)     // Catch:{ Exception -> 0x0087 }
            q1.t0 r9 = new q1.t0     // Catch:{ Exception -> 0x0087 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0088
        L_0x0081:
            q1.g0 r9 = new q1.g0     // Catch:{ Exception -> 0x0087 }
            r9.<init>(r7, r1)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0088
        L_0x0087:
            r9 = r5
        L_0x0088:
            java.lang.Object r3 = r3.f4176d
            r9.c(r4, r3)
        L_0x008d:
            q1.q2 r3 = q1.C0388m1.f4140a
            q1.L3 r3 = r0.f4021a
            java.lang.String r7 = "autofill"
            q1.q1 r3 = q1.C0388m1.c(r7, r3, r4)
            if (r3 == 0) goto L_0x00a9
            r7 = -464872500(0xffffffffe44a9bcc, float:-1.4949875E22)
            r8 = 1850541012(0x6e4d03d4, float:1.5862264E28)
            r9 = -860784333(0xffffffffccb17933, float:-9.3047192E7)
            int[] r7 = new int[]{r8, r9, r7}
            r3.a(r7, r2)
        L_0x00a9:
            java.lang.String r2 = "media.camera"
            q1.L3 r3 = r0.f4021a
            q1.q1 r2 = q1.C0388m1.c(r2, r3, r4)
            if (r2 == 0) goto L_0x00c1
            q1.O4 r3 = new q1.O4
            r7 = 3
            r3.<init>(r7)
            q1.q2 r2 = r2.f4174a
            r7 = -1581470752(0xffffffffa1bcabe0, float:-1.278487E-18)
            r2.b(r7, r3)
        L_0x00c1:
            java.lang.String r2 = "connectivity"
            q1.L3 r3 = r0.f4021a
            q1.q1 r2 = q1.C0388m1.c(r2, r3, r4)
            if (r2 == 0) goto L_0x00d9
            boolean r3 = q1.T4.f4002h
            if (r3 != 0) goto L_0x00d9
            q1.V3 r3 = q1.V3.f4020d
            q1.q2 r2 = r2.f4174a
            r7 = -1710356229(0xffffffff9a0e08fb, float:-2.9372166E-23)
            r2.b(r7, r3)
        L_0x00d9:
            java.lang.String r2 = "device_policy"
            q1.L3 r3 = r0.f4021a
            q1.q1 r2 = q1.C0388m1.c(r2, r3, r4)
            if (r2 == 0) goto L_0x0108
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r7 = q1.C0394n1.b
            java.lang.String r8 = "main"
            r3.<init>(r7, r8)
            q1.h0 r7 = new q1.h0
            r7.<init>((java.lang.Object) r3)
            q1.q2 r3 = r2.f4174a
            r8 = 952007670(0x38be7bf6, float:9.0829955E-5)
            r3.b(r8, r7)
            r3 = -1597971470(0xffffffffa0c0e3f2, float:-3.2676907E-19)
            r7 = 613161899(0x248c1bab, float:6.076219E-17)
            int[] r3 = new int[]{r3, r7}
            q1.h0 r7 = q1.C0458y0.f4247h
            r2.a(r3, r7)
        L_0x0108:
            java.lang.String r2 = "location"
            q1.L3 r3 = r0.f4021a
            q1.q1 r2 = q1.C0388m1.c(r2, r3, r4)
            if (r2 == 0) goto L_0x0124
            r3 = 1102537717(0x41b763f5, float:22.923807)
            r7 = 250564640(0xeef5020, float:5.8995206E-30)
            int[] r3 = new int[]{r3, r7}
            q1.b5 r7 = new q1.b5
            r7.<init>()
            r2.a(r3, r7)
        L_0x0124:
            java.lang.String r2 = "wallpaper"
            q1.L3 r3 = r0.f4021a
            q1.q1 r2 = q1.C0388m1.c(r2, r3, r4)
            if (r2 == 0) goto L_0x0179
            java.lang.Class<android.app.WallpaperManager> r3 = android.app.WallpaperManager.class
            java.lang.String r7 = "sGlobals"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r7)     // Catch:{ Exception -> 0x015b }
            r3.setAccessible(r6)     // Catch:{ Exception -> 0x015b }
            int r6 = r3.getModifiers()     // Catch:{ Exception -> 0x015b }
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch:{ Exception -> 0x015b }
            if (r6 != 0) goto L_0x015d
            java.lang.Class r6 = r3.getType()     // Catch:{ Exception -> 0x015b }
            boolean r6 = r6.isPrimitive()     // Catch:{ Exception -> 0x015b }
            if (r6 == 0) goto L_0x014e
            goto L_0x015d
        L_0x014e:
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x015b }
            long r6 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x015b }
            q1.t0 r1 = new q1.t0     // Catch:{ Exception -> 0x015b }
            r1.<init>(r6)     // Catch:{ Exception -> 0x015b }
            r5 = r1
            goto L_0x0163
        L_0x015b:
            goto L_0x0163
        L_0x015d:
            q1.g0 r6 = new q1.g0     // Catch:{ Exception -> 0x015b }
            r6.<init>(r3, r1)     // Catch:{ Exception -> 0x015b }
            r5 = r6
        L_0x0163:
            java.lang.Object r1 = r5.a(r4)
            if (r1 == 0) goto L_0x0179
            q1.g0 r3 = new q1.g0
            java.lang.String r4 = "mService"
            r3.<init>(r4)
            java.lang.Object r3 = r3.f4098c
            q1.C0 r3 = (q1.C0) r3
            java.lang.Object r2 = r2.f4176d
            r3.c(r1, r2)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C4.b():void");
    }
}

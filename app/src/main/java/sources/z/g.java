package Z;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f814g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f815h;

    public /* synthetic */ g(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.f814g = obj;
        this.f815h = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|13|(1:15)(5:17|18|(1:20)(2:21|(1:23)(5:24|(1:26)(1:27)|28|29|(3:33|34|93)))|31|(0))|16|35|(3:37|(2:40|38)|88)|41|42|43|44|45|46|(2:48|94)(2:49|(2:51|(2:53|95)(4:54|(1:56)(1:57)|58|96))(5:59|(1:61)|89|62|91))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[SYNTHETIC, Splitter:B:33:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[Catch:{ Exception -> 0x0191 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 0
            java.lang.String r1 = "0"
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r15.f815h
            java.lang.Object r5 = r15.f814g
            int r6 = r15.f
            switch(r6) {
                case 0: goto L_0x02ce;
                case 1: goto L_0x02bb;
                case 2: goto L_0x0279;
                case 3: goto L_0x01a3;
                case 4: goto L_0x0192;
                case 5: goto L_0x0036;
                case 6: goto L_0x0016;
                default: goto L_0x000e;
            }
        L_0x000e:
            z.b r5 = (z.C0503b) r5
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            r5.i(r4)
            return
        L_0x0016:
            int r2 = top.bienvenido.mundo.manifest.MundoSplashLauncher.f4723a
            q1.e0 r2 = q1.C0339e0.b
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0026
            int r3 = r4.length()
            if (r3 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            r2.getClass()
            java.lang.String r5 = (java.lang.String) r5
            q1.b0 r2 = new q1.b0
            r2.<init>((android.content.pm.ActivityInfo) r0, (java.lang.String) r5, (java.lang.String) r1)
            java.util.concurrent.ExecutorService r0 = q1.d5.f4080a
            r0.execute(r2)
            return
        L_0x0036:
            r8 = r4
            android.content.Intent r8 = (android.content.Intent) r8
            int r4 = top.bienvenido.mundo.manifest.MundoIntermediary.f4722a
            top.bienvenido.mundo.manifest.MundoIntermediary r5 = (top.bienvenido.mundo.manifest.MundoIntermediary) r5
            java.lang.String r10 = "fbconnect"
            java.lang.String r4 = r8.getScheme()     // Catch:{ Exception -> 0x0191 }
            boolean r4 = U0.i.a(r4, r10)     // Catch:{ Exception -> 0x0191 }
            if (r4 == 0) goto L_0x0053
            r8.setComponent(r0)     // Catch:{ Exception -> 0x0191 }
            L0.b r4 = new L0.b     // Catch:{ Exception -> 0x0191 }
            r4.<init>(r8, r1)     // Catch:{ Exception -> 0x0191 }
        L_0x0051:
            r1 = r4
            goto L_0x0083
        L_0x0053:
            android.os.Bundle r4 = r8.getExtras()     // Catch:{ Exception -> 0x007a }
            if (r4 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            L0.b r6 = new L0.b     // Catch:{ Exception -> 0x007a }
            java.lang.String r7 = "android.intent.extra.INTENT"
            android.os.Parcelable r7 = r4.getParcelable(r7)     // Catch:{ Exception -> 0x007a }
            android.content.Intent r7 = (android.content.Intent) r7     // Catch:{ Exception -> 0x007a }
            if (r7 != 0) goto L_0x0067
            goto L_0x007b
        L_0x0067:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = r4.getString(r9)     // Catch:{ Exception -> 0x007a }
            if (r4 != 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r4
        L_0x0075:
            r6.<init>(r7, r1)     // Catch:{ Exception -> 0x007a }
            r4 = r6
            goto L_0x007c
        L_0x007a:
        L_0x007b:
            r4 = r0
        L_0x007c:
            if (r4 != 0) goto L_0x0051
            r5.finish()     // Catch:{ Exception -> 0x0191 }
            goto L_0x0191
        L_0x0083:
            java.lang.Object r4 = r1.f     // Catch:{ Exception -> 0x0191 }
            r6 = r4
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x0191 }
            q1.K2 r4 = q1.K2.b     // Catch:{ Exception -> 0x0191 }
            java.util.List r4 = r4.c(r6, r0, r3)     // Catch:{ Exception -> 0x0191 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x0191 }
            r9.<init>()     // Catch:{ Exception -> 0x0191 }
            r7 = r5
            r5 = r6
            j1.D r6 = new j1.D     // Catch:{ Exception -> 0x0191 }
            r11 = 8
            r6.<init>(r11)     // Catch:{ Exception -> 0x0191 }
            boolean r11 = r4.isEmpty()     // Catch:{ Exception -> 0x0191 }
            if (r11 != 0) goto L_0x00c8
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0191 }
        L_0x00a6:
            boolean r11 = r4.hasNext()     // Catch:{ Exception -> 0x0191 }
            if (r11 == 0) goto L_0x00c8
            java.lang.Object r11 = r4.next()     // Catch:{ Exception -> 0x0191 }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ Exception -> 0x0191 }
            android.content.pm.ActivityInfo r11 = r11.activityInfo     // Catch:{ Exception -> 0x0191 }
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ Exception -> 0x0191 }
            java.lang.String r13 = r11.packageName     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = r11.name     // Catch:{ Exception -> 0x0191 }
            r12.<init>(r13, r14)     // Catch:{ Exception -> 0x0191 }
            int r12 = r12.hashCode()     // Catch:{ Exception -> 0x0191 }
            r6.c(r12)     // Catch:{ Exception -> 0x0191 }
            r9.add(r11)     // Catch:{ Exception -> 0x0191 }
            goto L_0x00a6
        L_0x00c8:
            r1.a r4 = new r1.a     // Catch:{ Exception -> 0x0191 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0191 }
            r6 = r4
            r4 = r9
            android.content.Context r9 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00d8 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ Exception -> 0x00d8 }
            r6.e(r9)     // Catch:{ Exception -> 0x00d8 }
        L_0x00d8:
            boolean r6 = r4.isEmpty()     // Catch:{ Exception -> 0x0191 }
            if (r6 == 0) goto L_0x00e3
            r7.finish()     // Catch:{ Exception -> 0x0191 }
            goto L_0x0191
        L_0x00e3:
            int r6 = r4.size()     // Catch:{ Exception -> 0x0191 }
            if (r6 != r2) goto L_0x012c
            java.lang.Object r2 = r4.get(r3)     // Catch:{ Exception -> 0x0191 }
            android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2     // Catch:{ Exception -> 0x0191 }
            java.lang.Object r3 = r1.f     // Catch:{ Exception -> 0x0191 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x0191 }
            java.lang.String r3 = r3.getScheme()     // Catch:{ Exception -> 0x0191 }
            boolean r3 = U0.i.a(r3, r10)     // Catch:{ Exception -> 0x0191 }
            if (r3 == 0) goto L_0x0119
            q1.e0 r0 = q1.C0339e0.b     // Catch:{ Exception -> 0x0191 }
            java.lang.Object r3 = r1.f     // Catch:{ Exception -> 0x0191 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x0191 }
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ Exception -> 0x0191 }
            java.lang.String r5 = r2.packageName     // Catch:{ Exception -> 0x0191 }
            java.lang.String r2 = r2.name     // Catch:{ Exception -> 0x0191 }
            r4.<init>(r5, r2)     // Catch:{ Exception -> 0x0191 }
            android.content.Intent r2 = r3.setComponent(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.Object r1 = r1.f586g     // Catch:{ Exception -> 0x0191 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0191 }
            r0.Q(r2, r1)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0191
        L_0x0119:
            q1.K2 r3 = q1.K2.b     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = r2.packageName     // Catch:{ Exception -> 0x0191 }
            boolean r3 = r3.B0(r4)     // Catch:{ Exception -> 0x0191 }
            if (r3 != 0) goto L_0x0124
            goto L_0x0128
        L_0x0124:
            java.lang.Object r0 = r1.f586g     // Catch:{ Exception -> 0x0191 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0191 }
        L_0x0128:
            r7.a(r5, r0, r2, r8)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0191
        L_0x012c:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ Exception -> 0x0191 }
            int r6 = r4.size()     // Catch:{ Exception -> 0x0191 }
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0191 }
        L_0x0136:
            if (r3 >= r6) goto L_0x0161
            java.lang.Object r10 = r4.get(r3)     // Catch:{ Exception -> 0x0191 }
            android.content.pm.ActivityInfo r10 = (android.content.pm.ActivityInfo) r10     // Catch:{ Exception -> 0x0191 }
            java.lang.CharSequence r11 = r10.loadLabel(r0)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r10 = r10.packageName     // Catch:{ Exception -> 0x0191 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r12.<init>()     // Catch:{ Exception -> 0x0191 }
            r12.append(r11)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r11 = " ("
            r12.append(r11)     // Catch:{ Exception -> 0x0191 }
            r12.append(r10)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r10 = ")"
            r12.append(r10)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x0191 }
            r9[r3] = r10     // Catch:{ Exception -> 0x0191 }
            int r3 = r3 + r2
            goto L_0x0136
        L_0x0161:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x0191 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0191 }
            java.lang.CharSequence[] r9 = (java.lang.CharSequence[]) r9     // Catch:{ Exception -> 0x0191 }
            r1.b r3 = new r1.b     // Catch:{ Exception -> 0x0191 }
            r6 = r5
            r5 = r7
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0191 }
            r7 = r5
            r0.setItems(r9, r3)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r1 = "X"
            i0.h r2 = new i0.h     // Catch:{ Exception -> 0x0191 }
            r3 = 2
            r2.<init>(r3, r7)     // Catch:{ Exception -> 0x0191 }
            r0.setNegativeButton(r1, r2)     // Catch:{ Exception -> 0x0191 }
            r1.c r1 = new r1.c     // Catch:{ Exception -> 0x0191 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0191 }
            r0.setOnDismissListener(r1)     // Catch:{ Exception -> 0x0191 }
            F0.g r1 = new F0.g     // Catch:{ Exception -> 0x0191 }
            r2 = 12
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0191 }
            r7.runOnUiThread(r1)     // Catch:{ Exception -> 0x0191 }
        L_0x0191:
            return
        L_0x0192:
            int r0 = com.cheatbox.MainActivity.f1818B
            r0 = 2131689539(0x7f0f0043, float:1.9008096E38)
            com.cheatbox.MainActivity r5 = (com.cheatbox.MainActivity) r5
            java.lang.String r0 = r5.getString(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r0)
            return
        L_0x01a3:
            int r0 = com.cheatbox.MainActivity.f1818B
            com.cheatbox.MainActivity r5 = (com.cheatbox.MainActivity) r5
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.io.File r1 = q1.U3.f4017a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String[] r0 = new java.lang.String[]{r4, r0}
            java.io.File r0 = q1.H.d(r1, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            q1.l1 r1 = q1.C0382l1.f4134c
            android.os.IInterface r1 = r1.b()
            q1.f0 r1 = (q1.C0345f0) r1
            java.lang.String r1 = r1.x0(r4)
            java.lang.StringBuilder r1 = q.h.a(r1)
            r6 = 47554797026227154(0xa8f2d6001d33d2, double:1.7763977108723184E-305)
            java.lang.String r6 = p1.a.a(r6)
            r1.append(r6)
            r1.append(r4)
            r6 = 47554732601717714(0xa8f2c7001d33d2, double:1.7763814139446438E-305)
            java.lang.String r1 = A.g.g(r6, r1)
            java.lang.StringBuilder r4 = q.h.a(r0)
            r6 = 47554436248974290(0xa8f282001d33d2, double:1.7763064480773406E-305)
            java.lang.String r4 = A.g.g(r6, r4)
            java.lang.StringBuilder r0 = q.h.a(r0)
            r6 = 47554389004334034(0xa8f277001d33d2, double:1.776294496997046E-305)
            java.lang.String r0 = A.g.g(r6, r0)
            java.lang.StringBuilder r6 = q.h.a(r1)
            r7 = 47554268745249746(0xa8f25b001d33d2, double:1.7762640760653866E-305)
            java.lang.String r9 = A.g.g(r7, r6)
            java.lang.StringBuilder r6 = q.h.a(r1)
            r7 = 47554238680478674(0xa8f254001d33d2, double:1.7762564708324718E-305)
            java.lang.String r10 = A.g.g(r7, r6)
            java.lang.StringBuilder r6 = q.h.a(r1)
            r7 = 47554182845903826(0xa8f247001d33d2, double:1.7762423468284871E-305)
            java.lang.String r11 = A.g.g(r7, r6)
            java.lang.StringBuilder r6 = q.h.a(r1)
            r7 = 47554109831459794(0xa8f236001d33d2, double:1.7762238769771226E-305)
            java.lang.String r12 = A.g.g(r7, r6)
            java.lang.StringBuilder r6 = q.h.a(r1)
            r7 = 47554023932113874(0xa8f222001d33d2, double:1.776202147740223E-305)
            java.lang.String r13 = A.g.g(r7, r6)
            java.lang.StringBuilder r1 = q.h.a(r1)
            r6 = 47553920852898770(0xa8f20a001d33d2, double:1.7761760726559437E-305)
            java.lang.String r14 = A.g.g(r6, r1)
            java.lang.String[] r1 = new java.lang.String[]{r9, r10, r11, r12, r13, r14}
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            com.cheatbox.MainActivity.t(r6)
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            com.cheatbox.MainActivity.t(r4)
        L_0x025f:
            r0 = 6
            if (r3 >= r0) goto L_0x026e
            r0 = r1[r3]
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            com.cheatbox.MainActivity.t(r4)
            int r3 = r3 + r2
            goto L_0x025f
        L_0x026e:
            F0.g r0 = new F0.g
            r1 = 10
            r0.<init>(r1, r5)
            r5.runOnUiThread(r0)
            return
        L_0x0279:
            int r0 = com.cheatbox.LoginActivity.f1815x
            com.cheatbox.LoginActivity r5 = (com.cheatbox.LoginActivity) r5
            r5.getClass()
            android.app.AlertDialog r4 = (android.app.AlertDialog) r4
            r4.dismiss()
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 2131755554(0x7f100222, float:1.914199E38)
            r0.<init>(r5, r1)
            r1 = 2131689541(0x7f0f0045, float:1.90081E38)
            java.lang.String r1 = r5.getString(r1)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            r1 = 2131689558(0x7f0f0056, float:1.9008135E38)
            java.lang.String r1 = r5.getString(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r3)
            r1 = 2131689680(0x7f0f00d0, float:1.9008382E38)
            java.lang.String r1 = r5.getString(r1)
            i0.f r2 = new i0.f
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
        L_0x02bb:
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            e.D r5 = (e.C0122D) r5
            r5.getClass()
            r4.run()     // Catch:{ all -> 0x02c9 }
            r5.a()
            return
        L_0x02c9:
            r0 = move-exception
            r5.a()
            throw r0
        L_0x02ce:
            androidx.profileinstaller.ProfileInstallerInitializer r5 = (androidx.profileinstaller.ProfileInstallerInitializer) r5
            r5.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x02e2
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = Z.k.a(r0)
            goto L_0x02eb
        L_0x02e2:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L_0x02eb:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r5 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.max(r5, r2)
            int r1 = r1.nextInt(r2)
            Z.h r2 = new Z.h
            android.content.Context r4 = (android.content.Context) r4
            r2.<init>(r4, r3)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.run():void");
    }
}

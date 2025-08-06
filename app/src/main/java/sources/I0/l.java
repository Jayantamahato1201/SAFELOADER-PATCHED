package i0;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int f;

    public /* synthetic */ l(int i2) {
        this.f = i2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:53|54|55|56|(4:58|(1:60)(1:61)|(2:63|198)(1:197)|196)|64|65|66|(2:68|69)|70|(8:72|(4:74|75|199|76)|78|79|(4:82|(2:84|203)(1:202)|200|80)|201|85|215)(1:217)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:158|159) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:23|(2:24|25)|(4:29|30|(1:32)(1:33)|(2:35|(1:37)(1:38)))|39|40|(2:43|44)(1:45)|(3:50|51|212)(1:214)) */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = q1.C0394n1.f4143a;
        r0.startService(new android.content.Intent(r0, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x02f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0118 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[SYNTHETIC, Splitter:B:43:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120 A[SYNTHETIC, Splitter:B:68:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135 A[Catch:{ Exception -> 0x017d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 20
            java.lang.String r1 = "mundo_legacy_accounts.bin"
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = r15.f
            switch(r8) {
                case 0: goto L_0x0376;
                case 1: goto L_0x0349;
                case 2: goto L_0x0345;
                case 3: goto L_0x02d9;
                case 4: goto L_0x02d3;
                case 5: goto L_0x02cd;
                case 6: goto L_0x0256;
                case 7: goto L_0x021f;
                case 8: goto L_0x0213;
                case 9: goto L_0x01a9;
                case 10: goto L_0x017e;
                case 11: goto L_0x00f1;
                case 12: goto L_0x0088;
                case 13: goto L_0x0061;
                case 14: goto L_0x0050;
                default: goto L_0x000f;
            }
        L_0x000f:
            q1.q2 r14 = new q1.q2     // Catch:{ Exception -> 0x004f }
            r14.<init>(r7)     // Catch:{ Exception -> 0x004f }
            q1.O3.f3952a = r14     // Catch:{ Exception -> 0x004f }
            android.content.Context r11 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x004f }
            q1.K2 r0 = q1.K2.b     // Catch:{ Exception -> 0x004f }
            r0.getClass()     // Catch:{ Exception -> 0x004f }
            java.util.ArrayList r0 = q1.K2.U0()     // Catch:{ Exception -> 0x004f }
            int r1 = r0.size()     // Catch:{ Exception -> 0x004f }
            r2 = 0
        L_0x0026:
            if (r2 >= r1) goto L_0x004f
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x004f }
            int r2 = r2 + r6
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x004f }
            q1.K2 r3 = q1.K2.b     // Catch:{ Exception -> 0x004f }
            r3.getClass()     // Catch:{ Exception -> 0x004f }
            q1.E4 r4 = q1.K2.f3929c     // Catch:{ Exception -> 0x004f }
            boolean r10 = r4.containsKey(r12)     // Catch:{ Exception -> 0x004f }
            if (r10 == 0) goto L_0x0043
            android.content.pm.ApplicationInfo r3 = r3.I0(r7, r12)     // Catch:{ Exception -> 0x004f }
            r13 = r3
            goto L_0x0044
        L_0x0043:
            r13 = r5
        L_0x0044:
            q1.N3 r9 = new q1.N3     // Catch:{ Exception -> 0x004f }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x004f }
            java.util.concurrent.ExecutorService r3 = q1.d5.b     // Catch:{ Exception -> 0x004f }
            r3.execute(r9)     // Catch:{ Exception -> 0x004f }
            goto L_0x0026
        L_0x004f:
            return
        L_0x0050:
            android.os.ConditionVariable r0 = q1.K2.f3931e
            q1.E0.a()     // Catch:{ all -> 0x005d }
            q1.K2 r1 = q1.K2.b     // Catch:{ all -> 0x005d }
            r1.getClass()     // Catch:{ all -> 0x005d }
            q1.K2.X0()     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0.open()
            return
        L_0x0061:
            android.os.ConditionVariable r0 = q1.K2.f3931e
            r0.close()     // Catch:{ all -> 0x0084 }
            q1.E4 r1 = q1.K2.f3929c     // Catch:{ all -> 0x0084 }
            r1.clear()     // Catch:{ all -> 0x0084 }
            q1.E4 r1 = q1.K2.f3930d     // Catch:{ all -> 0x0084 }
            r1.clear()     // Catch:{ all -> 0x0084 }
            q1.q2 r1 = q1.K2.f     // Catch:{ all -> 0x0084 }
            r1.f4178c = r7     // Catch:{ all -> 0x0084 }
            int[] r2 = q1.H.b     // Catch:{ all -> 0x0084 }
            r1.f4177a = r2     // Catch:{ all -> 0x0084 }
            java.lang.Object[] r2 = q1.H.f3887d     // Catch:{ all -> 0x0084 }
            r1.b = r2     // Catch:{ all -> 0x0084 }
            q1.K2 r1 = q1.K2.b     // Catch:{ all -> 0x0084 }
            r1.getClass()     // Catch:{ all -> 0x0084 }
            q1.K2.X0()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0.open()
            return
        L_0x0088:
            java.lang.String r0 = "top.bienvenido.mundo.FBLoginAbility"
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0099 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r8 = q1.C0394n1.b     // Catch:{ Exception -> 0x0099 }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r8, r9)     // Catch:{ Exception -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r1 = r5
        L_0x009b:
            if (r1 != 0) goto L_0x009e
            goto L_0x00b8
        L_0x009e:
            android.os.Bundle r1 = r1.metaData     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r8 = "MUNDO_APP_KEY"
            java.lang.String r9 = ""
            java.lang.String r1 = r1.getString(r8, r9)     // Catch:{ all -> 0x00b8 }
            goto L_0x00ac
        L_0x00ab:
            r1 = r5
        L_0x00ac:
            if (r1 == 0) goto L_0x00b8
            int r8 = r1.length()     // Catch:{ all -> 0x00b8 }
            if (r8 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            q1.H.r(r7, r1)     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00ce }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x00ce }
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ Exception -> 0x00ce }
            java.lang.String r8 = q1.C0394n1.b     // Catch:{ Exception -> 0x00ce }
            r7.<init>(r8, r0)     // Catch:{ Exception -> 0x00ce }
            int r1 = r1.getComponentEnabledSetting(r7)     // Catch:{ Exception -> 0x00ce }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00cf
        L_0x00ce:
        L_0x00cf:
            if (r5 == 0) goto L_0x00d6
            int r1 = r5.intValue()     // Catch:{  }
            goto L_0x00d7
        L_0x00d6:
            r1 = 1
        L_0x00d7:
            if (r1 == 0) goto L_0x00e0
            if (r1 == r4) goto L_0x00e0
            if (r1 == r3) goto L_0x00e0
            if (r1 == r2) goto L_0x00e0
            goto L_0x00f0
        L_0x00e0:
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ all -> 0x00f0 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x00f0 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = q1.C0394n1.b     // Catch:{ all -> 0x00f0 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00f0 }
            r1.setComponentEnabledSetting(r2, r6, r6)     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            return
        L_0x00f1:
            q1.E4 r0 = new q1.E4     // Catch:{ Exception -> 0x017d }
            r0.<init>()     // Catch:{ Exception -> 0x017d }
            java.util.ArrayList r2 = q1.U4.a()     // Catch:{ Exception -> 0x0118 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x0118 }
            r4 = 0
        L_0x00ff:
            if (r4 >= r3) goto L_0x0118
            java.lang.Object r8 = r2.get(r4)     // Catch:{ Exception -> 0x0118 }
            int r4 = r4 + r6
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ Exception -> 0x0118 }
            q1.e2 r8 = q1.U4.b(r8)     // Catch:{ Exception -> 0x0118 }
            if (r8 == 0) goto L_0x0111
            java.lang.String r9 = r8.type     // Catch:{ Exception -> 0x0118 }
            goto L_0x0112
        L_0x0111:
            r9 = r5
        L_0x0112:
            if (r9 == 0) goto L_0x00ff
            r0.put(r9, r8)     // Catch:{ Exception -> 0x0118 }
            goto L_0x00ff
        L_0x0118:
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x017d }
            N.g r3 = q1.C0395n2.f4146c
            if (r2 != 0) goto L_0x0122
            r3.f606c = r0     // Catch:{ Exception -> 0x017d }
        L_0x0122:
            boolean r2 = q1.F3.f3882a     // Catch:{ Exception -> 0x017d }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x017d }
            android.content.Context r4 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x017d }
            java.io.File r4 = r4.getCacheDir()     // Catch:{ Exception -> 0x017d }
            r2.<init>(r4, r1)     // Catch:{ Exception -> 0x017d }
            boolean r1 = r2.exists()     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x017d
            byte[] r1 = Q0.k.g0(r2)     // Catch:{ Exception -> 0x017d }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x017d }
            int r4 = r1.length     // Catch:{ Exception -> 0x017d }
            r2.unmarshall(r1, r7, r4)     // Catch:{ Exception -> 0x017d }
            r2.setDataPosition(r7)     // Catch:{ Exception -> 0x017d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x017d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x017d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x017d }
        L_0x014d:
            if (r1 <= 0) goto L_0x015a
            q1.a5 r5 = new q1.a5     // Catch:{ all -> 0x0157 }
            r5.<init>((android.os.Parcel) r2)     // Catch:{ all -> 0x0157 }
            r4.add(r5)     // Catch:{ all -> 0x0157 }
        L_0x0157:
            int r1 = r1 + -1
            goto L_0x014d
        L_0x015a:
            r2.recycle()     // Catch:{ Exception -> 0x017d }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ Exception -> 0x017d }
        L_0x0161:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x017d }
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x017d }
            q1.a5 r2 = (q1.a5) r2     // Catch:{ Exception -> 0x017d }
            android.accounts.Account r2 = r2.f4054a     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r2.type     // Catch:{ Exception -> 0x017d }
            boolean r2 = r0.containsKey(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x0161
            r1.remove()     // Catch:{ Exception -> 0x017d }
            goto L_0x0161
        L_0x017b:
            r3.b = r4     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            return
        L_0x017e:
            boolean r0 = q1.T4.f4000e     // Catch:{ all -> 0x01a8 }
            q1.n2 r1 = q1.C0395n2.b
            if (r0 == 0) goto L_0x0199
            r1.getClass()     // Catch:{ all -> 0x01a8 }
            q1.c3 r0 = q1.C0330c3.b     // Catch:{ all -> 0x01a8 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x01a8 }
            java.lang.String r3 = "android.accounts.action.VISIBLE_ACCOUNTS_CHANGED"
            r2.<init>(r3)     // Catch:{ all -> 0x01a8 }
            r3 = 1073741824(0x40000000, float:2.0)
            android.content.Intent r2 = r2.setFlags(r3)     // Catch:{ all -> 0x01a8 }
            r0.g0(r2, r5, r7)     // Catch:{ all -> 0x01a8 }
        L_0x0199:
            r1.getClass()     // Catch:{ all -> 0x01a8 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x01a8 }
            java.lang.String r1 = "android.accounts.LOGIN_ACCOUNTS_CHANGED"
            r0.<init>(r1)     // Catch:{ all -> 0x01a8 }
            q1.c3 r1 = q1.C0330c3.b     // Catch:{ all -> 0x01a8 }
            r1.g0(r0, r5, r7)     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            return
        L_0x01a9:
            boolean r0 = q1.F3.f3882a     // Catch:{ Exception -> 0x0212 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0212 }
            android.content.Context r2 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0212 }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x0212 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0212 }
            N.g r1 = q1.C0395n2.f4146c     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r1 = r1.b     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0212 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0212 }
            if (r2 == 0) goto L_0x01c6
            r0.delete()     // Catch:{ Exception -> 0x0212 }
            goto L_0x0212
        L_0x01c6:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0212 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0212 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0212 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x0212 }
            r1.writeInt(r3)     // Catch:{ Exception -> 0x0212 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x0212 }
            r4 = 0
        L_0x01db:
            if (r4 >= r3) goto L_0x0208
            java.lang.Object r5 = r2.get(r4)     // Catch:{ Exception -> 0x0212 }
            int r4 = r4 + r6
            q1.a5 r5 = (q1.a5) r5     // Catch:{ Exception -> 0x0212 }
            android.accounts.Account r8 = r5.f4054a     // Catch:{ Exception -> 0x0212 }
            r1.writeParcelable(r8, r7)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r8 = r5.b     // Catch:{ Exception -> 0x0212 }
            r1.writeString(r8)     // Catch:{ Exception -> 0x0212 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0212 }
            q1.E4 r9 = r5.f4055c     // Catch:{ Exception -> 0x0212 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0212 }
            r1.writeSerializable(r8)     // Catch:{ Exception -> 0x0212 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0212 }
            q1.E4 r9 = r5.f4056d     // Catch:{ Exception -> 0x0212 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0212 }
            r1.writeSerializable(r8)     // Catch:{ Exception -> 0x0212 }
            long r8 = r5.f4057e     // Catch:{ Exception -> 0x0212 }
            r1.writeLong(r8)     // Catch:{ Exception -> 0x0212 }
            goto L_0x01db
        L_0x0208:
            byte[] r2 = r1.marshall()     // Catch:{ Exception -> 0x0212 }
            r1.recycle()     // Catch:{ Exception -> 0x0212 }
            Q0.k.h0(r0, r2)     // Catch:{ Exception -> 0x0212 }
        L_0x0212:
            return
        L_0x0213:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x021e }
            java.lang.String r1 = "SDK aún no está bien preparado, por favor espere hasta que esté bien preparado. Puede ponerse en contacto con nuestro servicio de atención al cliente para obtener más información. Correo electrónico: help@62v.net"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)     // Catch:{ Exception -> 0x021e }
            r0.show()     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            return
        L_0x021f:
            boolean r0 = q1.T4.f3999d
            if (r0 == 0) goto L_0x022a
            q1.R1 r0 = q1.R1.b
            r0.b()     // Catch:{ all -> 0x0229 }
            goto L_0x022a
        L_0x0229:
        L_0x022a:
            boolean r0 = q1.T4.f
            if (r0 == 0) goto L_0x0238
            q1.n4 r0 = q1.C0397n4.b
            r0.getClass()     // Catch:{ all -> 0x0237 }
            q1.C0397n4.f()     // Catch:{ all -> 0x0237 }
            goto L_0x0238
        L_0x0237:
        L_0x0238:
            boolean r0 = q1.T4.f4001g
            if (r0 == 0) goto L_0x0243
            q1.F4 r0 = q1.F4.b
            r0.b()     // Catch:{ all -> 0x0242 }
            goto L_0x0243
        L_0x0242:
        L_0x0243:
            boolean r0 = q1.T4.f4003i
            if (r0 == 0) goto L_0x0250
            boolean r0 = q1.T4.f4009o
            if (r0 == 0) goto L_0x0250
            q1.G2 r0 = q1.G2.b
            r0.b()     // Catch:{ all -> 0x0250 }
        L_0x0250:
            q1.M2.a()
            q1.C0 r0 = q1.Q0.f3960a
            return
        L_0x0256:
            q1.V4[] r1 = new q1.V4[r0]
            q1.r4 r5 = q1.C0420r4.b
            r1[r7] = r5
            q1.j0 r5 = q1.C0369j0.b
            r1[r6] = r5
            q1.F2 r5 = q1.F2.b
            r1[r4] = r5
            q1.s1 r4 = q1.C0423s1.b
            r1[r3] = r4
            q1.F0 r3 = q1.F0.b
            r1[r2] = r3
            q1.k r2 = q1.C0374k.b
            r3 = 5
            r1[r3] = r2
            q1.I1 r2 = q1.I1.b
            r3 = 6
            r1[r3] = r2
            q1.q4 r2 = q1.C0415q4.b
            r3 = 7
            r1[r3] = r2
            q1.Z4 r2 = q1.Z4.b
            r3 = 8
            r1[r3] = r2
            q1.A4 r2 = q1.A4.b
            r3 = 9
            r1[r3] = r2
            q1.P4 r2 = q1.P4.b
            r3 = 10
            r1[r3] = r2
            q1.g4 r2 = q1.C0355g4.b
            r3 = 11
            r1[r3] = r2
            q1.D1 r2 = q1.D1.b
            r3 = 12
            r1[r3] = r2
            q1.G0 r2 = q1.G0.b
            r3 = 13
            r1[r3] = r2
            q1.e1 r2 = q1.C0340e1.b
            r3 = 14
            r1[r3] = r2
            q1.i0 r2 = q1.C0363i0.b
            r3 = 15
            r1[r3] = r2
            q1.r0 r2 = q1.C0416r0.b
            r3 = 16
            r1[r3] = r2
            q1.n0 r2 = q1.C0393n0.b
            r3 = 17
            r1[r3] = r2
            q1.E3 r2 = q1.E3.b
            r3 = 18
            r1[r3] = r2
            q1.a4 r2 = q1.C0319a4.b
            r3 = 19
            r1[r3] = r2
        L_0x02c3:
            if (r7 >= r0) goto L_0x02cc
            r2 = r1[r7]
            r2.b()     // Catch:{ all -> 0x02ca }
        L_0x02ca:
            int r7 = r7 + r6
            goto L_0x02c3
        L_0x02cc:
            return
        L_0x02cd:
            q1.W4 r0 = q1.W4.b
            r0.b()     // Catch:{ all -> 0x02d2 }
        L_0x02d2:
            return
        L_0x02d3:
            q1.C4 r0 = q1.C4.b
            r0.b()     // Catch:{ all -> 0x02d8 }
        L_0x02d8:
            return
        L_0x02d9:
            q1.q2 r0 = q1.T1.f3992a
            java.lang.String r0 = q1.H.f3896n     // Catch:{ Exception -> 0x0344 }
            java.lang.String r1 = q1.H.f3897o     // Catch:{ Exception -> 0x0344 }
            boolean r2 = q1.H.f3900r     // Catch:{ Exception -> 0x0344 }
            if (r2 == 0) goto L_0x0302
            q1.l1 r2 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x0344 }
            r2.getClass()     // Catch:{ Exception -> 0x0344 }
            android.os.IInterface r2 = r2.b()     // Catch:{ Exception -> 0x02f3 }
            q1.f0 r2 = (q1.C0345f0) r2     // Catch:{ Exception -> 0x02f3 }
            android.content.pm.PackageInfo r5 = r2.R(r6, r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x030e
        L_0x02f3:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0300 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0300 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r3 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0300 }
            r0.startService(r2)     // Catch:{ Exception -> 0x0300 }
            goto L_0x030e
        L_0x0300:
            goto L_0x030e
        L_0x0302:
            android.content.Context r2 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0300 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x0300 }
            r3 = 513(0x201, float:7.19E-43)
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r0, r3)     // Catch:{ Exception -> 0x0300 }
        L_0x030e:
            if (r5 == 0) goto L_0x0344
            android.content.pm.ActivityInfo[] r0 = r5.activities     // Catch:{ Exception -> 0x0344 }
            if (r0 == 0) goto L_0x0344
            q1.q2 r2 = new q1.q2     // Catch:{ Exception -> 0x0344 }
            int r3 = r0.length     // Catch:{ Exception -> 0x0344 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0344 }
            r3 = r0[r7]     // Catch:{ Exception -> 0x0344 }
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch:{ Exception -> 0x0344 }
            q1.C0444v4.b(r3)     // Catch:{ Exception -> 0x0344 }
            int r4 = r0.length     // Catch:{ Exception -> 0x0344 }
        L_0x0322:
            if (r7 >= r4) goto L_0x0342
            r5 = r0[r7]     // Catch:{ Exception -> 0x0344 }
            java.lang.String r8 = r5.processName     // Catch:{ Exception -> 0x0344 }
            boolean r8 = U0.i.a(r8, r1)     // Catch:{ Exception -> 0x0344 }
            if (r8 != 0) goto L_0x0333
            int r8 = r5.flags     // Catch:{ Exception -> 0x0344 }
            r8 = r8 & r6
            if (r8 == 0) goto L_0x0340
        L_0x0333:
            java.lang.String r8 = r5.name     // Catch:{ Exception -> 0x0344 }
            int r8 = r8.hashCode()     // Catch:{ Exception -> 0x0344 }
            r5.applicationInfo = r3     // Catch:{ Exception -> 0x0344 }
            r5.enabled = r6     // Catch:{ Exception -> 0x0344 }
            r2.b(r8, r5)     // Catch:{ Exception -> 0x0344 }
        L_0x0340:
            int r7 = r7 + r6
            goto L_0x0322
        L_0x0342:
            q1.T1.f3992a = r2     // Catch:{ Exception -> 0x0344 }
        L_0x0344:
            return
        L_0x0345:
            q1.C0433u.T0()
            return
        L_0x0349:
            int r0 = top.bienvenido.mundo.common.initialize.MNative.f4717a     // Catch:{ all -> 0x0375 }
            boolean r0 = q1.T4.f4003i     // Catch:{ all -> 0x0375 }
            if (r0 == 0) goto L_0x0356
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ all -> 0x0375 }
            android.content.AttributionSource r5 = r0.getAttributionSource()     // Catch:{ all -> 0x0375 }
            goto L_0x035f
        L_0x0356:
            boolean r0 = q1.T4.f     // Catch:{ all -> 0x0375 }
            if (r0 != 0) goto L_0x035f
            q1.W0 r5 = new q1.W0     // Catch:{ all -> 0x0375 }
            r5.<init>()     // Catch:{ all -> 0x0375 }
        L_0x035f:
            q1.b1 r0 = new q1.b1     // Catch:{ all -> 0x0375 }
            r0.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0375 }
            java.lang.String r2 = q1.C0394n1.b     // Catch:{ all -> 0x0375 }
            r1[r7] = r2     // Catch:{ all -> 0x0375 }
            r1[r6] = r5     // Catch:{ all -> 0x0375 }
            r1[r4] = r0     // Catch:{ all -> 0x0375 }
            r0 = 1003(0x3eb, float:1.406E-42)
            top.bienvenido.mundo.common.initialize.MNative.a(r0, r1)     // Catch:{ all -> 0x0375 }
            java.lang.Object r0 = q1.J3.f3923a     // Catch:{ all -> 0x0375 }
        L_0x0375:
            return
        L_0x0376:
            int r0 = com.cheatbox.MainActivity.f1818B
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x037e }
            goto L_0x0382
        L_0x037e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.run():void");
    }
}

package q1;

import T0.p;
import U0.h;

/* renamed from: q1.h1  reason: case insensitive filesystem */
public final class C0358h1 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4108a;
    public final Object b;

    public /* synthetic */ C0358h1(int i2, Object obj) {
        this.f4108a = i2;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [U0.h, T0.p] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0 = q1.C0394n1.f4143a;
        r0.startService(new android.content.Intent(r0, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object r1 = r6.b
            r2 = 0
            int r3 = r6.f4108a
            switch(r3) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x0074;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = r9[r2]     // Catch:{ Exception -> 0x006f }
            boolean r3 = r2 instanceof android.content.ComponentName     // Catch:{ Exception -> 0x006f }
            if (r3 == 0) goto L_0x006f
            r3 = r2
            android.content.ComponentName r3 = (android.content.ComponentName) r3     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = q1.C0394n1.b     // Catch:{ Exception -> 0x006f }
            boolean r4 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x006f }
            if (r4 != 0) goto L_0x006f
            boolean r4 = q1.H.f3900r     // Catch:{ Exception -> 0x006f }
            r5 = 0
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = q1.H.f3896n     // Catch:{ Exception -> 0x006f }
            boolean r3 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x006f }
            if (r3 == 0) goto L_0x0040
            q1.L3.c(r9, r0)     // Catch:{ Exception -> 0x006f }
            java.lang.Object r0 = r8.invoke(r7, r9)     // Catch:{ Exception -> 0x006f }
            if (r0 == 0) goto L_0x0073
            q1.v4 r1 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x006f }
            r1 = r0
            android.content.pm.ComponentInfo r1 = (android.content.pm.ComponentInfo) r1     // Catch:{ Exception -> 0x006f }
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch:{ Exception -> 0x006f }
            q1.C0444v4.b(r1)     // Catch:{ Exception -> 0x006f }
            r5 = r0
            goto L_0x0073
        L_0x0040:
            q1.l1 r0 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x006f }
            android.content.ComponentName r2 = (android.content.ComponentName) r2     // Catch:{ Exception -> 0x006f }
            r0.getClass()     // Catch:{ Exception -> 0x006f }
            android.os.IInterface r0 = r0.b()     // Catch:{ Exception -> 0x0057 }
            q1.f0 r0 = (q1.C0345f0) r0     // Catch:{ Exception -> 0x0057 }
            U0.h r1 = (U0.h) r1     // Catch:{ Exception -> 0x0057 }
            java.lang.Object r0 = r1.d(r0, r2)     // Catch:{ Exception -> 0x0057 }
            android.content.pm.ComponentInfo r0 = (android.content.pm.ComponentInfo) r0     // Catch:{ Exception -> 0x0057 }
            r5 = r0
            goto L_0x0065
        L_0x0057:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0064 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0064 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0064 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            if (r5 == 0) goto L_0x006f
            q1.v4 r0 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x006f }
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo     // Catch:{ Exception -> 0x006f }
            q1.C0444v4.b(r0)     // Catch:{ Exception -> 0x006f }
            goto L_0x0073
        L_0x006f:
            java.lang.Object r5 = r8.invoke(r7, r9)
        L_0x0073:
            return r5
        L_0x0074:
            q1.L r1 = (q1.L) r1
            java.lang.Object r7 = r1.a(r7, r8, r9)
            boolean r8 = r7 instanceof android.content.pm.ApplicationInfo     // Catch:{ Exception -> 0x00f6 }
            if (r8 == 0) goto L_0x00f6
            r8 = r7
            android.content.pm.ApplicationInfo r8 = (android.content.pm.ApplicationInfo) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r8 = r8.packageName     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r9 = q1.H.f3896n     // Catch:{ Exception -> 0x00f6 }
            boolean r8 = U0.i.a(r8, r9)     // Catch:{ Exception -> 0x00f6 }
            if (r8 == 0) goto L_0x00f6
            boolean r8 = q1.H.f3900r     // Catch:{ Exception -> 0x00f6 }
            if (r8 != 0) goto L_0x00f6
            q1.g0 r8 = q1.C0447w1.f4225a     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r8 = r8.f4098c     // Catch:{ Exception -> 0x00f6 }
            q1.C0 r8 = (q1.C0) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r8 = r8.a(r7)     // Catch:{ Exception -> 0x00f6 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00f6 }
            if (r8 == 0) goto L_0x00bf
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00f6 }
        L_0x00a1:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00f6 }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00f6 }
            android.content.pm.SharedLibraryInfo r9 = G.f.c(r9)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r1 = "com.huawei.easygo"
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x00f6 }
            boolean r9 = r1.equals(r9)     // Catch:{ Exception -> 0x00f6 }
            if (r9 == 0) goto L_0x00a1
            r8.remove()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00a1
        L_0x00bf:
            r8 = r7
            android.content.pm.ApplicationInfo r8 = (android.content.pm.ApplicationInfo) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.String[] r8 = r8.sharedLibraryFiles     // Catch:{ Exception -> 0x00f6 }
            if (r8 == 0) goto L_0x00f6
            int r9 = r8.length     // Catch:{ Exception -> 0x00f6 }
            if (r9 != 0) goto L_0x00ca
            goto L_0x00f6
        L_0x00ca:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f6 }
            int r1 = r8.length     // Catch:{ Exception -> 0x00f6 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00f6 }
            int r1 = r8.length     // Catch:{ Exception -> 0x00f6 }
        L_0x00d1:
            if (r2 >= r1) goto L_0x00e2
            r3 = r8[r2]     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = "HwEasyGo.apk"
            boolean r4 = b1.i.f0(r3, r4)     // Catch:{ Exception -> 0x00f6 }
            if (r4 != 0) goto L_0x00e0
            r9.add(r3)     // Catch:{ Exception -> 0x00f6 }
        L_0x00e0:
            int r2 = r2 + r0
            goto L_0x00d1
        L_0x00e2:
            int r8 = r8.length     // Catch:{ Exception -> 0x00f6 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x00f6 }
            if (r8 == r0) goto L_0x00f6
            r8 = r7
            android.content.pm.ApplicationInfo r8 = (android.content.pm.ApplicationInfo) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.String[] r0 = q1.H.f3888e     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object[] r9 = r9.toArray(r0)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ Exception -> 0x00f6 }
            r8.sharedLibraryFiles = r9     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            return r7
        L_0x00f7:
            q1.q2 r0 = q1.C0388m1.f4140a     // Catch:{ all -> 0x0112 }
            r3 = r9[r2]     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0101
            int r2 = r3.hashCode()     // Catch:{ all -> 0x0112 }
        L_0x0101:
            java.lang.Object r0 = r0.a(r2)     // Catch:{ all -> 0x0112 }
            L0.b r0 = (L0.b) r0     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0112
            T0.l r1 = (T0.l) r1     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = r0.f     // Catch:{ all -> 0x0112 }
            java.lang.Object r7 = r1.e(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0116
        L_0x0112:
            java.lang.Object r7 = r8.invoke(r7, r9)
        L_0x0116:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0358h1.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public C0358h1(p pVar) {
        this.f4108a = 2;
        this.b = (h) pVar;
    }
}

package q1;

public abstract class X1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0351g0 f4033a = new C0351g0("mPM");

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (U0.i.a(r4.getClass().getClassLoader(), android.content.pm.PackageManager.class.getClassLoader()) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(android.content.Context r4) {
        /*
            r0 = 0
            android.os.Parcelable$Creator r1 = android.content.pm.PackageInfo.CREATOR     // Catch:{ Exception -> 0x008b }
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x008b }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x008b }
            java.lang.Class<android.content.pm.PackageInfo> r2 = android.content.pm.PackageInfo.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x008b }
            boolean r1 = U0.i.a(r1, r2)     // Catch:{ Exception -> 0x008b }
            if (r1 != 0) goto L_0x0019
            goto L_0x008b
        L_0x0019:
            android.os.Parcelable$Creator r1 = android.content.pm.Signature.CREATOR     // Catch:{ Exception -> 0x008b }
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x008b }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x008b }
            java.lang.Class<android.content.pm.Signature> r2 = android.content.pm.Signature.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x008b }
            boolean r1 = U0.i.a(r1, r2)     // Catch:{ Exception -> 0x008b }
            if (r1 != 0) goto L_0x0030
            goto L_0x008b
        L_0x0030:
            q1.g0 r1 = f4033a     // Catch:{ Exception -> 0x008b }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x004f }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x004f }
            java.lang.Class r2 = r4.getClass()     // Catch:{ Exception -> 0x004f }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x004f }
            java.lang.Class<android.content.pm.PackageManager> r3 = android.content.pm.PackageManager.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x004f }
            boolean r2 = U0.i.a(r2, r3)     // Catch:{ Exception -> 0x004f }
            if (r2 != 0) goto L_0x0051
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            r4 = r0
        L_0x0051:
            if (r4 != 0) goto L_0x0054
            goto L_0x008b
        L_0x0054:
            java.lang.Object r1 = r1.f4098c     // Catch:{ Exception -> 0x008b }
            q1.C0 r1 = (q1.C0) r1     // Catch:{ Exception -> 0x008b }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ Exception -> 0x008b }
            if (r4 != 0) goto L_0x005f
            goto L_0x008b
        L_0x005f:
            boolean r1 = r4 instanceof android.os.IInterface     // Catch:{ Exception -> 0x008b }
            if (r1 == 0) goto L_0x008a
            r1 = r4
            android.os.IInterface r1 = (android.os.IInterface) r1     // Catch:{ Exception -> 0x008b }
            android.os.IBinder r1 = r1.asBinder()     // Catch:{ Exception -> 0x008b }
            java.lang.Class r2 = r1.getClass()     // Catch:{ Exception -> 0x008b }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x008b }
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x008b }
            boolean r2 = U0.i.a(r2, r3)     // Catch:{ Exception -> 0x008b }
            if (r2 != 0) goto L_0x007f
            goto L_0x008b
        L_0x007f:
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x008b }
            boolean r1 = java.lang.reflect.Proxy.isProxyClass(r1)     // Catch:{ Exception -> 0x008b }
            if (r1 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            return r4
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.X1.a(android.content.Context):java.lang.Object");
    }
}

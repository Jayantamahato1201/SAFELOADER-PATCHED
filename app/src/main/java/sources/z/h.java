package Z;

import android.content.Context;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f816g;

    public /* synthetic */ h(Context context, int i2) {
        this.f = i2;
        this.f816g = context;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x008b;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L_0x0088
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r11.f816g
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L_0x0088
            boolean r3 = E.b.a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L_0x0061
            n.c r3 = e.C0141l.f2527g
            java.util.Iterator r3 = r3.iterator()
        L_0x002d:
            r5 = r3
            n.g r5 = (n.C0294g) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004f
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e.l r5 = (e.C0141l) r5
            if (r5 == 0) goto L_0x002d
            e.x r5 = (e.x) r5
            android.content.Context r5 = r5.f2592k
            if (r5 == 0) goto L_0x002d
            java.lang.Object r3 = r5.getSystemService(r4)
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0066
            android.os.LocaleList r3 = e.C0140k.a(r3)
            E.g r5 = new E.g
            E.k r6 = new E.k
            r6.<init>(r3)
            r5.<init>(r6)
            goto L_0x0068
        L_0x0061:
            E.g r5 = e.C0141l.f2524c
            if (r5 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            E.g r5 = E.g.b
        L_0x0068:
            E.i r3 = r5.f89a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = Q0.l.V(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L_0x0081
            android.os.LocaleList r3 = e.C0139j.a(r3)
            e.C0140k.b(r4, r3)
        L_0x0081:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L_0x0088:
            e.C0141l.f = r2
            return
        L_0x008b:
            Z.d r0 = new Z.d
            r0.<init>()
            E0.e r1 = Z.f.f806a
            r2 = 0
            android.content.Context r3 = r11.f816g
            Z.f.s(r3, r0, r1, r2)
            return
        L_0x0099:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            Z.h r0 = new Z.h
            android.content.Context r1 = r11.f816g
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.run():void");
    }
}

package q1;

import android.content.Intent;
import android.os.IBinder;

/* renamed from: q1.p  reason: case insensitive filesystem */
public final /* synthetic */ class C0404p implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IBinder f4152g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Intent f4153h;

    public /* synthetic */ C0404p(IBinder iBinder, Intent intent, int i2) {
        this.f = i2;
        this.f4152g = iBinder;
        this.f4153h = intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            int r0 = r4.f
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.os.IBinder r0 = r4.f4152g
            android.content.Intent r1 = r4.f4153h
            q1.Q0.c(r0, r1)
            return
        L_0x000d:
            android.os.IBinder r0 = r4.f4152g
            android.content.Intent r1 = r4.f4153h
            java.util.Map r2 = q1.C0433u.f4206r     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0042 }
            android.app.Service r2 = (android.app.Service) r2     // Catch:{ Exception -> 0x0042 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0042
        L_0x001c:
            java.lang.ClassLoader r3 = r2.getClassLoader()     // Catch:{ Exception -> 0x0042 }
            r1.setExtrasClassLoader(r3)     // Catch:{ Exception -> 0x0042 }
            android.os.IBinder r2 = r2.onBind(r1)     // Catch:{ Exception -> 0x0042 }
            q1.T3 r3 = q1.T3.f3994c     // Catch:{ Exception -> 0x0042 }
            r3.getClass()     // Catch:{ Exception -> 0x0042 }
            android.os.IInterface r3 = r3.b()     // Catch:{ Exception -> 0x0036 }
            q1.b4 r3 = (q1.C0325b4) r3     // Catch:{ Exception -> 0x0036 }
            r3.K(r0, r1, r2)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0042
        L_0x0036:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0042 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0042 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0042 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            return
        L_0x0043:
            android.os.IBinder r0 = r4.f4152g
            java.util.Map r1 = q1.C0433u.f4206r     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0060 }
            android.app.Service r0 = (android.app.Service) r0     // Catch:{ Exception -> 0x0060 }
            if (r0 != 0) goto L_0x0050
            goto L_0x0060
        L_0x0050:
            android.content.Intent r1 = r4.f4153h
            if (r1 == 0) goto L_0x005c
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ Exception -> 0x0060 }
            r1.setExtrasClassLoader(r2)     // Catch:{ Exception -> 0x0060 }
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r0.onUnbind(r1)     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0404p.run():void");
    }
}

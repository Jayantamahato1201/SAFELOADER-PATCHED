package q1;

import android.app.Activity;
import android.os.Bundle;

public abstract class C2 extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate((Bundle) null);
        finishAndRemoveTask();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy() {
        /*
            r3 = this;
            super.onDestroy()
            android.content.Intent r0 = r3.getIntent()     // Catch:{ Exception -> 0x0040 }
            boolean r1 = q1.T4.f4003i     // Catch:{ Exception -> 0x0040 }
            if (r1 == 0) goto L_0x000e
            q1.C0409p4.a()     // Catch:{ Exception -> 0x0040 }
        L_0x000e:
            java.lang.String r1 = "user"
            java.lang.String r1 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            L0.d r0 = q1.H4.a(r0)     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r0.f     // Catch:{ Exception -> 0x0040 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x0040
            q1.F r2 = q1.F.f3877c     // Catch:{ Exception -> 0x0040 }
            r2.getClass()     // Catch:{ Exception -> 0x0040 }
            android.os.IInterface r2 = r2.b()     // Catch:{ Exception -> 0x0034 }
            q1.s0 r2 = (q1.C0422s0) r2     // Catch:{ Exception -> 0x0034 }
            r2.Q(r0, r1)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0040
        L_0x0034:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0040 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0040 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0040 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C2.onDestroy():void");
    }
}

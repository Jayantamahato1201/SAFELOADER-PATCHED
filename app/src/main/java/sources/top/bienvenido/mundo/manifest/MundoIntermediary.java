package top.bienvenido.mundo.manifest;

import Z.g;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import q1.d5;

public final class MundoIntermediary extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4722a = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.os.IBinder} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r4, java.lang.String r5, android.content.pm.ActivityInfo r6, android.content.Intent r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = r6.packageName     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = r6.name     // Catch:{ Exception -> 0x004d }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x004d }
            r4.setComponent(r0)     // Catch:{ Exception -> 0x004d }
            r0 = 0
            if (r5 == 0) goto L_0x0032
            q1.e0 r1 = q1.C0339e0.b     // Catch:{ Exception -> 0x004d }
            android.os.Bundle r2 = r7.getExtras()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = "mundo_base_bundle"
            android.os.Parcelable r7 = r7.getParcelableExtra(r0)     // Catch:{ Exception -> 0x004d }
            android.content.Intent r7 = (android.content.Intent) r7     // Catch:{ Exception -> 0x004d }
            if (r7 == 0) goto L_0x0025
            r0 = -1
            r4.fillIn(r7, r0)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            java.lang.String r7 = "mundo_am_service"
            android.os.IBinder r0 = r2.getBinder(r7)     // Catch:{ Exception -> 0x004d }
        L_0x002b:
            r1.getClass()     // Catch:{ Exception -> 0x004d }
            android.content.Intent r0 = q1.C0339e0.X0(r4, r5, r0, r6)     // Catch:{ Exception -> 0x004d }
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r4 = r0
        L_0x0036:
            int r5 = r4.getFlags()     // Catch:{ Exception -> 0x004d }
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r5 = q1.H.q(r5, r6)     // Catch:{ Exception -> 0x004d }
            if (r5 != 0) goto L_0x0047
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r4.addFlags(r5)     // Catch:{ Exception -> 0x004d }
        L_0x0047:
            r3.startActivity(r4)     // Catch:{ Exception -> 0x004d }
            r3.finish()     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.bienvenido.mundo.manifest.MundoIntermediary.a(android.content.Intent, java.lang.String, android.content.pm.ActivityInfo, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            d5.f4080a.execute(new g(this, 5, intent));
        }
    }

    public final void onPause() {
        super.onPause();
        finish();
    }
}

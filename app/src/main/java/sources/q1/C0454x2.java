package q1;

import G.f;
import T0.l;
import android.app.NotificationManager;
import b1.i;
import java.io.File;

/* renamed from: q1.x2  reason: case insensitive filesystem */
public final /* synthetic */ class C0454x2 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f4235g;

    public /* synthetic */ C0454x2(int i2, String str) {
        this.f = i2;
        this.f4235g = str;
    }

    public final void run() {
        String str = this.f4235g;
        switch (this.f) {
            case 0:
                H.r(0, str);
                return;
            case 1:
                try {
                    U3.a(str, (String) null);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                if (!K2.b.T0(str)) {
                    K2.Z0(str);
                    return;
                }
                return;
            default:
                C0351g0 g0Var = C0367i4.f4118a;
                try {
                    if (T4.f4000e) {
                        NotificationManager notificationManager = (NotificationManager) C0394n1.f4143a.getSystemService(NotificationManager.class);
                        String e2 = C0367i4.e(str);
                        for (Object b : notificationManager.getNotificationChannels()) {
                            String j2 = f.b(b).getId();
                            if (i.j0(j2, e2)) {
                                try {
                                    notificationManager.deleteNotificationChannel(j2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
                l lVar = S1.f3986a;
                File file = E0.f3872a;
                S1.a(new File(E0.f3872a, str));
                return;
        }
    }
}

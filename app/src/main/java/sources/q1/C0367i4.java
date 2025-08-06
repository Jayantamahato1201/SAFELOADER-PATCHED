package q1;

import A.g;
import U0.i;
import android.app.Notification;
import android.graphics.drawable.Icon;
import android.provider.Settings;

/* renamed from: q1.i4  reason: case insensitive filesystem */
public abstract class C0367i4 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0351g0 f4118a = new C0351g0("mId");
    public static final C0351g0 b = new C0351g0("mType");

    /* renamed from: c  reason: collision with root package name */
    public static final C0351g0 f4119c = new C0351g0("mObj1");

    /* renamed from: d  reason: collision with root package name */
    public static final C0351g0 f4120d = new C0351g0("mString1");

    /* renamed from: e  reason: collision with root package name */
    public static final C0351g0 f4121e = new C0351g0("mInt1");
    public static final C0351g0 f = new C0351g0("mChannelId");

    public static String a(String str, String str2) {
        if (i.a(str2, "default_channel")) {
            return str2;
        }
        return g.h(e(str), str2);
    }

    public static void b(Notification notification, String str) {
        String str2;
        try {
            if (T4.f4000e) {
                String i2 = notification.getChannelId();
                if (i2 != null) {
                    if (i2.length() != 0) {
                        str2 = a(str, i2);
                        ((C0) f.f4098c).c(notification, str2);
                    }
                }
                str2 = a(str, "default_channel");
                ((C0) f.f4098c).c(notification, str2);
            }
            if (H.f3900r) {
                if (T4.b) {
                    Icon b2 = notification.getSmallIcon();
                    if (b2 != null) {
                        d(b2);
                    }
                    Icon x2 = notification.getLargeIcon();
                    if (x2 != null) {
                        d(x2);
                    }
                }
                notification.tickerView = null;
                notification.contentView = null;
                notification.bigContentView = null;
                notification.headsUpContentView = null;
            }
            notification.icon = 17629184;
            notification.flags &= -3;
            if (notification.sound != null) {
                notification.sound = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.app.NotificationChannel r3, java.lang.String r4) {
        /*
            boolean r0 = q1.T4.f4000e     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r3.getId()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = e(r4)     // Catch:{ Exception -> 0x0031 }
            boolean r0 = b1.i.j0(r0, r1)     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0031
            q1.g0 r0 = f4118a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r3.getId()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = e(r4)     // Catch:{ Exception -> 0x002a }
            boolean r2 = b1.i.j0(r1, r4)     // Catch:{ Exception -> 0x002a }
            if (r2 == 0) goto L_0x002a
            int r4 = r4.length()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.substring(r4)     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.lang.Object r4 = r0.f4098c     // Catch:{ Exception -> 0x0031 }
            q1.C0 r4 = (q1.C0) r4     // Catch:{ Exception -> 0x0031 }
            r4.c(r3, r1)     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0367i4.c(android.app.NotificationChannel, java.lang.String):void");
    }

    public static void d(Object obj) {
        try {
            ((C0) b.f4098c).c(obj, 2);
            C0351g0 g0Var = f4119c;
            ((C0) g0Var.f4098c).c(obj, C0394n1.f4143a.getResources());
            C0351g0 g0Var2 = f4120d;
            ((C0) g0Var2.f4098c).c(obj, C0394n1.b);
            ((C0) f4121e.f4098c).c(obj, 17629184);
        } catch (Exception unused) {
        }
    }

    public static String e(String str) {
        return g.i("mundo@", str, "@");
    }
}

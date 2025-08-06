package q1;

import L0.d;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.android.internal.content.ReferrerIntent;
import java.util.List;

public final class I2 {

    /* renamed from: a  reason: collision with root package name */
    public static final I2 f3913a = new Object();
    public static final C0351g0 b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0351g0 f3914c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0351g0 f3915d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0351g0 f3916e;

    /* JADX WARNING: type inference failed for: r0v0, types: [q1.I2, java.lang.Object] */
    static {
        String str;
        C0351g0 g0Var;
        String str2;
        String str3;
        boolean z2 = T4.f;
        if (z2) {
            str = "mIntents";
        } else {
            str = "intents";
        }
        b = new C0351g0(str);
        if (z2) {
            g0Var = new C0351g0("mIntent");
        } else {
            g0Var = C0447w1.f4228e;
        }
        f3914c = g0Var;
        if (z2) {
            str2 = "mInfo";
        } else {
            str2 = "activityInfo";
        }
        f3915d = new C0351g0(str2);
        if (z2) {
            str3 = "mReferrer";
        } else {
            str3 = "referrer";
        }
        f3916e = new C0351g0(str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = q1.C0394n1.f4143a;
        r3.startService(new android.content.Intent(r3, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.ActivityInfo a(android.content.Intent r3) {
        /*
            r0 = 0
            boolean r1 = q1.H.f3895m     // Catch:{ Exception -> 0x0045 }
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            boolean r1 = q1.H.f3900r     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x002b
            q1.l1 r1 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x0045 }
            r1.getClass()     // Catch:{ Exception -> 0x0045 }
            android.os.IInterface r1 = r1.b()     // Catch:{ Exception -> 0x001b }
            q1.f0 r1 = (q1.C0345f0) r1     // Catch:{ Exception -> 0x001b }
            r2 = 0
            android.content.pm.ResolveInfo r3 = r1.D0(r3, r0, r2)     // Catch:{ Exception -> 0x001b }
            goto L_0x0037
        L_0x001b:
            android.content.Context r3 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0028 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0028 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x0028 }
            r3.startService(r1)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r3 = r0
            goto L_0x0037
        L_0x002b:
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0028 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x0028 }
            r2 = 512(0x200, float:7.175E-43)
            android.content.pm.ResolveInfo r3 = r1.resolveActivity(r3, r2)     // Catch:{ Exception -> 0x0028 }
        L_0x0037:
            if (r3 == 0) goto L_0x0045
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch:{ Exception -> 0x0045 }
            if (r3 == 0) goto L_0x0045
            q1.v4 r1 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x0045 }
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo     // Catch:{ Exception -> 0x0045 }
            q1.C0444v4.b(r1)     // Catch:{ Exception -> 0x0045 }
            return r3
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.I2.a(android.content.Intent):android.content.pm.ActivityInfo");
    }

    public static void b(Object obj) {
        try {
            d((List) ((C0) b.f4098c).a(obj));
        } catch (Throwable unused) {
        }
    }

    public static void c(Object obj, IBinder iBinder) {
        ActivityInfo activityInfo;
        try {
            C0351g0 g0Var = f3914c;
            Intent intent = (Intent) ((C0) g0Var.f4098c).a(obj);
            if (intent != null) {
                d a2 = H4.a(intent);
                if (a2 == null) {
                    intent.toString();
                    return;
                }
                Intent intent2 = (Intent) a2.f;
                C0413q2 q2Var = T1.f3992a;
                ComponentName component = intent2.getComponent();
                if (component != null) {
                    activityInfo = (ActivityInfo) T1.f3992a.a(component.getClassName().hashCode());
                } else {
                    activityInfo = null;
                }
                if (activityInfo != null || (activityInfo = a(intent2)) != null) {
                    ((C0) f3915d.f4098c).c(obj, activityInfo);
                    if (T4.f3997a) {
                        C0351g0 g0Var2 = f3916e;
                        ((C0) g0Var2.f4098c).c(obj, a2.f590h);
                    }
                    ((C0) g0Var.f4098c).c(obj, intent2);
                    IBinder iBinder2 = (IBinder) a2.f589g;
                    if (iBinder2 != null) {
                        d5.f4080a.execute(new C0327c0(iBinder, iBinder2, 1));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void d(List list) {
        ReferrerIntent referrerIntent;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReferrerIntent referrerIntent2 = (Intent) list.get(i2);
            d a2 = H4.a(referrerIntent2);
            if (a2 != null) {
                if (T4.f3997a) {
                    Intent intent = (Intent) a2.f;
                    String str = (String) a2.f590h;
                    if (str == null) {
                        str = referrerIntent2.mReferrer;
                    }
                    referrerIntent = new ReferrerIntent(intent, str);
                } else {
                    referrerIntent = (Intent) a2.f;
                }
                list.set(i2, referrerIntent);
            }
        }
    }
}

package q1;

import U0.i;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: q1.v4  reason: case insensitive filesystem */
public final class C0444v4 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0444v4 f4223a = new Object();
    public static final C0 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [q1.v4, java.lang.Object] */
    static {
        boolean z2 = T4.f3998c;
        C0 c02 = C0.f3864a;
        if (z2) {
            try {
                Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
            }
        }
        b = c02;
    }

    public static void a(ComponentInfo[] componentInfoArr, ApplicationInfo applicationInfo) {
        if (componentInfoArr != null) {
            for (ComponentInfo componentInfo : componentInfoArr) {
                componentInfo.applicationInfo = applicationInfo;
            }
        }
    }

    public static boolean b(ApplicationInfo applicationInfo) {
        try {
            if (!i.a(applicationInfo.packageName, H.f3896n)) {
                return false;
            }
            applicationInfo.uid = C0394n1.f4144c;
            applicationInfo.enabled = true;
            String str = H.f3899q;
            applicationInfo.dataDir = str;
            if (T4.f3998c) {
                applicationInfo.deviceProtectedDataDir = str;
                b.c(applicationInfo, str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

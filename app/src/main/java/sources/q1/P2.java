package q1;

import android.app.ActivityManager;
import android.app.ActivityManagerNative;
import android.util.Singleton;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class P2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Singleton f3957a;

    static {
        Singleton singleton;
        boolean z2 = T4.f4000e;
        C0 c02 = C0.f3864a;
        if (z2) {
            try {
                Field declaredField = ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                        singleton = (Singleton) c02.a((Object) null);
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
            }
            singleton = (Singleton) c02.a((Object) null);
        } else {
            try {
                Field declaredField2 = ActivityManagerNative.class.getDeclaredField("gDefault");
                declaredField2.setAccessible(true);
                if (!Modifier.isStatic(declaredField2.getModifiers())) {
                    if (!declaredField2.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField2));
                        singleton = (Singleton) c02.a((Object) null);
                    }
                }
                c02 = new C0351g0(declaredField2, 2);
            } catch (Exception unused2) {
            }
            singleton = (Singleton) c02.a((Object) null);
        }
        f3957a = singleton;
    }
}

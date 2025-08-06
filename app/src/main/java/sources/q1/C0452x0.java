package q1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: q1.x0  reason: case insensitive filesystem */
public abstract class C0452x0 {
    public static C0 a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                if (!declaredField.getType().isPrimitive()) {
                    return new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                }
            }
            return new C0351g0(declaredField, 2);
        } catch (Exception unused) {
            return C0.f3864a;
        }
    }

    public static C0 b(Class cls, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return new C0351g0(declaredMethod, 1);
        } catch (Exception unused) {
            return C0.f3864a;
        }
    }

    public static C0 c(String str, String str2) {
        try {
            return a(Class.forName(str), str2);
        } catch (Exception unused) {
            return C0.f3864a;
        }
    }
}

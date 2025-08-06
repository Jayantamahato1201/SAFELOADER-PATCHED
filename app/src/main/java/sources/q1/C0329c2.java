package q1;

import android.util.Singleton;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: q1.c2  reason: case insensitive filesystem */
public abstract class C0329c2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f4068a;

    static {
        C0 c02;
        try {
            Field declaredField = Singleton.class.getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                if (!declaredField.getType().isPrimitive()) {
                    c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    f4068a = c02;
                }
            }
            c02 = new C0351g0(declaredField, 2);
        } catch (Exception unused) {
            c02 = C0.f3864a;
        }
        f4068a = c02;
    }
}

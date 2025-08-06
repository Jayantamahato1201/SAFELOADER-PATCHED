package q1;

import T0.l;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class E {
    public static void a(Class cls, Parcelable.Creator creator, l lVar) {
        C0 c02;
        J j2 = new J(creator, lVar);
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                if (!declaredField.getType().isPrimitive()) {
                    c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    c02.c((Object) null, j2);
                }
            }
            c02 = new C0351g0(declaredField, 2);
        } catch (Exception unused) {
            c02 = C0.f3864a;
        }
        c02.c((Object) null, j2);
    }
}

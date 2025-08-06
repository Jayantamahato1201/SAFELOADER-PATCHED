package q1;

import java.lang.reflect.Method;
import sun.misc.Unsafe;

/* renamed from: q1.x3  reason: case insensitive filesystem */
public abstract class C0455x3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f4236a;

    static {
        Method declaredMethod = Unsafe.class.getDeclaredMethod("getUnsafe", H.f3886c);
        declaredMethod.setAccessible(true);
        f4236a = (Unsafe) declaredMethod.invoke((Object) null, H.f3887d);
    }
}

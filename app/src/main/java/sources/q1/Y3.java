package q1;

import L0.e;
import T0.l;
import java.lang.reflect.Method;

public final class Y3 implements l {
    public final C0 f;

    public Y3() {
        C0 c02 = C0.f3864a;
        try {
            Method declaredMethod = Class.forName("android.app.PropertyInvalidatedCache$CacheMap").getDeclaredMethod("clear", H.f3886c);
            declaredMethod.setAccessible(true);
            c02 = new C0351g0(declaredMethod, 1);
        } catch (Exception unused) {
        }
        this.f = c02;
    }

    public final Object e(Object obj) {
        this.f.b(obj, new Object[0]);
        return e.f591c;
    }
}

package q1;

import com.android.internal.infra.AndroidFuture;
import java.lang.reflect.Method;

public final class H1 extends L3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            AndroidFuture androidFuture = (AndroidFuture) L3.b(objArr, AndroidFuture.class);
            if (androidFuture != null) {
                androidFuture.complete("true");
            }
        } catch (Throwable unused) {
        }
        return C0458y0.f4247h.b;
    }
}

package q1;

import android.content.Intent;
import com.android.internal.infra.AndroidFuture;
import java.lang.reflect.Method;

public final class L1 extends L3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            AndroidFuture androidFuture = (AndroidFuture) L3.b(objArr, AndroidFuture.class);
            if (androidFuture != null) {
                androidFuture.complete(new Intent("android.intent.action.MAIN"));
            }
        } catch (Throwable unused) {
        }
        return C0458y0.f4247h.b;
    }
}

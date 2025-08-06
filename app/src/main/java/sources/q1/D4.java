package q1;

import android.content.Intent;
import java.lang.reflect.Method;

public final class D4 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        Intent intent;
        try {
            if (!(!H.f3895m || (intent = (Intent) L3.b(objArr, Intent.class)) == null || (intent.getPackage() == null && intent.getComponent() == null))) {
                d5.b.execute(new C0373j4(4, intent));
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

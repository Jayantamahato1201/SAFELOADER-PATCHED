package q1;

import U0.i;
import android.content.ComponentName;
import java.lang.reflect.Method;

/* renamed from: q1.f4  reason: case insensitive filesystem */
public final class C0349f4 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        String str;
        try {
            if (H.f3895m) {
                ComponentName componentName = (ComponentName) L3.b(objArr, ComponentName.class);
                if (componentName != null) {
                    str = componentName.getPackageName();
                } else {
                    str = null;
                }
                if (i.a(str, H.f3896n)) {
                    return null;
                }
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

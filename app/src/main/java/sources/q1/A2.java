package q1;

import android.content.res.ObbInfo;
import java.lang.reflect.Method;

public final class A2 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            ObbInfo obbInfo = (ObbInfo) L3.b(objArr, ObbInfo.class);
            if (obbInfo != null) {
                obbInfo.packageName = C0394n1.b;
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

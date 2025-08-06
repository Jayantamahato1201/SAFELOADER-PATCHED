package q1;

import T0.l;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;

public final class B3 extends L3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        List list;
        try {
            if (H.f3895m && (list = (List) F.f3877c.d(new A3(objArr, 0))) != null) {
                l lVar = C0459y1.f4250a;
                if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                    return C0459y1.a(list);
                }
                return list;
            }
        } catch (Exception unused) {
        }
        return method.invoke(obj, objArr);
    }
}

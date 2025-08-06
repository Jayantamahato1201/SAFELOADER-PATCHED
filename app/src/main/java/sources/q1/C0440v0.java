package q1;

import G.f;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q1.v0  reason: case insensitive filesystem */
public final class C0440v0 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        Object a2 = super.a(obj, method, objArr);
        try {
            if (H.f3895m) {
                List<Object> b = C0459y1.b(a2);
                if (b != null) {
                    C0351g0 g0Var = C0367i4.f4118a;
                    String str = H.f3896n;
                    new ArrayList();
                    try {
                        if (T4.f4000e) {
                            for (Object b2 : b) {
                                C0367i4.c(f.b(b2), str);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                        return C0459y1.a(b);
                    }
                    return b;
                }
            }
        } catch (Exception unused2) {
        }
        return a2;
    }
}

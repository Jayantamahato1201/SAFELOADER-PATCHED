package q1;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* renamed from: q1.o4  reason: case insensitive filesystem */
public final class C0403o4 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        Object obj2;
        try {
            if (H.f3895m && (obj2 = objArr[0]) != null && obj2.getClass().isArray()) {
                return new int[Array.getLength(obj2)];
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

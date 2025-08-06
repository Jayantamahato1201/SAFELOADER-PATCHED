package q1;

import java.lang.reflect.Method;

public class L3 {
    public static Object b(Object[] objArr, Class cls) {
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    public static void c(Object[] objArr, int i2) {
        try {
            Number number = objArr[i2];
            if (number instanceof Integer) {
                objArr[i2] = Integer.valueOf(number.intValue() | 512);
            } else if (number instanceof Long) {
                objArr[i2] = Long.valueOf(number.longValue() | 512);
            }
        } catch (Exception unused) {
        }
    }

    public Object a(Object obj, Method method, Object[] objArr) {
        return method.invoke(obj, objArr);
    }
}

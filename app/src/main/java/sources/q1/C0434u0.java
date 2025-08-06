package q1;

import android.os.WorkSource;
import java.lang.reflect.Method;

/* renamed from: q1.u0  reason: case insensitive filesystem */
public final class C0434u0 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        Class<WorkSource> cls = WorkSource.class;
        try {
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (cls.isInstance(objArr[i2])) {
                    objArr[i2] = null;
                    break;
                } else {
                    i2++;
                }
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

package q1;

import android.app.Notification;
import java.lang.reflect.Method;

/* renamed from: q1.l2  reason: case insensitive filesystem */
public final class C0383l2 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final C0383l2 f4137d = new C0376k1(3);

    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            if (H.f3895m) {
                Class<Notification> cls = Notification.class;
                int length = objArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (cls.isInstance(objArr[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    Notification clone = ((Notification) objArr[i2]).clone();
                    C0351g0 g0Var = C0367i4.f4118a;
                    C0367i4.b(clone, H.f3896n);
                    objArr[i2] = clone;
                }
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

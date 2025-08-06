package q1;

import i0.c;
import java.lang.reflect.Method;

public final class I4 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final C0351g0 f3917d = new C0351g0("mOpMode");

    public I4() {
        super(3);
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        Object a2 = super.a(obj, method, objArr);
        try {
            if (H.f3895m && c.c(a2)) {
                ((C0) this.f3917d.f4098c).c(a2, 0);
            }
        } catch (Exception unused) {
        }
        return a2;
    }
}

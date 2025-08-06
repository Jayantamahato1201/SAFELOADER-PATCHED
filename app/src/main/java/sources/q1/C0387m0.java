package q1;

import G.f;
import java.lang.reflect.Method;

/* renamed from: q1.m0  reason: case insensitive filesystem */
public final class C0387m0 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final int f4139d;

    public C0387m0() {
        super(3);
        int i2;
        if (T4.f4001g) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        this.f4139d = i2;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            if (!H.f3895m) {
                return super.a(obj, method, objArr);
            }
            int length = objArr.length;
            int i2 = this.f4139d;
            if (length > i2) {
                C0351g0 g0Var = C0367i4.f4118a;
                objArr[i2] = C0367i4.a(H.f3896n, String.valueOf(objArr[i2]));
            }
            Object a2 = super.a(obj, method, objArr);
            if (f.A(a2)) {
                C0351g0 g0Var2 = C0367i4.f4118a;
                C0367i4.c(f.b(a2), H.f3896n);
            }
            return a2;
        } catch (Exception unused) {
        }
    }
}

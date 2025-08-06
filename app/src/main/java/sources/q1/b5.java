package q1;

import android.location.GeocoderParams;
import java.lang.reflect.Method;

public final class b5 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final C0351g0 f4065d = new C0351g0("mPackageName");

    public b5() {
        super(3);
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            GeocoderParams geocoderParams = (GeocoderParams) L3.b(objArr, GeocoderParams.class);
            if (geocoderParams != null) {
                C0351g0 g0Var = this.f4065d;
                ((C0) g0Var.f4098c).c(geocoderParams, C0394n1.b);
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

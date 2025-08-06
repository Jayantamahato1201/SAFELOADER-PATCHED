package q1;

import com.android.internal.infra.AndroidFuture;
import java.lang.reflect.Method;

public final class C1 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final AndroidFuture f3865d = AndroidFuture.completedFuture((Object) null);

    public C1() {
        super(3);
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        if (AndroidFuture.class.isAssignableFrom(method.getReturnType())) {
            return this.f3865d;
        }
        return super.a(obj, method, objArr);
    }
}

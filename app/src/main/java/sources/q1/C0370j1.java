package q1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: q1.j1  reason: case insensitive filesystem */
public final /* synthetic */ class C0370j1 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L3 f4123a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0370j1(Object obj, L3 l3) {
        this.f4123a = l3;
        this.b = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = H.f3887d;
        }
        return this.f4123a.a(this.b, method, objArr);
    }
}

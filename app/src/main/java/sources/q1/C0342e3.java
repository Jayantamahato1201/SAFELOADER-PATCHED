package q1;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* renamed from: q1.e3  reason: case insensitive filesystem */
public final class C0342e3 extends C0376k1 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4089c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0342e3(int i2) {
        super(3);
        this.f4089c = i2;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        Object obj2 = null;
        switch (this.f4089c) {
            case 0:
                try {
                    return super.a(obj, method, objArr);
                } catch (Exception unused) {
                    Class<?> returnType = method.getReturnType();
                    if (returnType.isPrimitive()) {
                        C0413q2 q2Var = S3.f3989c;
                        if (!returnType.equals(Void.TYPE)) {
                            Object a2 = S3.f3989c.a(returnType.hashCode());
                            if (a2 == null) {
                                Class<?> componentType = returnType.getComponentType();
                                if (componentType != null) {
                                    obj2 = Array.newInstance(componentType, 0);
                                }
                            } else {
                                obj2 = a2;
                            }
                        }
                    }
                    return obj2;
                }
            default:
                Object obj3 = C0409p4.b;
                if (obj3 != null) {
                    return obj3;
                }
                Object a3 = super.a(obj, method, objArr);
                if (a3 == null) {
                    return null;
                }
                C0412q1 q1Var = new C0412q1(a3, C0458y0.b);
                C0376k1 k1Var = C0409p4.f4172a;
                C0413q2 q2Var2 = q1Var.f4174a;
                q2Var2.b(463520714, k1Var);
                q2Var2.b(1293072352, C0458y0.f4247h);
                q2Var2.b(-1666360360, H.f3891i);
                q2Var2.b(1770569149, H.f3892j);
                q2Var2.b(1349683719, C0376k1.b);
                q2Var2.b(-1111243300, C0352g1.f4099a);
                return q1Var.f4176d;
        }
    }
}

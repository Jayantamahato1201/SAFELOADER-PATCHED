package q1;

import java.lang.reflect.Method;

/* renamed from: q1.h0  reason: case insensitive filesystem */
public final class C0357h0 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4107a;
    public Object b;

    public /* synthetic */ C0357h0(int i2) {
        this.f4107a = i2;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        switch (this.f4107a) {
            case 0:
                return this.b;
            case 1:
                Object obj2 = this.b;
                if (obj2 != null) {
                    return obj2;
                }
                try {
                    Object invoke = method.invoke(obj, objArr);
                    if (invoke != null) {
                        C0412q1 q1Var = new C0412q1(invoke, C0458y0.f4242a);
                        q1Var.f4174a.b(-1850562866, Q3.f3974d);
                        Object obj3 = q1Var.f4176d;
                        this.b = obj3;
                        return obj3;
                    }
                } catch (Exception unused) {
                }
                return null;
            default:
                Object obj4 = this.b;
                if (obj4 != null) {
                    return obj4;
                }
                try {
                    Object invoke2 = method.invoke(obj, objArr);
                    if (invoke2 != null) {
                        C0412q1 q1Var2 = new C0412q1(invoke2, C0458y0.f4242a);
                        q1Var2.f4174a.b(774213295, C0458y0.f4246g);
                        Object obj5 = q1Var2.f4176d;
                        this.b = obj5;
                        return obj5;
                    }
                } catch (Exception unused2) {
                }
                return null;
        }
    }

    public C0357h0(Object obj) {
        this.f4107a = 0;
        this.b = obj;
    }
}

package q1;

import B0.e;
import android.content.AttributionSource;
import java.lang.reflect.Method;

/* renamed from: q1.l0  reason: case insensitive filesystem */
public final class C0381l0 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4132a = 1;
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L3 f4133c;

    public C0381l0(C0376k1 k1Var) {
        this.f4133c = k1Var;
        this.b = C0394n1.f4143a.getAttributionSource();
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        switch (this.f4132a) {
            case 0:
                try {
                    Class j2 = e.j();
                    AttributionSource attributionSource = (AttributionSource) this.b;
                    int length = objArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (j2.isInstance(objArr[i2])) {
                                objArr[i2] = attributionSource;
                            } else {
                                i2++;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return ((C0376k1) this.f4133c).a(obj, method, objArr);
            default:
                try {
                    Object remove = ((E4) this.b).remove(objArr[0]);
                    if (remove != null) {
                        objArr[0] = remove;
                    }
                } catch (Exception unused2) {
                }
                return this.f4133c.a(obj, method, objArr);
        }
    }

    public C0381l0(E4 e4, L3 l3) {
        this.b = e4;
        this.f4133c = l3;
    }
}

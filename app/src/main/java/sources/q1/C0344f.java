package q1;

import android.view.WindowManager;
import j1.D;
import java.lang.reflect.Method;

/* renamed from: q1.f  reason: case insensitive filesystem */
public final class C0344f extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final D f4091d;

    public C0344f() {
        super(3);
        D d2 = new D(0);
        d2.b = 5;
        d2.f3206a = new int[]{2002, 2003, 2006, 2007, 2010};
        this.f4091d = d2;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) L3.b(objArr, WindowManager.LayoutParams.class);
            if (layoutParams != null) {
                if (T4.f4000e) {
                    D d2 = this.f4091d;
                    if (H.a(d2.b, layoutParams.type, d2.f3206a) >= 0) {
                        layoutParams.type = 2038;
                    }
                }
                layoutParams.packageName = C0394n1.b;
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

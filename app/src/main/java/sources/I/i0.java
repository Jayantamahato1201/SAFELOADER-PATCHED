package I;

import A.d;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class i0 extends l0 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f435e = null;
    public static boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f436g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f437h = false;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f438c;

    /* renamed from: d  reason: collision with root package name */
    public d f439d;

    public i0() {
        this.f438c = i();
    }

    private static WindowInsets i() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f) {
            try {
                f435e = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        Field field = f435e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f437h) {
            try {
                f436g = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f437h = true;
        }
        Constructor constructor = f436g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    public t0 b() {
        a();
        t0 g2 = t0.g((View) null, this.f438c);
        d[] dVarArr = this.b;
        r0 r0Var = g2.f464a;
        r0Var.o(dVarArr);
        r0Var.q(this.f439d);
        return g2;
    }

    public void e(d dVar) {
        this.f439d = dVar;
    }

    public void g(d dVar) {
        WindowInsets windowInsets = this.f438c;
        if (windowInsets != null) {
            this.f438c = windowInsets.replaceSystemWindowInsets(dVar.f4a, dVar.b, dVar.f5c, dVar.f6d);
        }
    }

    public i0(t0 t0Var) {
        super(t0Var);
        this.f438c = t0Var.f();
    }
}

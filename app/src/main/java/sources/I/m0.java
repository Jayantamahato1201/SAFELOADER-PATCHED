package I;

import A.d;
import A.i;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class m0 extends r0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f446h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Method f447i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f448j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f449k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f450l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f451c;

    /* renamed from: d  reason: collision with root package name */
    public d[] f452d;

    /* renamed from: e  reason: collision with root package name */
    public d f453e = null;
    public t0 f;

    /* renamed from: g  reason: collision with root package name */
    public d f454g;

    public m0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var);
        this.f451c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private d r(int i2, boolean z2) {
        d dVar = d.f3e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                dVar = d.a(dVar, s(i3, z2));
            }
        }
        return dVar;
    }

    private d t() {
        t0 t0Var = this.f;
        if (t0Var != null) {
            return t0Var.f464a.h();
        }
        return d.f3e;
    }

    private d u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f446h) {
                v();
            }
            Method method = f447i;
            if (!(method == null || f448j == null || f449k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f449k.get(f450l.get(invoke));
                    if (rect != null) {
                        return d.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f447i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f448j = cls;
            f449k = cls.getDeclaredField("mVisibleInsets");
            f450l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f449k.setAccessible(true);
            f450l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f446h = true;
    }

    public void d(View view) {
        d u2 = u(view);
        if (u2 == null) {
            u2 = d.f3e;
        }
        w(u2);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f454g, ((m0) obj).f454g);
    }

    public d f(int i2) {
        return r(i2, false);
    }

    public final d j() {
        if (this.f453e == null) {
            WindowInsets windowInsets = this.f451c;
            this.f453e = d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f453e;
    }

    public t0 l(int i2, int i3, int i4, int i5) {
        l0 l0Var;
        t0 g2 = t0.g((View) null, this.f451c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            l0Var = new k0(g2);
        } else if (i6 >= 29) {
            l0Var = new j0(g2);
        } else {
            l0Var = new i0(g2);
        }
        l0Var.g(t0.e(j(), i2, i3, i4, i5));
        l0Var.e(t0.e(h(), i2, i3, i4, i5));
        return l0Var.b();
    }

    public boolean n() {
        return this.f451c.isRound();
    }

    public void o(d[] dVarArr) {
        this.f452d = dVarArr;
    }

    public void p(t0 t0Var) {
        this.f = t0Var;
    }

    public d s(int i2, boolean z2) {
        int i3;
        C0017i iVar;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 != 1) {
            d dVar = null;
            if (i2 != 2) {
                d dVar2 = d.f3e;
                if (i2 == 8) {
                    d[] dVarArr = this.f452d;
                    if (dVarArr != null) {
                        dVar = dVarArr[i.V(8)];
                    }
                    if (dVar != null) {
                        return dVar;
                    }
                    d j2 = j();
                    d t2 = t();
                    int i8 = j2.f6d;
                    if (i8 > t2.f6d) {
                        return d.b(0, 0, 0, i8);
                    }
                    d dVar3 = this.f454g;
                    if (dVar3 == null || dVar3.equals(dVar2) || (i3 = this.f454g.f6d) <= t2.f6d) {
                        return dVar2;
                    }
                    return d.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return i();
                } else {
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 != 128) {
                        return dVar2;
                    }
                    t0 t0Var = this.f;
                    if (t0Var != null) {
                        iVar = t0Var.f464a.e();
                    } else {
                        iVar = e();
                    }
                    if (iVar == null) {
                        return dVar2;
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        i4 = C0016h.d(iVar.f434a);
                    } else {
                        i4 = 0;
                    }
                    if (i9 >= 28) {
                        i5 = C0016h.f(iVar.f434a);
                    } else {
                        i5 = 0;
                    }
                    if (i9 >= 28) {
                        i6 = C0016h.e(iVar.f434a);
                    } else {
                        i6 = 0;
                    }
                    if (i9 >= 28) {
                        i7 = C0016h.c(iVar.f434a);
                    }
                    return d.b(i4, i5, i6, i7);
                }
            } else if (z2) {
                d t3 = t();
                d h2 = h();
                return d.b(Math.max(t3.f4a, h2.f4a), 0, Math.max(t3.f5c, h2.f5c), Math.max(t3.f6d, h2.f6d));
            } else {
                d j3 = j();
                t0 t0Var2 = this.f;
                if (t0Var2 != null) {
                    dVar = t0Var2.f464a.h();
                }
                int i10 = j3.f6d;
                if (dVar != null) {
                    i10 = Math.min(i10, dVar.f6d);
                }
                return d.b(j3.f4a, 0, j3.f5c, i10);
            }
        } else if (z2) {
            return d.b(0, Math.max(t().b, j().b), 0, 0);
        } else {
            return d.b(0, j().b, 0, 0);
        }
    }

    public void w(d dVar) {
        this.f454g = dVar;
    }
}

package I;

import A.d;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.cheatbox.R;

public abstract class D {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Bin);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static t0 b(View view, t0 t0Var, Rect rect) {
        WindowInsets f = t0Var.f();
        if (f != null) {
            return t0.g(view, view.computeSystemWindowInsets(f, rect));
        }
        rect.setEmpty();
        return t0Var;
    }

    public static boolean c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    public static boolean d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static t0 j(View view) {
        l0 l0Var;
        if (!h0.f433d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = h0.f431a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) h0.b.get(obj);
            Rect rect2 = (Rect) h0.f432c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                l0Var = new k0();
            } else if (i2 >= 29) {
                l0Var = new j0();
            } else {
                l0Var = new i0();
            }
            l0Var.e(d.b(rect.left, rect.top, rect.right, rect.bottom));
            l0Var.g(d.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            t0 b = l0Var.b();
            b.f464a.p(b);
            b.f464a.d(view.getRootView());
            return b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    public static void u(View view, C0024p pVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.MT_Bin, pVar);
        }
        if (pVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Bin));
        } else {
            view.setOnApplyWindowInsetsListener(new C(view, pVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}

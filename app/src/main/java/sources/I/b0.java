package I;

import F.c;
import W.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.cheatbox.R;
import java.util.List;

public final class b0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f410e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final a f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f411g = new DecelerateInterpolator();

    public static void e(View view) {
        C0012d j2 = j(view);
        if (j2 != null) {
            ((View) j2.f415e).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z2) {
        C0012d j2 = j(view);
        if (j2 != null) {
            j2.b = windowInsets;
            if (!z2) {
                int[] iArr = (int[]) j2.f;
                ((View) j2.f415e).getLocationOnScreen(iArr);
                z2 = true;
                j2.f413c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), windowInsets, z2);
            }
        }
    }

    public static void g(View view, t0 t0Var, List list) {
        C0012d j2 = j(view);
        if (j2 != null) {
            j2.a(t0Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), t0Var, list);
            }
        }
    }

    public static void h(View view, c cVar) {
        C0012d j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f415e;
            int[] iArr = (int[]) j2.f;
            view2.getLocationOnScreen(iArr);
            int i2 = j2.f413c - iArr[1];
            j2.f414d = i2;
            view2.setTranslationY((float) i2);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), cVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.MT_Bin) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static C0012d j(View view) {
        Object tag = view.getTag(R.id.MT_Bin);
        if (tag instanceof a0) {
            return ((a0) tag).f407a;
        }
        return null;
    }
}

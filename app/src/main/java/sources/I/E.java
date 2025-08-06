package I;

import android.view.View;
import android.view.WindowInsets;

public abstract class E {
    public static t0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        t0 g2 = t0.g((View) null, rootWindowInsets);
        r0 r0Var = g2.f464a;
        r0Var.p(g2);
        r0Var.d(view.getRootView());
        return g2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}

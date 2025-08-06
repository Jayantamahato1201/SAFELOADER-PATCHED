package I;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class C implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public t0 f387a = null;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0024p f388c;

    public C(View view, C0024p pVar) {
        this.b = view;
        this.f388c = pVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 g2 = t0.g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        C0024p pVar = this.f388c;
        if (i2 < 30) {
            D.a(windowInsets, this.b);
            if (g2.equals(this.f387a)) {
                return pVar.c(view, g2).f();
            }
        }
        this.f387a = g2;
        t0 c2 = pVar.c(view, g2);
        if (i2 >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = O.f393a;
        B.c(view);
        return c2.f();
    }
}

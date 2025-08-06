package I;

import A.d;
import android.view.View;
import android.view.WindowInsets;

public class n0 extends m0 {

    /* renamed from: m  reason: collision with root package name */
    public d f455m = null;

    public n0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    public t0 b() {
        return t0.g((View) null, this.f451c.consumeStableInsets());
    }

    public t0 c() {
        return t0.g((View) null, this.f451c.consumeSystemWindowInsets());
    }

    public final d h() {
        if (this.f455m == null) {
            WindowInsets windowInsets = this.f451c;
            this.f455m = d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f455m;
    }

    public boolean m() {
        return this.f451c.isConsumed();
    }

    public void q(d dVar) {
        this.f455m = dVar;
    }
}

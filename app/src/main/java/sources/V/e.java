package v;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f4742a;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f4742a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.f4742a.p(0);
        return true;
    }
}

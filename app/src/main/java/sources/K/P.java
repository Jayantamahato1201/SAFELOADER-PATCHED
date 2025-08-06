package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import j.C0200d;

public final class P implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0200d f3398a;
    public final /* synthetic */ Q b;

    public P(Q q2, C0200d dVar) {
        this.b = q2;
        this.f3398a = dVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.f3402H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3398a);
        }
    }
}

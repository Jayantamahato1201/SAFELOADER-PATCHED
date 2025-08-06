package k;

import android.os.Handler;
import android.widget.AbsListView;

public final class J0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L0 f3365a;

    public J0(L0 l02) {
        this.f3365a = l02;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            L0 l02 = this.f3365a;
            if (l02.f3393z.getInputMethodMode() != 2 && l02.f3393z.getContentView() != null) {
                Handler handler = l02.f3389v;
                I0 i02 = l02.f3385r;
                handler.removeCallbacks(i02);
                i02.run();
            }
        }
    }

    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}

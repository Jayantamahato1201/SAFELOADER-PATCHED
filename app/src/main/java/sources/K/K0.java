package k;

import android.view.MotionEvent;
import android.view.View;

public final class K0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L0 f3366a;

    public K0(L0 l02) {
        this.f3366a = l02;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        B b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        L0 l02 = this.f3366a;
        if (action == 0 && (b = l02.f3393z) != null && b.isShowing() && x2 >= 0 && x2 < l02.f3393z.getWidth() && y2 >= 0 && y2 < l02.f3393z.getHeight()) {
            l02.f3389v.postDelayed(l02.f3385r, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            l02.f3389v.removeCallbacks(l02.f3385r);
            return false;
        }
    }
}

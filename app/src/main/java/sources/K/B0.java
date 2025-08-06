package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class B0 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0 f3325g;

    public /* synthetic */ B0(C0 c02, int i2) {
        this.f = i2;
        this.f3325g = c02;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                ViewParent parent = this.f3325g.f3329d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                C0 c02 = this.f3325g;
                c02.a();
                View view = c02.f3329d;
                if (view.isEnabled() && !view.isLongClickable() && c02.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    c02.f3331g = true;
                    return;
                }
                return;
        }
    }
}

package e;

import Q0.l;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import i.C0179d;

public final class v extends ContentFrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x f2541i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(x xVar, C0179d dVar) {
        super(dVar, (AttributeSet) null);
        this.f2541i = xVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f2541i.u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                x xVar = this.f2541i;
                xVar.s(xVar.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(l.v(getContext(), i2));
    }
}

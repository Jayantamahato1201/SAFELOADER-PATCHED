package H0;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class j implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f297a;

    public /* synthetic */ j(n nVar) {
        this.f297a = nVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        n nVar = this.f297a;
        nVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - nVar.f310o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                nVar.f308m = false;
            }
            nVar.u();
            nVar.f308m = true;
            nVar.f310o = System.currentTimeMillis();
        }
        return false;
    }
}

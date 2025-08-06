package F0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import q1.H;
import q1.Q2;
import q1.W2;
import z.C0503b;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f222g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f223h;

    public /* synthetic */ c(int i2, Q2 q2) {
        this.f = 1;
        this.f222g = i2;
        this.f223h = q2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f223h;
                View view = (View) sideSheetBehavior.f2070p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f222g, false);
                    return;
                }
                return;
            case 1:
                H.j(this.f222g, true, new W2((Q2) this.f223h));
                return;
            default:
                ((C0503b) this.f223h).h(this.f222g);
                return;
        }
    }

    public /* synthetic */ c(Object obj, int i2, int i3) {
        this.f = i3;
        this.f223h = obj;
        this.f222g = i2;
    }
}

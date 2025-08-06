package k;

import androidx.appcompat.widget.Toolbar;
import j.C0211o;

public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Toolbar f3545g;

    public /* synthetic */ o1(Toolbar toolbar, int i2) {
        this.f = i2;
        this.f3545g = toolbar;
    }

    public final void run() {
        C0211o oVar;
        switch (this.f) {
            case 0:
                r1 r1Var = this.f3545g.f1035L;
                if (r1Var == null) {
                    oVar = null;
                } else {
                    oVar = r1Var.b;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f3545g.n();
                return;
        }
    }
}

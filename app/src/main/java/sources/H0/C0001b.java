package H0;

import android.view.View;

/* renamed from: H0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0001b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f281a;
    public final /* synthetic */ t b;

    public /* synthetic */ C0001b(t tVar, int i2) {
        this.f281a = i2;
        this.b = tVar;
    }

    public final void onFocusChange(View view, boolean z2) {
        switch (this.f281a) {
            case 0:
                C0004e eVar = (C0004e) this.b;
                eVar.t(eVar.u());
                return;
            default:
                n nVar = (n) this.b;
                nVar.f307l = z2;
                nVar.q();
                if (!z2) {
                    nVar.t(false);
                    nVar.f308m = false;
                    return;
                }
                return;
        }
    }
}

package e;

import android.view.View;

/* renamed from: e.a  reason: case insensitive filesystem */
public final class C0130a implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f2473g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ View f2474h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0135f f2475i;

    public /* synthetic */ C0130a(C0135f fVar, View view, View view2, int i2) {
        this.f = i2;
        this.f2475i = fVar;
        this.f2473g = view;
        this.f2474h = view2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                C0135f.a(this.f2475i.f2498l, this.f2473g, this.f2474h);
                return;
            default:
                C0135f.a(this.f2475i.f, this.f2473g, this.f2474h);
                return;
        }
    }
}

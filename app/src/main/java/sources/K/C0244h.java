package k;

import android.view.View;
import j.C0207k;
import j.C0209m;

/* renamed from: k.h  reason: case insensitive filesystem */
public final class C0244h implements Runnable {
    public final C0240f f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0248j f3463g;

    public C0244h(C0248j jVar, C0240f fVar) {
        this.f3463g = jVar;
        this.f = fVar;
    }

    public final void run() {
        C0207k kVar;
        C0248j jVar = this.f3463g;
        C0209m mVar = jVar.f3476c;
        if (!(mVar == null || (kVar = mVar.f3107e) == null)) {
            kVar.e(mVar);
        }
        View view = (View) jVar.f3480h;
        if (!(view == null || view.getWindowToken() == null)) {
            C0240f fVar = this.f;
            if (!fVar.b()) {
                if (fVar.f3167e != null) {
                    fVar.d(0, 0, false, false);
                }
            }
            jVar.f3491s = fVar;
        }
        jVar.f3493u = null;
    }
}

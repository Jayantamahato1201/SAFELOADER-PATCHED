package androidx.activity;

import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import e.C0137h;

class ComponentActivity$3 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0137h f828a;

    public ComponentActivity$3(C0137h hVar) {
        this.f828a = hVar;
    }

    public final void b(r rVar, C0070l lVar) {
        if (lVar == C0070l.ON_DESTROY) {
            this.f828a.b.b = null;
            if (!this.f828a.isChangingConfigurations()) {
                this.f828a.d().a();
            }
            j jVar = this.f828a.f857h;
            C0137h hVar = jVar.f852i;
            hVar.getWindow().getDecorView().removeCallbacks(jVar);
            hVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
        }
    }
}

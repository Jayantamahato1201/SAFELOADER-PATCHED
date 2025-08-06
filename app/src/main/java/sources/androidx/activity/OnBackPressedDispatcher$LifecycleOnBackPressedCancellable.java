package androidx.activity;

import U0.i;
import androidx.fragment.app.w;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements p, c {

    /* renamed from: a  reason: collision with root package name */
    public final t f835a;
    public final w b;

    /* renamed from: c  reason: collision with root package name */
    public s f836c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u f837d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(u uVar, t tVar, w wVar) {
        i.e("onBackPressedCallback", wVar);
        this.f837d = uVar;
        this.f835a = tVar;
        this.b = wVar;
        tVar.a(this);
    }

    public final void b(r rVar, C0070l lVar) {
        if (lVar == C0070l.ON_START) {
            u uVar = this.f837d;
            uVar.getClass();
            w wVar = this.b;
            i.e("onBackPressedCallback", wVar);
            uVar.b.addLast(wVar);
            s sVar = new s(uVar, wVar);
            wVar.b.add(sVar);
            uVar.d();
            wVar.f1397c = new t(0, uVar, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f836c = sVar;
        } else if (lVar == C0070l.ON_STOP) {
            s sVar2 = this.f836c;
            if (sVar2 != null) {
                sVar2.cancel();
            }
        } else if (lVar == C0070l.ON_DESTROY) {
            cancel();
        }
    }

    public final void cancel() {
        this.f835a.f(this);
        this.b.b.remove(this);
        s sVar = this.f836c;
        if (sVar != null) {
            sVar.cancel();
        }
        this.f836c = null;
    }
}

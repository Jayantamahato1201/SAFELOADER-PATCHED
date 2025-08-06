package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class Fragment$5 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0058o f1235a;

    public Fragment$5(C0058o oVar) {
        this.f1235a = oVar;
    }

    public final void b(r rVar, C0070l lVar) {
        View view;
        if (lVar == C0070l.ON_STOP && (view = this.f1235a.f1346E) != null) {
            view.cancelPendingInputEvents();
        }
    }
}

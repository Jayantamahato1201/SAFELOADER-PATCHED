package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import e.C0137h;

class ComponentActivity$2 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0137h f827a;

    public ComponentActivity$2(C0137h hVar) {
        this.f827a = hVar;
    }

    public final void b(r rVar, C0070l lVar) {
        View view;
        if (lVar == C0070l.ON_STOP) {
            Window window = this.f827a.getWindow();
            if (window != null) {
                view = window.peekDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.cancelPendingInputEvents();
            }
        }
    }
}

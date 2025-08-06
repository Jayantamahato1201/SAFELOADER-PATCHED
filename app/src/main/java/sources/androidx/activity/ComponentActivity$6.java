package androidx.activity;

import U0.i;
import android.os.Build;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class ComponentActivity$6 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f830a;

    public ComponentActivity$6(k kVar) {
        this.f830a = kVar;
    }

    public final void b(r rVar, C0070l lVar) {
        if (lVar == C0070l.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
            u uVar = this.f830a.f856g;
            OnBackInvokedDispatcher a2 = h.a((k) rVar);
            uVar.getClass();
            i.e("invoker", a2);
            uVar.f882e = a2;
            uVar.c(uVar.f883g);
        }
    }
}

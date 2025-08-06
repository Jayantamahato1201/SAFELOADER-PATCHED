package androidx.activity;

import androidx.lifecycle.C0070l;
import androidx.lifecycle.K;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import e.C0137h;

class ComponentActivity$4 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0137h f829a;

    public ComponentActivity$4(C0137h hVar) {
        this.f829a = hVar;
    }

    public final void b(r rVar, C0070l lVar) {
        C0137h hVar = this.f829a;
        if (hVar.f == null) {
            i iVar = (i) hVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                hVar.f = iVar.f849a;
            }
            if (hVar.f == null) {
                hVar.f = new K();
            }
        }
        hVar.f854d.f(this);
    }
}

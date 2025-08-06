package c0;

import U0.i;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

/* renamed from: c0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0103a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0106d f1809a;

    public /* synthetic */ C0103a(C0106d dVar) {
        this.f1809a = dVar;
    }

    public final void b(r rVar, C0070l lVar) {
        C0106d dVar = this.f1809a;
        i.e("this$0", dVar);
        if (lVar == C0070l.ON_START) {
            dVar.f1811c = true;
        } else if (lVar == C0070l.ON_STOP) {
            dVar.f1811c = false;
        }
    }
}

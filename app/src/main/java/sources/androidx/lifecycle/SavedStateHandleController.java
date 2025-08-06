package androidx.lifecycle;

public final class SavedStateHandleController implements p {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1424a;

    public final void b(r rVar, C0070l lVar) {
        if (lVar == C0070l.ON_DESTROY) {
            this.f1424a = false;
            rVar.e().f(this);
        }
    }
}

package androidx.lifecycle;

public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: a  reason: collision with root package name */
    public final C0062d f1411a;
    public final p b;

    public DefaultLifecycleObserverAdapter(C0062d dVar, p pVar) {
        this.f1411a = dVar;
        this.b = pVar;
    }

    public final void b(r rVar, C0070l lVar) {
        int i2 = C0063e.f1429a[lVar.ordinal()];
        C0062d dVar = this.f1411a;
        if (i2 == 3) {
            dVar.a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.b;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}

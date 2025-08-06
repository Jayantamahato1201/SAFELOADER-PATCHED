package androidx.lifecycle;

import U0.i;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public m f1437a;
    public p b;

    public final void a(r rVar, C0070l lVar) {
        m a2 = lVar.a();
        m mVar = this.f1437a;
        i.e("state1", mVar);
        if (a2.compareTo(mVar) < 0) {
            mVar = a2;
        }
        this.f1437a = mVar;
        this.b.b(rVar, lVar);
        this.f1437a = a2;
    }
}

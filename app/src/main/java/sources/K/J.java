package k;

import j.C0194D;

public final class J extends C0 {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Q f3363j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ U f3364k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(U u2, U u3, Q q2) {
        super(u3);
        this.f3364k = u2;
        this.f3363j = q2;
    }

    public final C0194D b() {
        return this.f3363j;
    }

    public final boolean c() {
        U u2 = this.f3364k;
        if (u2.getInternalPopup().b()) {
            return true;
        }
        u2.f.e(L.b(u2), L.a(u2));
        return true;
    }
}

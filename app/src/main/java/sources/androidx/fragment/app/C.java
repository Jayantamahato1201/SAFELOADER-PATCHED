package androidx.fragment.app;

import java.util.ArrayList;

public final class C implements B {

    /* renamed from: a  reason: collision with root package name */
    public final int f1192a;
    public final /* synthetic */ D b;

    public C(D d2, int i2) {
        this.b = d2;
        this.f1192a = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        D d2 = this.b;
        C0058o oVar = d2.f1213q;
        int i2 = this.f1192a;
        if (oVar == null || i2 >= 0 || !oVar.g().J()) {
            return d2.K(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}

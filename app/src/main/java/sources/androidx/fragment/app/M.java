package androidx.fragment.app;

import A.g;
import java.util.ArrayList;

public final class M implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ N f1264g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0051h f1265h;

    public /* synthetic */ M(C0051h hVar, N n2, int i2) {
        this.f = i2;
        this.f1265h = hVar;
        this.f1264g = n2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.f1265h.b;
                N n2 = this.f1264g;
                if (arrayList.contains(n2)) {
                    g.a(n2.f1267c.f1346E, n2.f1266a);
                    return;
                }
                return;
            default:
                C0051h hVar = this.f1265h;
                ArrayList arrayList2 = hVar.b;
                N n3 = this.f1264g;
                arrayList2.remove(n3);
                hVar.f1312c.remove(n3);
                return;
        }
    }
}

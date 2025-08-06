package androidx.fragment.app;

import A.j;
import a.C0042b;
import android.os.Bundle;
import c0.C0106d;
import e.C0137h;
import e.C0141l;

public final class q implements C0042b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1383a;
    public final /* synthetic */ C0137h b;

    public /* synthetic */ q(C0137h hVar, int i2) {
        this.f1383a = i2;
        this.b = hVar;
    }

    public final void a() {
        switch (this.f1383a) {
            case 0:
                C0137h hVar = this.b;
                j jVar = hVar.f2517p;
                r rVar = (r) jVar.b;
                rVar.f1387o.b(rVar, rVar, (C0058o) null);
                Bundle c2 = ((C0106d) hVar.f855e.f866c).c("android:support:fragments");
                if (c2 != null) {
                    ((r) jVar.b).f1387o.N(c2.getParcelable("android:support:fragments"));
                    return;
                }
                return;
            default:
                C0137h hVar2 = this.b;
                C0141l i2 = hVar2.i();
                i2.a();
                ((C0106d) hVar2.f855e.f866c).c("androidx:appcompat");
                i2.d();
                return;
        }
    }
}

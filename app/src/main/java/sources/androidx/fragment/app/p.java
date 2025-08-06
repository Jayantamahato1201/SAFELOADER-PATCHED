package androidx.fragment.app;

import A.j;
import U0.i;
import android.os.Bundle;
import androidx.lifecycle.C0070l;
import c0.C0105c;
import c0.C0106d;
import e.C0137h;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class p implements C0105c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1382a;
    public final Object b;

    public /* synthetic */ p(C0137h hVar, int i2) {
        this.f1382a = i2;
        this.b = hVar;
    }

    public final Bundle a() {
        j jVar;
        switch (this.f1382a) {
            case 0:
                Bundle bundle = new Bundle();
                C0137h hVar = (C0137h) this.b;
                do {
                    jVar = hVar.f2517p;
                } while (C0137h.k(((r) jVar.b).f1387o));
                hVar.f2518q.d(C0070l.ON_STOP);
                E O2 = ((r) jVar.b).f1387o.O();
                if (O2 != null) {
                    bundle.putParcelable("android:support:fragments", O2);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((C0137h) this.b).i().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.b));
                return bundle3;
        }
    }

    public p(C0106d dVar) {
        this.f1382a = 2;
        i.e("registry", dVar);
        this.b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }
}

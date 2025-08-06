package androidx.lifecycle;

import android.os.Bundle;

public final class SavedStateHandleAttacher implements p {

    /* renamed from: a  reason: collision with root package name */
    public final G f1423a;

    public SavedStateHandleAttacher(G g2) {
        this.f1423a = g2;
    }

    public final void b(r rVar, C0070l lVar) {
        if (lVar == C0070l.ON_CREATE) {
            rVar.e().f(this);
            G g2 = this.f1423a;
            if (!g2.b) {
                Bundle c2 = g2.f1415a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = g2.f1416c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c2 != null) {
                    bundle.putAll(c2);
                }
                g2.f1416c = bundle;
                g2.b = true;
                H h2 = (H) g2.f1417d.a();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
    }
}

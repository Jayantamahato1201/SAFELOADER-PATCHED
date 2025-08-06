package androidx.lifecycle;

import L0.c;
import U0.i;
import android.os.Bundle;
import androidx.activity.k;
import androidx.activity.n;
import c0.C0105c;
import c0.C0106d;
import java.util.Iterator;
import java.util.Map;

public final class G implements C0105c {

    /* renamed from: a  reason: collision with root package name */
    public final C0106d f1415a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1416c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1417d;

    public G(C0106d dVar, k kVar) {
        i.e("savedStateRegistry", dVar);
        this.f1415a = dVar;
        this.f1417d = new c(new n(3, kVar));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1416c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((H) this.f1417d.a()).f1418c.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}

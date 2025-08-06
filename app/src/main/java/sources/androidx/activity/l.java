package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import c0.C0103a;
import c0.C0105c;
import c0.C0106d;
import c0.e;
import java.util.ArrayList;
import java.util.Map;
import m.d;
import m.f;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f865a;
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f866c;

    public l(e eVar) {
        this.b = eVar;
        this.f866c = new C0106d();
    }

    public void a() {
        e eVar = (e) this.b;
        t e2 = eVar.e();
        if (e2.f1439c == m.f1431g) {
            e2.a(new Recreator(eVar));
            C0106d dVar = (C0106d) this.f866c;
            dVar.getClass();
            if (!dVar.f1810a) {
                e2.a(new C0103a(dVar));
                dVar.f1810a = true;
                this.f865a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f865a) {
            a();
        }
        t e2 = ((e) this.b).e();
        if (e2.f1439c.compareTo(m.f1433i) < 0) {
            C0106d dVar = (C0106d) this.f866c;
            if (!dVar.f1810a) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!dVar.b) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                dVar.f1813e = bundle2;
                dVar.b = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e2.f1439c).toString());
        }
    }

    public void c(Bundle bundle) {
        C0106d dVar = (C0106d) this.f866c;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f1813e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        f fVar = (f) dVar.f1812d;
        fVar.getClass();
        d dVar2 = new d(fVar);
        fVar.f3659h.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((C0105c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public l(j jVar, d dVar) {
        this.b = new Object();
        this.f866c = new ArrayList();
    }
}

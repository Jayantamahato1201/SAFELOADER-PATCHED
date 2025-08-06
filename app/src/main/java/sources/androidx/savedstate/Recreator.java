package androidx.savedstate;

import A.g;
import U0.i;
import android.os.Bundle;
import androidx.lifecycle.C0067i;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c0.C0104b;
import c0.C0106d;
import c0.e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class Recreator implements p {

    /* renamed from: a  reason: collision with root package name */
    public final e f1566a;

    public Recreator(e eVar) {
        this.f1566a = eVar;
    }

    public final void b(r rVar, C0070l lVar) {
        Object obj;
        boolean z2;
        if (lVar == C0070l.ON_CREATE) {
            rVar.e().f(this);
            Bundle c2 = this.f1566a.b().c("androidx.savedstate.Restarter");
            if (c2 != null) {
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    int size = stringArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = stringArrayList.get(i2);
                        i2++;
                        String str2 = str;
                        try {
                            Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(C0104b.class);
                            i.d("{\n                Class.…class.java)\n            }", asSubclass);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                                    i.d("{\n                constr…wInstance()\n            }", newInstance);
                                    C0104b bVar = (C0104b) newInstance;
                                    e eVar = this.f1566a;
                                    if (eVar instanceof L) {
                                        K d2 = ((L) eVar).d();
                                        C0106d b = eVar.b();
                                        d2.getClass();
                                        Iterator it = new HashSet(d2.f1421a.keySet()).iterator();
                                        while (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            i.e("key", str3);
                                            I i3 = (I) d2.f1421a.get(str3);
                                            i.b(i3);
                                            t e2 = eVar.e();
                                            i.e("registry", b);
                                            i.e("lifecycle", e2);
                                            HashMap hashMap = i3.f1419a;
                                            if (hashMap == null) {
                                                obj = null;
                                            } else {
                                                synchronized (hashMap) {
                                                    obj = i3.f1419a.get("androidx.lifecycle.savedstate.vm.tag");
                                                }
                                            }
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f1424a)) {
                                                if (z2) {
                                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                                }
                                                savedStateHandleController.f1424a = true;
                                                e2.a(savedStateHandleController);
                                                throw null;
                                            }
                                        }
                                        if (!new HashSet(d2.f1421a.keySet()).isEmpty()) {
                                            Class<C0067i> cls = C0067i.class;
                                            if (b.f1811c) {
                                                androidx.fragment.app.p pVar = (androidx.fragment.app.p) b.f;
                                                if (pVar == null) {
                                                    pVar = new androidx.fragment.app.p(b);
                                                }
                                                b.f = pVar;
                                                try {
                                                    cls.getDeclaredConstructor((Class[]) null);
                                                    androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) b.f;
                                                    if (pVar2 != null) {
                                                        ((LinkedHashSet) pVar2.b).add(cls.getName());
                                                    }
                                                } catch (NoSuchMethodException e3) {
                                                    throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                                                }
                                            } else {
                                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e4) {
                                    throw new RuntimeException("Failed to instantiate " + str2, e4);
                                }
                            } catch (NoSuchMethodException e5) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                            }
                        } catch (ClassNotFoundException e6) {
                            throw new RuntimeException(g.i("Class ", str2, " wasn't found"), e6);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

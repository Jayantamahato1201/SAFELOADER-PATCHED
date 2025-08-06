package androidx.activity;

import L0.e;
import M0.c;
import T0.a;
import U0.f;
import U0.i;
import U0.j;
import U0.m;
import X.b;
import X.d;
import androidx.fragment.app.w;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;

public final class n extends j implements a {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f868g;

    public /* synthetic */ n(int i2, Object obj) {
        this.f = i2;
        this.f868g = obj;
    }

    public final Object a() {
        Object obj;
        switch (this.f) {
            case 0:
                ((u) this.f868g).b();
                return e.f591c;
            case 1:
                u uVar = (u) this.f868g;
                c cVar = uVar.b;
                ListIterator listIterator = cVar.listIterator(cVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((w) obj).f1396a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                w wVar = (w) obj;
                uVar.f880c = null;
                return e.f591c;
            case 2:
                ((u) this.f868g).b();
                return e.f591c;
            default:
                k kVar = (k) this.f868g;
                ArrayList arrayList = new ArrayList();
                m.f774a.getClass();
                Class<H> cls = H.class;
                Class a2 = new f(cls).a();
                i.c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", a2);
                arrayList.add(new d(a2));
                d[] dVarArr = (d[]) arrayList.toArray(new d[0]);
                d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                i.e("initializers", dVarArr2);
                K d2 = kVar.d();
                b a3 = kVar.a();
                i.e("store", d2);
                i.e("defaultCreationExtras", a3);
                LinkedHashMap linkedHashMap = d2.f1421a;
                I i2 = (I) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (cls.isInstance(i2)) {
                    i.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", i2);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(a3.f781a);
                    linkedHashMap2.put(J.b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        i2 = null;
                        for (d dVar : dVarArr2) {
                            if (dVar.f782a.equals(cls)) {
                                i2 = new H();
                            }
                        }
                        if (i2 != null) {
                            I i3 = (I) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", i2);
                            if (i3 != null) {
                                i3.a();
                            }
                        } else {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (H) i2;
        }
    }
}

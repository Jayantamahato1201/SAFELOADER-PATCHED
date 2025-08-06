package androidx.lifecycle;

import A.g;
import U0.i;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l.C0284a;
import m.C0286a;
import m.b;
import m.c;
import m.d;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1438a = true;
    public C0286a b = new C0286a();

    /* renamed from: c  reason: collision with root package name */
    public m f1439c = m.f1431g;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f1440d;

    /* renamed from: e  reason: collision with root package name */
    public int f1441e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1442g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1443h = new ArrayList();

    public t(r rVar) {
        new AtomicReference();
        this.f1440d = new WeakReference(rVar);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.lifecycle.s, java.lang.Object] */
    public final void a(q qVar) {
        p pVar;
        Object obj;
        r rVar;
        C0070l lVar;
        ArrayList arrayList = this.f1443h;
        c("addObserver");
        m mVar = this.f1439c;
        m mVar2 = m.f;
        if (mVar != mVar2) {
            mVar2 = m.f1431g;
        }
        ? obj2 = new Object();
        HashMap hashMap = u.f1444a;
        boolean z2 = qVar instanceof p;
        boolean z3 = qVar instanceof C0062d;
        boolean z4 = false;
        if (z2 && z3) {
            pVar = new DefaultLifecycleObserverAdapter((C0062d) qVar, (p) qVar);
        } else if (z3) {
            pVar = new DefaultLifecycleObserverAdapter((C0062d) qVar, (p) null);
        } else if (z2) {
            pVar = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj3 = u.b.get(cls);
                i.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    C0065g[] gVarArr = new C0065g[size];
                    if (size <= 0) {
                        pVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                pVar = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        obj2.b = pVar;
        obj2.f1437a = mVar2;
        C0286a aVar = this.b;
        c a2 = aVar.a(qVar);
        if (a2 != null) {
            obj = a2.f3653g;
        } else {
            HashMap hashMap2 = aVar.f3650j;
            c cVar = new c(qVar, obj2);
            aVar.f3660i++;
            c cVar2 = aVar.f3658g;
            if (cVar2 == null) {
                aVar.f = cVar;
                aVar.f3658g = cVar;
            } else {
                cVar2.f3654h = cVar;
                cVar.f3655i = cVar2;
                aVar.f3658g = cVar;
            }
            hashMap2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.f1440d.get()) != null) {
            if (this.f1441e != 0 || this.f) {
                z4 = true;
            }
            m b2 = b(qVar);
            this.f1441e++;
            while (obj2.f1437a.compareTo(b2) < 0 && this.b.f3650j.containsKey(qVar)) {
                arrayList.add(obj2.f1437a);
                C0068j jVar = C0070l.Companion;
                m mVar3 = obj2.f1437a;
                jVar.getClass();
                i.e("state", mVar3);
                int ordinal = mVar3.ordinal();
                if (ordinal == 1) {
                    lVar = C0070l.ON_CREATE;
                } else if (ordinal == 2) {
                    lVar = C0070l.ON_START;
                } else if (ordinal != 3) {
                    lVar = null;
                } else {
                    lVar = C0070l.ON_RESUME;
                }
                if (lVar != null) {
                    obj2.a(rVar, lVar);
                    arrayList.remove(arrayList.size() - 1);
                    b2 = b(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj2.f1437a);
                }
            }
            if (!z4) {
                h();
            }
            this.f1441e--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.lifecycle.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.m b(androidx.lifecycle.q r4) {
        /*
            r3 = this;
            m.a r0 = r3.b
            java.util.HashMap r0 = r0.f3650j
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            m.c r4 = (m.c) r4
            m.c r4 = r4.f3655i
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.f3653g
            androidx.lifecycle.s r4 = (androidx.lifecycle.s) r4
            androidx.lifecycle.m r4 = r4.f1437a
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            java.util.ArrayList r0 = r3.f1443h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0034
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.m r2 = (androidx.lifecycle.m) r2
        L_0x0034:
            androidx.lifecycle.m r0 = r3.f1439c
            java.lang.String r1 = "state1"
            U0.i.e(r1, r0)
            if (r4 == 0) goto L_0x0044
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x004e
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x004e
            return r2
        L_0x004e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.b(androidx.lifecycle.q):androidx.lifecycle.m");
    }

    public final void c(String str) {
        if (this.f1438a) {
            C0284a.f0().f3632l.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(g.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(C0070l lVar) {
        i.e("event", lVar);
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f1439c;
        if (mVar2 != mVar) {
            m mVar3 = m.f1431g;
            m mVar4 = m.f;
            if (mVar2 == mVar3 && mVar == mVar4) {
                throw new IllegalStateException(("no event down from " + this.f1439c + " in component " + this.f1440d.get()).toString());
            }
            this.f1439c = mVar;
            if (this.f || this.f1441e != 0) {
                this.f1442g = true;
                return;
            }
            this.f = true;
            h();
            this.f = false;
            if (this.f1439c == mVar4) {
                this.b = new C0286a();
            }
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.b.b(qVar);
    }

    public final void g() {
        m mVar = m.f1432h;
        c("setCurrentState");
        e(mVar);
    }

    public final void h() {
        C0070l lVar;
        C0070l lVar2;
        r rVar = (r) this.f1440d.get();
        if (rVar != null) {
            while (true) {
                C0286a aVar = this.b;
                if (aVar.f3660i != 0) {
                    c cVar = aVar.f;
                    i.b(cVar);
                    m mVar = ((s) cVar.f3653g).f1437a;
                    c cVar2 = this.b.f3658g;
                    i.b(cVar2);
                    m mVar2 = ((s) cVar2.f3653g).f1437a;
                    if (mVar == mVar2 && this.f1439c == mVar2) {
                        break;
                    }
                    this.f1442g = false;
                    m mVar3 = this.f1439c;
                    c cVar3 = this.b.f;
                    i.b(cVar3);
                    if (mVar3.compareTo(((s) cVar3.f3653g).f1437a) < 0) {
                        C0286a aVar2 = this.b;
                        b bVar = new b(aVar2.f3658g, aVar2.f, 1);
                        aVar2.f3659h.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f1442g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            i.d("next()", entry);
                            q qVar = (q) entry.getKey();
                            s sVar = (s) entry.getValue();
                            while (sVar.f1437a.compareTo(this.f1439c) > 0 && !this.f1442g && this.b.f3650j.containsKey(qVar)) {
                                C0068j jVar = C0070l.Companion;
                                m mVar4 = sVar.f1437a;
                                jVar.getClass();
                                i.e("state", mVar4);
                                int ordinal = mVar4.ordinal();
                                if (ordinal == 2) {
                                    lVar2 = C0070l.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    lVar2 = C0070l.ON_STOP;
                                } else if (ordinal != 4) {
                                    lVar2 = null;
                                } else {
                                    lVar2 = C0070l.ON_PAUSE;
                                }
                                if (lVar2 != null) {
                                    this.f1443h.add(lVar2.a());
                                    sVar.a(rVar, lVar2);
                                    ArrayList arrayList = this.f1443h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + sVar.f1437a);
                                }
                            }
                        }
                    }
                    c cVar4 = this.b.f3658g;
                    if (!this.f1442g && cVar4 != null && this.f1439c.compareTo(((s) cVar4.f3653g).f1437a) > 0) {
                        C0286a aVar3 = this.b;
                        aVar3.getClass();
                        d dVar = new d(aVar3);
                        aVar3.f3659h.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f1442g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            q qVar2 = (q) entry2.getKey();
                            s sVar2 = (s) entry2.getValue();
                            while (sVar2.f1437a.compareTo(this.f1439c) < 0 && !this.f1442g && this.b.f3650j.containsKey(qVar2)) {
                                this.f1443h.add(sVar2.f1437a);
                                C0068j jVar2 = C0070l.Companion;
                                m mVar5 = sVar2.f1437a;
                                jVar2.getClass();
                                i.e("state", mVar5);
                                int ordinal2 = mVar5.ordinal();
                                if (ordinal2 == 1) {
                                    lVar = C0070l.ON_CREATE;
                                } else if (ordinal2 == 2) {
                                    lVar = C0070l.ON_START;
                                } else if (ordinal2 != 3) {
                                    lVar = null;
                                } else {
                                    lVar = C0070l.ON_RESUME;
                                }
                                if (lVar != null) {
                                    sVar2.a(rVar, lVar);
                                    ArrayList arrayList2 = this.f1443h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + sVar2.f1437a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.f1442g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}

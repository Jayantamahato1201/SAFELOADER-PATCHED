package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: a  reason: collision with root package name */
    public final q f1422a;
    public final C0059a b;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f1422a = qVar;
        C0061c cVar = C0061c.f1427c;
        Class<?> cls = qVar.getClass();
        C0059a aVar = (C0059a) cVar.f1428a.get(cls);
        this.b = aVar == null ? cVar.a(cls, (Method[]) null) : aVar;
    }

    public final void b(r rVar, C0070l lVar) {
        HashMap hashMap = this.b.f1425a;
        q qVar = this.f1422a;
        C0059a.a((List) hashMap.get(lVar), rVar, lVar, qVar);
        C0059a.a((List) hashMap.get(C0070l.ON_ANY), rVar, lVar, qVar);
    }
}

package androidx.emoji2.text;

import F.b;
import F.c;
import Q0.l;
import java.util.ArrayList;
import java.util.List;

public final class e extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ f f1150l;

    public e(f fVar) {
        this.f1150l = fVar;
    }

    public final void H(Throwable th) {
        this.f1150l.f1151a.d(th);
    }

    /* JADX INFO: finally extract failed */
    public final void K(r rVar) {
        f fVar = this.f1150l;
        fVar.f1152c = rVar;
        fVar.b = new c(fVar.f1152c, new E0.e(16), fVar.f1151a.f1162h);
        j jVar = fVar.f1151a;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f1157a.writeLock().lock();
        try {
            jVar.f1158c = 1;
            arrayList.addAll(jVar.b);
            jVar.b.clear();
            jVar.f1157a.writeLock().unlock();
            jVar.f1159d.post(new b((List) arrayList, jVar.f1158c, (Throwable) null));
        } catch (Throwable th) {
            jVar.f1157a.writeLock().unlock();
            throw th;
        }
    }
}

package d1;

import g1.b;
import g1.e;
import g1.f;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;

/* renamed from: d1.b  reason: case insensitive filesystem */
public final class C0109b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0109b f2280a = new Object();
    public static final C0109b b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final C0109b f2281c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C0109b f2282d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static C0109b f2283e;

    public static Socket a(m mVar, C0108a aVar, f fVar) {
        Iterator it = mVar.f2335d.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.g(aVar, (J) null) && bVar.f2872h != null && bVar != fVar.a()) {
                if (fVar.f2896l == null && fVar.f2893i.f2878n.size() == 1) {
                    Socket b2 = fVar.b(true, false, false);
                    fVar.f2893i = bVar;
                    bVar.f2878n.add((Reference) fVar.f2893i.f2878n.get(0));
                    return b2;
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public static void b(m mVar, C0108a aVar, f fVar, J j2) {
        Iterator it = mVar.f2335d.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.g(aVar, j2)) {
                if (fVar.f2893i == null) {
                    fVar.f2893i = bVar;
                    fVar.f2894j = true;
                    bVar.f2878n.add(new e(fVar, fVar.f));
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }
}

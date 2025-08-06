package o;

import Q0.l;

/* renamed from: o.e  reason: case insensitive filesystem */
public final class C0300e extends l {
    public final void S(C0301f fVar, C0301f fVar2) {
        fVar.b = fVar2;
    }

    public final void T(C0301f fVar, Thread thread) {
        fVar.f3722a = thread;
    }

    public final boolean h(C0302g gVar, C0298c cVar) {
        C0298c cVar2 = C0298c.b;
        synchronized (gVar) {
            try {
                if (gVar.f3727g != cVar) {
                    return false;
                }
                gVar.f3727g = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i(C0302g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f != obj) {
                    return false;
                }
                gVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(C0302g gVar, C0301f fVar, C0301f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3728h != fVar) {
                    return false;
                }
                gVar.f3728h = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

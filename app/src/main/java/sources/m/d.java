package m;

import java.util.Iterator;

public final class d extends e implements Iterator {
    public c f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3656g = true;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f3657h;

    public d(f fVar) {
        this.f3657h = fVar;
    }

    public final void a(c cVar) {
        boolean z2;
        c cVar2 = this.f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3655i;
            this.f = cVar3;
            if (cVar3 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f3656g = z2;
        }
    }

    public final boolean hasNext() {
        if (!this.f3656g) {
            c cVar = this.f;
            if (cVar == null || cVar.f3654h == null) {
                return false;
            }
            return true;
        } else if (this.f3657h.f != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        c cVar;
        if (this.f3656g) {
            this.f3656g = false;
            this.f = this.f3657h.f;
        } else {
            c cVar2 = this.f;
            if (cVar2 != null) {
                cVar = cVar2.f3654h;
            } else {
                cVar = null;
            }
            this.f = cVar;
        }
        return this.f;
    }
}

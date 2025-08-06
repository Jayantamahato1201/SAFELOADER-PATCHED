package m;

import java.util.Iterator;

public final class b extends e implements Iterator {
    public c f;

    /* renamed from: g  reason: collision with root package name */
    public c f3651g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3652h;

    public b(c cVar, c cVar2, int i2) {
        this.f3652h = i2;
        this.f = cVar2;
        this.f3651g = cVar;
    }

    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f == cVar && cVar == this.f3651g) {
            this.f3651g = null;
            this.f = null;
        }
        c cVar4 = this.f;
        if (cVar4 == cVar) {
            switch (this.f3652h) {
                case 0:
                    cVar2 = cVar4.f3655i;
                    break;
                default:
                    cVar2 = cVar4.f3654h;
                    break;
            }
            this.f = cVar2;
        }
        c cVar5 = this.f3651g;
        if (cVar5 == cVar) {
            c cVar6 = this.f;
            if (!(cVar5 == cVar6 || cVar6 == null)) {
                cVar3 = b(cVar5);
            }
            this.f3651g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3652h) {
            case 0:
                return cVar.f3654h;
            default:
                return cVar.f3655i;
        }
    }

    public final boolean hasNext() {
        if (this.f3651g != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        c cVar;
        c cVar2 = this.f3651g;
        c cVar3 = this.f;
        if (cVar2 == cVar3 || cVar3 == null) {
            cVar = null;
        } else {
            cVar = b(cVar2);
        }
        this.f3651g = cVar;
        return cVar2;
    }
}

package d1;

import A.j;
import F.g;
import Q0.l;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final t f2231a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2232c;

    /* renamed from: d  reason: collision with root package name */
    public final l f2233d;

    /* renamed from: e  reason: collision with root package name */
    public final C f2234e;
    public volatile C0116i f;

    public C(g gVar) {
        this.f2231a = (t) gVar.f198c;
        this.b = (String) gVar.b;
        j jVar = (j) gVar.f199d;
        jVar.getClass();
        this.f2232c = new r(jVar);
        this.f2233d = (l) gVar.f200e;
        C c2 = (C) gVar.f;
        this.f2234e = c2 == null ? this : c2;
    }

    public final g a() {
        g gVar = new g(false);
        gVar.f198c = this.f2231a;
        gVar.b = this.b;
        gVar.f200e = this.f2233d;
        gVar.f = this.f2234e;
        gVar.f199d = this.f2232c.c();
        return gVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f2231a);
        sb.append(", tag=");
        C c2 = this.f2234e;
        if (c2 == this) {
            c2 = null;
        }
        sb.append(c2);
        sb.append('}');
        return sb.toString();
    }
}

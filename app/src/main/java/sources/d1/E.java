package d1;

import Q0.l;
import e1.c;
import java.io.File;
import o1.b;
import o1.f;
import o1.o;

public final class E extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ v f2238l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ File f2239m;

    public E(v vVar, File file) {
        this.f2238l = vVar;
        this.f2239m = file;
    }

    public final void e0(f fVar) {
        b bVar = null;
        try {
            bVar = o.b(this.f2239m);
            fVar.c(bVar);
        } finally {
            c.d(bVar);
        }
    }

    public final long r() {
        return this.f2239m.length();
    }

    public final v s() {
        return this.f2238l;
    }
}

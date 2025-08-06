package s;

import r.C0472d;

public final class h extends m {
    public final void a(d dVar) {
        f fVar = this.f4476h;
        if (fVar.f4457c && !fVar.f4463j) {
            fVar.d((int) ((((float) ((f) fVar.f4465l.get(0)).f4460g) * ((r.h) this.b).f4401d0) + 0.5f));
        }
    }

    public final void d() {
        C0472d dVar = this.b;
        r.h hVar = (r.h) dVar;
        int i2 = hVar.e0;
        int i3 = hVar.f4402f0;
        int i4 = hVar.f4404h0;
        f fVar = this.f4476h;
        if (i4 == 1) {
            if (i2 != -1) {
                fVar.f4465l.add(dVar.f4293I.f4316d.f4476h);
                this.b.f4293I.f4316d.f4476h.f4464k.add(fVar);
                fVar.f = i2;
            } else if (i3 != -1) {
                fVar.f4465l.add(dVar.f4293I.f4316d.f4477i);
                this.b.f4293I.f4316d.f4477i.f4464k.add(fVar);
                fVar.f = -i3;
            } else {
                fVar.b = true;
                fVar.f4465l.add(dVar.f4293I.f4316d.f4477i);
                this.b.f4293I.f4316d.f4477i.f4464k.add(fVar);
            }
            m(this.b.f4316d.f4476h);
            m(this.b.f4316d.f4477i);
            return;
        }
        if (i2 != -1) {
            fVar.f4465l.add(dVar.f4293I.f4317e.f4476h);
            this.b.f4293I.f4317e.f4476h.f4464k.add(fVar);
            fVar.f = i2;
        } else if (i3 != -1) {
            fVar.f4465l.add(dVar.f4293I.f4317e.f4477i);
            this.b.f4293I.f4317e.f4477i.f4464k.add(fVar);
            fVar.f = -i3;
        } else {
            fVar.b = true;
            fVar.f4465l.add(dVar.f4293I.f4317e.f4477i);
            this.b.f4293I.f4317e.f4477i.f4464k.add(fVar);
        }
        m(this.b.f4317e.f4476h);
        m(this.b.f4317e.f4477i);
    }

    public final void e() {
        C0472d dVar = this.b;
        int i2 = ((r.h) dVar).f4404h0;
        f fVar = this.f4476h;
        if (i2 == 1) {
            dVar.f4298N = fVar.f4460g;
        } else {
            dVar.f4299O = fVar.f4460g;
        }
    }

    public final void f() {
        this.f4476h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f4476h;
        fVar2.f4464k.add(fVar);
        fVar.f4465l.add(fVar2);
    }
}

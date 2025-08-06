package s;

import java.util.ArrayList;
import r.C0469a;
import r.C0472d;

public final class i extends m {
    public final void a(d dVar) {
        C0469a aVar = (C0469a) this.b;
        int i2 = aVar.f4263f0;
        f fVar = this.f4476h;
        ArrayList arrayList = fVar.f4465l;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i6 = ((f) obj).f4460g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i3 < i6) {
                i3 = i6;
            }
        }
        if (i2 == 0 || i2 == 2) {
            fVar.d(i5 + aVar.f4265h0);
        } else {
            fVar.d(i3 + aVar.f4265h0);
        }
    }

    public final void d() {
        C0472d dVar = this.b;
        if (dVar instanceof C0469a) {
            f fVar = this.f4476h;
            fVar.b = true;
            C0469a aVar = (C0469a) dVar;
            int i2 = aVar.f4263f0;
            boolean z2 = aVar.f4264g0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f4459e = 4;
                while (i3 < aVar.e0) {
                    C0472d dVar2 = aVar.f4405d0[i3];
                    if (z2 || dVar2.f4306V != 8) {
                        f fVar2 = dVar2.f4316d.f4476h;
                        fVar2.f4464k.add(fVar);
                        fVar.f4465l.add(fVar2);
                    }
                    i3++;
                }
                m(this.b.f4316d.f4476h);
                m(this.b.f4316d.f4477i);
            } else if (i2 == 1) {
                fVar.f4459e = 5;
                while (i3 < aVar.e0) {
                    C0472d dVar3 = aVar.f4405d0[i3];
                    if (z2 || dVar3.f4306V != 8) {
                        f fVar3 = dVar3.f4316d.f4477i;
                        fVar3.f4464k.add(fVar);
                        fVar.f4465l.add(fVar3);
                    }
                    i3++;
                }
                m(this.b.f4316d.f4476h);
                m(this.b.f4316d.f4477i);
            } else if (i2 == 2) {
                fVar.f4459e = 6;
                while (i3 < aVar.e0) {
                    C0472d dVar4 = aVar.f4405d0[i3];
                    if (z2 || dVar4.f4306V != 8) {
                        f fVar4 = dVar4.f4317e.f4476h;
                        fVar4.f4464k.add(fVar);
                        fVar.f4465l.add(fVar4);
                    }
                    i3++;
                }
                m(this.b.f4317e.f4476h);
                m(this.b.f4317e.f4477i);
            } else if (i2 == 3) {
                fVar.f4459e = 7;
                while (i3 < aVar.e0) {
                    C0472d dVar5 = aVar.f4405d0[i3];
                    if (z2 || dVar5.f4306V != 8) {
                        f fVar5 = dVar5.f4317e.f4477i;
                        fVar5.f4464k.add(fVar);
                        fVar.f4465l.add(fVar5);
                    }
                    i3++;
                }
                m(this.b.f4317e.f4476h);
                m(this.b.f4317e.f4477i);
            }
        }
    }

    public final void e() {
        C0472d dVar = this.b;
        if (dVar instanceof C0469a) {
            int i2 = ((C0469a) dVar).f4263f0;
            f fVar = this.f4476h;
            if (i2 == 0 || i2 == 1) {
                dVar.f4298N = fVar.f4460g;
            } else {
                dVar.f4299O = fVar.f4460g;
            }
        }
    }

    public final void f() {
        this.f4472c = null;
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

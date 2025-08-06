package s;

import q.h;
import r.C0471c;
import r.C0472d;

public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f4471a;
    public C0472d b;

    /* renamed from: c  reason: collision with root package name */
    public k f4472c;

    /* renamed from: d  reason: collision with root package name */
    public int f4473d;

    /* renamed from: e  reason: collision with root package name */
    public final g f4474e = new g(this);
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4475g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f4476h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f4477i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f4478j = 1;

    public m(C0472d dVar) {
        this.b = dVar;
    }

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f4465l.add(fVar2);
        fVar.f = i2;
        fVar2.f4464k.add(fVar);
    }

    public static f h(C0471c cVar) {
        C0471c cVar2 = cVar.f4283d;
        if (cVar2 == null) {
            return null;
        }
        int b2 = h.b(cVar2.f4282c);
        C0472d dVar = cVar2.b;
        if (b2 == 1) {
            return dVar.f4316d.f4476h;
        }
        if (b2 == 2) {
            return dVar.f4317e.f4476h;
        }
        if (b2 == 3) {
            return dVar.f4316d.f4477i;
        }
        if (b2 == 4) {
            return dVar.f4317e.f4477i;
        }
        if (b2 != 5) {
            return null;
        }
        return dVar.f4317e.f4469k;
    }

    public static f i(C0471c cVar, int i2) {
        m mVar;
        C0471c cVar2 = cVar.f4283d;
        if (cVar2 == null) {
            return null;
        }
        C0472d dVar = cVar2.b;
        if (i2 == 0) {
            mVar = dVar.f4316d;
        } else {
            mVar = dVar.f4317e;
        }
        int b2 = h.b(cVar2.f4282c);
        if (b2 == 1 || b2 == 2) {
            return mVar.f4476h;
        }
        if (b2 == 3 || b2 == 4) {
            return mVar.f4477i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f4465l.add(fVar2);
        fVar.f4465l.add(this.f4474e);
        fVar.f4461h = i2;
        fVar.f4462i = gVar;
        fVar2.f4464k.add(fVar);
        gVar.f4464k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        if (i3 == 0) {
            C0472d dVar = this.b;
            int i4 = dVar.f4325n;
            int max = Math.max(dVar.f4324m, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max != i2) {
                return max;
            }
        } else {
            C0472d dVar2 = this.b;
            int i5 = dVar2.f4328q;
            int max2 = Math.max(dVar2.f4327p, i2);
            if (i5 > 0) {
                max2 = Math.min(i5, i2);
            }
            if (max2 != i2) {
                return max2;
            }
        }
        return i2;
    }

    public long j() {
        g gVar = this.f4474e;
        if (gVar.f4463j) {
            return (long) gVar.f4460g;
        }
        return 0;
    }

    public abstract boolean k();

    public final void l(C0471c cVar, C0471c cVar2, int i2) {
        float f2;
        m mVar;
        float f3;
        int i3;
        f h2 = h(cVar);
        f h3 = h(cVar2);
        if (h2.f4463j && h3.f4463j) {
            int c2 = cVar.c() + h2.f4460g;
            int c3 = h3.f4460g - cVar2.c();
            int i4 = c3 - c2;
            g gVar = this.f4474e;
            if (!gVar.f4463j && this.f4473d == 3) {
                int i5 = this.f4471a;
                if (i5 == 0) {
                    gVar.d(g(i4, i2));
                } else if (i5 == 1) {
                    gVar.d(Math.min(g(gVar.f4466m, i2), i4));
                } else if (i5 == 2) {
                    C0472d dVar = this.b;
                    C0472d dVar2 = dVar.f4293I;
                    if (dVar2 != null) {
                        if (i2 == 0) {
                            mVar = dVar2.f4316d;
                        } else {
                            mVar = dVar2.f4317e;
                        }
                        g gVar2 = mVar.f4474e;
                        if (gVar2.f4463j) {
                            if (i2 == 0) {
                                f3 = dVar.f4326o;
                            } else {
                                f3 = dVar.f4329r;
                            }
                            gVar.d(g((int) ((((float) gVar2.f4460g) * f3) + 0.5f), i2));
                        }
                    }
                } else if (i5 == 3) {
                    C0472d dVar3 = this.b;
                    m mVar2 = dVar3.f4316d;
                    int i6 = mVar2.f4473d;
                    m mVar3 = dVar3.f4317e;
                    if (!(i6 == 3 && mVar2.f4471a == 3 && mVar3.f4473d == 3 && mVar3.f4471a == 3)) {
                        if (i2 == 0) {
                            mVar2 = mVar3;
                        }
                        g gVar3 = mVar2.f4474e;
                        if (gVar3.f4463j) {
                            float f4 = dVar3.f4296L;
                            if (i2 == 1) {
                                i3 = (int) ((((float) gVar3.f4460g) / f4) + 0.5f);
                            } else {
                                i3 = (int) ((f4 * ((float) gVar3.f4460g)) + 0.5f);
                            }
                            gVar.d(i3);
                        }
                    }
                }
            }
            if (gVar.f4463j) {
                int i7 = gVar.f4460g;
                f fVar = this.f4477i;
                f fVar2 = this.f4476h;
                if (i7 == i4) {
                    fVar2.d(c2);
                    fVar.d(c3);
                    return;
                }
                C0472d dVar4 = this.b;
                if (i2 == 0) {
                    f2 = dVar4.f4303S;
                } else {
                    f2 = dVar4.f4304T;
                }
                if (h2 == h3) {
                    c2 = h2.f4460g;
                    c3 = h3.f4460g;
                    f2 = 0.5f;
                }
                fVar2.d((int) ((((float) ((c3 - c2) - i7)) * f2) + ((float) c2) + 0.5f));
                fVar.d(fVar2.f4460g + gVar.f4460g);
            }
        }
    }
}

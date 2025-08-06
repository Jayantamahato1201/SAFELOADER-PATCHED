package f0;

public final class r extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2689a = 1;
    public m b;

    public /* synthetic */ r() {
    }

    public void a(m mVar) {
        switch (this.f2689a) {
            case 1:
                C0150a aVar = (C0150a) this.b;
                if (!aVar.f2635I) {
                    aVar.G();
                    aVar.f2635I = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void e(m mVar) {
        switch (this.f2689a) {
            case 0:
                this.b.z();
                mVar.x(this);
                return;
            default:
                C0150a aVar = (C0150a) this.b;
                int i2 = aVar.f2634H - 1;
                aVar.f2634H = i2;
                if (i2 == 0) {
                    aVar.f2635I = false;
                    aVar.m();
                }
                mVar.x(this);
                return;
        }
    }

    public r(m mVar) {
        this.b = mVar;
    }
}

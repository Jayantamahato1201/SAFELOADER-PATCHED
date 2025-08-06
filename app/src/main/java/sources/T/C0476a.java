package t;

import r.C0469a;
import r.C0472d;

/* renamed from: t.a  reason: case insensitive filesystem */
public final class C0476a extends C0478c {

    /* renamed from: g  reason: collision with root package name */
    public int f4542g;

    /* renamed from: h  reason: collision with root package name */
    public int f4543h;

    /* renamed from: i  reason: collision with root package name */
    public C0469a f4544i;

    public final void f(C0472d dVar, boolean z2) {
        int i2 = this.f4542g;
        this.f4543h = i2;
        if (z2) {
            if (i2 == 5) {
                this.f4543h = 1;
            } else if (i2 == 6) {
                this.f4543h = 0;
            }
        } else if (i2 == 5) {
            this.f4543h = 0;
        } else if (i2 == 6) {
            this.f4543h = 1;
        }
        if (dVar instanceof C0469a) {
            ((C0469a) dVar).f4263f0 = this.f4543h;
        }
    }

    public int getMargin() {
        return this.f4544i.f4265h0;
    }

    public int getType() {
        return this.f4542g;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4544i.f4264g0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f4544i.f4265h0 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f4544i.f4265h0 = i2;
    }

    public void setType(int i2) {
        this.f4542g = i2;
    }
}

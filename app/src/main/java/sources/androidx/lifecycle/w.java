package androidx.lifecycle;

import A.j;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public final j f1445a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f1446c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f1447d;

    public w(x xVar, j jVar) {
        this.f1447d = xVar;
        this.f1445a = jVar;
    }

    public final void c(boolean z2) {
        int i2;
        if (z2 != this.b) {
            this.b = z2;
            if (z2) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            x xVar = this.f1447d;
            int i3 = xVar.f1450c;
            xVar.f1450c = i2 + i3;
            if (!xVar.f1451d) {
                xVar.f1451d = true;
                while (true) {
                    try {
                        int i4 = xVar.f1450c;
                        if (i3 == i4) {
                            break;
                        }
                        i3 = i4;
                    } finally {
                        xVar.f1451d = false;
                    }
                }
            }
            if (this.b) {
                xVar.c(this);
            }
        }
    }

    public void d() {
    }

    public abstract boolean e();
}

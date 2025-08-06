package f0;

import Q0.l;
import android.view.ViewGroup;

/* renamed from: f0.d  reason: case insensitive filesystem */
public final class C0153d extends n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2638a = false;
    public final ViewGroup b;

    public C0153d(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void d() {
        l.c0(this.b, false);
    }

    public final void e(m mVar) {
        if (!this.f2638a) {
            l.c0(this.b, false);
        }
        mVar.x(this);
    }

    public final void f(m mVar) {
        l.c0(this.b, false);
        this.f2638a = true;
    }

    public final void g() {
        l.c0(this.b, true);
    }
}

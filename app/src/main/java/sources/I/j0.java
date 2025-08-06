package I;

import A.b;
import A.d;
import android.view.View;
import android.view.WindowInsets;

public class j0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f440c;

    public j0() {
        this.f440c = b.e();
    }

    public t0 b() {
        a();
        t0 g2 = t0.g((View) null, this.f440c.build());
        g2.f464a.o(this.b);
        return g2;
    }

    public void d(d dVar) {
        this.f440c.setMandatorySystemGestureInsets(dVar.d());
    }

    public void e(d dVar) {
        this.f440c.setStableInsets(dVar.d());
    }

    public void f(d dVar) {
        this.f440c.setSystemGestureInsets(dVar.d());
    }

    public void g(d dVar) {
        this.f440c.setSystemWindowInsets(dVar.d());
    }

    public void h(d dVar) {
        this.f440c.setTappableElementInsets(dVar.d());
    }

    public j0(t0 t0Var) {
        super(t0Var);
        WindowInsets.Builder builder;
        WindowInsets f = t0Var.f();
        if (f != null) {
            builder = b.f(f);
        } else {
            builder = b.e();
        }
        this.f440c = builder;
    }
}

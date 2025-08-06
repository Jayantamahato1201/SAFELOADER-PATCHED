package I;

import A.i;
import E0.e;
import android.view.View;
import android.view.Window;

public class u0 extends i {

    /* renamed from: o  reason: collision with root package name */
    public final Window f465o;

    public u0(Window window, e eVar) {
        this.f465o = window;
    }

    public final void A0(int i2) {
        View decorView = this.f465o.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }
}

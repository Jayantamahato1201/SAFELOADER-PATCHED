package I;

import A.i;
import E0.e;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class x0 extends i {

    /* renamed from: o  reason: collision with root package name */
    public final WindowInsetsController f471o;

    /* renamed from: p  reason: collision with root package name */
    public Window f472p;

    public x0(WindowInsetsController windowInsetsController, e eVar) {
        this.f471o = windowInsetsController;
    }

    public final void k0(boolean z2) {
        Window window = this.f472p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f471o.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f471o.setSystemBarsAppearance(0, 16);
    }

    public final void l0(boolean z2) {
        Window window = this.f472p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f471o.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f471o.setSystemBarsAppearance(0, 8);
    }
}

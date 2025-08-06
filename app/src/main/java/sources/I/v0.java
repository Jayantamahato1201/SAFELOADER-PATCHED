package I;

import android.view.View;
import android.view.Window;

public class v0 extends u0 {
    public final void l0(boolean z2) {
        if (z2) {
            Window window = this.f465o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        A0(8192);
    }
}

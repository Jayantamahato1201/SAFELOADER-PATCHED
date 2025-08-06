package I;

import android.view.View;
import android.view.Window;

public final class w0 extends v0 {
    public final void k0(boolean z2) {
        if (z2) {
            Window window = this.f465o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        A0(16);
    }
}

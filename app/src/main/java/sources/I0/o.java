package i0;

import android.app.AlertDialog;
import com.cheatbox.MainActivity;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f2996g;

    public /* synthetic */ o(AlertDialog alertDialog, int i2) {
        this.f = i2;
        this.f2996g = alertDialog;
    }

    public final void run() {
        AlertDialog alertDialog = this.f2996g;
        switch (this.f) {
            case 0:
                alertDialog.show();
                return;
            default:
                int i2 = MainActivity.f1818B;
                if (alertDialog.isShowing()) {
                    alertDialog.dismiss();
                    return;
                }
                return;
        }
    }
}

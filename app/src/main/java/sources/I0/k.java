package i0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.cheatbox.MainActivity;

public final /* synthetic */ class k implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f2993a;

    public /* synthetic */ k(AlertDialog alertDialog) {
        this.f2993a = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i2 = MainActivity.f1818B;
        AlertDialog alertDialog = this.f2993a;
        alertDialog.getButton(-1).setTextColor(-16777216);
        alertDialog.getButton(-2).setTextColor(-16777216);
        alertDialog.getButton(-3).setTextColor(-16777216);
    }
}

package i0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import t0.C0486a;

public final /* synthetic */ class n implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2995a;
    public final /* synthetic */ AlertDialog b;

    public /* synthetic */ n(MainActivity mainActivity, AlertDialog alertDialog) {
        this.f2995a = mainActivity;
        this.b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i2 = MainActivity.f1818B;
        MainActivity mainActivity = this.f2995a;
        mainActivity.getClass();
        this.b.getButton(-1).setTextColor(C0486a.d(mainActivity, R.color.MT_Bin));
    }
}

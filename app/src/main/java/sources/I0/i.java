package i0;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.cheatbox.MainActivity;
import com.cheatbox.Native;
import com.cheatbox.R;
import p1.a;
import q.h;
import q1.C0422s0;
import q1.F;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2989g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f2990h;

    public /* synthetic */ i(MainActivity mainActivity, AlertDialog alertDialog, int i2) {
        this.f = i2;
        this.f2989g = mainActivity;
        this.f2990h = alertDialog;
    }

    public final void run() {
        int i2;
        AlertDialog alertDialog = this.f2990h;
        MainActivity mainActivity = this.f2989g;
        switch (this.f) {
            case 0:
                int i3 = MainActivity.f1818B;
                MainActivity mainActivity2 = this.f2989g;
                mainActivity2.runOnUiThread(new d(mainActivity2, this.f2990h, Native.update(), a.a(47552817046303698L), 1));
                return;
            case 1:
                int i4 = MainActivity.f1818B;
                alertDialog.dismiss();
                AlertDialog.Builder title = new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setTitle(mainActivity.getString(R.string.MT_Bin));
                title.setMessage(mainActivity.getString(R.string.MT_Bin) + a.a(47552829931205586L) + ((C0422s0) F.f3877c.b()).x()).setPositiveButton(mainActivity.getString(R.string.MT_Bin), new m(mainActivity, 2)).setCancelable(false).show();
                return;
            default:
                int i5 = MainActivity.f1818B;
                Toast.makeText(mainActivity, mainActivity.getString(R.string.MT_Bin), 0).show();
                u uVar = mainActivity.f1824z;
                String a2 = a.a(47552881470813138L);
                uVar.getClass();
                String concat = a2.concat(a.a(47551674585002962L));
                SharedPreferences sharedPreferences = uVar.f3010a;
                if (sharedPreferences.contains(concat) && (i2 = sharedPreferences.getInt(a2.concat(a.a(47551640225264594L)), -1)) >= 0) {
                    sharedPreferences.edit().remove(a2.concat(a.a(47551605865526226L))).apply();
                    for (int i6 = 0; i6 < i2; i6++) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        StringBuilder a3 = h.a(a2);
                        a3.append(a.a(47551571505787858L));
                        a3.append(i6);
                        a3.append(a.a(47551562915853266L));
                        edit.remove(a3.toString()).apply();
                    }
                }
                sharedPreferences.edit().remove(a2).apply();
                if (alertDialog.isShowing()) {
                    alertDialog.dismiss();
                    return;
                }
                return;
        }
    }
}

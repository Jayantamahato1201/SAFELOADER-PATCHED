package i0;

import android.view.View;
import android.widget.Toast;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import com.google.android.material.button.MaterialButton;
import p1.a;
import t0.C0486a;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f3002a;
    public final /* synthetic */ MaterialButton b;

    public /* synthetic */ r(MainActivity mainActivity, MaterialButton materialButton) {
        this.f3002a = mainActivity;
        this.b = materialButton;
    }

    public final void onClick(View view) {
        MainActivity mainActivity = this.f3002a;
        u uVar = mainActivity.f1824z;
        boolean z2 = uVar.f3010a.getBoolean(a.a(47552250110620626L), false);
        MaterialButton materialButton = this.b;
        if (z2) {
            materialButton.getIcon().setTint(C0486a.d(mainActivity, R.color.MT_Bin));
            materialButton.setTextColor(C0486a.d(mainActivity, R.color.MT_Bin));
            materialButton.setStrokeColorResource(R.color.MT_Bin);
            Toast.makeText(mainActivity, a.a(47552189981078482L), 0).show();
        } else {
            materialButton.getIcon().setTint(C0486a.d(mainActivity, R.color.MT_Bin));
            materialButton.setTextColor(C0486a.d(mainActivity, R.color.MT_Bin));
            materialButton.setStrokeColorResource(R.color.MT_Bin);
            Toast.makeText(mainActivity, a.a(47552086901863378L), 0).show();
        }
        mainActivity.f1824z.f3010a.edit().putBoolean(a.a(47551988117615570L), !z2).apply();
    }
}

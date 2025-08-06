package i0;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;
import com.cheatbox.LoginActivity;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import java.io.File;
import p1.a;
import q1.C0325b4;
import q1.T3;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3001a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ q(MainActivity mainActivity, int i2) {
        this.f3001a = i2;
        this.b = mainActivity;
    }

    public final void onClick(View view) {
        switch (this.f3001a) {
            case 0:
                MainActivity mainActivity = this.b;
                mainActivity.f1824z.a(a.a(47551927988073426L), a.a(47551889333367762L));
                mainActivity.startActivity(new Intent(mainActivity, LoginActivity.class));
                return;
            default:
                MainActivity mainActivity2 = this.b;
                String str = mainActivity2.f1820v[0];
                try {
                    PackageInfo packageInfo = mainActivity2.getPackageManager().getPackageInfo(str, 0);
                    String str2 = a.a(47556231545304018L) + packageInfo.versionCode + a.a(47556205775500242L) + str + a.a(47556197185565650L);
                    String packageName = mainActivity2.getApplicationContext().getPackageName();
                    File file = new File(Environment.getExternalStorageDirectory(), a.a(47556175710729170L) + str + a.a(47556119876154322L) + str2);
                    File file2 = new File(new File(Environment.getExternalStorageDirectory(), a.a(47556111286219730L) + packageName + a.a(47556055451644882L) + str + a.a(47555986732168146L) + str + a.a(47555926602626002L)), str2);
                    if (file2.exists()) {
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        AlertDialog.Builder negativeButton = new AlertDialog.Builder(mainActivity2, R.style.MT_Bin).setTitle(applicationInfo.loadLabel(mainActivity2.getPackageManager())).setMessage(mainActivity2.getString(R.string.MT_Bin) + a.a(47555918012691410L) + applicationInfo.loadLabel(mainActivity2.getPackageManager()) + a.a(47555905127789522L) + str + a.a(47555836408312786L) + mainActivity2.getString(R.string.MT_Bin) + a.a(47555827818378194L) + packageInfo.versionName + a.a(47555814933476306L) + packageInfo.versionCode).setPositiveButton(mainActivity2.getString(R.string.MT_Bin), new j(mainActivity2, str, 0)).setNegativeButton(a.a(47555746213999570L), new f(2));
                        if (((C0325b4) T3.f3994c.b()).m0(str, String.valueOf(0))) {
                            negativeButton.setNeutralButton(mainActivity2.getString(R.string.MT_Bin), new h(1, str));
                        } else {
                            negativeButton.setNeutralButton(mainActivity2.getString(R.string.MT_Bin), new j(mainActivity2, str, 1));
                        }
                        AlertDialog create = negativeButton.create();
                        create.setOnShowListener(new k(create));
                        create.show();
                        return;
                    }
                    Toast.makeText(mainActivity2, mainActivity2.getString(R.string.MT_Bin), 0).show();
                    mainActivity2.s(file, file2);
                    return;
                } catch (Exception e2) {
                    new AlertDialog.Builder(mainActivity2, R.style.MT_Bin).setTitle(mainActivity2.getString(R.string.MT_Bin)).setMessage(mainActivity2.getString(R.string.MT_Bin) + a.a(47555716149228498L) + e2.getMessage()).setPositiveButton(mainActivity2.getString(R.string.MT_Bin), new f(3)).show();
                    return;
                }
        }
    }
}

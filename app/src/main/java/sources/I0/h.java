package i0;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.cheatbox.LoginActivity;
import com.cheatbox.MainActivity;
import p1.a;
import q1.C0325b4;
import q1.T3;
import top.bienvenido.mundo.manifest.MundoIntermediary;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2988a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f2988a = i2;
        this.b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Object obj = this.b;
        switch (this.f2988a) {
            case 0:
                int i3 = LoginActivity.f1815x;
                LoginActivity loginActivity = (LoginActivity) obj;
                if (!Settings.canDrawOverlays(loginActivity)) {
                    String a2 = a.a(47558671086728146L);
                    loginActivity.startActivity(new Intent(a2, Uri.parse(a.a(47558456338363346L) + loginActivity.getPackageName())));
                }
                if (!loginActivity.getPackageManager().canRequestPackageInstalls()) {
                    String a3 = a.a(47558417683657682L);
                    loginActivity.startActivity(new Intent(a3, Uri.parse(a.a(47558228705096658L) + loginActivity.getPackageName())));
                }
                Runtime.getRuntime().exit(0);
                return;
            case 1:
                int i4 = MainActivity.f1818B;
                ((C0325b4) T3.f3994c.b()).v0((String) obj, (String) null);
                return;
            default:
                int i5 = MundoIntermediary.f4722a;
                ((MundoIntermediary) obj).finish();
                return;
        }
    }
}

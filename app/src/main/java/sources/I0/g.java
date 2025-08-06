package i0;

import K0.w;
import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.k;
import com.cheatbox.LoginActivity;
import com.cheatbox.R;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import p1.a;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2987a;
    public final /* synthetic */ LoginActivity b;

    public /* synthetic */ g(LoginActivity loginActivity, int i2) {
        this.f2987a = i2;
        this.b = loginActivity;
    }

    public final void onClick(View view) {
        boolean z2;
        LoginActivity loginActivity = this.b;
        switch (this.f2987a) {
            case 0:
                int i2 = LoginActivity.f1815x;
                loginActivity.getClass();
                CharSequence text = ((ClipboardManager) loginActivity.getSystemService(a.a(47557240862618578L))).getText();
                if (text == null || text.length() <= 5) {
                    Toast.makeText(loginActivity, loginActivity.getString(R.string.MT_Bin), 1).show();
                    return;
                } else {
                    loginActivity.f1816v.setText(text.toString());
                    return;
                }
            case 1:
                String obj = loginActivity.f1816v.getText().toString();
                View inflate = loginActivity.getLayoutInflater().inflate(R.layout.MT_Bin, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.MT_Bin)).setText(loginActivity.getString(R.string.MT_Bin));
                u uVar = loginActivity.f1817w;
                if (uVar.f3010a.contains(a.a(47560852930114514L))) {
                    w d2 = w.d();
                    u uVar2 = loginActivity.f1817w;
                    d2.e(uVar2.f3010a.getString(a.a(47560831455278034L), a.a(47560809980441554L))).a((ImageView) inflate.findViewById(R.id.MT_Bin));
                }
                ((ProgressBar) inflate.findViewById(R.id.MT_Bin)).setIndeterminate(true);
                AlertDialog create = new AlertDialog.Builder(loginActivity, R.style.MT_Bin).setCancelable(false).setView(inflate).create();
                create.show();
                try {
                    ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            T t2 = list.get(i3);
                            i3++;
                            NetworkInterface networkInterface = (NetworkInterface) t2;
                            if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0) {
                                String name = networkInterface.getName();
                                if (name.contains(a.a(47560887289852882L)) || name.contains(a.a(47560870109983698L))) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                z2 = false;
                if (z2) {
                    new Thread(new e(loginActivity, 0)).start();
                }
                if (!z2) {
                    new Thread(new k(loginActivity, obj, create, 1)).start();
                    return;
                }
                return;
            default:
                u uVar3 = loginActivity.f1817w;
                String string = uVar3.f3010a.getString(a.a(47557588754969554L), a.a(47557550100263890L));
                if (string == null || string.isEmpty()) {
                    Toast.makeText(loginActivity, a.a(47557369711637458L), 0).show();
                    return;
                }
                loginActivity.startActivity(new Intent(a.a(47557485675754450L), Uri.parse(a.a(47557545805296594L).concat(string))));
                return;
        }
    }
}

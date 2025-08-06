package i0;

import K0.w;
import Z.g;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.emoji2.text.k;
import com.cheatbox.LoginActivity;
import com.cheatbox.MainActivity;
import com.cheatbox.Native;
import com.cheatbox.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Objects;
import p1.a;
import q1.C0318a3;
import q1.C0330c3;
import q1.C0345f0;
import q1.C0382l1;
import q1.C0422s0;
import q1.C3;
import q1.F;
import q1.Q2;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f2981g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f2982h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2983i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f2984j;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f = i2;
        this.f2984j = obj;
        this.f2981g = obj2;
        this.f2982h = obj3;
        this.f2983i = obj4;
    }

    public final void run() {
        Object obj = this.f2982h;
        Object obj2 = this.f2981g;
        Object obj3 = this.f2984j;
        Object obj4 = this.f2983i;
        switch (this.f) {
            case 0:
                int i2 = LoginActivity.f1815x;
                LoginActivity loginActivity = (LoginActivity) obj3;
                loginActivity.getClass();
                ((AlertDialog) obj2).dismiss();
                String str = (String) obj;
                if (str != null) {
                    String str2 = (String) obj4;
                    if (str.equals(str2)) {
                        loginActivity.f1817w.a(a.a(47557709014053842L), Native.ResellerLOGO());
                        loginActivity.f1817w.a(a.a(47557687539217362L), Native.ResellerNAME());
                        loginActivity.f1817w.a(a.a(47557666064380882L), Native.urlTg());
                        loginActivity.f1817w.a(a.a(47557627409675218L), str2);
                        loginActivity.startActivity(new Intent(loginActivity, MainActivity.class));
                        loginActivity.finish();
                        return;
                    }
                }
                new AlertDialog.Builder(loginActivity, R.style.MT_Bin).setTitle(loginActivity.getString(R.string.MT_Bin)).setMessage(str).setPositiveButton(loginActivity.getString(R.string.MT_Bin), new f(1)).show();
                return;
            case 1:
                int i3 = MainActivity.f1818B;
                MainActivity mainActivity = (MainActivity) obj3;
                ((AlertDialog) obj2).dismiss();
                String str3 = (String) obj;
                if (str3.equals(a.a(47552799866434514L))) {
                    new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setTitle(mainActivity.getString(R.string.MT_Bin)).setMessage(mainActivity.getString(R.string.MT_Bin)).setPositiveButton(mainActivity.getString(R.string.MT_Bin), new m(mainActivity, 0)).setCancelable(false).show();
                    return;
                } else if (!str3.equals((String) obj4)) {
                    new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setTitle(mainActivity.getString(R.string.MT_Bin)).setMessage(String.format(Locale.getDefault(), mainActivity.getString(R.string.MT_Bin), new Object[]{str3})).setPositiveButton(mainActivity.getString(R.string.MT_Bin), new m(mainActivity, 1)).setCancelable(false).show();
                    return;
                } else {
                    View inflate = mainActivity.getLayoutInflater().inflate(R.layout.MT_Bin, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.MT_Bin);
                    textView.setText(mainActivity.getString(R.string.MT_Bin));
                    u uVar = mainActivity.f1824z;
                    if (uVar.f3010a.contains(a.a(47556278789944274L))) {
                        w d2 = w.d();
                        u uVar2 = mainActivity.f1824z;
                        d2.e(uVar2.f3010a.getString(a.a(47556257315107794L), a.a(47556235840271314L))).a((ImageView) inflate.findViewById(R.id.MT_Bin));
                    }
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.MT_Bin);
                    progressBar.setIndeterminate(true);
                    new Thread(new d(mainActivity, new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setView(inflate).setCancelable(false).create(), textView, progressBar, 2)).start();
                    return;
                }
            case 2:
                int i4 = MainActivity.f1818B;
                MainActivity mainActivity2 = (MainActivity) obj3;
                AlertDialog alertDialog = (AlertDialog) obj2;
                Objects.requireNonNull(alertDialog);
                mainActivity2.runOnUiThread(new o(alertDialog, 0));
                F f2 = F.f3877c;
                if (!((C0422s0) f2.b()).w()) {
                    String licence = Native.licence();
                    if (!licence.equals(a.a(47553834953552850L))) {
                        ((C0422s0) f2.b()).n0(licence);
                    }
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    if (licence.equals(a.a(47553822068650962L)) || !((C0422s0) F.f3877c.b()).w()) {
                        mainActivity2.runOnUiThread(new i(mainActivity2, alertDialog, 1));
                        return;
                    }
                }
                String a2 = a.a(47553809183749074L);
                C0382l1 l1Var = C0382l1.f4134c;
                if (!((C0345f0) l1Var.b()).B0(a2) && !Objects.equals(mainActivity2.w(a.a(47553710399501266L)), a.a(47553611615253458L))) {
                    String a3 = a.a(47553598730351570L);
                    ((C0345f0) l1Var.b()).y(2, a3);
                    ((C0345f0) l1Var.b()).d0(a3, "0");
                }
                if (!((C0345f0) l1Var.b()).B0(a.a(47553499946103762L)) && !Objects.equals(mainActivity2.w(a.a(47553418341725138L)), a.a(47553336737346514L))) {
                    String a4 = a.a(47553323852444626L);
                    ((C0345f0) l1Var.b()).y(2, a4);
                    ((C0345f0) l1Var.b()).d0(a4, "0");
                }
                TextView textView2 = (TextView) obj;
                mainActivity2.runOnUiThread(new g(mainActivity2, 4, textView2));
                try {
                    File file = new File(mainActivity2.getFilesDir(), a.a(47553242248066002L));
                    u uVar3 = mainActivity2.f1824z;
                    String string = uVar3.f3010a.getString(a.a(47553195003425746L), a.a(47553160643687378L));
                    String currPlugVer = Native.currPlugVer();
                    String currPlugUrl = Native.currPlugUrl();
                    if (currPlugVer.equals(a.a(47553156348720082L)) || currPlugUrl.equals(a.a(47553143463818194L))) {
                        throw new IOException();
                    }
                    if (file.exists()) {
                        u uVar4 = mainActivity2.f1824z;
                        if (uVar4.f3010a.contains(a.a(47553130578916306L))) {
                            if (string.equals(currPlugVer)) {
                                mainActivity2.v(file.getAbsolutePath(), false);
                                mainActivity2.runOnUiThread(new o(alertDialog, 1));
                                return;
                            }
                        }
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(currPlugUrl).openConnection();
                    httpURLConnection.setRequestMethod(a.a(47553096219177938L));
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestProperty(a.a(47553079039308754L), a.a(47553031794668498L));
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        int contentLength = httpURLConnection.getContentLength();
                        byte[] bArr = new byte[1024];
                        long j2 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            ProgressBar progressBar2 = (ProgressBar) obj4;
                            if (read != -1) {
                                File file2 = file;
                                j2 += (long) read;
                                mainActivity2.runOnUiThread(new p(mainActivity2, progressBar2, (int) ((100 * j2) / ((long) contentLength)), textView2));
                                fileOutputStream.write(bArr, 0, read);
                                file = file2;
                            } else {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                mainActivity2.runOnUiThread(new k(mainActivity2, progressBar2, textView2, 2));
                                mainActivity2.v(file.getAbsolutePath(), true);
                                mainActivity2.f1824z.a(a.a(47552915830551506L), Native.currPlugVer());
                                mainActivity2.runOnUiThread(new o(alertDialog, 1));
                                return;
                            }
                        }
                    } else {
                        throw new IOException(a.a(47553006024864722L));
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    mainActivity2.runOnUiThread(new i(mainActivity2, alertDialog, 2));
                    return;
                }
                break;
            case 3:
                C3 c3 = (C3) obj3;
                Intent intent = (Intent) obj2;
                Q2 q2 = (Q2) obj4;
                try {
                    c3.f3869e.put(new Intent.FilterComparison(intent), (IBinder) obj);
                    C0318a3 a3Var = q2.f3967h;
                    if (a3Var != null) {
                        a3Var.k0(c3, intent);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                C0330c3.T0((IBinder) obj3, (Intent) obj2, (IBinder) obj, (IBinder) obj4);
                return;
        }
    }
}

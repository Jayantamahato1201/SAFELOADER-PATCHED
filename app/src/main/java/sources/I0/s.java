package i0;

import android.widget.TextView;
import android.widget.Toast;
import com.cheatbox.MainActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p1.a;
import q1.C0325b4;
import q1.T3;

public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MainActivity f3003g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3004h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f3005i;

    public /* synthetic */ s(MainActivity mainActivity, String str, TextView textView, int i2) {
        this.f = i2;
        this.f3003g = mainActivity;
        this.f3004h = str;
        this.f3005i = textView;
    }

    public final void run() {
        TextView textView = this.f3005i;
        String str = this.f3004h;
        MainActivity mainActivity = this.f3003g;
        switch (this.f) {
            case 0:
                int i2 = MainActivity.f1818B;
                while (!Thread.currentThread().isInterrupted()) {
                    mainActivity.runOnUiThread(new s(mainActivity, str, textView, 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            default:
                int i3 = MainActivity.f1818B;
                if (!str.isEmpty()) {
                    try {
                        long time = new SimpleDateFormat(a.a(47552671017415634L), Locale.getDefault()).parse(str).getTime() - System.currentTimeMillis();
                        if (time > 0) {
                            long j2 = time / 1000;
                            textView.setText(String.format(Locale.getDefault(), a.a(47556403343995858L), new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}));
                            return;
                        }
                        textView.setText(a.a(47552585118069714L));
                        Toast.makeText(mainActivity, a.a(47552550758331346L), 0).show();
                        ((C0325b4) T3.f3994c.b()).m0(mainActivity.f1821w, String.valueOf(0));
                        for (String v02 : mainActivity.f1819A) {
                            ((C0325b4) T3.f3994c.b()).v0(v02, (String) null);
                        }
                        System.exit(0);
                        int i4 = 1 / 0;
                        Thread.currentThread().interrupt();
                        return;
                    } catch (ParseException e2) {
                        e2.printStackTrace();
                        textView.setText(a.a(47552490628789202L));
                        return;
                    }
                } else {
                    textView.setText(a.a(47552370369704914L));
                    return;
                }
        }
    }
}

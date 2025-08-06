package i0;

import android.content.Intent;
import android.os.IBinder;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import p1.a;
import q1.C0433u;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2997g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f2998h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2999i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f3000j;

    public /* synthetic */ p(MainActivity mainActivity, ProgressBar progressBar, int i2, TextView textView) {
        this.f2998h = mainActivity;
        this.f2999i = progressBar;
        this.f2997g = i2;
        this.f3000j = textView;
    }

    public final void run() {
        int i2 = this.f2997g;
        Object obj = this.f3000j;
        Object obj2 = this.f2999i;
        Object obj3 = this.f2998h;
        switch (this.f) {
            case 0:
                int i3 = MainActivity.f1818B;
                MainActivity mainActivity = (MainActivity) obj3;
                mainActivity.getClass();
                ProgressBar progressBar = (ProgressBar) obj2;
                progressBar.setIndeterminate(false);
                progressBar.setProgress(i2);
                ((TextView) obj).setText(mainActivity.getString(R.string.MT_Bin) + a.a(47552847111074770L) + i2 + a.a(47552838521140178L));
                return;
            default:
                C0433u.X0((String) obj3, (Intent) obj2, (IBinder) obj, i2);
                return;
        }
    }

    public /* synthetic */ p(String str, Intent intent, IBinder iBinder, int i2) {
        this.f2998h = str;
        this.f2999i = intent;
        this.f3000j = iBinder;
        this.f2997g = i2;
    }
}

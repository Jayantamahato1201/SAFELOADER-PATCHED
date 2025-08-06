package androidx.emoji2.text;

import A.j;
import Q0.l;
import Z.g;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cheatbox.LoginActivity;
import com.cheatbox.MainActivity;
import com.cheatbox.Native;
import com.cheatbox.R;
import i0.d;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1163g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f1164h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f1165i;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i2) {
        this.f = i2;
        this.f1163g = obj;
        this.f1164h = obj2;
        this.f1165i = obj3;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                j jVar = (j) this.f1163g;
                l lVar = (l) this.f1164h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1165i;
                jVar.getClass();
                try {
                    p t2 = l.t((Context) jVar.b);
                    if (t2 != null) {
                        o oVar = (o) ((i) t2.b);
                        synchronized (oVar.f1177d) {
                            oVar.f = threadPoolExecutor;
                        }
                        ((i) t2.b).l(new l(lVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    lVar.H(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                int i2 = LoginActivity.f1815x;
                LoginActivity loginActivity = (LoginActivity) this.f1163g;
                String str = (String) this.f1164h;
                boolean isEmpty = str.isEmpty();
                AlertDialog alertDialog = (AlertDialog) this.f1165i;
                if (isEmpty || str.length() < 5) {
                    loginActivity.runOnUiThread(new g(loginActivity, 2, alertDialog));
                    return;
                } else {
                    loginActivity.runOnUiThread(new d(loginActivity, alertDialog, "VALID", str, 0));
                    return;
                }
            default:
                int i3 = MainActivity.f1818B;
                MainActivity mainActivity = (MainActivity) this.f1163g;
                mainActivity.getClass();
                ((ProgressBar) this.f1164h).setIndeterminate(true);
                ((TextView) this.f1165i).setText(mainActivity.getString(R.string.MT_Bin));
                return;
        }
    }
}

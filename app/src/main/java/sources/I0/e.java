package i0;

import android.widget.Toast;
import com.cheatbox.LoginActivity;
import com.cheatbox.R;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2985g;

    public /* synthetic */ e(LoginActivity loginActivity, int i2) {
        this.f = i2;
        this.f2985g = loginActivity;
    }

    public final void run() {
        LoginActivity loginActivity = this.f2985g;
        switch (this.f) {
            case 0:
                int i2 = LoginActivity.f1815x;
                try {
                    Thread.sleep(3000);
                    loginActivity.runOnUiThread(new e(loginActivity, 1));
                    return;
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                int i3 = LoginActivity.f1815x;
                Toast.makeText(loginActivity, loginActivity.getString(R.string.MT_Bin), 1).show();
                return;
        }
    }
}

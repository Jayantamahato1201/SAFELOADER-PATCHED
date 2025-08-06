package K0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.fragment.app.C0049f;

public final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f551a = 0;
    public final Object b;

    public l(m mVar) {
        this.b = mVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Object obj = this.b;
        switch (this.f551a) {
            case 0:
                if (intent != null) {
                    String action = intent.getAction();
                    m mVar = (m) obj;
                    if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                        if (intent.hasExtra("state")) {
                            boolean booleanExtra = intent.getBooleanExtra("state", false);
                            j jVar = mVar.f557h;
                            jVar.sendMessage(jVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                            return;
                        }
                        return;
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        StringBuilder sb = G.f520a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        j jVar2 = mVar.f557h;
                        jVar2.sendMessage(jVar2.obtainMessage(9, activeNetworkInfo));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((C0049f) obj).h();
                return;
        }
    }

    public l(C0049f fVar) {
        this.b = fVar;
    }
}

package top.bienvenido.mundo.manifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import q1.C0330c3;

public final class MundoReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        try {
            C0330c3 c3Var = C0330c3.b;
            if (intent != null) {
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (intent2 != null) {
                    String stringExtra = intent.getStringExtra(String.class.getName());
                    if (stringExtra == null) {
                        stringExtra = "0";
                    }
                    c3Var.g0(intent2, stringExtra, 0);
                }
            }
        } catch (Exception unused) {
        }
    }
}

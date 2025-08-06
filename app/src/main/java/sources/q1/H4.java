package q1;

import A.g;
import L0.d;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import top.bienvenido.mundo.manifest.MundoActivity$Companion$STUB;

public final class H4 {

    /* renamed from: a  reason: collision with root package name */
    public static final H4 f3904a = new Object();

    public static d a(Intent intent) {
        Intent intent2;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || (intent2 = (Intent) extras.getParcelable("android.intent.extra.INTENT")) == null) {
                return null;
            }
            return new d(intent2, extras.getBinder(C0354g3.class.getName()), extras.getString(String.class.getName()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Intent b(Intent intent, int i2, C0354g3 g3Var, boolean z2, String str) {
        String str2 = MundoActivity$Companion$STUB.class.getName() + i2;
        Intent intent2 = new Intent();
        String str3 = C0394n1.b;
        if (z2) {
            str2 = g.h(str2, "H");
        }
        Intent component = intent2.setComponent(new ComponentName(str3, str2));
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.INTENT", intent);
        bundle.putBinder(C0354g3.class.getName(), g3Var);
        if (str != null) {
            bundle.putString(String.class.getName(), str);
        }
        bundle.putString("user", g3Var.f4102c.f3963c);
        return component.putExtras(bundle).setType(String.valueOf(intent.filterHashCode()));
    }
}

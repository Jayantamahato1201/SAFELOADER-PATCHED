package q1;

import A.g;
import L0.e;
import T0.p;
import U0.h;
import U0.k;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import top.bienvenido.mundo.manifest.MundoIntermediary;
import top.bienvenido.mundo.manifest.MundoReceiver;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public final /* synthetic */ class K extends h implements p {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f3927n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i2, Object obj, Class cls, String str, String str2, int i3, int i4) {
        super(i2, obj, cls, str, str2, i3);
        this.f3927n = i4;
    }

    public final Object d(Object obj, Object obj2) {
        switch (this.f3927n) {
            case 0:
                String str = (String) obj2;
                ((H4) this.f763g).getClass();
                Intent intent = new Intent(C0394n1.f4143a, MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", (Intent) obj);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                return intent.putExtras(bundle);
            case 1:
                String str2 = (String) obj2;
                ((H4) this.f763g).getClass();
                Intent putExtra = new Intent().setComponent(new ComponentName(C0394n1.b, MundoService$Companion$STUB.class.getName())).putExtra("android.intent.extra.INTENT", (Intent) obj);
                if (str2 != null) {
                    putExtra.putExtra("user", str2);
                }
                return putExtra;
            case 2:
                Intent intent2 = (Intent) obj;
                String str3 = (String) obj2;
                ((H4) this.f763g).getClass();
                if (intent2.getComponent() == null && intent2.getPackage() == null) {
                    return null;
                }
                String str4 = C0394n1.b;
                Intent putExtra2 = new Intent(g.h(str4, ".mundo.receiver.stub")).setComponent(new ComponentName(str4, MundoReceiver.class.getName())).putExtra("android.intent.extra.INTENT", intent2);
                if (str3 == null) {
                    return putExtra2;
                }
                putExtra2.putExtra(String.class.getName(), str3);
                return putExtra2;
            case 3:
                ((k) this.f763g).j((ResolveInfo) obj, (ActivityInfo) obj2);
                return e.f591c;
            case 4:
                ((k) this.f763g).j((ResolveInfo) obj, (ProviderInfo) obj2);
                return e.f591c;
            case 5:
                ((k) this.f763g).j((ResolveInfo) obj, (ActivityInfo) obj2);
                return e.f591c;
            case 6:
                ((k) this.f763g).j((ResolveInfo) obj, (ServiceInfo) obj2);
                return e.f591c;
            case 7:
                ((k) this.f763g).j((ResolveInfo) obj, (ActivityInfo) obj2);
                return e.f591c;
            case 8:
                ((k) this.f763g).j((ResolveInfo) obj, (ProviderInfo) obj2);
                return e.f591c;
            default:
                ((k) this.f763g).j((ResolveInfo) obj, (ServiceInfo) obj2);
                return e.f591c;
        }
    }
}

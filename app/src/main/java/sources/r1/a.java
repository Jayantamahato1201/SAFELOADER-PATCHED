package r1;

import L0.e;
import T0.l;
import U0.i;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import j1.D;
import java.util.ArrayList;
import q1.H;
import top.bienvenido.mundo.manifest.MundoIntermediary;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ Intent f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ D f4431g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MundoIntermediary f4432h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Intent f4433i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4434j;

    public /* synthetic */ a(Intent intent, D d2, MundoIntermediary mundoIntermediary, Intent intent2, ArrayList arrayList) {
        this.f = intent;
        this.f4431g = d2;
        this.f4432h = mundoIntermediary;
        this.f4433i = intent2;
        this.f4434j = arrayList;
    }

    public final Object e(Object obj) {
        int i2 = MundoIntermediary.f4722a;
        for (ResolveInfo resolveInfo : ((PackageManager) obj).queryIntentActivities(this.f, 131072)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            int hashCode = new ComponentName(activityInfo.packageName, activityInfo.name).hashCode();
            D d2 = this.f4431g;
            if (H.a(d2.b, hashCode, d2.f3206a) < 0 && (!i.a(activityInfo.packageName, this.f4432h.getPackageName()) || !i.a(this.f4433i.getScheme(), "fbconnect"))) {
                this.f4434j.add(activityInfo);
            }
        }
        return e.f591c;
    }
}

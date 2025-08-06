package q1;

import U0.k;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

public final /* synthetic */ class H2 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final H2 f3902m = new k(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}

package q1;

import U0.k;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: q1.v1  reason: case insensitive filesystem */
public final /* synthetic */ class C0441v1 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0441v1 f4220m = new k(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}

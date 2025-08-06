package q1;

import U0.k;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: q1.p2  reason: case insensitive filesystem */
public final /* synthetic */ class C0407p2 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0407p2 f4164m = new k(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}

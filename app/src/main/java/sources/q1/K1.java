package q1;

import U0.k;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;

public final /* synthetic */ class K1 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final K1 f3928m = new k(ResolveInfo.class, "serviceInfo", "getServiceInfo()Landroid/content/pm/ServiceInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
    }
}

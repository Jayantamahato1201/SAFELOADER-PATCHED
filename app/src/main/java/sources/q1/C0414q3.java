package q1;

import U0.k;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;

/* renamed from: q1.q3  reason: case insensitive filesystem */
public final /* synthetic */ class C0414q3 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0414q3 f4179m = new k(ResolveInfo.class, "serviceInfo", "getServiceInfo()Landroid/content/pm/ServiceInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
    }
}

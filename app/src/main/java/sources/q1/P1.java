package q1;

import U0.k;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;

public final /* synthetic */ class P1 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final P1 f3956m = new k(ResolveInfo.class, "providerInfo", "getProviderInfo()Landroid/content/pm/ProviderInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).providerInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
    }
}

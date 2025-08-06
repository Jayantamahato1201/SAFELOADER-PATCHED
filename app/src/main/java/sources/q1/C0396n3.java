package q1;

import U0.k;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;

/* renamed from: q1.n3  reason: case insensitive filesystem */
public final /* synthetic */ class C0396n3 extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0396n3 f4147m = new k(ResolveInfo.class, "providerInfo", "getProviderInfo()Landroid/content/pm/ProviderInfo;");

    public final Object i(Object obj) {
        return ((ResolveInfo) obj).providerInfo;
    }

    public final void j(Object obj, Object obj2) {
        ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
    }
}

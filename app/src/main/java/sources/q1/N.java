package q1;

import U0.k;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;

public final /* synthetic */ class N extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final N f3939m = new N();

    public N() {
        super(PackageParser.Provider.class, "info", "getInfo()Landroid/content/pm/ProviderInfo;");
    }

    public final Object i(Object obj) {
        return ((PackageParser.Provider) obj).info;
    }

    public final void j(Object obj, Object obj2) {
        ((PackageParser.Provider) obj).info = (ProviderInfo) obj2;
    }
}

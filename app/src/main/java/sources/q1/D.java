package q1;

import U0.k;
import android.content.pm.PackageParser;
import android.content.pm.ServiceInfo;

public final /* synthetic */ class D extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final D f3870m = new D();

    public D() {
        super(PackageParser.Service.class, "info", "getInfo()Landroid/content/pm/ServiceInfo;");
    }

    public final Object i(Object obj) {
        return ((PackageParser.Service) obj).info;
    }

    public final void j(Object obj, Object obj2) {
        ((PackageParser.Service) obj).info = (ServiceInfo) obj2;
    }
}

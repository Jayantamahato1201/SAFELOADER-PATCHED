package q1;

import U0.k;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;

/* renamed from: q1.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0314a extends k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0314a f4046m = new C0314a();

    public C0314a() {
        super(PackageParser.Activity.class, "info", "getInfo()Landroid/content/pm/ActivityInfo;");
    }

    public final Object i(Object obj) {
        return ((PackageParser.Activity) obj).info;
    }

    public final void j(Object obj, Object obj2) {
        ((PackageParser.Activity) obj).info = (ActivityInfo) obj2;
    }
}

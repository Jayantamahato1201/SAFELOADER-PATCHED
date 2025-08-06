package q1;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class X3 extends C0463z {

    /* renamed from: c  reason: collision with root package name */
    public final PackageInfo f4034c;

    /* renamed from: d  reason: collision with root package name */
    public ApplicationInfo f4035d;

    /* renamed from: e  reason: collision with root package name */
    public M f4036e = H.f3885a;
    public C0389m2 f = C0389m2.b;

    /* renamed from: g  reason: collision with root package name */
    public final C0418r2 f4037g = new C0418r2(this);

    public X3(PackageInfo packageInfo, ApplicationInfo applicationInfo) {
        super(packageInfo.packageName, new C0436u2(1));
        this.f4034c = packageInfo;
        this.f4035d = applicationInfo;
    }

    public X3(PackageInfo packageInfo, ApplicationInfo applicationInfo, C0436u2 u2Var) {
        super(packageInfo.packageName, u2Var);
        this.f4034c = packageInfo;
        this.f4035d = applicationInfo;
    }
}

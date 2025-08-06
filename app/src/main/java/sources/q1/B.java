package q1;

import L0.e;
import T0.l;
import U0.h;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;

public final /* synthetic */ class B extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f3863n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i2, Object obj, Class cls, String str, String str2, int i3, int i4) {
        super(i2, obj, cls, str, str2, i3);
        this.f3863n = i4;
    }

    public final Object e(Object obj) {
        switch (this.f3863n) {
            case 0:
                PackageInfo packageInfo = (PackageInfo) obj;
                ((C0444v4) this.f763g).getClass();
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && C0444v4.b(applicationInfo)) {
                    C0444v4.a(packageInfo.activities, applicationInfo);
                    C0444v4.a(packageInfo.receivers, applicationInfo);
                    C0444v4.a(packageInfo.services, applicationInfo);
                    C0444v4.a(packageInfo.providers, applicationInfo);
                }
                return e.f591c;
            case 1:
                ((C0444v4) this.f763g).getClass();
                return Boolean.valueOf(C0444v4.b((ApplicationInfo) obj));
            case 2:
                ((K2) this.f763g).getClass();
                return (ActivityInfo) K2.S0((ComponentName) obj);
            case 3:
                ((K2) this.f763g).getClass();
                return (ProviderInfo) K2.S0((ComponentName) obj);
            case 4:
                ((K2) this.f763g).getClass();
                return (ActivityInfo) K2.S0((ComponentName) obj);
            case 5:
                ((K2) this.f763g).getClass();
                return (ServiceInfo) K2.S0((ComponentName) obj);
            default:
                ((I2) this.f763g).getClass();
                I2.b(obj);
                return e.f591c;
        }
    }
}

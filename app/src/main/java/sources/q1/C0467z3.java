package q1;

import T0.p;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: q1.z3  reason: case insensitive filesystem */
public final class C0467z3 implements M {

    /* renamed from: a  reason: collision with root package name */
    public final O2 f4258a;
    public final O2 b;

    /* renamed from: c  reason: collision with root package name */
    public final C0437u3 f4259c;

    /* renamed from: d  reason: collision with root package name */
    public final C0348f3 f4260d;

    public C0467z3(PackageParser.Package packageR) {
        this.f4258a = new O2(this, packageR.activities);
        this.b = new O2(this, packageR.receivers);
        this.f4259c = new C0437u3(this, packageR.services);
        this.f4260d = new C0348f3(this, packageR.providers);
    }

    public static final ResolveInfo a(C0467z3 z3Var, ComponentInfo componentInfo, p pVar, PackageParser.IntentInfo intentInfo, int i2, int i3) {
        z3Var.getClass();
        if (!componentInfo.enabled && (i2 & 512) == 0) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        if ((i2 & 64) != 0) {
            resolveInfo.filter = intentInfo;
        }
        resolveInfo.match = i3;
        resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
        resolveInfo.priority = intentInfo.getPriority();
        resolveInfo.icon = intentInfo.icon;
        resolveInfo.preferredOrder = 0;
        resolveInfo.labelRes = intentInfo.labelRes;
        resolveInfo.isDefault = intentInfo.hasDefault;
        pVar.d(resolveInfo, componentInfo);
        return resolveInfo;
    }

    public final List b(Intent intent, String str, int i2) {
        boolean z2;
        C0437u3 u3Var = this.f4259c;
        u3Var.getClass();
        if ((65536 & i2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return u3Var.b(intent, str, z2, i2);
    }

    public final List c(Intent intent, String str, int i2) {
        boolean z2;
        O2 o2 = this.f4258a;
        o2.getClass();
        if ((65536 & i2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return o2.b(intent, str, z2, i2);
    }

    public final List d(Intent intent, String str, int i2) {
        boolean z2;
        C0348f3 f3Var = this.f4260d;
        f3Var.getClass();
        if ((65536 & i2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return f3Var.b(intent, str, z2, i2);
    }

    public final List e(Intent intent, String str, int i2) {
        boolean z2;
        O2 o2 = this.b;
        o2.getClass();
        if ((65536 & i2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return o2.b(intent, str, z2, i2);
    }
}

package q1;

import T0.l;
import T0.q;
import U0.h;
import java.lang.reflect.Method;

public final class L extends Y0 {
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3932c;

    /* renamed from: d  reason: collision with root package name */
    public final h f3933d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(int i2) {
        super(1);
        this.b = i2;
        switch (i2) {
            case 1:
                super(1);
                this.f3932c = X.f4030n;
                this.f3933d = new B(1, C0444v4.f4223a, C0444v4.class, "modifyApplicationInfo", "modifyApplicationInfo(Landroid/content/pm/ApplicationInfo;)Z", 0, 1);
                return;
            default:
                this.f3932c = G.f3883n;
                this.f3933d = new B(1, C0444v4.f4223a, C0444v4.class, "modifyPackageInfo", "modifyPackageInfo(Landroid/content/pm/PackageInfo;)V", 0, 0);
                return;
        }
    }

    public Object a(Object obj, Method method, Object[] objArr) {
        switch (this.b) {
            case 0:
                C0369j0.d(C0369j0.b, objArr);
                return super.a(obj, method, objArr);
            default:
                return super.a(obj, method, objArr);
        }
    }

    public final l d() {
        switch (this.b) {
            case 0:
                return (B) this.f3933d;
            default:
                return (B) this.f3933d;
        }
    }

    public final q e() {
        switch (this.b) {
            case 0:
                return (G) this.f3932c;
            default:
                return (X) this.f3932c;
        }
    }
}

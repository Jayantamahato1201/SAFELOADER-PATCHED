package q1;

import android.app.IActivityManager;
import android.content.pm.UserInfo;
import android.util.Singleton;
import java.lang.reflect.Constructor;

/* renamed from: q1.r4  reason: case insensitive filesystem */
public final class C0420r4 extends V4 {
    public static final C0420r4 b = new V4();

    public final void b() {
        UserInfo userInfo;
        this.f4021a = C0458y0.b;
        Singleton singleton = P2.f3957a;
        C0412q1 a2 = a("activity", (IActivityManager) singleton.get());
        if (a2 != null) {
            C0 c02 = C0329c2.f4068a;
            C0329c2.f4068a.c(singleton, a2.f4176d);
            C0408p3 p3Var = C0408p3.f4165d;
            C0413q2 q2Var = a2.f4174a;
            q2Var.b(972810068, p3Var);
            G3.f3884d.d(a2);
            q2Var.b(343899992, new C0376k1(3));
            a2.a(new int[]{1342909549, 1418030008, -379822753}, new C0376k1(3));
            q2Var.b(1849706483, new C0376k1(3));
            q2Var.b(699379795, new C0376k1(3));
            q2Var.b(1930712422, new C0376k1(3));
            q2Var.b(-1531153537, new C0376k1(3));
            q2Var.b(39551382, new C0376k1(3));
            q2Var.b(1743087205, new X4(2));
            Class<UserInfo> cls = UserInfo.class;
            try {
                Class cls2 = Integer.TYPE;
                Constructor<UserInfo> declaredConstructor = cls.getDeclaredConstructor(new Class[]{cls2, String.class, cls2});
                declaredConstructor.setAccessible(true);
                userInfo = declaredConstructor.newInstance(new Object[]{0, "Admin", 1});
            } catch (Exception unused) {
                userInfo = null;
            }
            q2Var.b(-38994002, new C0357h0((Object) userInfo));
            a2.a(new int[]{686218487, -409205432}, C0468z4.f4261c);
            a2.a(new int[]{1155315389, -1433640877}, new C0376k1(3));
            a2.a(new int[]{-1039717966, -1479937474}, new C0376k1(3));
            q2Var.b(1102112331, new C0376k1(3));
            Z0 z0 = Z0.f4043d;
            q2Var.b(-506172825, z0);
            boolean z2 = T4.f4001g;
            if (z2) {
                q2Var.b(-1576113007, z0);
            }
            boolean z3 = T4.f4002h;
            if (z3) {
                q2Var.b(1875811945, z0);
            }
            if (T4.f4006l) {
                q2Var.b(-1554828183, C0458y0.f4243c);
            } else {
                q2Var.b(-18665309, C0458y0.f4243c);
            }
            q2Var.b(-135772109, C0458y0.f4244d);
            if (z3) {
                a2.a(new int[]{-546387422, 131012258}, C0458y0.f4243c);
                if (T4.f4003i) {
                    q2Var.b(86032032, new C0376k1(3));
                }
            } else if (!z2) {
                q2Var.b(463520714, C0409p4.f4172a);
                q2Var.b(1293072352, C0458y0.f4247h);
                q2Var.b(-1666360360, H.f3891i);
                q2Var.b(1770569149, H.f3892j);
                q2Var.b(1349683719, C0376k1.b);
            }
            a2.a(new int[]{2009377951, -745473163}, C0458y0.f4243c);
        }
    }
}

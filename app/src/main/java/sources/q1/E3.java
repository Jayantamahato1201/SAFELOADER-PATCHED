package q1;

import M0.b;
import android.content.pm.UserInfo;
import android.os.PersistableBundle;
import java.util.ArrayList;

public final class E3 extends V4 {
    public static final E3 b = new V4();

    public final void b() {
        UserInfo userInfo;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        C0412q1 c2 = C0388m1.c("user", s3, (String) null);
        if (c2 != null) {
            C0357h0 h0Var = new C0357h0((Object) "user");
            C0413q2 q2Var = c2.f4174a;
            q2Var.b(1811233388, h0Var);
            if (T4.f4002h) {
                userInfo = new UserInfo(0, "user", (String) null, 16387, "android.os.usertype.profile.MANAGED");
            } else {
                userInfo = new UserInfo(0, "user", (String) null, 16387);
            }
            q2Var.b(1967404114, new C0357h0((Object) new ArrayList(new b(new UserInfo[]{userInfo}))));
            c2.a(new int[]{2016450557, 1811096719}, new C0357h0((Object) userInfo));
            q2Var.b(223144277, C0458y0.f4244d);
            if (T4.f3998c) {
                q2Var.b(-255616392, new C0357h0((Object) PersistableBundle.EMPTY));
            }
        }
    }
}

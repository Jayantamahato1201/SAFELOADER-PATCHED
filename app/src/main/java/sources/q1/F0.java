package q1;

import android.app.NotificationManager;
import android.widget.Toast;

public final class F0 extends V4 {
    public static final F0 b = new V4();

    public final void b() {
        C0351g0 g0Var = C0367i4.f4118a;
        C0383l2 l2Var = C0383l2.f4137d;
        this.f4021a = l2Var;
        C0412q1 c2 = C0388m1.c("notification", l2Var, (String) null);
        if (c2 != null) {
            C0 a2 = C0452x0.a(NotificationManager.class, "sService");
            Object obj = c2.f4176d;
            a2.c((Object) null, obj);
            C0452x0.a(Toast.class, "sService").c((Object) null, obj);
            c2.a(new int[]{396339264, 1115161719}, C0458y0.f4248i);
            if (T4.f4000e) {
                C0387m0 m0Var = new C0387m0();
                C0413q2 q2Var = c2.f4174a;
                q2Var.b(-1035691422, m0Var);
                q2Var.b(-282102537, new C0376k1(3));
                q2Var.b(-2041662895, new C0376k1(3));
                q2Var.b(1008472557, new C0376k1(3));
            }
        }
    }
}

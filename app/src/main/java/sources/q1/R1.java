package q1;

import T0.l;
import com.android.internal.infra.AndroidFuture;

public final class R1 extends V4 {
    public static final R1 b = new V4();

    public final void b() {
        L3 l3;
        boolean z2 = T4.f4003i;
        if (!z2 || T4.f4004j) {
            l3 = C0458y0.f4243c;
        } else {
            l3 = new C1();
        }
        this.f4021a = l3;
        C0412q1 c2 = C0388m1.c("shortcut", l3, (String) null);
        if (c2 != null) {
            if (T4.f4004j) {
                Object obj = new Object();
                C0413q2 q2Var = c2.f4174a;
                q2Var.b(451961580, obj);
                q2Var.b(532289435, new Object());
                c2.a(new int[]{-822057436, 501628912, -658792913}, C0458y0.f4246g);
                l lVar = C0459y1.f4250a;
                c2.a(new int[]{-2037178825, -329985383}, new C0357h0((Object) M1.f3937a));
            } else if (z2) {
                L3 l32 = C0458y0.f4242a;
                l lVar2 = C0459y1.f4250a;
                c2.a(new int[]{-329985383, -2037178825}, new C0357h0((Object) AndroidFuture.completedFuture(M1.f3937a)));
                c2.a(new int[]{-658792913, 501628912, 451961580, -822057436}, new C0357h0((Object) AndroidFuture.completedFuture(Boolean.FALSE)));
            }
        }
    }
}

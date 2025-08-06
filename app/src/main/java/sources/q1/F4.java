package q1;

public final class F4 extends V4 {
    public static final F4 b = new V4();

    public final void b() {
        String str;
        C0 c02;
        this.f4021a = C0458y0.f4243c;
        Object a2 = C0452x0.c("android.app.ActivityTaskManager", "IActivityTaskManagerSingleton").a((Object) null);
        if (a2 != null) {
            C0413q2 q2Var = C0388m1.f4140a;
            C0412q1 c2 = C0388m1.c("activity_task", this.f4021a, (String) null);
            if (c2 != null) {
                C0 c03 = C0329c2.f4068a;
                C0329c2.f4068a.c(a2, c2.f4176d);
                if (T4.f4010p) {
                    if (!T4.f4009o || !T4.f4003i) {
                        str = "com.huawei.android.app.HwActivityTaskManager";
                    } else {
                        str = "com.hihonor.android.app.HwActivityTaskManager";
                    }
                    try {
                        c02 = C0452x0.b(Class.forName(str), "getService", H.f3886c);
                    } catch (Exception unused) {
                        c02 = C0.f3864a;
                    }
                    c02.b((Object) null, new Object[0]);
                }
                G3.f3884d.d(c2);
                boolean z2 = T4.f4003i;
                C0413q2 q2Var2 = c2.f4174a;
                if (!z2) {
                    q2Var2.b(463520714, C0409p4.f4172a);
                    q2Var2.b(1293072352, C0458y0.f4247h);
                    q2Var2.b(-1666360360, H.f3891i);
                    q2Var2.b(1770569149, H.f3892j);
                    q2Var2.b(1349683719, C0376k1.b);
                    q2Var2.b(-1111243300, C0352g1.f4099a);
                }
                q2Var2.b(-516686740, new C0342e3(1));
            }
        }
    }
}

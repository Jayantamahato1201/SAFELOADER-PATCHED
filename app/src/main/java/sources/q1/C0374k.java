package q1;

/* renamed from: q1.k  reason: case insensitive filesystem */
public final class C0374k extends V4 {
    public static final C0374k b = new V4();

    public final void b() {
        Object obj;
        C0412q1 a2;
        String str;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Class[] clsArr = H.f3886c;
            Object b2 = C0452x0.b(cls, "getWindowSession", clsArr).b((Object) null, new Object[0]);
            if (b2 != null) {
                C0412q1 q1Var = new C0412q1(b2, s3);
                C0 a3 = C0452x0.a(cls, "sWindowSession");
                obj = q1Var.f4176d;
                a3.c((Object) null, obj);
                q1Var.a(new int[]{96417, -52475205, -920924064, -554281187, -129352154, 716732643}, new C0344f());
            } else {
                obj = null;
            }
            Object b3 = C0452x0.b(cls, "getWindowManagerService", clsArr).b((Object) null, new Object[0]);
            if (b3 != null && (a2 = a("window", b3)) != null) {
                C0 a4 = C0452x0.a(cls, "sWindowManagerService");
                Object obj2 = a2.f4176d;
                a4.c((Object) null, obj2);
                if (!T4.b) {
                    str = "com.android.internal.policy.impl.";
                } else {
                    str = "com.android.internal.policy.";
                }
                C0452x0.c(str + "PhoneWindow$WindowManagerHolder", "sWindowManager").c((Object) null, obj2);
                if (obj != null) {
                    a2.a(new int[]{1788161260, 1284670607, 1009054699}, new C0357h0(obj));
                }
            }
        } catch (Exception unused) {
        }
    }
}

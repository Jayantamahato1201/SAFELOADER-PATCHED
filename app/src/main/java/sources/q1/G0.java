package q1;

public final class G0 extends V4 {
    public static final G0 b = new V4();

    public final void b() {
        C0376k1 k1Var = new C0376k1(3);
        this.f4021a = k1Var;
        C0412q1 c2 = C0388m1.c("input_method", k1Var, (String) null);
        if (c2 != null) {
            boolean z2 = T4.f4005k;
            Object obj = c2.f4176d;
            if (z2) {
                C0452x0.c("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "sServiceCache").c((Object) null, obj);
                return;
            }
            ((C0) new C0351g0("mService").f4098c).c(C0394n1.f4143a.getSystemService("input_method"), obj);
        }
    }
}

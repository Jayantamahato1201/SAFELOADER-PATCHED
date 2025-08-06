package q1;

import android.content.IntentFilter;

public final class U2 extends U0 {
    public final Object a(IntentFilter intentFilter, int i2, int i3) {
        return (C0450w4) intentFilter;
    }

    public final void d(IntentFilter intentFilter) {
        C0450w4 w4Var = (C0450w4) intentFilter;
        synchronized (this) {
            super.d(w4Var);
        }
    }

    public final void f(C0450w4 w4Var) {
        synchronized (this) {
            super.f(w4Var);
        }
    }

    public final boolean g(String str, IntentFilter intentFilter) {
        C0450w4 w4Var = (C0450w4) intentFilter;
        if (str == null || str.equals(w4Var.f4234g)) {
            return true;
        }
        return false;
    }

    public final int h(IntentFilter intentFilter) {
        return ((C0450w4) intentFilter).f.f.hashCode();
    }
}

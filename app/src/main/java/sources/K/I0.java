package k;

import I.O;
import java.util.WeakHashMap;

public final class I0 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ L0 f3362g;

    public /* synthetic */ I0(L0 l02, int i2) {
        this.f = i2;
        this.f3362g = l02;
    }

    public final void run() {
        L0 l02 = this.f3362g;
        switch (this.f) {
            case 0:
                C0280z0 z0Var = l02.f3371c;
                if (z0Var != null) {
                    z0Var.setListSelectionHidden(true);
                    z0Var.requestLayout();
                    return;
                }
                return;
            default:
                C0280z0 z0Var2 = l02.f3371c;
                if (z0Var2 != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    if (z0Var2.isAttachedToWindow() && l02.f3371c.getCount() > l02.f3371c.getChildCount() && l02.f3371c.getChildCount() <= l02.f3380m) {
                        l02.f3393z.setInputMethodMode(2);
                        l02.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

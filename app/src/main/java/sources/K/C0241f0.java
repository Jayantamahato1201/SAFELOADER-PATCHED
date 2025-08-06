package k;

import I.C0024p;
import I.O;
import I.r0;
import I.t0;
import J.v;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.C0306a;
import q1.C0372j3;
import q1.C0413q2;
import q1.Q2;
import v.d;

/* renamed from: k.f0  reason: case insensitive filesystem */
public class C0241f0 implements C0239e0, v, C0306a, C0024p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3459a;

    public /* synthetic */ C0241f0(Object obj) {
        this.f3459a = obj;
    }

    public boolean a(View view) {
        int i2;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3459a;
        boolean z2 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = O.f393a;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        int i3 = swipeDismissBehavior.f1843d;
        if ((i3 != 0 || !z2) && (i3 != 1 || z2)) {
            i2 = view.getWidth();
        } else {
            i2 = -view.getWidth();
        }
        O.j(view, i2);
        view.setAlpha(0.0f);
        return true;
    }

    public t0 c(View view, t0 t0Var) {
        boolean z2;
        boolean z3;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3459a;
        if (!Objects.equals(coordinatorLayout.f1100n, t0Var)) {
            coordinatorLayout.f1100n = t0Var;
            if (t0Var.d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.f1101o = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            coordinatorLayout.setWillNotDraw(z3);
            r0 r0Var = t0Var.f464a;
            if (!r0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = O.f393a;
                    if (childAt.getFitsSystemWindows() && ((d) childAt.getLayoutParams()).f4729a != null && r0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return t0Var;
    }

    public synchronized Object e(int i2) {
        return ((C0413q2) this.f3459a).a(i2);
    }

    public synchronized void f(int i2, Q2 q2) {
        ((C0413q2) this.f3459a).b(i2, q2);
    }

    public synchronized void g(int i2) {
        ((C0413q2) this.f3459a).c(i2);
    }

    public C0241f0(int i2) {
        switch (i2) {
            case 4:
                this.f3459a = new C0372j3();
                return;
            default:
                this.f3459a = new C0413q2(0);
                return;
        }
    }

    public void b(int i2) {
    }

    public void d(int i2) {
    }
}

package f0;

import Q0.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.F  reason: case insensitive filesystem */
public final class C0147F extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final View f2620a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f2621c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2622d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2623e;
    public boolean f = false;

    public C0147F(View view, int i2) {
        this.f2620a = view;
        this.b = i2;
        this.f2621c = (ViewGroup) view.getParent();
        this.f2622d = true;
        h(true);
    }

    public final void a(m mVar) {
        throw null;
    }

    public final void b(m mVar) {
    }

    public final void c(m mVar) {
        mVar.x(this);
    }

    public final void d() {
        h(false);
        if (!this.f) {
            w.b(this.f2620a, this.b);
        }
    }

    public final void e(m mVar) {
        mVar.x(this);
    }

    public final void g() {
        h(true);
        if (!this.f) {
            w.b(this.f2620a, 0);
        }
    }

    public final void h(boolean z2) {
        ViewGroup viewGroup;
        if (this.f2622d && this.f2623e != z2 && (viewGroup = this.f2621c) != null) {
            this.f2623e = z2;
            l.c0(viewGroup, z2);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            w.b(this.f2620a, this.b);
            ViewGroup viewGroup = this.f2621c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            w.b(this.f2620a, 0);
            ViewGroup viewGroup = this.f2621c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            if (!this.f) {
                w.b(this.f2620a, this.b);
                ViewGroup viewGroup = this.f2621c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }

    public final void f(m mVar) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}

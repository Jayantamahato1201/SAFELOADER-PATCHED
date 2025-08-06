package I;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f0.m;
import n.C0289b;

public final class Z extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f404a = 0;
    public final /* synthetic */ Object b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f405c;

    public Z(g0 g0Var, View view) {
        this.b = g0Var;
        this.f405c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f404a) {
            case 0:
                ((g0) this.b).f430a.d(1.0f);
                b0.e((View) this.f405c);
                return;
            default:
                ((C0289b) this.b).remove(animator);
                ((m) this.f405c).f2677s.remove(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f404a) {
            case 1:
                ((m) this.f405c).f2677s.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public Z(m mVar, C0289b bVar) {
        this.f405c = mVar;
        this.b = bVar;
    }
}

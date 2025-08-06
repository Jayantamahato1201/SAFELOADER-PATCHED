package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b0.k  reason: case insensitive filesystem */
public final class C0087k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1717a = false;
    public final /* synthetic */ C0088l b;

    public C0087k(C0088l lVar) {
        this.b = lVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1717a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f1717a) {
            this.f1717a = false;
            return;
        }
        C0088l lVar = this.b;
        if (((Float) lVar.f1744z.getAnimatedValue()).floatValue() == 0.0f) {
            lVar.f1719A = 0;
            lVar.f(0);
            return;
        }
        lVar.f1719A = 2;
        lVar.f1737s.invalidate();
    }
}

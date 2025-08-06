package H0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: H0.d  reason: case insensitive filesystem */
public final class C0003d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f283a;
    public final /* synthetic */ C0004e b;

    public /* synthetic */ C0003d(C0004e eVar, int i2) {
        this.f283a = i2;
        this.b = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.f283a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f283a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

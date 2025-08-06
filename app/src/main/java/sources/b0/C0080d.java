package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b0.d  reason: case insensitive filesystem */
public final class C0080d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1659a = 1;
    public final /* synthetic */ Y b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1660c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1661d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0085i f1662e;

    public C0080d(C0085i iVar, Y y2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1662e = iVar;
        this.b = y2;
        this.f1661d = viewPropertyAnimator;
        this.f1660c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f1659a) {
            case 1:
                this.f1660c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f1659a) {
            case 0:
                this.f1661d.setListener((Animator.AnimatorListener) null);
                this.f1660c.setAlpha(1.0f);
                C0085i iVar = this.f1662e;
                Y y2 = this.b;
                iVar.c(y2);
                iVar.f1711q.remove(y2);
                iVar.i();
                return;
            default:
                this.f1661d.setListener((Animator.AnimatorListener) null);
                C0085i iVar2 = this.f1662e;
                Y y3 = this.b;
                iVar2.c(y3);
                iVar2.f1709o.remove(y3);
                iVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f1659a) {
            case 0:
                this.f1662e.getClass();
                return;
            default:
                this.f1662e.getClass();
                return;
        }
    }

    public C0080d(C0085i iVar, Y y2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1662e = iVar;
        this.b = y2;
        this.f1660c = view;
        this.f1661d = viewPropertyAnimator;
    }
}

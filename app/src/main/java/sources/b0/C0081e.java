package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b0.e  reason: case insensitive filesystem */
public final class C0081e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Y f1664a;
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1665c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1666d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1667e;
    public final /* synthetic */ C0085i f;

    public C0081e(C0085i iVar, Y y2, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = iVar;
        this.f1664a = y2;
        this.b = i2;
        this.f1665c = view;
        this.f1666d = i3;
        this.f1667e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i2 = this.b;
        View view = this.f1665c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1666d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1667e.setListener((Animator.AnimatorListener) null);
        C0085i iVar = this.f;
        Y y2 = this.f1664a;
        iVar.c(y2);
        iVar.f1710p.remove(y2);
        iVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}

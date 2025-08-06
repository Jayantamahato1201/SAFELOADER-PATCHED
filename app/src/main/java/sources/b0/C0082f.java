package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b0.f  reason: case insensitive filesystem */
public final class C0082f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1671a;
    public final /* synthetic */ C0083g b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1672c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f1673d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0085i f1674e;

    public /* synthetic */ C0082f(C0085i iVar, C0083g gVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f1671a = i2;
        this.f1674e = iVar;
        this.b = gVar;
        this.f1672c = viewPropertyAnimator;
        this.f1673d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f1671a) {
            case 0:
                this.f1672c.setListener((Animator.AnimatorListener) null);
                View view = this.f1673d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0083g gVar = this.b;
                Y y2 = gVar.f1684a;
                C0085i iVar = this.f1674e;
                iVar.c(y2);
                iVar.f1712r.remove(gVar.f1684a);
                iVar.i();
                return;
            default:
                this.f1672c.setListener((Animator.AnimatorListener) null);
                View view2 = this.f1673d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0083g gVar2 = this.b;
                Y y3 = gVar2.b;
                C0085i iVar2 = this.f1674e;
                iVar2.c(y3);
                iVar2.f1712r.remove(gVar2.b);
                iVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f1671a) {
            case 0:
                Y y2 = this.b.f1684a;
                this.f1674e.getClass();
                return;
            default:
                Y y3 = this.b.b;
                this.f1674e.getClass();
                return;
        }
    }
}

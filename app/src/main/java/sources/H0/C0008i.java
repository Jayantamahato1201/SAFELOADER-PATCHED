package H0;

import A.j;
import android.animation.ValueAnimator;
import android.view.View;
import e.C0129K;

/* renamed from: H0.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0008i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f296a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0008i(j jVar, View view) {
        this.b = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f296a) {
            case 0:
                n nVar = (n) this.b;
                nVar.getClass();
                nVar.f342d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((C0129K) ((j) this.b).b).f2461o.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ C0008i(n nVar) {
        this.b = nVar;
    }
}

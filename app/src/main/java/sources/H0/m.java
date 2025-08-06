package H0;

import I.W;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import g0.C0169e;
import java.util.ArrayList;
import r0.a;
import r0.c;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f300a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f300a = i2;
        this.b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f300a) {
            case 1:
                ((W) this.b).b();
                return;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.f959w = null;
                actionBarOverlayLayout.f947k = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f300a) {
            case 0:
                n nVar = (n) this.b;
                nVar.q();
                nVar.f313r.start();
                return;
            case 1:
                ((W) this.b).a();
                return;
            case 2:
                ((f0.m) this.b).m();
                animator.removeListener(this);
                return;
            case 3:
                C0169e eVar = (C0169e) this.b;
                ArrayList arrayList = new ArrayList(eVar.f2808e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((a) arrayList.get(i2)).b.f4421o;
                    if (colorStateList != null) {
                        B.a.h(eVar, colorStateList);
                    }
                }
                return;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.f959w = null;
                actionBarOverlayLayout.f947k = false;
                return;
            default:
                ((HideBottomViewOnScrollBehavior) this.b).f1840h = null;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f300a) {
            case 1:
                ((W) this.b).c();
                return;
            case 3:
                C0169e eVar = (C0169e) this.b;
                ArrayList arrayList = new ArrayList(eVar.f2808e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar = ((a) arrayList.get(i2)).b;
                    ColorStateList colorStateList = cVar.f4421o;
                    if (colorStateList != null) {
                        B.a.g(eVar, colorStateList.getColorForState(cVar.f4425s, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public m(W w2, View view) {
        this.f300a = 1;
        this.b = w2;
    }
}

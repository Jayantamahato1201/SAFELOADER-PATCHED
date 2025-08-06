package f0;

import E0.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import com.cheatbox.R;

/* renamed from: f0.g  reason: case insensitive filesystem */
public final class C0156g extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final View f2650a;
    public boolean b = false;

    public C0156g(View view) {
        this.f2650a = view;
    }

    public final void a(m mVar) {
        throw null;
    }

    public final void c(m mVar) {
    }

    public final void d() {
        float f;
        View view = this.f2650a;
        if (view.getVisibility() == 0) {
            f = w.f2693a.f(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.MT_Bin, Float.valueOf(f));
    }

    public final void e(m mVar) {
        throw null;
    }

    public final void g() {
        this.f2650a.setTag(R.id.MT_Bin, (Object) null);
    }

    public final void onAnimationCancel(Animator animator) {
        w.f2693a.n(this.f2650a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f2650a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.b;
        View view = this.f2650a;
        if (z3) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z2) {
            e eVar = w.f2693a;
            eVar.n(view, 1.0f);
            eVar.getClass();
        }
    }

    public final void b(m mVar) {
    }

    public final void f(m mVar) {
    }
}

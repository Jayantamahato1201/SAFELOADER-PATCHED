package I;

import H0.m;
import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f399a;

    public V(View view) {
        this.f399a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f399a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f399a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f399a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(W w2) {
        View view = (View) this.f399a.get();
        if (view == null) {
            return;
        }
        if (w2 != null) {
            view.animate().setListener(new m(w2, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f) {
        View view = (View) this.f399a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}

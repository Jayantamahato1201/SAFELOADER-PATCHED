package I;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: I.s  reason: case insensitive filesystem */
public final class C0026s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f462a;
    public ViewTreeObserver b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f463c;

    public C0026s(View view, Runnable runnable) {
        this.f462a = view;
        this.b = view.getViewTreeObserver();
        this.f463c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            C0026s sVar = new C0026s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.b.isAlive();
        View view = this.f462a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f463c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.b.isAlive();
        View view2 = this.f462a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}

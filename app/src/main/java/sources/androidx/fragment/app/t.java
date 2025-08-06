package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

public final class t implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f1393a;
    public final /* synthetic */ u b;

    public t(u uVar, I i2) {
        this.b = uVar;
        this.f1393a = i2;
    }

    public final void onViewAttachedToWindow(View view) {
        I i2 = this.f1393a;
        i2.k();
        C0051h.f((ViewGroup) i2.f1252c.f1346E.getParent(), this.b.f1394a.B()).e();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

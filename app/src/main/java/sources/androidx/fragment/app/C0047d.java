package androidx.fragment.app;

import H0.E;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
public final class C0047d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1305a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0048e f1306c;

    public C0047d(ViewGroup viewGroup, View view, C0048e eVar) {
        this.f1305a = viewGroup;
        this.b = view;
        this.f1306c = eVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1305a.post(new E(5, this));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

package androidx.fragment.app;

import A.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
public final class C0046c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1301a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1302c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f1303d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0048e f1304e;

    public C0046c(ViewGroup viewGroup, View view, boolean z2, N n2, C0048e eVar) {
        this.f1301a = viewGroup;
        this.b = view;
        this.f1302c = z2;
        this.f1303d = n2;
        this.f1304e = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1301a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        if (this.f1302c) {
            g.a(view, this.f1303d.f1266a);
        }
        this.f1304e.d();
    }
}

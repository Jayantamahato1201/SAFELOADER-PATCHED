package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.cheatbox.R;

/* renamed from: f0.G  reason: case insensitive filesystem */
public final class C0148G extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2624a;
    public final View b;

    /* renamed from: c  reason: collision with root package name */
    public final View f2625c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2626d = true;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0157h f2627e;

    public C0148G(C0157h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f2627e = hVar;
        this.f2624a = viewGroup;
        this.b = view;
        this.f2625c = view2;
    }

    public final void a(m mVar) {
        throw null;
    }

    public final void b(m mVar) {
    }

    public final void c(m mVar) {
        mVar.x(this);
    }

    public final void e(m mVar) {
        mVar.x(this);
    }

    public final void f(m mVar) {
        if (this.f2626d) {
            h();
        }
    }

    public final void h() {
        this.f2625c.setTag(R.id.MT_Bin, (Object) null);
        this.f2624a.getOverlay().remove(this.b);
        this.f2626d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public final void onAnimationPause(Animator animator) {
        this.f2624a.getOverlay().remove(this.b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.f2624a.getOverlay().add(view);
        } else {
            this.f2627e.c();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2625c;
            View view2 = this.b;
            view.setTag(R.id.MT_Bin, view2);
            this.f2624a.getOverlay().add(view2);
            this.f2626d = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            h();
        }
    }

    public final void d() {
    }

    public final void g() {
    }
}

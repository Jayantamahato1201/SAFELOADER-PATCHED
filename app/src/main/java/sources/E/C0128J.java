package e;

import F.c;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.r;
import i.C0176a;
import i.C0184i;
import j.C0207k;
import j.C0209m;
import java.lang.ref.WeakReference;
import k.C0248j;

/* renamed from: e.J  reason: case insensitive filesystem */
public final class C0128J extends C0176a implements C0207k {

    /* renamed from: c  reason: collision with root package name */
    public final Context f2444c;

    /* renamed from: d  reason: collision with root package name */
    public final C0209m f2445d;

    /* renamed from: e  reason: collision with root package name */
    public c f2446e;
    public WeakReference f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0129K f2447g;

    public C0128J(C0129K k2, Context context, c cVar) {
        this.f2447g = k2;
        this.f2444c = context;
        this.f2446e = cVar;
        C0209m mVar = new C0209m(context);
        mVar.f3113l = 1;
        this.f2445d = mVar;
        mVar.f3107e = this;
    }

    public final void a() {
        C0129K k2 = this.f2447g;
        if (k2.f2466t == this) {
            if (k2.f2450A) {
                k2.f2467u = this;
                k2.f2468v = this.f2446e;
            } else {
                this.f2446e.D(this);
            }
            this.f2446e = null;
            k2.f0(false);
            ActionBarContextView actionBarContextView = k2.f2463q;
            if (actionBarContextView.f927k == null) {
                actionBarContextView.e();
            }
            k2.f2460n.setHideOnContentScrollEnabled(k2.f2454F);
            k2.f2466t = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final C0209m c() {
        return this.f2445d;
    }

    public final MenuInflater d() {
        return new C0184i(this.f2444c);
    }

    public final void e(C0209m mVar) {
        if (this.f2446e != null) {
            i();
            C0248j jVar = this.f2447g.f2463q.f921d;
            if (jVar != null) {
                jVar.l();
            }
        }
    }

    public final boolean f(C0209m mVar, MenuItem menuItem) {
        c cVar = this.f2446e;
        if (cVar != null) {
            return ((r) cVar.b).c(this, menuItem);
        }
        return false;
    }

    public final CharSequence g() {
        return this.f2447g.f2463q.getSubtitle();
    }

    public final CharSequence h() {
        return this.f2447g.f2463q.getTitle();
    }

    public final void i() {
        if (this.f2447g.f2466t == this) {
            C0209m mVar = this.f2445d;
            mVar.w();
            try {
                this.f2446e.E(this, mVar);
            } finally {
                mVar.v();
            }
        }
    }

    public final boolean j() {
        return this.f2447g.f2463q.f935s;
    }

    public final void k(View view) {
        this.f2447g.f2463q.setCustomView(view);
        this.f = new WeakReference(view);
    }

    public final void l(int i2) {
        m(this.f2447g.f2458l.getResources().getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.f2447g.f2463q.setSubtitle(charSequence);
    }

    public final void n(int i2) {
        o(this.f2447g.f2458l.getResources().getString(i2));
    }

    public final void o(CharSequence charSequence) {
        this.f2447g.f2463q.setTitle(charSequence);
    }

    public final void p(boolean z2) {
        this.b = z2;
        this.f2447g.f2463q.setTitleOptional(z2);
    }
}

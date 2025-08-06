package i;

import F.c;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.r;
import j.C0207k;
import j.C0209m;
import java.lang.ref.WeakReference;
import k.C0248j;

/* renamed from: i.e  reason: case insensitive filesystem */
public final class C0180e extends C0176a implements C0207k {

    /* renamed from: c  reason: collision with root package name */
    public Context f2930c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f2931d;

    /* renamed from: e  reason: collision with root package name */
    public c f2932e;
    public WeakReference f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2933g;

    /* renamed from: h  reason: collision with root package name */
    public C0209m f2934h;

    public final void a() {
        if (!this.f2933g) {
            this.f2933g = true;
            this.f2932e.D(this);
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
        return this.f2934h;
    }

    public final MenuInflater d() {
        return new C0184i(this.f2931d.getContext());
    }

    public final void e(C0209m mVar) {
        i();
        C0248j jVar = this.f2931d.f921d;
        if (jVar != null) {
            jVar.l();
        }
    }

    public final boolean f(C0209m mVar, MenuItem menuItem) {
        return ((r) this.f2932e.b).c(this, menuItem);
    }

    public final CharSequence g() {
        return this.f2931d.getSubtitle();
    }

    public final CharSequence h() {
        return this.f2931d.getTitle();
    }

    public final void i() {
        this.f2932e.E(this, this.f2934h);
    }

    public final boolean j() {
        return this.f2931d.f935s;
    }

    public final void k(View view) {
        WeakReference weakReference;
        this.f2931d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f = weakReference;
    }

    public final void l(int i2) {
        m(this.f2930c.getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.f2931d.setSubtitle(charSequence);
    }

    public final void n(int i2) {
        o(this.f2930c.getString(i2));
    }

    public final void o(CharSequence charSequence) {
        this.f2931d.setTitle(charSequence);
    }

    public final void p(boolean z2) {
        this.b = z2;
        this.f2931d.setTitleOptional(z2);
    }
}

package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.C0193C;

/* renamed from: i.f  reason: case insensitive filesystem */
public final class C0181f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2935a;
    public final C0176a b;

    public C0181f(Context context, C0176a aVar) {
        this.f2935a = context;
        this.b = aVar;
    }

    public final void finish() {
        this.b.a();
    }

    public final View getCustomView() {
        return this.b.b();
    }

    public final Menu getMenu() {
        return new C0193C(this.f2935a, this.b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    public final Object getTag() {
        return this.b.f2925a;
    }

    public final CharSequence getTitle() {
        return this.b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    public final void invalidate() {
        this.b.i();
    }

    public final boolean isTitleOptional() {
        return this.b.j();
    }

    public final void setCustomView(View view) {
        this.b.k(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.b.f2925a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z2) {
        this.b.p(z2);
    }

    public final void setSubtitle(int i2) {
        this.b.l(i2);
    }

    public final void setTitle(int i2) {
        this.b.n(i2);
    }
}

package j;

import A.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: j.F  reason: case insensitive filesystem */
public final class C0196F extends C0209m implements SubMenu {

    /* renamed from: A  reason: collision with root package name */
    public final C0211o f3047A;

    /* renamed from: z  reason: collision with root package name */
    public final C0209m f3048z;

    public C0196F(Context context, C0209m mVar, C0211o oVar) {
        super(context);
        this.f3048z = mVar;
        this.f3047A = oVar;
    }

    public final boolean d(C0211o oVar) {
        return this.f3048z.d(oVar);
    }

    public final boolean e(C0209m mVar, MenuItem menuItem) {
        if (super.e(mVar, menuItem) || this.f3048z.e(mVar, menuItem)) {
            return true;
        }
        return false;
    }

    public final boolean f(C0211o oVar) {
        return this.f3048z.f(oVar);
    }

    public final MenuItem getItem() {
        return this.f3047A;
    }

    public final String j() {
        int i2;
        C0211o oVar = this.f3047A;
        if (oVar != null) {
            i2 = oVar.f3131a;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        return g.f(i2, "android:menu:actionviewstates:");
    }

    public final C0209m k() {
        return this.f3048z.k();
    }

    public final boolean m() {
        return this.f3048z.m();
    }

    public final boolean n() {
        return this.f3048z.n();
    }

    public final boolean o() {
        return this.f3048z.o();
    }

    public final void setGroupDividerEnabled(boolean z2) {
        this.f3048z.setGroupDividerEnabled(z2);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f3047A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z2) {
        this.f3048z.setQwertyMode(z2);
    }

    public final SubMenu setHeaderIcon(int i2) {
        u(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i2) {
        u(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i2) {
        this.f3047A.setIcon(i2);
        return this;
    }
}

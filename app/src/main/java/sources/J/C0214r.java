package j;

import android.view.MenuItem;

/* renamed from: j.r  reason: case insensitive filesystem */
public final class C0214r implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3158a;
    public final /* synthetic */ C0216t b;

    public C0214r(C0216t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = tVar;
        this.f3158a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3158a.onMenuItemActionCollapse(this.b.g(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3158a.onMenuItemActionExpand(this.b.g(menuItem));
    }
}

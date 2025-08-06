package j;

import android.view.MenuItem;

/* renamed from: j.s  reason: case insensitive filesystem */
public final class C0215s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3159a;
    public final /* synthetic */ C0216t b;

    public C0215s(C0216t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = tVar;
        this.f3159a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3159a.onMenuItemClick(this.b.g(menuItem));
    }
}

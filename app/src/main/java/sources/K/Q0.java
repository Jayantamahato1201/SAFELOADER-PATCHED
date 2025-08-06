package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import j.C0206j;
import j.C0209m;
import j.C0211o;

public final class Q0 extends C0280z0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f3403m;

    /* renamed from: n  reason: collision with root package name */
    public final int f3404n;

    /* renamed from: o  reason: collision with root package name */
    public M0 f3405o;

    /* renamed from: p  reason: collision with root package name */
    public C0211o f3406p;

    public Q0(Context context, boolean z2) {
        super(context, z2);
        if (1 == P0.a(context.getResources().getConfiguration())) {
            this.f3403m = 21;
            this.f3404n = 22;
            return;
        }
        this.f3403m = 22;
        this.f3404n = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i2;
        C0206j jVar;
        C0211o oVar;
        int pointToPosition;
        int i3;
        if (this.f3405o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                jVar = (C0206j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (C0206j) adapter;
                i2 = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= jVar.getCount()) {
                oVar = null;
            } else {
                oVar = jVar.getItem(i3);
            }
            C0211o oVar2 = this.f3406p;
            if (oVar2 != oVar) {
                C0209m mVar = jVar.f3099a;
                if (oVar2 != null) {
                    this.f3405o.p(mVar, oVar2);
                }
                this.f3406p = oVar;
                if (oVar != null) {
                    this.f3405o.c(mVar, oVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        C0206j jVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3403m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i2 != this.f3404n) {
            return super.onKeyDown(i2, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                jVar = (C0206j) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                jVar = (C0206j) adapter;
            }
            jVar.f3099a.c(false);
            return true;
        }
    }

    public void setHoverListener(M0 m02) {
        this.f3405o = m02;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

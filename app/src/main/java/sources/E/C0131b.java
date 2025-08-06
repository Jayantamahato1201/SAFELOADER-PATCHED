package e;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: e.b  reason: case insensitive filesystem */
public final class C0131b implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2476a;
    public final /* synthetic */ View b;

    public C0131b(View view, View view2) {
        this.f2476a = view;
        this.b = view2;
    }

    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        C0135f.a(absListView, this.f2476a, this.b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}

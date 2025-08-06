package b0;

import I.C0010b;
import J.l;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

public final class a0 extends C0010b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f1648d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f1649e;

    public a0(RecyclerView recyclerView) {
        this.f1648d = recyclerView;
        Z z2 = this.f1649e;
        if (z2 != null) {
            this.f1649e = z2;
        } else {
            this.f1649e = new Z(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f1648d.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().T(accessibilityEvent);
            }
        }
    }

    public final void d(View view, l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f1648d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            J layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            P p2 = recyclerView2.b;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
                lVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
                lVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            V v2 = recyclerView2.f1509c0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(p2, v2), layoutManager.x(p2, v2), false, 0));
        }
    }

    public final boolean g(View view, int i2, Bundle bundle) {
        int i3;
        int i4;
        int i5;
        if (super.g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1648d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            J layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            P p2 = recyclerView2.b;
            if (i2 != 4096) {
                if (i2 != 8192) {
                    i3 = 0;
                    i4 = 0;
                } else {
                    if (recyclerView2.canScrollVertically(-1)) {
                        i4 = -((layoutManager.f1589o - layoutManager.G()) - layoutManager.D());
                    } else {
                        i4 = 0;
                    }
                    if (layoutManager.b.canScrollHorizontally(-1)) {
                        i3 = -((layoutManager.f1588n - layoutManager.E()) - layoutManager.F());
                    }
                }
                if (!(i4 == 0 && i3 == 0)) {
                    layoutManager.b.Z(i3, i4, true);
                    return true;
                }
            } else {
                if (recyclerView2.canScrollVertically(1)) {
                    i5 = (layoutManager.f1589o - layoutManager.G()) - layoutManager.D();
                } else {
                    i5 = 0;
                }
                if (layoutManager.b.canScrollHorizontally(1)) {
                    i3 = (layoutManager.f1588n - layoutManager.E()) - layoutManager.F();
                    layoutManager.b.Z(i3, i4, true);
                    return true;
                }
            }
            i3 = 0;
            layoutManager.b.Z(i3, i4, true);
            return true;
        }
        return false;
    }
}

package b0;

import A.j;
import I.C0010b;
import J.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class Z extends C0010b {

    /* renamed from: d  reason: collision with root package name */
    public final a0 f1644d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f1645e = new WeakHashMap();

    public Z(a0 a0Var) {
        this.f1644d = a0Var;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f409a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final j b(View view) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, l lVar) {
        a0 a0Var = this.f1644d;
        boolean K2 = a0Var.f1648d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        if (!K2) {
            RecyclerView recyclerView = a0Var.f1648d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, lVar);
                C0010b bVar = (C0010b) this.f1645e.get(view);
                if (bVar != null) {
                    bVar.d(view, lVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0010b bVar = (C0010b) this.f1645e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f409a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i2, Bundle bundle) {
        a0 a0Var = this.f1644d;
        if (!a0Var.f1648d.K()) {
            RecyclerView recyclerView = a0Var.f1648d;
            if (recyclerView.getLayoutManager() != null) {
                C0010b bVar = (C0010b) this.f1645e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i2, bundle)) {
                    return true;
                }
                P p2 = recyclerView.getLayoutManager().b.b;
                return false;
            }
        }
        return super.g(view, i2, bundle);
    }

    public final void h(View view, int i2) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            bVar.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0010b bVar = (C0010b) this.f1645e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

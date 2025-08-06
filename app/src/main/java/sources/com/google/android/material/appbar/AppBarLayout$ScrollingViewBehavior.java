package com.google.android.material.appbar;

import A.i;
import I.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.C0219a;
import java.util.ArrayList;
import l0.C0285a;
import v.C0489a;
import v.d;

public class AppBarLayout$ScrollingViewBehavior extends C0285a {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
        }
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2;
        C0489a aVar = ((d) view2.getLayoutParams()).f4729a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i3 = this.b;
            if (i3 == 0) {
                i2 = 0;
            } else {
                i2 = i.l((int) (0.0f * ((float) i3)), 0, i3);
            }
            O.k(view, bottom - i2);
        }
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3194u);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void b(View view) {
    }
}

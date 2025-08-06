package com.google.android.material.transformation;

import I.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.C0489a;

@Deprecated
public abstract class ExpandableBehavior extends C0489a {
    public ExpandableBehavior() {
    }

    public abstract void b(View view);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f393a;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) j2.get(i3);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}

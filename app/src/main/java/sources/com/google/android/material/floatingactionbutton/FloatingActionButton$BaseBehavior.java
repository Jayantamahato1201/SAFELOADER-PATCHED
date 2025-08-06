package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.C0219a;
import v.C0489a;
import v.d;

public class FloatingActionButton$BaseBehavior<T> extends C0489a {
    public FloatingActionButton$BaseBehavior() {
    }

    public final boolean a(View view) {
        throw new ClassCastException();
    }

    public final void c(d dVar) {
        if (dVar.f4734h == 0) {
            dVar.f4734h = 80;
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3180g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}

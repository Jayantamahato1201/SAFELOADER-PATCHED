package com.google.android.material.snackbar;

import A.j;
import E0.e;
import G0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final e f2077h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(2);
        this.f1844e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1843d = 0;
        this.f2077h = eVar;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2077h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (j.f21c == null) {
                    j.f21c = new j(2);
                }
                synchronized (j.f21c.b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (j.f21c == null) {
                j.f21c = new j(2);
            }
            j.f21c.A();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.f2077h.getClass();
        return view instanceof c;
    }
}

package com.google.android.material.behavior;

import I.O;
import J.g;
import R.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import k.C0241f0;
import m0.C0287a;
import v.C0489a;

public class SwipeDismissBehavior<V extends View> extends C0489a {

    /* renamed from: a  reason: collision with root package name */
    public e f1841a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1842c;

    /* renamed from: d  reason: collision with root package name */
    public int f1843d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f1844e = 0.0f;
    public float f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final C0287a f1845g = new C0287a(this);

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (z2) {
            if (this.f1841a == null) {
                this.f1841a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1845g);
            }
            if (this.f1842c || !this.f1841a.p(motionEvent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f393a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O.m(view, 1048576);
            O.i(view, 0);
            if (r(view)) {
                O.n(view, g.f482j, new C0241f0((Object) this));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1841a == null) {
            return false;
        }
        if (this.f1842c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1841a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}

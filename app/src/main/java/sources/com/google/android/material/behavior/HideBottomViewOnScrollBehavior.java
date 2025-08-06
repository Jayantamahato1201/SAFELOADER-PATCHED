package com.google.android.material.behavior;

import A.g;
import H0.m;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cheatbox.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.C0281a;
import t0.C0486a;
import v.C0489a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0489a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f1835a = new LinkedHashSet();
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1836c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f1837d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f1838e;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1839g = 2;

    /* renamed from: h  reason: collision with root package name */
    public ViewPropertyAnimator f1840h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = C0486a.q(view.getContext(), R.attr.MT_Bin, 225);
        this.f1836c = C0486a.q(view.getContext(), R.attr.MT_Bin, 175);
        this.f1837d = C0486a.r(view.getContext(), R.attr.MT_Bin, C0281a.f3624d);
        this.f1838e = C0486a.r(view.getContext(), R.attr.MT_Bin, C0281a.f3623c);
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1835a;
        if (i2 > 0) {
            if (this.f1839g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f1840h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f1839g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    int i5 = this.f;
                    this.f1840h = view.animate().translationY((float) i5).setInterpolator(this.f1838e).setDuration((long) this.f1836c).setListener(new m(5, (Object) this));
                    return;
                }
                throw g.e(it);
            }
        } else if (i2 < 0 && this.f1839g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f1840h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f1839g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f1840h = view.animate().translationY((float) 0).setInterpolator(this.f1837d).setDuration((long) this.b).setListener(new m(5, (Object) this));
                return;
            }
            throw g.e(it2);
        }
    }

    public boolean o(View view, int i2, int i3) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

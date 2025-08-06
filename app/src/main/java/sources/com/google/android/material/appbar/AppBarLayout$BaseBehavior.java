package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import l0.C0285a;

public class AppBarLayout$BaseBehavior<T> extends C0285a {
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f1826c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1827d;

    /* renamed from: e  reason: collision with root package name */
    public int f1828e = -1;
    public VelocityTracker f;

    public AppBarLayout$BaseBehavior() {
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1828e < 0) {
            this.f1828e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i2 = this.f1826c;
            if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                int y2 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y2 - this.f1827d) > this.f1828e) {
                    this.f1827d = y2;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f1826c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        throw new ClassCastException();
    }

    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        throw new ClassCastException();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        throw new ClassCastException();
    }

    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    public final boolean o(View view, int i2, int i3) {
        throw new ClassCastException();
    }

    public final void p(View view, View view2, int i2) {
        throw new ClassCastException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0046
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r6 = 3
            if (r0 == r6) goto L_0x004a
            r6 = 6
            if (r0 == r6) goto L_0x0013
            goto L_0x0058
        L_0x0013:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            int r0 = r7.getPointerId(r6)
            r5.f1826c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f1827d = r6
            goto L_0x0058
        L_0x002d:
            int r0 = r5.f1826c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            goto L_0x0063
        L_0x0036:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f1827d = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L_0x0046:
            android.view.VelocityTracker r0 = r5.f
            if (r0 != 0) goto L_0x0065
        L_0x004a:
            r5.b = r3
            r5.f1826c = r1
            android.view.VelocityTracker r6 = r5.f
            if (r6 == 0) goto L_0x0058
            r6.recycle()
            r6 = 0
            r5.f = r6
        L_0x0058:
            android.view.VelocityTracker r6 = r5.f
            if (r6 == 0) goto L_0x005f
            r6.addMovement(r7)
        L_0x005f:
            boolean r6 = r5.b
            if (r6 != 0) goto L_0x0064
        L_0x0063:
            return r3
        L_0x0064:
            return r2
        L_0x0065:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f
            int r0 = r5.f1826c
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}

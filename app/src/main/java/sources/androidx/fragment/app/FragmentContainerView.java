package androidx.fragment.app;

import I.B;
import I.O;
import I.t0;
import V.a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.cheatbox.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f1236a;
    public ArrayList b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1237c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1238d = true;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1236a == null) {
                this.f1236a = new ArrayList();
            }
            this.f1236a.add(view);
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        C0058o oVar;
        Object tag = view.getTag(R.id.MT_Bin);
        if (tag instanceof C0058o) {
            oVar = (C0058o) tag;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        C0058o oVar;
        Object tag = view.getTag(R.id.MT_Bin);
        if (tag instanceof C0058o) {
            oVar = (C0058o) tag;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        t0 t0Var;
        t0 g2 = t0.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1237c;
        if (onApplyWindowInsetsListener != null) {
            t0Var = t0.g((View) null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = O.f393a;
            WindowInsets f = g2.f();
            if (f != null) {
                WindowInsets b2 = B.b(this, f);
                if (!b2.equals(f)) {
                    g2 = t0.g(this, b2);
                }
            }
            t0Var = g2;
        }
        if (!t0Var.f464a.m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = O.f393a;
                WindowInsets f2 = t0Var.f();
                if (f2 != null) {
                    WindowInsets a2 = B.a(childAt, f2);
                    if (!a2.equals(f2)) {
                        t0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f1238d && this.f1236a != null) {
            for (int i2 = 0; i2 < this.f1236a.size(); i2++) {
                super.drawChild(canvas, (View) this.f1236a.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f1238d || (arrayList = this.f1236a) == null || arrayList.size() <= 0 || !this.f1236a.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f1236a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1238d = true;
            }
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            a(view);
        }
        super.removeDetachedView(view, z2);
    }

    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f1238d = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1237c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}

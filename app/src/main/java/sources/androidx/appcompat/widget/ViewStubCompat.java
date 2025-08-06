package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.a;
import java.lang.ref.WeakReference;
import k.C1;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f1065a = 0;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f1066c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f1067d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2192A, 0, 0);
        this.b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1065a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1065a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1067d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1065a, viewGroup, false);
            int i2 = this.b;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1066c = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1067d;
    }

    public int getLayoutResource() {
        return this.f1065a;
    }

    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.b = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1067d = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f1065a = i2;
    }

    public void setVisibility(int i2) {
        WeakReference weakReference = this.f1066c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public void setOnInflateListener(C1 c1) {
    }
}

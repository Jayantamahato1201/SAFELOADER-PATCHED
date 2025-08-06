package y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import j0.C0219a;
import k.E0;

public abstract class d extends E0 {

    /* renamed from: p  reason: collision with root package name */
    public Drawable f4822p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f4823q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f4824r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public int f4825s = 119;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f4826t = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4827u = false;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int[] iArr = C0219a.f3181h;
        l.a(context, attributeSet, 0, 0);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        l.b(context2, attributeSet2, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
        this.f4825s = obtainStyledAttributes.getInt(1, this.f4825s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f4826t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f4822p;
        if (drawable != null) {
            if (this.f4827u) {
                this.f4827u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f4826t;
                Rect rect = this.f4823q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f4825s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f4824r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f4822p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4822p;
        if (drawable != null && drawable.isStateful()) {
            this.f4822p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f4822p;
    }

    public int getForegroundGravity() {
        return this.f4825s;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4822p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = z2;
        this.f4827u = z3 | this.f4827u;
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f4827u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f4822p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f4822p);
            }
            this.f4822p = drawable;
            this.f4827u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f4825s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.f4825s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f4825s = i2;
            if (i2 == 119 && this.f4822p != null) {
                this.f4822p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f4822p) {
            return true;
        }
        return false;
    }
}

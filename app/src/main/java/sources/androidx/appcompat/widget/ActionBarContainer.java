package androidx.appcompat.widget;

import I.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.cheatbox.R;
import d.a;
import java.util.WeakHashMap;
import k.C0229b;
import k.X0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f912a;
    public View b;

    /* renamed from: c  reason: collision with root package name */
    public View f913c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f914d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f915e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f916g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f917h;

    /* renamed from: i  reason: collision with root package name */
    public final int f918i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0229b bVar = new C0229b(this);
        WeakHashMap weakHashMap = O.f393a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2193a);
        boolean z2 = false;
        this.f914d = obtainStyledAttributes.getDrawable(0);
        this.f915e = obtainStyledAttributes.getDrawable(2);
        this.f918i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.MT_Bin) {
            this.f916g = true;
            this.f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f916g ? this.f914d == null && this.f915e == null : this.f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f914d;
        if (drawable != null && drawable.isStateful()) {
            this.f914d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f915e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f915e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f914d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f915e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.MT_Bin);
        this.f913c = findViewById(R.id.MT_Bin);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f912a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f916g) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f914d == null) {
                z3 = false;
            } else if (this.b.getVisibility() == 0) {
                this.f914d.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            } else {
                View view = this.f913c;
                if (view == null || view.getVisibility() != 0) {
                    this.f914d.setBounds(0, 0, 0, 0);
                } else {
                    this.f914d.setBounds(this.f913c.getLeft(), this.f913c.getTop(), this.f913c.getRight(), this.f913c.getBottom());
                }
            }
            this.f917h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f918i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.b != null) {
            View.MeasureSpec.getMode(i3);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f914d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f914d);
        }
        this.f914d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.b;
            if (view != null) {
                this.f914d.setBounds(view.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f916g ? this.f914d == null && this.f915e == null : this.f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z2 = this.f916g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? this.f914d == null && this.f915e == null : this.f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f915e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f915e);
        }
        this.f915e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f917h && this.f915e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f916g ? this.f914d == null && this.f915e == null : this.f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        int i2;
        this.f912a = z2;
        if (z2) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f914d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f915e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f914d;
        boolean z2 = this.f916g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f915e && this.f917h) {
            return true;
        }
        if ((drawable != this.f || !z2) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(X0 x02) {
    }
}

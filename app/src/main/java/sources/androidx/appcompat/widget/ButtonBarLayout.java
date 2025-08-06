package androidx.appcompat.widget;

import I.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.cheatbox.R;
import d.a;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f975a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f976c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.f2201k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        O.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f975a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f975a);
        }
    }

    private void setStacked(boolean z2) {
        int i2;
        int i3;
        if (this.b == z2) {
            return;
        }
        if (!z2 || this.f975a) {
            this.b = z2;
            setOrientation(z2 ? 1 : 0);
            if (z2) {
                i2 = 8388613;
            } else {
                i2 = 80;
            }
            setGravity(i2);
            View findViewById = findViewById(R.id.MT_Bin);
            if (findViewById != null) {
                if (z2) {
                    i3 = 8;
                } else {
                    i3 = 4;
                }
                findViewById.setVisibility(i3);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i2);
        int i6 = 0;
        if (this.f975a) {
            if (size > this.f976c && this.b) {
                setStacked(false);
            }
            this.f976c = size;
        }
        if (this.b || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f975a && !this.b && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i5 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.b) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    } else if (getChildAt(i8).getVisibility() == 0) {
                        i5 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i5 >= 0) {
                    i6 = getChildAt(i5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i6 = measuredHeight;
                }
            } else {
                i6 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = O.f393a;
        if (getMinimumHeight() != i6) {
            setMinimumHeight(i6);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f975a != z2) {
            this.f975a = z2;
            if (!z2 && this.b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

package com.google.android.material.appbar;

import A.i;
import E0.g;
import I.D;
import I.O;
import J0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b0.C0089m;
import com.cheatbox.R;
import j.C0209m;
import j0.C0219a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import t0.C0486a;
import y0.l;

public class MaterialToolbar extends Toolbar {

    /* renamed from: W  reason: collision with root package name */
    public static final ImageView.ScaleType[] f1829W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R  reason: collision with root package name */
    public Integer f1830R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1831S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f1832T;

    /* renamed from: U  reason: collision with root package name */
    public ImageView.ScaleType f1833U;

    /* renamed from: V  reason: collision with root package name */
    public Boolean f1834V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray f = l.f(context2, attributeSet, C0219a.f3192s, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        if (f.hasValue(2)) {
            setNavigationIconTint(f.getColor(2, -1));
        }
        this.f1831S = f.getBoolean(4, false);
        this.f1832T = f.getBoolean(3, false);
        int i2 = f.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1829W;
            if (i2 < scaleTypeArr.length) {
                this.f1833U = scaleTypeArr[i2];
            }
        }
        if (f.hasValue(0)) {
            this.f1834V = Boolean.valueOf(f.getBoolean(0, false));
        }
        f.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = C0486a.h(background);
        }
        if (colorStateList != null) {
            g gVar = new g();
            gVar.j(colorStateList);
            gVar.h(context2);
            WeakHashMap weakHashMap = O.f393a;
            gVar.i(D.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1833U;
    }

    public Integer getNavigationIconTint() {
        return this.f1830R;
    }

    public final void m(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof C0209m;
        if (z2) {
            ((C0209m) menu).w();
        }
        super.m(i2);
        if (z2) {
            ((C0209m) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            i.r0(this, (g) background);
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f1831S || this.f1832T) {
            ArrayList d2 = l.d(this, getTitle());
            boolean isEmpty = d2.isEmpty();
            C0089m mVar = l.f4846c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d2, mVar);
            }
            ArrayList d3 = l.d(this, getSubtitle());
            if (d3.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d3, mVar);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f1831S && textView != null) {
                    v(textView, pair);
                }
                if (this.f1832T && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1834V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1833U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f1834V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f1834V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1833U != scaleType) {
            this.f1833U = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f1830R == null)) {
            drawable = i.y0(drawable.mutate());
            B.a.g(drawable, this.f1830R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f1830R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f1832T != z2) {
            this.f1832T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f1831S != z2) {
            this.f1831S = z2;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}

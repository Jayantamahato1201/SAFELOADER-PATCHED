package com.google.android.material.internal;

import B.a;
import I.O;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.cheatbox.R;
import com.google.android.material.datepicker.i;
import j.C0191A;
import j.C0211o;
import java.util.WeakHashMap;
import k.D0;
import y0.d;
import z.C0510i;
import z.C0515n;

public class NavigationMenuItemView extends d implements C0191A {

    /* renamed from: G  reason: collision with root package name */
    public static final int[] f2045G = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public FrameLayout f2046A;

    /* renamed from: B  reason: collision with root package name */
    public C0211o f2047B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f2048C;
    public boolean D;

    /* renamed from: E  reason: collision with root package name */
    public Drawable f2049E;

    /* renamed from: F  reason: collision with root package name */
    public final i f2050F;

    /* renamed from: v  reason: collision with root package name */
    public int f2051v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2052w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2053x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f2054y = true;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f2055z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i iVar = new i(3, this);
        this.f2050F = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.MT_Bin, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.MT_Bin));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.MT_Bin);
        this.f2055z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.p(checkedTextView, iVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2046A == null) {
                this.f2046A = (FrameLayout) ((ViewStub) findViewById(R.id.MT_Bin)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2046A.removeAllViews();
            this.f2046A.addView(view);
        }
    }

    public final void d(C0211o oVar) {
        int i2;
        StateListDrawable stateListDrawable;
        this.f2047B = oVar;
        int i3 = oVar.f3131a;
        if (i3 > 0) {
            setId(i3);
        }
        if (oVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2045G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = O.f393a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f3134e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f3145q);
        l.Z(this, oVar.f3146r);
        C0211o oVar2 = this.f2047B;
        CharSequence charSequence = oVar2.f3134e;
        CheckedTextView checkedTextView = this.f2055z;
        if (charSequence == null && oVar2.getIcon() == null && this.f2047B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2046A;
            if (frameLayout != null) {
                D0 d02 = (D0) frameLayout.getLayoutParams();
                d02.width = -1;
                this.f2046A.setLayoutParams(d02);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2046A;
        if (frameLayout2 != null) {
            D0 d03 = (D0) frameLayout2.getLayoutParams();
            d03.width = -2;
            this.f2046A.setLayoutParams(d03);
        }
    }

    public C0211o getItemData() {
        return this.f2047B;
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0211o oVar = this.f2047B;
        if (oVar != null && oVar.isCheckable() && this.f2047B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2045G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2053x != z2) {
            this.f2053x = z2;
            this.f2050F.h(this.f2055z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        int i2;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2055z;
        checkedTextView.setChecked(z2);
        Typeface typeface = checkedTextView.getTypeface();
        if (!z2 || !this.f2054y) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        checkedTextView.setTypeface(typeface, i2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = A.i.y0(drawable).mutate();
                a.h(drawable, this.f2048C);
            }
            int i2 = this.f2051v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f2052w) {
            if (this.f2049E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = C0515n.f4870a;
                Drawable a2 = C0510i.a(resources, R.drawable.MT_Bin, theme);
                this.f2049E = a2;
                if (a2 != null) {
                    int i3 = this.f2051v;
                    a2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f2049E;
        }
        this.f2055z.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i2) {
        this.f2055z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f2051v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z2;
        this.f2048C = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.D = z2;
        C0211o oVar = this.f2047B;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f2055z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2052w = z2;
    }

    public void setTextAppearance(int i2) {
        A.i.s0(this.f2055z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2055z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2055z.setText(charSequence);
    }
}

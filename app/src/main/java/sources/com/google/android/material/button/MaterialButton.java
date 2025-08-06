package com.google.android.material.button;

import A.g;
import A.i;
import C0.d;
import E0.j;
import E0.k;
import E0.v;
import I.O;
import J0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.cheatbox.R;
import j0.C0219a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0241f0;
import k.C0260p;
import p0.C0306a;
import p0.b;
import p0.c;
import t0.C0486a;
import y0.l;

public class MaterialButton extends C0260p implements Checkable, v {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f1899r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f1900s = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public final c f1901d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f1902e = new LinkedHashSet();
    public C0306a f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1903g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1904h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1905i;

    /* renamed from: j  reason: collision with root package name */
    public String f1906j;

    /* renamed from: k  reason: collision with root package name */
    public int f1907k;

    /* renamed from: l  reason: collision with root package name */
    public int f1908l;

    /* renamed from: m  reason: collision with root package name */
    public int f1909m;

    /* renamed from: n  reason: collision with root package name */
    public int f1910n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1911o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1912p;

    /* renamed from: q  reason: collision with root package name */
    public int f1913q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin), attributeSet, R.attr.MT_Bin);
        boolean z2 = false;
        this.f1911o = false;
        this.f1912p = false;
        Context context2 = getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray f2 = l.f(context2, attributeSet2, C0219a.f3183j, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        this.f1910n = f2.getDimensionPixelSize(12, 0);
        int i2 = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1903g = l.g(i2, mode);
        this.f1904h = i.H(getContext(), f2, 14);
        this.f1905i = i.K(getContext(), f2, 10);
        this.f1913q = f2.getInteger(11, 1);
        this.f1907k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet2, R.attr.MT_Bin, R.style.MT_Bin).a());
        this.f1901d = cVar;
        cVar.f3781c = f2.getDimensionPixelOffset(1, 0);
        cVar.f3782d = f2.getDimensionPixelOffset(2, 0);
        cVar.f3783e = f2.getDimensionPixelOffset(3, 0);
        cVar.f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f3784g = dimensionPixelSize;
            float f3 = (float) dimensionPixelSize;
            j e2 = cVar.b.e();
            e2.f142e = new E0.a(f3);
            e2.f = new E0.a(f3);
            e2.f143g = new E0.a(f3);
            e2.f144h = new E0.a(f3);
            cVar.c(e2.a());
            cVar.f3793p = true;
        }
        cVar.f3785h = f2.getDimensionPixelSize(20, 0);
        cVar.f3786i = l.g(f2.getInt(7, -1), mode);
        cVar.f3787j = i.H(getContext(), f2, 6);
        cVar.f3788k = i.H(getContext(), f2, 19);
        cVar.f3789l = i.H(getContext(), f2, 16);
        cVar.f3794q = f2.getBoolean(5, false);
        cVar.f3797t = f2.getDimensionPixelSize(9, 0);
        cVar.f3795r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = O.f393a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f3792o = true;
            setSupportBackgroundTintList(cVar.f3787j);
            setSupportBackgroundTintMode(cVar.f3786i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f3781c, paddingTop + cVar.f3783e, paddingEnd + cVar.f3782d, paddingBottom + cVar.f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1910n);
        c(this.f1905i != null ? true : z2);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil((double) f2);
    }

    public final boolean a() {
        c cVar = this.f1901d;
        if (cVar == null || cVar.f3792o) {
            return false;
        }
        return true;
    }

    public final void b() {
        int i2 = this.f1913q;
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 2)) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f1905i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f1905i, (Drawable) null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.f1905i, (Drawable) null, (Drawable) null);
        }
    }

    public final void c(boolean z2) {
        Drawable drawable = this.f1905i;
        if (drawable != null) {
            Drawable mutate = i.y0(drawable).mutate();
            this.f1905i = mutate;
            B.a.h(mutate, this.f1904h);
            PorterDuff.Mode mode = this.f1903g;
            if (mode != null) {
                B.a.i(this.f1905i, mode);
            }
            int i2 = this.f1907k;
            if (i2 == 0) {
                i2 = this.f1905i.getIntrinsicWidth();
            }
            int i3 = this.f1907k;
            if (i3 == 0) {
                i3 = this.f1905i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1905i;
            int i4 = this.f1908l;
            int i5 = this.f1909m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f1905i.setVisible(true, z2);
        }
        if (z2) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i6 = this.f1913q;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f1905i) || (((i6 == 3 || i6 == 4) && drawable5 != this.f1905i) || ((i6 == 16 || i6 == 32) && drawable4 != this.f1905i))) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        boolean z2;
        boolean z3;
        if (this.f1905i != null && getLayout() != null) {
            int i4 = this.f1913q;
            boolean z4 = true;
            if (i4 == 1 || i4 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || i4 == 3 || i4 == 4) {
                this.f1909m = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i5 = this.f1913q;
                if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f1908l = 0;
                    c(false);
                    return;
                }
                int i6 = this.f1907k;
                if (i6 == 0) {
                    i6 = this.f1905i.getIntrinsicWidth();
                }
                int textLayoutWidth = i2 - getTextLayoutWidth();
                WeakHashMap weakHashMap = O.f393a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1910n) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f1913q != 4) {
                    z4 = false;
                }
                if (z3 != z4) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f1908l != paddingEnd) {
                    this.f1908l = paddingEnd;
                    c(false);
                }
            } else if (i4 == 16 || i4 == 32) {
                this.f1908l = 0;
                if (i4 == 16) {
                    this.f1909m = 0;
                    c(false);
                    return;
                }
                int i7 = this.f1907k;
                if (i7 == 0) {
                    i7 = this.f1905i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - i7) - this.f1910n) - getPaddingBottom()) / 2);
                if (this.f1909m != max) {
                    this.f1909m = max;
                    c(false);
                }
            }
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f1906j)) {
            return this.f1906j;
        }
        c cVar = this.f1901d;
        if (cVar == null || !cVar.f3794q) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f1901d.f3784g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1905i;
    }

    public int getIconGravity() {
        return this.f1913q;
    }

    public int getIconPadding() {
        return this.f1910n;
    }

    public int getIconSize() {
        return this.f1907k;
    }

    public ColorStateList getIconTint() {
        return this.f1904h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1903g;
    }

    public int getInsetBottom() {
        return this.f1901d.f;
    }

    public int getInsetTop() {
        return this.f1901d.f3783e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f1901d.f3789l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f1901d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f1901d.f3788k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f1901d.f3785h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f1901d.f3787j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f1901d.f3786i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f1911o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            i.r0(this, this.f1901d.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        c cVar = this.f1901d;
        if (cVar != null && cVar.f3794q) {
            View.mergeDrawableStates(onCreateDrawableState, f1899r);
        }
        if (this.f1911o) {
            View.mergeDrawableStates(onCreateDrawableState, f1900s);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1911o);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f1901d;
        if (cVar == null || !cVar.f3794q) {
            z2 = false;
        } else {
            z2 = true;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setChecked(this.f1911o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f1901d) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = cVar.f3790m;
            if (drawable != null) {
                drawable.setBounds(cVar.f3781c, cVar.f3783e, i7 - cVar.f3782d, i6 - cVar.f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f);
        setChecked(bVar.f3777h);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, Q.b, p0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new Q.b(super.onSaveInstanceState());
        bVar.f3777h = this.f1911o;
        return bVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f1901d.f3795r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1905i != null) {
            if (this.f1905i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1906j = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            c cVar = this.f1901d;
            cVar.f3792o = true;
            ColorStateList colorStateList = cVar.f3787j;
            MaterialButton materialButton = cVar.f3780a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.f3786i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = Q0.l.v(getContext(), i2);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.f1901d.f3794q = z2;
        }
    }

    public void setChecked(boolean z2) {
        c cVar = this.f1901d;
        if (cVar != null && cVar.f3794q && isEnabled() && this.f1911o != z2) {
            this.f1911o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1911o;
                if (!materialButtonToggleGroup.f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (!this.f1912p) {
                this.f1912p = true;
                Iterator it = this.f1902e.iterator();
                if (!it.hasNext()) {
                    this.f1912p = false;
                    return;
                }
                throw g.e(it);
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (a()) {
            c cVar = this.f1901d;
            if (!cVar.f3793p || cVar.f3784g != i2) {
                cVar.f3784g = i2;
                cVar.f3793p = true;
                float f2 = (float) i2;
                j e2 = cVar.b.e();
                e2.f142e = new E0.a(f2);
                e2.f = new E0.a(f2);
                e2.f143g = new E0.a(f2);
                e2.f144h = new E0.a(f2);
                cVar.c(e2.a());
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (a()) {
            this.f1901d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1905i != drawable) {
            this.f1905i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f1913q != i2) {
            this.f1913q = i2;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f1910n != i2) {
            this.f1910n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = Q0.l.v(getContext(), i2);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1907k != i2) {
            this.f1907k = i2;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1904h != colorStateList) {
            this.f1904h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1903g != mode) {
            this.f1903g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C0486a.g(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        c cVar = this.f1901d;
        cVar.d(cVar.f3783e, i2);
    }

    public void setInsetTop(int i2) {
        c cVar = this.f1901d;
        cVar.d(i2, cVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C0306a aVar) {
        this.f = aVar;
    }

    public void setPressed(boolean z2) {
        C0306a aVar = this.f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C0241f0) aVar).f3459a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.f3789l != colorStateList) {
                cVar.f3789l = colorStateList;
                boolean z2 = c.f3778u;
                MaterialButton materialButton = cVar.f3780a;
                if (z2 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(d.a(colorStateList));
                } else if (!z2 && (materialButton.getBackground() instanceof C0.b)) {
                    ((C0.b) materialButton.getBackground()).setTintList(d.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (a()) {
            setRippleColor(C0486a.g(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (a()) {
            this.f1901d.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            c cVar = this.f1901d;
            cVar.f3791n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.f3788k != colorStateList) {
                cVar.f3788k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (a()) {
            setStrokeColor(C0486a.g(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.f3785h != i2) {
                cVar.f3785h = i2;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.f3787j != colorStateList) {
                cVar.f3787j = colorStateList;
                if (cVar.b(false) != null) {
                    B.a.h(cVar.b(false), cVar.f3787j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f1901d;
            if (cVar.f3786i != mode) {
                cVar.f3786i = mode;
                if (cVar.b(false) != null && cVar.f3786i != null) {
                    B.a.i(cVar.b(false), cVar.f3786i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f1901d.f3795r = z2;
    }

    public final void toggle() {
        setChecked(!this.f1911o);
    }
}

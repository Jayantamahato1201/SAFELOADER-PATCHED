package com.google.android.material.imageview;

import A.i;
import A.j;
import E0.g;
import E0.k;
import E0.l;
import E0.m;
import E0.v;
import J0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.cheatbox.R;
import j0.C0219a;
import k.C0279z;
import t0.C0486a;
import x0.C0497a;

public class ShapeableImageView extends C0279z implements v {

    /* renamed from: d  reason: collision with root package name */
    public final m f2024d = l.f159a;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f2025e;
    public final RectF f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f2026g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f2027h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f2028i = new Path();

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2029j;

    /* renamed from: k  reason: collision with root package name */
    public g f2030k;

    /* renamed from: l  reason: collision with root package name */
    public k f2031l;

    /* renamed from: m  reason: collision with root package name */
    public float f2032m;

    /* renamed from: n  reason: collision with root package name */
    public final Path f2033n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2034o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2035p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2036q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2037r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2038s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2039t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2040u = false;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.MT_Bin), attributeSet, 0);
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f2027h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2025e = new RectF();
        this.f = new RectF();
        this.f2033n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0219a.f3196w, 0, R.style.MT_Bin);
        setLayerType(2, (Paint) null);
        this.f2029j = i.H(context2, obtainStyledAttributes, 9);
        this.f2032m = (float) obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2034o = dimensionPixelSize;
        this.f2035p = dimensionPixelSize;
        this.f2036q = dimensionPixelSize;
        this.f2037r = dimensionPixelSize;
        this.f2034o = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f2035p = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f2036q = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f2037r = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f2038s = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f2039t = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2026g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f2031l = k.b(context2, attributeSet, 0, R.style.MT_Bin).a();
        setOutlineProvider(new C0497a(this));
    }

    public final boolean c() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i2, int i3) {
        RectF rectF = this.f2025e;
        rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i2 - getPaddingRight()), (float) (i3 - getPaddingBottom()));
        k kVar = this.f2031l;
        Path path = this.f2028i;
        this.f2024d.a(kVar, 1.0f, rectF, (j) null, path);
        Path path2 = this.f2033n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, (float) i2, (float) i3);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f2037r;
    }

    public final int getContentPaddingEnd() {
        int i2 = this.f2039t;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (c()) {
            return this.f2034o;
        }
        return this.f2036q;
    }

    public int getContentPaddingLeft() {
        int i2;
        int i3;
        if (!(this.f2038s == Integer.MIN_VALUE && this.f2039t == Integer.MIN_VALUE)) {
            if (c() && (i3 = this.f2039t) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!c() && (i2 = this.f2038s) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f2034o;
    }

    public int getContentPaddingRight() {
        int i2;
        int i3;
        if (!(this.f2038s == Integer.MIN_VALUE && this.f2039t == Integer.MIN_VALUE)) {
            if (c() && (i3 = this.f2038s) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!c() && (i2 = this.f2039t) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f2036q;
    }

    public final int getContentPaddingStart() {
        int i2 = this.f2038s;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (c()) {
            return this.f2036q;
        }
        return this.f2034o;
    }

    public int getContentPaddingTop() {
        return this.f2035p;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public k getShapeAppearanceModel() {
        return this.f2031l;
    }

    public ColorStateList getStrokeColor() {
        return this.f2029j;
    }

    public float getStrokeWidth() {
        return this.f2032m;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f2033n, this.f2027h);
        if (this.f2029j != null) {
            Paint paint = this.f2026g;
            paint.setStrokeWidth(this.f2032m);
            int colorForState = this.f2029j.getColorForState(getDrawableState(), this.f2029j.getDefaultColor());
            if (this.f2032m > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f2028i, paint);
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f2040u && isLayoutDirectionResolved()) {
            this.f2040u = true;
            if (!isPaddingRelative() && this.f2038s == Integer.MIN_VALUE && this.f2039t == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d(i2, i3);
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(getContentPaddingLeft() + i2, getContentPaddingTop() + i3, getContentPaddingRight() + i4, getContentPaddingBottom() + i5);
    }

    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(getContentPaddingStart() + i2, getContentPaddingTop() + i3, getContentPaddingEnd() + i4, getContentPaddingBottom() + i5);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f2031l = kVar;
        g gVar = this.f2030k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f2029j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i2) {
        setStrokeColor(C0486a.g(getContext(), i2));
    }

    public void setStrokeWidth(float f2) {
        if (this.f2032m != f2) {
            this.f2032m = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i2) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i2));
    }
}

package com.google.android.material.chip;

import A.i;
import E0.k;
import E0.v;
import G.j;
import I.C0010b;
import I.O;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0262q;
import k0.C0282b;
import s0.b;
import s0.d;
import s0.e;
import s0.f;
import t0.C0486a;

public class Chip extends C0262q implements e, v, Checkable {

    /* renamed from: w  reason: collision with root package name */
    public static final Rect f1926w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f1927x = {16842913};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f1928y = {16842911};

    /* renamed from: e  reason: collision with root package name */
    public f f1929e;
    public InsetDrawable f;

    /* renamed from: g  reason: collision with root package name */
    public RippleDrawable f1930g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f1931h;

    /* renamed from: i  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1932i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1933j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1934k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1935l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1936m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1937n;

    /* renamed from: o  reason: collision with root package name */
    public int f1938o;

    /* renamed from: p  reason: collision with root package name */
    public int f1939p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f1940q;

    /* renamed from: r  reason: collision with root package name */
    public final d f1941r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1942s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f1943t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f1944u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final b f1945v = new b(0, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r2 = r20
            r4 = 2130903231(0x7f0300bf, float:1.7413274E38)
            r1 = 2131756051(0x7f100413, float:1.9142999E38)
            r3 = r19
            android.content.Context r1 = J0.a.a(r3, r2, r4, r1)
            r0.<init>(r1, r2, r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f1943t = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f1944u = r1
            s0.b r1 = new s0.b
            r3 = 0
            r1.<init>(r3, r0)
            r0.f1945v = r1
            android.content.Context r7 = r0.getContext()
            r8 = 1
            r9 = 8388627(0x800013, float:1.175497E-38)
            if (r2 != 0) goto L_0x0034
            goto L_0x0094
        L_0x0034:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "background"
            java.lang.String r3 = r2.getAttributeValue(r1, r3)
            java.lang.String r5 = "Chip"
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r5, r3)
        L_0x0045:
            java.lang.String r3 = "drawableLeft"
            java.lang.String r3 = r2.getAttributeValue(r1, r3)
            if (r3 != 0) goto L_0x03d0
            java.lang.String r3 = "drawableStart"
            java.lang.String r3 = r2.getAttributeValue(r1, r3)
            if (r3 != 0) goto L_0x03c8
            java.lang.String r3 = "drawableEnd"
            java.lang.String r3 = r2.getAttributeValue(r1, r3)
            java.lang.String r6 = "Please set end drawable using R.attr#closeIcon."
            if (r3 != 0) goto L_0x03c2
            java.lang.String r3 = "drawableRight"
            java.lang.String r3 = r2.getAttributeValue(r1, r3)
            if (r3 != 0) goto L_0x03bc
            java.lang.String r3 = "singleLine"
            boolean r3 = r2.getAttributeBooleanValue(r1, r3, r8)
            if (r3 == 0) goto L_0x03b4
            java.lang.String r3 = "lines"
            int r3 = r2.getAttributeIntValue(r1, r3, r8)
            if (r3 != r8) goto L_0x03b4
            java.lang.String r3 = "minLines"
            int r3 = r2.getAttributeIntValue(r1, r3, r8)
            if (r3 != r8) goto L_0x03b4
            java.lang.String r3 = "maxLines"
            int r3 = r2.getAttributeIntValue(r1, r3, r8)
            if (r3 != r8) goto L_0x03b4
            java.lang.String r3 = "gravity"
            int r1 = r2.getAttributeIntValue(r1, r3, r9)
            if (r1 == r9) goto L_0x0094
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r5, r1)
        L_0x0094:
            s0.f r10 = new s0.f
            r10.<init>(r7, r2)
            int[] r3 = j0.C0219a.f3177c
            r11 = 0
            int[] r6 = new int[r11]
            android.content.Context r1 = r10.e0
            r5 = 2131756051(0x7f100413, float:1.9142999E38)
            android.content.res.TypedArray r1 = y0.l.f(r1, r2, r3, r4, r5, r6)
            r12 = 37
            boolean r5 = r1.hasValue(r12)
            r10.f4494E0 = r5
            r5 = 24
            android.content.Context r6 = r10.e0
            android.content.res.ColorStateList r5 = A.i.H(r6, r1, r5)
            android.content.res.ColorStateList r13 = r10.f4537x
            if (r13 == r5) goto L_0x00c4
            r10.f4537x = r5
            int[] r5 = r10.getState()
            r10.onStateChange(r5)
        L_0x00c4:
            r5 = 11
            android.content.res.ColorStateList r5 = A.i.H(r6, r1, r5)
            android.content.res.ColorStateList r13 = r10.f4539y
            if (r13 == r5) goto L_0x00d7
            r10.f4539y = r5
            int[] r5 = r10.getState()
            r10.onStateChange(r5)
        L_0x00d7:
            r5 = 19
            r13 = 0
            float r5 = r1.getDimension(r5, r13)
            float r14 = r10.f4541z
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x00ec
            r10.f4541z = r5
            r10.invalidateSelf()
            r10.u()
        L_0x00ec:
            r5 = 12
            boolean r14 = r1.hasValue(r5)
            if (r14 == 0) goto L_0x00fb
            float r5 = r1.getDimension(r5, r13)
            r10.A(r5)
        L_0x00fb:
            r5 = 22
            android.content.res.ColorStateList r5 = A.i.H(r6, r1, r5)
            r10.F(r5)
            r14 = 23
            float r5 = r1.getDimension(r14, r13)
            r10.G(r5)
            r5 = 36
            android.content.res.ColorStateList r5 = A.i.H(r6, r1, r5)
            r10.P(r5)
            r5 = 5
            java.lang.CharSequence r5 = r1.getText(r5)
            if (r5 != 0) goto L_0x011f
            java.lang.String r5 = ""
        L_0x011f:
            java.lang.CharSequence r15 = r10.f4493E
            boolean r15 = android.text.TextUtils.equals(r15, r5)
            if (r15 != 0) goto L_0x0133
            r10.f4493E = r5
            y0.j r5 = r10.f4525k0
            r5.f4843d = r8
            r10.invalidateSelf()
            r10.u()
        L_0x0133:
            boolean r5 = r1.hasValue(r11)
            if (r5 == 0) goto L_0x0145
            int r5 = r1.getResourceId(r11, r11)
            if (r5 == 0) goto L_0x0145
            B0.d r15 = new B0.d
            r15.<init>(r6, r5)
            goto L_0x0146
        L_0x0145:
            r15 = 0
        L_0x0146:
            float r5 = r15.f68k
            float r5 = r1.getDimension(r8, r5)
            r15.f68k = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 2
            if (r5 >= r14) goto L_0x0159
            android.content.res.ColorStateList r12 = A.i.H(r6, r1, r9)
            r15.f67j = r12
        L_0x0159:
            r10.Q(r15)
            r12 = 3
            int r15 = r1.getInt(r12, r11)
            if (r15 == r8) goto L_0x0172
            if (r15 == r9) goto L_0x016d
            if (r15 == r12) goto L_0x0168
            goto L_0x0176
        L_0x0168:
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r10.f4489B0 = r12
            goto L_0x0176
        L_0x016d:
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.MIDDLE
            r10.f4489B0 = r12
            goto L_0x0176
        L_0x0172:
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.START
            r10.f4489B0 = r12
        L_0x0176:
            r12 = 18
            boolean r12 = r1.getBoolean(r12, r11)
            r10.E(r12)
            java.lang.String r12 = "http://schemas.android.com/apk/res-auto"
            if (r2 == 0) goto L_0x019c
            java.lang.String r15 = "chipIconEnabled"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L_0x019c
            java.lang.String r15 = "chipIconVisible"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 != 0) goto L_0x019c
            r15 = 15
            boolean r15 = r1.getBoolean(r15, r11)
            r10.E(r15)
        L_0x019c:
            r15 = 14
            android.graphics.drawable.Drawable r15 = A.i.K(r6, r1, r15)
            r10.B(r15)
            r15 = 17
            boolean r16 = r1.hasValue(r15)
            if (r16 == 0) goto L_0x01b4
            android.content.res.ColorStateList r15 = A.i.H(r6, r1, r15)
            r10.D(r15)
        L_0x01b4:
            r15 = 16
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r1.getDimension(r15, r9)
            r10.C(r9)
            r9 = 31
            boolean r9 = r1.getBoolean(r9, r11)
            r10.M(r9)
            if (r2 == 0) goto L_0x01e3
            java.lang.String r9 = "closeIconEnabled"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            if (r9 == 0) goto L_0x01e3
            java.lang.String r9 = "closeIconVisible"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            if (r9 != 0) goto L_0x01e3
            r9 = 26
            boolean r9 = r1.getBoolean(r9, r11)
            r10.M(r9)
        L_0x01e3:
            r9 = 25
            android.graphics.drawable.Drawable r9 = A.i.K(r6, r1, r9)
            r10.H(r9)
            r9 = 30
            android.content.res.ColorStateList r9 = A.i.H(r6, r1, r9)
            r10.L(r9)
            r9 = 28
            float r9 = r1.getDimension(r9, r13)
            r10.J(r9)
            r9 = 6
            boolean r9 = r1.getBoolean(r9, r11)
            r10.w(r9)
            r9 = 10
            boolean r9 = r1.getBoolean(r9, r11)
            r10.z(r9)
            if (r2 == 0) goto L_0x022a
            java.lang.String r9 = "checkedIconEnabled"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            if (r9 == 0) goto L_0x022a
            java.lang.String r9 = "checkedIconVisible"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            if (r9 != 0) goto L_0x022a
            r9 = 8
            boolean r9 = r1.getBoolean(r9, r11)
            r10.z(r9)
        L_0x022a:
            r9 = 7
            android.graphics.drawable.Drawable r9 = A.i.K(r6, r1, r9)
            r10.x(r9)
            r9 = 9
            boolean r12 = r1.hasValue(r9)
            if (r12 == 0) goto L_0x0241
            android.content.res.ColorStateList r9 = A.i.H(r6, r1, r9)
            r10.y(r9)
        L_0x0241:
            r9 = 39
            boolean r12 = r1.hasValue(r9)
            if (r12 == 0) goto L_0x0254
            int r9 = r1.getResourceId(r9, r11)
            if (r9 == 0) goto L_0x0254
            k0.b r9 = k0.C0282b.a(r6, r9)
            goto L_0x0255
        L_0x0254:
            r9 = 0
        L_0x0255:
            r10.f4510U = r9
            r9 = 33
            boolean r12 = r1.hasValue(r9)
            if (r12 == 0) goto L_0x026a
            int r9 = r1.getResourceId(r9, r11)
            if (r9 == 0) goto L_0x026a
            k0.b r15 = k0.C0282b.a(r6, r9)
            goto L_0x026b
        L_0x026a:
            r15 = 0
        L_0x026b:
            r10.f4511V = r15
            r6 = 21
            float r6 = r1.getDimension(r6, r13)
            float r9 = r10.f4512W
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0281
            r10.f4512W = r6
            r10.invalidateSelf()
            r10.u()
        L_0x0281:
            r6 = 35
            float r6 = r1.getDimension(r6, r13)
            r10.O(r6)
            r6 = 34
            float r6 = r1.getDimension(r6, r13)
            r10.N(r6)
            r6 = 41
            float r6 = r1.getDimension(r6, r13)
            float r9 = r10.f4515Z
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x02a7
            r10.f4515Z = r6
            r10.invalidateSelf()
            r10.u()
        L_0x02a7:
            r6 = 40
            float r6 = r1.getDimension(r6, r13)
            float r9 = r10.f4516a0
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x02bb
            r10.f4516a0 = r6
            r10.invalidateSelf()
            r10.u()
        L_0x02bb:
            r6 = 29
            float r6 = r1.getDimension(r6, r13)
            r10.K(r6)
            r6 = 27
            float r6 = r1.getDimension(r6, r13)
            r10.I(r6)
            r6 = 13
            float r6 = r1.getDimension(r6, r13)
            float r9 = r10.f4519d0
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x02e1
            r10.f4519d0 = r6
            r10.invalidateSelf()
            r10.u()
        L_0x02e1:
            r6 = 4
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r6 = r1.getDimensionPixelSize(r6, r9)
            r10.f4492D0 = r6
            r1.recycle()
            int[] r6 = new int[r11]
            r1 = r5
            r5 = 2131756051(0x7f100413, float:1.9142999E38)
            y0.l.a(r7, r2, r4, r5)
            r17 = r7
            r7 = r1
            r1 = r17
            y0.l.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6 = 32
            boolean r6 = r5.getBoolean(r6, r11)
            r0.f1937n = r6
            android.content.Context r6 = r0.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 48
            float r9 = (float) r9
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r8, r9, r6)
            double r12 = (double) r6
            double r12 = java.lang.Math.ceil(r12)
            float r6 = (float) r12
            r9 = 20
            float r6 = r5.getDimension(r9, r6)
            double r12 = (double) r6
            double r12 = java.lang.Math.ceil(r12)
            int r6 = (int) r12
            r0.f1939p = r6
            r5.recycle()
            r0.setChipDrawable(r10)
            float r5 = I.D.i(r0)
            r10.i(r5)
            int[] r6 = new int[r11]
            r5 = 2131756051(0x7f100413, float:1.9142999E38)
            y0.l.a(r1, r2, r4, r5)
            y0.l.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            if (r7 >= r14) goto L_0x0358
            r3 = 2
            android.content.res.ColorStateList r1 = A.i.H(r1, r2, r3)
            r0.setTextColor(r1)
        L_0x0358:
            r1 = 37
            boolean r1 = r2.hasValue(r1)
            r2.recycle()
            s0.d r2 = new s0.d
            r2.<init>(r0, r0)
            r0.f1941r = r2
            r0.d()
            if (r1 != 0) goto L_0x0375
            s0.c r1 = new s0.c
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0375:
            boolean r1 = r0.f1933j
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r10.f4493E
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r10.f4489B0
            r0.setEllipsize(r1)
            r0.g()
            s0.f r1 = r0.f1929e
            boolean r1 = r1.f4491C0
            if (r1 != 0) goto L_0x0393
            r0.setLines(r8)
            r0.setHorizontallyScrolling(r8)
        L_0x0393:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r0.f()
            boolean r1 = r0.f1937n
            if (r1 == 0) goto L_0x03a5
            int r1 = r0.f1939p
            r0.setMinHeight(r1)
        L_0x03a5:
            int r1 = r0.getLayoutDirection()
            r0.f1938o = r1
            s0.a r1 = new s0.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03b4:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03bc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r6)
            throw r1
        L_0x03c2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r6)
            throw r1
        L_0x03c8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03d0:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1944u;
        rectF.setEmpty();
        if (c() && this.f1931h != null) {
            f fVar = this.f1929e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f2 = fVar.f4519d0 + fVar.f4518c0 + fVar.f4504O + fVar.f4517b0 + fVar.f4516a0;
                if (i.N(fVar) == 0) {
                    float f3 = (float) bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = (float) bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f1943t;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private B0.d getTextAppearance() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4525k0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1935l != z2) {
            this.f1935l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1934k != z2) {
            this.f1934k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        int i3;
        int i4;
        this.f1939p = i2;
        if (!this.f1937n) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                int[] iArr = C0.d.f74a;
                e();
            } else if (insetDrawable != null) {
                this.f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = C0.d.f74a;
                e();
            }
        } else {
            int max = Math.max(0, i2 - ((int) this.f1929e.f4541z));
            int max2 = Math.max(0, i2 - this.f1929e.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i3 = max2 / 2;
                } else {
                    i3 = 0;
                }
                if (max > 0) {
                    i4 = max / 2;
                } else {
                    i4 = 0;
                }
                if (this.f != null) {
                    Rect rect = new Rect();
                    this.f.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        int[] iArr3 = C0.d.f74a;
                        e();
                        return;
                    }
                }
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
                this.f = new InsetDrawable(this.f1929e, i3, i4, i3, i4);
                int[] iArr4 = C0.d.f74a;
                e();
                return;
            }
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                int[] iArr5 = C0.d.f74a;
                e();
            } else if (insetDrawable2 != null) {
                this.f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = C0.d.f74a;
                e();
            }
        }
    }

    public final boolean c() {
        f fVar = this.f1929e;
        if (fVar == null) {
            return false;
        }
        Drawable drawable = fVar.f4501L;
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof B.e) {
            drawable = ((B.f) ((B.e) drawable)).f;
        }
        if (drawable != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f1929e) == null || !fVar.f4500K || this.f1931h == null) {
            O.p(this, (C0010b) null);
            this.f1942s = false;
            return;
        }
        O.p(this, this.f1941r);
        this.f1942s = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f1942s
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            s0.d r0 = r9.f1941r
            android.view.accessibility.AccessibilityManager r1 = r0.f676h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x006c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001c
            goto L_0x006c
        L_0x001c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L_0x003d
            r5 = 9
            if (r1 == r5) goto L_0x003d
            r5 = 10
            if (r1 == r5) goto L_0x0030
            goto L_0x006c
        L_0x0030:
            int r1 = r0.f681m
            if (r1 == r6) goto L_0x006c
            if (r1 != r6) goto L_0x0037
            goto L_0x0072
        L_0x0037:
            r0.f681m = r6
            r0.q(r1, r2)
            return r3
        L_0x003d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.f4483q
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0059
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            int r5 = r0.f681m
            if (r5 != r1) goto L_0x005f
            goto L_0x0069
        L_0x005f:
            r0.f681m = r1
            r7 = 128(0x80, float:1.794E-43)
            r0.q(r1, r7)
            r0.q(r5, r2)
        L_0x0069:
            if (r1 == r6) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x0073
        L_0x0072:
            return r3
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1942s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1941r;
        dVar.getClass();
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i4 = 0;
                                while (i2 < repeatCount && dVar.m(i3, (Rect) null)) {
                                    i2++;
                                    i4 = 1;
                                }
                                i2 = i4;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = dVar.f680l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f4483q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1931h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1942s) {
                                chip.f1941r.q(1, 1);
                            }
                        }
                    }
                    i2 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i2 = dVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i2 = dVar.m(1, (Rect) null);
            }
        }
        if (i2 == 0 || dVar.f680l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        f fVar = this.f1929e;
        boolean z2 = false;
        if (fVar != null && f.t(fVar.f4501L)) {
            f fVar2 = this.f1929e;
            int isEnabled = isEnabled();
            if (this.f1936m) {
                isEnabled++;
            }
            if (this.f1935l) {
                isEnabled++;
            }
            if (this.f1934k) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f1936m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f1935l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f1934k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(fVar2.f4540y0, iArr)) {
                fVar2.f4540y0 = iArr;
                if (fVar2.T()) {
                    z2 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        this.f1930g = new RippleDrawable(C0.d.a(this.f1929e.D), getBackgroundDrawable(), (Drawable) null);
        this.f1929e.getClass();
        RippleDrawable rippleDrawable = this.f1930g;
        WeakHashMap weakHashMap = O.f393a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f1929e) != null) {
            int q2 = (int) (fVar.q() + fVar.f4519d0 + fVar.f4516a0);
            f fVar2 = this.f1929e;
            int p2 = (int) (fVar2.p() + fVar2.f4512W + fVar2.f4515Z);
            if (this.f != null) {
                Rect rect = new Rect();
                this.f.getPadding(rect);
                p2 += rect.left;
                q2 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = O.f393a;
            setPaddingRelative(p2, paddingTop, q2, paddingBottom);
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f1929e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        B0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1945v);
        }
    }

    public CharSequence getAccessibilityClassName() {
        boolean z2;
        if (!TextUtils.isEmpty(this.f1940q)) {
            return this.f1940q;
        }
        f fVar = this.f1929e;
        if (fVar == null || !fVar.f4506Q) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        if (insetDrawable == null) {
            return this.f1929e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4508S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4509T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4539y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1929e;
    }

    public float getChipEndPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4519d0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1929e;
        if (fVar == null || (drawable = fVar.f4496G) == null) {
            return null;
        }
        if (drawable instanceof B.e) {
            return ((B.f) ((B.e) drawable)).f;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4498I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4497H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4541z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4512W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4488B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4490C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f1929e;
        if (fVar == null || (drawable = fVar.f4501L) == null) {
            return null;
        }
        if (drawable instanceof B.e) {
            return ((B.f) ((B.e) drawable)).f;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4505P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4518c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4504O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4517b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4503N;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4489B0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f1942s) {
            d dVar = this.f1941r;
            if (dVar.f680l == 1 || dVar.f679k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0282b getHideMotionSpec() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4511V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4514Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4513X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f1929e.f118a.f103a;
    }

    public C0282b getShowMotionSpec() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4510U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4516a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1929e;
        if (fVar != null) {
            return fVar.f4515Z;
        }
        return 0.0f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.r0(this, this.f1929e);
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1927x);
        }
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4506Q) {
            View.mergeDrawableStates(onCreateDrawableState, f1928y);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f1942s) {
            d dVar = this.f1941r;
            int i3 = dVar.f680l;
            if (i3 != Integer.MIN_VALUE) {
                dVar.j(i3);
            }
            if (z2) {
                dVar.m(i2, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f1929e;
        if (fVar == null || !fVar.f4506Q) {
            z2 = false;
        } else {
            z2 = true;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f1938o != i2) {
            this.f1938o = i2;
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f1934k
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = 1
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.f1934k
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f1931h
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.f1942s
            if (r0 == 0) goto L_0x0043
            s0.d r0 = r5.f1941r
            r0.q(r3, r3)
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            return r2
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1940q = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1930g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1930g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.w(z2);
        }
    }

    public void setCheckableResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.w(fVar.e0.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z2) {
        f fVar = this.f1929e;
        if (fVar == null) {
            this.f1933j = z2;
        } else if (fVar.f4506Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.x(l.v(fVar.e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.y(C0486a.g(fVar.e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.z(fVar.e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4539y != colorStateList) {
            fVar.f4539y = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList g2;
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4539y != (g2 = C0486a.g(fVar.e0, i2))) {
            fVar.f4539y = g2;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.A(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1929e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f4487A0 = new WeakReference((Object) null);
            }
            this.f1929e = fVar;
            fVar.f4491C0 = false;
            fVar.f4487A0 = new WeakReference(this);
            b(this.f1939p);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4519d0 != f2) {
            fVar.f4519d0 = f2;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            float dimension = fVar.e0.getResources().getDimension(i2);
            if (fVar.f4519d0 != dimension) {
                fVar.f4519d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.B(l.v(fVar.e0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.C(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.D(C0486a.g(fVar.e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.E(fVar.e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4541z != f2) {
            fVar.f4541z = f2;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipMinHeightResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            float dimension = fVar.e0.getResources().getDimension(i2);
            if (fVar.f4541z != dimension) {
                fVar.f4541z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4512W != f2) {
            fVar.f4512W = f2;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            float dimension = fVar.e0.getResources().getDimension(i2);
            if (fVar.f4512W != dimension) {
                fVar.f4512W = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.F(C0486a.g(fVar.e0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.G(fVar.e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        G.b bVar;
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4505P != charSequence) {
            String str = G.b.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = G.b.f239e;
            } else {
                bVar = G.b.f238d;
            }
            bVar.getClass();
            j jVar = G.k.f247a;
            fVar.f4505P = bVar.c(charSequence);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.I(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.H(l.v(fVar.e0, i2));
        }
        d();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.J(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.K(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.L(C0486a.g(fVar.e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.i(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1929e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.f1929e;
                if (fVar != null) {
                    fVar.f4489B0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1937n = z2;
        b(this.f1939p);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(C0282b bVar) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.f4511V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.f4511V = C0282b.a(fVar.e0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.N(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.O(fVar.e0.getResources().getDimension(i2));
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f1929e != null) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.f4492D0 = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1932i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1931h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f1929e.getClass();
        e();
    }

    public void setRippleColorResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.P(C0486a.g(fVar.e0, i2));
            this.f1929e.getClass();
            e();
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f1929e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0282b bVar) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.f4510U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.f4510U = C0282b.a(fVar.e0, i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f1929e;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (fVar.f4491C0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            f fVar2 = this.f1929e;
            if (fVar2 != null && !TextUtils.equals(fVar2.f4493E, charSequence)) {
                fVar2.f4493E = charSequence;
                fVar2.f4525k0.f4843d = true;
                fVar2.invalidateSelf();
                fVar2.u();
            }
        }
    }

    public void setTextAppearance(B0.d dVar) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4516a0 != f2) {
            fVar.f4516a0 = f2;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            float dimension = fVar.e0.getResources().getDimension(i2);
            if (fVar.f4516a0 != dimension) {
                fVar.f4516a0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public final void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        f fVar = this.f1929e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics());
            y0.j jVar = fVar.f4525k0;
            B0.d dVar = jVar.f;
            if (dVar != null) {
                dVar.f68k = applyDimension;
                jVar.f4841a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.f1929e;
        if (fVar != null && fVar.f4515Z != f2) {
            fVar.f4515Z = f2;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            float dimension = fVar.e0.getResources().getDimension(i2);
            if (fVar.f4515Z != dimension) {
                fVar.f4515Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.M(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.E(z2);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.Q(new B0.d(fVar.e0, i2));
        }
        g();
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        f fVar = this.f1929e;
        if (fVar != null) {
            fVar.Q(new B0.d(fVar.e0, i2));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(y0.e eVar) {
    }
}

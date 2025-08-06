package G0;

import A.i;
import B.a;
import E0.k;
import I.B;
import I.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

public abstract class c extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final b f250i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final k f251a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public final float f252c;

    /* renamed from: d  reason: collision with root package name */
    public final float f253d;

    /* renamed from: e  reason: collision with root package name */
    public final int f254e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f255g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f256h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: E0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = J0.a.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = j0.C0219a.f3198y
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0023
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = I.O.f393a
            I.D.s(r4, r2)
        L_0x0023:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.b = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0044
        L_0x003a:
            E0.j r6 = E0.k.b(r5, r6, r0, r0)
            E0.k r6 = r6.a()
            r4.f251a = r6
        L_0x0044:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.f252c = r6
            r6 = 4
            android.content.res.ColorStateList r5 = A.i.H(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = y0.l.g(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.f253d = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.f254e = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f = r6
            r1.recycle()
            G0.b r6 = f250i
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00e5
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130903305(0x7f030109, float:1.7413424E38)
            int r6 = t0.C0486a.f(r4, r6)
            r1 = 2130903283(0x7f0300f3, float:1.741338E38)
            int r1 = t0.C0486a.f(r4, r1)
            int r5 = t0.C0486a.o(r6, r1, r5)
            E0.k r6 = r4.f251a
            if (r6 == 0) goto L_0x00b2
            int r0 = G0.d.f257a
            E0.g r0 = new E0.g
            r0.<init>((E0.k) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto L_0x00ce
        L_0x00b2:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = G0.d.f257a
            r1 = 2131100419(0x7f060303, float:1.7813219E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00ce:
            android.content.res.ColorStateList r5 = r4.f255g
            if (r5 == 0) goto L_0x00dc
            android.graphics.drawable.Drawable r5 = A.i.y0(r0)
            android.content.res.ColorStateList r6 = r4.f255g
            B.a.h(r5, r6)
            goto L_0x00e0
        L_0x00dc:
            android.graphics.drawable.Drawable r5 = A.i.y0(r0)
        L_0x00e0:
            java.util.WeakHashMap r6 = I.O.f393a
            r4.setBackground(r5)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public float getActionTextColorAlpha() {
        return this.f253d;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f252c;
    }

    public int getMaxInlineActionWidth() {
        return this.f;
    }

    public int getMaxWidth() {
        return this.f254e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = O.f393a;
        B.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f254e;
        if (i4 > 0 && getMeasuredWidth() > i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
    }

    public void setAnimationMode(int i2) {
        this.b = i2;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f255g == null)) {
            drawable = i.y0(drawable.mutate());
            a.h(drawable, this.f255g);
            a.i(drawable, this.f256h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f255g = colorStateList;
        if (getBackground() != null) {
            Drawable y02 = i.y0(getBackground().mutate());
            a.h(y02, colorStateList);
            a.i(y02, this.f256h);
            if (y02 != getBackground()) {
                super.setBackgroundDrawable(y02);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f256h = mode;
        if (getBackground() != null) {
            Drawable y02 = i.y0(getBackground().mutate());
            a.i(y02, mode);
            if (y02 != getBackground()) {
                super.setBackgroundDrawable(y02);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        b bVar;
        if (onClickListener != null) {
            bVar = null;
        } else {
            bVar = f250i;
        }
        setOnTouchListener(bVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}

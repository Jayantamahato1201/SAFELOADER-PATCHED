package s0;

import B.e;
import C0.d;
import E0.a;
import E0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.cheatbox.R;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k0.C0282b;
import y0.i;
import y0.j;

public final class f extends g implements Drawable.Callback, i {

    /* renamed from: F0  reason: collision with root package name */
    public static final int[] f4484F0 = {16842910};

    /* renamed from: G0  reason: collision with root package name */
    public static final ShapeDrawable f4485G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A  reason: collision with root package name */
    public float f4486A = -1.0f;

    /* renamed from: A0  reason: collision with root package name */
    public WeakReference f4487A0 = new WeakReference((Object) null);

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f4488B;

    /* renamed from: B0  reason: collision with root package name */
    public TextUtils.TruncateAt f4489B0;

    /* renamed from: C  reason: collision with root package name */
    public float f4490C;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f4491C0;
    public ColorStateList D;

    /* renamed from: D0  reason: collision with root package name */
    public int f4492D0;

    /* renamed from: E  reason: collision with root package name */
    public CharSequence f4493E;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f4494E0;

    /* renamed from: F  reason: collision with root package name */
    public boolean f4495F;

    /* renamed from: G  reason: collision with root package name */
    public Drawable f4496G;

    /* renamed from: H  reason: collision with root package name */
    public ColorStateList f4497H;

    /* renamed from: I  reason: collision with root package name */
    public float f4498I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f4499J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f4500K;

    /* renamed from: L  reason: collision with root package name */
    public Drawable f4501L;

    /* renamed from: M  reason: collision with root package name */
    public RippleDrawable f4502M;

    /* renamed from: N  reason: collision with root package name */
    public ColorStateList f4503N;

    /* renamed from: O  reason: collision with root package name */
    public float f4504O;

    /* renamed from: P  reason: collision with root package name */
    public SpannableStringBuilder f4505P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f4506Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f4507R;

    /* renamed from: S  reason: collision with root package name */
    public Drawable f4508S;

    /* renamed from: T  reason: collision with root package name */
    public ColorStateList f4509T;

    /* renamed from: U  reason: collision with root package name */
    public C0282b f4510U;

    /* renamed from: V  reason: collision with root package name */
    public C0282b f4511V;

    /* renamed from: W  reason: collision with root package name */
    public float f4512W;

    /* renamed from: X  reason: collision with root package name */
    public float f4513X;

    /* renamed from: Y  reason: collision with root package name */
    public float f4514Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f4515Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f4516a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f4517b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f4518c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f4519d0;
    public final Context e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f4520f0 = new Paint(1);

    /* renamed from: g0  reason: collision with root package name */
    public final Paint.FontMetrics f4521g0 = new Paint.FontMetrics();

    /* renamed from: h0  reason: collision with root package name */
    public final RectF f4522h0 = new RectF();

    /* renamed from: i0  reason: collision with root package name */
    public final PointF f4523i0 = new PointF();

    /* renamed from: j0  reason: collision with root package name */
    public final Path f4524j0 = new Path();

    /* renamed from: k0  reason: collision with root package name */
    public final j f4525k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f4526l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4527m0;
    public int n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f4528o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f4529p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f4530q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f4531r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f4532s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4533t0 = 255;

    /* renamed from: u0  reason: collision with root package name */
    public ColorFilter f4534u0;

    /* renamed from: v0  reason: collision with root package name */
    public PorterDuffColorFilter f4535v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f4536w0;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f4537x;

    /* renamed from: x0  reason: collision with root package name */
    public PorterDuff.Mode f4538x0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f4539y;

    /* renamed from: y0  reason: collision with root package name */
    public int[] f4540y0;

    /* renamed from: z  reason: collision with root package name */
    public float f4541z;
    public ColorStateList z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin);
        h(context);
        this.e0 = context;
        j jVar = new j(this);
        this.f4525k0 = jVar;
        this.f4493E = "";
        jVar.f4841a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4484F0;
        setState(iArr);
        if (!Arrays.equals(this.f4540y0, iArr)) {
            this.f4540y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f4491C0 = true;
        int[] iArr2 = d.f74a;
        f4485G0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean t(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public final void A(float f) {
        if (this.f4486A != f) {
            this.f4486A = f;
            E0.j e2 = this.f118a.f103a.e();
            e2.f142e = new a(f);
            e2.f = new a(f);
            e2.f143g = new a(f);
            e2.f144h = new a(f);
            setShapeAppearanceModel(e2.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.f4496G;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof e) {
            drawable2 = ((B.f) ((e) drawable2)).f;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            if (drawable != null) {
                drawable3 = A.i.y0(drawable).mutate();
            }
            this.f4496G = drawable3;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f4496G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.f4498I != f) {
            float p2 = p();
            this.f4498I = f;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f4499J = true;
        if (this.f4497H != colorStateList) {
            this.f4497H = colorStateList;
            if (S()) {
                B.a.h(this.f4496G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f4495F != z2) {
            boolean S2 = S();
            this.f4495F = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f4496G);
                } else {
                    U(this.f4496G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f4488B != colorStateList) {
            this.f4488B = colorStateList;
            if (this.f4494E0) {
                E0.f fVar = this.f118a;
                if (fVar.f105d != colorStateList) {
                    fVar.f105d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.f4490C != f) {
            this.f4490C = f;
            this.f4520f0.setStrokeWidth(f);
            if (this.f4494E0) {
                this.f118a.f110j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.f4501L;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof e) {
            drawable2 = ((B.f) ((e) drawable2)).f;
        }
        if (drawable2 != drawable) {
            float q2 = q();
            if (drawable != null) {
                drawable3 = A.i.y0(drawable).mutate();
            }
            this.f4501L = drawable3;
            int[] iArr = d.f74a;
            this.f4502M = new RippleDrawable(d.a(this.D), this.f4501L, f4485G0);
            float q3 = q();
            U(drawable2);
            if (T()) {
                n(this.f4501L);
            }
            invalidateSelf();
            if (q2 != q3) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.f4518c0 != f) {
            this.f4518c0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.f4504O != f) {
            this.f4504O = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.f4517b0 != f) {
            this.f4517b0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f4503N != colorStateList) {
            this.f4503N = colorStateList;
            if (T()) {
                B.a.h(this.f4501L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f4500K != z2) {
            boolean T2 = T();
            this.f4500K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f4501L);
                } else {
                    U(this.f4501L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.f4514Y != f) {
            float p2 = p();
            this.f4514Y = f;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.f4513X != f) {
            float p2 = p();
            this.f4513X = f;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            this.z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(B0.d dVar) {
        j jVar = this.f4525k0;
        if (jVar.f != dVar) {
            jVar.f = dVar;
            if (dVar != null) {
                TextPaint textPaint = jVar.f4841a;
                Context context = this.e0;
                b bVar = jVar.b;
                dVar.f(context, textPaint, bVar);
                i iVar = (i) jVar.f4844e.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                jVar.f4843d = true;
            }
            i iVar2 = (i) jVar.f4844e.get();
            if (iVar2 != null) {
                f fVar = (f) iVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(iVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (!this.f4507R || this.f4508S == null || !this.f4531r0) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (!this.f4495F || this.f4496G == null) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        if (!this.f4500K || this.f4501L == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        Canvas canvas2;
        boolean z2;
        int i4;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.f4533t0) == 0) {
            return;
        }
        if (i2 < 255) {
            float f = (float) bounds.left;
            float f2 = (float) bounds.top;
            float f3 = (float) bounds.right;
            float f4 = (float) bounds.bottom;
            if (Build.VERSION.SDK_INT > 21) {
                canvas2 = canvas;
                i5 = canvas2.saveLayerAlpha(f, f2, f3, f4, i2);
            } else {
                canvas2 = canvas;
                i5 = canvas2.saveLayerAlpha(f, f2, f3, f4, i2, 31);
            }
            i3 = i5;
        } else {
            canvas2 = canvas;
            i3 = 0;
        }
        boolean z3 = this.f4494E0;
        Paint paint = this.f4520f0;
        RectF rectF = this.f4522h0;
        if (!z3) {
            paint.setColor(this.f4526l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f4494E0) {
            paint.setColor(this.f4527m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4534u0;
            if (colorFilter == null) {
                colorFilter = this.f4535v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f4494E0) {
            super.draw(canvas);
        }
        if (this.f4490C > 0.0f && !this.f4494E0) {
            paint.setColor(this.f4528o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4494E0) {
                ColorFilter colorFilter2 = this.f4534u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4535v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f5 = this.f4490C / 2.0f;
            rectF.set(((float) bounds.left) + f5, ((float) bounds.top) + f5, ((float) bounds.right) - f5, ((float) bounds.bottom) - f5);
            float f6 = this.f4486A - (this.f4490C / 2.0f);
            canvas2.drawRoundRect(rectF, f6, f6, paint);
        }
        paint.setColor(this.f4529p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (!this.f4494E0) {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        } else {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f4524j0;
            E0.f fVar = this.f118a;
            Path path2 = path;
            this.f133r.a(fVar.f103a, fVar.f109i, rectF2, this.f132q, path2);
            RectF f7 = f();
            d(canvas2, paint, path2, this.f118a.f103a, f7);
        }
        if (S()) {
            o(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f4496G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f4496G.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (R()) {
            o(bounds, rectF);
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas2.translate(f10, f11);
            this.f4508S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f4508S.draw(canvas2);
            canvas2.translate(-f10, -f11);
        }
        if (this.f4491C0 && this.f4493E != null) {
            PointF pointF = this.f4523i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4493E;
            j jVar = this.f4525k0;
            if (charSequence != null) {
                float p2 = p() + this.f4512W + this.f4515Z;
                if (A.i.N(this) == 0) {
                    pointF.x = ((float) bounds.left) + p2;
                } else {
                    pointF.x = ((float) bounds.right) - p2;
                    align = Paint.Align.RIGHT;
                }
                TextPaint textPaint = jVar.f4841a;
                Paint.FontMetrics fontMetrics = this.f4521g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f4493E != null) {
                float p3 = p() + this.f4512W + this.f4515Z;
                float q2 = q() + this.f4519d0 + this.f4516a0;
                if (A.i.N(this) == 0) {
                    rectF.left = ((float) bounds.left) + p3;
                    rectF.right = ((float) bounds.right) - q2;
                } else {
                    rectF.left = ((float) bounds.left) + q2;
                    rectF.right = ((float) bounds.right) - p3;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
            B0.d dVar = jVar.f;
            TextPaint textPaint2 = jVar.f4841a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f.e(this.e0, textPaint2, jVar.b);
            }
            textPaint2.setTextAlign(align);
            if (Math.round(jVar.a(this.f4493E.toString())) > Math.round(rectF.width())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i4 = save;
            } else {
                i4 = 0;
            }
            CharSequence charSequence2 = this.f4493E;
            if (z2 && this.f4489B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f4489B0);
            }
            int length = charSequence2.length();
            float f12 = pointF.x;
            float f13 = pointF.y;
            Canvas canvas3 = canvas;
            canvas3.drawText(charSequence2, 0, length, f12, f13, textPaint2);
            canvas2 = canvas3;
            if (z2) {
                canvas2.restoreToCount(i4);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f14 = this.f4519d0 + this.f4518c0;
                if (A.i.N(this) == 0) {
                    float f15 = ((float) bounds.right) - f14;
                    rectF.right = f15;
                    rectF.left = f15 - this.f4504O;
                } else {
                    float f16 = ((float) bounds.left) + f14;
                    rectF.left = f16;
                    rectF.right = f16 + this.f4504O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f17 = this.f4504O;
                float f18 = exactCenterY - (f17 / 2.0f);
                rectF.top = f18;
                rectF.bottom = f18 + f17;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            canvas2.translate(f19, f20);
            this.f4501L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = d.f74a;
            this.f4502M.setBounds(this.f4501L.getBounds());
            this.f4502M.jumpToCurrentState();
            this.f4502M.draw(canvas2);
            canvas2.translate(-f19, -f20);
        }
        if (this.f4533t0 < 255) {
            canvas2.restoreToCount(i3);
        }
    }

    public final int getAlpha() {
        return this.f4533t0;
    }

    public final ColorFilter getColorFilter() {
        return this.f4534u0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f4541z;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f4525k0.a(this.f4493E.toString()) + p() + this.f4512W + this.f4515Z + this.f4516a0 + this.f4519d0), this.f4492D0);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f4494E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f4486A);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4541z, this.f4486A);
        }
        outline2.setAlpha(((float) this.f4533t0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f4537x) || s(this.f4539y) || s(this.f4488B)) {
            return true;
        }
        B0.d dVar = this.f4525k0.f;
        if (dVar != null && (colorStateList = dVar.f67j) != null && colorStateList.isStateful()) {
            return true;
        }
        if ((!this.f4507R || this.f4508S == null || !this.f4506Q) && !t(this.f4496G) && !t(this.f4508S) && !s(this.f4536w0)) {
            return false;
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            A.i.p0(drawable, A.i.N(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f4501L) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f4540y0);
                }
                B.a.h(drawable, this.f4503N);
                return;
            }
            Drawable drawable2 = this.f4496G;
            if (drawable == drawable2 && this.f4499J) {
                B.a.h(drawable2, this.f4497H);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.f4512W + this.f4513X;
            if (this.f4531r0) {
                drawable = this.f4508S;
            } else {
                drawable = this.f4496G;
            }
            float f2 = this.f4498I;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (A.i.N(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.f4531r0) {
                drawable2 = this.f4508S;
            } else {
                drawable2 = this.f4496G;
            }
            float f5 = this.f4498I;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.e0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (S()) {
            onLayoutDirectionChanged |= A.i.p0(this.f4496G, i2);
        }
        if (R()) {
            onLayoutDirectionChanged |= A.i.p0(this.f4508S, i2);
        }
        if (T()) {
            onLayoutDirectionChanged |= A.i.p0(this.f4501L, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (S()) {
            onLevelChange |= this.f4496G.setLevel(i2);
        }
        if (R()) {
            onLevelChange |= this.f4508S.setLevel(i2);
        }
        if (T()) {
            onLevelChange |= this.f4501L.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f4494E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f4540y0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.f4513X;
        if (this.f4531r0) {
            drawable = this.f4508S;
        } else {
            drawable = this.f4496G;
        }
        float f2 = this.f4498I;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f4514Y;
    }

    public final float q() {
        if (T()) {
            return this.f4517b0 + this.f4504O + this.f4518c0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.f4494E0) {
            return this.f118a.f103a.f152e.a(f());
        }
        return this.f4486A;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.f4533t0 != i2) {
            this.f4533t0 = i2;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4534u0 != colorFilter) {
            this.f4534u0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4536w0 != colorStateList) {
            this.f4536w0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f4538x0 != mode) {
            this.f4538x0 = mode;
            ColorStateList colorStateList = this.f4536w0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.f4535v0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f4496G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f4508S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f4501L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f4487A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1939p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int[] r9, int[] r10) {
        /*
            r8 = this;
            r0 = 1
            boolean r1 = super.onStateChange(r9)
            android.content.res.ColorStateList r2 = r8.f4537x
            r3 = 0
            if (r2 == 0) goto L_0x0011
            int r4 = r8.f4526l0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            int r2 = r8.b(r2)
            int r4 = r8.f4526l0
            if (r4 == r2) goto L_0x001d
            r8.f4526l0 = r2
            r1 = 1
        L_0x001d:
            android.content.res.ColorStateList r4 = r8.f4539y
            if (r4 == 0) goto L_0x0028
            int r5 = r8.f4527m0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            int r4 = r8.b(r4)
            int r5 = r8.f4527m0
            if (r5 == r4) goto L_0x0034
            r8.f4527m0 = r4
            r1 = 1
        L_0x0034:
            int r2 = A.a.b(r4, r2)
            int r4 = r8.n0
            if (r4 == r2) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            E0.f r5 = r8.f118a
            android.content.res.ColorStateList r5 = r5.f104c
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r4 = r4 | r5
            if (r4 == 0) goto L_0x0055
            r8.n0 = r2
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r8.j(r1)
            r1 = 1
        L_0x0055:
            android.content.res.ColorStateList r2 = r8.f4488B
            if (r2 == 0) goto L_0x0060
            int r4 = r8.f4528o0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            int r4 = r8.f4528o0
            if (r4 == r2) goto L_0x0068
            r8.f4528o0 = r2
            r1 = 1
        L_0x0068:
            android.content.res.ColorStateList r2 = r8.z0
            if (r2 == 0) goto L_0x007b
            boolean r2 = C0.d.b(r9)
            if (r2 == 0) goto L_0x007b
            android.content.res.ColorStateList r2 = r8.z0
            int r4 = r8.f4529p0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            int r4 = r8.f4529p0
            if (r4 == r2) goto L_0x0082
            r8.f4529p0 = r2
        L_0x0082:
            y0.j r2 = r8.f4525k0
            B0.d r2 = r2.f
            if (r2 == 0) goto L_0x0093
            android.content.res.ColorStateList r2 = r2.f67j
            if (r2 == 0) goto L_0x0093
            int r4 = r8.f4530q0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            int r4 = r8.f4530q0
            if (r4 == r2) goto L_0x009b
            r8.f4530q0 = r2
            r1 = 1
        L_0x009b:
            int[] r2 = r8.getState()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            int r4 = r2.length
            r5 = 0
        L_0x00a4:
            if (r5 >= r4) goto L_0x00b5
            r6 = r2[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x00b3
            boolean r2 = r8.f4506Q
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b3:
            int r5 = r5 + r0
            goto L_0x00a4
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            boolean r4 = r8.f4531r0
            if (r4 == r2) goto L_0x00d0
            android.graphics.drawable.Drawable r4 = r8.f4508S
            if (r4 == 0) goto L_0x00d0
            float r1 = r8.p()
            r8.f4531r0 = r2
            float r2 = r8.p()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00cf
            r1 = 1
            r2 = 1
            goto L_0x00d1
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            android.content.res.ColorStateList r4 = r8.f4536w0
            if (r4 == 0) goto L_0x00dc
            int r5 = r8.f4532s0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            int r5 = r8.f4532s0
            if (r5 == r4) goto L_0x00fe
            r8.f4532s0 = r4
            android.content.res.ColorStateList r1 = r8.f4536w0
            android.graphics.PorterDuff$Mode r4 = r8.f4538x0
            if (r1 == 0) goto L_0x00fa
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int[] r5 = r8.getState()
            int r1 = r1.getColorForState(r5, r3)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r1, r4)
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r8.f4535v0 = r5
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            android.graphics.drawable.Drawable r1 = r8.f4496G
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x010e
            android.graphics.drawable.Drawable r1 = r8.f4496G
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x010e:
            android.graphics.drawable.Drawable r1 = r8.f4508S
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x011d
            android.graphics.drawable.Drawable r1 = r8.f4508S
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x011d:
            android.graphics.drawable.Drawable r1 = r8.f4501L
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x013a
            int r1 = r9.length
            int r4 = r10.length
            int r1 = r1 + r4
            int[] r1 = new int[r1]
            int r4 = r9.length
            java.lang.System.arraycopy(r9, r3, r1, r3, r4)
            int r9 = r9.length
            int r4 = r10.length
            java.lang.System.arraycopy(r10, r3, r1, r9, r4)
            android.graphics.drawable.Drawable r9 = r8.f4501L
            boolean r9 = r9.setState(r1)
            r0 = r0 | r9
        L_0x013a:
            int[] r9 = C0.d.f74a
            android.graphics.drawable.RippleDrawable r9 = r8.f4502M
            boolean r9 = t(r9)
            if (r9 == 0) goto L_0x014b
            android.graphics.drawable.RippleDrawable r9 = r8.f4502M
            boolean r9 = r9.setState(r10)
            r0 = r0 | r9
        L_0x014b:
            if (r0 == 0) goto L_0x0150
            r8.invalidateSelf()
        L_0x0150:
            if (r2 == 0) goto L_0x0155
            r8.u()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.f.v(int[], int[]):boolean");
    }

    public final void w(boolean z2) {
        if (this.f4506Q != z2) {
            this.f4506Q = z2;
            float p2 = p();
            if (!z2 && this.f4531r0) {
                this.f4531r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f4508S != drawable) {
            float p2 = p();
            this.f4508S = drawable;
            float p3 = p();
            U(this.f4508S);
            n(this.f4508S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4509T != colorStateList) {
            this.f4509T = colorStateList;
            if (this.f4507R && (drawable = this.f4508S) != null && this.f4506Q) {
                B.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f4507R != z2) {
            boolean R2 = R();
            this.f4507R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f4508S);
                } else {
                    U(this.f4508S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}

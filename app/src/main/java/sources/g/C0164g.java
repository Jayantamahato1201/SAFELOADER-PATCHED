package g;

import A.i;
import B.a;
import H0.E;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: g.g  reason: case insensitive filesystem */
public abstract class C0164g extends Drawable implements Drawable.Callback {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f2780m = 0;

    /* renamed from: a  reason: collision with root package name */
    public C0159b f2781a;
    public Rect b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f2782c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f2783d;

    /* renamed from: e  reason: collision with root package name */
    public int f2784e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f2785g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2786h;

    /* renamed from: i  reason: collision with root package name */
    public E f2787i;

    /* renamed from: j  reason: collision with root package name */
    public long f2788j;

    /* renamed from: k  reason: collision with root package name */
    public long f2789k;

    /* renamed from: l  reason: collision with root package name */
    public C0163f f2790l;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2782c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f2788j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f2784e
            r3.setAlpha(r9)
            r13.f2788j = r6
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.b r9 = r13.f2781a
            int r9 = r9.f2766y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2784e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f2788j = r6
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f2783d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f2789k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f2783d = r0
            r13.f2789k = r6
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b r4 = r13.f2781a
            int r4 = r4.f2767z
            int r3 = r3 / r4
            int r4 = r13.f2784e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f2789k = r6
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            H0.E r14 = r13.f2787i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0164g.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C0159b bVar = this.f2781a;
        if (theme != null) {
            bVar.c();
            int i2 = bVar.f2749h;
            Drawable[] drawableArr = bVar.f2748g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null && a.b(drawable)) {
                    a.a(drawableArr[i3], theme);
                    bVar.f2747e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.b = resources;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = 160;
                }
                int i5 = bVar.f2745c;
                bVar.f2745c = i4;
                if (i5 != i4) {
                    bVar.f2754m = false;
                    bVar.f2751j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f2790l == null) {
            this.f2790l = new C0163f();
        }
        C0163f fVar = this.f2790l;
        fVar.b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f2781a.f2766y <= 0 && this.f) {
                drawable.setAlpha(this.f2784e);
            }
            C0159b bVar = this.f2781a;
            if (bVar.f2737C) {
                drawable.setColorFilter(bVar.f2736B);
            } else {
                if (bVar.f2739F) {
                    a.h(drawable, bVar.D);
                }
                C0159b bVar2 = this.f2781a;
                if (bVar2.f2740G) {
                    a.i(drawable, bVar2.f2738E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2781a.f2764w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                i.p0(drawable, i.N(this));
            }
            drawable.setAutoMirrored(this.f2781a.f2735A);
            Rect rect = this.b;
            if (rect != null) {
                a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0163f fVar2 = this.f2790l;
            fVar2.b = null;
            drawable.setCallback((Drawable.Callback) fVar2.b);
        } catch (Throwable th) {
            C0163f fVar3 = this.f2790l;
            fVar3.b = null;
            drawable.setCallback((Drawable.Callback) fVar3.b);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2785g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b r0 = r9.f2781a
            int r0 = r0.f2767z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f2783d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f2782c
            if (r0 == 0) goto L_0x0029
            r9.f2783d = r0
            g.b r0 = r9.f2781a
            int r0 = r0.f2767z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2789k = r0
            goto L_0x0035
        L_0x0029:
            r9.f2783d = r4
            r9.f2789k = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f2782c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            g.b r0 = r9.f2781a
            int r1 = r0.f2749h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f2782c = r0
            r9.f2785g = r10
            if (r0 == 0) goto L_0x005a
            g.b r10 = r9.f2781a
            int r10 = r10.f2766y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2788j = r2
        L_0x0051:
            r9.b(r0)
            goto L_0x005a
        L_0x0055:
            r9.f2782c = r4
            r10 = -1
            r9.f2785g = r10
        L_0x005a:
            long r0 = r9.f2788j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f2789k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x007e
        L_0x0067:
            H0.E r0 = r9.f2787i
            if (r0 != 0) goto L_0x0078
            H0.E r0 = new H0.E
            r1 = r9
            g.e r1 = (g.C0162e) r1
            r2 = 13
            r0.<init>(r2, r1)
            r9.f2787i = r0
            goto L_0x007b
        L_0x0078:
            r9.unscheduleSelf(r0)
        L_0x007b:
            r9.a(r10)
        L_0x007e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0164g.c(int):boolean");
    }

    public final boolean canApplyTheme() {
        return this.f2781a.canApplyTheme();
    }

    public abstract void d(C0159b bVar);

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2783d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final int getAlpha() {
        return this.f2784e;
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2781a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        C0159b bVar = this.f2781a;
        if (!bVar.f2762u) {
            bVar.c();
            bVar.f2762u = true;
            int i2 = bVar.f2749h;
            Drawable[] drawableArr = bVar.f2748g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    bVar.f2763v = true;
                    z2 = true;
                    break;
                } else if (drawableArr[i3].getConstantState() == null) {
                    bVar.f2763v = false;
                    z2 = false;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z2 = bVar.f2763v;
        }
        if (!z2) {
            return null;
        }
        this.f2781a.f2746d = getChangingConfigurations();
        return this.f2781a;
    }

    public final Drawable getCurrent() {
        return this.f2782c;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        C0159b bVar = this.f2781a;
        if (bVar.f2753l) {
            if (!bVar.f2754m) {
                bVar.b();
            }
            return bVar.f2756o;
        }
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        C0159b bVar = this.f2781a;
        if (bVar.f2753l) {
            if (!bVar.f2754m) {
                bVar.b();
            }
            return bVar.f2755n;
        }
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        C0159b bVar = this.f2781a;
        if (bVar.f2753l) {
            if (!bVar.f2754m) {
                bVar.b();
            }
            return bVar.f2758q;
        }
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        C0159b bVar = this.f2781a;
        if (bVar.f2753l) {
            if (!bVar.f2754m) {
                bVar.b();
            }
            return bVar.f2757p;
        }
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f2782c;
        int i2 = -2;
        if (drawable != null && drawable.isVisible()) {
            C0159b bVar = this.f2781a;
            if (bVar.f2759r) {
                return bVar.f2760s;
            }
            bVar.c();
            int i3 = bVar.f2749h;
            Drawable[] drawableArr = bVar.f2748g;
            if (i3 > 0) {
                i2 = drawableArr[0].getOpacity();
            }
            for (int i4 = 1; i4 < i3; i4++) {
                i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
            }
            bVar.f2760s = i2;
            bVar.f2759r = true;
        }
        return i2;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        C0159b bVar = this.f2781a;
        boolean z2 = false;
        Rect rect2 = null;
        if (!bVar.f2750i) {
            Rect rect3 = bVar.f2752k;
            if (rect3 != null || bVar.f2751j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i2 = bVar.f2749h;
                Drawable[] drawableArr = bVar.f2748g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                bVar.f2751j = true;
                bVar.f2752k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.f2782c;
            if (drawable != null) {
                z2 = drawable.getPadding(rect);
            } else {
                z2 = super.getPadding(rect);
            }
        }
        if (this.f2781a.f2735A && i.N(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z2;
    }

    public final void invalidateDrawable(Drawable drawable) {
        C0159b bVar = this.f2781a;
        if (bVar != null) {
            bVar.f2759r = false;
            bVar.f2761t = false;
        }
        if (drawable == this.f2782c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f2781a.f2735A;
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2783d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2783d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2782c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.f2782c.setAlpha(this.f2784e);
            }
        }
        if (this.f2789k != 0) {
            this.f2789k = 0;
            z2 = true;
        }
        if (this.f2788j != 0) {
            this.f2788j = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f2786h && super.mutate() == this) {
            C0162e eVar = (C0162e) this;
            C0159b bVar = new C0159b(eVar.f2774p, eVar, (Resources) null);
            bVar.f2742I = bVar.f2742I.clone();
            bVar.f2743J = bVar.f2743J.clone();
            d(bVar);
            this.f2786h = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2783d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2782c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean z2;
        C0159b bVar = this.f2781a;
        int i3 = this.f2785g;
        int i4 = bVar.f2749h;
        Drawable[] drawableArr = bVar.f2748g;
        boolean z3 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z2 = i.p0(drawable, i2);
                } else {
                    z2 = false;
                }
                if (i5 == i3) {
                    z3 = z2;
                }
            }
        }
        bVar.f2765x = i2;
        return z3;
    }

    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f2783d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2782c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f2782c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (!this.f || this.f2784e != i2) {
            this.f = true;
            this.f2784e = i2;
            Drawable drawable = this.f2782c;
            if (drawable == null) {
                return;
            }
            if (this.f2788j == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z2) {
        C0159b bVar = this.f2781a;
        if (bVar.f2735A != z2) {
            bVar.f2735A = z2;
            Drawable drawable = this.f2782c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C0159b bVar = this.f2781a;
        bVar.f2737C = true;
        if (bVar.f2736B != colorFilter) {
            bVar.f2736B = colorFilter;
            Drawable drawable = this.f2782c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z2) {
        C0159b bVar = this.f2781a;
        if (bVar.f2764w != z2) {
            bVar.f2764w = z2;
            Drawable drawable = this.f2782c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            a.e(drawable, f2, f3);
        }
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2782c;
        if (drawable != null) {
            a.f(drawable, i2, i3, i4, i5);
        }
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void setTintList(ColorStateList colorStateList) {
        C0159b bVar = this.f2781a;
        bVar.f2739F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            a.h(this.f2782c, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C0159b bVar = this.f2781a;
        bVar.f2740G = true;
        if (bVar.f2738E != mode) {
            bVar.f2738E = mode;
            a.i(this.f2782c, mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2783d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2782c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2782c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}

package b0;

import H0.E;
import H0.F;
import I.O;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: b0.l  reason: case insensitive filesystem */
public final class C0088l extends G {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f1718C = {16842919};
    public static final int[] D = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f1719A;

    /* renamed from: B  reason: collision with root package name */
    public final E f1720B;

    /* renamed from: a  reason: collision with root package name */
    public final int f1721a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1722c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f1723d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1724e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1725g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1726h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1727i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1728j;

    /* renamed from: k  reason: collision with root package name */
    public int f1729k;

    /* renamed from: l  reason: collision with root package name */
    public int f1730l;

    /* renamed from: m  reason: collision with root package name */
    public float f1731m;

    /* renamed from: n  reason: collision with root package name */
    public int f1732n;

    /* renamed from: o  reason: collision with root package name */
    public int f1733o;

    /* renamed from: p  reason: collision with root package name */
    public float f1734p;

    /* renamed from: q  reason: collision with root package name */
    public int f1735q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1736r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f1737s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1738t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1739u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f1740v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f1741w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1742x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f1743y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f1744z;

    public C0088l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1744z = ofFloat;
        this.f1719A = 0;
        E e2 = new E(8, this);
        this.f1720B = e2;
        C0086j jVar = new C0086j(this);
        this.f1722c = stateListDrawable;
        this.f1723d = drawable;
        this.f1725g = stateListDrawable2;
        this.f1726h = drawable2;
        this.f1724e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f1727i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1728j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1721a = i3;
        this.b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0087k(this));
        ofFloat.addUpdateListener(new F(1, this));
        RecyclerView recyclerView2 = this.f1737s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                J j2 = recyclerView2.f1524l;
                if (j2 != null) {
                    j2.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f1526m;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() != 2 ? false : z2);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f1737s;
                recyclerView3.f1528n.remove(this);
                if (recyclerView3.f1529o == this) {
                    recyclerView3.f1529o = null;
                }
                ArrayList arrayList2 = this.f1737s.e0;
                if (arrayList2 != null) {
                    arrayList2.remove(jVar);
                }
                this.f1737s.removeCallbacks(e2);
            }
            this.f1737s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f1737s.f1528n.add(this);
                this.f1737s.h(jVar);
            }
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
            int i8 = i3 + i7;
            if (i8 >= i6 || i8 < 0) {
                return 0;
            }
            return i7;
        }
        return 0;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f1735q;
        RecyclerView recyclerView2 = this.f1737s;
        if (i2 != recyclerView2.getWidth() || this.f1736r != recyclerView2.getHeight()) {
            this.f1735q = recyclerView2.getWidth();
            this.f1736r = recyclerView2.getHeight();
            f(0);
        } else if (this.f1719A != 0) {
            if (this.f1738t) {
                int i3 = this.f1735q;
                int i4 = this.f1724e;
                int i5 = i3 - i4;
                int i6 = this.f1730l;
                int i7 = this.f1729k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f1722c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f1736r;
                int i10 = this.f;
                Drawable drawable = this.f1723d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = O.f393a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i4, (float) i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-i4), (float) (-i8));
                } else {
                    canvas.translate((float) i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i5), (float) (-i8));
                }
            }
            if (this.f1739u) {
                int i11 = this.f1736r;
                int i12 = this.f1727i;
                int i13 = i11 - i12;
                int i14 = this.f1733o;
                int i15 = this.f1732n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f1725g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f1735q;
                int i18 = this.f1728j;
                Drawable drawable2 = this.f1726h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, (float) i13);
                drawable2.draw(canvas);
                canvas.translate((float) i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i16), (float) (-i13));
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 < ((float) (this.f1736r - this.f1727i))) {
            return false;
        }
        int i2 = this.f1733o;
        int i3 = this.f1732n;
        if (f2 < ((float) (i2 - (i3 / 2))) || f2 > ((float) ((i3 / 2) + i2))) {
            return false;
        }
        return true;
    }

    public final boolean d(float f2, float f3) {
        boolean z2;
        RecyclerView recyclerView = this.f1737s;
        WeakHashMap weakHashMap = O.f393a;
        if (recyclerView.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.f1724e;
        if (!z2 ? f2 >= ((float) (this.f1735q - i2)) : f2 <= ((float) (i2 / 2))) {
            int i3 = this.f1730l;
            int i4 = this.f1729k / 2;
            if (f3 < ((float) (i3 - i4)) || f3 > ((float) (i4 + i3))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f(int i2) {
        E e2 = this.f1720B;
        StateListDrawable stateListDrawable = this.f1722c;
        if (i2 == 2 && this.f1740v != 2) {
            stateListDrawable.setState(f1718C);
            this.f1737s.removeCallbacks(e2);
        }
        if (i2 == 0) {
            this.f1737s.invalidate();
        } else {
            g();
        }
        if (this.f1740v == 2 && i2 != 2) {
            stateListDrawable.setState(D);
            this.f1737s.removeCallbacks(e2);
            this.f1737s.postDelayed(e2, (long) 1200);
        } else if (i2 == 1) {
            this.f1737s.removeCallbacks(e2);
            this.f1737s.postDelayed(e2, (long) 1500);
        }
        this.f1740v = i2;
    }

    public final void g() {
        int i2 = this.f1719A;
        ValueAnimator valueAnimator = this.f1744z;
        if (i2 != 0) {
            if (i2 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f1719A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}

package g;

import A.i;
import B.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import n.C0292e;
import n.l;

/* renamed from: g.b  reason: case insensitive filesystem */
public final class C0159b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f2735A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f2736B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2737C;
    public ColorStateList D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f2738E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2739F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f2740G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f2741H;

    /* renamed from: I  reason: collision with root package name */
    public C0292e f2742I;

    /* renamed from: J  reason: collision with root package name */
    public l f2743J;

    /* renamed from: a  reason: collision with root package name */
    public final C0162e f2744a;
    public Resources b;

    /* renamed from: c  reason: collision with root package name */
    public int f2745c;

    /* renamed from: d  reason: collision with root package name */
    public int f2746d;

    /* renamed from: e  reason: collision with root package name */
    public int f2747e;
    public SparseArray f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f2748g;

    /* renamed from: h  reason: collision with root package name */
    public int f2749h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2750i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2751j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f2752k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2753l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2754m;

    /* renamed from: n  reason: collision with root package name */
    public int f2755n;

    /* renamed from: o  reason: collision with root package name */
    public int f2756o;

    /* renamed from: p  reason: collision with root package name */
    public int f2757p;

    /* renamed from: q  reason: collision with root package name */
    public int f2758q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2759r;

    /* renamed from: s  reason: collision with root package name */
    public int f2760s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2761t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2762u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2763v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2764w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f2765x;

    /* renamed from: y  reason: collision with root package name */
    public int f2766y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f2767z = 0;

    public C0159b(C0159b bVar, C0162e eVar, Resources resources) {
        Resources resources2;
        int i2;
        this.f2744a = eVar;
        Rect rect = null;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.b;
        } else {
            resources2 = null;
        }
        this.b = resources2;
        if (bVar != null) {
            i2 = bVar.f2745c;
        } else {
            i2 = 0;
        }
        int i3 = C0164g.f2780m;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        i2 = i2 == 0 ? 160 : i2;
        this.f2745c = i2;
        if (bVar != null) {
            this.f2746d = bVar.f2746d;
            this.f2747e = bVar.f2747e;
            this.f2762u = true;
            this.f2763v = true;
            this.f2750i = bVar.f2750i;
            this.f2753l = bVar.f2753l;
            this.f2764w = bVar.f2764w;
            this.f2765x = bVar.f2765x;
            this.f2766y = bVar.f2766y;
            this.f2767z = bVar.f2767z;
            this.f2735A = bVar.f2735A;
            this.f2736B = bVar.f2736B;
            this.f2737C = bVar.f2737C;
            this.D = bVar.D;
            this.f2738E = bVar.f2738E;
            this.f2739F = bVar.f2739F;
            this.f2740G = bVar.f2740G;
            if (bVar.f2745c == i2) {
                if (bVar.f2751j) {
                    this.f2752k = bVar.f2752k != null ? new Rect(bVar.f2752k) : rect;
                    this.f2751j = true;
                }
                if (bVar.f2754m) {
                    this.f2755n = bVar.f2755n;
                    this.f2756o = bVar.f2756o;
                    this.f2757p = bVar.f2757p;
                    this.f2758q = bVar.f2758q;
                    this.f2754m = true;
                }
            }
            if (bVar.f2759r) {
                this.f2760s = bVar.f2760s;
                this.f2759r = true;
            }
            if (bVar.f2761t) {
                this.f2761t = true;
            }
            Drawable[] drawableArr = bVar.f2748g;
            this.f2748g = new Drawable[drawableArr.length];
            this.f2749h = bVar.f2749h;
            SparseArray sparseArray = bVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f2749h);
            }
            int i4 = this.f2749h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i5, constantState);
                    } else {
                        this.f2748g[i5] = drawableArr[i5];
                    }
                }
            }
        } else {
            this.f2748g = new Drawable[10];
            this.f2749h = 0;
        }
        if (bVar != null) {
            this.f2741H = bVar.f2741H;
        } else {
            this.f2741H = new int[this.f2748g.length][];
        }
        if (bVar != null) {
            this.f2742I = bVar.f2742I;
            this.f2743J = bVar.f2743J;
            return;
        }
        this.f2742I = new C0292e();
        this.f2743J = new l();
    }

    public final int a(Drawable drawable) {
        int i2 = this.f2749h;
        if (i2 >= this.f2748g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f2748g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f2748g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f2741H, 0, iArr, 0, i2);
            this.f2741H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f2744a);
        this.f2748g[i2] = drawable;
        this.f2749h++;
        this.f2747e = drawable.getChangingConfigurations() | this.f2747e;
        this.f2759r = false;
        this.f2761t = false;
        this.f2752k = null;
        this.f2751j = false;
        this.f2754m = false;
        this.f2762u = false;
        return i2;
    }

    public final void b() {
        this.f2754m = true;
        c();
        int i2 = this.f2749h;
        Drawable[] drawableArr = this.f2748g;
        this.f2756o = -1;
        this.f2755n = -1;
        this.f2758q = 0;
        this.f2757p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f2755n) {
                this.f2755n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f2756o) {
                this.f2756o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f2757p) {
                this.f2757p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f2758q) {
                this.f2758q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f.keyAt(i2);
                Drawable[] drawableArr = this.f2748g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(i2)).newDrawable(this.b);
                if (Build.VERSION.SDK_INT >= 23) {
                    i.p0(newDrawable, this.f2765x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f2744a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    public final boolean canApplyTheme() {
        int i2 = this.f2749h;
        Drawable[] drawableArr = this.f2748g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (a.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i2) {
        int indexOfKey;
        Drawable drawable = this.f2748g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        if (Build.VERSION.SDK_INT >= 23) {
            i.p0(newDrawable, this.f2765x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f2744a);
        this.f2748g[i2] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f2741H;
        int i2 = this.f2749h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    public final int getChangingConfigurations() {
        return this.f2746d | this.f2747e;
    }

    public final Drawable newDrawable() {
        return new C0162e(this, (Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0162e(this, resources);
    }
}

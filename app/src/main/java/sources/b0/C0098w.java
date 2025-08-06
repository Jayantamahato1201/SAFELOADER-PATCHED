package b0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b0.w  reason: case insensitive filesystem */
public class C0098w {

    /* renamed from: a  reason: collision with root package name */
    public int f1785a = -1;
    public RecyclerView b;

    /* renamed from: c  reason: collision with root package name */
    public J f1786c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1787d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1788e;
    public View f;

    /* renamed from: g  reason: collision with root package name */
    public final T f1789g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1790h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f1791i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f1792j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f1793k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f1794l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1795m;

    /* renamed from: n  reason: collision with root package name */
    public float f1796n;

    /* renamed from: o  reason: collision with root package name */
    public int f1797o;

    /* renamed from: p  reason: collision with root package name */
    public int f1798p;

    /* JADX WARNING: type inference failed for: r1v0, types: [b0.T, java.lang.Object] */
    public C0098w(Context context) {
        ? obj = new Object();
        obj.f1606d = -1;
        obj.f = false;
        obj.f1608g = 0;
        obj.f1604a = 0;
        obj.b = 0;
        obj.f1605c = Integer.MIN_VALUE;
        obj.f1607e = null;
        this.f1789g = obj;
        this.f1791i = new LinearInterpolator();
        this.f1792j = new DecelerateInterpolator();
        this.f1795m = false;
        this.f1797o = 0;
        this.f1798p = 0;
        this.f1794l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i2) {
        J j2 = this.f1786c;
        if (j2 == null || !j2.d()) {
            return 0;
        }
        K k2 = (K) view.getLayoutParams();
        return a((view.getLeft() - ((K) view.getLayoutParams()).b.left) - k2.leftMargin, view.getRight() + ((K) view.getLayoutParams()).b.right + k2.rightMargin, j2.E(), j2.f1588n - j2.F(), i2);
    }

    public int c(View view, int i2) {
        J j2 = this.f1786c;
        if (j2 == null || !j2.e()) {
            return 0;
        }
        K k2 = (K) view.getLayoutParams();
        return a((view.getTop() - ((K) view.getLayoutParams()).b.top) - k2.topMargin, view.getBottom() + ((K) view.getLayoutParams()).b.bottom + k2.bottomMargin, j2.G(), j2.f1589o - j2.D(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int e(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f1795m) {
            this.f1796n = d(this.f1794l);
            this.f1795m = true;
        }
        return (int) Math.ceil((double) (abs * this.f1796n));
    }

    public PointF f(int i2) {
        J j2 = this.f1786c;
        if (j2 instanceof U) {
            return ((U) j2).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + U.class.getCanonicalName());
        return null;
    }

    public final void g(int i2, int i3) {
        PointF f2;
        RecyclerView recyclerView = this.b;
        int i4 = -1;
        if (this.f1785a == -1 || recyclerView == null) {
            i();
        }
        if (this.f1787d && this.f == null && this.f1786c != null && (f2 = f(this.f1785a)) != null) {
            float f3 = f2.x;
            if (!(f3 == 0.0f && f2.y == 0.0f)) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), (int[]) null);
            }
        }
        boolean z2 = false;
        this.f1787d = false;
        View view = this.f;
        T t2 = this.f1789g;
        if (view != null) {
            this.b.getClass();
            Y I2 = RecyclerView.I(view);
            if (I2 != null) {
                i4 = I2.b();
            }
            if (i4 == this.f1785a) {
                View view2 = this.f;
                V v2 = recyclerView.f1509c0;
                h(view2, t2);
                t2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.f1788e) {
            V v3 = recyclerView.f1509c0;
            if (this.b.f1524l.v() == 0) {
                i();
            } else {
                int i5 = this.f1797o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1797o = i6;
                int i7 = this.f1798p;
                int i8 = i7 - i3;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f1798p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f4 = f(this.f1785a);
                    if (f4 != null) {
                        float f5 = f4.x;
                        if (!(f5 == 0.0f && f4.y == 0.0f)) {
                            float f6 = f4.y;
                            float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f5 * f5)));
                            float f7 = f4.x / sqrt;
                            f4.x = f7;
                            float f8 = f4.y / sqrt;
                            f4.y = f8;
                            this.f1793k = f4;
                            this.f1797o = (int) (f7 * 10000.0f);
                            this.f1798p = (int) (f8 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.f1791i;
                            t2.f1604a = (int) (((float) this.f1797o) * 1.2f);
                            t2.b = (int) (((float) this.f1798p) * 1.2f);
                            t2.f1605c = (int) (((float) e2) * 1.2f);
                            t2.f1607e = linearInterpolator;
                            t2.f = true;
                        }
                    }
                    t2.f1606d = this.f1785a;
                    i();
                }
            }
            if (t2.f1606d >= 0) {
                z2 = true;
            }
            t2.a(recyclerView);
            if (z2 && this.f1788e) {
                this.f1787d = true;
                recyclerView.f1504W.a();
            }
        }
    }

    public void h(View view, T t2) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f1793k;
        int i5 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i2 = 0;
        } else if (i4 > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int b2 = b(view, i2);
        PointF pointF2 = this.f1793k;
        if (!(pointF2 == null || pointF2.y == 0.0f)) {
            i5 = i3 > 0 ? 1 : -1;
        }
        int c2 = c(view, i5);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c2 * c2) + (b2 * b2))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f1792j;
            t2.f1604a = -b2;
            t2.b = -c2;
            t2.f1605c = ceil;
            t2.f1607e = decelerateInterpolator;
            t2.f = true;
        }
    }

    public final void i() {
        if (this.f1788e) {
            this.f1788e = false;
            this.f1798p = 0;
            this.f1797o = 0;
            this.f1793k = null;
            this.b.f1509c0.f1609a = -1;
            this.f = null;
            this.f1785a = -1;
            this.f1787d = false;
            J j2 = this.f1786c;
            if (j2.f1580e == this) {
                j2.f1580e = null;
            }
            this.f1786c = null;
            this.b = null;
        }
    }
}

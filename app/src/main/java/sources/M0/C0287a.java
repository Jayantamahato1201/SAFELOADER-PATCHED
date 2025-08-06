package m0;

import I.O;
import Q0.l;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: m0.a  reason: case insensitive filesystem */
public final class C0287a extends l {

    /* renamed from: l  reason: collision with root package name */
    public int f3661l;

    /* renamed from: m  reason: collision with root package name */
    public int f3662m = -1;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3663n;

    public C0287a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3663n = swipeDismissBehavior;
    }

    public final void L(View view, int i2) {
        this.f3662m = i2;
        this.f3661l = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3663n;
            swipeDismissBehavior.f1842c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1842c = false;
        }
    }

    public final void N(View view, int i2, int i3) {
        SwipeDismissBehavior swipeDismissBehavior = this.f3663n;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.f1844e;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f;
        float abs = (float) Math.abs(i2 - this.f3661l);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (java.lang.Math.abs(r4) >= java.lang.Math.round(((float) r9.getWidth()) * 0.5f)) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f3662m = r11
            int r11 = r9.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r8.f3663n
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = I.O.f393a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            int r6 = r0.f1843d
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0067
            goto L_0x0053
        L_0x002a:
            if (r4 <= 0) goto L_0x0067
            goto L_0x0053
        L_0x002d:
            if (r6 != r2) goto L_0x0067
            if (r5 == 0) goto L_0x0034
            if (r4 <= 0) goto L_0x0067
            goto L_0x0053
        L_0x0034:
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0067
            goto L_0x0053
        L_0x0039:
            int r4 = r9.getLeft()
            int r5 = r8.f3661l
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L_0x0067
        L_0x0053:
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x0062
            int r10 = r9.getLeft()
            int r1 = r8.f3661l
            if (r10 >= r1) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            int r1 = r1 + r11
            goto L_0x006a
        L_0x0062:
            int r10 = r8.f3661l
            int r1 = r10 - r11
            goto L_0x006a
        L_0x0067:
            int r1 = r8.f3661l
            r2 = 0
        L_0x006a:
            R.e r10 = r0.f1841a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r1, r11)
            if (r10 == 0) goto L_0x0080
            F.a r10 = new F.a
            r10.<init>((com.google.android.material.behavior.SwipeDismissBehavior) r0, (android.view.View) r9, (boolean) r2)
            java.util.WeakHashMap r11 = I.O.f393a
            r9.postOnAnimation(r10)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0287a.O(android.view.View, float, float):void");
    }

    public final boolean d0(View view, int i2) {
        int i3 = this.f3662m;
        if ((i3 == -1 || i3 == i2) && this.f3663n.r(view)) {
            return true;
        }
        return false;
    }

    public final int k(View view, int i2) {
        boolean z2;
        int i3;
        int i4;
        int width;
        WeakHashMap weakHashMap = O.f393a;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = this.f3663n.f1843d;
        if (i5 != 0) {
            if (i5 != 1) {
                i4 = this.f3661l - view.getWidth();
                i3 = view.getWidth() + this.f3661l;
            } else if (z2) {
                i4 = this.f3661l;
                width = view.getWidth();
            } else {
                i4 = this.f3661l - view.getWidth();
                i3 = this.f3661l;
            }
            return Math.min(Math.max(i4, i2), i3);
        } else if (z2) {
            i4 = this.f3661l - view.getWidth();
            i3 = this.f3661l;
            return Math.min(Math.max(i4, i2), i3);
        } else {
            i4 = this.f3661l;
            width = view.getWidth();
        }
        i3 = width + i4;
        return Math.min(Math.max(i4, i2), i3);
    }

    public final int l(View view, int i2) {
        return view.getTop();
    }

    public final int y(View view) {
        return view.getWidth();
    }

    public final void M(int i2) {
    }
}

package F0;

import A.g;
import A.i;
import Q0.l;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v.C0489a;

public final class d extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f224l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0489a f225m;

    public /* synthetic */ d(C0489a aVar, int i2) {
        this.f224l = i2;
        this.f225m = aVar;
    }

    public final void M(int i2) {
        switch (this.f224l) {
            case 0:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f225m;
                    if (sideSheetBehavior.f2061g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f225m;
                    if (bottomSheetBehavior.f1855K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void N(View view, int i2, int i3) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f224l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f225m;
                WeakReference weakReference = sideSheetBehavior.f2071q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.f2057a.x0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2075u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f2057a.g(i2);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw g.e(it);
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f225m).u(i3);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (java.lang.Math.abs(r6.getTop() - r2.x()) < java.lang.Math.abs(r6.getTop() - r2.f1849E)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (java.lang.Math.abs(r7 - r2.D) < java.lang.Math.abs(r7 - r2.f1851G)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (r0.f2057a.Z(r6) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (java.lang.Math.abs(r7 - r0.f2057a.L()) < java.lang.Math.abs(r7 - r0.f2057a.M())) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 > r2.f1849E) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            int r0 = r5.f224l
            switch(r0) {
                case 0: goto L_0x00f0;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 6
            r1 = 3
            v.a r2 = r5.f225m
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0027
            boolean r7 = r2.b
            if (r7 == 0) goto L_0x0017
        L_0x0014:
            r0 = 3
            goto L_0x00e8
        L_0x0017:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r2.getClass()
            int r8 = r2.f1849E
            if (r7 <= r8) goto L_0x0014
            goto L_0x00e8
        L_0x0027:
            boolean r4 = r2.f1853I
            if (r4 == 0) goto L_0x0076
            boolean r4 = r2.D(r6, r8)
            if (r4 == 0) goto L_0x0076
            float r7 = java.lang.Math.abs(r7)
            float r3 = java.lang.Math.abs(r8)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0044
            int r7 = r2.f1876d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0053
        L_0x0044:
            int r7 = r6.getTop()
            int r8 = r2.f1864T
            int r3 = r2.x()
            int r3 = r3 + r8
            int r3 = r3 / 2
            if (r7 <= r3) goto L_0x0056
        L_0x0053:
            r0 = 5
            goto L_0x00e8
        L_0x0056:
            boolean r7 = r2.b
            if (r7 == 0) goto L_0x005b
            goto L_0x0014
        L_0x005b:
            int r7 = r6.getTop()
            int r8 = r2.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r3 = r2.f1849E
            int r8 = r8 - r3
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00e8
            goto L_0x0014
        L_0x0076:
            r4 = 4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0088
            goto L_0x00a7
        L_0x0088:
            boolean r7 = r2.b
            if (r7 == 0) goto L_0x008e
        L_0x008c:
            r0 = 4
            goto L_0x00e8
        L_0x008e:
            int r7 = r6.getTop()
            int r8 = r2.f1849E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f1851G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
            goto L_0x00e8
        L_0x00a7:
            int r7 = r6.getTop()
            boolean r8 = r2.b
            if (r8 == 0) goto L_0x00c2
            int r8 = r2.D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f1851G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            goto L_0x0014
        L_0x00c2:
            int r8 = r2.f1849E
            if (r7 >= r8) goto L_0x00d6
            int r8 = r2.f1851G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00d2
            goto L_0x0014
        L_0x00d2:
            r2.getClass()
            goto L_0x00e8
        L_0x00d6:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f1851G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
        L_0x00e8:
            r2.getClass()
            r7 = 1
            r2.E(r6, r0, r7)
            return
        L_0x00f0:
            v.a r0 = r5.f225m
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            A.i r1 = r0.f2057a
            boolean r1 = r1.X(r7)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0145
        L_0x00fd:
            A.i r1 = r0.f2057a
            boolean r1 = r1.v0(r6, r7)
            if (r1 == 0) goto L_0x0116
            A.i r1 = r0.f2057a
            boolean r7 = r1.a0(r7, r8)
            if (r7 != 0) goto L_0x0147
            A.i r7 = r0.f2057a
            boolean r7 = r7.Z(r6)
            if (r7 == 0) goto L_0x0145
            goto L_0x0147
        L_0x0116:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0128
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0128
            goto L_0x0147
        L_0x0128:
            int r7 = r6.getLeft()
            A.i r8 = r0.f2057a
            int r8 = r8.L()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            A.i r1 = r0.f2057a
            int r1 = r1.M()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x0147
        L_0x0145:
            r7 = 3
            goto L_0x0148
        L_0x0147:
            r7 = 5
        L_0x0148:
            r8 = 1
            r0.t(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.d.O(android.view.View, float, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r6.canScrollVertically(-1) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f224l
            switch(r0) {
                case 0: goto L_0x0041;
                default: goto L_0x0005;
            }
        L_0x0005:
            v.a r0 = r4.f225m
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f1856L
            r2 = 1
            if (r1 != r2) goto L_0x000f
            goto L_0x003f
        L_0x000f:
            boolean r3 = r0.f1872a0
            if (r3 == 0) goto L_0x0014
            goto L_0x003f
        L_0x0014:
            r3 = 3
            if (r1 != r3) goto L_0x0031
            int r1 = r0.f1869Y
            if (r1 != r6) goto L_0x0031
            java.lang.ref.WeakReference r6 = r0.f1866V
            if (r6 == 0) goto L_0x0026
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x0031
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L_0x0031
            goto L_0x003f
        L_0x0031:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f1865U
            if (r6 == 0) goto L_0x003f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            return r2
        L_0x0041:
            v.a r6 = r4.f225m
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f2062h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            java.lang.ref.WeakReference r6 = r6.f2070p
            if (r6 == 0) goto L_0x0057
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L_0x0057
            r1 = 1
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.d.d0(android.view.View, int):boolean");
    }

    public final int k(View view, int i2) {
        switch (this.f224l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f225m;
                return i.l(i2, sideSheetBehavior.f2057a.P(), sideSheetBehavior.f2057a.O());
            default:
                return view.getLeft();
        }
    }

    public final int l(View view, int i2) {
        switch (this.f224l) {
            case 0:
                return view.getTop();
            default:
                return i.l(i2, ((BottomSheetBehavior) this.f225m).x(), z());
        }
    }

    public int y(View view) {
        switch (this.f224l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f225m;
                return sideSheetBehavior.f2066l + sideSheetBehavior.f2069o;
            default:
                return super.y(view);
        }
    }

    public int z() {
        switch (this.f224l) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f225m;
                if (bottomSheetBehavior.f1853I) {
                    return bottomSheetBehavior.f1864T;
                }
                return bottomSheetBehavior.f1851G;
            default:
                return super.z();
        }
    }
}

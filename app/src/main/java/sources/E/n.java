package e;

import I.C0024p;
import android.view.Window;
import j.C0209m;
import j.y;
import k.C0263q0;

public final class n implements C0024p, C0263q0, y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2531a;
    public final /* synthetic */ x b;

    public /* synthetic */ n(x xVar, int i2) {
        this.f2531a = i2;
        this.b = xVar;
    }

    public void a(C0209m mVar, boolean z2) {
        boolean z3;
        int i2;
        w wVar;
        switch (this.f2531a) {
            case 2:
                this.b.r(mVar);
                return;
            default:
                C0209m k2 = mVar.k();
                int i3 = 0;
                if (k2 != mVar) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    mVar = k2;
                }
                x xVar = this.b;
                w[] wVarArr = xVar.f2570L;
                if (wVarArr != null) {
                    i2 = wVarArr.length;
                } else {
                    i2 = 0;
                }
                while (true) {
                    if (i3 >= i2) {
                        wVar = null;
                    } else {
                        wVar = wVarArr[i3];
                        if (wVar == null || wVar.f2547h != mVar) {
                            i3++;
                        }
                    }
                }
                if (wVar == null) {
                    return;
                }
                if (z3) {
                    xVar.q(wVar.f2542a, wVar, k2);
                    xVar.s(wVar, true);
                    return;
                }
                xVar.s(wVar, z2);
                return;
        }
    }

    public boolean b(C0209m mVar) {
        Window.Callback callback;
        switch (this.f2531a) {
            case 2:
                Window.Callback callback2 = this.b.f2593l.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, mVar);
                return true;
            default:
                if (mVar != mVar.k()) {
                    return true;
                }
                x xVar = this.b;
                if (!xVar.f2564F || (callback = xVar.f2593l.getCallback()) == null || xVar.f2575Q) {
                    return true;
                }
                callback.onMenuOpened(108, mVar);
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public I.t0 c(android.view.View r17, I.t0 r18) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = 1
            r4 = 0
            int r5 = r2.d()
            r6 = r16
            e.x r7 = r6.b
            r7.getClass()
            int r8 = r2.d()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2603v
            r9 = 8
            if (r0 == 0) goto L_0x013b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x013b
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2603v
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2603v
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0128
            android.graphics.Rect r0 = r7.f2587c0
            if (r0 != 0) goto L_0x0046
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2587c0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2588d0 = r0
        L_0x0046:
            android.graphics.Rect r11 = r7.f2587c0
            android.graphics.Rect r0 = r7.f2588d0
            int r12 = r2.b()
            int r13 = r2.d()
            int r14 = r2.c()
            int r15 = r2.a()
            r11.set(r12, r13, r14, r15)
            android.view.ViewGroup r12 = r7.f2560A
            java.lang.reflect.Method r13 = k.D1.f3337a
            if (r13 == 0) goto L_0x0076
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x006e }
            r14[r4] = r11     // Catch:{ Exception -> 0x006e }
            r14[r3] = r0     // Catch:{ Exception -> 0x006e }
            r13.invoke(r12, r14)     // Catch:{ Exception -> 0x006e }
            goto L_0x0076
        L_0x006e:
            r0 = move-exception
            java.lang.String r12 = "ViewUtils"
            java.lang.String r13 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r12, r13, r0)
        L_0x0076:
            int r0 = r11.top
            int r12 = r11.left
            int r11 = r11.right
            android.view.ViewGroup r13 = r7.f2560A
            I.t0 r13 = I.O.h(r13)
            if (r13 != 0) goto L_0x0086
            r14 = 0
            goto L_0x008a
        L_0x0086:
            int r14 = r13.b()
        L_0x008a:
            if (r13 != 0) goto L_0x008e
            r13 = 0
            goto L_0x0092
        L_0x008e:
            int r13 = r13.c()
        L_0x0092:
            int r15 = r10.topMargin
            if (r15 != r0) goto L_0x00a1
            int r15 = r10.leftMargin
            if (r15 != r12) goto L_0x00a1
            int r15 = r10.rightMargin
            if (r15 == r11) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r11 = 0
            goto L_0x00a8
        L_0x00a1:
            r10.topMargin = r0
            r10.leftMargin = r12
            r10.rightMargin = r11
            r11 = 1
        L_0x00a8:
            android.content.Context r12 = r7.f2592k
            if (r0 <= 0) goto L_0x00d0
            android.view.View r0 = r7.f2562C
            if (r0 != 0) goto L_0x00d0
            android.view.View r0 = new android.view.View
            r0.<init>(r12)
            r7.f2562C = r0
            r0.setVisibility(r9)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r15 = r10.topMargin
            r3 = 51
            r9 = -1
            r0.<init>(r9, r15, r3)
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.ViewGroup r3 = r7.f2560A
            android.view.View r13 = r7.f2562C
            r3.addView(r13, r9, r0)
            goto L_0x00f3
        L_0x00d0:
            android.view.View r0 = r7.f2562C
            if (r0 == 0) goto L_0x00f3
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = r0.height
            int r9 = r10.topMargin
            if (r3 != r9) goto L_0x00e8
            int r3 = r0.leftMargin
            if (r3 != r14) goto L_0x00e8
            int r3 = r0.rightMargin
            if (r3 == r13) goto L_0x00f3
        L_0x00e8:
            r0.height = r9
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.View r3 = r7.f2562C
            r3.setLayoutParams(r0)
        L_0x00f3:
            android.view.View r0 = r7.f2562C
            if (r0 == 0) goto L_0x00f9
            r3 = 1
            goto L_0x00fa
        L_0x00f9:
            r3 = 0
        L_0x00fa:
            if (r3 == 0) goto L_0x011e
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x011e
            android.view.View r0 = r7.f2562C
            int r9 = r0.getWindowSystemUiVisibility()
            r9 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x0114
            r9 = 2131034118(0x7f050006, float:1.7678745E38)
            int r9 = t0.C0486a.d(r12, r9)
            goto L_0x011b
        L_0x0114:
            r9 = 2131034117(0x7f050005, float:1.7678742E38)
            int r9 = t0.C0486a.d(r12, r9)
        L_0x011b:
            r0.setBackgroundColor(r9)
        L_0x011e:
            boolean r0 = r7.f2566H
            if (r0 != 0) goto L_0x0125
            if (r3 == 0) goto L_0x0125
            r8 = 0
        L_0x0125:
            r0 = r3
            r3 = r11
            goto L_0x0133
        L_0x0128:
            int r0 = r10.topMargin
            if (r0 == 0) goto L_0x0131
            r10.topMargin = r4
            r0 = 0
            r3 = 1
            goto L_0x0133
        L_0x0131:
            r0 = 0
            r3 = 0
        L_0x0133:
            if (r3 == 0) goto L_0x013c
            androidx.appcompat.widget.ActionBarContextView r3 = r7.f2603v
            r3.setLayoutParams(r10)
            goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            android.view.View r3 = r7.f2562C
            if (r3 == 0) goto L_0x0148
            if (r0 == 0) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r4 = 8
        L_0x0145:
            r3.setVisibility(r4)
        L_0x0148:
            if (r5 == r8) goto L_0x017d
            int r0 = r2.b()
            int r3 = r2.c()
            int r4 = r2.a()
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r5 < r7) goto L_0x0162
            I.k0 r5 = new I.k0
            r5.<init>(r2)
            goto L_0x0171
        L_0x0162:
            r7 = 29
            if (r5 < r7) goto L_0x016c
            I.j0 r5 = new I.j0
            r5.<init>(r2)
            goto L_0x0171
        L_0x016c:
            I.i0 r5 = new I.i0
            r5.<init>(r2)
        L_0x0171:
            A.d r0 = A.d.b(r0, r8, r3, r4)
            r5.g(r0)
            I.t0 r0 = r5.b()
            goto L_0x017e
        L_0x017d:
            r0 = r2
        L_0x017e:
            java.util.WeakHashMap r2 = I.O.f393a
            android.view.WindowInsets r2 = r0.f()
            if (r2 == 0) goto L_0x0194
            android.view.WindowInsets r3 = I.B.b(r1, r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0194
            I.t0 r0 = I.t0.g(r1, r3)
        L_0x0194:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.c(android.view.View, I.t0):I.t0");
    }
}

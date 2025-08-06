package com.google.android.material.datepicker;

import F.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class l<S> extends u {

    /* renamed from: S  reason: collision with root package name */
    public int f1968S;

    /* renamed from: T  reason: collision with root package name */
    public b f1969T;

    /* renamed from: U  reason: collision with root package name */
    public p f1970U;

    /* renamed from: V  reason: collision with root package name */
    public int f1971V;

    /* renamed from: W  reason: collision with root package name */
    public c f1972W;

    /* renamed from: X  reason: collision with root package name */
    public RecyclerView f1973X;

    /* renamed from: Y  reason: collision with root package name */
    public RecyclerView f1974Y;

    /* renamed from: Z  reason: collision with root package name */
    public View f1975Z;

    /* renamed from: a0  reason: collision with root package name */
    public View f1976a0;

    /* renamed from: b0  reason: collision with root package name */
    public View f1977b0;

    /* renamed from: c0  reason: collision with root package name */
    public View f1978c0;

    public final void A(p pVar) {
        boolean z2;
        t tVar = (t) this.f1974Y.getAdapter();
        int d2 = tVar.f2017c.f.d(pVar);
        int d3 = d2 - tVar.f2017c.f.d(this.f1970U);
        boolean z3 = false;
        if (Math.abs(d3) > 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d3 > 0) {
            z3 = true;
        }
        this.f1970U = pVar;
        if (z2 && z3) {
            this.f1974Y.Y(d2 - 3);
            this.f1974Y.post(new b((Object) this, d2, 2));
        } else if (z2) {
            this.f1974Y.Y(d2 + 3);
            this.f1974Y.post(new b((Object) this, d2, 2));
        } else {
            this.f1974Y.post(new b((Object) this, d2, 2));
        }
    }

    public final void B(int i2) {
        this.f1971V = i2;
        if (i2 == 2) {
            this.f1973X.getLayoutManager().n0(this.f1970U.f2005h - ((z) this.f1973X.getAdapter()).f2023c.f1969T.f.f2005h);
            this.f1977b0.setVisibility(0);
            this.f1978c0.setVisibility(8);
            this.f1975Z.setVisibility(8);
            this.f1976a0.setVisibility(8);
        } else if (i2 == 1) {
            this.f1977b0.setVisibility(8);
            this.f1978c0.setVisibility(0);
            this.f1975Z.setVisibility(0);
            this.f1976a0.setVisibility(0);
            A(this.f1970U);
        }
    }

    public final void m(Bundle bundle) {
        super.m(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.f1968S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f1969T = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f1970U = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0192, code lost:
        r0 = new b0.C0101z();
        r1 = r11.f1974Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View n(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r11.h()
            int r2 = r11.f1968S
            r0.<init>(r1, r2)
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r11.f1972W = r1
            android.view.LayoutInflater r12 = r12.cloneInContext(r0)
            com.google.android.material.datepicker.b r1 = r11.f1969T
            com.google.android.material.datepicker.p r1 = r1.f
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = com.google.android.material.datepicker.n.D(r0, r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002a
            r3 = 2131427412(0x7f0b0054, float:1.847644E38)
            r6 = 1
            goto L_0x002e
        L_0x002a:
            r3 = 2131427407(0x7f0b004f, float:1.847643E38)
            r6 = 0
        L_0x002e:
            android.view.View r12 = r12.inflate(r3, r13, r5)
            android.content.Context r13 = r11.w()
            android.content.res.Resources r13 = r13.getResources()
            r3 = 2131100314(0x7f06029a, float:1.7813006E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r7 = 2131100315(0x7f06029b, float:1.7813008E38)
            int r7 = r13.getDimensionPixelOffset(r7)
            int r7 = r7 + r3
            r3 = 2131100313(0x7f060299, float:1.7813004E38)
            int r3 = r13.getDimensionPixelOffset(r3)
            int r3 = r3 + r7
            r7 = 2131100298(0x7f06028a, float:1.7812974E38)
            int r7 = r13.getDimensionPixelSize(r7)
            int r8 = com.google.android.material.datepicker.q.f2010d
            r9 = 2131100293(0x7f060285, float:1.7812963E38)
            int r9 = r13.getDimensionPixelSize(r9)
            int r9 = r9 * r8
            int r8 = r8 - r4
            r10 = 2131100312(0x7f060298, float:1.7813002E38)
            int r10 = r13.getDimensionPixelOffset(r10)
            int r10 = r10 * r8
            int r10 = r10 + r9
            r8 = 2131100290(0x7f060282, float:1.7812957E38)
            int r13 = r13.getDimensionPixelOffset(r8)
            int r3 = r3 + r7
            int r3 = r3 + r10
            int r3 = r3 + r13
            r12.setMinimumHeight(r3)
            r13 = 2131230982(0x7f080106, float:1.8078032E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.GridView r13 = (android.widget.GridView) r13
            O.h r3 = new O.h
            r7 = 1
            r3.<init>(r7)
            I.O.p(r13, r3)
            com.google.android.material.datepicker.b r3 = r11.f1969T
            int r3 = r3.f1951j
            com.google.android.material.datepicker.e r7 = new com.google.android.material.datepicker.e
            if (r3 <= 0) goto L_0x0099
            r7.<init>(r3)
            goto L_0x009c
        L_0x0099:
            r7.<init>()
        L_0x009c:
            r13.setAdapter(r7)
            int r1 = r1.f2006i
            r13.setNumColumns(r1)
            r13.setEnabled(r5)
            r13 = 2131230985(0x7f080109, float:1.8078038E38)
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r11.f1974Y = r13
            com.google.android.material.datepicker.g r13 = new com.google.android.material.datepicker.g
            r13.<init>(r11, r6, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1974Y
            r1.setLayoutManager(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f1974Y
            java.lang.String r1 = "MONTHS_VIEW_GROUP_TAG"
            r13.setTag(r1)
            com.google.android.material.datepicker.t r13 = new com.google.android.material.datepicker.t
            com.google.android.material.datepicker.b r1 = r11.f1969T
            A.j r3 = new A.j
            r5 = 21
            r3.<init>((int) r5, (java.lang.Object) r11)
            r13.<init>(r0, r1, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1974Y
            r1.setAdapter(r13)
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131296306(0x7f090032, float:1.8210525E38)
            int r1 = r1.getInteger(r3)
            r3 = 2131230988(0x7f08010c, float:1.8078044E38)
            android.view.View r5 = r12.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r11.f1973X = r5
            if (r5 == 0) goto L_0x010f
            r5.setHasFixedSize(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r11.f1973X
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r1)
            r5.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1973X
            com.google.android.material.datepicker.z r5 = new com.google.android.material.datepicker.z
            r5.<init>(r11)
            r1.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1973X
            com.google.android.material.datepicker.h r5 = new com.google.android.material.datepicker.h
            r5.<init>(r11)
            r1.g(r5)
        L_0x010f:
            r1 = 2131230975(0x7f0800ff, float:1.8078018E38)
            android.view.View r5 = r12.findViewById(r1)
            if (r5 == 0) goto L_0x018c
            android.view.View r1 = r12.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r5 = "SELECTOR_TOGGLE_TAG"
            r1.setTag(r5)
            com.google.android.material.datepicker.i r5 = new com.google.android.material.datepicker.i
            r6 = 0
            r5.<init>(r6, r11)
            I.O.p(r1, r5)
            r5 = 2131230977(0x7f080101, float:1.8078022E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f1975Z = r5
            java.lang.String r6 = "NAVIGATION_PREV_TAG"
            r5.setTag(r6)
            r5 = 2131230976(0x7f080100, float:1.807802E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f1976a0 = r5
            java.lang.String r6 = "NAVIGATION_NEXT_TAG"
            r5.setTag(r6)
            android.view.View r3 = r12.findViewById(r3)
            r11.f1977b0 = r3
            r3 = 2131230981(0x7f080105, float:1.807803E38)
            android.view.View r3 = r12.findViewById(r3)
            r11.f1978c0 = r3
            r11.B(r4)
            com.google.android.material.datepicker.p r3 = r11.f1970U
            java.lang.String r3 = r3.c()
            r1.setText(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f1974Y
            com.google.android.material.datepicker.j r4 = new com.google.android.material.datepicker.j
            r4.<init>(r11, r13, r1)
            r3.h(r4)
            com.google.android.material.datepicker.k r3 = new com.google.android.material.datepicker.k
            r4 = 0
            r3.<init>(r4, r11)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f1976a0
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r4 = 1
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f1975Z
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r4 = 0
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
        L_0x018c:
            boolean r0 = com.google.android.material.datepicker.n.D(r0, r2)
            if (r0 != 0) goto L_0x01df
            b0.z r0 = new b0.z
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1974Y
            androidx.recyclerview.widget.RecyclerView r2 = r0.f1802a
            if (r2 != r1) goto L_0x019e
            goto L_0x01df
        L_0x019e:
            b0.b0 r3 = r0.b
            if (r2 == 0) goto L_0x01af
            java.util.ArrayList r2 = r2.e0
            if (r2 == 0) goto L_0x01a9
            r2.remove(r3)
        L_0x01a9:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f1802a
            r4 = 0
            r2.setOnFlingListener(r4)
        L_0x01af:
            r0.f1802a = r1
            if (r1 == 0) goto L_0x01df
            b0.L r1 = r1.getOnFlingListener()
            if (r1 != 0) goto L_0x01d7
            androidx.recyclerview.widget.RecyclerView r1 = r0.f1802a
            r1.h(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f1802a
            r1.setOnFlingListener(r0)
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r2 = r0.f1802a
            android.content.Context r2 = r2.getContext()
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.<init>(r2, r3)
            r0.f()
            goto L_0x01df
        L_0x01d7:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An instance of OnFlingListener already set."
            r12.<init>(r13)
            throw r12
        L_0x01df:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f1974Y
            com.google.android.material.datepicker.p r1 = r11.f1970U
            com.google.android.material.datepicker.b r13 = r13.f2017c
            com.google.android.material.datepicker.p r13 = r13.f
            int r13 = r13.d(r1)
            r0.Y(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f1974Y
            O.h r0 = new O.h
            r1 = 2
            r0.<init>(r1)
            I.O.p(r13, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.n(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final void r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1968S);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1969T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1970U);
    }
}

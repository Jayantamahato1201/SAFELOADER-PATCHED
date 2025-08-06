package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0098w;
import b0.V;

public final class g extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ int f1960E;

    /* renamed from: F  reason: collision with root package name */
    public final /* synthetic */ l f1961F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i2, int i3) {
        super(i2);
        this.f1961F = lVar;
        this.f1960E = i3;
    }

    public final void A0(V v2, int[] iArr) {
        int i2 = this.f1960E;
        l lVar = this.f1961F;
        if (i2 == 0) {
            iArr[0] = lVar.f1974Y.getWidth();
            iArr[1] = lVar.f1974Y.getWidth();
            return;
        }
        iArr[0] = lVar.f1974Y.getHeight();
        iArr[1] = lVar.f1974Y.getHeight();
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        C0098w wVar = new C0098w(recyclerView.getContext());
        wVar.f1785a = i2;
        y0(wVar);
    }
}

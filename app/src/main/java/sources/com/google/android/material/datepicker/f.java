package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import b0.J;
import java.util.Calendar;

public final class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1958a;
    public final /* synthetic */ t b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1959c;

    public /* synthetic */ f(l lVar, t tVar, int i2) {
        this.f1958a = i2;
        this.f1959c = lVar;
        this.b = tVar;
    }

    public final void onClick(View view) {
        int i2;
        switch (this.f1958a) {
            case 0:
                l lVar = this.f1959c;
                int K02 = ((LinearLayoutManager) lVar.f1974Y.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = x.a(this.b.f2017c.f.f);
                    a2.add(2, K02);
                    lVar.A(new p(a2));
                    return;
                }
                return;
            default:
                l lVar2 = this.f1959c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar2.f1974Y.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                if (M02 == null) {
                    i2 = -1;
                } else {
                    i2 = J.H(M02);
                }
                int i3 = i2 + 1;
                if (i3 < lVar2.f1974Y.getAdapter().a()) {
                    Calendar a3 = x.a(this.b.f2017c.f.f);
                    a3.add(2, i3);
                    lVar2.A(new p(a3));
                    return;
                }
                return;
        }
    }
}

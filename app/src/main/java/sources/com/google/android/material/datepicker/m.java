package com.google.android.material.datepicker;

import I.C0024p;
import I.t0;
import android.view.View;

public final class m implements C0024p {

    /* renamed from: a  reason: collision with root package name */
    public final View f1979a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1980c;

    public m(View view) {
        this.f1979a = view;
    }

    public t0 c(View view, t0 t0Var) {
        int i2 = t0Var.f464a.f(7).b;
        View view2 = this.f1979a;
        int i3 = this.b;
        if (i3 >= 0) {
            view2.getLayoutParams().height = i3 + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1980c + i2, view2.getPaddingRight(), view2.getPaddingBottom());
        return t0Var;
    }

    public m(View view, int i2, int i3) {
        this.b = i2;
        this.f1979a = view;
        this.f1980c = i3;
    }
}

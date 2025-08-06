package com.google.android.material.datepicker;

import A.i;
import E0.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.cheatbox.R;
import j0.C0219a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f1954a;
    public final e b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i.j0(context, R.attr.MT_Bin, l.class.getCanonicalName()).data, C0219a.f3185l);
        e.c(context, obtainStyledAttributes.getResourceId(4, 0));
        e.c(context, obtainStyledAttributes.getResourceId(2, 0));
        e.c(context, obtainStyledAttributes.getResourceId(3, 0));
        e.c(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList H2 = i.H(context, obtainStyledAttributes, 7);
        this.f1954a = e.c(context, obtainStyledAttributes.getResourceId(9, 0));
        e.c(context, obtainStyledAttributes.getResourceId(8, 0));
        this.b = e.c(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(H2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

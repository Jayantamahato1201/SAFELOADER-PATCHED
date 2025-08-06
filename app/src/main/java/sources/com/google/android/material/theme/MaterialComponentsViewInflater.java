package com.google.android.material.theme;

import A.i;
import H0.z;
import J0.a;
import O.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.cheatbox.R;
import com.google.android.material.button.MaterialButton;
import e.C0119A;
import j0.C0219a;
import k.C0245h0;
import k.C0256n;
import k.C0260p;
import k.C0262q;
import k.E;
import r0.c;
import y0.l;

public class MaterialComponentsViewInflater extends C0119A {
    public final C0256n a(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    public final C0260p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final C0262q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.E, android.widget.CompoundButton, android.view.View, A0.a] */
    public final E d(Context context, AttributeSet attributeSet) {
        ? e2 = new E(a.a(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin), attributeSet);
        Context context2 = e2.getContext();
        TypedArray f = l.f(context2, attributeSet, C0219a.f3188o, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        if (f.hasValue(0)) {
            b.c(e2, i.H(context2, f, 0));
        }
        e2.f = f.getBoolean(1, false);
        f.recycle();
        return e2;
    }

    public final C0245h0 e(Context context, AttributeSet attributeSet) {
        C0245h0 h0Var = new C0245h0(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = h0Var.getContext();
        if (i.i0(context2, R.attr.MT_Bin, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C0219a.f3191r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g2 = I0.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C0219a.f3190q);
                    int g3 = I0.a.g(h0Var.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (g3 >= 0) {
                        h0Var.setLineHeight(g3);
                    }
                }
            }
        }
        return h0Var;
    }
}

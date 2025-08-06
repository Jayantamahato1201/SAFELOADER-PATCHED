package com.google.android.material.datepicker;

import E0.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b0.C0072B;
import b0.Y;
import com.cheatbox.R;
import java.util.Locale;

public final class z extends C0072B {

    /* renamed from: c  reason: collision with root package name */
    public final l f2023c;

    public z(l lVar) {
        this.f2023c = lVar;
    }

    public final int a() {
        return this.f2023c.f1969T.f1952k;
    }

    public final void c(Y y2, int i2) {
        String str;
        l lVar = this.f2023c;
        int i3 = lVar.f1969T.f.f2005h + i2;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i3)});
        TextView textView = ((y) y2).f2022t;
        textView.setText(format);
        Context context = textView.getContext();
        if (x.b().get(1) == i3) {
            str = String.format(context.getString(R.string.MT_Bin), new Object[]{Integer.valueOf(i3)});
        } else {
            str = String.format(context.getString(R.string.MT_Bin), new Object[]{Integer.valueOf(i3)});
        }
        textView.setContentDescription(str);
        c cVar = lVar.f1972W;
        if (x.b().get(1) == i3) {
            e eVar = cVar.b;
        } else {
            e eVar2 = cVar.f1954a;
        }
        throw null;
    }

    public final Y d(ViewGroup viewGroup) {
        return new y((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.MT_Bin, viewGroup, false));
    }
}

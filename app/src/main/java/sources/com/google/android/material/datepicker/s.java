package com.google.android.material.datepicker;

import I.C0032y;
import I.O;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.Y;
import com.cheatbox.R;
import java.util.WeakHashMap;

public final class s extends Y {

    /* renamed from: t  reason: collision with root package name */
    public final TextView f2015t;

    /* renamed from: u  reason: collision with root package name */
    public final MaterialCalendarGridView f2016u;

    public s(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.MT_Bin);
        this.f2015t = textView;
        WeakHashMap weakHashMap = O.f393a;
        new C0032y(R.id.MT_Bin, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f2016u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.MT_Bin);
        if (!z2) {
            textView.setVisibility(8);
        }
    }
}

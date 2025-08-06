package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2014a;
    public final /* synthetic */ t b;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = tVar;
        this.f2014a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2014a;
        q a2 = materialCalendarGridView.a();
        if (i2 >= a2.a() && i2 <= a2.c()) {
            if (materialCalendarGridView.a().getItem(i2).longValue() >= ((l) this.b.f2018d.b).f1969T.f1949h.f) {
                throw null;
            }
        }
    }
}

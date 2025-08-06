package com.google.android.material.datepicker;

import A.j;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.C0072B;
import b0.K;
import b0.Y;
import com.cheatbox.R;
import java.util.Calendar;

public final class t extends C0072B {

    /* renamed from: c  reason: collision with root package name */
    public final b f2017c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2018d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2019e;

    public t(ContextThemeWrapper contextThemeWrapper, b bVar, j jVar) {
        int i2;
        p pVar = bVar.f;
        p pVar2 = bVar.f1950i;
        if (pVar.f.compareTo(pVar2.f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (pVar2.f.compareTo(bVar.f1948g.f) <= 0) {
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Bin) * q.f2010d;
            if (n.D(contextThemeWrapper, 16843277)) {
                i2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            } else {
                i2 = 0;
            }
            this.f2019e = dimensionPixelSize + i2;
            this.f2017c = bVar;
            this.f2018d = jVar;
            if (!this.f1568a.a()) {
                this.b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f2017c.f1953l;
    }

    public final long b(int i2) {
        Calendar a2 = x.a(this.f2017c.f.f);
        a2.add(2, i2);
        a2.set(5, 1);
        Calendar a3 = x.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    public final void c(Y y2, int i2) {
        s sVar = (s) y2;
        b bVar = this.f2017c;
        Calendar a2 = x.a(bVar.f.f);
        a2.add(2, i2);
        p pVar = new p(a2);
        sVar.f2015t.setText(pVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f2016u.findViewById(R.id.MT_Bin);
        if (materialCalendarGridView.a() == null || !pVar.equals(materialCalendarGridView.a().f2012a)) {
            new q(pVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final Y d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.MT_Bin, viewGroup, false);
        if (!n.D(viewGroup.getContext(), 16843277)) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new K(-1, this.f2019e));
        return new s(linearLayout, true);
    }
}

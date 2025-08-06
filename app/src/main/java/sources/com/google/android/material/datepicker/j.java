package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.J;
import b0.M;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f1965a;
    public final /* synthetic */ MaterialButton b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1966c;

    public j(l lVar, t tVar, MaterialButton materialButton) {
        this.f1966c = lVar;
        this.f1965a = tVar;
        this.b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        String str;
        l lVar = this.f1966c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1974Y.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            if (M02 == null) {
                i4 = -1;
            } else {
                i4 = J.H(M02);
            }
        } else {
            i4 = ((LinearLayoutManager) lVar.f1974Y.getLayoutManager()).K0();
        }
        b bVar = this.f1965a.f2017c;
        Calendar a2 = x.a(bVar.f.f);
        a2.add(2, i4);
        lVar.f1970U = new p(a2);
        Calendar a3 = x.a(bVar.f.f);
        a3.add(2, i4);
        a3.set(5, 1);
        Calendar a4 = x.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = x.f2021a;
            DateFormat c2 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            c2.setTimeZone(TimeZone.getTimeZone("UTC"));
            DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            c2.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            str = c2.format(new Date(timeInMillis));
        } else {
            str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
        }
        this.b.setText(str);
    }
}

package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.G;
import java.util.Calendar;

public final class h extends G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f1962a;

    public h(l lVar) {
        this.f1962a = lVar;
        x.c((Calendar) null);
        x.c((Calendar) null);
    }

    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            z zVar = (z) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f1962a.getClass();
            throw null;
        }
    }
}

package com.google.android.material.timepicker;

import E0.h;
import E0.j;
import F0.g;
import I.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cheatbox.R;
import j0.C0219a;
import java.util.WeakHashMap;

public abstract class e extends ConstraintLayout {

    /* renamed from: p  reason: collision with root package name */
    public final g f2185p = new g(9, this);

    /* renamed from: q  reason: collision with root package name */
    public int f2186q;

    /* renamed from: r  reason: collision with root package name */
    public final E0.g f2187r;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        LayoutInflater.from(context).inflate(R.layout.MT_Bin, this);
        E0.g gVar = new E0.g();
        this.f2187r = gVar;
        h hVar = new h(0.5f);
        j e2 = gVar.f118a.f103a.e();
        e2.f142e = hVar;
        e2.f = hVar;
        e2.f143g = hVar;
        e2.f144h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2187r.j(ColorStateList.valueOf(-1));
        E0.g gVar2 = this.f2187r;
        WeakHashMap weakHashMap = O.f393a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3193t, R.attr.MT_Bin, 0);
        this.f2186q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = O.f393a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f2185p;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void f();

    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f2185p;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public final void setBackgroundColor(int i2) {
        this.f2187r.j(ColorStateList.valueOf(i2));
    }
}

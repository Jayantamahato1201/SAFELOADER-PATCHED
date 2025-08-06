package com.google.android.material.datepicker;

import I.O;
import O.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.cheatbox.R;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1946a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x.c((Calendar) null);
        if (n.D(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.MT_Bin);
            setNextFocusRightId(R.id.MT_Bin);
        }
        this.f1946a = n.D(getContext(), R.attr.MT_Bin);
        O.p(this, new h(3));
    }

    public final q a() {
        return (q) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (q) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((q) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q qVar = (q) super.getAdapter();
        qVar.getClass();
        int max = Math.max(qVar.a(), getFirstVisiblePosition());
        int min = Math.min(qVar.c(), getLastVisiblePosition());
        qVar.getItem(max);
        qVar.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
        } else if (i2 == 33) {
            setSelection(((q) super.getAdapter()).c());
        } else if (i2 == 130) {
            setSelection(((q) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((q) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((q) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i2, int i3) {
        if (this.f1946a) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    public final void setSelection(int i2) {
        if (i2 < ((q) super.getAdapter()).a()) {
            super.setSelection(((q) super.getAdapter()).a());
        } else {
            super.setSelection(i2);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m9getAdapter() {
        return (q) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof q) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()}));
    }
}

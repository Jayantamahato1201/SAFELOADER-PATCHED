package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class i implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2190a;

    public i(GestureDetector gestureDetector) {
        this.f2190a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2190a.onTouchEvent(motionEvent);
        }
        return false;
    }
}

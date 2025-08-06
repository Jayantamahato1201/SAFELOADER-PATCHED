package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2183a;

    public b(ClockFaceView clockFaceView) {
        this.f2183a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2183a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2161s.f2171d) - clockFaceView.f2155A;
        if (height != clockFaceView.f2186q) {
            clockFaceView.f2186q = height;
            clockFaceView.f();
            int i2 = clockFaceView.f2186q;
            ClockHandView clockHandView = clockFaceView.f2161s;
            clockHandView.f2178l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}

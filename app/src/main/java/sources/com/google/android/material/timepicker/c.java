package com.google.android.material.timepicker;

import I.C0010b;
import J.g;
import J.k;
import J.l;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cheatbox.R;

public final class c extends C0010b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2184d;

    public c(ClockFaceView clockFaceView) {
        this.f2184d = clockFaceView;
    }

    public final void d(View view, l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.MT_Bin)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.f2184d.f2165w.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        lVar.i(k.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        lVar.b(g.f478e);
    }

    public final boolean g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.g(view, i2, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2184d;
        view.getHitRect(clockFaceView.f2162t);
        float centerX = (float) clockFaceView.f2162t.centerX();
        float centerY = (float) clockFaceView.f2162t.centerY();
        clockFaceView.f2161s.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2161s.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}

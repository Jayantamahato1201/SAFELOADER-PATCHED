package u0;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: u0.a  reason: case insensitive filesystem */
public final class C0488a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f4725a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4726c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4727d;

    public C0488a(Dialog dialog, Rect rect) {
        this.f4725a = dialog;
        this.b = rect.left;
        this.f4726c = rect.top;
        this.f4727d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.b;
        int width = findViewById.getWidth() + left;
        int top2 = findViewById.getTop() + this.f4726c;
        if (new RectF((float) left, (float) top2, (float) width, (float) (findViewById.getHeight() + top2)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f4727d;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f4725a.onTouchEvent(obtain);
    }
}

package com.google.android.material.timepicker;

import I.O;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.cheatbox.R;
import j0.C0219a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.C0281a;
import t0.C0486a;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f2169a = new ValueAnimator();
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2170c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final int f2171d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2172e;
    public final Paint f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f2173g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2174h;

    /* renamed from: i  reason: collision with root package name */
    public float f2175i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2176j;

    /* renamed from: k  reason: collision with root package name */
    public double f2177k;

    /* renamed from: l  reason: collision with root package name */
    public int f2178l;

    /* renamed from: m  reason: collision with root package name */
    public int f2179m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        Paint paint = new Paint();
        this.f = paint;
        this.f2173g = new RectF();
        this.f2179m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3179e, R.attr.MT_Bin, R.style.MT_Bin);
        C0486a.q(context, R.attr.MT_Bin, 200);
        C0486a.r(context, R.attr.MT_Bin, C0281a.b);
        this.f2178l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2171d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2174h = resources.getDimensionPixelSize(R.dimen.MT_Bin);
        this.f2172e = (float) resources.getDimensionPixelSize(R.dimen.MT_Bin);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = O.f393a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i2) {
        if (i2 == 2) {
            return Math.round(((float) this.f2178l) * 0.66f);
        }
        return this.f2178l;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f2169a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.f2175i = f3;
        this.f2177k = Math.toRadians((double) (f3 - 90.0f));
        float a2 = (float) a(this.f2179m);
        float cos = (((float) Math.cos(this.f2177k)) * a2) + ((float) (getWidth() / 2));
        float sin = (a2 * ((float) Math.sin(this.f2177k))) + ((float) (getHeight() / 2));
        float f4 = (float) this.f2171d;
        this.f2173g.set(cos - f4, sin - f4, cos + f4, sin + f4);
        ArrayList arrayList = this.f2170c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ClockFaceView clockFaceView = (ClockFaceView) ((d) obj);
            if (Math.abs(clockFaceView.f2159F - f3) > 0.001f) {
                clockFaceView.f2159F = f3;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a2 = a(this.f2179m);
        float f2 = (float) width;
        float f3 = (float) a2;
        float cos = (((float) Math.cos(this.f2177k)) * f3) + f2;
        float f4 = (float) height;
        Paint paint = this.f;
        paint.setStrokeWidth(0.0f);
        int i2 = this.f2171d;
        canvas.drawCircle(cos, (f3 * ((float) Math.sin(this.f2177k))) + f4, (float) i2, paint);
        double sin = Math.sin(this.f2177k);
        double d2 = (double) ((float) (a2 - i2));
        paint.setStrokeWidth((float) this.f2174h);
        Canvas canvas2 = canvas;
        canvas2.drawLine(f2, f4, (float) (width + ((int) (Math.cos(this.f2177k) * d2))), (float) (height + ((int) (d2 * sin))), paint);
        canvas2.drawCircle(f2, f4, this.f2172e, paint);
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!this.f2169a.isRunning()) {
            b(this.f2175i);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z3 = this.f2176j;
                if (this.b) {
                    if (((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics())) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    this.f2179m = i2;
                }
            } else {
                z3 = false;
            }
            z2 = false;
        } else {
            this.f2176j = false;
            z3 = false;
            z2 = true;
        }
        boolean z6 = this.f2176j;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y2 - ((float) (getHeight() / 2))), (double) (x2 - ((float) (getWidth() / 2)))));
        int i3 = degrees + 90;
        if (i3 < 0) {
            i3 = degrees + 450;
        }
        float f2 = (float) i3;
        if (this.f2175i != f2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z4) {
            if (z4 || z3) {
                b(f2);
            }
            this.f2176j = z6 | z5;
            return true;
        }
        z5 = true;
        this.f2176j = z6 | z5;
        return true;
    }
}

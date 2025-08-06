package com.google.android.material.timepicker;

import A.i;
import I.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.cheatbox.R;
import j0.C0219a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t.C0483h;
import t.C0484i;
import t.m;
import t0.C0486a;

class ClockFaceView extends e implements d {

    /* renamed from: A  reason: collision with root package name */
    public final int f2155A;

    /* renamed from: B  reason: collision with root package name */
    public final int f2156B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2157C;
    public final int D;

    /* renamed from: E  reason: collision with root package name */
    public final String[] f2158E;

    /* renamed from: F  reason: collision with root package name */
    public float f2159F;

    /* renamed from: G  reason: collision with root package name */
    public final ColorStateList f2160G;

    /* renamed from: s  reason: collision with root package name */
    public final ClockHandView f2161s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f2162t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f2163u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final Rect f2164v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final SparseArray f2165w;

    /* renamed from: x  reason: collision with root package name */
    public final c f2166x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2167y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f2168z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f2165w = sparseArray;
        this.f2168z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3178d, R.attr.MT_Bin, R.style.MT_Bin);
        Resources resources = getResources();
        ColorStateList H2 = i.H(context, obtainStyledAttributes, 1);
        this.f2160G = H2;
        LayoutInflater.from(context).inflate(R.layout.MT_Bin, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.MT_Bin);
        this.f2161s = clockHandView;
        this.f2155A = resources.getDimensionPixelSize(R.dimen.MT_Bin);
        int colorForState = H2.getColorForState(new int[]{16842913}, H2.getDefaultColor());
        this.f2167y = new int[]{colorForState, colorForState, H2.getDefaultColor()};
        clockHandView.f2170c.add(this);
        int defaultColor = C0486a.g(context, R.color.MT_Bin).getDefaultColor();
        ColorStateList H3 = i.H(context, obtainStyledAttributes, 0);
        setBackgroundColor(H3 != null ? H3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2166x = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2158E = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f2158E.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2158E.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.MT_Bin, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f2158E[i2]);
                textView.setTag(R.id.MT_Bin, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.MT_Bin, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                O.p(textView, this.f2166x);
                textView.setTextColor(this.f2160G);
            }
        }
        ClockHandView clockHandView2 = this.f2161s;
        if (clockHandView2.b && !z2) {
            clockHandView2.f2179m = 1;
        }
        clockHandView2.b = z2;
        clockHandView2.invalidate();
        this.f2156B = resources.getDimensionPixelSize(R.dimen.MT_Bin);
        this.f2157C = resources.getDimensionPixelSize(R.dimen.MT_Bin);
        this.D = resources.getDimensionPixelSize(R.dimen.MT_Bin);
    }

    public final void f() {
        int i2;
        m mVar = new m();
        mVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.MT_Bin && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.MT_Bin);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i2 = Math.round(((float) this.f2186q) * 0.66f);
            } else {
                i2 = this.f2186q;
            }
            float f = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                HashMap hashMap2 = mVar.f4705c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new C0483h());
                }
                C0484i iVar = ((C0483h) hashMap2.get(Integer.valueOf(id2))).f4624d;
                iVar.f4680w = R.id.MT_Bin;
                iVar.f4681x = i2;
                iVar.f4682y = f;
                f += 360.0f / ((float) list.size());
            }
        }
        mVar.a(this);
        setConstraintSet((m) null);
        requestLayout();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f2165w;
            if (i5 < sparseArray.size()) {
                ((TextView) sparseArray.get(i5)).setVisibility(0);
                i5++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f2161s.f2173g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f2165w;
            int size = sparseArray.size();
            rectF = this.f2163u;
            rect = this.f2162t;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textView3.setSelected(z2);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f2164v;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2167y, this.f2168z, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2158E.length, false, 1));
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        g();
    }

    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.D) / Math.max(Math.max(((float) this.f2156B) / ((float) displayMetrics.heightPixels), ((float) this.f2157C) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}

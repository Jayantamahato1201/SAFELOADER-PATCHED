package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cheatbox.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f2180q = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Chip f2181p;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(R.layout.MT_Bin, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.MT_Bin);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).f1916c.add(new Object());
        Chip chip = (Chip) findViewById(R.id.MT_Bin);
        Chip chip2 = (Chip) findViewById(R.id.MT_Bin);
        this.f2181p = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.MT_Bin);
        i iVar = new i(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(iVar);
        chip2.setOnTouchListener(iVar);
        chip.setTag(R.id.MT_Bin, 12);
        chip2.setTag(R.id.MT_Bin, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f2181p.sendAccessibilityEvent(8);
        }
    }
}

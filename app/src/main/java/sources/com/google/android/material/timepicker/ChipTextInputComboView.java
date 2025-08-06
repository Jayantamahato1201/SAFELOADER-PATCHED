package com.google.android.material.timepicker;

import F0.g;
import I.O;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.cheatbox.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f2154a;
    public final EditText b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.MT_Bin, this, false);
        this.f2154a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.MT_Bin, this, false);
        EditText editText = textInputLayout.getEditText();
        this.b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = O.f393a;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(R.id.MT_Bin)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f2154a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final void setChecked(boolean z2) {
        int i2;
        Chip chip = this.f2154a;
        chip.setChecked(z2);
        int i3 = 0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        EditText editText = this.b;
        editText.setVisibility(i2);
        if (z2) {
            i3 = 8;
        }
        chip.setVisibility(i3);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new g(14, editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2154a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i2, Object obj) {
        this.f2154a.setTag(i2, obj);
    }

    public final void toggle() {
        this.f2154a.toggle();
    }
}

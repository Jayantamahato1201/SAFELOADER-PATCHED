package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import y0.k;

public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2182a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2182a = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2182a;
        if (isEmpty) {
            chipTextInputComboView.f2154a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a2 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2154a;
        if (TextUtils.isEmpty(a2)) {
            a2 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a2);
    }
}

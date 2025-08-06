package s0;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f4479a;

    public /* synthetic */ a(Chip chip) {
        this.f4479a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f4479a.f1932i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
        }
    }
}

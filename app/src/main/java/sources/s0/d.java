package s0;

import J.g;
import J.l;
import R.b;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cheatbox.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

public final class d extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f4483q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f4483q = chip;
    }

    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f1926w;
        Chip chip = this.f4483q;
        if (chip.c() && (fVar = chip.f1929e) != null && fVar.f4500K && chip.f1931h != null) {
            arrayList.add(1);
        }
    }

    public final void o(int i2, l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        CharSequence charSequence = "";
        if (i2 == 1) {
            Chip chip = this.f4483q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.MT_Bin, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            lVar.b(g.f478e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.f1926w);
    }
}

package s0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class c extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f4482a;

    public c(Chip chip) {
        this.f4482a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        f fVar = this.f4482a.f1929e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

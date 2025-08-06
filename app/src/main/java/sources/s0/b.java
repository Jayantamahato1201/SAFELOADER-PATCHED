package s0;

import A.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import y0.j;

public final class b extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4480o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4481p;

    public /* synthetic */ b(int i2, Object obj) {
        this.f4480o = i2;
        this.f4481p = obj;
    }

    public final void d0(int i2) {
        switch (this.f4480o) {
            case 0:
                return;
            default:
                j jVar = (j) this.f4481p;
                jVar.f4843d = true;
                y0.i iVar = (y0.i) jVar.f4844e.get();
                if (iVar != null) {
                    f fVar = (f) iVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public final void e0(Typeface typeface, boolean z2) {
        CharSequence charSequence;
        switch (this.f4480o) {
            case 0:
                Chip chip = (Chip) this.f4481p;
                f fVar = chip.f1929e;
                if (fVar.f4491C0) {
                    charSequence = fVar.f4493E;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z2) {
                    j jVar = (j) this.f4481p;
                    jVar.f4843d = true;
                    y0.i iVar = (y0.i) jVar.f4844e.get();
                    if (iVar != null) {
                        f fVar2 = (f) iVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void A0(int i2) {
    }
}

package H0;

import E0.f;
import E0.g;
import android.animation.ValueAnimator;
import b0.C0088l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

public final class F implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f276a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F(int i2, Object obj) {
        this.f276a = i2;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f276a) {
            case 0:
                ((TextInputLayout) this.b).f2146v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0088l lVar = (C0088l) this.b;
                lVar.f1722c.setAlpha(floatValue);
                lVar.f1723d.setAlpha(floatValue);
                lVar.f1737s.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.b).f1881i;
                if (gVar != null) {
                    f fVar = gVar.f118a;
                    if (fVar.f109i != floatValue2) {
                        fVar.f109i = floatValue2;
                        gVar.f121e = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

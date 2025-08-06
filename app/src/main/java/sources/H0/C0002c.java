package H0;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: H0.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0002c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f282a;
    public final /* synthetic */ C0004e b;

    public /* synthetic */ C0002c(C0004e eVar, int i2) {
        this.f282a = i2;
        this.b = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f282a) {
            case 0:
                C0004e eVar = this.b;
                eVar.getClass();
                eVar.f342d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C0004e eVar2 = this.b;
                eVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar2.f342d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}

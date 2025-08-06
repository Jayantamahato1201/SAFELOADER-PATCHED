package I;

import A.d;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

public final class Y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f400a;
    public final /* synthetic */ t0 b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t0 f401c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f402d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f403e;

    public Y(g0 g0Var, t0 t0Var, t0 t0Var2, int i2, View view) {
        this.f400a = g0Var;
        this.b = t0Var;
        this.f401c = t0Var2;
        this.f402d = i2;
        this.f403e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l0 l0Var;
        float f;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        g0 g0Var = this.f400a;
        g0Var.f430a.d(animatedFraction);
        float b2 = g0Var.f430a.b();
        PathInterpolator pathInterpolator = b0.f410e;
        int i3 = Build.VERSION.SDK_INT;
        t0 t0Var = this.b;
        if (i3 >= 30) {
            l0Var = new k0(t0Var);
        } else if (i3 >= 29) {
            l0Var = new j0(t0Var);
        } else {
            l0Var = new i0(t0Var);
        }
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f402d & i4;
            r0 r0Var = t0Var.f464a;
            if (i5 == 0) {
                l0Var.c(i4, r0Var.f(i4));
                f = b2;
                i2 = 1;
            } else {
                d f2 = r0Var.f(i4);
                d f3 = this.f401c.f464a.f(i4);
                float f4 = 1.0f - b2;
                f = b2;
                i2 = 1;
                l0Var.c(i4, t0.e(f2, (int) (((double) (((float) (f2.f4a - f3.f4a)) * f4)) + 0.5d), (int) (((double) (((float) (f2.b - f3.b)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f5c - f3.f5c)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f6d - f3.f6d)) * f4)) + 0.5d)));
            }
            i4 <<= i2;
            b2 = f;
        }
        b0.g(this.f403e, l0Var.b(), Collections.singletonList(g0Var));
    }
}

package f0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: f0.E  reason: case insensitive filesystem */
public final class C0146E extends C0145D {
    public final float f(View view) {
        return view.getTransitionAlpha();
    }

    public final void m(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    public final void n(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public final void o(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    public final void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

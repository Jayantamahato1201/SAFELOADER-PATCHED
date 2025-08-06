package y0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: y0.c  reason: case insensitive filesystem */
public abstract class C0501c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4821a = new ThreadLocal();
    public static final ThreadLocal b = new ThreadLocal();

    public static void a(ViewGroup viewGroup, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            a(viewGroup, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}

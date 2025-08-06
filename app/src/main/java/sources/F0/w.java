package f0;

import E0.e;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2693a;
    public static final C0151b b = new C0151b(Float.class, "translationAlpha", 5);

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f2693a = new e(25);
        } else if (i2 >= 23) {
            f2693a = new e(25);
        } else if (i2 >= 22) {
            f2693a = new e(25);
        } else {
            f2693a = new e(25);
        }
        new C0151b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        f2693a.m(view, i2, i3, i4, i5);
    }

    public static void b(View view, int i2) {
        f2693a.o(view, i2);
    }
}

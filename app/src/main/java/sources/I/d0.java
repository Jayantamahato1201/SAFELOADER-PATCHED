package I;

import A.d;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class d0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final C0012d f416a;
    public List b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f417c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f418d = new HashMap();

    public d0(C0012d dVar) {
        super(0);
        this.f416a = dVar;
    }

    public final g0 a(WindowInsetsAnimation windowInsetsAnimation) {
        g0 g0Var = (g0) this.f418d.get(windowInsetsAnimation);
        if (g0Var == null) {
            g0Var = new g0(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                g0Var.f430a = new e0(windowInsetsAnimation);
            }
            this.f418d.put(windowInsetsAnimation, g0Var);
        }
        return g0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0012d dVar = this.f416a;
        a(windowInsetsAnimation);
        ((View) dVar.f415e).setTranslationY(0.0f);
        this.f418d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0012d dVar = this.f416a;
        a(windowInsetsAnimation);
        int[] iArr = (int[]) dVar.f;
        ((View) dVar.f415e).getLocationOnScreen(iArr);
        dVar.f413c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f417c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f417c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = c0.j(list.get(size));
            g0 a2 = a(j2);
            a2.f430a.d(j2.getFraction());
            this.f417c.add(a2);
        }
        C0012d dVar = this.f416a;
        t0 g2 = t0.g((View) null, windowInsets);
        dVar.a(g2, this.b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0012d dVar = this.f416a;
        a(windowInsetsAnimation);
        d c2 = d.c(bounds.getLowerBound());
        d c3 = d.c(bounds.getUpperBound());
        View view = (View) dVar.f415e;
        int[] iArr = (int[]) dVar.f;
        view.getLocationOnScreen(iArr);
        int i2 = dVar.f413c - iArr[1];
        dVar.f414d = i2;
        view.setTranslationY((float) i2);
        c0.m();
        return c0.h(c2.d(), c3.d());
    }
}

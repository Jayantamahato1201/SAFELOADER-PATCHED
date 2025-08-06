package k;

import I.D;
import I.O;
import N.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import d.a;
import d1.n;
import java.util.WeakHashMap;

/* renamed from: k.o  reason: case insensitive filesystem */
public final class C0258o {

    /* renamed from: a  reason: collision with root package name */
    public final View f3530a;
    public final C0267t b;

    /* renamed from: c  reason: collision with root package name */
    public int f3531c = -1;

    /* renamed from: d  reason: collision with root package name */
    public n f3532d;

    /* renamed from: e  reason: collision with root package name */
    public n f3533e;
    public n f;

    public C0258o(View view) {
        this.f3530a = view;
        this.b = C0267t.a();
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [d1.n, java.lang.Object] */
    public final void a() {
        View view = this.f3530a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 ? i2 == 21 : this.f3532d != null) {
                if (this.f == null) {
                    this.f = new Object();
                }
                n nVar = this.f;
                nVar.f2338c = null;
                nVar.b = false;
                nVar.f2339d = null;
                nVar.f2337a = false;
                WeakHashMap weakHashMap = O.f393a;
                ColorStateList g2 = D.g(view);
                if (g2 != null) {
                    nVar.b = true;
                    nVar.f2338c = g2;
                }
                PorterDuff.Mode h2 = D.h(view);
                if (h2 != null) {
                    nVar.f2337a = true;
                    nVar.f2339d = h2;
                }
                if (nVar.b || nVar.f2337a) {
                    C0267t.e(background, nVar, view.getDrawableState());
                    return;
                }
            }
            n nVar2 = this.f3533e;
            if (nVar2 != null) {
                C0267t.e(background, nVar2, view.getDrawableState());
                return;
            }
            n nVar3 = this.f3532d;
            if (nVar3 != null) {
                C0267t.e(background, nVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        n nVar = this.f3533e;
        if (nVar != null) {
            return (ColorStateList) nVar.f2338c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        n nVar = this.f3533e;
        if (nVar != null) {
            return (PorterDuff.Mode) nVar.f2339d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList i3;
        View view = this.f3530a;
        Context context = view.getContext();
        int[] iArr = a.f2216z;
        g E2 = g.E(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) E2.f606c;
        View view2 = this.f3530a;
        O.o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) E2.f606c, i2);
        boolean z2 = false;
        try {
            if (typedArray.hasValue(0)) {
                this.f3531c = typedArray.getResourceId(0, -1);
                C0267t tVar = this.b;
                Context context2 = view.getContext();
                int i4 = this.f3531c;
                synchronized (tVar) {
                    i3 = tVar.f3565a.i(context2, i4);
                }
                if (i3 != null) {
                    g(i3);
                }
            }
            if (typedArray.hasValue(1)) {
                O.r(view, E2.o(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode b2 = C0268t0.b(typedArray.getInt(2, -1), (PorterDuff.Mode) null);
                int i5 = Build.VERSION.SDK_INT;
                D.r(view, b2);
                if (i5 == 21) {
                    Drawable background = view.getBackground();
                    if (!(D.g(view) == null && D.h(view) == null)) {
                        z2 = true;
                    }
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            E2.F();
        } catch (Throwable th) {
            Throwable th2 = th;
            E2.F();
            throw th2;
        }
    }

    public final void e() {
        this.f3531c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateList;
        this.f3531c = i2;
        C0267t tVar = this.b;
        if (tVar != null) {
            Context context = this.f3530a.getContext();
            synchronized (tVar) {
                colorStateList = tVar.f3565a.i(context, i2);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d1.n, java.lang.Object] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3532d == null) {
                this.f3532d = new Object();
            }
            n nVar = this.f3532d;
            nVar.f2338c = colorStateList;
            nVar.b = true;
        } else {
            this.f3532d = null;
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d1.n, java.lang.Object] */
    public final void h(ColorStateList colorStateList) {
        if (this.f3533e == null) {
            this.f3533e = new Object();
        }
        n nVar = this.f3533e;
        nVar.f2338c = colorStateList;
        nVar.b = true;
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d1.n, java.lang.Object] */
    public final void i(PorterDuff.Mode mode) {
        if (this.f3533e == null) {
            this.f3533e = new Object();
        }
        n nVar = this.f3533e;
        nVar.f2339d = mode;
        nVar.f2337a = true;
        a();
    }
}

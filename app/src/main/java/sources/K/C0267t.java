package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import d1.n;

/* renamed from: k.t  reason: case insensitive filesystem */
public final class C0267t {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0267t f3564c;

    /* renamed from: a  reason: collision with root package name */
    public U0 f3565a;

    public static synchronized C0267t a() {
        C0267t tVar;
        synchronized (C0267t.class) {
            try {
                if (f3564c == null) {
                    d();
                }
                tVar = f3564c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return tVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        synchronized (C0267t.class) {
            h2 = U0.h(i2, mode);
        }
        return h2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [k.t, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C0267t.class) {
            if (f3564c == null) {
                ? obj = new Object();
                f3564c = obj;
                obj.f3565a = U0.d();
                f3564c.f3565a.m(new C0265s());
            }
        }
    }

    public static void e(Drawable drawable, n nVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = U0.f3416h;
        int[] state = drawable.getState();
        int[] iArr2 = C0268t0.f3566a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = nVar.b;
            if (z2 || nVar.f2337a) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z2) {
                    colorStateList = (ColorStateList) nVar.f2338c;
                } else {
                    colorStateList = null;
                }
                if (nVar.f2337a) {
                    mode = (PorterDuff.Mode) nVar.f2339d;
                } else {
                    mode = U0.f3416h;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = U0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f3565a.f(context, i2);
    }
}

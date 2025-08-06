package k;

import I.O;
import N.g;
import O.f;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import d.a;
import d1.n;

/* renamed from: k.y  reason: case insensitive filesystem */
public final class C0277y {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f3595a;
    public n b;

    /* renamed from: c  reason: collision with root package name */
    public n f3596c;

    /* renamed from: d  reason: collision with root package name */
    public int f3597d = 0;

    public C0277y(ImageView imageView) {
        this.f3595a = imageView;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [d1.n, java.lang.Object] */
    public final void a() {
        ImageView imageView = this.f3595a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0268t0.a(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 && i2 == 21) {
                if (this.f3596c == null) {
                    this.f3596c = new Object();
                }
                n nVar = this.f3596c;
                nVar.f2338c = null;
                nVar.b = false;
                nVar.f2339d = null;
                nVar.f2337a = false;
                ColorStateList a2 = f.a(imageView);
                if (a2 != null) {
                    nVar.b = true;
                    nVar.f2338c = a2;
                }
                PorterDuff.Mode b2 = f.b(imageView);
                if (b2 != null) {
                    nVar.f2337a = true;
                    nVar.f2339d = b2;
                }
                if (nVar.b || nVar.f2337a) {
                    C0267t.e(drawable, nVar, imageView.getDrawableState());
                    return;
                }
            }
            n nVar2 = this.b;
            if (nVar2 != null) {
                C0267t.e(drawable, nVar2, imageView.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        ImageView imageView = this.f3595a;
        Context context = imageView.getContext();
        int[] iArr = a.f;
        g E2 = g.E(context, attributeSet, iArr, i2);
        O.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E2.f606c, i2);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E2.f606c;
            if (drawable3 == null) {
                int resourceId = typedArray.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable3 = l.v(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable3);
                }
            }
            if (drawable3 != null) {
                C0268t0.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList o2 = E2.o(2);
                int i3 = Build.VERSION.SDK_INT;
                f.c(imageView, o2);
                if (!(i3 != 21 || (drawable2 = imageView.getDrawable()) == null || f.a(imageView) == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b2 = C0268t0.b(typedArray.getInt(3, -1), (PorterDuff.Mode) null);
                int i4 = Build.VERSION.SDK_INT;
                f.d(imageView, b2);
                if (!(i4 != 21 || (drawable = imageView.getDrawable()) == null || f.a(imageView) == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            E2.F();
        } catch (Throwable th) {
            Throwable th2 = th;
            E2.F();
            throw th2;
        }
    }
}

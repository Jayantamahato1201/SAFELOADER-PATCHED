package b0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: b0.y  reason: case insensitive filesystem */
public final class C0100y extends C0098w {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1800q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f1801r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0100y(Object obj, Context context, int i2) {
        super(context);
        this.f1800q = i2;
        this.f1801r = obj;
    }

    public int b(View view, int i2) {
        switch (this.f1800q) {
            case 1:
                ((CarouselLayoutManager) this.f1801r).getClass();
                return 0;
            default:
                return super.b(view, i2);
        }
    }

    public int c(View view, int i2) {
        switch (this.f1800q) {
            case 1:
                ((CarouselLayoutManager) this.f1801r).getClass();
                return 0;
            default:
                return super.c(view, i2);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1800q) {
            case 0:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int e(int i2) {
        switch (this.f1800q) {
            case 0:
                return Math.min(100, super.e(i2));
            default:
                return super.e(i2);
        }
    }

    public PointF f(int i2) {
        switch (this.f1800q) {
            case 1:
                ((CarouselLayoutManager) this.f1801r).getClass();
                return null;
            default:
                return super.f(i2);
        }
    }

    public void h(View view, T t2) {
        switch (this.f1800q) {
            case 0:
                C0101z zVar = (C0101z) this.f1801r;
                int[] a2 = zVar.a(zVar.f1802a.getLayoutManager(), view);
                int i2 = a2[0];
                int i3 = a2[1];
                int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f1792j;
                    t2.f1604a = i2;
                    t2.b = i3;
                    t2.f1605c = ceil;
                    t2.f1607e = decelerateInterpolator;
                    t2.f = true;
                    return;
                }
                return;
            default:
                super.h(view, t2);
                return;
        }
    }
}

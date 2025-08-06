package E0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class q extends s {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f176h = new RectF();
    public final float b;

    /* renamed from: c  reason: collision with root package name */
    public final float f177c;

    /* renamed from: d  reason: collision with root package name */
    public final float f178d;

    /* renamed from: e  reason: collision with root package name */
    public final float f179e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f180g;

    public q(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.f177c = f3;
        this.f178d = f4;
        this.f179e = f5;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f182a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f176h;
        rectF.set(this.b, this.f177c, this.f178d, this.f179e);
        path.arcTo(rectF, this.f, this.f180g, false);
        path.transform(matrix);
    }
}

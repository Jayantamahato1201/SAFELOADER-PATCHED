package E0;

import android.graphics.Matrix;
import android.graphics.Path;

public final class r extends s {
    public float b;

    /* renamed from: c  reason: collision with root package name */
    public float f181c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f182a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.f181c);
        path.transform(matrix);
    }
}

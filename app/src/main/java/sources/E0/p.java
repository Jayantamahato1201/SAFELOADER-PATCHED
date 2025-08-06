package E0;

import D0.a;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

public final class p extends t {

    /* renamed from: c  reason: collision with root package name */
    public final r f173c;

    /* renamed from: d  reason: collision with root package name */
    public final float f174d;

    /* renamed from: e  reason: collision with root package name */
    public final float f175e;

    public p(r rVar, float f, float f2) {
        this.f173c = rVar;
        this.f174d = f;
        this.f175e = f2;
    }

    public final void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        a aVar2 = aVar;
        int i3 = i2;
        Canvas canvas2 = canvas;
        r rVar = this.f173c;
        float f = rVar.f181c;
        float f2 = this.f175e;
        float f3 = rVar.b;
        float f4 = this.f174d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
        Matrix matrix2 = this.f183a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        aVar2.getClass();
        rectF.bottom += (float) i3;
        rectF.offset(0.0f, (float) (-i3));
        int[] iArr = a.f75i;
        iArr[0] = aVar2.f;
        iArr[1] = aVar2.f82e;
        iArr[2] = aVar2.f81d;
        Paint paint = aVar2.f80c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, a.f76j, Shader.TileMode.CLAMP));
        canvas2.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas2.restore();
    }

    public final float b() {
        r rVar = this.f173c;
        return (float) Math.toDegrees(Math.atan((double) ((rVar.f181c - this.f175e) / (rVar.b - this.f174d))));
    }
}

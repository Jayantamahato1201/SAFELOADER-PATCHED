package E0;

import D0.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public final class o extends t {

    /* renamed from: c  reason: collision with root package name */
    public final q f172c;

    public o(q qVar) {
        this.f172c = qVar;
    }

    public final void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        boolean z2;
        a aVar2 = aVar;
        int i3 = i2;
        Canvas canvas2 = canvas;
        q qVar = this.f172c;
        float f = qVar.f;
        float f2 = qVar.f180g;
        RectF rectF = new RectF(qVar.b, qVar.f177c, qVar.f178d, qVar.f179e);
        aVar2.getClass();
        if (f2 < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Path path = aVar2.f83g;
        int[] iArr = a.f77k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar2.f;
            iArr[2] = aVar2.f82e;
            iArr[3] = aVar2.f81d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i3);
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = aVar2.f81d;
            iArr[2] = aVar2.f82e;
            iArr[3] = aVar2.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i3) / width);
            float[] fArr = a.f78l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            float f5 = f2;
            Paint paint = aVar2.b;
            paint.setShader(radialGradient);
            canvas2.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z2) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.f84h);
            }
            canvas.drawArc(rectF, f, f5, true, paint);
            canvas.restore();
        }
    }
}

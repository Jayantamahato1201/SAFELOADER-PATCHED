package g0;

import A.h;
import A.i;
import android.animation.TypeEvaluator;

public final class f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public h[] f2809a;

    public final Object evaluate(float f, Object obj, Object obj2) {
        h[] hVarArr = (h[]) obj;
        h[] hVarArr2 = (h[]) obj2;
        if (i.h(hVarArr, hVarArr2)) {
            if (!i.h(this.f2809a, hVarArr)) {
                this.f2809a = i.B(hVarArr);
            }
            for (int i2 = 0; i2 < hVarArr.length; i2++) {
                h hVar = this.f2809a[i2];
                h hVar2 = hVarArr[i2];
                h hVar3 = hVarArr2[i2];
                hVar.getClass();
                hVar.f8a = hVar2.f8a;
                int i3 = 0;
                while (true) {
                    float[] fArr = hVar2.b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    hVar.b[i3] = (hVar3.b[i3] * f) + ((1.0f - f) * fArr[i3]);
                    i3++;
                }
            }
            return this.f2809a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}

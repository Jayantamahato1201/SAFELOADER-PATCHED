package g0;

import A.h;
import A.i;

public abstract class m extends l {

    /* renamed from: a  reason: collision with root package name */
    public h[] f2831a = null;
    public String b;

    /* renamed from: c  reason: collision with root package name */
    public int f2832c = 0;

    public m() {
    }

    public h[] getPathData() {
        return this.f2831a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(h[] hVarArr) {
        if (!i.h(this.f2831a, hVarArr)) {
            this.f2831a = i.B(hVarArr);
            return;
        }
        h[] hVarArr2 = this.f2831a;
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            hVarArr2[i2].f8a = hVarArr[i2].f8a;
            int i3 = 0;
            while (true) {
                float[] fArr = hVarArr[i2].b;
                if (i3 >= fArr.length) {
                    break;
                }
                hVarArr2[i2].b[i3] = fArr[i3];
                i3++;
            }
        }
    }

    public m(m mVar) {
        this.b = mVar.b;
        this.f2831a = i.B(mVar.f2831a);
    }
}

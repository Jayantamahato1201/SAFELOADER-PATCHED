package H0;

import K0.G;
import N.g;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.SparseArray;
import o1.v;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f317a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f318c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f319d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(v vVar, int i2) {
        this((Bitmap) null, vVar, i2, 0);
        StringBuilder sb = G.f520a;
        if (vVar != null) {
            return;
        }
        throw new NullPointerException("source == null");
    }

    public r(Bitmap bitmap, v vVar, int i2, int i3) {
        if ((bitmap != null) != (vVar != null)) {
            this.f318c = bitmap;
            this.f319d = vVar;
            if (i2 != 0) {
                this.f317a = i2;
                this.b = i3;
                return;
            }
            throw new NullPointerException("loadedFrom == null");
        }
        throw new AssertionError();
    }

    public r(s sVar, g gVar) {
        this.f318c = new SparseArray();
        this.f319d = sVar;
        TypedArray typedArray = (TypedArray) gVar.f606c;
        this.f317a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(52, 0);
    }
}

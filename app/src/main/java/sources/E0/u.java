package E0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public float f184a;
    public float b;

    /* renamed from: c  reason: collision with root package name */
    public float f185c;

    /* renamed from: d  reason: collision with root package name */
    public float f186d;

    /* renamed from: e  reason: collision with root package name */
    public float f187e;
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f188g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f186d;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.b;
                float f6 = this.f185c;
                q qVar = new q(f5, f6, f5, f6);
                qVar.f = this.f186d;
                qVar.f180g = f4;
                this.f188g.add(new o(qVar));
                this.f186d = f2;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((s) arrayList.get(i2)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [E0.s, java.lang.Object, E0.r] */
    public final void c(float f2, float f3) {
        ? sVar = new s();
        sVar.b = f2;
        sVar.f181c = f3;
        this.f.add(sVar);
        p pVar = new p(sVar, this.b, this.f185c);
        a(pVar.b() + 270.0f);
        this.f188g.add(pVar);
        this.f186d = pVar.b() + 270.0f;
        this.b = f2;
        this.f185c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f184a = f2;
        this.b = 0.0f;
        this.f185c = f2;
        this.f186d = f3;
        this.f187e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.f188g.clear();
    }
}

package g0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import n.C0289b;

public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f2822a;
    public final ArrayList b;

    /* renamed from: c  reason: collision with root package name */
    public float f2823c;

    /* renamed from: d  reason: collision with root package name */
    public float f2824d;

    /* renamed from: e  reason: collision with root package name */
    public float f2825e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f2826g;

    /* renamed from: h  reason: collision with root package name */
    public float f2827h;

    /* renamed from: i  reason: collision with root package name */
    public float f2828i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f2829j;

    /* renamed from: k  reason: collision with root package name */
    public String f2830k;

    public k() {
        this.f2822a = new Matrix();
        this.b = new ArrayList();
        this.f2823c = 0.0f;
        this.f2824d = 0.0f;
        this.f2825e = 0.0f;
        this.f = 1.0f;
        this.f2826g = 1.0f;
        this.f2827h = 0.0f;
        this.f2828i = 0.0f;
        this.f2829j = new Matrix();
        this.f2830k = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((l) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f2829j;
        matrix.reset();
        matrix.postTranslate(-this.f2824d, -this.f2825e);
        matrix.postScale(this.f, this.f2826g);
        matrix.postRotate(this.f2823c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2827h + this.f2824d, this.f2828i + this.f2825e);
    }

    public String getGroupName() {
        return this.f2830k;
    }

    public Matrix getLocalMatrix() {
        return this.f2829j;
    }

    public float getPivotX() {
        return this.f2824d;
    }

    public float getPivotY() {
        return this.f2825e;
    }

    public float getRotation() {
        return this.f2823c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f2826g;
    }

    public float getTranslateX() {
        return this.f2827h;
    }

    public float getTranslateY() {
        return this.f2828i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f2824d) {
            this.f2824d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f2825e) {
            this.f2825e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f2823c) {
            this.f2823c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f2826g) {
            this.f2826g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f2827h) {
            this.f2827h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f2828i) {
            this.f2828i = f2;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [g0.m, g0.j] */
    public k(k kVar, C0289b bVar) {
        m mVar;
        this.f2822a = new Matrix();
        this.b = new ArrayList();
        this.f2823c = 0.0f;
        this.f2824d = 0.0f;
        this.f2825e = 0.0f;
        this.f = 1.0f;
        this.f2826g = 1.0f;
        this.f2827h = 0.0f;
        this.f2828i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2829j = matrix;
        this.f2830k = null;
        this.f2823c = kVar.f2823c;
        this.f2824d = kVar.f2824d;
        this.f2825e = kVar.f2825e;
        this.f = kVar.f;
        this.f2826g = kVar.f2826g;
        this.f2827h = kVar.f2827h;
        this.f2828i = kVar.f2828i;
        String str = kVar.f2830k;
        this.f2830k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(kVar.f2829j);
        ArrayList arrayList = kVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof k) {
                this.b.add(new k((k) obj, bVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ? mVar2 = new m(jVar);
                    mVar2.f2813e = 0.0f;
                    mVar2.f2814g = 1.0f;
                    mVar2.f2815h = 1.0f;
                    mVar2.f2816i = 0.0f;
                    mVar2.f2817j = 1.0f;
                    mVar2.f2818k = 0.0f;
                    mVar2.f2819l = Paint.Cap.BUTT;
                    mVar2.f2820m = Paint.Join.MITER;
                    mVar2.f2821n = 4.0f;
                    mVar2.f2812d = jVar.f2812d;
                    mVar2.f2813e = jVar.f2813e;
                    mVar2.f2814g = jVar.f2814g;
                    mVar2.f = jVar.f;
                    mVar2.f2832c = jVar.f2832c;
                    mVar2.f2815h = jVar.f2815h;
                    mVar2.f2816i = jVar.f2816i;
                    mVar2.f2817j = jVar.f2817j;
                    mVar2.f2818k = jVar.f2818k;
                    mVar2.f2819l = jVar.f2819l;
                    mVar2.f2820m = jVar.f2820m;
                    mVar2.f2821n = jVar.f2821n;
                    mVar = mVar2;
                } else if (obj instanceof i) {
                    mVar = new m((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(mVar);
                String str2 = mVar.b;
                if (str2 != null) {
                    bVar.put(str2, mVar);
                }
            }
        }
    }
}

package g0;

import A.h;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import n.C0289b;
import n.k;

public final class n {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f2833p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f2834a;
    public final Path b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f2835c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f2836d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f2837e;
    public PathMeasure f;

    /* renamed from: g  reason: collision with root package name */
    public final k f2838g;

    /* renamed from: h  reason: collision with root package name */
    public float f2839h;

    /* renamed from: i  reason: collision with root package name */
    public float f2840i;

    /* renamed from: j  reason: collision with root package name */
    public float f2841j;

    /* renamed from: k  reason: collision with root package name */
    public float f2842k;

    /* renamed from: l  reason: collision with root package name */
    public int f2843l;

    /* renamed from: m  reason: collision with root package name */
    public String f2844m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f2845n;

    /* renamed from: o  reason: collision with root package name */
    public final C0289b f2846o;

    /* JADX WARNING: type inference failed for: r0v4, types: [n.b, n.k] */
    public n() {
        this.f2835c = new Matrix();
        this.f2839h = 0.0f;
        this.f2840i = 0.0f;
        this.f2841j = 0.0f;
        this.f2842k = 0.0f;
        this.f2843l = 255;
        this.f2844m = null;
        this.f2845n = null;
        this.f2846o = new k();
        this.f2838g = new k();
        this.f2834a = new Path();
        this.b = new Path();
    }

    public final void a(k kVar, Matrix matrix, Canvas canvas, int i2, int i3) {
        float f2;
        boolean z2;
        float f3;
        int i4;
        Path.FillType fillType;
        float f4;
        Path.FillType fillType2;
        k kVar2 = kVar;
        char c2 = 1;
        kVar2.f2822a.set(matrix);
        Matrix matrix2 = kVar2.f2822a;
        matrix2.preConcat(kVar2.f2829j);
        canvas.save();
        char c3 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = kVar2.b;
            if (i5 < arrayList.size()) {
                l lVar = (l) arrayList.get(i5);
                if (lVar instanceof k) {
                    a((k) lVar, matrix2, canvas, i2, i3);
                } else {
                    Canvas canvas2 = canvas;
                    if (lVar instanceof m) {
                        m mVar = (m) lVar;
                        float f5 = ((float) i2) / this.f2841j;
                        float f6 = ((float) i3) / this.f2842k;
                        float min = Math.min(f5, f6);
                        Matrix matrix3 = this.f2835c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f5, f6);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float f7 = min;
                        float f8 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot((double) fArr[c3], (double) fArr[c2]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                        if (max > 0.0f) {
                            f2 = Math.abs(f8) / max;
                        } else {
                            f2 = 0.0f;
                        }
                        if (f2 != 0.0f) {
                            Path path = this.f2834a;
                            mVar.getClass();
                            path.reset();
                            h[] hVarArr = mVar.f2831a;
                            if (hVarArr != null) {
                                h.b(hVarArr, path);
                            }
                            Path path2 = this.b;
                            path2.reset();
                            if (mVar instanceof i) {
                                if (mVar.f2832c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas2.clipPath(path2);
                            } else {
                                j jVar = (j) mVar;
                                float f9 = jVar.f2816i;
                                if (!(f9 == 0.0f && jVar.f2817j == 1.0f)) {
                                    float f10 = jVar.f2818k;
                                    float f11 = (f9 + f10) % 1.0f;
                                    float f12 = (jVar.f2817j + f10) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, false);
                                    float length = this.f.getLength();
                                    float f13 = f11 * length;
                                    float f14 = f12 * length;
                                    path.reset();
                                    if (f13 > f14) {
                                        this.f.getSegment(f13, length, path, true);
                                        f4 = 0.0f;
                                        this.f.getSegment(0.0f, f14, path, true);
                                    } else {
                                        f4 = 0.0f;
                                        this.f.getSegment(f13, f14, path, true);
                                    }
                                    path.rLineTo(f4, f4);
                                }
                                path2.addPath(path, matrix3);
                                h1.h hVar = jVar.f;
                                if (((Shader) hVar.f2923c) == null && hVar.b == 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (this.f2837e == null) {
                                        i4 = 16777215;
                                        Paint paint = new Paint(1);
                                        this.f2837e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    } else {
                                        i4 = 16777215;
                                    }
                                    Paint paint2 = this.f2837e;
                                    Shader shader = (Shader) hVar.f2923c;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(jVar.f2815h * 255.0f));
                                        f3 = 255.0f;
                                    } else {
                                        paint2.setShader((Shader) null);
                                        paint2.setAlpha(255);
                                        int i6 = hVar.b;
                                        float f15 = jVar.f2815h;
                                        PorterDuff.Mode mode = q.f2858j;
                                        f3 = 255.0f;
                                        paint2.setColor((i6 & i4) | (((int) (((float) Color.alpha(i6)) * f15)) << 24));
                                    }
                                    paint2.setColorFilter((ColorFilter) null);
                                    if (jVar.f2832c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas2.drawPath(path2, paint2);
                                } else {
                                    i4 = 16777215;
                                    f3 = 255.0f;
                                }
                                h1.h hVar2 = jVar.f2812d;
                                if (!(((Shader) hVar2.f2923c) == null && hVar2.b == 0)) {
                                    if (this.f2836d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f2836d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f2836d;
                                    Paint.Join join = jVar.f2820m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = jVar.f2819l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(jVar.f2821n);
                                    Shader shader2 = (Shader) hVar2.f2923c;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(jVar.f2814g * f3));
                                    } else {
                                        paint4.setShader((Shader) null);
                                        paint4.setAlpha(255);
                                        int i7 = hVar2.b;
                                        float f16 = jVar.f2814g;
                                        PorterDuff.Mode mode2 = q.f2858j;
                                        paint4.setColor((i7 & i4) | (((int) (((float) Color.alpha(i7)) * f16)) << 24));
                                    }
                                    paint4.setColorFilter((ColorFilter) null);
                                    paint4.setStrokeWidth(jVar.f2813e * f7 * f2);
                                    canvas2.drawPath(path2, paint4);
                                }
                            }
                        }
                        i5++;
                        kVar2 = kVar;
                        c2 = 1;
                        c3 = 0;
                    } else {
                        int i8 = i2;
                    }
                }
                int i9 = i3;
                i5++;
                kVar2 = kVar;
                c2 = 1;
                c3 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2843l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f2843l = i2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [n.b, n.k] */
    public n(n nVar) {
        this.f2835c = new Matrix();
        this.f2839h = 0.0f;
        this.f2840i = 0.0f;
        this.f2841j = 0.0f;
        this.f2842k = 0.0f;
        this.f2843l = 255;
        this.f2844m = null;
        this.f2845n = null;
        ? kVar = new k();
        this.f2846o = kVar;
        this.f2838g = new k(nVar.f2838g, kVar);
        this.f2834a = new Path(nVar.f2834a);
        this.b = new Path(nVar.b);
        this.f2839h = nVar.f2839h;
        this.f2840i = nVar.f2840i;
        this.f2841j = nVar.f2841j;
        this.f2842k = nVar.f2842k;
        this.f2843l = nVar.f2843l;
        this.f2844m = nVar.f2844m;
        String str = nVar.f2844m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f2845n = nVar.f2845n;
    }
}

package E0;

import A.i;
import A.j;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final u[] f160a = new u[4];
    public final Matrix[] b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f161c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f162d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f163e = new Path();
    public final Path f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final u f164g = new u();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f165h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f166i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f167j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f168k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f169l = true;

    public m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f160a[i2] = new u();
            this.b[i2] = new Matrix();
            this.f161c[i2] = new Matrix();
        }
    }

    public final void a(k kVar, float f2, RectF rectF, j jVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i2;
        char c2;
        float[] fArr;
        float f3;
        e eVar;
        c cVar;
        i iVar;
        int i3;
        m mVar = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        j jVar2 = jVar;
        Path path2 = path;
        path2.rewind();
        Path path3 = mVar.f163e;
        path3.rewind();
        Path path4 = mVar.f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = mVar.f161c;
            matrixArr2 = mVar.b;
            uVarArr = mVar.f160a;
            i2 = 4;
            c2 = 0;
            fArr = mVar.f165h;
            if (i4 >= 4) {
                break;
            }
            if (i4 == 1) {
                cVar = kVar2.f153g;
            } else if (i4 == 2) {
                cVar = kVar2.f154h;
            } else if (i4 != 3) {
                cVar = kVar2.f;
            } else {
                cVar = kVar2.f152e;
            }
            if (i4 == 1) {
                iVar = kVar2.f150c;
            } else if (i4 == 2) {
                iVar = kVar2.f151d;
            } else if (i4 != 3) {
                iVar = kVar2.b;
            } else {
                iVar = kVar2.f149a;
            }
            u uVar = uVarArr[i4];
            iVar.getClass();
            iVar.I(uVar, f2, cVar.a(rectF2));
            int i5 = i4 + 1;
            float f4 = (float) ((i5 % 4) * 90);
            matrixArr2[i4].reset();
            PointF pointF = mVar.f162d;
            Matrix[] matrixArr3 = matrixArr;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                i3 = i4;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f4);
            u uVar2 = uVarArr[i3];
            fArr[0] = uVar2.b;
            fArr[1] = uVar2.f185c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i3].preRotate(f4);
            i4 = i5;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i6 = 0;
        while (i6 < i2) {
            u uVar3 = uVarArr[i6];
            uVar3.getClass();
            fArr[c2] = 0.0f;
            fArr[1] = uVar3.f184a;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path2.moveTo(fArr[c2], fArr[1]);
            } else {
                path2.lineTo(fArr[c2], fArr[1]);
            }
            uVarArr[i6].b(matrixArr2[i6], path2);
            if (jVar2 != null) {
                u uVar4 = uVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                g gVar = (g) jVar2.b;
                BitSet bitSet = gVar.f120d;
                uVar4.getClass();
                f3 = 0.0f;
                bitSet.set(i6, false);
                uVar4.a(uVar4.f187e);
                gVar.b[i6] = new n(new ArrayList(uVar4.f188g), new Matrix(matrix));
            } else {
                f3 = 0.0f;
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            u uVar5 = uVarArr[i6];
            fArr[0] = uVar5.b;
            fArr[1] = uVar5.f185c;
            matrixArr2[i6].mapPoints(fArr);
            u uVar6 = uVarArr[i8];
            uVar6.getClass();
            float[] fArr2 = mVar.f166i;
            fArr2[0] = f3;
            fArr2[1] = uVar6.f184a;
            matrixArr2[i8].mapPoints(fArr2);
            Matrix[] matrixArr5 = matrixArr2;
            u[] uVarArr2 = uVarArr;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            u uVar7 = uVarArr2[i6];
            fArr[0] = uVar7.b;
            fArr[1] = uVar7.f185c;
            matrixArr5[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF2.centerX() - fArr[0]);
            } else {
                Math.abs(rectF2.centerY() - fArr[1]);
            }
            u uVar8 = mVar.f164g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i6 == 1) {
                eVar = kVar2.f157k;
            } else if (i6 == 2) {
                eVar = kVar2.f158l;
            } else if (i6 != 3) {
                eVar = kVar2.f156j;
            } else {
                eVar = kVar2.f155i;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path5 = mVar.f167j;
            path5.reset();
            uVar8.b(matrixArr4[i6], path5);
            if (!mVar.f169l || (!mVar.b(path5, i6) && !mVar.b(path5, i8))) {
                uVar8.b(matrixArr4[i6], path2);
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f184a;
                matrixArr4[i6].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr4[i6], path3);
            }
            if (jVar2 != null) {
                Matrix matrix2 = matrixArr4[i6];
                g gVar2 = (g) jVar2.b;
                gVar2.f120d.set(i6 + 4, false);
                uVar8.a(uVar8.f187e);
                gVar2.f119c[i6] = new n(new ArrayList(uVar8.f188g), new Matrix(matrix2));
            }
            mVar = this;
            i6 = i7;
            uVarArr = uVarArr2;
            matrixArr2 = matrixArr5;
            i2 = 4;
            c2 = 0;
        }
        path2.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f168k;
        path2.reset();
        this.f160a[i2].b(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}

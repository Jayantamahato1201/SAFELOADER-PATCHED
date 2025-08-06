package E0;

import A.j;
import B.d;
import D0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import t0.C0486a;
import v0.C0490a;
import v0.b;
import w0.C0492a;

public class g extends Drawable implements d, v {

    /* renamed from: w  reason: collision with root package name */
    public static final Paint f117w;

    /* renamed from: a  reason: collision with root package name */
    public f f118a;
    public final t[] b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f119c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f120d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f121e;
    public final Matrix f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f122g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f123h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f124i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f125j;

    /* renamed from: k  reason: collision with root package name */
    public final Region f126k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f127l;

    /* renamed from: m  reason: collision with root package name */
    public k f128m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f129n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f130o;

    /* renamed from: p  reason: collision with root package name */
    public final a f131p;

    /* renamed from: q  reason: collision with root package name */
    public final j f132q;

    /* renamed from: r  reason: collision with root package name */
    public final m f133r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuffColorFilter f134s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f135t;

    /* renamed from: u  reason: collision with root package name */
    public final RectF f136u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f137v;

    static {
        Paint paint = new Paint(1);
        f117w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f118a;
        RectF rectF2 = rectF;
        Path path2 = path;
        this.f133r.a(fVar.f103a, fVar.f109i, rectF2, this.f132q, path2);
        if (this.f118a.f108h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f2 = this.f118a.f108h;
            matrix.setScale(f2, f2, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
            path2.transform(matrix);
        }
        path2.computeBounds(this.f136u, true);
    }

    public final int b(int i2) {
        float f2;
        int i3;
        f fVar = this.f118a;
        float f3 = fVar.f113m + 0.0f + fVar.f112l;
        C0492a aVar = fVar.b;
        if (aVar == null || !aVar.f4749a || A.a.d(i2, 255) != aVar.f4751d) {
            return i2;
        }
        float f4 = aVar.f4752e;
        if (f4 <= 0.0f || f3 <= 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = Math.min(((((float) Math.log1p((double) (f3 / f4))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i2);
        int o2 = C0486a.o(A.a.d(i2, 255), aVar.b, f2);
        if (f2 > 0.0f && (i3 = aVar.f4750c) != 0) {
            o2 = A.a.b(A.a.d(i3, C0492a.f), o2);
        }
        return A.a.d(o2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f120d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f118a.f115o;
        Path path = this.f122g;
        a aVar = this.f131p;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f79a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            t tVar = this.b[i3];
            int i4 = this.f118a.f114n;
            Matrix matrix = t.b;
            tVar.a(matrix, aVar, i4, canvas);
            this.f119c[i3].a(matrix, aVar, this.f118a.f114n, canvas);
        }
        if (this.f137v) {
            double d2 = (double) 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * ((double) this.f118a.f115o));
            int cos = (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f118a.f115o));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, f117w);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a2 = kVar.f.a(rectF) * this.f118a.f109i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void draw(Canvas canvas) {
        float f2;
        Canvas canvas2 = canvas;
        Paint paint = this.f129n;
        paint.setColorFilter(this.f134s);
        int alpha = paint.getAlpha();
        int i2 = this.f118a.f111k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f130o;
        paint2.setColorFilter(this.f135t);
        paint2.setStrokeWidth(this.f118a.f110j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f118a.f111k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f121e;
        Path path = this.f122g;
        if (z2) {
            float f3 = 0.0f;
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f2 = 0.0f;
            }
            float f4 = -f2;
            k kVar = this.f118a.f103a;
            j e2 = kVar.e();
            c cVar = kVar.f152e;
            if (!(cVar instanceof h)) {
                cVar = new b(f4, cVar);
            }
            e2.f142e = cVar;
            c cVar2 = kVar.f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f4, cVar2);
            }
            e2.f = cVar2;
            c cVar3 = kVar.f154h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f4, cVar3);
            }
            e2.f144h = cVar3;
            c cVar4 = kVar.f153g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f4, cVar4);
            }
            e2.f143g = cVar4;
            k a2 = e2.a();
            this.f128m = a2;
            float f5 = this.f118a.f109i;
            RectF rectF = this.f125j;
            rectF.set(f());
            if (g()) {
                f3 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f3, f3);
            this.f133r.a(a2, f5, rectF, (j) null, this.f123h);
            a(f(), path);
            this.f121e = false;
        }
        f fVar = this.f118a;
        fVar.getClass();
        if (fVar.f114n > 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (!this.f118a.f103a.d(f()) && !path.isConvex() && i4 < 29) {
                canvas2.save();
                double d2 = (double) 0;
                canvas2.translate((float) ((int) (Math.sin(Math.toRadians(d2)) * ((double) this.f118a.f115o))), (float) ((int) (Math.cos(Math.toRadians(d2)) * ((double) this.f118a.f115o))));
                if (!this.f137v) {
                    c(canvas);
                    canvas2.restore();
                } else {
                    RectF rectF2 = this.f136u;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f118a.f114n * 2) + ((int) rectF2.width()) + width, (this.f118a.f114n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f6 = (float) ((getBounds().left - this.f118a.f114n) - width);
                    float f7 = (float) ((getBounds().top - this.f118a.f114n) - height);
                    canvas3.translate(-f6, -f7);
                    c(canvas3);
                    canvas2.drawBitmap(createBitmap, f6, f7, (Paint) null);
                    createBitmap.recycle();
                    canvas2.restore();
                }
            }
        }
        f fVar2 = this.f118a;
        Paint.Style style = fVar2.f116p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas2, paint, path, fVar2.f103a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        float f2;
        Paint paint = this.f130o;
        Path path = this.f123h;
        k kVar = this.f128m;
        RectF rectF = this.f125j;
        rectF.set(f());
        if (g()) {
            f2 = paint.getStrokeWidth() / 2.0f;
        } else {
            f2 = 0.0f;
        }
        rectF.inset(f2, f2);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f124i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f118a.f116p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f130o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        return this.f118a.f111k;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f118a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        this.f118a.getClass();
        if (this.f118a.f103a.d(f())) {
            outline.setRoundRect(getBounds(), this.f118a.f103a.f152e.a(f()) * this.f118a.f109i);
            return;
        }
        RectF f2 = f();
        Path path = this.f122g;
        a(f2, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            b.a(outline, path);
        } else if (i2 >= 29) {
            try {
                C0490a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0490a.a(outline, path);
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f118a.f107g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f126k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f122g;
        a(f2, path);
        Region region2 = this.f127l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f118a.b = new C0492a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f118a;
        if (fVar.f113m != f2) {
            fVar.f113m = f2;
            m();
        }
    }

    public final void invalidateSelf() {
        this.f121e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f118a.f106e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f118a.getClass();
        ColorStateList colorStateList2 = this.f118a.f105d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f118a.f104c;
        if (colorStateList3 == null || !colorStateList3.isStateful()) {
            return false;
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f118a;
        if (fVar.f104c != colorStateList) {
            fVar.f104c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r5.f129n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r5.f130o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(int[] r6) {
        /*
            r5 = this;
            E0.f r0 = r5.f118a
            android.content.res.ColorStateList r0 = r0.f104c
            r1 = 1
            if (r0 == 0) goto L_0x001c
            android.graphics.Paint r0 = r5.f129n
            int r2 = r0.getColor()
            E0.f r3 = r5.f118a
            android.content.res.ColorStateList r3 = r3.f104c
            int r3 = r3.getColorForState(r6, r2)
            if (r2 == r3) goto L_0x001c
            r0.setColor(r3)
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            E0.f r2 = r5.f118a
            android.content.res.ColorStateList r2 = r2.f105d
            if (r2 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.f130o
            int r3 = r2.getColor()
            E0.f r4 = r5.f118a
            android.content.res.ColorStateList r4 = r4.f105d
            int r6 = r4.getColorForState(r6, r3)
            if (r3 == r6) goto L_0x0037
            r2.setColor(r6)
            return r1
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.g.k(int[]):boolean");
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f134s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f135t;
        f fVar = this.f118a;
        ColorStateList colorStateList = fVar.f106e;
        PorterDuff.Mode mode = fVar.f;
        Paint paint = this.f129n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            if (b2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f134s = porterDuffColorFilter;
        this.f118a.getClass();
        this.f135t = null;
        this.f118a.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f134s) || !Objects.equals(porterDuffColorFilter3, this.f135t)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f118a;
        float f2 = fVar.f113m + 0.0f;
        fVar.f114n = (int) Math.ceil((double) (0.75f * f2));
        this.f118a.f115o = (int) Math.ceil((double) (f2 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f118a = new f(this.f118a);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f121e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean k2 = k(iArr);
        boolean l2 = l();
        if (k2 || l2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void setAlpha(int i2) {
        f fVar = this.f118a;
        if (fVar.f111k != i2) {
            fVar.f111k = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f118a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f118a.f103a = kVar;
        invalidateSelf();
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f118a.f106e = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f118a;
        if (fVar.f != mode) {
            fVar.f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.b(context, attributeSet, i2, i3).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.b = new t[4];
        this.f119c = new t[4];
        this.f120d = new BitSet(8);
        this.f = new Matrix();
        this.f122g = new Path();
        this.f123h = new Path();
        this.f124i = new RectF();
        this.f125j = new RectF();
        this.f126k = new Region();
        this.f127l = new Region();
        Paint paint = new Paint(1);
        this.f129n = paint;
        Paint paint2 = new Paint(1);
        this.f130o = paint2;
        this.f131p = new a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f159a;
        } else {
            mVar = new m();
        }
        this.f133r = mVar;
        this.f136u = new RectF();
        this.f137v = true;
        this.f118a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f132q = new j(1, (Object) this);
    }
}

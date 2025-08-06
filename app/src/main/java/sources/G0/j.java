package g0;

import android.graphics.Paint;
import h1.h;

public final class j extends m {

    /* renamed from: d  reason: collision with root package name */
    public h f2812d;

    /* renamed from: e  reason: collision with root package name */
    public float f2813e;
    public h f;

    /* renamed from: g  reason: collision with root package name */
    public float f2814g;

    /* renamed from: h  reason: collision with root package name */
    public float f2815h;

    /* renamed from: i  reason: collision with root package name */
    public float f2816i;

    /* renamed from: j  reason: collision with root package name */
    public float f2817j;

    /* renamed from: k  reason: collision with root package name */
    public float f2818k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f2819l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f2820m;

    /* renamed from: n  reason: collision with root package name */
    public float f2821n;

    public final boolean a() {
        if (this.f.b() || this.f2812d.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            h1.h r0 = r6.f
            boolean r1 = r0.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.f2924d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.b
            if (r1 == r4) goto L_0x001e
            r0.b = r1
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            h1.h r1 = r6.f2812d
            boolean r4 = r1.b()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r1.f2924d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.b
            if (r7 == r4) goto L_0x003a
            r1.b = r7
            r2 = 1
        L_0x003a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f2815h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.f2814g;
    }

    public int getStrokeColor() {
        return this.f2812d.b;
    }

    public float getStrokeWidth() {
        return this.f2813e;
    }

    public float getTrimPathEnd() {
        return this.f2817j;
    }

    public float getTrimPathOffset() {
        return this.f2818k;
    }

    public float getTrimPathStart() {
        return this.f2816i;
    }

    public void setFillAlpha(float f2) {
        this.f2815h = f2;
    }

    public void setFillColor(int i2) {
        this.f.b = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.f2814g = f2;
    }

    public void setStrokeColor(int i2) {
        this.f2812d.b = i2;
    }

    public void setStrokeWidth(float f2) {
        this.f2813e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f2817j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f2818k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f2816i = f2;
    }
}

package O;

import H0.E;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import k.C0280z0;

public final class g implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f616r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final a f617a;
    public final AccelerateInterpolator b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final ListView f618c;

    /* renamed from: d  reason: collision with root package name */
    public E f619d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f620e;
    public final float[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f621g;

    /* renamed from: h  reason: collision with root package name */
    public final int f622h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f623i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f624j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f625k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f626l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f627m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f628n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f629o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f630p;

    /* renamed from: q  reason: collision with root package name */
    public final C0280z0 f631q;

    /* JADX WARNING: type inference failed for: r1v0, types: [O.a, java.lang.Object] */
    public g(C0280z0 z0Var) {
        ? obj = new Object();
        obj.f612e = Long.MIN_VALUE;
        obj.f613g = -1;
        obj.f = 0;
        this.f617a = obj;
        float[] fArr = {0.0f, 0.0f};
        this.f620e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f623i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f624j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f625k = fArr5;
        this.f618c = z0Var;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f621g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f622h = f616r;
        obj.f609a = 500;
        obj.b = 500;
        this.f631q = z0Var;
    }

    public static float b(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f620e
            r0 = r0[r4]
            float[] r1 = r3.f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002e
        L_0x0026:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            float r5 = r6.getInterpolation(r5)
        L_0x002e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            return r2
        L_0x003d:
            float[] r0 = r3.f623i
            r0 = r0[r4]
            float[] r1 = r3.f624j
            r1 = r1[r4]
            float[] r2 = r3.f625k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0054
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0054:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 != 0.0f) {
            int i2 = this.f621g;
            if (i2 == 0 || i2 == 1) {
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (!this.f629o || i2 != 1) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
            } else if (i2 == 2 && f2 < 0.0f) {
                return f2 / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f627m) {
            this.f629o = false;
            return;
        }
        a aVar = this.f617a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f612e);
        int i4 = aVar.b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f615i = i2;
        aVar.f614h = aVar.a(currentAnimationTimeMillis);
        aVar.f613g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r8.f631q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            O.a r0 = r8.f617a
            float r1 = r0.f611d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f610c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            k.z0 r2 = r8.f631q
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r5 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r7
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != 3) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.f630p
            r2 = 0
            if (r1 != 0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 == r3) goto L_0x0017
            if (r1 == r0) goto L_0x001f
            r8 = 3
            if (r1 == r8) goto L_0x0017
            goto L_0x007c
        L_0x0017:
            r7.d()
            return r2
        L_0x001b:
            r7.f628n = r3
            r7.f626l = r2
        L_0x001f:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f618c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            O.a r9 = r7.f617a
            r9.f610c = r1
            r9.f611d = r8
            boolean r8 = r7.f629o
            if (r8 != 0) goto L_0x007c
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007c
            H0.E r8 = r7.f619d
            if (r8 != 0) goto L_0x0060
            H0.E r8 = new H0.E
            r8.<init>(r0, r7)
            r7.f619d = r8
        L_0x0060:
            r7.f629o = r3
            r7.f627m = r3
            boolean r8 = r7.f626l
            if (r8 != 0) goto L_0x0075
            int r8 = r7.f622h
            if (r8 <= 0) goto L_0x0075
            H0.E r9 = r7.f619d
            long r0 = (long) r8
            java.util.WeakHashMap r8 = I.O.f393a
            r5.postOnAnimationDelayed(r9, r0)
            goto L_0x007a
        L_0x0075:
            H0.E r8 = r7.f619d
            r8.run()
        L_0x007a:
            r7.f626l = r3
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

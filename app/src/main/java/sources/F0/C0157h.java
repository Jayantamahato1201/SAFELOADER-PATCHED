package f0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.cheatbox.R;
import java.util.HashMap;

/* renamed from: f0.h  reason: case insensitive filesystem */
public final class C0157h extends m {

    /* renamed from: G  reason: collision with root package name */
    public static final String[] f2651G = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: F  reason: collision with root package name */
    public final int f2652F;

    public C0157h(int i2) {
        this();
        this.f2652F = i2;
    }

    public static void I(u uVar) {
        int visibility = uVar.b.getVisibility();
        HashMap hashMap = uVar.f2691a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = uVar.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(u uVar, float f) {
        Float f2;
        if (uVar == null || (f2 = (Float) uVar.f2691a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f0.H] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f0.C0149H L(f0.u r8, f0.u r9) {
        /*
            f0.H r0 = new f0.H
            r0.<init>()
            r1 = 0
            r0.f2628a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f2691a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2629c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2631e = r6
            goto L_0x0033
        L_0x002f:
            r0.f2629c = r3
            r0.f2631e = r2
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f2691a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f2630d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L_0x0056
        L_0x0052:
            r0.f2630d = r3
            r0.f = r2
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            int r8 = r0.f2629c
            int r9 = r0.f2630d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.f2631e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L_0x0068
            goto L_0x009f
        L_0x0068:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0071
            r0.b = r1
            r0.f2628a = r2
            return r0
        L_0x0071:
            if (r9 != 0) goto L_0x009f
            r0.b = r2
            r0.f2628a = r2
            return r0
        L_0x0078:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L_0x0081
            r0.b = r1
            r0.f2628a = r2
            return r0
        L_0x0081:
            android.view.ViewGroup r8 = r0.f2631e
            if (r8 != 0) goto L_0x009f
            r0.b = r2
            r0.f2628a = r2
            return r0
        L_0x008a:
            if (r8 != 0) goto L_0x0095
            int r8 = r0.f2630d
            if (r8 != 0) goto L_0x0095
            r0.b = r2
            r0.f2628a = r2
            return r0
        L_0x0095:
            if (r9 != 0) goto L_0x009f
            int r8 = r0.f2629c
            if (r8 != 0) goto L_0x009f
            r0.b = r1
            r0.f2628a = r2
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0157h.L(f0.u, f0.u):f0.H");
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        w.f2693a.n(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.b, new float[]{f2});
        C0156g gVar = new C0156g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    public final void d(u uVar) {
        I(uVar);
    }

    public final void g(u uVar) {
        I(uVar);
        View view = uVar.b;
        Float f = (Float) view.getTag(R.id.MT_Bin);
        if (f == null) {
            if (view.getVisibility() == 0) {
                f = Float.valueOf(w.f2693a.f(view));
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        uVar.f2691a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARNING: type inference failed for: r19v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (L(n(r3, false), r(r3, false)).f2628a != false) goto L_0x001b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.view.ViewGroup r24, f0.u r25, f0.u r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            int r4 = r0.f2652F
            f0.H r5 = L(r25, r26)
            boolean r6 = r5.f2628a
            if (r6 == 0) goto L_0x001b
            android.view.ViewGroup r6 = r5.f2631e
            if (r6 != 0) goto L_0x0020
            android.view.ViewGroup r6 = r5.f
            if (r6 == 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            r4 = r0
            r16 = 0
            goto L_0x02d6
        L_0x0020:
            boolean r6 = r5.b
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x0059
            r1 = r4 & 1
            if (r1 != r11) goto L_0x001b
            if (r3 != 0) goto L_0x0030
            goto L_0x001b
        L_0x0030:
            android.view.View r1 = r3.b
            if (r2 != 0) goto L_0x004b
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            f0.u r4 = r0.n(r3, r10)
            f0.u r3 = r0.r(r3, r10)
            f0.H r3 = L(r4, r3)
            boolean r3 = r3.f2628a
            if (r3 == 0) goto L_0x004b
            goto L_0x001b
        L_0x004b:
            E0.e r3 = f0.w.f2693a
            r3.getClass()
            float r2 = K(r2, r8)
            android.animation.ObjectAnimator r1 = r0.J(r1, r2, r9)
            return r1
        L_0x0059:
            int r5 = r5.f2630d
            r6 = 2
            r4 = r4 & r6
            if (r4 == r6) goto L_0x0060
            goto L_0x001b
        L_0x0060:
            if (r2 != 0) goto L_0x0063
            goto L_0x001b
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            android.view.View r4 = r3.b
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            android.view.View r12 = r2.b
            r13 = 2131231068(0x7f08015c, float:1.8078207E38)
            java.lang.Object r14 = r12.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0082
            r22 = r5
            r7 = 0
            r10 = 1
            r16 = 0
            r17 = 0
            r18 = 1
            goto L_0x0220
        L_0x0082:
            if (r4 == 0) goto L_0x0099
            android.view.ViewParent r14 = r4.getParent()
            if (r14 != 0) goto L_0x008b
            goto L_0x0099
        L_0x008b:
            r14 = 4
            if (r5 != r14) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            if (r12 != r4) goto L_0x0095
        L_0x0091:
            r14 = r4
            r4 = 0
        L_0x0093:
            r15 = 0
            goto L_0x009d
        L_0x0095:
            r4 = 0
            r14 = 0
            r15 = 1
            goto L_0x009d
        L_0x0099:
            if (r4 == 0) goto L_0x0095
            r14 = 0
            goto L_0x0093
        L_0x009d:
            if (r15 == 0) goto L_0x0214
            android.view.ViewParent r15 = r12.getParent()
            if (r15 != 0) goto L_0x00b1
            r22 = r5
            r7 = r14
            r16 = 0
            r17 = 0
            r18 = 1
            r14 = r12
            goto L_0x0220
        L_0x00b1:
            android.view.ViewParent r15 = r12.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x0214
            android.view.ViewParent r15 = r12.getParent()
            android.view.View r15 = (android.view.View) r15
            r16 = 0
            f0.u r7 = r0.r(r15, r11)
            r17 = 0
            f0.u r10 = r0.n(r15, r11)
            f0.H r7 = L(r7, r10)
            boolean r7 = r7.f2628a
            if (r7 != 0) goto L_0x01fd
            boolean r4 = f0.t.f2690a
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r15.getScrollX()
            int r7 = -r7
            float r7 = (float) r7
            int r10 = r15.getScrollY()
            int r10 = -r10
            float r10 = (float) r10
            r4.setTranslate(r7, r10)
            E0.e r7 = f0.w.f2693a
            r7.p(r12, r4)
            r7.q(r1, r4)
            android.graphics.RectF r7 = new android.graphics.RectF
            int r10 = r12.getWidth()
            float r10 = (float) r10
            int r15 = r12.getHeight()
            float r15 = (float) r15
            r7.<init>(r8, r8, r10, r15)
            r4.mapRect(r7)
            float r10 = r7.left
            int r10 = java.lang.Math.round(r10)
            float r15 = r7.top
            int r15 = java.lang.Math.round(r15)
            r18 = 1
            float r11 = r7.right
            int r11 = java.lang.Math.round(r11)
            float r13 = r7.bottom
            int r13 = java.lang.Math.round(r13)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r6 = r12.getContext()
            r8.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r6)
            boolean r6 = r12.isAttachedToWindow()
            if (r1 == 0) goto L_0x013a
            boolean r19 = r1.isAttachedToWindow()
            if (r19 == 0) goto L_0x013a
            r19 = 1
            goto L_0x013c
        L_0x013a:
            r19 = 0
        L_0x013c:
            if (r6 != 0) goto L_0x0160
            if (r19 != 0) goto L_0x0148
            r22 = r5
            r21 = r14
            r0 = r16
            goto L_0x01df
        L_0x0148:
            android.view.ViewParent r19 = r12.getParent()
            r9 = r19
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r19 = r9.indexOfChild(r12)
            r20 = r6
            android.view.ViewGroupOverlay r6 = r1.getOverlay()
            r6.add(r12)
            r6 = r19
            goto L_0x0165
        L_0x0160:
            r20 = r6
            r9 = r16
            r6 = 0
        L_0x0165:
            float r19 = r7.width()
            r21 = r14
            int r14 = java.lang.Math.round(r19)
            float r19 = r7.height()
            r22 = r5
            int r5 = java.lang.Math.round(r19)
            if (r14 <= 0) goto L_0x01d1
            if (r5 <= 0) goto L_0x01d1
            int r3 = r14 * r5
            float r3 = (float) r3
            r19 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r19 / r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r0, r3)
            float r0 = (float) r14
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r14 = r7.left
            float r14 = -r14
            float r7 = r7.top
            float r7 = -r7
            r4.postTranslate(r14, r7)
            r4.postScale(r3, r3)
            boolean r3 = f0.t.f2690a
            if (r3 == 0) goto L_0x01bf
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r0 = r3.beginRecording(r0, r5)
            r0.concat(r4)
            r12.draw(r0)
            r3.endRecording()
            android.graphics.Bitmap r0 = f0.s.a(r3)
            goto L_0x01d3
        L_0x01bf:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r5, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r3.concat(r4)
            r12.draw(r3)
            goto L_0x01d3
        L_0x01d1:
            r0 = r16
        L_0x01d3:
            if (r20 != 0) goto L_0x01df
            android.view.ViewGroupOverlay r3 = r1.getOverlay()
            r3.remove(r12)
            r9.addView(r12, r6)
        L_0x01df:
            if (r0 == 0) goto L_0x01e4
            r8.setImageBitmap(r0)
        L_0x01e4:
            int r0 = r11 - r10
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r4 = r13 - r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r8.measure(r0, r3)
            r8.layout(r10, r15, r11, r13)
            r14 = r8
        L_0x01f9:
            r7 = r21
            r10 = 0
            goto L_0x0220
        L_0x01fd:
            r22 = r5
            r21 = r14
            r18 = 1
            int r0 = r15.getId()
            android.view.ViewParent r3 = r15.getParent()
            if (r3 != 0) goto L_0x021e
            r3 = -1
            if (r0 == r3) goto L_0x021e
            r1.findViewById(r0)
            goto L_0x021e
        L_0x0214:
            r22 = r5
            r21 = r14
            r16 = 0
            r17 = 0
            r18 = 1
        L_0x021e:
            r14 = r4
            goto L_0x01f9
        L_0x0220:
            if (r14 == 0) goto L_0x0297
            if (r10 != 0) goto L_0x0255
            java.util.HashMap r0 = r2.f2691a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            r3 = r0[r17]
            r0 = r0[r18]
            r4 = 2
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r5 = r4[r17]
            int r3 = r3 - r5
            int r5 = r14.getLeft()
            int r3 = r3 - r5
            r14.offsetLeftAndRight(r3)
            r3 = r4[r18]
            int r0 = r0 - r3
            int r3 = r14.getTop()
            int r0 = r0 - r3
            r14.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r14)
        L_0x0255:
            E0.e r0 = f0.w.f2693a
            r0.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = K(r2, r3)
            r5 = 0
            r4 = r23
            android.animation.ObjectAnimator r2 = r4.J(r14, r2, r5)
            if (r2 != 0) goto L_0x0272
            r5 = r26
            float r3 = K(r5, r3)
            r0.n(r14, r3)
        L_0x0272:
            if (r10 != 0) goto L_0x0296
            if (r2 != 0) goto L_0x027e
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.remove(r14)
            return r2
        L_0x027e:
            r0 = 2131231068(0x7f08015c, float:1.8078207E38)
            r12.setTag(r0, r14)
            f0.G r0 = new f0.G
            r0.<init>(r4, r1, r14, r12)
            r2.addListener(r0)
            r2.addPauseListener(r0)
            f0.m r1 = r4.o()
            r1.a(r0)
        L_0x0296:
            return r2
        L_0x0297:
            r4 = r23
            r5 = r26
            if (r7 == 0) goto L_0x02d6
            int r0 = r7.getVisibility()
            r1 = 0
            f0.w.b(r7, r1)
            E0.e r1 = f0.w.f2693a
            r1.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = K(r2, r3)
            r6 = 0
            android.animation.ObjectAnimator r2 = r4.J(r7, r2, r6)
            if (r2 != 0) goto L_0x02be
            float r3 = K(r5, r3)
            r1.n(r7, r3)
        L_0x02be:
            if (r2 == 0) goto L_0x02d2
            f0.F r0 = new f0.F
            r1 = r22
            r0.<init>(r7, r1)
            r2.addListener(r0)
            f0.m r1 = r4.o()
            r1.a(r0)
            return r2
        L_0x02d2:
            f0.w.b(r7, r0)
            return r2
        L_0x02d6:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0157h.k(android.view.ViewGroup, f0.u, f0.u):android.animation.Animator");
    }

    public final String[] q() {
        return f2651G;
    }

    public final boolean s(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f2691a.containsKey("android:visibility:visibility") != uVar.f2691a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0149H L2 = L(uVar, uVar2);
        if (!L2.f2628a) {
            return false;
        }
        if (L2.f2629c == 0 || L2.f2630d == 0) {
            return true;
        }
        return false;
    }

    public C0157h() {
        this.f2652F = 3;
    }
}

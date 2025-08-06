package f0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* renamed from: f0.f  reason: case insensitive filesystem */
public final class C0155f extends m {

    /* renamed from: F  reason: collision with root package name */
    public static final String[] f2644F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: G  reason: collision with root package name */
    public static final C0151b f2645G;

    /* renamed from: H  reason: collision with root package name */
    public static final C0151b f2646H;

    /* renamed from: I  reason: collision with root package name */
    public static final C0151b f2647I;

    /* renamed from: J  reason: collision with root package name */
    public static final C0151b f2648J;

    /* renamed from: K  reason: collision with root package name */
    public static final C0151b f2649K;

    static {
        Class<PointF> cls = PointF.class;
        f2645G = new C0151b(cls, "topLeft", 0);
        f2646H = new C0151b(cls, "bottomRight", 1);
        f2647I = new C0151b(cls, "bottomRight", 2);
        f2648J = new C0151b(cls, "topLeft", 3);
        f2649K = new C0151b(cls, "position", 4);
    }

    public static void I(u uVar) {
        View view = uVar.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = uVar.f2691a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", uVar.b.getParent());
        }
    }

    public final void d(u uVar) {
        I(uVar);
    }

    public final void g(u uVar) {
        I(uVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.view.ViewGroup r19, f0.u r20, f0.u r21) {
        /*
            r18 = this;
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0008
            if (r2 != 0) goto L_0x000c
        L_0x0008:
            r1 = r18
            goto L_0x0139
        L_0x000c:
            java.util.HashMap r1 = r1.f2691a
            java.util.HashMap r6 = r2.f2691a
            java.lang.String r7 = "android:changeBounds:parent"
            java.lang.Object r8 = r1.get(r7)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r7 = r6.get(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r8 == 0) goto L_0x0008
            if (r7 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            java.lang.String r7 = "android:changeBounds:bounds"
            java.lang.Object r8 = r1.get(r7)
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            java.lang.Object r7 = r6.get(r7)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            int r9 = r8.left
            int r10 = r7.left
            int r11 = r8.top
            int r12 = r7.top
            int r13 = r8.right
            int r14 = r7.right
            int r8 = r8.bottom
            int r7 = r7.bottom
            int r15 = r13 - r9
            r19 = 0
            int r4 = r8 - r11
            r16 = 1
            int r5 = r14 - r10
            int r3 = r7 - r12
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r6.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r15 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x0063
        L_0x005f:
            if (r5 == 0) goto L_0x0072
            if (r3 == 0) goto L_0x0072
        L_0x0063:
            if (r9 != r10) goto L_0x006a
            if (r11 == r12) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r6 = 0
            goto L_0x006b
        L_0x006a:
            r6 = 1
        L_0x006b:
            if (r13 != r14) goto L_0x006f
            if (r8 == r7) goto L_0x0073
        L_0x006f:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x007b
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x007f
        L_0x007b:
            if (r1 != 0) goto L_0x0081
            if (r0 == 0) goto L_0x0081
        L_0x007f:
            int r6 = r6 + 1
        L_0x0081:
            if (r6 <= 0) goto L_0x0008
            android.view.View r0 = r2.b
            f0.w.a(r0, r9, r11, r13, r8)
            r1 = 2
            if (r6 != r1) goto L_0x00ec
            if (r15 != r5) goto L_0x00a6
            if (r4 != r3) goto L_0x00a6
            r1 = r18
            E0.e r2 = r1.f2664A
            float r3 = (float) r9
            float r4 = (float) r11
            float r5 = (float) r10
            float r6 = (float) r12
            r2.getClass()
            android.graphics.Path r2 = E0.e.d(r3, r4, r5, r6)
            f0.b r3 = f2649K
            android.animation.ObjectAnimator r2 = f0.i.a(r0, r3, r2)
            goto L_0x011a
        L_0x00a6:
            r1 = r18
            f0.e r2 = new f0.e
            r2.<init>(r0)
            E0.e r3 = r1.f2664A
            float r4 = (float) r9
            float r5 = (float) r11
            float r6 = (float) r10
            float r9 = (float) r12
            r3.getClass()
            android.graphics.Path r3 = E0.e.d(r4, r5, r6, r9)
            f0.b r4 = f2645G
            android.animation.ObjectAnimator r3 = f0.i.a(r2, r4, r3)
            E0.e r4 = r1.f2664A
            float r5 = (float) r13
            float r6 = (float) r8
            float r8 = (float) r14
            float r7 = (float) r7
            r4.getClass()
            android.graphics.Path r4 = E0.e.d(r5, r6, r8, r7)
            f0.b r5 = f2646H
            android.animation.ObjectAnimator r4 = f0.i.a(r2, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r19] = r3
            r6[r16] = r4
            r5.playTogether(r6)
            f0.c r3 = new f0.c
            r3.<init>(r2)
            r5.addListener(r3)
            r2 = r5
            goto L_0x011a
        L_0x00ec:
            r1 = r18
            if (r9 != r10) goto L_0x0107
            if (r11 == r12) goto L_0x00f3
            goto L_0x0107
        L_0x00f3:
            E0.e r2 = r1.f2664A
            float r3 = (float) r13
            float r4 = (float) r8
            float r5 = (float) r14
            float r6 = (float) r7
            r2.getClass()
            android.graphics.Path r2 = E0.e.d(r3, r4, r5, r6)
            f0.b r3 = f2647I
            android.animation.ObjectAnimator r2 = f0.i.a(r0, r3, r2)
            goto L_0x011a
        L_0x0107:
            E0.e r2 = r1.f2664A
            float r3 = (float) r9
            float r4 = (float) r11
            float r5 = (float) r10
            float r6 = (float) r12
            r2.getClass()
            android.graphics.Path r2 = E0.e.d(r3, r4, r5, r6)
            f0.b r3 = f2648J
            android.animation.ObjectAnimator r2 = f0.i.a(r0, r3, r2)
        L_0x011a:
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0138
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 1
            Q0.l.c0(r0, r3)
            f0.m r3 = r1.o()
            f0.d r4 = new f0.d
            r4.<init>(r0)
            r3.a(r4)
        L_0x0138:
            return r2
        L_0x0139:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0155f.k(android.view.ViewGroup, f0.u, f0.u):android.animation.Animator");
    }

    public final String[] q() {
        return f2644F;
    }
}

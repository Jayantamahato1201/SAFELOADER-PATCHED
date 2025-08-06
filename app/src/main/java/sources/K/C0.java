package k;

import android.view.View;
import android.view.ViewConfiguration;
import j.C0194D;

public abstract class C0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f3327a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3328c;

    /* renamed from: d  reason: collision with root package name */
    public final View f3329d;

    /* renamed from: e  reason: collision with root package name */
    public B0 f3330e;
    public B0 f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3331g;

    /* renamed from: h  reason: collision with root package name */
    public int f3332h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f3333i = new int[2];

    public C0(View view) {
        this.f3329d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3327a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.f3328c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        B0 b02 = this.f;
        View view = this.f3329d;
        if (b02 != null) {
            view.removeCallbacks(b02);
        }
        B0 b03 = this.f3330e;
        if (b03 != null) {
            view.removeCallbacks(b03);
        }
    }

    public abstract C0194D b();

    public abstract boolean c();

    public boolean d() {
        C0194D b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r14 != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r4 != 3) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.f3331g
            android.view.View r0 = r12.f3329d
            r1 = 3
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L_0x0068
            j.D r4 = r12.b()
            if (r4 == 0) goto L_0x005c
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0016
            goto L_0x005c
        L_0x0016:
            k.z0 r4 = r4.j()
            if (r4 == 0) goto L_0x005c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005c
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f3333i
            r0.getLocationOnScreen(r6)
            r0 = r6[r3]
            float r0 = (float) r0
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r0, r7)
            r4.getLocationOnScreen(r6)
            r0 = r6[r3]
            int r0 = -r0
            float r0 = (float) r0
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r0, r6)
            int r0 = r12.f3332h
            boolean r0 = r4.b(r5, r0)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L_0x0056
            if (r14 == r1) goto L_0x0056
            r14 = 1
            goto L_0x0057
        L_0x0056:
            r14 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            if (r14 == 0) goto L_0x005c
            goto L_0x0062
        L_0x005c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x0065
        L_0x0062:
            r14 = 1
            goto L_0x0113
        L_0x0065:
            r14 = 0
            goto L_0x0113
        L_0x0068:
            boolean r4 = r0.isEnabled()
            if (r4 != 0) goto L_0x0070
            goto L_0x00fd
        L_0x0070:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto L_0x00cf
            if (r4 == r2) goto L_0x00cb
            r5 = 2
            if (r4 == r5) goto L_0x007f
            if (r4 == r1) goto L_0x00cb
            goto L_0x00fd
        L_0x007f:
            int r1 = r12.f3332h
            int r1 = r14.findPointerIndex(r1)
            if (r1 < 0) goto L_0x00fd
            float r4 = r14.getX(r1)
            float r14 = r14.getY(r1)
            float r1 = r12.f3327a
            float r5 = -r1
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00b9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00b9
            int r5 = r0.getRight()
            int r6 = r0.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            int r4 = r0.getBottom()
            int r5 = r0.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r1
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00b9
            goto L_0x00fd
        L_0x00b9:
            r12.a()
            android.view.ViewParent r14 = r0.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x00fd
            r14 = 1
            goto L_0x00fe
        L_0x00cb:
            r12.a()
            goto L_0x00fd
        L_0x00cf:
            int r14 = r14.getPointerId(r3)
            r12.f3332h = r14
            k.B0 r14 = r12.f3330e
            if (r14 != 0) goto L_0x00e1
            k.B0 r14 = new k.B0
            r1 = 0
            r14.<init>(r12, r1)
            r12.f3330e = r14
        L_0x00e1:
            k.B0 r14 = r12.f3330e
            int r1 = r12.b
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
            k.B0 r14 = r12.f
            if (r14 != 0) goto L_0x00f5
            k.B0 r14 = new k.B0
            r1 = 1
            r14.<init>(r12, r1)
            r12.f = r14
        L_0x00f5:
            k.B0 r14 = r12.f
            int r1 = r12.f3328c
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
        L_0x00fd:
            r14 = 0
        L_0x00fe:
            if (r14 == 0) goto L_0x0113
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r4
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r0.onTouchEvent(r1)
            r1.recycle()
        L_0x0113:
            r12.f3331g = r14
            if (r14 != 0) goto L_0x011b
            if (r13 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            return r3
        L_0x011b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f3331g = false;
        this.f3332h = -1;
        B0 b02 = this.f3330e;
        if (b02 != null) {
            this.f3329d.removeCallbacks(b02);
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }
}

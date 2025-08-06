package k;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class i1 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f3471a;
    public final Rect b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3472c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3473d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3474e;
    public boolean f;

    public i1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3474e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.b = rect3;
        Rect rect4 = new Rect();
        this.f3473d = rect4;
        Rect rect5 = new Rect();
        this.f3472c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f3471a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x0022
            if (r2 == r3) goto L_0x0022
            r6 = 3
            if (r2 == r6) goto L_0x001b
            goto L_0x003c
        L_0x001b:
            boolean r2 = r7.f
            r7.f = r4
        L_0x001f:
            r5 = r2
        L_0x0020:
            r2 = 1
            goto L_0x003e
        L_0x0022:
            boolean r2 = r7.f
            if (r2 == 0) goto L_0x001f
            android.graphics.Rect r6 = r7.f3473d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x001f
            r5 = r2
            r2 = 0
            goto L_0x003e
        L_0x0031:
            android.graphics.Rect r2 = r7.b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x003c
            r7.f = r5
            goto L_0x0020
        L_0x003c:
            r2 = 1
            r5 = 0
        L_0x003e:
            if (r5 == 0) goto L_0x006c
            android.graphics.Rect r4 = r7.f3472c
            android.view.View r5 = r7.f3471a
            if (r2 == 0) goto L_0x005c
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L_0x005c
            int r0 = r5.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r5.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r8.setLocation(r0, r1)
            goto L_0x0067
        L_0x005c:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r8.setLocation(r0, r1)
        L_0x0067:
            boolean r8 = r5.dispatchTouchEvent(r8)
            return r8
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

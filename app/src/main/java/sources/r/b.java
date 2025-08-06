package R;

import A.j;
import E0.e;
import I.C0010b;
import I.O;
import J.l;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s0.d;
import s0.f;

public abstract class b extends C0010b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f670n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final e f671o = new e(5);

    /* renamed from: p  reason: collision with root package name */
    public static final e f672p = new e(6);

    /* renamed from: d  reason: collision with root package name */
    public final Rect f673d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f674e = new Rect();
    public final Rect f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f675g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f676h;

    /* renamed from: i  reason: collision with root package name */
    public final Chip f677i;

    /* renamed from: j  reason: collision with root package name */
    public a f678j;

    /* renamed from: k  reason: collision with root package name */
    public int f679k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f680l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f681m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f677i = chip;
        this.f676h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = O.f393a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    public final j b(View view) {
        if (this.f678j == null) {
            this.f678j = new a(this);
        }
        return this.f678j;
    }

    public final void d(View view, l lVar) {
        boolean z2;
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((d) this).f4483q;
        f fVar = chip.f1929e;
        if (fVar == null || !fVar.f4506Q) {
            z2 = false;
        } else {
            z2 = true;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            lVar.k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i2) {
        if (this.f680l != i2) {
            return false;
        }
        this.f680l = Integer.MIN_VALUE;
        d dVar = (d) this;
        if (i2 == 1) {
            Chip chip = dVar.f4483q;
            chip.f1936m = false;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    public final l k(int i2) {
        boolean z2;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        l lVar = new l(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f670n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f677i;
        obtain.setParent(chip);
        o(i2, lVar);
        if (lVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f674e;
        lVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(chip.getContext().getPackageName());
                lVar.b = i2;
                obtain.setSource(chip, i2);
                if (this.f679k == i2) {
                    obtain.setAccessibilityFocused(true);
                    lVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    lVar.a(64);
                }
                if (this.f680l == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    lVar.a(2);
                } else if (obtain.isFocusable()) {
                    lVar.a(1);
                }
                obtain.setFocused(z2);
                int[] iArr = this.f675g;
                chip.getLocationOnScreen(iArr);
                Rect rect3 = this.f673d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    lVar.f(rect3);
                    rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                }
                Rect rect4 = this.f;
                if (chip.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    if (rect3.intersect(rect4)) {
                        obtain.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                            ViewParent parent = chip.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    obtain.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return lVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r21, android.graphics.Rect r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l(r4)
            n.l r5 = new n.l
            r5.<init>()
            r7 = 0
        L_0x0015:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0038
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            J.l r8 = r0.k(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.d(r9, r8)
            int r7 = r7 + r3
            goto L_0x0015
        L_0x0038:
            int r4 = r0.f680l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            if (r4 != r7) goto L_0x0041
            r4 = r8
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r5.c(r4, r8)
            J.l r4 = (J.l) r4
        L_0x0047:
            E0.e r9 = f671o
            E0.e r10 = f672p
            com.google.android.material.chip.Chip r11 = r0.f677i
            r12 = 2
            if (r1 == r3) goto L_0x015e
            if (r1 == r12) goto L_0x015e
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r8 = 17
            if (r1 == r8) goto L_0x0062
            if (r1 == r15) goto L_0x0062
            if (r1 == r14) goto L_0x0062
            if (r1 != r12) goto L_0x0065
        L_0x0062:
            r17 = 1
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006d:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.f680l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r7) goto L_0x0082
            J.l r2 = r0.n(r6)
            r2.f(r3)
        L_0x007f:
            r19 = -1
            goto L_0x00b7
        L_0x0082:
            if (r2 == 0) goto L_0x0088
            r3.set(r2)
            goto L_0x007f
        L_0x0088:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r8) goto L_0x00b1
            if (r1 == r15) goto L_0x00aa
            if (r1 == r14) goto L_0x00a4
            if (r1 != r12) goto L_0x009e
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            goto L_0x007f
        L_0x009e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00a4:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            goto L_0x007f
        L_0x00aa:
            r11 = 0
            r19 = -1
            r3.set(r11, r6, r2, r6)
            goto L_0x00b7
        L_0x00b1:
            r11 = 0
            r19 = -1
            r3.set(r2, r11, r2, r6)
        L_0x00b7:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r8) goto L_0x00ed
            if (r1 == r15) goto L_0x00e2
            if (r1 == r14) goto L_0x00d6
            if (r1 != r12) goto L_0x00d0
            int r6 = r3.height()
            int r6 = r6 + 1
            int r6 = -r6
            r8 = 0
            r2.offset(r8, r6)
            goto L_0x00f7
        L_0x00d0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00d6:
            r8 = 0
            int r6 = r3.width()
            int r6 = r6 + 1
            int r6 = -r6
            r2.offset(r6, r8)
            goto L_0x00f7
        L_0x00e2:
            r8 = 0
            int r6 = r3.height()
            int r6 = r6 + 1
            r2.offset(r8, r6)
            goto L_0x00f7
        L_0x00ed:
            r8 = 0
            int r6 = r3.width()
            int r6 = r6 + 1
            r2.offset(r6, r8)
        L_0x00f7:
            r10.getClass()
            int r6 = r5.f3709h
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r11 = 0
            r16 = 0
        L_0x0104:
            if (r11 >= r6) goto L_0x015a
            java.lang.Object[] r12 = r5.f3708g
            r12 = r12[r11]
            J.l r12 = (J.l) r12
            if (r12 != r4) goto L_0x010f
            goto L_0x0157
        L_0x010f:
            r9.getClass()
            r12.f(r10)
            boolean r13 = Q0.l.B(r1, r3, r10)
            if (r13 != 0) goto L_0x011c
            goto L_0x0157
        L_0x011c:
            boolean r13 = Q0.l.B(r1, r3, r2)
            if (r13 != 0) goto L_0x0123
            goto L_0x0152
        L_0x0123:
            boolean r13 = Q0.l.c(r1, r3, r10, r2)
            if (r13 == 0) goto L_0x012a
            goto L_0x0152
        L_0x012a:
            boolean r13 = Q0.l.c(r1, r3, r2, r10)
            if (r13 == 0) goto L_0x0131
            goto L_0x0157
        L_0x0131:
            int r13 = Q0.l.D(r1, r3, r10)
            int r14 = Q0.l.E(r1, r3, r10)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r13 = Q0.l.D(r1, r3, r2)
            int r15 = Q0.l.E(r1, r3, r2)
            int r18 = r13 * 13
            int r18 = r18 * r13
            int r15 = r15 * r15
            int r15 = r15 + r18
            if (r14 >= r15) goto L_0x0157
        L_0x0152:
            r2.set(r10)
            r16 = r12
        L_0x0157:
            int r11 = r11 + 1
            goto L_0x0104
        L_0x015a:
            r1 = r16
            goto L_0x01d0
        L_0x015e:
            r8 = 0
            r17 = 1
            r19 = -1
            java.util.WeakHashMap r2 = I.O.f393a
            int r2 = r11.getLayoutDirection()
            r3 = 1
            if (r2 != r3) goto L_0x016e
            r2 = 1
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            r10.getClass()
            int r3 = r5.f3709h
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = 0
        L_0x017a:
            if (r11 >= r3) goto L_0x0188
            java.lang.Object[] r10 = r5.f3708g
            r10 = r10[r11]
            J.l r10 = (J.l) r10
            r6.add(r10)
            r10 = 1
            int r11 = r11 + r10
            goto L_0x017a
        L_0x0188:
            r10 = 1
            R.c r3 = new R.c
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r10) goto L_0x01b6
            if (r1 != r12) goto L_0x01ae
            int r1 = r6.size()
            if (r4 != 0) goto L_0x019d
            r2 = -1
            goto L_0x01a1
        L_0x019d:
            int r2 = r6.lastIndexOf(r4)
        L_0x01a1:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01ab
            java.lang.Object r1 = r6.get(r2)
        L_0x01a8:
            r16 = r1
            goto L_0x01cd
        L_0x01ab:
            r16 = 0
            goto L_0x01cd
        L_0x01ae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b6:
            int r1 = r6.size()
            if (r4 != 0) goto L_0x01bf
        L_0x01bc:
            r17 = 1
            goto L_0x01c4
        L_0x01bf:
            int r1 = r6.indexOf(r4)
            goto L_0x01bc
        L_0x01c4:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01ab
            java.lang.Object r1 = r6.get(r1)
            goto L_0x01a8
        L_0x01cd:
            J.l r16 = (J.l) r16
            goto L_0x015a
        L_0x01d0:
            if (r1 != 0) goto L_0x01d3
            goto L_0x01ea
        L_0x01d3:
            r6 = 0
        L_0x01d4:
            int r2 = r5.f3709h
            if (r6 >= r2) goto L_0x01e5
            java.lang.Object[] r2 = r5.f3708g
            r2 = r2[r6]
            if (r2 != r1) goto L_0x01e0
            r13 = r6
            goto L_0x01e6
        L_0x01e0:
            r17 = 1
            int r6 = r6 + 1
            goto L_0x01d4
        L_0x01e5:
            r13 = -1
        L_0x01e6:
            int[] r1 = r5.f
            r7 = r1[r13]
        L_0x01ea:
            boolean r1 = r0.p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R.b.m(int, android.graphics.Rect):boolean");
    }

    public final l n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        Chip chip = this.f677i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        l lVar = new l(obtain);
        WeakHashMap weakHashMap = O.f393a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                lVar.f490a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
            }
            return lVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i2, l lVar);

    public final boolean p(int i2) {
        int i3;
        Chip chip = this.f677i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f680l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f680l = i2;
        d dVar = (d) this;
        if (i2 == 1) {
            Chip chip2 = dVar.f4483q;
            chip2.f1936m = true;
            chip2.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.f677i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f676h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            com.google.android.material.chip.Chip r0 = r5.f677i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            goto L_0x008b
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            J.l r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f490a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            r7.setSource(r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R.b.q(int, int):void");
    }
}

package k;

import I.O;
import N.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import d.a;

public abstract class E0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3341a = true;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3342c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3343d;

    /* renamed from: e  reason: collision with root package name */
    public int f3344e = 8388659;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f3345g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3346h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3347i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3348j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f3349k;

    /* renamed from: l  reason: collision with root package name */
    public int f3350l;

    /* renamed from: m  reason: collision with root package name */
    public int f3351m;

    /* renamed from: n  reason: collision with root package name */
    public int f3352n;

    /* renamed from: o  reason: collision with root package name */
    public int f3353o;

    public E0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int[] iArr = a.f2204n;
        g E2 = g.E(context, attributeSet, iArr, i2);
        O.o(this, context, iArr, attributeSet, (TypedArray) E2.f606c, i2);
        TypedArray typedArray = (TypedArray) E2.f606c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3345g = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.f3346h = typedArray.getBoolean(7, false);
        setDividerDrawable(E2.p(5));
        this.f3352n = typedArray.getInt(8, 0);
        this.f3353o = typedArray.getDimensionPixelSize(6, 0);
        E2.F();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof D0;
    }

    public final void f(Canvas canvas, int i2) {
        this.f3349k.setBounds(getPaddingLeft() + this.f3353o, i2, (getWidth() - getPaddingRight()) - this.f3353o, this.f3351m + i2);
        this.f3349k.draw(canvas);
    }

    public final void g(Canvas canvas, int i2) {
        this.f3349k.setBounds(i2, getPaddingTop() + this.f3353o, this.f3350l + i2, (getHeight() - getPaddingBottom()) - this.f3353o);
        this.f3349k.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.b;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f3342c;
                if (this.f3343d == 1 && (i2 = this.f3344e & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                }
                return i4 + ((D0) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.f3349k;
    }

    public int getDividerPadding() {
        return this.f3353o;
    }

    public int getDividerWidth() {
        return this.f3350l;
    }

    public int getGravity() {
        return this.f3344e;
    }

    public int getOrientation() {
        return this.f3343d;
    }

    public int getShowDividers() {
        return this.f3352n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3345g;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, k.D0] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k.D0] */
    /* renamed from: h */
    public D0 generateDefaultLayoutParams() {
        int i2 = this.f3343d;
        if (i2 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.D0] */
    /* renamed from: i */
    public D0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.D0] */
    /* renamed from: j */
    public D0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean k(int i2) {
        if (i2 == 0) {
            if ((this.f3352n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 != getChildCount()) {
            if ((this.f3352n & 2) != 0) {
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    if (getChildAt(i3).getVisibility() != 8) {
                        return true;
                    }
                }
            }
            return false;
        } else if ((this.f3352n & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        int left;
        int i3;
        int i4;
        int i5;
        if (this.f3349k != null) {
            int i6 = 0;
            if (this.f3343d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i6 < virtualChildCount) {
                    View childAt = getChildAt(i6);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !k(i6))) {
                        f(canvas, (childAt.getTop() - ((D0) childAt.getLayoutParams()).topMargin) - this.f3351m);
                    }
                    i6++;
                }
                if (k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i5 = (getHeight() - getPaddingBottom()) - this.f3351m;
                    } else {
                        i5 = childAt2.getBottom() + ((D0) childAt2.getLayoutParams()).bottomMargin;
                    }
                    f(canvas, i5);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = D1.a(this);
            while (i6 < virtualChildCount2) {
                View childAt3 = getChildAt(i6);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !k(i6))) {
                    D0 d02 = (D0) childAt3.getLayoutParams();
                    if (a2) {
                        i4 = childAt3.getRight() + d02.rightMargin;
                    } else {
                        i4 = (childAt3.getLeft() - d02.leftMargin) - this.f3350l;
                    }
                    g(canvas, i4);
                }
                i6++;
            }
            if (k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    D0 d03 = (D0) childAt4.getLayoutParams();
                    if (a2) {
                        left = childAt4.getLeft() - d03.leftMargin;
                        i3 = this.f3350l;
                    } else {
                        i2 = childAt4.getRight() + d03.rightMargin;
                        g(canvas, i2);
                    }
                } else if (a2) {
                    i2 = getPaddingLeft();
                    g(canvas, i2);
                } else {
                    left = getWidth() - getPaddingRight();
                    i3 = this.f3350l;
                }
                i2 = left - i3;
                g(canvas, i2);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f3343d
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 2
            r7 = 16
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r9 = 1
            if (r1 != r9) goto L_0x00b5
            int r1 = r0.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r0.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r0.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r0.getVirtualChildCount()
            int r13 = r0.f3344e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 & r13
            if (r14 == r7) goto L_0x0042
            if (r14 == r5) goto L_0x0036
            int r5 = r0.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r7 = r0.f
            int r5 = r5 - r7
            goto L_0x004d
        L_0x0042:
            int r5 = r0.getPaddingTop()
            int r7 = r27 - r25
            int r13 = r0.f
            int r7 = r7 - r13
            int r7 = r7 / r6
            int r5 = r5 + r7
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 >= r12) goto L_0x01c7
            android.view.View r7 = r0.getChildAt(r4)
            if (r7 != 0) goto L_0x0059
        L_0x0056:
            r23 = 2
            goto L_0x00b0
        L_0x0059:
            int r13 = r7.getVisibility()
            if (r13 == r3) goto L_0x0056
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            k.D0 r15 = (k.D0) r15
            r23 = 2
            int r6 = r15.gravity
            if (r6 >= 0) goto L_0x0074
            r6 = r8
        L_0x0074:
            java.util.WeakHashMap r16 = I.O.f393a
            int r3 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r6, r3)
            r3 = r3 & 7
            if (r3 == r9) goto L_0x008e
            if (r3 == r2) goto L_0x0088
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L_0x0099
        L_0x0088:
            int r3 = r11 - r13
            int r6 = r15.rightMargin
        L_0x008c:
            int r3 = r3 - r6
            goto L_0x0099
        L_0x008e:
            int r3 = r10 - r13
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r6 = r15.leftMargin
            int r3 = r3 + r6
            int r6 = r15.rightMargin
            goto L_0x008c
        L_0x0099:
            boolean r6 = r0.k(r4)
            if (r6 == 0) goto L_0x00a2
            int r6 = r0.f3351m
            int r5 = r5 + r6
        L_0x00a2:
            int r6 = r15.topMargin
            int r5 = r5 + r6
            int r13 = r13 + r3
            int r6 = r5 + r14
            r7.layout(r3, r5, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        L_0x00b0:
            int r4 = r4 + r9
            r3 = 8
            r6 = 2
            goto L_0x004e
        L_0x00b5:
            r23 = 2
            boolean r1 = k.D1.a(r0)
            int r3 = r0.getPaddingTop()
            int r6 = r27 - r25
            int r10 = r0.getPaddingBottom()
            int r10 = r6 - r10
            int r6 = r6 - r3
            int r11 = r0.getPaddingBottom()
            int r6 = r6 - r11
            int r11 = r0.getVirtualChildCount()
            int r12 = r0.f3344e
            r8 = r8 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f3341a
            int[] r14 = r0.f3347i
            int[] r15 = r0.f3348j
            java.util.WeakHashMap r17 = I.O.f393a
            int r4 = r0.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r8, r4)
            if (r4 == r9) goto L_0x00fb
            if (r4 == r2) goto L_0x00ef
            int r2 = r0.getPaddingLeft()
            goto L_0x0107
        L_0x00ef:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f
            int r2 = r2 - r4
            goto L_0x0107
        L_0x00fb:
            int r2 = r0.getPaddingLeft()
            int r4 = r26 - r24
            int r8 = r0.f
            int r4 = r4 - r8
            int r4 = r4 / 2
            int r2 = r2 + r4
        L_0x0107:
            if (r1 == 0) goto L_0x010d
            int r1 = r11 + -1
            r8 = -1
            goto L_0x010f
        L_0x010d:
            r1 = 0
            r8 = 1
        L_0x010f:
            r9 = 0
            r17 = 1
        L_0x0112:
            if (r9 >= r11) goto L_0x01c7
            int r18 = r8 * r9
            int r5 = r18 + r1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L_0x0124
            r25 = r1
        L_0x0120:
            r19 = r3
            goto L_0x01bb
        L_0x0124:
            int r4 = r7.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L_0x01b7
            int r4 = r7.getMeasuredWidth()
            int r16 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r7.getLayoutParams()
            r1 = r19
            k.D0 r1 = (k.D0) r1
            r27 = r2
            if (r13 == 0) goto L_0x014e
            int r2 = r1.height
            r19 = r3
            r3 = -1
            if (r2 == r3) goto L_0x0150
            int r3 = r7.getBaseline()
            goto L_0x0151
        L_0x014e:
            r19 = r3
        L_0x0150:
            r3 = -1
        L_0x0151:
            int r2 = r1.gravity
            if (r2 >= 0) goto L_0x0156
            r2 = r12
        L_0x0156:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r20 = r4
            r4 = 16
            if (r2 == r4) goto L_0x018c
            r4 = 48
            if (r2 == r4) goto L_0x017e
            r4 = 80
            if (r2 == r4) goto L_0x016a
            r2 = r19
            r4 = -1
            goto L_0x0199
        L_0x016a:
            int r2 = r10 - r16
            int r4 = r1.bottomMargin
            int r2 = r2 - r4
            r4 = -1
            if (r3 == r4) goto L_0x0199
            int r21 = r7.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = r15[r23]
            int r3 = r3 - r21
        L_0x017c:
            int r2 = r2 - r3
            goto L_0x0199
        L_0x017e:
            r4 = -1
            int r2 = r1.topMargin
            int r2 = r19 + r2
            if (r3 == r4) goto L_0x0199
            r21 = r14[r17]
            int r21 = r21 - r3
            int r2 = r21 + r2
            goto L_0x0199
        L_0x018c:
            r4 = -1
            int r2 = r6 - r16
            int r2 = r2 / 2
            int r2 = r2 + r19
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r3 = r1.bottomMargin
            goto L_0x017c
        L_0x0199:
            boolean r3 = r0.k(r5)
            if (r3 == 0) goto L_0x01a4
            int r3 = r0.f3350l
            int r3 = r27 + r3
            goto L_0x01a6
        L_0x01a4:
            r3 = r27
        L_0x01a6:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r3 + r20
            int r4 = r2 + r16
            r7.layout(r3, r2, r5, r4)
            int r1 = r1.rightMargin
            int r4 = r20 + r1
            int r4 = r4 + r3
            r2 = r4
            goto L_0x01bb
        L_0x01b7:
            r27 = r2
            goto L_0x0120
        L_0x01bb:
            int r9 = r9 + 1
            r1 = r25
            r3 = r19
            r5 = 80
            r7 = 16
            goto L_0x0112
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.E0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:216:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0774  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0796  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            int r1 = r0.f3343d
            r7 = -2
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 8
            r13 = 0
            r14 = 1
            if (r1 != r14) goto L_0x034d
            r0.f = r13
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.b
            boolean r4 = r0.f3346h
            r5 = 0
            r6 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r19 = 0
            r20 = 1
            r22 = 0
            r23 = 0
            r24 = 1
        L_0x0034:
            if (r5 >= r15) goto L_0x015f
            r25 = r1
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != 0) goto L_0x0050
            int r1 = r0.f
            r0.f = r1
        L_0x0042:
            r29 = r2
            r7 = r3
            r28 = r4
            r11 = r5
            r10 = r25
            r2 = r39
            r4 = r40
            goto L_0x0150
        L_0x0050:
            int r10 = r1.getVisibility()
            if (r10 != r9) goto L_0x0057
            goto L_0x0042
        L_0x0057:
            boolean r10 = r0.k(r5)
            if (r10 == 0) goto L_0x0064
            int r10 = r0.f
            int r9 = r0.f3351m
            int r10 = r10 + r9
            r0.f = r10
        L_0x0064:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            k.D0 r9 = (k.D0) r9
            float r10 = r9.weight
            float r16 = r16 + r10
            if (r2 != r8) goto L_0x0097
            int r8 = r9.height
            if (r8 != 0) goto L_0x0097
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x0097
            int r8 = r0.f
            int r10 = r9.topMargin
            int r10 = r10 + r8
            int r11 = r9.bottomMargin
            int r10 = r10 + r11
            int r8 = java.lang.Math.max(r8, r10)
            r0.f = r8
            r30 = r1
            r29 = r2
            r7 = r3
            r28 = r4
            r11 = r5
            r10 = r25
            r19 = 1
            r2 = r39
            r4 = r40
            goto L_0x00e5
        L_0x0097:
            int r8 = r9.height
            if (r8 != 0) goto L_0x00a3
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a3
            r9.height = r7
            r8 = 0
            goto L_0x00a5
        L_0x00a3:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 != 0) goto L_0x00b0
            int r10 = r0.f
            r11 = r10
            r10 = r5
            r5 = r11
        L_0x00ae:
            r11 = r3
            goto L_0x00b3
        L_0x00b0:
            r10 = r5
            r5 = 0
            goto L_0x00ae
        L_0x00b3:
            r3 = 0
            r29 = r2
            r28 = r4
            r7 = r11
            r2 = r39
            r4 = r40
            r11 = r10
            r10 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r3) goto L_0x00c9
            r9.height = r8
        L_0x00c9:
            int r3 = r1.getMeasuredHeight()
            int r5 = r0.f
            int r8 = r5 + r3
            r30 = r1
            int r1 = r9.topMargin
            int r8 = r8 + r1
            int r1 = r9.bottomMargin
            int r8 = r8 + r1
            int r1 = java.lang.Math.max(r5, r8)
            r0.f = r1
            if (r28 == 0) goto L_0x00e5
            int r14 = java.lang.Math.max(r3, r14)
        L_0x00e5:
            if (r7 < 0) goto L_0x00ef
            int r5 = r11 + 1
            if (r7 != r5) goto L_0x00ef
            int r1 = r0.f
            r0.f3342c = r1
        L_0x00ef:
            if (r11 >= r7) goto L_0x00f7
            float r1 = r9.weight
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 > 0) goto L_0x00fa
        L_0x00f7:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0102
        L_0x00fa:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r1.<init>(r2)
            throw r1
        L_0x0102:
            if (r10 == r1) goto L_0x010d
            int r1 = r9.width
            r3 = -1
            if (r1 != r3) goto L_0x010d
            r1 = 1
            r23 = 1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            int r3 = r9.leftMargin
            int r5 = r9.rightMargin
            int r3 = r3 + r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 + r3
            int r8 = java.lang.Math.max(r13, r5)
            int r13 = r30.getMeasuredState()
            r30 = r1
            r1 = r22
            int r1 = android.view.View.combineMeasuredStates(r1, r13)
            if (r24 == 0) goto L_0x0133
            int r13 = r9.width
            r22 = r1
            r1 = -1
            if (r13 != r1) goto L_0x0135
            r1 = 1
            goto L_0x0136
        L_0x0133:
            r22 = r1
        L_0x0135:
            r1 = 0
        L_0x0136:
            float r9 = r9.weight
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x0145
            if (r30 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r3 = r5
        L_0x0140:
            int r12 = java.lang.Math.max(r12, r3)
            goto L_0x014d
        L_0x0145:
            if (r30 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r3 = r5
        L_0x0149:
            int r6 = java.lang.Math.max(r6, r3)
        L_0x014d:
            r24 = r1
            r13 = r8
        L_0x0150:
            int r5 = r11 + 1
            r3 = r7
            r1 = r10
            r4 = r28
            r2 = r29
            r7 = -2
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 8
            goto L_0x0034
        L_0x015f:
            r10 = r1
            r29 = r2
            r28 = r4
            r1 = r22
            r2 = r39
            r4 = r40
            int r3 = r0.f
            if (r3 <= 0) goto L_0x017b
            boolean r3 = r0.k(r15)
            if (r3 == 0) goto L_0x017b
            int r3 = r0.f
            int r5 = r0.f3351m
            int r3 = r3 + r5
            r0.f = r3
        L_0x017b:
            r5 = r29
            if (r28 == 0) goto L_0x01b8
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r3) goto L_0x0185
            if (r5 != 0) goto L_0x01b8
        L_0x0185:
            r3 = 0
            r0.f = r3
            r3 = 0
        L_0x0189:
            if (r3 >= r15) goto L_0x01b8
            android.view.View r7 = r0.getChildAt(r3)
            if (r7 != 0) goto L_0x0196
            int r7 = r0.f
            r0.f = r7
            goto L_0x01b5
        L_0x0196:
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x019f
            goto L_0x01b5
        L_0x019f:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            k.D0 r7 = (k.D0) r7
            int r8 = r0.f
            int r9 = r8 + r14
            int r11 = r7.topMargin
            int r9 = r9 + r11
            int r7 = r7.bottomMargin
            int r9 = r9 + r7
            int r7 = java.lang.Math.max(r8, r9)
            r0.f = r7
        L_0x01b5:
            int r3 = r3 + 1
            goto L_0x0189
        L_0x01b8:
            int r3 = r0.f
            int r7 = r0.getPaddingTop()
            int r8 = r0.getPaddingBottom()
            int r8 = r8 + r7
            int r8 = r8 + r3
            r0.f = r8
            int r3 = r0.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r8, r3)
            r7 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r4, r7)
            r7 = r3 & r17
            int r8 = r0.f
            int r7 = r7 - r8
            if (r19 != 0) goto L_0x021d
            if (r7 == 0) goto L_0x01e1
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e1
            goto L_0x021d
        L_0x01e1:
            int r6 = java.lang.Math.max(r6, r12)
            if (r28 == 0) goto L_0x02f1
            r7 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x02f1
            r5 = 0
        L_0x01ec:
            if (r5 >= r15) goto L_0x02f1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 == 0) goto L_0x021a
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x01fd
            goto L_0x021a
        L_0x01fd:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            k.D0 r8 = (k.D0) r8
            float r8 = r8.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x021a
            int r8 = r7.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r7.measure(r8, r11)
        L_0x021a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x021d:
            float r8 = r0.f3345g
            int r9 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x0225
            r16 = r8
        L_0x0225:
            r8 = 0
            r0.f = r8
            r8 = r1
            r1 = 0
        L_0x022a:
            if (r1 >= r15) goto L_0x02e2
            android.view.View r9 = r0.getChildAt(r1)
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x023c
            r17 = r1
            goto L_0x02de
        L_0x023c:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            k.D0 r11 = (k.D0) r11
            float r12 = r11.weight
            int r14 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x029d
            float r14 = (float) r7
            float r14 = r14 * r12
            float r14 = r14 / r16
            int r14 = (int) r14
            float r16 = r16 - r12
            int r7 = r7 - r14
            int r12 = r0.getPaddingLeft()
            int r17 = r0.getPaddingRight()
            int r17 = r17 + r12
            int r12 = r11.leftMargin
            int r17 = r17 + r12
            int r12 = r11.rightMargin
            int r12 = r17 + r12
            r17 = r1
            int r1 = r11.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r12, r1)
            int r12 = r11.height
            if (r12 != 0) goto L_0x0280
            r12 = 1073741824(0x40000000, float:2.0)
            if (r5 == r12) goto L_0x0274
            goto L_0x0282
        L_0x0274:
            if (r14 <= 0) goto L_0x0277
            goto L_0x0278
        L_0x0277:
            r14 = 0
        L_0x0278:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            r9.measure(r1, r14)
            goto L_0x0292
        L_0x0280:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0282:
            int r19 = r9.getMeasuredHeight()
            int r14 = r19 + r14
            if (r14 >= 0) goto L_0x028b
            r14 = 0
        L_0x028b:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            r9.measure(r1, r14)
        L_0x0292:
            int r1 = r9.getMeasuredState()
            r1 = r1 & -256(0xffffffffffffff00, float:NaN)
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L_0x029f
        L_0x029d:
            r17 = r1
        L_0x029f:
            int r1 = r11.leftMargin
            int r12 = r11.rightMargin
            int r1 = r1 + r12
            int r12 = r9.getMeasuredWidth()
            int r12 = r12 + r1
            int r13 = java.lang.Math.max(r13, r12)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x02bb
            int r14 = r11.width
            r19 = r1
            r1 = -1
            if (r14 != r1) goto L_0x02bc
            r12 = r19
            goto L_0x02bc
        L_0x02bb:
            r1 = -1
        L_0x02bc:
            int r6 = java.lang.Math.max(r6, r12)
            if (r24 == 0) goto L_0x02c8
            int r12 = r11.width
            if (r12 != r1) goto L_0x02c8
            r1 = 1
            goto L_0x02c9
        L_0x02c8:
            r1 = 0
        L_0x02c9:
            int r12 = r0.f
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r12
            int r14 = r11.topMargin
            int r9 = r9 + r14
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            int r9 = java.lang.Math.max(r12, r9)
            r0.f = r9
            r24 = r1
        L_0x02de:
            int r1 = r17 + 1
            goto L_0x022a
        L_0x02e2:
            int r1 = r0.f
            int r5 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f = r7
            r1 = r8
        L_0x02f1:
            if (r24 != 0) goto L_0x02f8
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x02f8
            goto L_0x02f9
        L_0x02f8:
            r6 = r13
        L_0x02f9:
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r6
            int r5 = r0.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r7, r5)
            int r1 = android.view.View.resolveSizeAndState(r5, r2, r1)
            r0.setMeasuredDimension(r1, r3)
            if (r23 == 0) goto L_0x085e
            int r1 = r0.getMeasuredWidth()
            r14 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r13 = 0
        L_0x031f:
            if (r13 >= r15) goto L_0x085e
            android.view.View r1 = r0.getChildAt(r13)
            int r3 = r1.getVisibility()
            r9 = 8
            if (r3 == r9) goto L_0x0348
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            k.D0 r6 = (k.D0) r6
            int r3 = r6.width
            r5 = -1
            if (r3 != r5) goto L_0x0348
            int r7 = r6.height
            int r3 = r1.getMeasuredHeight()
            r6.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6.height = r7
        L_0x0348:
            int r13 = r13 + 1
            r4 = r40
            goto L_0x031f
        L_0x034d:
            r2 = r39
            r3 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r20 = 1
            r0.f = r3
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.f3347i
            r9 = 4
            if (r1 == 0) goto L_0x036e
            int[] r1 = r0.f3348j
            if (r1 != 0) goto L_0x0376
        L_0x036e:
            int[] r1 = new int[r9]
            r0.f3347i = r1
            int[] r1 = new int[r9]
            r0.f3348j = r1
        L_0x0376:
            int[] r10 = r0.f3347i
            int[] r11 = r0.f3348j
            r12 = 3
            r26 = -1
            r10[r12] = r26
            r13 = 2
            r10[r13] = r26
            r10[r20] = r26
            r21 = 0
            r10[r21] = r26
            r11[r12] = r26
            r11[r13] = r26
            r11[r20] = r26
            r11[r21] = r26
            boolean r14 = r0.f3341a
            boolean r15 = r0.f3346h
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x039b
            r16 = 1
            goto L_0x039d
        L_0x039b:
            r16 = 0
        L_0x039d:
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r12 = 0
            r19 = 0
            r22 = 0
            r23 = 4
            r24 = 3
            r28 = 0
            r29 = 1
        L_0x03af:
            if (r1 >= r6) goto L_0x0562
            r30 = 2
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L_0x03cc
            int r13 = r0.f
            r0.f = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L_0x0553
        L_0x03cc:
            int r2 = r13.getVisibility()
            r31 = r3
            r3 = 8
            if (r2 != r3) goto L_0x03e9
            r2 = r39
            r33 = r1
            r1 = r4
            r32 = r11
            r34 = r14
            r35 = r15
            r3 = r31
            r4 = r40
            r31 = r10
            goto L_0x0553
        L_0x03e9:
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x03f6
            int r2 = r0.f
            int r3 = r0.f3350l
            int r2 = r2 + r3
            r0.f = r2
        L_0x03f6:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            k.D0 r2 = (k.D0) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x046b
            int r1 = r2.width
            if (r1 != 0) goto L_0x046b
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x046b
            if (r16 == 0) goto L_0x041e
            int r1 = r0.f
            int r3 = r2.leftMargin
            r33 = r1
            int r1 = r2.rightMargin
            int r3 = r3 + r1
            int r3 = r3 + r33
            r0.f = r3
            goto L_0x042f
        L_0x041e:
            int r1 = r0.f
            int r3 = r2.leftMargin
            int r3 = r3 + r1
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.f = r1
        L_0x042f:
            if (r14 == 0) goto L_0x0450
            r3 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r13.measure(r1, r1)
            r36 = r13
            r34 = r14
            r35 = r15
            r13 = r31
            r33 = r32
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L_0x04d3
        L_0x0450:
            r36 = r13
            r34 = r14
            r35 = r15
            r13 = r31
            r33 = r32
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = 1
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L_0x04d5
        L_0x046b:
            int r1 = r2.width
            if (r1 != 0) goto L_0x0478
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x0478
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L_0x047a
        L_0x0478:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x047a:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x0483
            int r3 = r0.f
        L_0x0480:
            r33 = r5
            goto L_0x0485
        L_0x0483:
            r3 = 0
            goto L_0x0480
        L_0x0485:
            r5 = 0
            r34 = r32
            r32 = r11
            r11 = r33
            r33 = r34
            r34 = r14
            r35 = r15
            r15 = r1
            r14 = r2
            r1 = r13
            r13 = r31
            r2 = r39
            r31 = r10
            r10 = r4
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r3) goto L_0x04a7
            r14.width = r15
        L_0x04a7:
            int r3 = r1.getMeasuredWidth()
            if (r16 == 0) goto L_0x04bb
            int r5 = r0.f
            int r15 = r14.leftMargin
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.f = r15
            goto L_0x04cd
        L_0x04bb:
            r36 = r1
            int r1 = r0.f
            int r5 = r1 + r3
            int r15 = r14.leftMargin
            int r5 = r5 + r15
            int r15 = r14.rightMargin
            int r5 = r5 + r15
            int r1 = java.lang.Math.max(r1, r5)
            r0.f = r1
        L_0x04cd:
            if (r35 == 0) goto L_0x04d3
            int r9 = java.lang.Math.max(r3, r9)
        L_0x04d3:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x04d5:
            if (r8 == r1) goto L_0x04e0
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L_0x04e0
            r1 = 1
            r19 = 1
            goto L_0x04e1
        L_0x04e0:
            r1 = 0
        L_0x04e1:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L_0x0523
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L_0x0525
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x0504
            int r1 = r0.f3344e
        L_0x0504:
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 4
            r25 = -2
            r1 = r1 & -2
            int r1 = r1 >> 1
            r37 = r1
            r1 = r31[r37]
            int r1 = java.lang.Math.max(r1, r15)
            r31[r37] = r1
            r1 = r32[r37]
            int r15 = r5 - r15
            int r1 = java.lang.Math.max(r1, r15)
            r32[r37] = r1
            goto L_0x0525
        L_0x0523:
            r36 = r1
        L_0x0525:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L_0x0532
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L_0x0532
            r13 = 1
            goto L_0x0533
        L_0x0532:
            r13 = 0
        L_0x0533:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x0543
            if (r36 == 0) goto L_0x053c
            goto L_0x053d
        L_0x053c:
            r3 = r5
        L_0x053d:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L_0x054c
        L_0x0543:
            if (r36 == 0) goto L_0x0546
            goto L_0x0547
        L_0x0546:
            r3 = r5
        L_0x0547:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L_0x054c:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L_0x0553:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            r13 = 2
            goto L_0x03af
        L_0x0562:
            r13 = r3
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r30 = 2
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.f
            if (r1 <= 0) goto L_0x0582
            boolean r1 = r0.k(r6)
            if (r1 == 0) goto L_0x0582
            int r1 = r0.f
            int r3 = r0.f3350l
            int r1 = r1 + r3
            r0.f = r1
        L_0x0582:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L_0x0598
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L_0x0598
            r5 = r31[r30]
            if (r5 != r3) goto L_0x0598
            r5 = r31[r24]
            if (r5 == r3) goto L_0x0596
            goto L_0x0598
        L_0x0596:
            r3 = r13
            goto L_0x05c5
        L_0x0598:
            r3 = r31[r24]
            r21 = 0
            r5 = r31[r21]
            r14 = r31[r30]
            int r1 = java.lang.Math.max(r1, r14)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r32[r24]
            r5 = r32[r21]
            r14 = r32[r20]
            r15 = r32[r30]
            int r14 = java.lang.Math.max(r14, r15)
            int r5 = java.lang.Math.max(r5, r14)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 + r1
            int r3 = java.lang.Math.max(r13, r3)
        L_0x05c5:
            if (r35 == 0) goto L_0x060e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r1) goto L_0x05cd
            if (r7 != 0) goto L_0x060e
        L_0x05cd:
            r1 = 0
            r0.f = r1
            r1 = 0
        L_0x05d1:
            if (r1 >= r6) goto L_0x060e
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L_0x05de
            int r5 = r0.f
            r0.f = r5
            goto L_0x060b
        L_0x05de:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x05e7
            goto L_0x060b
        L_0x05e7:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            k.D0 r5 = (k.D0) r5
            if (r16 == 0) goto L_0x05fb
            int r13 = r0.f
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.f = r14
            goto L_0x060b
        L_0x05fb:
            int r13 = r0.f
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.f = r5
        L_0x060b:
            int r1 = r1 + 1
            goto L_0x05d1
        L_0x060e:
            int r1 = r0.f
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.f = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.f
            int r5 = r5 - r13
            if (r22 != 0) goto L_0x067b
            if (r5 == 0) goto L_0x0637
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x0637
            goto L_0x067b
        L_0x0637:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L_0x0673
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L_0x0673
            r7 = 0
        L_0x0642:
            if (r7 >= r6) goto L_0x0673
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L_0x0670
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L_0x0653
            goto L_0x0670
        L_0x0653:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            k.D0 r11 = (k.D0) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0670
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L_0x0670:
            int r7 = r7 + 1
            goto L_0x0642
        L_0x0673:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L_0x07f9
        L_0x067b:
            float r3 = r0.f3345g
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x0683
            r28 = r3
        L_0x0683:
            r26 = -1
            r31[r24] = r26
            r31[r30] = r26
            r31[r20] = r26
            r3 = 0
            r31[r3] = r26
            r32[r24] = r26
            r32[r30] = r26
            r32[r20] = r26
            r32[r3] = r26
            r0.f = r3
            r3 = -1
            r9 = 0
        L_0x069a:
            if (r9 >= r6) goto L_0x07a1
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L_0x06aa
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x06b2
        L_0x06aa:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L_0x079b
        L_0x06b2:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            k.D0 r14 = (k.D0) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L_0x0715
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r13 = (float) r5
            float r13 = r13 * r15
            float r13 = r13 / r28
            int r13 = (int) r13
            float r28 = r28 - r15
            int r5 = r5 - r13
            int r15 = r0.getPaddingTop()
            int r22 = r0.getPaddingBottom()
            int r22 = r22 + r15
            int r15 = r14.topMargin
            int r22 = r22 + r15
            int r15 = r14.bottomMargin
            int r15 = r22 + r15
            r22 = r1
            int r1 = r14.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L_0x06f8
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L_0x06ec
            goto L_0x06fa
        L_0x06ec:
            if (r13 <= 0) goto L_0x06ef
            goto L_0x06f0
        L_0x06ef:
            r13 = 0
        L_0x06f0:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L_0x070a
        L_0x06f8:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x06fa:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L_0x0703
            r13 = 0
        L_0x0703:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L_0x070a:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L_0x0719
        L_0x0715:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0719:
            if (r16 == 0) goto L_0x072d
            int r1 = r0.f
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.f = r13
        L_0x072a:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0741
        L_0x072d:
            int r1 = r0.f
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.f = r1
            goto L_0x072a
        L_0x0741:
            if (r8 == r1) goto L_0x074a
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L_0x074a
            r1 = 1
            goto L_0x074b
        L_0x074a:
            r1 = 0
        L_0x074b:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L_0x075c
            goto L_0x075d
        L_0x075c:
            r13 = r15
        L_0x075d:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L_0x076a
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L_0x076b
            r10 = 1
            goto L_0x076c
        L_0x076a:
            r13 = -1
        L_0x076b:
            r10 = 0
        L_0x076c:
            if (r34 == 0) goto L_0x0796
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L_0x0796
            int r13 = r14.gravity
            if (r13 >= 0) goto L_0x077a
            int r13 = r0.f3344e
        L_0x077a:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r25 = -2
            r13 = r13 & -2
            int r13 = r13 >> 1
            r14 = r31[r13]
            int r14 = java.lang.Math.max(r14, r11)
            r31[r13] = r14
            r14 = r32[r13]
            int r15 = r15 - r11
            int r11 = java.lang.Math.max(r14, r15)
            r32[r13] = r11
            goto L_0x0798
        L_0x0796:
            r25 = -2
        L_0x0798:
            r29 = r10
            r10 = r1
        L_0x079b:
            int r9 = r9 + 1
            r1 = r22
            goto L_0x069a
        L_0x07a1:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.f
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L_0x07ca
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L_0x07ca
            r5 = r31[r30]
            if (r5 != r15) goto L_0x07ca
            r5 = r31[r24]
            if (r5 == r15) goto L_0x07c7
            goto L_0x07ca
        L_0x07c7:
            r21 = 0
            goto L_0x07f8
        L_0x07ca:
            r5 = r31[r24]
            r21 = 0
            r7 = r31[r21]
            r9 = r31[r30]
            int r1 = java.lang.Math.max(r1, r9)
            int r1 = java.lang.Math.max(r7, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r32[r24]
            r7 = r32[r21]
            r9 = r32[r20]
            r11 = r32[r30]
            int r9 = java.lang.Math.max(r9, r11)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r3, r5)
            r3 = r1
        L_0x07f8:
            r5 = r10
        L_0x07f9:
            if (r29 != 0) goto L_0x0800
            r14 = 1073741824(0x40000000, float:2.0)
            if (r8 == r14) goto L_0x0800
            r3 = r5
        L_0x0800:
            int r1 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r3
            int r1 = r0.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r5, r1)
            r3 = r12 & r17
            r3 = r22 | r3
            int r5 = r12 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r0.setMeasuredDimension(r3, r1)
            if (r19 == 0) goto L_0x085e
            int r1 = r0.getMeasuredHeight()
            r14 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r13 = 0
        L_0x082c:
            if (r13 >= r6) goto L_0x085e
            android.view.View r1 = r0.getChildAt(r13)
            int r3 = r1.getVisibility()
            r9 = 8
            if (r3 == r9) goto L_0x0856
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            k.D0 r7 = (k.D0) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L_0x0857
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L_0x0857
        L_0x0856:
            r15 = -1
        L_0x0857:
            int r13 = r13 + 1
            r0 = r38
            r2 = r39
            goto L_0x082c
        L_0x085e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.E0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f3341a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.b = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3349k) {
            this.f3349k = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.f3350l = drawable.getIntrinsicWidth();
                this.f3351m = drawable.getIntrinsicHeight();
            } else {
                this.f3350l = 0;
                this.f3351m = 0;
            }
            if (drawable == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.f3353o = i2;
    }

    public void setGravity(int i2) {
        if (this.f3344e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f3344e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f3344e;
        if ((8388615 & i4) != i3) {
            this.f3344e = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3346h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f3343d != i2) {
            this.f3343d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f3352n) {
            requestLayout();
        }
        this.f3352n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f3344e;
        if ((i4 & 112) != i3) {
            this.f3344e = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f3345g = Math.max(0.0f, f2);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

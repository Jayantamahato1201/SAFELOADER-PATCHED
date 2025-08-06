package androidx.core.widget;

import F.c;
import I.C0015g;
import I.C0020l;
import I.C0022n;
import I.C0023o;
import I.D;
import I.O;
import O.e;
import O.h;
import O.i;
import O.j;
import O.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.cheatbox.R;
import e.C0135f;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements C0022n {

    /* renamed from: C  reason: collision with root package name */
    public static final float f1119C = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final h D = new h(0);

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f1120E = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public j f1121A;

    /* renamed from: B  reason: collision with root package name */
    public final C0015g f1122B = new C0015g(getContext(), new A.j(9, (Object) this));

    /* renamed from: a  reason: collision with root package name */
    public final float f1123a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1124c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final OverScroller f1125d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f1126e;
    public final EdgeEffect f;

    /* renamed from: g  reason: collision with root package name */
    public int f1127g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1128h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1129i = false;

    /* renamed from: j  reason: collision with root package name */
    public View f1130j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1131k = false;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f1132l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1133m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1134n = true;

    /* renamed from: o  reason: collision with root package name */
    public final int f1135o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1136p;

    /* renamed from: q  reason: collision with root package name */
    public final int f1137q;

    /* renamed from: r  reason: collision with root package name */
    public int f1138r = -1;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1139s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1140t = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public int f1141u;

    /* renamed from: v  reason: collision with root package name */
    public int f1142v;

    /* renamed from: w  reason: collision with root package name */
    public l f1143w;

    /* renamed from: x  reason: collision with root package name */
    public final C0023o f1144x;

    /* renamed from: y  reason: collision with root package name */
    public final C0020l f1145y;

    /* renamed from: z  reason: collision with root package name */
    public float f1146z;

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, I.o] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1126e = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f = edgeEffect2;
        this.f1123a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1125d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1135o = viewConfiguration.getScaledTouchSlop();
        this.f1136p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1137q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1120E, R.attr.MT_Bin, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1144x = new Object();
        this.f1145y = new C0020l(this);
        setNestedScrollingEnabled(true);
        O.p(this, D);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !l((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, View view2, int i2, int i3) {
        C0023o oVar = this.f1144x;
        if (i3 == 1) {
            oVar.b = i2;
        } else {
            oVar.f456a = i2;
        }
        this.f1145y.g(2, i3);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, int i2) {
        C0023o oVar = this.f1144x;
        if (i2 == 1) {
            oVar.b = 0;
        } else {
            oVar.f456a = 0;
        }
        w(i2);
    }

    public final void c(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1145y.c(i2, i3, iArr, (int[]) null, i4);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r17 = this;
            r0 = r17
            android.widget.OverScroller r1 = r0.f1125d
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.widget.OverScroller r1 = r0.f1125d
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.f1125d
            int r1 = r1.getCurrY()
            int r2 = r0.f1142v
            int r2 = r1 - r2
            int r3 = r0.getHeight()
            android.widget.EdgeEffect r4 = r0.f
            android.widget.EdgeEffect r5 = r0.f1126e
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            r8 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L_0x004c
            float r9 = A.i.J(r5)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x004c
            int r7 = -r2
            float r7 = (float) r7
            float r7 = r7 * r8
            float r9 = (float) r3
            float r7 = r7 / r9
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r8
            float r6 = A.i.f0(r5, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L_0x0049
            r5.finish()
        L_0x0049:
            int r2 = r2 - r3
        L_0x004a:
            r8 = r2
            goto L_0x006c
        L_0x004c:
            if (r2 >= 0) goto L_0x004a
            float r9 = A.i.J(r4)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            float r7 = (float) r2
            float r7 = r7 * r8
            float r3 = (float) r3
            float r7 = r7 / r3
            float r3 = r3 / r8
            float r6 = A.i.f0(r4, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L_0x0049
            r4.finish()
            goto L_0x0049
        L_0x006c:
            r0.f1142v = r1
            int[] r9 = r0.f1140t
            r1 = 1
            r2 = 0
            r9[r1] = r2
            r10 = 0
            I.l r6 = r0.f1145y
            r7 = 0
            r11 = 1
            r6.c(r7, r8, r9, r10, r11)
            r16 = r9
            r3 = r16[r1]
            int r8 = r8 - r3
            int r3 = r0.getScrollRange()
            if (r8 == 0) goto L_0x00aa
            int r6 = r0.getScrollY()
            int r7 = r0.getScrollX()
            r0.p(r8, r7, r6, r3)
            int r7 = r0.getScrollY()
            int r11 = r7 - r6
            int r13 = r8 - r11
            r16[r1] = r2
            r10 = 0
            r12 = 0
            I.l r9 = r0.f1145y
            int[] r14 = r0.f1139s
            r15 = 1
            r9.d(r10, r11, r12, r13, r14, r15, r16)
            r2 = r16[r1]
            int r8 = r13 - r2
        L_0x00aa:
            if (r8 == 0) goto L_0x00e1
            int r2 = r0.getOverScrollMode()
            if (r2 == 0) goto L_0x00b6
            if (r2 != r1) goto L_0x00d9
            if (r3 <= 0) goto L_0x00d9
        L_0x00b6:
            if (r8 >= 0) goto L_0x00c9
            boolean r2 = r5.isFinished()
            if (r2 == 0) goto L_0x00d9
            android.widget.OverScroller r2 = r0.f1125d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r5.onAbsorb(r2)
            goto L_0x00d9
        L_0x00c9:
            boolean r2 = r4.isFinished()
            if (r2 == 0) goto L_0x00d9
            android.widget.OverScroller r2 = r0.f1125d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r4.onAbsorb(r2)
        L_0x00d9:
            android.widget.OverScroller r2 = r0.f1125d
            r2.abortAnimation()
            r0.w(r1)
        L_0x00e1:
            android.widget.OverScroller r2 = r0.f1125d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x00ed
            r0.postInvalidateOnAnimation()
            return
        L_0x00ed:
            r0.w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(i5, i6, iArr);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || i(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1145y.a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1145y.b(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1145y.c(i2, i3, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1145y.d(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1126e;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            }
            if (i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i3 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        n(i5, i6, (int[]) null);
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1124c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C0023o oVar = this.f1144x;
        return oVar.b | oVar.f456a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1146z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1146z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1146z;
    }

    public final int h(Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i5 - verticalFadingEdgeLength;
        } else {
            i2 = i5;
        }
        int i6 = rect.bottom;
        if (i6 > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = rect.top - scrollY;
            } else {
                i4 = rect.bottom - i2;
            }
            return Math.min(i4, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top >= scrollY || i6 >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i3 = 0 - (i2 - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            return Math.max(i3, -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f1145y.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1124c.setEmpty();
        int i2 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (keyEvent.isShiftPressed()) {
                                    i2 = 33;
                                }
                                q(i2);
                                return false;
                            } else if (keyCode == 92) {
                                return k(33);
                            } else {
                                if (keyCode == 93) {
                                    return k(130);
                                }
                                if (keyCode == 122) {
                                    q(33);
                                    return false;
                                } else if (keyCode == 123) {
                                    q(130);
                                    return false;
                                }
                            }
                        } else if (keyEvent.isAltPressed()) {
                            return k(130);
                        } else {
                            return g(130);
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return k(33);
                    } else {
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1145y.f443d;
    }

    public final void j(int i2) {
        if (getChildCount() > 0) {
            this.f1125d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1145y.g(2, 1);
            this.f1142v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i2) {
        boolean z2;
        int childCount;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.f1124c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i2, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i2, int i3) {
        Rect rect = this.f1124c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i2 < getScrollY() || rect.top - i2 > getScrollY() + i3) {
            return false;
        }
        return true;
    }

    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1145y.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1138r) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f1127g = (int) motionEvent.getY(i2);
            this.f1138r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1132l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1129i = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if (r2 >= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012c, code lost:
        if (r2 >= 0) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r3 = 1
            int r4 = r1.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x036c
            boolean r4 = r0.f1131k
            if (r4 != 0) goto L_0x036c
            int r4 = r1.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r1.getX()
            int r11 = (int) r11
            goto L_0x0046
        L_0x002f:
            int r4 = r1.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0043
            float r10 = r1.getAxisValue(r9)
            int r4 = r0.getWidth()
            int r11 = r4 / 2
            r4 = 26
            goto L_0x0046
        L_0x0043:
            r4 = 0
            r10 = 0
            r11 = 0
        L_0x0046:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x036c
            float r12 = r0.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r1.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005c
            r12 = 1
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            int r10 = -r10
            r0.s(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x0343
            I.g r10 = r0.f1122B
            r10.getClass()
            int r11 = r1.getSource()
            int r12 = r1.getDeviceId()
            int r13 = r10.f
            int[] r14 = r10.f429h
            r16 = 1
            r3 = 34
            if (r13 != r11) goto L_0x008a
            int r13 = r10.f428g
            if (r13 != r12) goto L_0x008a
            int r13 = r10.f427e
            if (r13 == r4) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            r6 = 0
            r18 = 20
            r20 = 0
            goto L_0x013c
        L_0x008a:
            android.content.Context r13 = r10.f424a
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r13)
            r18 = 20
            int r2 = r1.getDeviceId()
            int r7 = r1.getSource()
            r20 = 0
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r15 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r6 < r3) goto L_0x00ac
            java.lang.reflect.Method r23 = I.T.f398a
            int r2 = I.S.b(r5, r2, r4, r7)
            goto L_0x00e4
        L_0x00ac:
            java.lang.reflect.Method r23 = I.T.f398a
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x00e1
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto L_0x00e1
            android.content.res.Resources r2 = r13.getResources()
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r3) goto L_0x00cd
            r3 = 26
            if (r4 != r3) goto L_0x00cd
            java.lang.String r3 = "config_viewMinRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r3, r9, r15)
            goto L_0x00ce
        L_0x00cd:
            r3 = -1
        L_0x00ce:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r8) goto L_0x00dc
            if (r3 == 0) goto L_0x00e1
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto L_0x00e4
            goto L_0x00e1
        L_0x00dc:
            int r2 = r5.getScaledMinimumFlingVelocity()
            goto L_0x00e4
        L_0x00e1:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e4:
            r14[r20] = r2
            int r2 = r1.getDeviceId()
            int r3 = r1.getSource()
            r7 = 34
            if (r6 < r7) goto L_0x00f7
            int r2 = I.S.a(r5, r2, r4, r3)
            goto L_0x0133
        L_0x00f7:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x0105
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r3)
            if (r2 == 0) goto L_0x0105
            r2 = 1
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != 0) goto L_0x010d
        L_0x010a:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0133
        L_0x010d:
            android.content.res.Resources r2 = r13.getResources()
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r7) goto L_0x0120
            r3 = 26
            if (r4 != r3) goto L_0x0120
            java.lang.String r3 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r3, r9, r15)
            goto L_0x0121
        L_0x0120:
            r3 = -1
        L_0x0121:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r8) goto L_0x012f
            if (r3 == 0) goto L_0x010a
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto L_0x0133
            goto L_0x010a
        L_0x012f:
            int r2 = r5.getScaledMaximumFlingVelocity()
        L_0x0133:
            r14[r16] = r2
            r10.f = r11
            r10.f428g = r12
            r10.f427e = r4
            r6 = 1
        L_0x013c:
            r2 = r14[r20]
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x014e
            android.view.VelocityTracker r1 = r10.f425c
            if (r1 == 0) goto L_0x036b
            r1.recycle()
            r1 = 0
            r10.f425c = r1
            return r16
        L_0x014e:
            android.view.VelocityTracker r2 = r10.f425c
            if (r2 != 0) goto L_0x0158
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f425c = r2
        L_0x0158:
            android.view.VelocityTracker r2 = r10.f425c
            java.util.Map r3 = I.C0029v.f466a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r3 < r7) goto L_0x0166
            goto L_0x01c3
        L_0x0166:
            int r3 = r1.getSource()
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r7) goto L_0x01c3
            java.util.Map r3 = I.C0029v.f466a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x017e
            I.w r5 = new I.w
            r5.<init>()
            r3.put(r2, r5)
        L_0x017e:
            java.lang.Object r3 = r3.get(r2)
            I.w r3 = (I.C0030w) r3
            r3.getClass()
            long r7 = r1.getEventTime()
            int r5 = r3.f469d
            long[] r9 = r3.b
            if (r5 == 0) goto L_0x01a3
            int r5 = r3.f470e
            r11 = r9[r5]
            long r11 = r7 - r11
            r24 = 40
            int r5 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a3
            r5 = 0
            r3.f469d = r5
            r5 = 0
            r3.f468c = r5
        L_0x01a3:
            int r5 = r3.f470e
            int r5 = r5 + 1
            int r5 = r5 % 20
            r3.f470e = r5
            int r11 = r3.f469d
            r12 = 20
            if (r11 == r12) goto L_0x01b5
            int r11 = r11 + 1
            r3.f469d = r11
        L_0x01b5:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f467a
            r11[r5] = r1
            int r1 = r3.f470e
            r9[r1] = r7
        L_0x01c3:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = I.C0029v.f466a
            java.lang.Object r5 = r5.get(r2)
            I.w r5 = (I.C0030w) r5
            if (r5 == 0) goto L_0x02db
            int r7 = r5.f469d
            r8 = 2
            if (r7 >= r8) goto L_0x01e4
        L_0x01da:
            r26 = r2
            r31 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = 0
        L_0x01e0:
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L_0x02b4
        L_0x01e4:
            int r8 = r5.f470e
            r18 = 20
            int r9 = r8 + 20
            int r7 = r7 + -1
            int r9 = r9 - r7
            int r9 = r9 % 20
            long[] r7 = r5.b
            r11 = r7[r8]
        L_0x01f3:
            r24 = r7[r9]
            long r26 = r11 - r24
            r28 = 100
            int r8 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r8 <= 0) goto L_0x020a
            int r8 = r5.f469d
            int r8 = r8 + -1
            r5.f469d = r8
            int r9 = r9 + 1
            r18 = 20
            int r9 = r9 % 20
            goto L_0x01f3
        L_0x020a:
            r18 = 20
            int r8 = r5.f469d
            r11 = 2
            if (r8 >= r11) goto L_0x0212
            goto L_0x01da
        L_0x0212:
            float[] r12 = r5.f467a
            if (r8 != r11) goto L_0x022e
            int r9 = r9 + 1
            int r9 = r9 % 20
            r17 = r7[r9]
            int r7 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0221
            goto L_0x01da
        L_0x0221:
            r7 = r12[r9]
            long r8 = r17 - r24
            float r8 = (float) r8
            float r7 = r7 / r8
            r26 = r2
            r1 = r7
            r31 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x01e0
        L_0x022e:
            r8 = 0
            r11 = 0
            r13 = 0
        L_0x0231:
            int r15 = r5.f469d
            int r15 = r15 + -1
            r17 = 1073741824(0x40000000, float:2.0)
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 >= r15) goto L_0x0297
            int r15 = r11 + r9
            r18 = 20
            int r24 = r15 % 20
            r24 = r7[r24]
            int r15 = r15 + 1
            int r15 = r15 % 20
            r26 = r7[r15]
            int r28 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r28 != 0) goto L_0x0256
            r26 = r2
            r31 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 1
            goto L_0x028c
        L_0x0256:
            int r13 = r13 + 1
            r19 = 0
            int r26 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r26 >= 0) goto L_0x0260
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0260:
            float r22 = java.lang.Math.abs(r8)
            r31 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r3 = r22 * r17
            r26 = r2
            double r1 = (double) r3
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r21 = r21 * r1
            r1 = r12[r15]
            r2 = r7[r15]
            long r2 = r2 - r24
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r21
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = 1
            if (r13 != r2) goto L_0x028b
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L_0x028b:
            r8 = r1
        L_0x028c:
            int r11 = r11 + r2
            r2 = r26
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r16 = 1
            goto L_0x0231
        L_0x0297:
            r26 = r2
            r31 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r19 = 0
            int r1 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x02a4
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02a4:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r17
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r21
            goto L_0x01e0
        L_0x02b4:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.f468c = r1
            float r2 = java.lang.Math.abs(r31)
            float r2 = -r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02ca
            float r1 = java.lang.Math.abs(r31)
            float r1 = -r1
            r5.f468c = r1
            goto L_0x02dd
        L_0x02ca:
            float r1 = r5.f468c
            float r2 = java.lang.Math.abs(r31)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x02dd
            float r1 = java.lang.Math.abs(r31)
            r5.f468c = r1
            goto L_0x02dd
        L_0x02db:
            r26 = r2
        L_0x02dd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r1 < r7) goto L_0x02ea
            r1 = r26
            float r1 = I.C0028u.a(r1, r4)
            goto L_0x030e
        L_0x02ea:
            r1 = r26
            if (r4 != 0) goto L_0x02f3
            float r1 = r1.getXVelocity()
            goto L_0x030e
        L_0x02f3:
            r2 = 1
            if (r4 != r2) goto L_0x02fb
            float r1 = r1.getYVelocity()
            goto L_0x030e
        L_0x02fb:
            java.util.Map r2 = I.C0029v.f466a
            java.lang.Object r1 = r2.get(r1)
            I.w r1 = (I.C0030w) r1
            if (r1 == 0) goto L_0x030d
            r3 = 26
            if (r4 == r3) goto L_0x030a
            goto L_0x030d
        L_0x030a:
            float r1 = r1.f468c
            goto L_0x030e
        L_0x030d:
            r1 = 0
        L_0x030e:
            A.j r2 = r10.b
            java.lang.Object r2 = r2.b
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L_0x0331
            float r4 = r10.f426d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0336
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x0336
        L_0x0331:
            android.widget.OverScroller r3 = r2.f1125d
            r3.abortAnimation()
        L_0x0336:
            float r3 = java.lang.Math.abs(r1)
            r20 = 0
            r4 = r14[r20]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0346
        L_0x0343:
            r16 = 1
            goto L_0x036b
        L_0x0346:
            r16 = 1
            r3 = r14[r16]
            int r4 = -r3
            float r4 = (float) r4
            float r3 = (float) r3
            float r1 = java.lang.Math.min(r1, r3)
            float r1 = java.lang.Math.max(r4, r1)
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x035d
            r7 = 0
            goto L_0x0367
        L_0x035d:
            android.widget.OverScroller r3 = r2.f1125d
            r3.abortAnimation()
            int r3 = (int) r1
            r2.j(r3)
            r7 = r1
        L_0x0367:
            r10.f426d = r7
            r16 = 1
        L_0x036b:
            return r16
        L_0x036c:
            r20 = 0
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1131k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1138r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1127g) > this.f1135o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1131k = true;
                                this.f1127g = y2;
                                if (this.f1132l == null) {
                                    this.f1132l = VelocityTracker.obtain();
                                }
                                this.f1132l.addMovement(motionEvent);
                                this.f1141u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f1131k = false;
            this.f1138r = -1;
            VelocityTracker velocityTracker = this.f1132l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1132l = null;
            }
            if (this.f1125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1127g = y3;
                    this.f1138r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1132l;
                    if (velocityTracker2 == null) {
                        this.f1132l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1132l.addMovement(motionEvent);
                    this.f1125d.computeScrollOffset();
                    if (!v(motionEvent) && this.f1125d.isFinished()) {
                        z2 = false;
                    }
                    this.f1131k = z2;
                    this.f1145y.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f1125d.isFinished()) {
                z2 = false;
            }
            this.f1131k = z2;
            VelocityTracker velocityTracker3 = this.f1132l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1132l = null;
            }
        }
        return this.f1131k;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1128h = false;
        View view = this.f1130j;
        if (view != null && l(view, this)) {
            View view2 = this.f1130j;
            Rect rect = this.f1124c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1130j = null;
        if (!this.f1129i) {
            if (this.f1143w != null) {
                scrollTo(getScrollX(), this.f1143w.f);
                this.f1143w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1129i = true;
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1133m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        j((int) f3);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1145y.b(f2, f3);
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1145y.c(i2, i3, iArr, (int[]) null, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        n(i5, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && m(view, 0, getHeight())) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f1143w = lVar;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, O.l] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        j jVar = this.f1121A;
        if (jVar != null) {
            c cVar = (c) jVar;
            C0135f.a(this, (View) cVar.b, (View) cVar.f194c);
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i5)) {
            Rect rect = this.f1124c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h2 = h(rect);
            if (h2 == 0) {
                return;
            }
            if (this.f1134n) {
                u(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f1132l == null) {
            this.f1132l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent2.getActionMasked();
        if (actionMasked == 0) {
            this.f1141u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent2);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.f1141u);
        C0020l lVar = this.f1145y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f;
            EdgeEffect edgeEffect2 = this.f1126e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1132l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1137q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1138r);
                if (Math.abs(yVelocity) >= this.f1136p) {
                    if (A.i.J(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (A.i.J(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (t(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            j(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = (float) i3;
                        if (!lVar.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            j(i3);
                        }
                    }
                } else if (this.f1125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1138r = -1;
                this.f1131k = false;
                VelocityTracker velocityTracker2 = this.f1132l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1132l = null;
                }
                w(0);
                this.f1126e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1138r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1138r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i4 = this.f1127g - y2;
                    float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i4) / ((float) getHeight());
                    if (A.i.J(edgeEffect2) != 0.0f) {
                        float f4 = -A.i.f0(edgeEffect2, -height, x2);
                        if (A.i.J(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (A.i.J(edgeEffect) != 0.0f) {
                        float f02 = A.i.f0(edgeEffect, height, 1.0f - x2);
                        if (A.i.J(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = f02;
                    }
                    int round = Math.round(f2 * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i5 = i4 - round;
                    if (!this.f1131k && Math.abs(i5) > this.f1135o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1131k = true;
                        i5 = i5 > 0 ? i5 - this.f1135o : i5 + this.f1135o;
                    }
                    if (this.f1131k) {
                        int s2 = s(i5, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.f1127g = y2 - s2;
                        this.f1141u += s2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1131k && getChildCount() > 0 && this.f1125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1138r = -1;
                this.f1131k = false;
                VelocityTracker velocityTracker3 = this.f1132l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1132l = null;
                }
                w(0);
                this.f1126e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent2.getActionIndex();
                this.f1127g = (int) motionEvent2.getY(actionIndex);
                this.f1138r = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f1127g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1138r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f1131k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1125d.isFinished()) {
                this.f1125d.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.f1127g = (int) motionEvent2.getY();
            this.f1138r = pointerId;
            lVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1132l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i2, int i3, int i4, int i5) {
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            z2 = true;
            i6 = 0;
        }
        if (i8 > i5) {
            i7 = i5;
            z3 = true;
        } else if (i8 < 0) {
            z3 = true;
            i7 = 0;
        } else {
            i7 = i8;
            z3 = false;
        }
        if (z3 && !this.f1145y.f(1)) {
            this.f1125d.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final void q(int i2) {
        boolean z2;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.f1124c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        r(i2, i3, i4);
    }

    public final boolean r(int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        if (i6 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top2 = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top2 < i8) {
                if (i7 >= top2 || bottom >= i8) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (view == null) {
                    view = view2;
                    z6 = z4;
                } else {
                    if ((!z2 || top2 >= view.getTop()) && (z2 || bottom <= view.getBottom())) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z6 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i7 < scrollY || i8 > i9) {
            if (z2) {
                i5 = i7 - scrollY;
            } else {
                i5 = i8 - i9;
            }
            s(i5, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i6);
        }
        return z3;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1128h) {
            Rect rect = this.f1124c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        } else {
            this.f1130j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z3;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        if (h2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
                return z3;
            }
            u(0, h2, false);
        }
        return z3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1132l) != null) {
            velocityTracker.recycle();
            this.f1132l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        this.f1128h = true;
        super.requestLayout();
    }

    public final int s(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        int i7 = i3;
        int i8 = i4;
        C0020l lVar = this.f1145y;
        if (i8 == 1) {
            lVar.g(2, i8);
        }
        boolean c2 = this.f1145y.c(0, i2, this.f1140t, this.f1139s, i8);
        int[] iArr = this.f1140t;
        int[] iArr2 = this.f1139s;
        if (c2) {
            i6 = i2 - iArr[1];
            i5 = iArr2[1];
        } else {
            i6 = i2;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!p(i6, 0, scrollY, scrollRange) || lVar.f(i8)) {
            z4 = false;
        } else {
            z4 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i9 = scrollRange;
        int i10 = i9;
        int i11 = i4;
        this.f1145y.d(0, scrollY2, 0, i6 - scrollY2, this.f1139s, i11, iArr);
        int i12 = i11;
        int i13 = i5 + iArr2[1];
        int i14 = i6 - iArr[1];
        int i15 = scrollY + i14;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.f1126e;
        if (i15 < 0) {
            if (z3) {
                A.i.f0(edgeEffect2, ((float) (-i14)) / ((float) getHeight()), ((float) i7) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > i10 && z3) {
            A.i.f0(edgeEffect, ((float) i14) / ((float) getHeight()), 1.0f - (((float) i7) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z5 = false;
        } else {
            z5 = z4;
        }
        if (z5 && i12 == 0 && (velocityTracker = this.f1132l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i13;
    }

    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 != getScrollX() || i3 != getScrollY()) {
                super.scrollTo(i2, i3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1133m) {
            this.f1133m = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        C0020l lVar = this.f1145y;
        if (lVar.f443d) {
            WeakHashMap weakHashMap = O.f393a;
            D.z(lVar.f442c);
        }
        lVar.f443d = z2;
    }

    public void setOnScrollChangeListener(j jVar) {
        this.f1121A = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1134n = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i2) {
        return this.f1145y.g(i2, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float J2 = A.i.J(edgeEffect) * ((float) getHeight());
        float f2 = this.f1123a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i2)) * 0.35f) / f2));
        double d2 = (double) f1119C;
        if (((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < J2) {
            return true;
        }
        return false;
    }

    public final void u(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1125d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z2) {
                    this.f1145y.g(2, 1);
                } else {
                    w(1);
                }
                this.f1142v = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.f1125d.isFinished()) {
                    this.f1125d.abortAnimation();
                    w(1);
                }
                scrollBy(i2, i3);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1126e;
        if (A.i.J(edgeEffect) != 0.0f) {
            A.i.f0(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (A.i.J(edgeEffect2) == 0.0f) {
            return z2;
        }
        A.i.f0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i2) {
        this.f1145y.h(i2);
    }

    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}

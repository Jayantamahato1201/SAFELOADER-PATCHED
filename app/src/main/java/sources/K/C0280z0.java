package k;

import H0.E;
import O.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.cheatbox.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: k.z0  reason: case insensitive filesystem */
public class C0280z0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3602a = new Rect();
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3603c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3604d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f3605e = 0;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public C0276x0 f3606g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3607h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3608i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3609j;

    /* renamed from: k  reason: collision with root package name */
    public g f3610k;

    /* renamed from: l  reason: collision with root package name */
    public E f3611l;

    public C0280z0(Context context, boolean z2) {
        super(context, (AttributeSet) null, R.attr.MT_Bin);
        this.f3608i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i3) {
        int i4;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            if (i8 > 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i4);
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return i3;
            }
        }
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0016
        L_0x0012:
            r0 = 1
        L_0x0013:
            r4 = 0
            goto L_0x0144
        L_0x0016:
            r0 = 0
            goto L_0x0013
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r6 = r18.findPointerIndex(r19)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0016
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            goto L_0x0144
        L_0x0035:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f3609j = r4
            k.C0270u0.a(r1, r7, r6)
            boolean r0 = r1.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r4)
        L_0x004f:
            r1.layoutChildren()
            int r0 = r1.f
            if (r0 == r9) goto L_0x006c
            int r11 = r1.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r5)
        L_0x006c:
            r1.f = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            k.C0270u0.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r4)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r1.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = 1
            goto L_0x0093
        L_0x0092:
            r12 = 0
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r5, r5)
        L_0x0098:
            int r0 = r10.getLeft()
            int r13 = r10.getTop()
            int r14 = r10.getRight()
            int r15 = r10.getBottom()
            r16 = 1
            android.graphics.Rect r4 = r1.f3602a
            r4.set(r0, r13, r14, r15)
            int r0 = r4.left
            int r13 = r1.b
            int r0 = r0 - r13
            r4.left = r0
            int r0 = r4.top
            int r13 = r1.f3603c
            int r0 = r0 - r13
            r4.top = r0
            int r0 = r4.right
            int r13 = r1.f3604d
            int r0 = r0 + r13
            r4.right = r0
            int r0 = r4.bottom
            int r13 = r1.f3605e
            int r0 = r0 + r13
            r4.bottom = r0
            boolean r0 = E.b.a()
            if (r0 == 0) goto L_0x00d6
            boolean r0 = k.C0274w0.a(r1)
            goto L_0x00e4
        L_0x00d6:
            java.lang.reflect.Field r0 = k.C0278y0.f3598a
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00df }
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x010b
            r0 = r0 ^ 1
            boolean r13 = E.b.a()
            if (r13 == 0) goto L_0x00f6
            k.C0274w0.b(r1, r0)
            goto L_0x0106
        L_0x00f6:
            java.lang.reflect.Field r13 = k.C0278y0.f3598a
            if (r13 == 0) goto L_0x0106
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0102 }
            r13.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0106:
            if (r8 == r9) goto L_0x010b
            r1.refreshDrawableState()
        L_0x010b:
            if (r12 == 0) goto L_0x0124
            float r0 = r4.exactCenterX()
            float r4 = r4.exactCenterY()
            int r12 = r1.getVisibility()
            if (r12 != 0) goto L_0x011d
            r12 = 1
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            r11.setVisible(r12, r5)
            B.a.e(r11, r0, r4)
        L_0x0124:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L_0x012f
            if (r8 == r9) goto L_0x012f
            B.a.e(r0, r7, r6)
        L_0x012f:
            k.x0 r0 = r1.f3606g
            if (r0 == 0) goto L_0x0135
            r0.b = r5
        L_0x0135:
            r1.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0012
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
            goto L_0x0012
        L_0x0144:
            if (r0 == 0) goto L_0x0148
            if (r4 == 0) goto L_0x0160
        L_0x0148:
            r1.f3609j = r5
            r1.setPressed(r5)
            r1.drawableStateChanged()
            int r3 = r1.f
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0160
            r3.setPressed(r5)
        L_0x0160:
            if (r0 == 0) goto L_0x0178
            O.g r3 = r1.f3610k
            if (r3 != 0) goto L_0x016d
            O.g r3 = new O.g
            r3.<init>(r1)
            r1.f3610k = r3
        L_0x016d:
            O.g r3 = r1.f3610k
            boolean r4 = r3.f630p
            r4 = 1
            r3.f630p = r4
            r3.onTouch(r1, r2)
            goto L_0x0185
        L_0x0178:
            O.g r2 = r1.f3610k
            if (r2 == 0) goto L_0x0185
            boolean r3 = r2.f630p
            if (r3 == 0) goto L_0x0183
            r2.d()
        L_0x0183:
            r2.f630p = r5
        L_0x0185:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0280z0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3602a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f3611l == null) {
            super.drawableStateChanged();
            C0276x0 x0Var = this.f3606g;
            if (x0Var != null) {
                x0Var.b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f3609j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f3608i || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f3608i || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f3608i || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f3608i || !this.f3607h) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.f3611l = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3611l == null) {
            E e2 = new E(14, this);
            this.f3611l = e2;
            post(e2);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !C0272v0.f3576d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            C0272v0.f3574a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            C0272v0.b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            C0272v0.f3575c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3609j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        E e2 = this.f3611l;
        if (e2 != null) {
            C0280z0 z0Var = (C0280z0) e2.f275g;
            z0Var.f3611l = null;
            z0Var.removeCallbacks(e2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f3607h = z2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, k.x0, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        C0276x0 x0Var = null;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f3594a;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.f3594a = drawable;
            drawable.setCallback(drawable2);
            drawable2.b = true;
            x0Var = drawable2;
        }
        this.f3606g = x0Var;
        super.setSelector(x0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.f3603c = rect.top;
        this.f3604d = rect.right;
        this.f3605e = rect.bottom;
    }
}

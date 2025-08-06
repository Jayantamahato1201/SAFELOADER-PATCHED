package androidx.appcompat.widget;

import I.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.cheatbox.R;
import java.util.WeakHashMap;
import k.D0;
import k.E0;

public class AlertDialogLayout extends E0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int l(View view) {
        WeakHashMap weakHashMap = O.f393a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r11 = 1
            int r0 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r5
            r5 = 16
            if (r4 == r5) goto L_0x003a
            r5 = 80
            if (r4 == r5) goto L_0x0031
            int r13 = r10.getPaddingTop()
            goto L_0x0044
        L_0x0031:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L_0x0044
        L_0x003a:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r15 + r4
        L_0x0044:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r1 = 0
            if (r15 != 0) goto L_0x004d
            r15 = 0
            goto L_0x0051
        L_0x004d:
            int r15 = r15.getIntrinsicHeight()
        L_0x0051:
            if (r1 >= r2) goto L_0x00b1
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto L_0x00af
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x00af
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            k.D0 r7 = (k.D0) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L_0x0074
            r8 = r3
        L_0x0074:
            java.util.WeakHashMap r9 = I.O.f393a
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r11) goto L_0x008f
            r9 = 5
            if (r8 == r9) goto L_0x0089
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L_0x009a
        L_0x0089:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L_0x008d:
            int r8 = r8 - r9
            goto L_0x009a
        L_0x008f:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L_0x008d
        L_0x009a:
            boolean r9 = r10.k(r1)
            if (r9 == 0) goto L_0x00a1
            int r13 = r13 + r15
        L_0x00a1:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r13 + r6
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r6 = r6 + r13
            r13 = r6
        L_0x00af:
            int r1 = r1 + r11
            goto L_0x0051
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AlertDialogLayout alertDialogLayout = this;
        int i9 = i2;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = alertDialogLayout.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.MT_Bin) {
                    view = childAt;
                } else if (id == R.id.MT_Bin) {
                    view2 = childAt;
                } else if ((id == R.id.MT_Bin || id == R.id.MT_Bin) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i2, i3);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i9);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i9, 0);
            paddingBottom += view.getMeasuredHeight();
            i4 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i4 = 0;
        }
        if (view2 != null) {
            view2.measure(i9, 0);
            i6 = l(view2);
            i5 = view2.getMeasuredHeight() - i6;
            paddingBottom += i6;
            i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i8 = 0;
            } else {
                i8 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i9, i8);
            i7 = view3.getMeasuredHeight();
            paddingBottom += i7;
            i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
        } else {
            i7 = 0;
        }
        int i11 = size - paddingBottom;
        if (view2 != null) {
            int i12 = paddingBottom - i6;
            int min = Math.min(i11, i5);
            if (min > 0) {
                i11 -= min;
                i6 += min;
            }
            view2.measure(i9, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            paddingBottom = i12 + view2.getMeasuredHeight();
            i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i9, View.MeasureSpec.makeMeasureSpec(i7 + i11, mode));
            paddingBottom = (paddingBottom - i7) + view3.getMeasuredHeight();
            i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = alertDialogLayout.getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        int i15 = i3;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i13, i9, i4), View.resolveSizeAndState(paddingBottom, i15, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i16 = 0;
            while (i16 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    D0 d02 = (D0) childAt3.getLayoutParams();
                    if (d02.width == -1) {
                        int i17 = d02.height;
                        d02.height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i15, 0);
                        d02.height = i17;
                    }
                }
                i16++;
                alertDialogLayout = this;
                i15 = i3;
            }
        }
    }
}

package androidx.appcompat.widget;

import A.j;
import E0.e;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.C0192B;
import j.C0208l;
import j.C0209m;
import j.C0211o;
import j.z;
import k.C0240f;
import k.C0246i;
import k.C0248j;
import k.C0250k;
import k.C0252l;
import k.C0254m;
import k.D0;
import k.D1;
import k.E0;
import k.p1;

public class ActionMenuView extends E0 implements C0208l, C0192B {

    /* renamed from: p  reason: collision with root package name */
    public C0209m f963p;

    /* renamed from: q  reason: collision with root package name */
    public Context f964q;

    /* renamed from: r  reason: collision with root package name */
    public int f965r = 0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f966s;

    /* renamed from: t  reason: collision with root package name */
    public C0248j f967t;

    /* renamed from: u  reason: collision with root package name */
    public p1 f968u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f969v;

    /* renamed from: w  reason: collision with root package name */
    public int f970w;

    /* renamed from: x  reason: collision with root package name */
    public final int f971x;

    /* renamed from: y  reason: collision with root package name */
    public final int f972y;

    /* renamed from: z  reason: collision with root package name */
    public C0254m f973z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f971x = (int) (56.0f * f);
        this.f972y = (int) (f * 4.0f);
        this.f964q = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    public static C0252l l() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f3517a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k.C0252l m(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof k.C0252l
            if (r0 == 0) goto L_0x0012
            k.l r0 = new k.l
            k.l r1 = (k.C0252l) r1
            r0.<init>(r1)
            boolean r1 = r1.f3517a
            r0.f3517a = r1
            goto L_0x0017
        L_0x0012:
            k.l r0 = new k.l
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            k.l r1 = l()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m(android.view.ViewGroup$LayoutParams):k.l");
    }

    public final void a(C0209m mVar) {
        this.f963p = mVar;
    }

    public final boolean b(C0211o oVar) {
        return this.f963p.q(oVar, (z) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0252l;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f963p == null) {
            Context context = getContext();
            C0209m mVar = new C0209m(context);
            this.f963p = mVar;
            mVar.f3107e = new j(29, (Object) this);
            C0248j jVar = new C0248j(context);
            this.f967t = jVar;
            jVar.f3484l = true;
            jVar.f3485m = true;
            jVar.f3478e = new e(28);
            this.f963p.b(jVar, this.f964q);
            C0248j jVar2 = this.f967t;
            jVar2.f3480h = this;
            this.f963p = jVar2.f3476c;
        }
        return this.f963p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0248j jVar = this.f967t;
        C0246i iVar = jVar.f3481i;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f3483k) {
            return jVar.f3482j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f965r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ D0 h() {
        return l();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.D0] */
    public final D0 i(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ D0 j(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof C0250k)) {
            z2 = ((C0250k) childAt).a();
        }
        if (i2 <= 0 || !(childAt2 instanceof C0250k)) {
            return z2;
        }
        return ((C0250k) childAt2).b() | z2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0248j jVar = this.f967t;
        if (jVar != null) {
            jVar.g();
            if (this.f967t.j()) {
                this.f967t.f();
                this.f967t.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248j jVar = this.f967t;
        if (jVar != null) {
            jVar.f();
            C0240f fVar = jVar.f3492t;
            if (fVar != null && fVar.b()) {
                fVar.f3170i.dismiss();
            }
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (!this.f969v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i4 - i2;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = D1.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0252l lVar = (C0252l) childAt.getLayoutParams();
                if (lVar.f3517a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + lVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - lVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i14, i8, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + lVar.leftMargin) + lVar.rightMargin;
                    n(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = paddingRight / i17;
        } else {
            i6 = 0;
        }
        int max = Math.max(0, i6);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C0252l lVar2 = (C0252l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f3517a) {
                    int i19 = width - lVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + lVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C0252l lVar3 = (C0252l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f3517a) {
                int i22 = paddingLeft + lVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + lVar3.rightMargin + max + i22;
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i10;
        boolean z8;
        C0209m mVar;
        boolean z9 = this.f969v;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f969v = z2;
        if (z9 != z2) {
            this.f970w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.f969v || (mVar = this.f963p) == null || size == this.f970w)) {
            this.f970w = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f969v || childCount <= 0) {
            int i11 = i3;
            for (int i12 = 0; i12 < childCount; i12++) {
                C0252l lVar = (C0252l) getChildAt(i12).getLayoutParams();
                lVar.rightMargin = 0;
                lVar.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f971x;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        int i22 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f972y;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i17;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i19++;
                if (z11) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0252l lVar2 = (C0252l) childAt.getLayoutParams();
                lVar2.f = false;
                lVar2.f3518c = 0;
                lVar2.b = 0;
                lVar2.f3519d = false;
                lVar2.leftMargin = 0;
                lVar2.rightMargin = 0;
                if (!z11 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                lVar2.f3520e = z6;
                if (lVar2.f3517a) {
                    i9 = 1;
                } else {
                    i9 = i15;
                }
                boolean z12 = z11;
                C0252l lVar3 = (C0252l) childAt.getLayoutParams();
                int i25 = i15;
                i8 = i17;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i24, View.MeasureSpec.getMode(childMeasureSpec));
                if (z12) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                boolean z13 = z7;
                if (i9 <= 0 || (z7 && i9 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i9, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i10++;
                    }
                    if (z13 && i10 < 2) {
                        i10 = 2;
                    }
                }
                if (lVar3.f3517a || !z13) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                lVar3.f3519d = z8;
                lVar3.b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), makeMeasureSpec);
                i20 = Math.max(i20, i10);
                if (lVar2.f3519d) {
                    i22++;
                }
                if (lVar2.f3517a) {
                    z10 = true;
                }
                i15 = i25 - i10;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= (long) (1 << i21);
                }
            }
            i21++;
            size3 = i23;
            paddingBottom = i24;
            i17 = i8;
        }
        int i26 = size3;
        int i27 = i15;
        int i28 = i17;
        if (!z10 || i19 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i29 = i27;
        boolean z14 = false;
        while (true) {
            if (i22 <= 0 || i29 <= 0) {
                i5 = i18;
            } else {
                int i30 = Integer.MAX_VALUE;
                long j3 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i32 < childCount2) {
                    boolean z15 = z3;
                    C0252l lVar4 = (C0252l) getChildAt(i32).getLayoutParams();
                    int i33 = i18;
                    if (lVar4.f3519d) {
                        int i34 = lVar4.b;
                        if (i34 < i30) {
                            j3 = 1 << i32;
                            i30 = i34;
                            i31 = 1;
                        } else if (i34 == i30) {
                            j3 |= 1 << i32;
                            i31++;
                        }
                    }
                    i32++;
                    i18 = i33;
                    z3 = z15;
                }
                boolean z16 = z3;
                i5 = i18;
                j2 |= j3;
                if (i31 > i29) {
                    break;
                }
                int i35 = i30 + 1;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    C0252l lVar5 = (C0252l) childAt2.getLayoutParams();
                    boolean z17 = z10;
                    long j4 = (long) (1 << i36);
                    if ((j3 & j4) != 0) {
                        if (!z16 || !lVar5.f3520e) {
                            z5 = true;
                        } else {
                            z5 = true;
                            if (i29 == 1) {
                                childAt2.setPadding(i4 + i28, 0, i4, 0);
                            }
                        }
                        lVar5.b += z5 ? 1 : 0;
                        lVar5.f = z5;
                        i29--;
                    } else if (lVar5.b == i35) {
                        j2 |= j4;
                    }
                    i36++;
                    z10 = z17;
                }
                i18 = i5;
                z3 = z16;
                z14 = true;
            }
        }
        i5 = i18;
        if (z10 || i19 != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i29 > 0 && j2 != 0 && (i29 < i19 - 1 || z4 || i20 > 1)) {
            float bitCount = (float) Long.bitCount(j2);
            if (!z4) {
                if ((j2 & 1) != 0 && !((C0252l) getChildAt(0).getLayoutParams()).f3520e) {
                    bitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j2 & ((long) (1 << i37))) != 0 && !((C0252l) getChildAt(i37).getLayoutParams()).f3520e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i7 = (int) (((float) (i29 * i28)) / bitCount);
            } else {
                i7 = 0;
            }
            boolean z18 = z14;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j2 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C0252l lVar6 = (C0252l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f3518c = i7;
                        lVar6.f = true;
                        if (i38 == 0 && !lVar6.f3520e) {
                            lVar6.leftMargin = (-i7) / 2;
                        }
                        z18 = true;
                    } else if (lVar6.f3517a) {
                        lVar6.f3518c = i7;
                        lVar6.f = true;
                        lVar6.rightMargin = (-i7) / 2;
                        z18 = true;
                    } else {
                        if (i38 != 0) {
                            lVar6.leftMargin = i7 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            lVar6.rightMargin = i7 / 2;
                        }
                    }
                }
            }
            z14 = z18;
        }
        if (z14) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C0252l lVar7 = (C0252l) childAt4.getLayoutParams();
                if (lVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.b * i28) + lVar7.f3518c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i5;
        } else {
            i6 = i26;
        }
        setMeasuredDimension(i13, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f967t.f3489q = z2;
    }

    public void setOnMenuItemClickListener(C0254m mVar) {
        this.f973z = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0248j jVar = this.f967t;
        C0246i iVar = jVar.f3481i;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
            return;
        }
        jVar.f3483k = true;
        jVar.f3482j = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.f966s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f965r != i2) {
            this.f965r = i2;
            if (i2 == 0) {
                this.f964q = getContext();
            } else {
                this.f964q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0248j jVar) {
        this.f967t = jVar;
        jVar.f3480h = this;
        this.f963p = jVar.f3476c;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}

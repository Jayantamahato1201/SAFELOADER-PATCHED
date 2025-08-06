package androidx.appcompat.widget;

import F.c;
import H0.E;
import I.O;
import N.g;
import Q.b;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.cheatbox.R;
import com.google.android.material.datepicker.k;
import d.a;
import i.C0184i;
import j.C0209m;
import j.C0211o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0245h0;
import k.C0248j;
import k.C0266s0;
import k.C0275x;
import k.C0279z;
import k.D1;
import k.W0;
import k.o1;
import k.p1;
import k.r1;
import k.s1;
import k.t1;
import k.u1;
import k.v1;
import k.w1;

public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f1025A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1026B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f1027C;
    public final ArrayList D;

    /* renamed from: E  reason: collision with root package name */
    public final ArrayList f1028E;

    /* renamed from: F  reason: collision with root package name */
    public final int[] f1029F;

    /* renamed from: G  reason: collision with root package name */
    public final c f1030G;

    /* renamed from: H  reason: collision with root package name */
    public ArrayList f1031H;

    /* renamed from: I  reason: collision with root package name */
    public final p1 f1032I;

    /* renamed from: J  reason: collision with root package name */
    public w1 f1033J;

    /* renamed from: K  reason: collision with root package name */
    public C0248j f1034K;

    /* renamed from: L  reason: collision with root package name */
    public r1 f1035L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f1036M;

    /* renamed from: N  reason: collision with root package name */
    public OnBackInvokedCallback f1037N;

    /* renamed from: O  reason: collision with root package name */
    public OnBackInvokedDispatcher f1038O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f1039P;

    /* renamed from: Q  reason: collision with root package name */
    public final E f1040Q;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f1041a;
    public C0245h0 b;

    /* renamed from: c  reason: collision with root package name */
    public C0245h0 f1042c;

    /* renamed from: d  reason: collision with root package name */
    public C0275x f1043d;

    /* renamed from: e  reason: collision with root package name */
    public C0279z f1044e;
    public final Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f1045g;

    /* renamed from: h  reason: collision with root package name */
    public C0275x f1046h;

    /* renamed from: i  reason: collision with root package name */
    public View f1047i;

    /* renamed from: j  reason: collision with root package name */
    public Context f1048j;

    /* renamed from: k  reason: collision with root package name */
    public int f1049k;

    /* renamed from: l  reason: collision with root package name */
    public int f1050l;

    /* renamed from: m  reason: collision with root package name */
    public int f1051m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1052n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1053o;

    /* renamed from: p  reason: collision with root package name */
    public int f1054p;

    /* renamed from: q  reason: collision with root package name */
    public int f1055q;

    /* renamed from: r  reason: collision with root package name */
    public int f1056r;

    /* renamed from: s  reason: collision with root package name */
    public int f1057s;

    /* renamed from: t  reason: collision with root package name */
    public W0 f1058t;

    /* renamed from: u  reason: collision with root package name */
    public int f1059u;

    /* renamed from: v  reason: collision with root package name */
    public int f1060v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1061w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1062x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f1063y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f1064z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0184i(getContext());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.s1, android.view.ViewGroup$MarginLayoutParams] */
    public static s1 h() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.f3563a = 8388627;
        return marginLayoutParams;
    }

    public static s1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof s1;
        if (z2) {
            s1 s1Var = (s1) layoutParams;
            s1 s1Var2 = new s1(s1Var);
            s1Var2.b = 0;
            s1Var2.b = s1Var.b;
            return s1Var2;
        } else if (z2) {
            s1 s1Var3 = new s1((s1) layoutParams);
            s1Var3.b = 0;
            return s1Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            s1 s1Var4 = new s1((ViewGroup.LayoutParams) marginLayoutParams);
            s1Var4.b = 0;
            s1Var4.leftMargin = marginLayoutParams.leftMargin;
            s1Var4.topMargin = marginLayoutParams.topMargin;
            s1Var4.rightMargin = marginLayoutParams.rightMargin;
            s1Var4.bottomMargin = marginLayoutParams.bottomMargin;
            return s1Var4;
        } else {
            s1 s1Var5 = new s1(layoutParams);
            s1Var5.b = 0;
            return s1Var5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        boolean z2;
        WeakHashMap weakHashMap = O.f393a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                s1 s1Var = (s1) childAt.getLayoutParams();
                if (s1Var.b == 0 && t(childAt)) {
                    int i4 = s1Var.f3563a;
                    WeakHashMap weakHashMap2 = O.f393a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            s1 s1Var2 = (s1) childAt2.getLayoutParams();
            if (s1Var2.b == 0 && t(childAt2)) {
                int i6 = s1Var2.f3563a;
                WeakHashMap weakHashMap3 = O.f393a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        s1 s1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            s1Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            s1Var = i(layoutParams);
        } else {
            s1Var = (s1) layoutParams;
        }
        s1Var.b = 1;
        if (!z2 || this.f1047i == null) {
            addView(view, s1Var);
            return;
        }
        view.setLayoutParams(s1Var);
        this.f1028E.add(view);
    }

    public final void c() {
        if (this.f1046h == null) {
            C0275x xVar = new C0275x(getContext(), (AttributeSet) null, R.attr.MT_Bin);
            this.f1046h = xVar;
            xVar.setImageDrawable(this.f);
            this.f1046h.setContentDescription(this.f1045g);
            s1 h2 = h();
            h2.f3563a = (this.f1052n & 112) | 8388611;
            h2.b = 2;
            this.f1046h.setLayoutParams(h2);
            this.f1046h.setOnClickListener(new k(3, this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof s1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, k.W0] */
    public final void d() {
        if (this.f1058t == null) {
            ? obj = new Object();
            obj.f3428a = 0;
            obj.b = 0;
            obj.f3429c = Integer.MIN_VALUE;
            obj.f3430d = Integer.MIN_VALUE;
            obj.f3431e = 0;
            obj.f = 0;
            obj.f3432g = false;
            obj.f3433h = false;
            this.f1058t = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1041a;
        if (actionMenuView.f963p == null) {
            C0209m mVar = (C0209m) actionMenuView.getMenu();
            if (this.f1035L == null) {
                this.f1035L = new r1(this);
            }
            this.f1041a.setExpandedActionViewsExclusive(true);
            mVar.b(this.f1035L, this.f1048j);
            u();
        }
    }

    public final void f() {
        if (this.f1041a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f1041a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1049k);
            this.f1041a.setOnMenuItemClickListener(this.f1032I);
            ActionMenuView actionMenuView2 = this.f1041a;
            p1 p1Var = new p1(this);
            actionMenuView2.getClass();
            actionMenuView2.f968u = p1Var;
            s1 h2 = h();
            h2.f3563a = (this.f1052n & 112) | 8388613;
            this.f1041a.setLayoutParams(h2);
            b(this.f1041a, false);
        }
    }

    public final void g() {
        if (this.f1043d == null) {
            this.f1043d = new C0275x(getContext(), (AttributeSet) null, R.attr.MT_Bin);
            s1 h2 = h();
            h2.f3563a = (this.f1052n & 112) | 8388611;
            this.f1043d.setLayoutParams(h2);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0275x xVar = this.f1046h;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0275x xVar = this.f1046h;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        W0 w02 = this.f1058t;
        if (w02 == null) {
            return 0;
        }
        if (w02.f3432g) {
            return w02.f3428a;
        }
        return w02.b;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1060v;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        W0 w02 = this.f1058t;
        if (w02 != null) {
            return w02.f3428a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        W0 w02 = this.f1058t;
        if (w02 != null) {
            return w02.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        W0 w02 = this.f1058t;
        if (w02 == null) {
            return 0;
        }
        if (w02.f3432g) {
            return w02.b;
        }
        return w02.f3428a;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1059u;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0209m mVar;
        ActionMenuView actionMenuView = this.f1041a;
        if (actionMenuView == null || (mVar = actionMenuView.f963p) == null || !mVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f1060v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = O.f393a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = O.f393a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1059u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0279z zVar = this.f1044e;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0279z zVar = this.f1044e;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1041a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1043d;
    }

    public CharSequence getNavigationContentDescription() {
        C0275x xVar = this.f1043d;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0275x xVar = this.f1043d;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public C0248j getOuterActionMenuPresenter() {
        return this.f1034K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1041a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1048j;
    }

    public int getPopupTheme() {
        return this.f1049k;
    }

    public CharSequence getSubtitle() {
        return this.f1063y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1042c;
    }

    public CharSequence getTitle() {
        return this.f1062x;
    }

    public int getTitleMarginBottom() {
        return this.f1057s;
    }

    public int getTitleMarginEnd() {
        return this.f1055q;
    }

    public int getTitleMarginStart() {
        return this.f1054p;
    }

    public int getTitleMarginTop() {
        return this.f1056r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, k.w1] */
    public C0266s0 getWrapper() {
        boolean z2;
        Drawable drawable;
        if (this.f1033J == null) {
            ? obj = new Object();
            obj.f3590n = 0;
            obj.f3579a = this;
            obj.f3584h = getTitle();
            obj.f3585i = getSubtitle();
            if (obj.f3584h != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj.f3583g = z2;
            obj.f = getNavigationIcon();
            String str = null;
            g E2 = g.E(getContext(), (AttributeSet) null, a.f2193a, R.attr.MT_Bin);
            obj.f3591o = E2.p(15);
            TypedArray typedArray = (TypedArray) E2.f606c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f3583g = true;
                obj.f3584h = text;
                if ((obj.b & 8) != 0) {
                    Toolbar toolbar = obj.f3579a;
                    toolbar.setTitle(text);
                    if (obj.f3583g) {
                        O.q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f3585i = text2;
                if ((obj.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable p2 = E2.p(20);
            if (p2 != null) {
                obj.f3582e = p2;
                obj.c();
            }
            Drawable p3 = E2.p(17);
            if (p3 != null) {
                obj.f3581d = p3;
                obj.c();
            }
            if (obj.f == null && (drawable = obj.f3591o) != null) {
                obj.f = drawable;
                int i2 = obj.b & 4;
                Toolbar toolbar2 = obj.f3579a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
                View view = obj.f3580c;
                if (!(view == null || (obj.b & 16) == 0)) {
                    removeView(view);
                }
                obj.f3580c = inflate;
                if (!(inflate == null || (obj.b & 16) == 0)) {
                    addView(inflate);
                }
                obj.a(obj.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1058t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1050l = resourceId2;
                C0245h0 h0Var = this.b;
                if (h0Var != null) {
                    h0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1051m = resourceId3;
                C0245h0 h0Var2 = this.f1042c;
                if (h0Var2 != null) {
                    h0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            E2.F();
            if (R.string.MT_Bin != obj.f3590n) {
                obj.f3590n = R.string.MT_Bin;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = obj.f3590n;
                    if (i3 != 0) {
                        str = getContext().getString(i3);
                    }
                    obj.f3586j = str;
                    obj.b();
                }
            }
            obj.f3586j = getNavigationContentDescription();
            setNavigationOnClickListener(new v1(obj));
            this.f1033J = obj;
        }
        return this.f1033J;
    }

    public final int j(View view, int i2) {
        int i3;
        s1 s1Var = (s1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int i4 = s1Var.f3563a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.f1061w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - s1Var.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = s1Var.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = s1Var.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public void m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.f1031H;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1030G.f194c).iterator();
        if (!it.hasNext()) {
            ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
            currentMenuItems2.removeAll(currentMenuItems);
            this.f1031H = currentMenuItems2;
            return;
        }
        throw A.g.e(it);
    }

    public final boolean o(View view) {
        if (view.getParent() == this || this.f1028E.contains(view)) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1040Q);
        u();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1027C = false;
        }
        if (!this.f1027C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1027C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1027C = false;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0295 A[LOOP:0: B:101:0x0293->B:102:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ad A[LOOP:1: B:104:0x02ab->B:105:0x02ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cc A[LOOP:2: B:107:0x02ca->B:108:0x02cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0320 A[LOOP:3: B:115:0x031e->B:116:0x0320, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            java.util.WeakHashMap r2 = I.O.f393a
            int r2 = r0.getLayoutDirection()
            r3 = 0
            if (r2 != r1) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1029F
            r11[r1] = r3
            r11[r3] = r3
            int r12 = r0.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            k.x r13 = r0.f1043d
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0050
            k.x r13 = r0.f1043d
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            k.x r13 = r0.f1043d
            int r13 = r0.p(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            k.x r15 = r0.f1046h
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x006b
            k.x r15 = r0.f1046h
            int r14 = r0.q(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            k.x r15 = r0.f1046h
            int r13 = r0.p(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1041a
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1041a
            int r13 = r0.p(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1041a
            int r14 = r0.q(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r20 = 1
            int r1 = r15 - r13
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            int r1 = r10 - r14
            int r1 = r16 - r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r20] = r1
            int r1 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1047i
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00bf
            android.view.View r13 = r0.f1047i
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.f1047i
            int r1 = r0.p(r13, r1, r12, r11)
        L_0x00c5:
            k.z r13 = r0.f1044e
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00dc
            if (r2 == 0) goto L_0x00d6
            k.z r13 = r0.f1044e
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            k.z r13 = r0.f1044e
            int r1 = r0.p(r13, r1, r12, r11)
        L_0x00dc:
            k.h0 r13 = r0.b
            boolean r13 = r0.t(r13)
            k.h0 r14 = r0.f1042c
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L_0x0101
            k.h0 r15 = r0.b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            k.s1 r15 = (k.s1) r15
            int r3 = r15.topMargin
            r22 = r1
            k.h0 r1 = r0.b
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r3
            int r3 = r15.bottomMargin
            int r1 = r1 + r3
            goto L_0x0104
        L_0x0101:
            r22 = r1
            r1 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011f
            k.h0 r3 = r0.f1042c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            k.s1 r3 = (k.s1) r3
            int r15 = r3.topMargin
            r23 = r1
            k.h0 r1 = r0.f1042c
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r3 = r3.bottomMargin
            int r1 = r1 + r3
            int r1 = r1 + r23
            goto L_0x0121
        L_0x011f:
            r23 = r1
        L_0x0121:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            r1 = r22
            goto L_0x0287
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            k.h0 r3 = r0.b
            goto L_0x0131
        L_0x012f:
            k.h0 r3 = r0.f1042c
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            k.h0 r15 = r0.f1042c
            goto L_0x0138
        L_0x0136:
            k.h0 r15 = r0.b
        L_0x0138:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            k.s1 r3 = (k.s1) r3
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            k.s1 r15 = (k.s1) r15
            r23 = r1
            if (r13 == 0) goto L_0x0150
            k.h0 r1 = r0.b
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            k.h0 r1 = r0.f1042c
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L_0x015d
        L_0x015a:
            r24 = 1
            goto L_0x015f
        L_0x015d:
            r24 = 0
        L_0x015f:
            int r1 = r0.f1061w
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r2
            r2 = 48
            if (r1 == r2) goto L_0x01a2
            r2 = 80
            if (r1 == r2) goto L_0x0198
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r23
            int r1 = r1 / 2
            int r2 = r3.topMargin
            r17 = r2
            int r2 = r0.f1056r
            int r2 = r17 + r2
            if (r1 >= r2) goto L_0x0180
            r1 = r2
            goto L_0x0196
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r23
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f1057s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0196:
            int r8 = r8 + r1
            goto L_0x01ad
        L_0x0198:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.f1057s
            int r5 = r5 - r1
            int r8 = r5 - r23
            goto L_0x01ad
        L_0x01a2:
            int r1 = r0.getPaddingTop()
            int r2 = r3.topMargin
            int r1 = r1 + r2
            int r2 = r0.f1056r
            int r8 = r1 + r2
        L_0x01ad:
            if (r16 == 0) goto L_0x021c
            if (r24 == 0) goto L_0x01b4
            int r1 = r0.f1054p
            goto L_0x01b5
        L_0x01b4:
            r1 = 0
        L_0x01b5:
            r2 = r11[r20]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r20] = r1
            if (r13 == 0) goto L_0x01eb
            k.h0 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.s1 r1 = (k.s1) r1
            k.h0 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            k.h0 r3 = r0.b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            k.h0 r5 = r0.b
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.f1055q
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ec
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            if (r14 == 0) goto L_0x0212
            k.h0 r1 = r0.f1042c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.s1 r1 = (k.s1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            k.h0 r1 = r0.f1042c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            k.h0 r3 = r0.f1042c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            k.h0 r5 = r0.f1042c
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.f1055q
            int r1 = r10 - r1
            goto L_0x0213
        L_0x0212:
            r1 = r10
        L_0x0213:
            if (r24 == 0) goto L_0x0126
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
            goto L_0x0126
        L_0x021c:
            if (r24 == 0) goto L_0x0222
            int r1 = r0.f1054p
        L_0x0220:
            r2 = 0
            goto L_0x0224
        L_0x0222:
            r1 = 0
            goto L_0x0220
        L_0x0224:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r22
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0259
            k.h0 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.s1 r1 = (k.s1) r1
            k.h0 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            k.h0 r5 = r0.b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            k.h0 r9 = r0.b
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.f1055q
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r14 == 0) goto L_0x027e
            k.h0 r1 = r0.f1042c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.s1 r1 = (k.s1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            k.h0 r1 = r0.f1042c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            k.h0 r5 = r0.f1042c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            k.h0 r9 = r0.f1042c
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.f1055q
            int r1 = r1 + r5
            goto L_0x027f
        L_0x027e:
            r1 = r3
        L_0x027f:
            if (r24 == 0) goto L_0x0286
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x0287
        L_0x0286:
            r1 = r3
        L_0x0287:
            java.util.ArrayList r2 = r0.D
            r3 = 3
            r0.a(r2, r3)
            int r3 = r2.size()
            r5 = r1
            r1 = 0
        L_0x0293:
            if (r1 >= r3) goto L_0x02a2
            java.lang.Object r8 = r2.get(r1)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.p(r8, r5, r12, r11)
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02a2:
            r1 = 5
            r0.a(r2, r1)
            int r1 = r2.size()
            r3 = 0
        L_0x02ab:
            if (r3 >= r1) goto L_0x02ba
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.q(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L_0x02ab
        L_0x02ba:
            r3 = 1
            r0.a(r2, r3)
            r1 = 0
            r8 = r11[r1]
            r1 = r11[r3]
            int r3 = r2.size()
            r13 = r8
            r8 = 0
            r9 = 0
        L_0x02ca:
            if (r8 >= r3) goto L_0x0305
            java.lang.Object r14 = r2.get(r8)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            k.s1 r15 = (k.s1) r15
            r22 = r1
            int r1 = r15.leftMargin
            int r1 = r1 - r13
            int r13 = r15.rightMargin
            int r13 = r13 - r22
            r15 = 0
            int r16 = java.lang.Math.max(r15, r1)
            int r17 = java.lang.Math.max(r15, r13)
            int r1 = -r1
            int r1 = java.lang.Math.max(r15, r1)
            int r13 = -r13
            int r13 = java.lang.Math.max(r15, r13)
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 + r16
            int r14 = r14 + r17
            int r9 = r9 + r14
            r14 = 1
            int r8 = r8 + r14
            r18 = r13
            r13 = r1
            r1 = r18
            goto L_0x02ca
        L_0x0305:
            r15 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r1 = r9 / 2
            int r4 = r4 - r1
            int r9 = r9 + r4
            if (r4 >= r5) goto L_0x0312
            goto L_0x0319
        L_0x0312:
            if (r9 <= r10) goto L_0x0318
            int r9 = r9 - r10
            int r5 = r4 - r9
            goto L_0x0319
        L_0x0318:
            r5 = r4
        L_0x0319:
            int r1 = r2.size()
            r3 = 0
        L_0x031e:
            if (r3 >= r1) goto L_0x032d
            java.lang.Object r4 = r2.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r5 = r0.p(r4, r5, r12, r11)
            r14 = 1
            int r3 = r3 + r14
            goto L_0x031e
        L_0x032d:
            r2.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a2 = D1.a(this);
        char c2 = !a2;
        int i12 = 0;
        if (t(this.f1043d)) {
            s(this.f1043d, i2, 0, i3, this.f1053o);
            i6 = k(this.f1043d) + this.f1043d.getMeasuredWidth();
            i5 = Math.max(0, l(this.f1043d) + this.f1043d.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f1043d.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (t(this.f1046h)) {
            s(this.f1046h, i2, 0, i3, this.f1053o);
            i6 = k(this.f1046h) + this.f1046h.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1046h) + this.f1046h.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1046h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        char c3 = a2;
        int[] iArr = this.f1029F;
        iArr[c3] = max2;
        if (t(this.f1041a)) {
            s(this.f1041a, i2, max, i3, this.f1053o);
            i7 = k(this.f1041a) + this.f1041a.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1041a) + this.f1041a.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1041a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (t(this.f1047i)) {
            max3 += r(this.f1047i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1047i) + this.f1047i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1047i.getMeasuredState());
        }
        if (t(this.f1044e)) {
            max3 += r(this.f1044e, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1044e) + this.f1044e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1044e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((s1) childAt.getLayoutParams()).b != 0 || !t(childAt)) {
                i8 = i8;
            } else {
                i8 += r(childAt, i2, i8, i3, 0, iArr);
                int max4 = Math.max(i5, l(childAt) + childAt.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
                i5 = max4;
            }
        }
        int i14 = i8;
        int i15 = this.f1056r + this.f1057s;
        int i16 = this.f1054p + this.f1055q;
        if (t(this.b)) {
            r(this.b, i2, i14 + i16, i3, i15, iArr);
            int k2 = k(this.b) + this.b.getMeasuredWidth();
            i10 = l(this.b) + this.b.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
            i11 = k2;
        } else {
            i9 = i4;
            i11 = 0;
            i10 = 0;
        }
        if (t(this.f1042c)) {
            i11 = Math.max(i11, r(this.f1042c, i2, i14 + i16, i3, i15 + i10, iArr));
            i10 += l(this.f1042c) + this.f1042c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f1042c.getMeasuredState());
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(i5, i10);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i14 + i11, getSuggestedMinimumWidth()), i2, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f1036M) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0209m mVar;
        MenuItem findItem;
        if (!(parcelable instanceof u1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u1 u1Var = (u1) parcelable;
        super.onRestoreInstanceState(u1Var.f);
        ActionMenuView actionMenuView = this.f1041a;
        if (actionMenuView != null) {
            mVar = actionMenuView.f963p;
        } else {
            mVar = null;
        }
        int i2 = u1Var.f3568h;
        if (!(i2 == 0 || this.f1035L == null || mVar == null || (findItem = mVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (u1Var.f3569i) {
            E e2 = this.f1040Q;
            removeCallbacks(e2);
            post(e2);
        }
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        W0 w02 = this.f1058t;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != w02.f3432g) {
            w02.f3432g = z2;
            if (!w02.f3433h) {
                w02.f3428a = w02.f3431e;
                w02.b = w02.f;
            } else if (z2) {
                int i3 = w02.f3430d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = w02.f3431e;
                }
                w02.f3428a = i3;
                int i4 = w02.f3429c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = w02.f;
                }
                w02.b = i4;
            } else {
                int i5 = w02.f3429c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = w02.f3431e;
                }
                w02.f3428a = i5;
                int i6 = w02.f3430d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = w02.f;
                }
                w02.b = i6;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, Q.b, k.u1] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        C0248j jVar;
        C0211o oVar;
        ? bVar = new b(super.onSaveInstanceState());
        r1 r1Var = this.f1035L;
        if (!(r1Var == null || (oVar = r1Var.b) == null)) {
            bVar.f3568h = oVar.f3131a;
        }
        ActionMenuView actionMenuView = this.f1041a;
        if (actionMenuView == null || (jVar = actionMenuView.f967t) == null || !jVar.j()) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.f3569i = z2;
        return bVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1026B = false;
        }
        if (!this.f1026B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1026B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1026B = false;
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        s1 s1Var = (s1) view.getLayoutParams();
        int i4 = s1Var.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + s1Var.rightMargin + max;
    }

    public final int q(View view, int i2, int i3, int[] iArr) {
        s1 s1Var = (s1) view.getLayoutParams();
        int i4 = s1Var.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + s1Var.leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1039P != z2) {
            this.f1039P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(l.v(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1036M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1060v) {
            this.f1060v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1059u) {
            this.f1059u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(l.v(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(l.v(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1043d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1041a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1049k != i2) {
            this.f1049k = i2;
            if (i2 == 0) {
                this.f1048j = getContext();
            } else {
                this.f1048j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1057s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1055q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1054p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1056r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x004f
            android.window.OnBackInvokedDispatcher r1 = k.q1.a(r4)
            k.r1 r2 = r4.f1035L
            if (r2 == 0) goto L_0x0023
            j.o r2 = r2.b
            if (r2 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap r2 = I.O.f393a
            boolean r2 = r4.isAttachedToWindow()
            if (r2 == 0) goto L_0x0023
            boolean r2 = r4.f1039P
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x0041
            android.window.OnBackInvokedDispatcher r3 = r4.f1038O
            if (r3 != 0) goto L_0x0041
            android.window.OnBackInvokedCallback r2 = r4.f1037N
            if (r2 != 0) goto L_0x0039
            k.o1 r2 = new k.o1
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = k.q1.b(r2)
            r4.f1037N = r0
        L_0x0039:
            android.window.OnBackInvokedCallback r0 = r4.f1037N
            k.q1.c(r1, r0)
            r4.f1038O = r1
            return
        L_0x0041:
            if (r2 != 0) goto L_0x004f
            android.window.OnBackInvokedDispatcher r0 = r4.f1038O
            if (r0 == 0) goto L_0x004f
            android.window.OnBackInvokedCallback r1 = r4.f1037N
            k.q1.d(r0, r1)
            r0 = 0
            r4.f1038O = r0
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.u():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.MT_Bin);
        this.f1061w = 8388627;
        this.D = new ArrayList();
        this.f1028E = new ArrayList();
        this.f1029F = new int[2];
        this.f1030G = new c((Runnable) new o1(this, 1));
        this.f1031H = new ArrayList();
        this.f1032I = new p1(this);
        this.f1040Q = new E(15, this);
        Context context2 = getContext();
        int[] iArr = a.f2214x;
        g E2 = g.E(context2, attributeSet, iArr, R.attr.MT_Bin);
        O.o(this, context, iArr, attributeSet, (TypedArray) E2.f606c, R.attr.MT_Bin);
        TypedArray typedArray = (TypedArray) E2.f606c;
        this.f1050l = typedArray.getResourceId(28, 0);
        this.f1051m = typedArray.getResourceId(19, 0);
        this.f1061w = typedArray.getInteger(0, 8388627);
        this.f1052n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1057s = dimensionPixelOffset;
        this.f1056r = dimensionPixelOffset;
        this.f1055q = dimensionPixelOffset;
        this.f1054p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1054p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1055q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1056r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1057s = dimensionPixelOffset5;
        }
        this.f1053o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        W0 w02 = this.f1058t;
        w02.f3433h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            w02.f3431e = dimensionPixelSize;
            w02.f3428a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            w02.f = dimensionPixelSize2;
            w02.b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            w02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1059u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1060v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = E2.p(4);
        this.f1045g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1048j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable p2 = E2.p(16);
        if (p2 != null) {
            setNavigationIcon(p2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable p3 = E2.p(11);
        if (p3 != null) {
            setLogo(p3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(E2.o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(E2.o(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        E2.F();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.s1, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3563a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
        marginLayoutParams.f3563a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0275x xVar = this.f1046h;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1046h.setImageDrawable(drawable);
            return;
        }
        C0275x xVar = this.f1046h;
        if (xVar != null) {
            xVar.setImageDrawable(this.f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1044e == null) {
                this.f1044e = new C0279z(getContext(), (AttributeSet) null, 0);
            }
            if (!o(this.f1044e)) {
                b(this.f1044e, true);
            }
        } else {
            C0279z zVar = this.f1044e;
            if (zVar != null && o(zVar)) {
                removeView(this.f1044e);
                this.f1028E.remove(this.f1044e);
            }
        }
        C0279z zVar2 = this.f1044e;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1044e == null) {
            this.f1044e = new C0279z(getContext(), (AttributeSet) null, 0);
        }
        C0279z zVar = this.f1044e;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0275x xVar = this.f1043d;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
            l.Z(this.f1043d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1043d)) {
                b(this.f1043d, true);
            }
        } else {
            C0275x xVar = this.f1043d;
            if (xVar != null && o(xVar)) {
                removeView(this.f1043d);
                this.f1028E.remove(this.f1043d);
            }
        }
        C0275x xVar2 = this.f1043d;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1042c == null) {
                Context context = getContext();
                C0245h0 h0Var = new C0245h0(context, (AttributeSet) null);
                this.f1042c = h0Var;
                h0Var.setSingleLine();
                this.f1042c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1051m;
                if (i2 != 0) {
                    this.f1042c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1025A;
                if (colorStateList != null) {
                    this.f1042c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1042c)) {
                b(this.f1042c, true);
            }
        } else {
            C0245h0 h0Var2 = this.f1042c;
            if (h0Var2 != null && o(h0Var2)) {
                removeView(this.f1042c);
                this.f1028E.remove(this.f1042c);
            }
        }
        C0245h0 h0Var3 = this.f1042c;
        if (h0Var3 != null) {
            h0Var3.setText(charSequence);
        }
        this.f1063y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1025A = colorStateList;
        C0245h0 h0Var = this.f1042c;
        if (h0Var != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                C0245h0 h0Var = new C0245h0(context, (AttributeSet) null);
                this.b = h0Var;
                h0Var.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1050l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1064z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!o(this.b)) {
                b(this.b, true);
            }
        } else {
            C0245h0 h0Var2 = this.b;
            if (h0Var2 != null && o(h0Var2)) {
                removeView(this.b);
                this.f1028E.remove(this.b);
            }
        }
        C0245h0 h0Var3 = this.b;
        if (h0Var3 != null) {
            h0Var3.setText(charSequence);
        }
        this.f1062x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1064z = colorStateList;
        C0245h0 h0Var = this.b;
        if (h0Var != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(t1 t1Var) {
    }
}

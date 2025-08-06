package androidx.appcompat.widget;

import I.O;
import I.V;
import Q0.l;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cheatbox.R;
import com.google.android.material.datepicker.k;
import d.a;
import i.C0176a;
import j.C0192B;
import j.C0209m;
import java.util.WeakHashMap;
import k.C0226a;
import k.C0240f;
import k.C0248j;
import k.D1;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0226a f919a = new C0226a(this);
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f920c;

    /* renamed from: d  reason: collision with root package name */
    public C0248j f921d;

    /* renamed from: e  reason: collision with root package name */
    public int f922e;
    public V f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f923g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f924h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f925i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f926j;

    /* renamed from: k  reason: collision with root package name */
    public View f927k;

    /* renamed from: l  reason: collision with root package name */
    public View f928l;

    /* renamed from: m  reason: collision with root package name */
    public View f929m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f930n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f931o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f932p;

    /* renamed from: q  reason: collision with root package name */
    public final int f933q;

    /* renamed from: r  reason: collision with root package name */
    public final int f934r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f935s;

    /* renamed from: t  reason: collision with root package name */
    public final int f936t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2195d, R.attr.MT_Bin, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = l.v(context, resourceId);
        }
        WeakHashMap weakHashMap = O.f393a;
        setBackground(drawable);
        this.f933q = obtainStyledAttributes.getResourceId(5, 0);
        this.f934r = obtainStyledAttributes.getResourceId(4, 0);
        this.f922e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f936t = obtainStyledAttributes.getResourceId(2, R.layout.MT_Bin);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(C0176a aVar) {
        View view = this.f927k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f936t, this, false);
            this.f927k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f927k);
        }
        View findViewById = this.f927k.findViewById(R.id.MT_Bin);
        this.f928l = findViewById;
        findViewById.setOnClickListener(new k(2, aVar));
        C0209m c2 = aVar.c();
        C0248j jVar = this.f921d;
        if (jVar != null) {
            jVar.f();
            C0240f fVar = jVar.f3492t;
            if (fVar != null && fVar.b()) {
                fVar.f3170i.dismiss();
            }
        }
        C0248j jVar2 = new C0248j(getContext());
        this.f921d = jVar2;
        jVar2.f3484l = true;
        jVar2.f3485m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.f921d, this.b);
        C0248j jVar3 = this.f921d;
        C0192B b2 = jVar3.f3480h;
        if (b2 == null) {
            C0192B b3 = (C0192B) jVar3.f3477d.inflate(jVar3.f, this, false);
            jVar3.f3480h = b3;
            b3.a(jVar3.f3476c);
            jVar3.g();
        }
        C0192B b4 = jVar3.f3480h;
        if (b2 != b4) {
            ((ActionMenuView) b4).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) b4;
        this.f920c = actionMenuView;
        WeakHashMap weakHashMap = O.f393a;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f920c, layoutParams);
    }

    public final void d() {
        int i2;
        if (this.f930n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Bin, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f930n = linearLayout;
            this.f931o = (TextView) linearLayout.findViewById(R.id.MT_Bin);
            this.f932p = (TextView) this.f930n.findViewById(R.id.MT_Bin);
            int i3 = this.f933q;
            if (i3 != 0) {
                this.f931o.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f934r;
            if (i4 != 0) {
                this.f932p.setTextAppearance(getContext(), i4);
            }
        }
        this.f931o.setText(this.f925i);
        this.f932p.setText(this.f926j);
        boolean isEmpty = TextUtils.isEmpty(this.f925i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f926j);
        TextView textView = this.f932p;
        int i5 = 8;
        if (!isEmpty2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.f930n;
        if (!isEmpty || !isEmpty2) {
            i5 = 0;
        }
        linearLayout2.setVisibility(i5);
        if (this.f930n.getParent() == null) {
            addView(this.f930n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f929m = null;
        this.f920c = null;
        this.f921d = null;
        View view = this.f928l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.f919a.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f922e;
    }

    public CharSequence getSubtitle() {
        return this.f926j;
    }

    public CharSequence getTitle() {
        return this.f925i;
    }

    /* renamed from: h */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            V v2 = this.f;
            if (v2 != null) {
                v2.b();
            }
            super.setVisibility(i2);
        }
    }

    public final V i(int i2, long j2) {
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
        C0226a aVar = this.f919a;
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            V a2 = O.a(this);
            a2.a(1.0f);
            a2.c(j2);
            aVar.f3440c.f = a2;
            aVar.b = i2;
            a2.d(aVar);
            return a2;
        }
        V a3 = O.a(this);
        a3.a(0.0f);
        a3.c(j2);
        aVar.f3440c.f = a3;
        aVar.b = i2;
        a3.d(aVar);
        return a3;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.f2193a, R.attr.MT_Bin, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0248j jVar = this.f921d;
        if (jVar != null) {
            Configuration configuration2 = jVar.b.getResources().getConfiguration();
            int i3 = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
                i2 = 5;
            } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
                i2 = 4;
            } else if (i3 >= 360) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            jVar.f3488p = i2;
            C0209m mVar = jVar.f3476c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248j jVar = this.f921d;
        if (jVar != null) {
            jVar.f();
            C0240f fVar = this.f921d.f3492t;
            if (fVar != null && fVar.b()) {
                fVar.f3170i.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f924h = false;
        }
        if (!this.f924h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f924h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f924h = false;
        return true;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a2 = D1.a(this);
        if (a2) {
            i6 = (i4 - i2) - getPaddingRight();
        } else {
            i6 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f927k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f927k.getLayoutParams();
            if (a2) {
                i8 = marginLayoutParams.rightMargin;
            } else {
                i8 = marginLayoutParams.leftMargin;
            }
            if (a2) {
                i9 = marginLayoutParams.leftMargin;
            } else {
                i9 = marginLayoutParams.rightMargin;
            }
            if (a2) {
                i10 = i6 - i8;
            } else {
                i10 = i6 + i8;
            }
            int g2 = g(this.f927k, i10, paddingTop, paddingTop2, a2) + i10;
            if (a2) {
                i11 = g2 - i9;
            } else {
                i11 = g2 + i9;
            }
            i6 = i11;
        }
        LinearLayout linearLayout = this.f930n;
        if (!(linearLayout == null || this.f929m != null || linearLayout.getVisibility() == 8)) {
            i6 += g(this.f930n, i6, paddingTop, paddingTop2, a2);
        }
        View view2 = this.f929m;
        if (view2 != null) {
            g(view2, i6, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            i7 = getPaddingLeft();
        } else {
            i7 = (i4 - i2) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f920c;
        if (actionMenuView != null) {
            g(actionMenuView, i7, paddingTop, paddingTop2, !a2);
        }
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i7 = this.f922e;
            if (i7 <= 0) {
                i7 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i8 = i7 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            View view = this.f927k;
            if (view != null) {
                int f2 = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f927k.getLayoutParams();
                paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f920c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.f920c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f930n;
            if (linearLayout != null && this.f929m == null) {
                if (this.f935s) {
                    this.f930n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f930n.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f930n;
                    if (z2) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout2.setVisibility(i5);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f929m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i9 = layoutParams.width;
                if (i9 != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    paddingLeft = Math.min(i9, paddingLeft);
                }
                int i10 = layoutParams.height;
                if (i10 == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (i10 >= 0) {
                    i8 = Math.min(i10, i8);
                }
                this.f929m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i8, i6));
            }
            if (this.f922e <= 0) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i11) {
                        i11 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i11);
                return;
            }
            setMeasuredDimension(size, i7);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f923g = false;
        }
        if (!this.f923g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f923g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f923g = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f922e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f929m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f929m = view;
        if (!(view == null || (linearLayout = this.f930n) == null)) {
            removeView(linearLayout);
            this.f930n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f926j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f925i = charSequence;
        d();
        O.q(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f935s) {
            requestLayout();
        }
        this.f935s = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

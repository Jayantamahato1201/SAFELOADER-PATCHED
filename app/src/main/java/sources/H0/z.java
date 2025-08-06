package H0;

import A.i;
import E0.g;
import J0.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.cheatbox.R;
import com.google.android.material.textfield.TextInputLayout;
import j0.C0219a;
import java.util.List;
import java.util.Locale;
import k.C0256n;
import k.L0;
import y0.l;

public final class z extends C0256n {

    /* renamed from: e  reason: collision with root package name */
    public final L0 f377e;
    public final AccessibilityManager f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f378g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final int f379h;

    /* renamed from: i  reason: collision with root package name */
    public final float f380i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f381j;

    /* renamed from: k  reason: collision with root package name */
    public int f382k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f383l;

    public z(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.MT_Bin, 0), attributeSet);
        Context context2 = getContext();
        TypedArray f2 = l.f(context2, attributeSet, C0219a.f3182i, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        if (f2.hasValue(0) && f2.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f379h = f2.getResourceId(3, R.layout.MT_Bin);
        this.f380i = (float) f2.getDimensionPixelOffset(1, R.dimen.MT_Bin);
        if (f2.hasValue(2)) {
            this.f381j = ColorStateList.valueOf(f2.getColor(2, 0));
        }
        this.f382k = f2.getColor(4, 0);
        this.f383l = i.H(context2, f2, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        L0 l02 = new L0(context2, (AttributeSet) null, R.attr.MT_Bin);
        this.f377e = l02;
        l02.f3392y = true;
        l02.f3393z.setFocusable(true);
        l02.f3382o = this;
        l02.f3393z.setInputMethodMode(2);
        l02.n(getAdapter());
        l02.f3383p = new x(0, this);
        if (f2.hasValue(6)) {
            setSimpleItems(f2.getResourceId(6, 0));
        }
        f2.recycle();
    }

    public static void a(z zVar, Object obj) {
        zVar.setText(zVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
            if (next.getSettingsActivityName() != null && next.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.f377e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f381j;
    }

    public CharSequence getHint() {
        TextInputLayout b = b();
        if (b == null || !b.f2088E) {
            return super.getHint();
        }
        return b.getHint();
    }

    public float getPopupElevation() {
        return this.f380i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f382k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f383l;
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.f2088E && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f377e.dismiss();
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i5 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                L0 l02 = this.f377e;
                if (!l02.f3393z.isShowing()) {
                    i4 = -1;
                } else {
                    i4 = l02.f3371c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i4) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = l02.f3393z.getBackground();
                if (background != null) {
                    Rect rect = this.f378g;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (!c()) {
            super.onWindowFocusChanged(z2);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f377e.n(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        L0 l02 = this.f377e;
        if (l02 != null) {
            l02.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f381j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).j(this.f381j);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f377e.f3384q = getOnItemSelectedListener();
    }

    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout b = b();
        if (b != null) {
            b.s();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f382k = i2;
        if (getAdapter() instanceof y) {
            ((y) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f383l = colorStateList;
        if (getAdapter() instanceof y) {
            ((y) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    public final void showDropDown() {
        if (c()) {
            this.f377e.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new y(this, getContext(), this.f379h, strArr));
    }
}

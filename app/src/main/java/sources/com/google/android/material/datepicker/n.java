package com.google.android.material.datepicker;

import A.a;
import A.i;
import E0.e;
import E0.g;
import H0.C0000a;
import I.C0010b;
import I.D;
import I.O;
import I.X;
import I.u0;
import I.x0;
import Q0.l;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0055l;
import com.cheatbox.R;
import com.google.android.material.internal.CheckableImageButton;
import j0.C0219a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.C0486a;
import u0.C0488a;

public final class n<S> extends C0055l {

    /* renamed from: A0  reason: collision with root package name */
    public CharSequence f1981A0;

    /* renamed from: B0  reason: collision with root package name */
    public CharSequence f1982B0;
    public final LinkedHashSet e0 = new LinkedHashSet();

    /* renamed from: f0  reason: collision with root package name */
    public final LinkedHashSet f1983f0 = new LinkedHashSet();

    /* renamed from: g0  reason: collision with root package name */
    public int f1984g0;

    /* renamed from: h0  reason: collision with root package name */
    public u f1985h0;

    /* renamed from: i0  reason: collision with root package name */
    public b f1986i0;

    /* renamed from: j0  reason: collision with root package name */
    public l f1987j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1988k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f1989l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1990m0;
    public int n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1991o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f1992p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1993q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f1994r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1995s0;

    /* renamed from: t0  reason: collision with root package name */
    public CharSequence f1996t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1997u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f1998v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f1999w0;

    /* renamed from: x0  reason: collision with root package name */
    public CheckableImageButton f2000x0;

    /* renamed from: y0  reason: collision with root package name */
    public g f2001y0;
    public boolean z0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int C(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.MT_Bin);
        Calendar b = x.b();
        b.set(5, 1);
        Calendar a2 = x.a(b);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.MT_Bin) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.MT_Bin)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean D(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i.j0(context, R.attr.MT_Bin, l.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    public final Dialog A() {
        Context w2 = w();
        w();
        int i2 = this.f1984g0;
        if (i2 != 0) {
            Dialog dialog = new Dialog(w2, i2);
            Context context = dialog.getContext();
            this.f1990m0 = D(context, 16843277);
            this.f2001y0 = new g(context, (AttributeSet) null, R.attr.MT_Bin, R.style.MT_Bin);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0219a.f3185l, R.attr.MT_Bin, R.style.MT_Bin);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f2001y0.h(context);
            this.f2001y0.j(ColorStateList.valueOf(color));
            g gVar = this.f2001y0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = O.f393a;
            gVar.i(D.i(decorView));
            return dialog;
        }
        B();
        throw null;
    }

    public final void B() {
        if (this.f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public final void m(Bundle bundle) {
        super.m(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.f1984g0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f1986i0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f1988k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f1989l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.n0 = bundle.getInt("INPUT_MODE_KEY");
                this.f1991o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f1992p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f1993q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f1994r0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f1995s0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f1996t0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f1997u0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f1998v0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f1989l0;
                if (charSequence == null) {
                    charSequence = w().getResources().getText(this.f1988k0);
                }
                this.f1981A0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f1982B0 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public final View n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        String str;
        if (this.f1990m0) {
            i2 = R.layout.MT_Bin;
        } else {
            i2 = R.layout.MT_Bin;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup);
        Context context = inflate.getContext();
        if (this.f1990m0) {
            inflate.findViewById(R.id.MT_Bin).setLayoutParams(new LinearLayout.LayoutParams(C(context), -2));
        } else {
            inflate.findViewById(R.id.MT_Bin).setLayoutParams(new LinearLayout.LayoutParams(C(context), -1));
        }
        WeakHashMap weakHashMap = O.f393a;
        ((TextView) inflate.findViewById(R.id.MT_Bin)).setAccessibilityLiveRegion(1);
        this.f2000x0 = (CheckableImageButton) inflate.findViewById(R.id.MT_Bin);
        this.f1999w0 = (TextView) inflate.findViewById(R.id.MT_Bin);
        this.f2000x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2000x0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, l.v(context, R.drawable.MT_Bin));
        boolean z2 = false;
        stateListDrawable.addState(new int[0], l.v(context, R.drawable.MT_Bin));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f2000x0;
        if (this.n0 != 0) {
            z2 = true;
        }
        checkableImageButton2.setChecked(z2);
        O.p(this.f2000x0, (C0010b) null);
        CheckableImageButton checkableImageButton3 = this.f2000x0;
        if (this.n0 == 1) {
            str = checkableImageButton3.getContext().getString(R.string.MT_Bin);
        } else {
            str = checkableImageButton3.getContext().getString(R.string.MT_Bin);
        }
        this.f2000x0.setContentDescription(str);
        this.f2000x0.setOnClickListener(new C0000a(3, this));
        Button button = (Button) inflate.findViewById(R.id.MT_Bin);
        B();
        throw null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1983f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1346E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    public final void r(Bundle bundle) {
        p pVar;
        p pVar2;
        Bundle bundle2 = bundle;
        super.r(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.f1984g0);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        b bVar = this.f1986i0;
        ? obj = new Object();
        int i2 = a.b;
        int i3 = a.b;
        long j2 = bVar.f.f2008k;
        long j3 = bVar.f1948g.f2008k;
        obj.f1947a = Long.valueOf(bVar.f1950i.f2008k);
        l lVar = this.f1987j0;
        if (lVar == null) {
            pVar = null;
        } else {
            pVar = lVar.f1970U;
        }
        if (pVar != null) {
            obj.f1947a = Long.valueOf(pVar.f2008k);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1949h);
        p b = p.b(j2);
        p b2 = p.b(j3);
        d dVar = (d) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = obj.f1947a;
        if (l2 == null) {
            pVar2 = null;
        } else {
            pVar2 = p.b(l2.longValue());
        }
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b, b2, dVar, pVar2, bVar.f1951j));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.f1988k0);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.f1989l0);
        bundle2.putInt("INPUT_MODE_KEY", this.n0);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1991o0);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1992p0);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1993q0);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1994r0);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1995s0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1996t0);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1997u0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1998v0);
    }

    public final void s() {
        CharSequence charSequence;
        Integer num;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        x0 x0Var;
        x0 x0Var2;
        super.s();
        Dialog dialog = this.f1328a0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f1990m0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.f2001y0);
                if (!this.z0) {
                    View findViewById = x().findViewById(R.id.MT_Bin);
                    ColorStateList h2 = C0486a.h(findViewById.getBackground());
                    if (h2 != null) {
                        num = Integer.valueOf(h2.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    boolean z4 = false;
                    if (num == null || num.intValue() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int e2 = C0486a.e(window.getContext(), 16842801, -16777216);
                    if (z2) {
                        num = Integer.valueOf(e2);
                    }
                    if (i4 >= 30) {
                        X.a(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    Context context = window.getContext();
                    if (i4 < 23) {
                        i2 = a.d(C0486a.e(context, 16843857, -16777216), 128);
                    } else {
                        i2 = 0;
                    }
                    Context context2 = window.getContext();
                    if (i4 < 27) {
                        i3 = a.d(C0486a.e(context2, 16843858, -16777216), 128);
                    } else {
                        i3 = 0;
                    }
                    window.setStatusBarColor(i2);
                    window.setNavigationBarColor(i3);
                    boolean m2 = C0486a.m(num.intValue());
                    if (C0486a.m(i2) || (i2 == 0 && m2)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    e eVar = new e(window.getDecorView());
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30) {
                        x0 x0Var3 = new x0(window.getInsetsController(), eVar);
                        x0Var3.f472p = window;
                        x0Var = x0Var3;
                    } else if (i5 >= 26) {
                        x0Var = new u0(window, eVar);
                    } else if (i5 >= 23) {
                        x0Var = new u0(window, eVar);
                    } else {
                        x0Var = new u0(window, eVar);
                    }
                    x0Var.l0(z3);
                    boolean m3 = C0486a.m(e2);
                    if (C0486a.m(i3) || (i3 == 0 && m3)) {
                        z4 = true;
                    }
                    e eVar2 = new e(window.getDecorView());
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        x0 x0Var4 = new x0(window.getInsetsController(), eVar2);
                        x0Var4.f472p = window;
                        x0Var2 = x0Var4;
                    } else if (i6 >= 26) {
                        x0Var2 = new u0(window, eVar2);
                    } else if (i6 >= 23) {
                        x0Var2 = new u0(window, eVar2);
                    } else {
                        x0Var2 = new u0(window, eVar2);
                    }
                    x0Var2.k0(z4);
                    m mVar = new m(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = O.f393a;
                    D.u(findViewById, mVar);
                    this.z0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = w().getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable(this.f2001y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.f1328a0;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new C0488a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            w();
            int i7 = this.f1984g0;
            if (i7 != 0) {
                B();
                b bVar = this.f1986i0;
                l lVar = new l();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i7);
                bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f1950i);
                lVar.z(bundle);
                this.f1987j0 = lVar;
                u uVar = lVar;
                if (this.n0 == 1) {
                    B();
                    b bVar2 = this.f1986i0;
                    u oVar = new o();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i7);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                    oVar.z(bundle2);
                    uVar = oVar;
                }
                this.f1985h0 = uVar;
                TextView textView = this.f1999w0;
                if (this.n0 == 1 && w().getResources().getConfiguration().orientation == 2) {
                    charSequence = this.f1982B0;
                } else {
                    charSequence = this.f1981A0;
                }
                textView.setText(charSequence);
                B();
                throw null;
            }
            B();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void t() {
        this.f1985h0.f2020R.clear();
        super.t();
    }
}

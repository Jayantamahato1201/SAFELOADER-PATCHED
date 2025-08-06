package H0;

import A.g;
import A.i;
import C0.c;
import C0.d;
import I.O;
import J.b;
import Q0.l;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cheatbox.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0245h0;

public final class s extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f320a;
    public final FrameLayout b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f321c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f322d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f323e;
    public View.OnLongClickListener f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckableImageButton f324g;

    /* renamed from: h  reason: collision with root package name */
    public final r f325h;

    /* renamed from: i  reason: collision with root package name */
    public int f326i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet f327j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f328k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f329l;

    /* renamed from: m  reason: collision with root package name */
    public int f330m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView.ScaleType f331n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f332o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f333p;

    /* renamed from: q  reason: collision with root package name */
    public final C0245h0 f334q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f335r;

    /* renamed from: s  reason: collision with root package name */
    public EditText f336s;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f337t;

    /* renamed from: u  reason: collision with root package name */
    public l f338u;

    /* renamed from: v  reason: collision with root package name */
    public final o f339v = new o(this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(com.google.android.material.textfield.TextInputLayout r18, N.g r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.content.Context r3 = r1.getContext()
            r0.<init>(r3)
            r3 = 0
            r0.f326i = r3
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r0.f327j = r4
            H0.o r4 = new H0.o
            r4.<init>(r0)
            r0.f339v = r4
            H0.p r4 = new H0.p
            r4.<init>(r0)
            android.content.Context r5 = r0.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0.f337t = r5
            r0.f320a = r1
            r5 = 8
            r0.setVisibility(r5)
            r0.setOrientation(r3)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r8 = -1
            r9 = 8388613(0x800005, float:1.175495E-38)
            r6.<init>(r7, r8, r9)
            r0.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r9 = r0.getContext()
            r6.<init>(r9)
            r0.b = r6
            r6.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r7, r8)
            r6.setLayoutParams(r9)
            android.content.Context r9 = r0.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131231146(0x7f0801aa, float:1.8078365E38)
            com.google.android.material.internal.CheckableImageButton r10 = r0.a(r0, r9, r10)
            r0.f321c = r10
            r11 = 2131231145(0x7f0801a9, float:1.8078363E38)
            com.google.android.material.internal.CheckableImageButton r9 = r0.a(r6, r9, r11)
            r0.f324g = r9
            H0.r r11 = new H0.r
            r11.<init>((H0.s) r0, (N.g) r2)
            r0.f325h = r11
            k.h0 r11 = new k.h0
            android.content.Context r12 = r0.getContext()
            r13 = 0
            r11.<init>(r12, r13)
            r0.f334q = r11
            java.lang.Object r12 = r2.f606c
            android.content.res.TypedArray r12 = (android.content.res.TypedArray) r12
            r14 = 38
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto L_0x00a1
            android.content.Context r15 = r0.getContext()
            android.content.res.ColorStateList r14 = A.i.G(r15, r2, r14)
            r0.f322d = r14
        L_0x00a1:
            r14 = 39
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto L_0x00b3
            int r14 = r12.getInt(r14, r8)
            android.graphics.PorterDuff$Mode r14 = y0.l.g(r14, r13)
            r0.f323e = r14
        L_0x00b3:
            r14 = 37
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto L_0x00c2
            android.graphics.drawable.Drawable r14 = r2.p(r14)
            r0.i(r14)
        L_0x00c2:
            android.content.res.Resources r14 = r0.getResources()
            r15 = 2131689543(0x7f0f0047, float:1.9008104E38)
            java.lang.CharSequence r14 = r14.getText(r15)
            r10.setContentDescription(r14)
            java.util.WeakHashMap r14 = I.O.f393a
            r14 = 2
            r10.setImportantForAccessibility(r14)
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setFocusable(r3)
            r14 = 53
            boolean r15 = r12.hasValue(r14)
            if (r15 != 0) goto L_0x010b
            r15 = 32
            boolean r16 = r12.hasValue(r15)
            if (r16 == 0) goto L_0x00f9
            android.content.Context r7 = r0.getContext()
            android.content.res.ColorStateList r7 = A.i.G(r7, r2, r15)
            r0.f328k = r7
        L_0x00f9:
            r7 = 33
            boolean r15 = r12.hasValue(r7)
            if (r15 == 0) goto L_0x010b
            int r7 = r12.getInt(r7, r8)
            android.graphics.PorterDuff$Mode r7 = y0.l.g(r7, r13)
            r0.f329l = r7
        L_0x010b:
            r7 = 30
            boolean r15 = r12.hasValue(r7)
            r5 = 1
            if (r15 == 0) goto L_0x013a
            int r7 = r12.getInt(r7, r3)
            r0.g(r7)
            r7 = 27
            boolean r14 = r12.hasValue(r7)
            if (r14 == 0) goto L_0x0130
            java.lang.CharSequence r7 = r12.getText(r7)
            java.lang.CharSequence r14 = r9.getContentDescription()
            if (r14 == r7) goto L_0x0130
            r9.setContentDescription(r7)
        L_0x0130:
            r7 = 26
            boolean r7 = r12.getBoolean(r7, r5)
            r9.setCheckable(r7)
            goto L_0x017a
        L_0x013a:
            boolean r7 = r12.hasValue(r14)
            if (r7 == 0) goto L_0x017a
            r7 = 54
            boolean r15 = r12.hasValue(r7)
            if (r15 == 0) goto L_0x0152
            android.content.Context r15 = r0.getContext()
            android.content.res.ColorStateList r7 = A.i.G(r15, r2, r7)
            r0.f328k = r7
        L_0x0152:
            r7 = 55
            boolean r15 = r12.hasValue(r7)
            if (r15 == 0) goto L_0x0164
            int r7 = r12.getInt(r7, r8)
            android.graphics.PorterDuff$Mode r7 = y0.l.g(r7, r13)
            r0.f329l = r7
        L_0x0164:
            boolean r7 = r12.getBoolean(r14, r3)
            r0.g(r7)
            r7 = 51
            java.lang.CharSequence r7 = r12.getText(r7)
            java.lang.CharSequence r14 = r9.getContentDescription()
            if (r14 == r7) goto L_0x017a
            r9.setContentDescription(r7)
        L_0x017a:
            android.content.res.Resources r7 = r0.getResources()
            r14 = 2131100371(0x7f0602d3, float:1.7813122E38)
            int r7 = r7.getDimensionPixelSize(r14)
            r14 = 29
            int r7 = r12.getDimensionPixelSize(r14, r7)
            if (r7 < 0) goto L_0x021f
            int r14 = r0.f330m
            if (r7 == r14) goto L_0x019f
            r0.f330m = r7
            r9.setMinimumWidth(r7)
            r9.setMinimumHeight(r7)
            r10.setMinimumWidth(r7)
            r10.setMinimumHeight(r7)
        L_0x019f:
            r7 = 31
            boolean r14 = r12.hasValue(r7)
            if (r14 == 0) goto L_0x01b7
            int r7 = r12.getInt(r7, r8)
            android.widget.ImageView$ScaleType r7 = A.i.p(r7)
            r0.f331n = r7
            r9.setScaleType(r7)
            r10.setScaleType(r7)
        L_0x01b7:
            r7 = 8
            r11.setVisibility(r7)
            r7 = 2131231153(0x7f0801b1, float:1.8078379E38)
            r11.setId(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 1117782016(0x42a00000, float:80.0)
            r14 = -2
            r7.<init>(r14, r14, r8)
            r11.setLayoutParams(r7)
            r11.setAccessibilityLiveRegion(r5)
            r5 = 72
            int r5 = r12.getResourceId(r5, r3)
            A.i.s0(r11, r5)
            r5 = 73
            boolean r7 = r12.hasValue(r5)
            if (r7 == 0) goto L_0x01e8
            android.content.res.ColorStateList r2 = r2.o(r5)
            r11.setTextColor(r2)
        L_0x01e8:
            r2 = 71
            java.lang.CharSequence r2 = r12.getText(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x01f5:
            r13 = r2
        L_0x01f6:
            r0.f333p = r13
            r11.setText(r2)
            r0.n()
            r6.addView(r9)
            r0.addView(r11)
            r0.addView(r6)
            r0.addView(r10)
            java.util.LinkedHashSet r2 = r1.e0
            r2.add(r4)
            android.widget.EditText r2 = r1.f2112d
            if (r2 == 0) goto L_0x0216
            r4.a(r1)
        L_0x0216:
            H0.q r1 = new H0.q
            r1.<init>(r3, r0)
            r0.addOnAttachStateChangeListener(r1)
            return
        L_0x021f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIconSize cannot be less than 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.s.<init>(com.google.android.material.textfield.TextInputLayout, N.g):void");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.MT_Bin, viewGroup, false);
        checkableImageButton.setId(i2);
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = d.f74a;
            checkableImageButton.setBackground(c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        if (i.Y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final t b() {
        t tVar;
        int i2 = this.f326i;
        r rVar = this.f325h;
        SparseArray sparseArray = (SparseArray) rVar.f318c;
        t tVar2 = (t) sparseArray.get(i2);
        if (tVar2 != null) {
            return tVar2;
        }
        s sVar = (s) rVar.f319d;
        if (i2 == -1) {
            tVar = new C0005f(sVar, 0);
        } else if (i2 == 0) {
            tVar = new C0005f(sVar, 1);
        } else if (i2 == 1) {
            tVar = new A(sVar, rVar.b);
        } else if (i2 == 2) {
            tVar = new C0004e(sVar);
        } else if (i2 == 3) {
            tVar = new n(sVar);
        } else {
            throw new IllegalArgumentException(g.f(i2, "Invalid end icon mode: "));
        }
        sparseArray.append(i2, tVar);
        return tVar;
    }

    public final int c() {
        int i2;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f324g;
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = O.f393a;
        return this.f334q.getPaddingEnd() + getPaddingEnd() + i2;
    }

    public final boolean d() {
        if (this.b.getVisibility() == 0 && this.f324g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f321c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        t b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f324g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.f2043d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof n) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            i.g0(this.f320a, checkableImageButton, this.f328k);
        }
    }

    public final void g(int i2) {
        boolean z2;
        Drawable drawable;
        if (this.f326i != i2) {
            t b2 = b();
            l lVar = this.f338u;
            AccessibilityManager accessibilityManager = this.f337t;
            if (!(lVar == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new b(lVar));
            }
            CharSequence charSequence = null;
            this.f338u = null;
            b2.s();
            this.f326i = i2;
            Iterator it = this.f327j.iterator();
            if (!it.hasNext()) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                h(z2);
                t b3 = b();
                int i3 = this.f325h.f317a;
                if (i3 == 0) {
                    i3 = b3.d();
                }
                if (i3 != 0) {
                    drawable = l.v(getContext(), i3);
                } else {
                    drawable = null;
                }
                CheckableImageButton checkableImageButton = this.f324g;
                checkableImageButton.setImageDrawable(drawable);
                TextInputLayout textInputLayout = this.f320a;
                if (drawable != null) {
                    i.e(textInputLayout, checkableImageButton, this.f328k, this.f329l);
                    i.g0(textInputLayout, checkableImageButton, this.f328k);
                }
                int c2 = b3.c();
                if (c2 != 0) {
                    charSequence = getResources().getText(c2);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b3.k());
                if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                    b3.r();
                    l h2 = b3.h();
                    this.f338u = h2;
                    if (!(h2 == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = O.f393a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new b(this.f338u));
                        }
                    }
                    View.OnClickListener f2 = b3.f();
                    View.OnLongClickListener onLongClickListener = this.f332o;
                    checkableImageButton.setOnClickListener(f2);
                    i.n0(checkableImageButton, onLongClickListener);
                    EditText editText = this.f336s;
                    if (editText != null) {
                        b3.m(editText);
                        j(b3);
                    }
                    i.e(textInputLayout, checkableImageButton, this.f328k, this.f329l);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
            }
            throw g.e(it);
        }
    }

    public final void h(boolean z2) {
        int i2;
        if (d() != z2) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f324g.setVisibility(i2);
            k();
            m();
            this.f320a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f321c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        i.e(this.f320a, checkableImageButton, this.f322d, this.f323e);
    }

    public final void j(t tVar) {
        if (this.f336s != null) {
            if (tVar.e() != null) {
                this.f336s.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f324g.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    public final void k() {
        int i2;
        char c2;
        int i3 = 8;
        if (this.f324g.getVisibility() != 0 || e()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.b.setVisibility(i2);
        if (this.f333p == null || this.f335r) {
            c2 = 8;
        } else {
            c2 = 0;
        }
        if (d() || e() || c2 == 0) {
            i3 = 0;
        }
        setVisibility(i3);
    }

    public final void l() {
        int i2;
        CheckableImageButton checkableImageButton = this.f321c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f320a;
        if (drawable == null || !textInputLayout.f2122j.f364q || !textInputLayout.m()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        checkableImageButton.setVisibility(i2);
        k();
        m();
        if (this.f326i == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i2;
        TextInputLayout textInputLayout = this.f320a;
        if (textInputLayout.f2112d != null) {
            if (d() || e()) {
                i2 = 0;
            } else {
                EditText editText = textInputLayout.f2112d;
                WeakHashMap weakHashMap = O.f393a;
                i2 = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            int paddingTop = textInputLayout.f2112d.getPaddingTop();
            int paddingBottom = textInputLayout.f2112d.getPaddingBottom();
            WeakHashMap weakHashMap2 = O.f393a;
            this.f334q.setPaddingRelative(dimensionPixelSize, paddingTop, i2, paddingBottom);
        }
    }

    public final void n() {
        int i2;
        C0245h0 h0Var = this.f334q;
        int visibility = h0Var.getVisibility();
        boolean z2 = false;
        if (this.f333p == null || this.f335r) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (visibility != i2) {
            t b2 = b();
            if (i2 == 0) {
                z2 = true;
            }
            b2.p(z2);
        }
        k();
        h0Var.setVisibility(i2);
        this.f320a.q();
    }
}

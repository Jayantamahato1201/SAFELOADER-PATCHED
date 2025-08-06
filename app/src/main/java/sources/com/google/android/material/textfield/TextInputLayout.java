package com.google.android.material.textfield;

import A.a;
import A.i;
import B0.d;
import E0.c;
import E0.e;
import E0.f;
import E0.g;
import E0.k;
import G.b;
import G.j;
import H0.B;
import H0.C;
import H0.C0006g;
import H0.C0007h;
import H0.D;
import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.I;
import H0.n;
import H0.p;
import H0.s;
import H0.v;
import H0.w;
import H0.z;
import I.O;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cheatbox.R;
import com.google.android.material.internal.CheckableImageButton;
import f0.C0157h;
import f0.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0241f0;
import k.C0245h0;
import k.C0267t;
import k.C0268t0;
import k0.C0281a;
import t0.C0486a;
import y0.C0500b;
import y0.C0501c;
import y0.l;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0  reason: collision with root package name */
    public static final int[][] f2082C0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f2083A;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f2084A0;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f2085B;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f2086B0;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2087C;
    public CharSequence D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2088E;

    /* renamed from: F  reason: collision with root package name */
    public g f2089F;

    /* renamed from: G  reason: collision with root package name */
    public g f2090G;

    /* renamed from: H  reason: collision with root package name */
    public StateListDrawable f2091H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f2092I;

    /* renamed from: J  reason: collision with root package name */
    public g f2093J;

    /* renamed from: K  reason: collision with root package name */
    public g f2094K;

    /* renamed from: L  reason: collision with root package name */
    public k f2095L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f2096M;

    /* renamed from: N  reason: collision with root package name */
    public final int f2097N;

    /* renamed from: O  reason: collision with root package name */
    public int f2098O;

    /* renamed from: P  reason: collision with root package name */
    public int f2099P;

    /* renamed from: Q  reason: collision with root package name */
    public int f2100Q;

    /* renamed from: R  reason: collision with root package name */
    public int f2101R;

    /* renamed from: S  reason: collision with root package name */
    public int f2102S;

    /* renamed from: T  reason: collision with root package name */
    public int f2103T;

    /* renamed from: U  reason: collision with root package name */
    public int f2104U;

    /* renamed from: V  reason: collision with root package name */
    public final Rect f2105V = new Rect();

    /* renamed from: W  reason: collision with root package name */
    public final Rect f2106W = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f2107a;

    /* renamed from: a0  reason: collision with root package name */
    public final RectF f2108a0 = new RectF();
    public final B b;

    /* renamed from: b0  reason: collision with root package name */
    public Typeface f2109b0;

    /* renamed from: c  reason: collision with root package name */
    public final s f2110c;

    /* renamed from: c0  reason: collision with root package name */
    public ColorDrawable f2111c0;

    /* renamed from: d  reason: collision with root package name */
    public EditText f2112d;

    /* renamed from: d0  reason: collision with root package name */
    public int f2113d0;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2114e;
    public final LinkedHashSet e0 = new LinkedHashSet();
    public int f = -1;

    /* renamed from: f0  reason: collision with root package name */
    public ColorDrawable f2115f0;

    /* renamed from: g  reason: collision with root package name */
    public int f2116g = -1;

    /* renamed from: g0  reason: collision with root package name */
    public int f2117g0;

    /* renamed from: h  reason: collision with root package name */
    public int f2118h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f2119h0;

    /* renamed from: i  reason: collision with root package name */
    public int f2120i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f2121i0;

    /* renamed from: j  reason: collision with root package name */
    public final w f2122j = new w(this);

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f2123j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2124k;

    /* renamed from: k0  reason: collision with root package name */
    public int f2125k0;

    /* renamed from: l  reason: collision with root package name */
    public int f2126l;

    /* renamed from: l0  reason: collision with root package name */
    public int f2127l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2128m;

    /* renamed from: m0  reason: collision with root package name */
    public int f2129m0;

    /* renamed from: n  reason: collision with root package name */
    public H f2130n = new C(0);
    public ColorStateList n0;

    /* renamed from: o  reason: collision with root package name */
    public C0245h0 f2131o;

    /* renamed from: o0  reason: collision with root package name */
    public int f2132o0;

    /* renamed from: p  reason: collision with root package name */
    public int f2133p;

    /* renamed from: p0  reason: collision with root package name */
    public int f2134p0;

    /* renamed from: q  reason: collision with root package name */
    public int f2135q;

    /* renamed from: q0  reason: collision with root package name */
    public int f2136q0;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f2137r;

    /* renamed from: r0  reason: collision with root package name */
    public int f2138r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2139s;

    /* renamed from: s0  reason: collision with root package name */
    public int f2140s0;

    /* renamed from: t  reason: collision with root package name */
    public C0245h0 f2141t;

    /* renamed from: t0  reason: collision with root package name */
    public int f2142t0;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f2143u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2144u0;

    /* renamed from: v  reason: collision with root package name */
    public int f2145v;

    /* renamed from: v0  reason: collision with root package name */
    public final C0500b f2146v0;

    /* renamed from: w  reason: collision with root package name */
    public C0157h f2147w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2148w0;

    /* renamed from: x  reason: collision with root package name */
    public C0157h f2149x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f2150x0;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f2151y;

    /* renamed from: y0  reason: collision with root package name */
    public ValueAnimator f2152y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f2153z;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22) {
        /*
            r20 = this;
            r0 = r20
            r2 = r22
            r4 = 2130904090(0x7f03041a, float:1.7415016E38)
            r7 = 2131755844(0x7f100344, float:1.9142579E38)
            r1 = r21
            android.content.Context r1 = J0.a.a(r1, r2, r4, r7)
            r0.<init>(r1, r2, r4)
            r8 = -1
            r0.f = r8
            r0.f2116g = r8
            r0.f2118h = r8
            r0.f2120i = r8
            H0.w r1 = new H0.w
            r1.<init>(r0)
            r0.f2122j = r1
            H0.C r1 = new H0.C
            r3 = 0
            r1.<init>(r3)
            r0.f2130n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2105V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2106W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2108a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.e0 = r1
            y0.b r1 = new y0.b
            r1.<init>(r0)
            r0.f2146v0 = r1
            r9 = 0
            r0.f2086B0 = r9
            android.content.Context r3 = r0.getContext()
            r10 = 1
            r0.setOrientation(r10)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r10)
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r3)
            r0.f2107a = r11
            r11.setAddStatesFromChildren(r10)
            android.view.animation.LinearInterpolator r5 = k0.C0281a.f3622a
            r1.f4782Q = r5
            r1.h(r9)
            r1.f4781P = r5
            r1.h(r9)
            int r5 = r1.f4801g
            r6 = 8388659(0x800033, float:1.1755015E-38)
            if (r5 == r6) goto L_0x0081
            r1.f4801g = r6
            r1.h(r9)
        L_0x0081:
            int[] r1 = j0.C0219a.f3174B
            r12 = 22
            r13 = 20
            r14 = 40
            r15 = 45
            r5 = 49
            int[] r6 = new int[]{r12, r13, r14, r15, r5}
            r16 = 49
            r5 = 2131755844(0x7f100344, float:1.9142579E38)
            y0.l.a(r3, r2, r4, r5)
            r13 = r3
            r3 = r1
            r1 = r13
            r13 = 49
            y0.l.b(r1, r2, r3, r4, r5, r6)
            N.g r6 = new N.g
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.<init>((android.content.Context) r1, (android.content.res.TypedArray) r3)
            H0.B r5 = new H0.B
            r5.<init>(r0, r6)
            r0.b = r5
            r12 = 48
            boolean r12 = r3.getBoolean(r12, r10)
            r0.f2087C = r12
            r12 = 4
            java.lang.CharSequence r12 = r3.getText(r12)
            r0.setHint((java.lang.CharSequence) r12)
            r12 = 47
            boolean r12 = r3.getBoolean(r12, r10)
            r0.f2150x0 = r12
            r12 = 42
            boolean r12 = r3.getBoolean(r12, r10)
            r0.f2148w0 = r12
            r12 = 6
            boolean r17 = r3.hasValue(r12)
            if (r17 == 0) goto L_0x00e0
            int r12 = r3.getInt(r12, r8)
            r0.setMinEms(r12)
            goto L_0x00ee
        L_0x00e0:
            r12 = 3
            boolean r17 = r3.hasValue(r12)
            if (r17 == 0) goto L_0x00ee
            int r12 = r3.getDimensionPixelSize(r12, r8)
            r0.setMinWidth(r12)
        L_0x00ee:
            r12 = 5
            boolean r17 = r3.hasValue(r12)
            r15 = 2
            if (r17 == 0) goto L_0x00fe
            int r12 = r3.getInt(r12, r8)
            r0.setMaxEms(r12)
            goto L_0x010b
        L_0x00fe:
            boolean r12 = r3.hasValue(r15)
            if (r12 == 0) goto L_0x010b
            int r12 = r3.getDimensionPixelSize(r15, r8)
            r0.setMaxWidth(r12)
        L_0x010b:
            E0.j r2 = E0.k.b(r1, r2, r4, r7)
            E0.k r2 = r2.a()
            r0.f2095L = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131100432(0x7f060310, float:1.7813245E38)
            int r2 = r2.getDimensionPixelOffset(r4)
            r0.f2097N = r2
            r2 = 9
            int r2 = r3.getDimensionPixelOffset(r2, r9)
            r0.f2099P = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131100433(0x7f060311, float:1.7813247E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 16
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.f2101R = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131100434(0x7f060312, float:1.781325E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 17
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.f2102S = r2
            int r2 = r0.f2101R
            r0.f2100Q = r2
            r2 = 13
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r3.getDimension(r2, r4)
            r7 = 12
            float r7 = r3.getDimension(r7, r4)
            r12 = 10
            float r12 = r3.getDimension(r12, r4)
            r15 = 11
            float r4 = r3.getDimension(r15, r4)
            E0.k r15 = r0.f2095L
            E0.j r15 = r15.e()
            r18 = 0
            int r19 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r19 < 0) goto L_0x0181
            E0.a r14 = new E0.a
            r14.<init>(r2)
            r15.f142e = r14
        L_0x0181:
            int r2 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x018c
            E0.a r2 = new E0.a
            r2.<init>(r7)
            r15.f = r2
        L_0x018c:
            int r2 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0197
            E0.a r2 = new E0.a
            r2.<init>(r12)
            r15.f143g = r2
        L_0x0197:
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x01a2
            E0.a r2 = new E0.a
            r2.<init>(r4)
            r15.f144h = r2
        L_0x01a2:
            E0.k r2 = r15.a()
            r0.f2095L = r2
            r2 = 7
            android.content.res.ColorStateList r2 = A.i.G(r1, r6, r2)
            if (r2 == 0) goto L_0x0208
            int r4 = r2.getDefaultColor()
            r0.f2132o0 = r4
            r0.f2104U = r4
            boolean r4 = r2.isStateful()
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r12 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01e8
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.f2134p0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r12 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.f2136q0 = r4
            int[] r4 = new int[]{r7, r12}
            int r2 = r2.getColorForState(r4, r8)
            r0.f2138r0 = r2
            goto L_0x0212
        L_0x01e8:
            int r2 = r0.f2132o0
            r0.f2136q0 = r2
            r2 = 2131034842(0x7f0502da, float:1.7680213E38)
            android.content.res.ColorStateList r2 = t0.C0486a.g(r1, r2)
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.f2134p0 = r4
            int[] r4 = new int[]{r7}
            int r2 = r2.getColorForState(r4, r8)
            r0.f2138r0 = r2
            goto L_0x0212
        L_0x0208:
            r0.f2104U = r9
            r0.f2132o0 = r9
            r0.f2134p0 = r9
            r0.f2136q0 = r9
            r0.f2138r0 = r9
        L_0x0212:
            boolean r2 = r3.hasValue(r10)
            if (r2 == 0) goto L_0x0220
            android.content.res.ColorStateList r2 = r6.o(r10)
            r0.f2123j0 = r2
            r0.f2121i0 = r2
        L_0x0220:
            r2 = 14
            android.content.res.ColorStateList r4 = A.i.G(r1, r6, r2)
            int r2 = r3.getColor(r2, r9)
            r0.f2129m0 = r2
            r2 = 2131034869(0x7f0502f5, float:1.7680268E38)
            int r2 = t0.C0486a.d(r1, r2)
            r0.f2125k0 = r2
            r2 = 2131034870(0x7f0502f6, float:1.768027E38)
            int r2 = t0.C0486a.d(r1, r2)
            r0.f2140s0 = r2
            r2 = 2131034873(0x7f0502f9, float:1.7680276E38)
            int r2 = t0.C0486a.d(r1, r2)
            r0.f2127l0 = r2
            if (r4 == 0) goto L_0x024c
            r0.setBoxStrokeColorStateList(r4)
        L_0x024c:
            r2 = 15
            boolean r4 = r3.hasValue(r2)
            if (r4 == 0) goto L_0x025b
            android.content.res.ColorStateList r1 = A.i.G(r1, r6, r2)
            r0.setBoxStrokeErrorColor(r1)
        L_0x025b:
            int r1 = r3.getResourceId(r13, r8)
            if (r1 == r8) goto L_0x0268
            int r1 = r3.getResourceId(r13, r9)
            r0.setHintTextAppearance(r1)
        L_0x0268:
            r1 = 24
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.f2083A = r1
            r1 = 25
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.f2085B = r1
            r1 = 40
            int r1 = r3.getResourceId(r1, r9)
            r2 = 35
            java.lang.CharSequence r2 = r3.getText(r2)
            r4 = 34
            int r4 = r3.getInt(r4, r10)
            r7 = 36
            boolean r7 = r3.getBoolean(r7, r9)
            r12 = 45
            int r12 = r3.getResourceId(r12, r9)
            r13 = 44
            boolean r13 = r3.getBoolean(r13, r9)
            r14 = 43
            java.lang.CharSequence r14 = r3.getText(r14)
            r15 = 57
            int r15 = r3.getResourceId(r15, r9)
            r10 = 56
            java.lang.CharSequence r10 = r3.getText(r10)
            r8 = 18
            boolean r8 = r3.getBoolean(r8, r9)
            r9 = 19
            r22 = r14
            r14 = -1
            int r9 = r3.getInt(r9, r14)
            r0.setCounterMaxLength(r9)
            r9 = 0
            r14 = 22
            int r14 = r3.getResourceId(r14, r9)
            r0.f2135q = r14
            r14 = 20
            int r14 = r3.getResourceId(r14, r9)
            r0.f2133p = r14
            r14 = 8
            int r14 = r3.getInt(r14, r9)
            r0.setBoxBackgroundMode(r14)
            r0.setErrorContentDescription(r2)
            r0.setErrorAccessibilityLiveRegion(r4)
            int r2 = r0.f2133p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r12)
            r0.setErrorTextAppearance(r1)
            int r1 = r0.f2135q
            r0.setCounterTextAppearance(r1)
            r0.setPlaceholderText(r10)
            r0.setPlaceholderTextAppearance(r15)
            r1 = 41
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0305
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setErrorTextColor(r1)
        L_0x0305:
            r1 = 46
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0314
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setHelperTextColor(r1)
        L_0x0314:
            r1 = 50
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0323
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setHintTextColor(r1)
        L_0x0323:
            r1 = 23
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0332
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setCounterTextColor(r1)
        L_0x0332:
            r1 = 21
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0341
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setCounterOverflowTextColor(r1)
        L_0x0341:
            r1 = 58
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L_0x0350
            android.content.res.ColorStateList r1 = r6.o(r1)
            r0.setPlaceholderTextColor(r1)
        L_0x0350:
            H0.s r1 = new H0.s
            r1.<init>(r0, r6)
            r0.f2110c = r1
            r2 = 1
            r9 = 0
            boolean r3 = r3.getBoolean(r9, r2)
            r6.F()
            r4 = 2
            r0.setImportantForAccessibility(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r4 < r6) goto L_0x036f
            if (r4 < r6) goto L_0x036f
            I.F.m(r0, r2)
        L_0x036f:
            r11.addView(r5)
            r11.addView(r1)
            r0.addView(r11)
            r0.setEnabled(r3)
            r0.setHelperTextEnabled(r13)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r8)
            r1 = r22
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i2;
        EditText editText = this.f2112d;
        if (!(editText instanceof AutoCompleteTextView) || i.W(editText)) {
            return this.f2089F;
        }
        int f2 = C0486a.f(this.f2112d, R.attr.MT_Bin);
        int i3 = this.f2098O;
        int[][] iArr = f2082C0;
        if (i3 == 2) {
            Context context = getContext();
            g gVar = this.f2089F;
            TypedValue j02 = i.j0(context, R.attr.MT_Bin, "TextInputLayout");
            int i4 = j02.resourceId;
            if (i4 != 0) {
                i2 = C0486a.d(context, i4);
            } else {
                i2 = j02.data;
            }
            g gVar2 = new g(gVar.f118a.f103a);
            int o2 = C0486a.o(f2, i2, 0.1f);
            gVar2.j(new ColorStateList(iArr, new int[]{o2, 0}));
            gVar2.setTint(i2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{o2, i2});
            g gVar3 = new g(gVar.f118a.f103a);
            gVar3.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else if (i3 != 1) {
            return null;
        } else {
            g gVar4 = this.f2089F;
            int i5 = this.f2104U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C0486a.o(f2, i5, 0.1f), i5}), gVar4, gVar4);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2091H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2091H = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2091H.addState(new int[0], f(false));
        }
        return this.f2091H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2090G == null) {
            this.f2090G = f(true);
        }
        return this.f2090G;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2112d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f2112d = editText;
            int i2 = this.f;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f2118h);
            }
            int i3 = this.f2116g;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.f2120i);
            }
            this.f2092I = false;
            i();
            setTextInputAccessibilityDelegate(new G(this));
            Typeface typeface = this.f2112d.getTypeface();
            C0500b bVar = this.f2146v0;
            bVar.m(typeface);
            float textSize = this.f2112d.getTextSize();
            if (bVar.f4802h != textSize) {
                bVar.f4802h = textSize;
                bVar.h(false);
            }
            int i4 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f2112d.getLetterSpacing();
            if (bVar.f4788W != letterSpacing) {
                bVar.f4788W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f2112d.getGravity();
            int i5 = (gravity & -113) | 48;
            if (bVar.f4801g != i5) {
                bVar.f4801g = i5;
                bVar.h(false);
            }
            if (bVar.f != gravity) {
                bVar.f = gravity;
                bVar.h(false);
            }
            WeakHashMap weakHashMap = O.f393a;
            this.f2142t0 = editText.getMinimumHeight();
            this.f2112d.addTextChangedListener(new D(this, editText));
            if (this.f2121i0 == null) {
                this.f2121i0 = this.f2112d.getHintTextColors();
            }
            if (this.f2087C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.f2112d.getHint();
                    this.f2114e = hint;
                    setHint(hint);
                    this.f2112d.setHint((CharSequence) null);
                }
                this.f2088E = true;
            }
            if (i4 >= 29) {
                p();
            }
            if (this.f2131o != null) {
                n(this.f2112d.getText());
            }
            r();
            this.f2122j.b();
            this.b.bringToFront();
            s sVar = this.f2110c;
            sVar.bringToFront();
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(this);
            }
            sVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            C0500b bVar = this.f2146v0;
            if (charSequence == null || !TextUtils.equals(bVar.f4767A, charSequence)) {
                bVar.f4767A = charSequence;
                bVar.f4768B = null;
                Bitmap bitmap = bVar.f4770E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f4770E = null;
                }
                bVar.h(false);
            }
            if (!this.f2144u0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2139s != z2) {
            if (z2) {
                C0245h0 h0Var = this.f2141t;
                if (h0Var != null) {
                    this.f2107a.addView(h0Var);
                    this.f2141t.setVisibility(0);
                }
            } else {
                C0245h0 h0Var2 = this.f2141t;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(8);
                }
                this.f2141t = null;
            }
            this.f2139s = z2;
        }
    }

    public final void a(float f2) {
        C0500b bVar = this.f2146v0;
        if (bVar.b != f2) {
            if (this.f2152y0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f2152y0 = valueAnimator;
                valueAnimator.setInterpolator(C0486a.r(getContext(), R.attr.MT_Bin, C0281a.b));
                this.f2152y0.setDuration((long) C0486a.q(getContext(), R.attr.MT_Bin, 167));
                this.f2152y0.addUpdateListener(new F(0, this));
            }
            this.f2152y0.setFloatValues(new float[]{bVar.b, f2});
            this.f2152y0.start();
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f2107a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b() {
        ColorStateList colorStateList;
        int i2;
        int i3;
        g gVar = this.f2089F;
        if (gVar != null) {
            k kVar = gVar.f118a.f103a;
            k kVar2 = this.f2095L;
            if (kVar != kVar2) {
                gVar.setShapeAppearanceModel(kVar2);
            }
            if (this.f2098O == 2 && (i2 = this.f2100Q) > -1 && (i3 = this.f2103T) != 0) {
                g gVar2 = this.f2089F;
                gVar2.f118a.f110j = (float) i2;
                gVar2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i3);
                f fVar = gVar2.f118a;
                if (fVar.f105d != valueOf) {
                    fVar.f105d = valueOf;
                    gVar2.onStateChange(gVar2.getState());
                }
            }
            int i4 = this.f2104U;
            if (this.f2098O == 1) {
                i4 = a.b(this.f2104U, C0486a.e(getContext(), R.attr.MT_Bin, 0));
            }
            this.f2104U = i4;
            this.f2089F.j(ColorStateList.valueOf(i4));
            g gVar3 = this.f2093J;
            if (!(gVar3 == null || this.f2094K == null)) {
                if (this.f2100Q > -1 && this.f2103T != 0) {
                    if (this.f2112d.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.f2125k0);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.f2103T);
                    }
                    gVar3.j(colorStateList);
                    this.f2094K.j(ColorStateList.valueOf(this.f2103T));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float d2;
        if (!this.f2087C) {
            return 0;
        }
        int i2 = this.f2098O;
        C0500b bVar = this.f2146v0;
        if (i2 == 0) {
            d2 = bVar.d();
        } else if (i2 != 2) {
            return 0;
        } else {
            d2 = bVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final C0157h d() {
        C0157h hVar = new C0157h();
        hVar.f2666h = (long) C0486a.q(getContext(), R.attr.MT_Bin, 87);
        hVar.f2667i = C0486a.r(getContext(), R.attr.MT_Bin, C0281a.f3622a);
        return hVar;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f2112d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2114e != null) {
            boolean z2 = this.f2088E;
            this.f2088E = false;
            CharSequence hint = editText.getHint();
            this.f2112d.setHint(this.f2114e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.f2112d.setHint(hint);
                this.f2088E = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            FrameLayout frameLayout = this.f2107a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
                View childAt = frameLayout.getChildAt(i3);
                ViewStructure newChild = viewStructure.newChild(i3);
                childAt.dispatchProvideAutofillStructure(newChild, i2);
                if (childAt == this.f2112d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2084A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2084A0 = false;
    }

    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f2087C;
        C0500b bVar = this.f2146v0;
        if (z2) {
            bVar.getClass();
            int save = canvas2.save();
            if (bVar.f4768B != null) {
                RectF rectF = bVar.f4799e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f4779N;
                    textPaint.setTextSize(bVar.f4772G);
                    float f2 = bVar.f4810p;
                    float f3 = bVar.f4811q;
                    float f4 = bVar.f4771F;
                    if (f4 != 1.0f) {
                        canvas2.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f4798d0 <= 1 || bVar.f4769C) {
                        canvas2.translate(f2, f3);
                        bVar.f4790Y.draw(canvas2);
                    } else {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(bVar.f4810p - ((float) bVar.f4790Y.getLineStart(0)), f3);
                        float f5 = (float) alpha;
                        textPaint.setAlpha((int) (bVar.f4794b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = bVar.f4773H;
                            float f7 = bVar.f4774I;
                            float f8 = bVar.f4775J;
                            int i3 = bVar.f4776K;
                            textPaint.setShadowLayer(f6, f7, f8, a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        bVar.f4790Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f4793a0 * f5));
                        if (i2 >= 31) {
                            float f9 = bVar.f4773H;
                            float f10 = bVar.f4774I;
                            float f11 = bVar.f4775J;
                            int i4 = bVar.f4776K;
                            textPaint.setShadowLayer(f9, f10, f11, a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f4790Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f4796c0;
                        float f12 = (float) lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(bVar.f4773H, bVar.f4774I, bVar.f4775J, bVar.f4776K);
                        }
                        String trim = bVar.f4796c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(bVar.f4790Y.getLineEnd(0), str.length()), 0.0f, f12, textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f2094K != null && (gVar = this.f2093J) != null) {
            gVar.draw(canvas2);
            if (this.f2112d.isFocused()) {
                Rect bounds = this.f2094K.getBounds();
                Rect bounds2 = this.f2093J.getBounds();
                float f13 = bVar.b;
                int centerX = bounds2.centerX();
                bounds.left = C0281a.c(centerX, bounds2.left, f13);
                bounds.right = C0281a.c(centerX, bounds2.right, f13);
                this.f2094K.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.z0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            y0.b r3 = r4.f2146v0
            if (r3 == 0) goto L_0x002f
            r3.f4777L = r1
            android.content.res.ColorStateList r1 = r3.f4805k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f4804j
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.h(r2)
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            android.widget.EditText r3 = r4.f2112d
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = I.O.f393a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (!this.f2087C || TextUtils.isEmpty(this.D) || !(this.f2089F instanceof C0007h)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r2v3, types: [E0.k, java.lang.Object] */
    public final g f(boolean z2) {
        float f2;
        float f3;
        ColorStateList colorStateList;
        int i2;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
        if (z2) {
            f2 = dimensionPixelOffset;
        } else {
            f2 = 0.0f;
        }
        EditText editText = this.f2112d;
        if (editText instanceof z) {
            f3 = ((z) editText).getPopupElevation();
        } else {
            f3 = (float) getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        e eVar4 = new e(0);
        E0.a aVar = new E0.a(f2);
        E0.a aVar2 = new E0.a(f2);
        E0.a aVar3 = new E0.a(dimensionPixelOffset);
        E0.a aVar4 = new E0.a(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.f149a = obj;
        obj5.b = obj2;
        obj5.f150c = obj3;
        obj5.f151d = obj4;
        obj5.f152e = aVar;
        obj5.f = aVar2;
        obj5.f153g = aVar4;
        obj5.f154h = aVar3;
        obj5.f155i = eVar;
        obj5.f156j = eVar2;
        obj5.f157k = eVar3;
        obj5.f158l = eVar4;
        EditText editText2 = this.f2112d;
        if (editText2 instanceof z) {
            colorStateList = ((z) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.f117w;
            TypedValue j02 = i.j0(context, R.attr.MT_Bin, g.class.getSimpleName());
            int i3 = j02.resourceId;
            if (i3 != 0) {
                i2 = C0486a.d(context, i3);
            } else {
                i2 = j02.data;
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(colorStateList);
        gVar.i(f3);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.f118a;
        if (fVar.f107g == null) {
            fVar.f107g = new Rect();
        }
        gVar.f118a.f107g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i2, boolean z2) {
        int compoundPaddingLeft;
        if (!z2 && getPrefixText() != null) {
            compoundPaddingLeft = this.b.a();
        } else if (!z2 || getSuffixText() == null) {
            compoundPaddingLeft = this.f2112d.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f2110c.c();
        }
        return compoundPaddingLeft + i2;
    }

    public int getBaseline() {
        EditText editText = this.f2112d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i2 = this.f2098O;
        if (i2 == 1 || i2 == 2) {
            return this.f2089F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2104U;
    }

    public int getBoxBackgroundMode() {
        return this.f2098O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2099P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = l.e(this);
        RectF rectF = this.f2108a0;
        if (e2) {
            return this.f2095L.f154h.a(rectF);
        }
        return this.f2095L.f153g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = l.e(this);
        RectF rectF = this.f2108a0;
        if (e2) {
            return this.f2095L.f153g.a(rectF);
        }
        return this.f2095L.f154h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = l.e(this);
        RectF rectF = this.f2108a0;
        if (e2) {
            return this.f2095L.f152e.a(rectF);
        }
        return this.f2095L.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = l.e(this);
        RectF rectF = this.f2108a0;
        if (e2) {
            return this.f2095L.f.a(rectF);
        }
        return this.f2095L.f152e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2129m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2101R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2102S;
    }

    public int getCounterMaxLength() {
        return this.f2126l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0245h0 h0Var;
        if (!this.f2124k || !this.f2128m || (h0Var = this.f2131o) == null) {
            return null;
        }
        return h0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2153z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2151y;
    }

    public ColorStateList getCursorColor() {
        return this.f2083A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2085B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2121i0;
    }

    public EditText getEditText() {
        return this.f2112d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2110c.f324g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2110c.f324g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2110c.f330m;
    }

    public int getEndIconMode() {
        return this.f2110c.f326i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2110c.f331n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2110c.f324g;
    }

    public CharSequence getError() {
        w wVar = this.f2122j;
        if (wVar.f364q) {
            return wVar.f363p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2122j.f367t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2122j.f366s;
    }

    public int getErrorCurrentTextColors() {
        C0245h0 h0Var = this.f2122j.f365r;
        if (h0Var != null) {
            return h0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2110c.f321c.getDrawable();
    }

    public CharSequence getHelperText() {
        w wVar = this.f2122j;
        if (wVar.f371x) {
            return wVar.f370w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0245h0 h0Var = this.f2122j.f372y;
        if (h0Var != null) {
            return h0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2087C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2146v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0500b bVar = this.f2146v0;
        return bVar.e(bVar.f4805k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2123j0;
    }

    public H getLengthCounter() {
        return this.f2130n;
    }

    public int getMaxEms() {
        return this.f2116g;
    }

    public int getMaxWidth() {
        return this.f2120i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.f2118h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2110c.f324g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2110c.f324g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2139s) {
            return this.f2137r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2145v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2143u;
    }

    public CharSequence getPrefixText() {
        return this.b.f266c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public k getShapeAppearanceModel() {
        return this.f2095L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.f267d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f267d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.f269g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.f270h;
    }

    public CharSequence getSuffixText() {
        return this.f2110c.f333p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2110c.f334q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2110c.f334q;
    }

    public Typeface getTypeface() {
        return this.f2109b0;
    }

    public final int h(int i2, boolean z2) {
        int compoundPaddingRight;
        if (!z2 && getSuffixText() != null) {
            compoundPaddingRight = this.f2110c.c();
        } else if (!z2 || getPrefixText() == null) {
            compoundPaddingRight = this.f2112d.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.b.a();
        }
        return i2 - compoundPaddingRight;
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [H0.h, E0.g] */
    public final void i() {
        int i2 = this.f2098O;
        if (i2 == 0) {
            this.f2089F = null;
            this.f2093J = null;
            this.f2094K = null;
        } else if (i2 == 1) {
            this.f2089F = new g(this.f2095L);
            this.f2093J = new g();
            this.f2094K = new g();
        } else if (i2 == 2) {
            if (!this.f2087C || (this.f2089F instanceof C0007h)) {
                this.f2089F = new g(this.f2095L);
            } else {
                k kVar = this.f2095L;
                int i3 = C0007h.f294y;
                if (kVar == null) {
                    kVar = new k();
                }
                C0006g gVar = new C0006g(kVar, new RectF());
                ? gVar2 = new g((f) gVar);
                gVar2.f295x = gVar;
                this.f2089F = gVar2;
            }
            this.f2093J = null;
            this.f2094K = null;
        } else {
            throw new IllegalArgumentException(this.f2098O + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        s();
        x();
        if (this.f2098O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2099P = getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            } else if (i.Y(getContext())) {
                this.f2099P = getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            }
        }
        if (this.f2112d != null && this.f2098O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2112d;
                WeakHashMap weakHashMap = O.f393a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.MT_Bin), this.f2112d.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.MT_Bin));
            } else if (i.Y(getContext())) {
                EditText editText2 = this.f2112d;
                WeakHashMap weakHashMap2 = O.f393a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.MT_Bin), this.f2112d.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.MT_Bin));
            }
        }
        if (this.f2098O != 0) {
            t();
        }
        EditText editText3 = this.f2112d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f2098O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0008
            goto L_0x00f0
        L_0x0008:
            android.widget.EditText r0 = r12.f2112d
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.f2112d
            int r1 = r1.getGravity()
            y0.b r2 = r12.f2146v0
            java.lang.CharSequence r3 = r2.f4767A
            boolean r3 = r2.b(r3)
            r2.f4769C = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.f4797d
            if (r1 == r8) goto L_0x0051
            r10 = r1 & 7
            if (r10 != r7) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0046
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0039
            goto L_0x0046
        L_0x0039:
            if (r3 == 0) goto L_0x0042
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f4791Z
        L_0x0040:
            float r3 = r3 - r10
            goto L_0x0057
        L_0x0042:
            int r3 = r9.left
        L_0x0044:
            float r3 = (float) r3
            goto L_0x0057
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            int r3 = r9.left
            goto L_0x0044
        L_0x004b:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f4791Z
            goto L_0x0040
        L_0x0051:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.f4791Z
            float r10 = r10 / r5
            goto L_0x0040
        L_0x0057:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f2108a0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006e
            goto L_0x008d
        L_0x006e:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0083
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0077
            goto L_0x0083
        L_0x0077:
            boolean r0 = r2.f4769C
            if (r0 == 0) goto L_0x007f
            int r0 = r9.right
        L_0x007d:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007f:
            float r0 = r2.f4791Z
        L_0x0081:
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0083:
            boolean r0 = r2.f4769C
            if (r0 == 0) goto L_0x008a
            float r0 = r2.f4791Z
            goto L_0x0081
        L_0x008a:
            int r0 = r9.right
            goto L_0x007d
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.f4791Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.f2097N
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.f2100Q
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            E0.g r0 = r12.f2089F
            H0.h r0 = (H0.C0007h) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(C0245h0 h0Var, int i2) {
        try {
            i.s0(h0Var, i2);
            if (Build.VERSION.SDK_INT < 23 || h0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        i.s0(h0Var, R.style.MT_Bin);
        h0Var.setTextColor(C0486a.d(getContext(), R.color.MT_Bin));
    }

    public final boolean m() {
        w wVar = this.f2122j;
        if (wVar.f362o != 1 || wVar.f365r == null || TextUtils.isEmpty(wVar.f363p)) {
            return false;
        }
        return true;
    }

    public final void n(Editable editable) {
        int i2;
        boolean z2;
        int i3;
        b bVar;
        ((C) this.f2130n).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        boolean z3 = this.f2128m;
        int i4 = this.f2126l;
        String str = null;
        if (i4 == -1) {
            this.f2131o.setText(String.valueOf(i2));
            this.f2131o.setContentDescription((CharSequence) null);
            this.f2128m = false;
        } else {
            if (i2 > i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2128m = z2;
            Context context = getContext();
            C0245h0 h0Var = this.f2131o;
            int i5 = this.f2126l;
            if (this.f2128m) {
                i3 = R.string.MT_Bin;
            } else {
                i3 = R.string.MT_Bin;
            }
            h0Var.setContentDescription(context.getString(i3, new Object[]{Integer.valueOf(i2), Integer.valueOf(i5)}));
            if (z3 != this.f2128m) {
                o();
            }
            String str2 = b.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.f239e;
            } else {
                bVar = b.f238d;
            }
            C0245h0 h0Var2 = this.f2131o;
            String string = getContext().getString(R.string.MT_Bin, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f2126l)});
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                j jVar = G.k.f247a;
                str = bVar.c(string).toString();
            }
            h0Var2.setText(str);
        }
        if (this.f2112d != null && z3 != this.f2128m) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0245h0 h0Var = this.f2131o;
        if (h0Var != null) {
            if (this.f2128m) {
                i2 = this.f2133p;
            } else {
                i2 = this.f2135q;
            }
            l(h0Var, i2);
            if (!this.f2128m && (colorStateList2 = this.f2151y) != null) {
                this.f2131o.setTextColor(colorStateList2);
            }
            if (this.f2128m && (colorStateList = this.f2153z) != null) {
                this.f2131o.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2146v0.g(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        s sVar = this.f2110c;
        sVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2086B0 = false;
        if (this.f2112d != null && this.f2112d.getMeasuredHeight() < (max = Math.max(sVar.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.f2112d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.f2112d.post(new F0.g(3, this));
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f2112d;
        if (editText != null) {
            ThreadLocal threadLocal = C0501c.f4821a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2105V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = C0501c.f4821a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            C0501c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = C0501c.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2093J;
            if (gVar != null) {
                int i8 = rect.bottom;
                gVar.setBounds(rect.left, i8 - this.f2101R, rect.right, i8);
            }
            g gVar2 = this.f2094K;
            if (gVar2 != null) {
                int i9 = rect.bottom;
                gVar2.setBounds(rect.left, i9 - this.f2102S, rect.right, i9);
            }
            if (this.f2087C) {
                float textSize = this.f2112d.getTextSize();
                C0500b bVar = this.f2146v0;
                if (bVar.f4802h != textSize) {
                    bVar.f4802h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f2112d.getGravity();
                int i10 = (gravity & -113) | 48;
                if (bVar.f4801g != i10) {
                    bVar.f4801g = i10;
                    bVar.h(false);
                }
                if (bVar.f != gravity) {
                    bVar.f = gravity;
                    bVar.h(false);
                }
                if (this.f2112d != null) {
                    boolean e2 = l.e(this);
                    int i11 = rect.bottom;
                    Rect rect2 = this.f2106W;
                    rect2.bottom = i11;
                    int i12 = this.f2098O;
                    if (i12 == 1) {
                        rect2.left = g(rect.left, e2);
                        rect2.top = rect.top + this.f2099P;
                        rect2.right = h(rect.right, e2);
                    } else if (i12 != 2) {
                        rect2.left = g(rect.left, e2);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, e2);
                    } else {
                        rect2.left = this.f2112d.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.f2112d.getPaddingRight();
                    }
                    int i13 = rect2.left;
                    int i14 = rect2.top;
                    int i15 = rect2.right;
                    int i16 = rect2.bottom;
                    Rect rect3 = bVar.f4797d;
                    if (!(rect3.left == i13 && rect3.top == i14 && rect3.right == i15 && rect3.bottom == i16)) {
                        rect3.set(i13, i14, i15, i16);
                        bVar.f4778M = true;
                    }
                    if (this.f2112d != null) {
                        TextPaint textPaint = bVar.f4780O;
                        textPaint.setTextSize(bVar.f4802h);
                        textPaint.setTypeface(bVar.f4815u);
                        textPaint.setLetterSpacing(bVar.f4788W);
                        float f2 = -textPaint.ascent();
                        rect2.left = this.f2112d.getCompoundPaddingLeft() + rect.left;
                        if (this.f2098O != 1 || this.f2112d.getMinLines() > 1) {
                            i6 = rect.top + this.f2112d.getCompoundPaddingTop();
                        } else {
                            i6 = (int) (((float) rect.centerY()) - (f2 / 2.0f));
                        }
                        rect2.top = i6;
                        rect2.right = rect.right - this.f2112d.getCompoundPaddingRight();
                        if (this.f2098O != 1 || this.f2112d.getMinLines() > 1) {
                            i7 = rect.bottom - this.f2112d.getCompoundPaddingBottom();
                        } else {
                            i7 = (int) (((float) rect2.top) + f2);
                        }
                        rect2.bottom = i7;
                        int i17 = rect2.left;
                        int i18 = rect2.top;
                        int i19 = rect2.right;
                        Rect rect4 = bVar.f4795c;
                        if (!(rect4.left == i17 && rect4.top == i18 && rect4.right == i19 && rect4.bottom == i7)) {
                            rect4.set(i17, i18, i19, i7);
                            bVar.f4778M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.f2144u0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f2086B0;
        s sVar = this.f2110c;
        if (!z2) {
            sVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2086B0 = true;
        }
        if (!(this.f2141t == null || (editText = this.f2112d) == null)) {
            this.f2141t.setGravity(editText.getGravity());
            this.f2141t.setPadding(this.f2112d.getCompoundPaddingLeft(), this.f2112d.getCompoundPaddingTop(), this.f2112d.getCompoundPaddingRight(), this.f2112d.getCompoundPaddingBottom());
        }
        sVar.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof I)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        I i2 = (I) parcelable;
        super.onRestoreInstanceState(i2.f);
        setError(i2.f278h);
        if (i2.f279i) {
            post(new E(0, this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [E0.k, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != this.f2096M) {
            c cVar = this.f2095L.f152e;
            RectF rectF = this.f2108a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2095L.f.a(rectF);
            float a4 = this.f2095L.f154h.a(rectF);
            float a5 = this.f2095L.f153g.a(rectF);
            k kVar = this.f2095L;
            i iVar = kVar.f149a;
            i iVar2 = kVar.b;
            i iVar3 = kVar.f151d;
            i iVar4 = kVar.f150c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            E0.j.b(iVar2);
            E0.j.b(iVar);
            E0.j.b(iVar4);
            E0.j.b(iVar3);
            E0.a aVar = new E0.a(a3);
            E0.a aVar2 = new E0.a(a2);
            E0.a aVar3 = new E0.a(a5);
            E0.a aVar4 = new E0.a(a4);
            ? obj = new Object();
            obj.f149a = iVar2;
            obj.b = iVar;
            obj.f150c = iVar3;
            obj.f151d = iVar4;
            obj.f152e = aVar;
            obj.f = aVar2;
            obj.f153g = aVar4;
            obj.f154h = aVar3;
            obj.f155i = eVar;
            obj.f156j = eVar2;
            obj.f157k = eVar3;
            obj.f158l = eVar4;
            this.f2096M = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [H0.I, android.os.Parcelable, Q.b] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? bVar = new Q.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f278h = getError();
        }
        s sVar = this.f2110c;
        if (sVar.f326i == 0 || !sVar.f324g.f2043d) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.f279i = z2;
        return bVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2083A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue h02 = i.h0(context, R.attr.MT_Bin);
            if (h02 != null) {
                int i2 = h02.resourceId;
                if (i2 != 0) {
                    colorStateList2 = C0486a.g(context, i2);
                } else {
                    int i3 = h02.data;
                    if (i3 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i3);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2112d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = i.y0(this.f2112d.getTextCursorDrawable()).mutate();
            if ((m() || (this.f2131o != null && this.f2128m)) && (colorStateList = this.f2085B) != null) {
                colorStateList2 = colorStateList;
            }
            B.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f2112d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            H0.B r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f2112d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f2111c0
            if (r6 == 0) goto L_0x003b
            int r6 = r10.f2113d0
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2111c0 = r6
            r10.f2113d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.f2112d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f2111c0
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.f2112d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.f2111c0
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.f2112d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f2112d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.f2111c0 = r2
        L_0x0076:
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            H0.s r6 = r10.f2110c
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.f326i
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.f333p
            if (r7 == 0) goto L_0x010d
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x010d
            k.h0 r7 = r6.f334q
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.f2112d
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.f321c
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.f326i
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f324g
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.f2112d
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f2115f0
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.f2117g0
            if (r8 == r7) goto L_0x00eb
            r10.f2117g0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.f2112d
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f2115f0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2115f0 = r6
            r10.f2117g0 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f2115f0
            if (r3 == r6) goto L_0x012f
            r10.f2119h0 = r3
            android.widget.EditText r0 = r10.f2112d
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        L_0x010d:
            android.graphics.drawable.ColorDrawable r6 = r10.f2115f0
            if (r6 == 0) goto L_0x012f
            android.widget.EditText r6 = r10.f2112d
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f2115f0
            if (r3 != r7) goto L_0x012b
            android.widget.EditText r0 = r10.f2112d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f2119h0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012c
        L_0x012b:
            r5 = r0
        L_0x012c:
            r10.f2115f0 = r2
            return r5
        L_0x012f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C0245h0 h0Var;
        EditText editText = this.f2112d;
        if (editText != null && this.f2098O == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = C0268t0.f3566a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C0267t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f2128m || (h0Var = this.f2131o) == null) {
                i.m(mutate);
                this.f2112d.refreshDrawableState();
            } else {
                mutate.setColorFilter(C0267t.c(h0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.f2112d;
        if (editText != null && this.f2089F != null) {
            if ((this.f2092I || editText.getBackground() == null) && this.f2098O != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f2112d;
                WeakHashMap weakHashMap = O.f393a;
                editText2.setBackground(editTextBoxBackground);
                this.f2092I = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f2104U != i2) {
            this.f2104U = i2;
            this.f2132o0 = i2;
            this.f2136q0 = i2;
            this.f2138r0 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(C0486a.d(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2132o0 = defaultColor;
        this.f2104U = defaultColor;
        this.f2134p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2136q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f2138r0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.f2098O) {
            this.f2098O = i2;
            if (this.f2112d != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f2099P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        E0.j e2 = this.f2095L.e();
        c cVar = this.f2095L.f152e;
        i u2 = i.u(i2);
        e2.f139a = u2;
        E0.j.b(u2);
        e2.f142e = cVar;
        c cVar2 = this.f2095L.f;
        i u3 = i.u(i2);
        e2.b = u3;
        E0.j.b(u3);
        e2.f = cVar2;
        c cVar3 = this.f2095L.f154h;
        i u4 = i.u(i2);
        e2.f141d = u4;
        E0.j.b(u4);
        e2.f144h = cVar3;
        c cVar4 = this.f2095L.f153g;
        i u5 = i.u(i2);
        e2.f140c = u5;
        E0.j.b(u5);
        e2.f143g = cVar4;
        this.f2095L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2129m0 != i2) {
            this.f2129m0 = i2;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2125k0 = colorStateList.getDefaultColor();
            this.f2140s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2127l0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f2129m0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f2129m0 != colorStateList.getDefaultColor()) {
            this.f2129m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f2101R = i2;
        x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f2102S = i2;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2124k != z2) {
            Editable editable = null;
            w wVar = this.f2122j;
            if (z2) {
                C0245h0 h0Var = new C0245h0(getContext(), (AttributeSet) null);
                this.f2131o = h0Var;
                h0Var.setId(R.id.MT_Bin);
                Typeface typeface = this.f2109b0;
                if (typeface != null) {
                    this.f2131o.setTypeface(typeface);
                }
                this.f2131o.setMaxLines(1);
                wVar.a(this.f2131o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2131o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.MT_Bin));
                o();
                if (this.f2131o != null) {
                    EditText editText = this.f2112d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                wVar.g(this.f2131o, 2);
                this.f2131o = null;
            }
            this.f2124k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        Editable editable;
        if (this.f2126l != i2) {
            if (i2 > 0) {
                this.f2126l = i2;
            } else {
                this.f2126l = -1;
            }
            if (this.f2124k && this.f2131o != null) {
                EditText editText = this.f2112d;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2133p != i2) {
            this.f2133p = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2153z != colorStateList) {
            this.f2153z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2135q != i2) {
            this.f2135q = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2151y != colorStateList) {
            this.f2151y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2083A != colorStateList) {
            this.f2083A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2085B != colorStateList) {
            this.f2085B = colorStateList;
            if (m() || (this.f2131o != null && this.f2128m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2121i0 = colorStateList;
        this.f2123j0 = colorStateList;
        if (this.f2112d != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2110c.f324g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2110c.f324g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        s sVar = this.f2110c;
        CharSequence text = i2 != 0 ? sVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = sVar.f324g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        s sVar = this.f2110c;
        Drawable v2 = i2 != 0 ? Q0.l.v(sVar.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = sVar.f324g;
        checkableImageButton.setImageDrawable(v2);
        if (v2 != null) {
            ColorStateList colorStateList = sVar.f328k;
            PorterDuff.Mode mode = sVar.f329l;
            TextInputLayout textInputLayout = sVar.f320a;
            i.e(textInputLayout, checkableImageButton, colorStateList, mode);
            i.g0(textInputLayout, checkableImageButton, sVar.f328k);
        }
    }

    public void setEndIconMinSize(int i2) {
        s sVar = this.f2110c;
        if (i2 < 0) {
            sVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i2 != sVar.f330m) {
            sVar.f330m = i2;
            CheckableImageButton checkableImageButton = sVar.f324g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = sVar.f321c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f2110c.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f2110c;
        View.OnLongClickListener onLongClickListener = sVar.f332o;
        CheckableImageButton checkableImageButton = sVar.f324g;
        checkableImageButton.setOnClickListener(onClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f2110c;
        sVar.f332o = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f324g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f2110c;
        sVar.f331n = scaleType;
        sVar.f324g.setScaleType(scaleType);
        sVar.f321c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        s sVar = this.f2110c;
        if (sVar.f328k != colorStateList) {
            sVar.f328k = colorStateList;
            i.e(sVar.f320a, sVar.f324g, colorStateList, sVar.f329l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f2110c;
        if (sVar.f329l != mode) {
            sVar.f329l = mode;
            i.e(sVar.f320a, sVar.f324g, sVar.f328k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2110c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        w wVar = this.f2122j;
        if (!wVar.f364q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            wVar.c();
            wVar.f363p = charSequence;
            wVar.f365r.setText(charSequence);
            int i2 = wVar.f361n;
            if (i2 != 1) {
                wVar.f362o = 1;
            }
            wVar.i(i2, wVar.f362o, wVar.h(wVar.f365r, charSequence));
            return;
        }
        wVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        w wVar = this.f2122j;
        wVar.f367t = i2;
        C0245h0 h0Var = wVar.f365r;
        if (h0Var != null) {
            WeakHashMap weakHashMap = O.f393a;
            h0Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        w wVar = this.f2122j;
        wVar.f366s = charSequence;
        C0245h0 h0Var = wVar.f365r;
        if (h0Var != null) {
            h0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        w wVar = this.f2122j;
        if (wVar.f364q != z2) {
            wVar.c();
            TextInputLayout textInputLayout = wVar.f355h;
            if (z2) {
                C0245h0 h0Var = new C0245h0(wVar.f354g, (AttributeSet) null);
                wVar.f365r = h0Var;
                h0Var.setId(R.id.MT_Bin);
                wVar.f365r.setTextAlignment(5);
                Typeface typeface = wVar.f349B;
                if (typeface != null) {
                    wVar.f365r.setTypeface(typeface);
                }
                int i2 = wVar.f368u;
                wVar.f368u = i2;
                C0245h0 h0Var2 = wVar.f365r;
                if (h0Var2 != null) {
                    textInputLayout.l(h0Var2, i2);
                }
                ColorStateList colorStateList = wVar.f369v;
                wVar.f369v = colorStateList;
                C0245h0 h0Var3 = wVar.f365r;
                if (!(h0Var3 == null || colorStateList == null)) {
                    h0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = wVar.f366s;
                wVar.f366s = charSequence;
                C0245h0 h0Var4 = wVar.f365r;
                if (h0Var4 != null) {
                    h0Var4.setContentDescription(charSequence);
                }
                int i3 = wVar.f367t;
                wVar.f367t = i3;
                C0245h0 h0Var5 = wVar.f365r;
                if (h0Var5 != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    h0Var5.setAccessibilityLiveRegion(i3);
                }
                wVar.f365r.setVisibility(4);
                wVar.a(wVar.f365r, 0);
            } else {
                wVar.f();
                wVar.g(wVar.f365r, 0);
                wVar.f365r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            wVar.f364q = z2;
        }
    }

    public void setErrorIconDrawable(int i2) {
        s sVar = this.f2110c;
        sVar.i(i2 != 0 ? Q0.l.v(sVar.getContext(), i2) : null);
        i.g0(sVar.f320a, sVar.f321c, sVar.f322d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f2110c;
        CheckableImageButton checkableImageButton = sVar.f321c;
        View.OnLongClickListener onLongClickListener = sVar.f;
        checkableImageButton.setOnClickListener(onClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f2110c;
        sVar.f = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f321c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        s sVar = this.f2110c;
        if (sVar.f322d != colorStateList) {
            sVar.f322d = colorStateList;
            i.e(sVar.f320a, sVar.f321c, colorStateList, sVar.f323e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f2110c;
        if (sVar.f323e != mode) {
            sVar.f323e = mode;
            i.e(sVar.f320a, sVar.f321c, sVar.f322d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        w wVar = this.f2122j;
        wVar.f368u = i2;
        C0245h0 h0Var = wVar.f365r;
        if (h0Var != null) {
            wVar.f355h.l(h0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        w wVar = this.f2122j;
        wVar.f369v = colorStateList;
        C0245h0 h0Var = wVar.f365r;
        if (h0Var != null && colorStateList != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2148w0 != z2) {
            this.f2148w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w wVar = this.f2122j;
        if (!isEmpty) {
            if (!wVar.f371x) {
                setHelperTextEnabled(true);
            }
            wVar.c();
            wVar.f370w = charSequence;
            wVar.f372y.setText(charSequence);
            int i2 = wVar.f361n;
            if (i2 != 2) {
                wVar.f362o = 2;
            }
            wVar.i(i2, wVar.f362o, wVar.h(wVar.f372y, charSequence));
        } else if (wVar.f371x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        w wVar = this.f2122j;
        wVar.f348A = colorStateList;
        C0245h0 h0Var = wVar.f372y;
        if (h0Var != null && colorStateList != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        w wVar = this.f2122j;
        if (wVar.f371x != z2) {
            wVar.c();
            if (z2) {
                C0245h0 h0Var = new C0245h0(wVar.f354g, (AttributeSet) null);
                wVar.f372y = h0Var;
                h0Var.setId(R.id.MT_Bin);
                wVar.f372y.setTextAlignment(5);
                Typeface typeface = wVar.f349B;
                if (typeface != null) {
                    wVar.f372y.setTypeface(typeface);
                }
                wVar.f372y.setVisibility(4);
                wVar.f372y.setAccessibilityLiveRegion(1);
                int i2 = wVar.f373z;
                wVar.f373z = i2;
                C0245h0 h0Var2 = wVar.f372y;
                if (h0Var2 != null) {
                    i.s0(h0Var2, i2);
                }
                ColorStateList colorStateList = wVar.f348A;
                wVar.f348A = colorStateList;
                C0245h0 h0Var3 = wVar.f372y;
                if (!(h0Var3 == null || colorStateList == null)) {
                    h0Var3.setTextColor(colorStateList);
                }
                wVar.a(wVar.f372y, 1);
                wVar.f372y.setAccessibilityDelegate(new v(wVar));
            } else {
                wVar.c();
                int i3 = wVar.f361n;
                if (i3 == 2) {
                    wVar.f362o = 0;
                }
                wVar.i(i3, wVar.f362o, wVar.h(wVar.f372y, ""));
                wVar.g(wVar.f372y, 1);
                wVar.f372y = null;
                TextInputLayout textInputLayout = wVar.f355h;
                textInputLayout.r();
                textInputLayout.x();
            }
            wVar.f371x = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        w wVar = this.f2122j;
        wVar.f373z = i2;
        C0245h0 h0Var = wVar.f372y;
        if (h0Var != null) {
            i.s0(h0Var, i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2087C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2150x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2087C) {
            this.f2087C = z2;
            if (!z2) {
                this.f2088E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f2112d.getHint())) {
                    this.f2112d.setHint(this.D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f2112d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f2112d.setHint((CharSequence) null);
                }
                this.f2088E = true;
            }
            if (this.f2112d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C0500b bVar = this.f2146v0;
        TextInputLayout textInputLayout = bVar.f4792a;
        d dVar = new d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dVar.f67j;
        if (colorStateList != null) {
            bVar.f4805k = colorStateList;
        }
        float f2 = dVar.f68k;
        if (f2 != 0.0f) {
            bVar.f4803i = f2;
        }
        ColorStateList colorStateList2 = dVar.f60a;
        if (colorStateList2 != null) {
            bVar.f4786U = colorStateList2;
        }
        bVar.f4784S = dVar.f63e;
        bVar.f4785T = dVar.f;
        bVar.f4783R = dVar.f64g;
        bVar.f4787V = dVar.f66i;
        B0.a aVar = bVar.f4819y;
        if (aVar != null) {
            aVar.f53q = true;
        }
        C0241f0 f0Var = new C0241f0((Object) bVar);
        dVar.a();
        bVar.f4819y = new B0.a(f0Var, dVar.f71n);
        dVar.c(textInputLayout.getContext(), bVar.f4819y);
        bVar.h(false);
        this.f2123j0 = bVar.f4805k;
        if (this.f2112d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2123j0 != colorStateList) {
            if (this.f2121i0 == null) {
                C0500b bVar = this.f2146v0;
                if (bVar.f4805k != colorStateList) {
                    bVar.f4805k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2123j0 = colorStateList;
            if (this.f2112d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(H h2) {
        this.f2130n = h2;
    }

    public void setMaxEms(int i2) {
        this.f2116g = i2;
        EditText editText = this.f2112d;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f2120i = i2;
        EditText editText = this.f2112d;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f = i2;
        EditText editText = this.f2112d;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f2118h = i2;
        EditText editText = this.f2112d;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        s sVar = this.f2110c;
        sVar.f324g.setContentDescription(i2 != 0 ? sVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        s sVar = this.f2110c;
        sVar.f324g.setImageDrawable(i2 != 0 ? Q0.l.v(sVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        s sVar = this.f2110c;
        if (z2 && sVar.f326i != 1) {
            sVar.g(1);
        } else if (!z2) {
            sVar.g(0);
        } else {
            sVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        s sVar = this.f2110c;
        sVar.f328k = colorStateList;
        i.e(sVar.f320a, sVar.f324g, colorStateList, sVar.f329l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        s sVar = this.f2110c;
        sVar.f329l = mode;
        i.e(sVar.f320a, sVar.f324g, sVar.f328k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f2141t == null) {
            C0245h0 h0Var = new C0245h0(getContext(), (AttributeSet) null);
            this.f2141t = h0Var;
            h0Var.setId(R.id.MT_Bin);
            this.f2141t.setImportantForAccessibility(2);
            C0157h d2 = d();
            this.f2147w = d2;
            d2.f2665g = 67;
            this.f2149x = d();
            setPlaceholderTextAppearance(this.f2145v);
            setPlaceholderTextColor(this.f2143u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2139s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2137r = charSequence;
        }
        EditText editText = this.f2112d;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2145v = i2;
        C0245h0 h0Var = this.f2141t;
        if (h0Var != null) {
            i.s0(h0Var, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2143u != colorStateList) {
            this.f2143u = colorStateList;
            C0245h0 h0Var = this.f2141t;
            if (h0Var != null && colorStateList != null) {
                h0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        B b2 = this.b;
        b2.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        b2.f266c = charSequence2;
        b2.b.setText(charSequence);
        b2.e();
    }

    public void setPrefixTextAppearance(int i2) {
        i.s0(this.b.b, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2089F;
        if (gVar != null && gVar.f118a.f103a != kVar) {
            this.f2095L = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.b.f267d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.f267d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? Q0.l.v(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        B b2 = this.b;
        if (i2 < 0) {
            b2.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i2 != b2.f269g) {
            b2.f269g = i2;
            CheckableImageButton checkableImageButton = b2.f267d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        B b2 = this.b;
        View.OnLongClickListener onLongClickListener = b2.f271i;
        CheckableImageButton checkableImageButton = b2.f267d;
        checkableImageButton.setOnClickListener(onClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        B b2 = this.b;
        b2.f271i = onLongClickListener;
        CheckableImageButton checkableImageButton = b2.f267d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i.n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        B b2 = this.b;
        b2.f270h = scaleType;
        b2.f267d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        B b2 = this.b;
        if (b2.f268e != colorStateList) {
            b2.f268e = colorStateList;
            i.e(b2.f265a, b2.f267d, colorStateList, b2.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        B b2 = this.b;
        if (b2.f != mode) {
            b2.f = mode;
            i.e(b2.f265a, b2.f267d, b2.f268e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        s sVar = this.f2110c;
        sVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        sVar.f333p = charSequence2;
        sVar.f334q.setText(charSequence);
        sVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        i.s0(this.f2110c.f334q, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2110c.f334q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(G g2) {
        EditText editText = this.f2112d;
        if (editText != null) {
            O.p(editText, g2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2109b0) {
            this.f2109b0 = typeface;
            this.f2146v0.m(typeface);
            w wVar = this.f2122j;
            if (typeface != wVar.f349B) {
                wVar.f349B = typeface;
                C0245h0 h0Var = wVar.f365r;
                if (h0Var != null) {
                    h0Var.setTypeface(typeface);
                }
                C0245h0 h0Var2 = wVar.f372y;
                if (h0Var2 != null) {
                    h0Var2.setTypeface(typeface);
                }
            }
            C0245h0 h0Var3 = this.f2131o;
            if (h0Var3 != null) {
                h0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2098O != 1) {
            FrameLayout frameLayout = this.f2107a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        C0245h0 h0Var;
        ColorStateList colorStateList2;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2112d;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z4 = false;
        } else {
            z4 = true;
        }
        EditText editText2 = this.f2112d;
        if (editText2 == null || !editText2.hasFocus()) {
            z5 = false;
        } else {
            z5 = true;
        }
        ColorStateList colorStateList3 = this.f2121i0;
        C0500b bVar = this.f2146v0;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2121i0;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, this.f2140s0);
            } else {
                i2 = this.f2140s0;
            }
            bVar.i(ColorStateList.valueOf(i2));
        } else if (m()) {
            C0245h0 h0Var2 = this.f2122j.f365r;
            if (h0Var2 != null) {
                colorStateList2 = h0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.f2128m && (h0Var = this.f2131o) != null) {
            bVar.i(h0Var.getTextColors());
        } else if (!(!z5 || (colorStateList = this.f2123j0) == null || bVar.f4805k == colorStateList)) {
            bVar.f4805k = colorStateList;
            bVar.h(false);
        }
        s sVar = this.f2110c;
        B b2 = this.b;
        if (z4 || !this.f2148w0 || (isEnabled() && z5)) {
            if (z3 || this.f2144u0) {
                ValueAnimator valueAnimator = this.f2152y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2152y0.cancel();
                }
                if (!z2 || !this.f2150x0) {
                    bVar.k(1.0f);
                } else {
                    a(1.0f);
                }
                this.f2144u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2112d;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                b2.f272j = false;
                b2.e();
                sVar.f335r = false;
                sVar.n();
            }
        } else if (z3 || !this.f2144u0) {
            ValueAnimator valueAnimator2 = this.f2152y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2152y0.cancel();
            }
            if (!z2 || !this.f2150x0) {
                bVar.k(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && !((C0007h) this.f2089F).f295x.f293q.isEmpty() && e()) {
                ((C0007h) this.f2089F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2144u0 = true;
            C0245h0 h0Var3 = this.f2141t;
            if (h0Var3 != null && this.f2139s) {
                h0Var3.setText((CharSequence) null);
                q.a(this.f2107a, this.f2149x);
                this.f2141t.setVisibility(4);
            }
            b2.f272j = true;
            b2.e();
            sVar.f335r = true;
            sVar.n();
        }
    }

    public final void v(Editable editable) {
        int i2;
        ((C) this.f2130n).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        FrameLayout frameLayout = this.f2107a;
        if (i2 != 0 || this.f2144u0) {
            C0245h0 h0Var = this.f2141t;
            if (h0Var != null && this.f2139s) {
                h0Var.setText((CharSequence) null);
                q.a(frameLayout, this.f2149x);
                this.f2141t.setVisibility(4);
            }
        } else if (this.f2141t != null && this.f2139s && !TextUtils.isEmpty(this.f2137r)) {
            this.f2141t.setText(this.f2137r);
            q.a(frameLayout, this.f2147w);
            this.f2141t.setVisibility(0);
            this.f2141t.bringToFront();
            announceForAccessibility(this.f2137r);
        }
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.f2103T = colorForState2;
        } else if (z3) {
            this.f2103T = colorForState;
        } else {
            this.f2103T = defaultColor;
        }
    }

    public final void x() {
        boolean z2;
        C0245h0 h0Var;
        EditText editText;
        EditText editText2;
        if (this.f2089F != null && this.f2098O != 0) {
            boolean z3 = false;
            if (isFocused() || ((editText2 = this.f2112d) != null && editText2.hasFocus())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (isHovered() || ((editText = this.f2112d) != null && editText.isHovered())) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.f2103T = this.f2140s0;
            } else if (m()) {
                if (this.n0 != null) {
                    w(z2, z3);
                } else {
                    this.f2103T = getErrorCurrentTextColors();
                }
            } else if (!this.f2128m || (h0Var = this.f2131o) == null) {
                if (z2) {
                    this.f2103T = this.f2129m0;
                } else if (z3) {
                    this.f2103T = this.f2127l0;
                } else {
                    this.f2103T = this.f2125k0;
                }
            } else if (this.n0 != null) {
                w(z2, z3);
            } else {
                this.f2103T = h0Var.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            s sVar = this.f2110c;
            sVar.l();
            CheckableImageButton checkableImageButton = sVar.f321c;
            ColorStateList colorStateList = sVar.f322d;
            TextInputLayout textInputLayout = sVar.f320a;
            i.g0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = sVar.f328k;
            CheckableImageButton checkableImageButton2 = sVar.f324g;
            i.g0(textInputLayout, checkableImageButton2, colorStateList2);
            if (sVar.b() instanceof n) {
                if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                    i.e(textInputLayout, checkableImageButton2, sVar.f328k, sVar.f329l);
                } else {
                    Drawable mutate = i.y0(checkableImageButton2.getDrawable()).mutate();
                    B.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                }
            }
            B b2 = this.b;
            i.g0(b2.f265a, b2.f267d, b2.f268e);
            if (this.f2098O == 2) {
                int i2 = this.f2100Q;
                if (!z2 || !isEnabled()) {
                    this.f2100Q = this.f2101R;
                } else {
                    this.f2100Q = this.f2102S;
                }
                if (this.f2100Q != i2 && e() && !this.f2144u0) {
                    if (e()) {
                        ((C0007h) this.f2089F).n(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f2098O == 1) {
                if (!isEnabled()) {
                    this.f2104U = this.f2134p0;
                } else if (z3 && !z2) {
                    this.f2104U = this.f2138r0;
                } else if (z2) {
                    this.f2104U = this.f2136q0;
                } else {
                    this.f2104U = this.f2132o0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2110c.f324g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2110c.f324g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2110c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2110c.f324g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        s sVar = this.f2110c;
        CheckableImageButton checkableImageButton = sVar.f324g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = sVar.f328k;
            PorterDuff.Mode mode = sVar.f329l;
            TextInputLayout textInputLayout = sVar.f320a;
            i.e(textInputLayout, checkableImageButton, colorStateList, mode);
            i.g0(textInputLayout, checkableImageButton, sVar.f328k);
        }
    }
}

package r0;

import A.g;
import A.i;
import B.a;
import H0.m;
import O.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.cheatbox.R;
import g0.C0166b;
import g0.C0167c;
import g0.C0169e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C0262q;
import t0.C0486a;
import y0.l;

public final class c extends C0262q {

    /* renamed from: A  reason: collision with root package name */
    public static final int[][] f4408A = {new int[]{16842910, R.attr.MT_Bin}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: B  reason: collision with root package name */
    public static final int f4409B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f4410y = {R.attr.MT_Bin};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f4411z = {R.attr.MT_Bin};

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f4412e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4413g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4414h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4415i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4416j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4417k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f4418l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f4419m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4420n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f4421o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f4422p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f4423q;

    /* renamed from: r  reason: collision with root package name */
    public int f4424r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f4425s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4426t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f4427u;

    /* renamed from: v  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4428v;

    /* renamed from: w  reason: collision with root package name */
    public final C0169e f4429w;

    /* renamed from: x  reason: collision with root package name */
    public final a f4430x;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006e A[Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086 A[Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r3 = 2130903201(0x7f0300a1, float:1.7413213E38)
            r0 = 2131756061(0x7f10041d, float:1.9143019E38)
            android.content.Context r12 = J0.a.a(r12, r13, r3, r0)
            r11.<init>(r12, r13, r3)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.f4412e = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.f = r12
            android.content.Context r12 = r11.getContext()
            java.lang.String r1 = "parser error"
            java.lang.String r2 = "AnimatedVDCompat"
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            r6 = 2
            r7 = 0
            r8 = 1
            r5 = 2131165394(0x7f0700d2, float:1.7945004E38)
            if (r0 < r4) goto L_0x0055
            g0.e r0 = new g0.e
            r0.<init>(r12)
            android.content.res.Resources r1 = r12.getResources()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            java.lang.ThreadLocal r2 = z.C0515n.f4870a
            android.graphics.drawable.Drawable r12 = z.C0510i.a(r1, r5, r12)
            r0.f2811a = r12
            g.f r1 = r0.f
            r12.setCallback(r1)
            g0.d r12 = new g0.d
            android.graphics.drawable.Drawable r1 = r0.f2811a
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r12.<init>(r1)
            goto L_0x0096
        L_0x0055:
            int r0 = g0.C0169e.f2805g
            android.content.res.Resources r0 = r12.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
        L_0x0063:
            int r5 = r0.next()     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            if (r5 == r6) goto L_0x006c
            if (r5 == r8) goto L_0x006c
            goto L_0x0063
        L_0x006c:
            if (r5 != r6) goto L_0x0086
            android.content.res.Resources r5 = r12.getResources()     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            android.content.res.Resources$Theme r9 = r12.getTheme()     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            g0.e r10 = new g0.e     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            r10.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            r10.inflate(r5, r0, r4, r9)     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            r0 = r10
            goto L_0x0096
        L_0x0080:
            r0 = move-exception
            r12 = r0
            goto L_0x008e
        L_0x0083:
            r0 = move-exception
            r12 = r0
            goto L_0x0092
        L_0x0086:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0083, IOException -> 0x0080 }
        L_0x008e:
            android.util.Log.e(r2, r1, r12)
            goto L_0x0095
        L_0x0092:
            android.util.Log.e(r2, r1, r12)
        L_0x0095:
            r0 = r7
        L_0x0096:
            r11.f4429w = r0
            r0.a r12 = new r0.a
            r12.<init>(r11)
            r11.f4430x = r12
            android.content.Context r0 = r11.getContext()
            android.graphics.drawable.Drawable r12 = A.i.F(r11)
            r11.f4418l = r12
            android.content.res.ColorStateList r12 = r11.getSuperButtonTintList()
            r11.f4421o = r12
            r11.setSupportButtonTintList(r7)
            int[] r2 = j0.C0219a.f3187n
            r12 = 0
            int[] r5 = new int[r12]
            r4 = 2131756061(0x7f10041d, float:1.9143019E38)
            y0.l.a(r0, r13, r3, r4)
            r1 = r13
            y0.l.b(r0, r1, r2, r3, r4, r5)
            N.g r13 = new N.g
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r13.<init>((android.content.Context) r0, (android.content.res.TypedArray) r1)
            android.graphics.drawable.Drawable r2 = r13.p(r6)
            r11.f4419m = r2
            android.graphics.drawable.Drawable r2 = r11.f4418l
            if (r2 == 0) goto L_0x0106
            r2 = 2130903584(0x7f030220, float:1.741399E38)
            boolean r2 = A.i.i0(r0, r2, r12)
            if (r2 == 0) goto L_0x0106
            int r2 = r1.getResourceId(r12, r12)
            int r3 = r1.getResourceId(r8, r12)
            int r4 = f4409B
            if (r2 != r4) goto L_0x0106
            if (r3 != 0) goto L_0x0106
            super.setButtonDrawable((android.graphics.drawable.Drawable) r7)
            r2 = 2131165393(0x7f0700d1, float:1.7945002E38)
            android.graphics.drawable.Drawable r2 = Q0.l.v(r0, r2)
            r11.f4418l = r2
            r11.f4420n = r8
            android.graphics.drawable.Drawable r2 = r11.f4419m
            if (r2 != 0) goto L_0x0106
            r2 = 2131165395(0x7f0700d3, float:1.7945006E38)
            android.graphics.drawable.Drawable r2 = Q0.l.v(r0, r2)
            r11.f4419m = r2
        L_0x0106:
            r2 = 3
            android.content.res.ColorStateList r0 = A.i.G(r0, r13, r2)
            r11.f4422p = r0
            r0 = 4
            r2 = -1
            int r0 = r1.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = y0.l.g(r0, r2)
            r11.f4423q = r0
            r0 = 10
            boolean r0 = r1.getBoolean(r0, r12)
            r11.f4414h = r0
            r0 = 6
            boolean r0 = r1.getBoolean(r0, r8)
            r11.f4415i = r0
            r0 = 9
            boolean r0 = r1.getBoolean(r0, r12)
            r11.f4416j = r0
            r0 = 8
            java.lang.CharSequence r0 = r1.getText(r0)
            r11.f4417k = r0
            r0 = 7
            boolean r2 = r1.hasValue(r0)
            if (r2 == 0) goto L_0x0148
            int r12 = r1.getInt(r0, r12)
            r11.setCheckedState(r12)
        L_0x0148:
            r13.F()
            r11.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i2 = this.f4424r;
        if (i2 == 1) {
            return getResources().getString(R.string.MT_Bin);
        }
        if (i2 == 0) {
            return getResources().getString(R.string.MT_Bin);
        }
        return getResources().getString(R.string.MT_Bin);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4413g == null) {
            int f2 = C0486a.f(this, R.attr.MT_Bin);
            int f3 = C0486a.f(this, R.attr.MT_Bin);
            int f4 = C0486a.f(this, R.attr.MT_Bin);
            int f5 = C0486a.f(this, R.attr.MT_Bin);
            this.f4413g = new ColorStateList(f4408A, new int[]{C0486a.o(f4, f3, 1.0f), C0486a.o(f4, f2, 1.0f), C0486a.o(f4, f5, 0.54f), C0486a.o(f4, f5, 0.38f), C0486a.o(f4, f5, 0.38f)});
        }
        return this.f4413g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4421o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m mVar;
        this.f4418l = C0486a.c(this.f4418l, this.f4421o, b.b(this));
        this.f4419m = C0486a.c(this.f4419m, this.f4422p, this.f4423q);
        if (this.f4420n) {
            C0169e eVar = this.f4429w;
            if (eVar != null) {
                Drawable drawable = eVar.f2811a;
                a aVar = this.f4430x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f4407a == null) {
                        aVar.f4407a = new C0166b(aVar);
                    }
                    boolean unused = animatedVectorDrawable.unregisterAnimationCallback(aVar.f4407a);
                }
                ArrayList arrayList = eVar.f2808e;
                C0167c cVar = eVar.b;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (eVar.f2808e.size() == 0 && (mVar = eVar.f2807d) != null) {
                        cVar.b.removeListener(mVar);
                        eVar.f2807d = null;
                    }
                }
                Drawable drawable2 = eVar.f2811a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f4407a == null) {
                        aVar.f4407a = new C0166b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4407a);
                } else if (aVar != null) {
                    if (eVar.f2808e == null) {
                        eVar.f2808e = new ArrayList();
                    }
                    if (!eVar.f2808e.contains(aVar)) {
                        eVar.f2808e.add(aVar);
                        if (eVar.f2807d == null) {
                            eVar.f2807d = new m(3, (Object) eVar);
                        }
                        cVar.b.addListener(eVar.f2807d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f4418l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.MT_Bin, R.id.MT_Bin, eVar, false);
                    ((AnimatedStateListDrawable) this.f4418l).addTransition(R.id.MT_Bin, R.id.MT_Bin, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.f4418l;
        if (!(drawable4 == null || (colorStateList2 = this.f4421o) == null)) {
            a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f4419m;
        if (!(drawable5 == null || (colorStateList = this.f4422p) == null)) {
            a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f4418l;
        Drawable drawable7 = this.f4419m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f2 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * ((float) intrinsicHeight));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
                drawable6 = layerDrawable;
            } else {
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable2.setLayerInset(1, max, max2, max, max2);
                drawable6 = layerDrawable2;
            }
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f4418l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4419m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4422p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4423q;
    }

    public ColorStateList getButtonTintList() {
        return this.f4421o;
    }

    public int getCheckedState() {
        return this.f4424r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4417k;
    }

    public final boolean isChecked() {
        if (this.f4424r == 1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4414h && this.f4421o == null && this.f4422p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4410y);
        }
        if (this.f4416j) {
            View.mergeDrawableStates(onCreateDrawableState, f4411z);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i4 = onCreateDrawableState[i3];
            if (i4 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i4 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i3] = 16842912;
                break;
            } else {
                i3++;
            }
        }
        this.f4425s = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable F2;
        int i2;
        if (!this.f4415i || !TextUtils.isEmpty(getText()) || (F2 = i.F(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (l.e(this)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int width = ((getWidth() - F2.getIntrinsicWidth()) / 2) * i2;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = F2.getBounds();
            a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4416j) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f4417k);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, r0.b] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(Q0.l.v(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4419m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(Q0.l.v(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4422p != colorStateList) {
            this.f4422p = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4423q != mode) {
            this.f4423q = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4421o != colorStateList) {
            this.f4421o = colorStateList;
            a();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f4415i = z2;
    }

    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        boolean z2;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4424r != i2) {
            this.f4424r = i2;
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setChecked(z2);
            refreshDrawableState();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && this.f4427u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f4426t) {
                this.f4426t = true;
                LinkedHashSet linkedHashSet = this.f;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw g.e(it);
                    }
                }
                if (!(this.f4424r == 2 || (onCheckedChangeListener = this.f4428v) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i3 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f4426t = false;
            }
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4417k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getResources().getText(i2);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4416j != z2) {
            this.f4416j = z2;
            refreshDrawableState();
            Iterator it = this.f4412e.iterator();
            if (it.hasNext()) {
                throw g.e(it);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4428v = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f4427u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f4414h = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f4418l = drawable;
        this.f4420n = false;
        a();
    }
}

package p0;

import E0.f;
import E0.g;
import E0.k;
import E0.v;
import I.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.cheatbox.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import t0.C0486a;

public final class c {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f3778u = true;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f3779v;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f3780a;
    public k b;

    /* renamed from: c  reason: collision with root package name */
    public int f3781c;

    /* renamed from: d  reason: collision with root package name */
    public int f3782d;

    /* renamed from: e  reason: collision with root package name */
    public int f3783e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3784g;

    /* renamed from: h  reason: collision with root package name */
    public int f3785h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f3786i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3787j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3788k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3789l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f3790m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3791n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3792o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3793p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3794q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3795r = true;

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f3796s;

    /* renamed from: t  reason: collision with root package name */
    public int f3797t;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i2 > 22) {
            z2 = false;
        }
        f3779v = z2;
    }

    public c(MaterialButton materialButton, k kVar) {
        this.f3780a = materialButton;
        this.b = kVar;
    }

    public final v a() {
        LayerDrawable layerDrawable = this.f3796s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f3796s.getNumberOfLayers() > 2) {
            return (v) this.f3796s.getDrawable(2);
        }
        return (v) this.f3796s.getDrawable(1);
    }

    public final g b(boolean z2) {
        LayerDrawable layerDrawable = this.f3796s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f3778u) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f3796s.getDrawable(0)).getDrawable()).getDrawable(z2 ^ true ? 1 : 0);
        }
        return (g) this.f3796s.getDrawable(z2 ^ true ? 1 : 0);
    }

    public final void c(k kVar) {
        this.b = kVar;
        if (!f3779v || this.f3792o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(kVar);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(kVar);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = O.f393a;
        MaterialButton materialButton = this.f3780a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = O.f393a;
        MaterialButton materialButton = this.f3780a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f3783e;
        int i5 = this.f;
        this.f = i3;
        this.f3783e = i2;
        if (!this.f3792o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.drawable.Drawable$ConstantState, C0.a] */
    /* JADX WARNING: type inference failed for: r6v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r14 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            E0.g r3 = new E0.g
            E0.k r4 = r14.b
            r3.<init>((E0.k) r4)
            com.google.android.material.button.MaterialButton r4 = r14.f3780a
            android.content.Context r5 = r4.getContext()
            r3.h(r5)
            android.content.res.ColorStateList r5 = r14.f3787j
            B.a.h(r3, r5)
            android.graphics.PorterDuff$Mode r5 = r14.f3786i
            if (r5 == 0) goto L_0x001f
            B.a.i(r3, r5)
        L_0x001f:
            int r5 = r14.f3785h
            float r5 = (float) r5
            android.content.res.ColorStateList r6 = r14.f3788k
            E0.f r7 = r3.f118a
            r7.f110j = r5
            r3.invalidateSelf()
            E0.f r5 = r3.f118a
            android.content.res.ColorStateList r7 = r5.f105d
            if (r7 == r6) goto L_0x003a
            r5.f105d = r6
            int[] r5 = r3.getState()
            r3.onStateChange(r5)
        L_0x003a:
            E0.g r5 = new E0.g
            E0.k r6 = r14.b
            r5.<init>((E0.k) r6)
            r5.setTint(r2)
            int r6 = r14.f3785h
            float r6 = (float) r6
            boolean r7 = r14.f3791n
            if (r7 == 0) goto L_0x0053
            r7 = 2130903305(0x7f030109, float:1.7413424E38)
            int r7 = t0.C0486a.f(r4, r7)
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            E0.f r8 = r5.f118a
            r8.f110j = r6
            r5.invalidateSelf()
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r7)
            E0.f r7 = r5.f118a
            android.content.res.ColorStateList r8 = r7.f105d
            if (r8 == r6) goto L_0x006e
            r7.f105d = r6
            int[] r6 = r5.getState()
            r5.onStateChange(r6)
        L_0x006e:
            boolean r6 = f3778u
            if (r6 == 0) goto L_0x00a7
            E0.g r6 = new E0.g
            E0.k r7 = r14.b
            r6.<init>((E0.k) r7)
            r14.f3790m = r6
            r7 = -1
            B.a.g(r6, r7)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f3789l
            android.content.res.ColorStateList r7 = C0.d.a(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r1[r2] = r5
            r1[r0] = r3
            r9.<init>(r1)
            android.graphics.drawable.InsetDrawable r8 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f3781c
            int r11 = r14.f3783e
            int r12 = r14.f3782d
            int r13 = r14.f
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r0 = r14.f3790m
            r6.<init>(r7, r8, r0)
            r14.f3796s = r6
            goto L_0x00e7
        L_0x00a7:
            C0.b r6 = new C0.b
            E0.k r7 = r14.b
            C0.a r8 = new C0.a
            E0.g r9 = new E0.g
            r9.<init>((E0.k) r7)
            r8.<init>()
            r8.f72a = r9
            r8.b = r2
            r6.<init>(r8)
            r14.f3790m = r6
            android.content.res.ColorStateList r7 = r14.f3789l
            android.content.res.ColorStateList r7 = C0.d.a(r7)
            B.a.h(r6, r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable r6 = r14.f3790m
            r7 = 3
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
            r7[r2] = r5
            r7[r0] = r3
            r7[r1] = r6
            r9.<init>(r7)
            r14.f3796s = r9
            android.graphics.drawable.InsetDrawable r8 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f3781c
            int r11 = r14.f3783e
            int r12 = r14.f3782d
            int r13 = r14.f
            r8.<init>(r9, r10, r11, r12, r13)
            r6 = r8
        L_0x00e7:
            r4.setInternalBackground(r6)
            E0.g r0 = r14.b(r2)
            if (r0 == 0) goto L_0x00fd
            int r1 = r14.f3797t
            float r1 = (float) r1
            r0.i(r1)
            int[] r1 = r4.getDrawableState()
            r0.setState(r1)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.e():void");
    }

    public final void f() {
        int i2 = 0;
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            ColorStateList colorStateList = this.f3788k;
            b2.f118a.f110j = (float) this.f3785h;
            b2.invalidateSelf();
            f fVar = b2.f118a;
            if (fVar.f105d != colorStateList) {
                fVar.f105d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f2 = (float) this.f3785h;
                if (this.f3791n) {
                    i2 = C0486a.f(this.f3780a, R.attr.MT_Bin);
                }
                b3.f118a.f110j = f2;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                f fVar2 = b3.f118a;
                if (fVar2.f105d != valueOf) {
                    fVar2.f105d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}

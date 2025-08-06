package e;

import U0.i;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.l;
import androidx.activity.u;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c0.C0106d;
import c0.e;
import com.cheatbox.R;
import i.C0186k;

/* renamed from: e.g  reason: case insensitive filesystem */
public final class C0136g extends Dialog implements DialogInterface, C0138i, r, e {

    /* renamed from: a  reason: collision with root package name */
    public t f2513a;
    public final l b;

    /* renamed from: c  reason: collision with root package name */
    public final u f2514c;

    /* renamed from: d  reason: collision with root package name */
    public x f2515d;

    /* renamed from: e  reason: collision with root package name */
    public final y f2516e;
    public final C0135f f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0136g(android.view.ContextThemeWrapper r6, int r7) {
        /*
            r5 = this;
            int r7 = h(r6, r7)
            r0 = 1
            r1 = 2130903392(0x7f030160, float:1.74136E38)
            if (r7 != 0) goto L_0x0019
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x001a
        L_0x0019:
            r2 = r7
        L_0x001a:
            r5.<init>(r6, r2)
            androidx.activity.l r2 = new androidx.activity.l
            r2.<init>(r5)
            r5.b = r2
            androidx.activity.u r2 = new androidx.activity.u
            F0.g r3 = new F0.g
            r4 = 6
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r5.f2514c = r2
            e.y r2 = new e.y
            r2.<init>(r5)
            r5.f2516e = r2
            e.l r2 = r5.c()
            if (r7 != 0) goto L_0x004c
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r6.resolveAttribute(r1, r7, r0)
            int r7 = r7.resourceId
        L_0x004c:
            r6 = r2
            e.x r6 = (e.x) r6
            r6.f2578T = r7
            r2.d()
            e.f r6 = new e.f
            android.content.Context r7 = r5.getContext()
            android.view.Window r0 = r5.getWindow()
            r6.<init>(r7, r5, r0)
            r5.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.C0136g.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static void a(C0136g gVar) {
        i.e("this$0", gVar);
        super.onBackPressed();
    }

    public static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x xVar = (x) c();
        xVar.w();
        ((ViewGroup) xVar.f2560A.findViewById(16908290)).addView(view, layoutParams);
        xVar.f2594m.a(xVar.f2593l.getCallback());
    }

    public final C0106d b() {
        return (C0106d) this.b.f866c;
    }

    public final C0141l c() {
        if (this.f2515d == null) {
            C0122D d2 = C0141l.f2523a;
            this.f2515d = new x(getContext(), getWindow(), this, this);
        }
        return this.f2515d;
    }

    public final void d(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher i2 = getOnBackInvokedDispatcher();
            i.d("onBackInvokedDispatcher", i2);
            u uVar = this.f2514c;
            uVar.getClass();
            uVar.f882e = i2;
            uVar.c(uVar.f883g);
        }
        this.b.b(bundle);
        t tVar = this.f2513a;
        if (tVar == null) {
            tVar = new t(this);
            this.f2513a = tVar;
        }
        tVar.d(C0070l.ON_CREATE);
    }

    public final void dismiss() {
        super.dismiss();
        c().g();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A.i.D(this.f2516e, getWindow().getDecorView(), this, keyEvent);
    }

    public final t e() {
        t tVar = this.f2513a;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f2513a = tVar2;
        return tVar2;
    }

    public final void f(Bundle bundle) {
        c().a();
        d(bundle);
        c().d();
    }

    public final View findViewById(int i2) {
        x xVar = (x) c();
        xVar.w();
        return xVar.f2593l.findViewById(i2);
    }

    public final void g() {
        t tVar = this.f2513a;
        if (tVar == null) {
            tVar = new t(this);
            this.f2513a = tVar;
        }
        tVar.d(C0070l.ON_DESTROY);
        this.f2513a = null;
        super.onStop();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().m(charSequence);
    }

    public final void invalidateOptionsMenu() {
        c().b();
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onBackPressed() {
        this.f2514c.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0285  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r2 = 0
            r3 = 1
            r4 = 0
            r18.f(r19)
            r5 = r18
            e.f r6 = r5.f
            e.g r7 = r6.b
            int r8 = r6.f2506t
            r7.setContentView((int) r8)
            android.view.Window r7 = r6.f2490c
            r8 = 2131231039(0x7f08013f, float:1.8078148E38)
            android.view.View r8 = r7.findViewById(r8)
            r9 = 2131231160(0x7f0801b8, float:1.8078393E38)
            android.view.View r10 = r8.findViewById(r9)
            r11 = 2131230833(0x7f080071, float:1.807773E38)
            android.view.View r12 = r8.findViewById(r11)
            r13 = 2131230810(0x7f08005a, float:1.8077683E38)
            android.view.View r14 = r8.findViewById(r13)
            r15 = 2131230840(0x7f080078, float:1.8077744E38)
            android.view.View r8 = r8.findViewById(r15)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r15 = 131072(0x20000, float:1.83671E-40)
            r7.setFlags(r15, r15)
            r15 = 8
            r8.setVisibility(r15)
            android.view.View r9 = r8.findViewById(r9)
            android.view.View r11 = r8.findViewById(r11)
            android.view.View r13 = r8.findViewById(r13)
            android.view.ViewGroup r9 = e.C0135f.b(r9, r10)
            android.view.ViewGroup r10 = e.C0135f.b(r11, r12)
            android.view.ViewGroup r11 = e.C0135f.b(r13, r14)
            r12 = 2131231075(0x7f080163, float:1.807822E38)
            android.view.View r12 = r7.findViewById(r12)
            androidx.core.widget.NestedScrollView r12 = (androidx.core.widget.NestedScrollView) r12
            r6.f2498l = r12
            r12.setFocusable(r2)
            androidx.core.widget.NestedScrollView r12 = r6.f2498l
            r12.setNestedScrollingEnabled(r2)
            r12 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r6.f2502p = r12
            r13 = -1
            if (r12 != 0) goto L_0x0080
        L_0x007b:
            r16 = 4
            r17 = 2
            goto L_0x00bd
        L_0x0080:
            java.lang.String r14 = r6.f2492e
            if (r14 == 0) goto L_0x0088
            r12.setText(r14)
            goto L_0x007b
        L_0x0088:
            r12.setVisibility(r15)
            androidx.core.widget.NestedScrollView r12 = r6.f2498l
            android.widget.TextView r14 = r6.f2502p
            r12.removeView(r14)
            androidx.appcompat.app.AlertController$RecycleListView r12 = r6.f
            if (r12 == 0) goto L_0x00b6
            androidx.core.widget.NestedScrollView r12 = r6.f2498l
            android.view.ViewParent r12 = r12.getParent()
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            androidx.core.widget.NestedScrollView r14 = r6.f2498l
            int r14 = r12.indexOfChild(r14)
            r12.removeViewAt(r14)
            r16 = 4
            androidx.appcompat.app.AlertController$RecycleListView r0 = r6.f
            r17 = 2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r13, r13)
            r12.addView(r0, r14, r1)
            goto L_0x00bd
        L_0x00b6:
            r16 = 4
            r17 = 2
            r10.setVisibility(r15)
        L_0x00bd:
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r6.f2493g = r0
            com.google.android.material.datepicker.k r1 = r6.f2512z
            r0.setOnClickListener(r1)
            java.lang.String r0 = r6.f2494h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00dc
            android.widget.Button r0 = r6.f2493g
            r0.setVisibility(r15)
            r0 = 0
            goto L_0x00e9
        L_0x00dc:
            android.widget.Button r0 = r6.f2493g
            java.lang.String r12 = r6.f2494h
            r0.setText(r12)
            android.widget.Button r0 = r6.f2493g
            r0.setVisibility(r2)
            r0 = 1
        L_0x00e9:
            r12 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r6.f2496j = r12
            r12.setOnClickListener(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 == 0) goto L_0x0103
            android.widget.Button r12 = r6.f2496j
            r12.setVisibility(r15)
            goto L_0x010f
        L_0x0103:
            android.widget.Button r12 = r6.f2496j
            r12.setText(r4)
            android.widget.Button r12 = r6.f2496j
            r12.setVisibility(r2)
            r0 = r0 | 2
        L_0x010f:
            r12 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r6.f2497k = r12
            r12.setOnClickListener(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x0129
            android.widget.Button r1 = r6.f2497k
            r1.setVisibility(r15)
            goto L_0x0135
        L_0x0129:
            android.widget.Button r1 = r6.f2497k
            r1.setText(r4)
            android.widget.Button r1 = r6.f2497k
            r1.setVisibility(r2)
            r0 = r0 | 4
        L_0x0135:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.Context r12 = r6.f2489a
            android.content.res.Resources$Theme r12 = r12.getTheme()
            r14 = 2130903080(0x7f030028, float:1.7412968E38)
            r12.resolveAttribute(r14, r1, r3)
            int r1 = r1.data
            if (r1 == 0) goto L_0x0183
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 != r3) goto L_0x015e
            android.widget.Button r12 = r6.f2493g
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            r14.gravity = r3
            r14.weight = r1
            r12.setLayoutParams(r14)
            goto L_0x0183
        L_0x015e:
            r12 = 2
            if (r0 != r12) goto L_0x0171
            android.widget.Button r12 = r6.f2496j
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            r14.gravity = r3
            r14.weight = r1
            r12.setLayoutParams(r14)
            goto L_0x0183
        L_0x0171:
            r12 = 4
            if (r0 != r12) goto L_0x0183
            android.widget.Button r12 = r6.f2497k
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            r14.gravity = r3
            r14.weight = r1
            r12.setLayoutParams(r14)
        L_0x0183:
            if (r0 == 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            r11.setVisibility(r15)
        L_0x0189:
            android.view.View r0 = r6.f2503q
            r1 = 2131231157(0x7f0801b5, float:1.8078387E38)
            if (r0 == 0) goto L_0x01a3
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r12 = -2
            r0.<init>(r13, r12)
            android.view.View r12 = r6.f2503q
            r9.addView(r12, r2, r0)
            android.view.View r0 = r7.findViewById(r1)
            r0.setVisibility(r15)
            goto L_0x0206
        L_0x01a3:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2500n = r0
            java.lang.CharSequence r0 = r6.f2491d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f7
            boolean r0 = r6.f2510x
            if (r0 == 0) goto L_0x01f7
            r0 = 2131230789(0x7f080045, float:1.807764E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f2501o = r0
            java.lang.CharSequence r1 = r6.f2491d
            r0.setText(r1)
            android.graphics.drawable.Drawable r0 = r6.f2499m
            if (r0 == 0) goto L_0x01d4
            android.widget.ImageView r1 = r6.f2500n
            r1.setImageDrawable(r0)
            goto L_0x0206
        L_0x01d4:
            android.widget.TextView r0 = r6.f2501o
            android.widget.ImageView r1 = r6.f2500n
            int r1 = r1.getPaddingLeft()
            android.widget.ImageView r12 = r6.f2500n
            int r12 = r12.getPaddingTop()
            android.widget.ImageView r14 = r6.f2500n
            int r14 = r14.getPaddingRight()
            android.widget.ImageView r4 = r6.f2500n
            int r4 = r4.getPaddingBottom()
            r0.setPadding(r1, r12, r14, r4)
            android.widget.ImageView r0 = r6.f2500n
            r0.setVisibility(r15)
            goto L_0x0206
        L_0x01f7:
            android.view.View r0 = r7.findViewById(r1)
            r0.setVisibility(r15)
            android.widget.ImageView r0 = r6.f2500n
            r0.setVisibility(r15)
            r9.setVisibility(r15)
        L_0x0206:
            int r0 = r8.getVisibility()
            if (r0 == r15) goto L_0x020e
            r0 = 1
            goto L_0x020f
        L_0x020e:
            r0 = 0
        L_0x020f:
            if (r9 == 0) goto L_0x0219
            int r1 = r9.getVisibility()
            if (r1 == r15) goto L_0x0219
            r1 = 1
            goto L_0x021a
        L_0x0219:
            r1 = 0
        L_0x021a:
            int r4 = r11.getVisibility()
            if (r4 == r15) goto L_0x0222
            r4 = 1
            goto L_0x0223
        L_0x0222:
            r4 = 0
        L_0x0223:
            if (r4 != 0) goto L_0x0231
            r8 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.view.View r8 = r10.findViewById(r8)
            if (r8 == 0) goto L_0x0231
            r8.setVisibility(r2)
        L_0x0231:
            if (r1 == 0) goto L_0x0252
            androidx.core.widget.NestedScrollView r8 = r6.f2498l
            if (r8 == 0) goto L_0x023a
            r8.setClipToPadding(r3)
        L_0x023a:
            java.lang.String r8 = r6.f2492e
            if (r8 != 0) goto L_0x0245
            androidx.appcompat.app.AlertController$RecycleListView r8 = r6.f
            if (r8 == 0) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r8 = 0
            goto L_0x024c
        L_0x0245:
            r8 = 2131231156(0x7f0801b4, float:1.8078385E38)
            android.view.View r8 = r9.findViewById(r8)
        L_0x024c:
            if (r8 == 0) goto L_0x025e
            r8.setVisibility(r2)
            goto L_0x025e
        L_0x0252:
            r8 = 2131231142(0x7f0801a6, float:1.8078357E38)
            android.view.View r8 = r10.findViewById(r8)
            if (r8 == 0) goto L_0x025e
            r8.setVisibility(r2)
        L_0x025e:
            androidx.appcompat.app.AlertController$RecycleListView r8 = r6.f
            if (r8 == 0) goto L_0x0283
            if (r4 == 0) goto L_0x0266
            if (r1 != 0) goto L_0x0283
        L_0x0266:
            int r9 = r8.getPaddingLeft()
            if (r1 == 0) goto L_0x0271
            int r11 = r8.getPaddingTop()
            goto L_0x0273
        L_0x0271:
            int r11 = r8.f884a
        L_0x0273:
            int r12 = r8.getPaddingRight()
            if (r4 == 0) goto L_0x027e
            int r14 = r8.getPaddingBottom()
            goto L_0x0280
        L_0x027e:
            int r14 = r8.b
        L_0x0280:
            r8.setPadding(r9, r11, r12, r14)
        L_0x0283:
            if (r0 != 0) goto L_0x0311
            androidx.appcompat.app.AlertController$RecycleListView r0 = r6.f
            if (r0 == 0) goto L_0x028a
            goto L_0x028c
        L_0x028a:
            androidx.core.widget.NestedScrollView r0 = r6.f2498l
        L_0x028c:
            if (r0 == 0) goto L_0x0311
            if (r4 == 0) goto L_0x0292
            r12 = 2
            goto L_0x0293
        L_0x0292:
            r12 = 0
        L_0x0293:
            r1 = r1 | r12
            r4 = 2131231074(0x7f080162, float:1.8078219E38)
            android.view.View r4 = r7.findViewById(r4)
            r8 = 2131231073(0x7f080161, float:1.8078217E38)
            android.view.View r7 = r7.findViewById(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 < r9) goto L_0x02bb
            java.util.WeakHashMap r2 = I.O.f393a
            if (r8 < r9) goto L_0x02b0
            r2 = 3
            I.E.d(r0, r1, r2)
        L_0x02b0:
            if (r4 == 0) goto L_0x02b5
            r10.removeView(r4)
        L_0x02b5:
            if (r7 == 0) goto L_0x0311
            r10.removeView(r7)
            goto L_0x0311
        L_0x02bb:
            if (r4 == 0) goto L_0x02c5
            r0 = r1 & 1
            if (r0 != 0) goto L_0x02c5
            r10.removeView(r4)
            r4 = 0
        L_0x02c5:
            if (r7 == 0) goto L_0x02d1
            r17 = 2
            r0 = r1 & 2
            if (r0 != 0) goto L_0x02d1
            r10.removeView(r7)
            r7 = 0
        L_0x02d1:
            if (r4 != 0) goto L_0x02d5
            if (r7 == 0) goto L_0x0311
        L_0x02d5:
            java.lang.String r0 = r6.f2492e
            if (r0 == 0) goto L_0x02f0
            androidx.core.widget.NestedScrollView r0 = r6.f2498l
            F.c r1 = new F.c
            r8 = 16
            r1.<init>((java.lang.Object) r4, (int) r8, (java.lang.Object) r7)
            r0.setOnScrollChangeListener(r1)
            androidx.core.widget.NestedScrollView r0 = r6.f2498l
            e.a r1 = new e.a
            r1.<init>(r6, r4, r7, r2)
            r0.post(r1)
            goto L_0x0311
        L_0x02f0:
            androidx.appcompat.app.AlertController$RecycleListView r0 = r6.f
            if (r0 == 0) goto L_0x0307
            e.b r1 = new e.b
            r1.<init>(r4, r7)
            r0.setOnScrollListener(r1)
            androidx.appcompat.app.AlertController$RecycleListView r0 = r6.f
            e.a r1 = new e.a
            r1.<init>(r6, r4, r7, r3)
            r0.post(r1)
            goto L_0x0311
        L_0x0307:
            if (r4 == 0) goto L_0x030c
            r10.removeView(r4)
        L_0x030c:
            if (r7 == 0) goto L_0x0311
            r10.removeView(r7)
        L_0x0311:
            androidx.appcompat.app.AlertController$RecycleListView r0 = r6.f
            if (r0 == 0) goto L_0x0326
            android.widget.ListAdapter r1 = r6.f2504r
            if (r1 == 0) goto L_0x0326
            r0.setAdapter(r1)
            int r1 = r6.f2505s
            if (r1 <= r13) goto L_0x0326
            r0.setItemChecked(r1, r3)
            r0.setSelection(r1)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.C0136g.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.f2498l;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.f2498l;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        i.d("super.onSaveInstanceState()", onSaveInstanceState);
        this.b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        t tVar = this.f2513a;
        if (tVar == null) {
            tVar = new t(this);
            this.f2513a = tVar;
        }
        tVar.d(C0070l.ON_RESUME);
    }

    public final void onStop() {
        g();
        x xVar = (x) c();
        xVar.B();
        C0129K k2 = xVar.f2596o;
        if (k2 != null) {
            k2.f2453E = false;
            C0186k kVar = k2.D;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public final void setContentView(int i2) {
        c().j(i2);
    }

    public final void setTitle(int i2) {
        super.setTitle(i2);
        c().m(getContext().getString(i2));
    }

    public final void setContentView(View view) {
        c().k(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().l(view, layoutParams);
    }

    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        C0135f fVar = this.f;
        fVar.f2491d = charSequence;
        TextView textView = fVar.f2501o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

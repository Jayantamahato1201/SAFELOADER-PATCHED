package H0;

import A.i;
import I.O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cheatbox.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0245h0;
import k0.C0281a;
import t0.C0486a;

public final class w {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f348A;

    /* renamed from: B  reason: collision with root package name */
    public Typeface f349B;

    /* renamed from: a  reason: collision with root package name */
    public final int f350a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f351c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f352d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f353e;
    public final TimeInterpolator f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f354g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f355h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f356i;

    /* renamed from: j  reason: collision with root package name */
    public int f357j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f358k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f359l;

    /* renamed from: m  reason: collision with root package name */
    public final float f360m;

    /* renamed from: n  reason: collision with root package name */
    public int f361n;

    /* renamed from: o  reason: collision with root package name */
    public int f362o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f363p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f364q;

    /* renamed from: r  reason: collision with root package name */
    public C0245h0 f365r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f366s;

    /* renamed from: t  reason: collision with root package name */
    public int f367t;

    /* renamed from: u  reason: collision with root package name */
    public int f368u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f369v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f370w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f371x;

    /* renamed from: y  reason: collision with root package name */
    public C0245h0 f372y;

    /* renamed from: z  reason: collision with root package name */
    public int f373z;

    public w(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f354g = context;
        this.f355h = textInputLayout;
        this.f360m = (float) context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
        this.f350a = C0486a.q(context, R.attr.MT_Bin, 217);
        this.b = C0486a.q(context, R.attr.MT_Bin, 167);
        this.f351c = C0486a.q(context, R.attr.MT_Bin, 167);
        this.f352d = C0486a.r(context, R.attr.MT_Bin, C0281a.f3624d);
        LinearInterpolator linearInterpolator = C0281a.f3622a;
        this.f353e = C0486a.r(context, R.attr.MT_Bin, linearInterpolator);
        this.f = C0486a.r(context, R.attr.MT_Bin, linearInterpolator);
    }

    public final void a(C0245h0 h0Var, int i2) {
        if (this.f356i == null && this.f358k == null) {
            Context context = this.f354g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f356i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f356i;
            TextInputLayout textInputLayout = this.f355h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f358k = new FrameLayout(context);
            this.f356i.addView(this.f358k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f358k.setVisibility(0);
            this.f358k.addView(h0Var);
        } else {
            this.f356i.addView(h0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f356i.setVisibility(0);
        this.f357j++;
    }

    public final void b() {
        if (this.f356i != null) {
            TextInputLayout textInputLayout = this.f355h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f354g;
                boolean Y2 = i.Y(context);
                LinearLayout linearLayout = this.f356i;
                WeakHashMap weakHashMap = O.f393a;
                int paddingStart = editText.getPaddingStart();
                if (Y2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
                if (Y2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (Y2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f359l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0245h0 h0Var, int i2, int i3, int i4) {
        boolean z3;
        float f2;
        long j2;
        TimeInterpolator timeInterpolator;
        if (h0Var != null && z2) {
            if (i2 == i4 || i2 == i3) {
                if (i4 == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h0Var, View.ALPHA, new float[]{f2});
                int i5 = this.f351c;
                if (z3) {
                    j2 = (long) this.b;
                } else {
                    j2 = (long) i5;
                }
                ofFloat.setDuration(j2);
                if (z3) {
                    timeInterpolator = this.f353e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i2 == i4 && i3 != 0) {
                    ofFloat.setStartDelay((long) i5);
                }
                arrayList.add(ofFloat);
                if (i4 == i2 && i3 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(h0Var, View.TRANSLATION_Y, new float[]{-this.f360m, 0.0f});
                    ofFloat2.setDuration((long) this.f350a);
                    ofFloat2.setInterpolator(this.f352d);
                    ofFloat2.setStartDelay((long) i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.f365r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f372y;
    }

    public final void f() {
        this.f363p = null;
        c();
        if (this.f361n == 1) {
            if (!this.f371x || TextUtils.isEmpty(this.f370w)) {
                this.f362o = 0;
            } else {
                this.f362o = 2;
            }
        }
        i(this.f361n, this.f362o, h(this.f365r, ""));
    }

    public final void g(C0245h0 h0Var, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f356i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.f358k) != null) {
                frameLayout.removeView(h0Var);
            } else {
                linearLayout.removeView(h0Var);
            }
            int i3 = this.f357j - 1;
            this.f357j = i3;
            LinearLayout linearLayout2 = this.f356i;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(C0245h0 h0Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = O.f393a;
        TextInputLayout textInputLayout = this.f355h;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled()) {
            return false;
        }
        if (this.f362o != this.f361n || h0Var == null || !TextUtils.equals(h0Var.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public final void i(int i2, int i3, boolean z2) {
        TextView e2;
        TextView e3;
        w wVar = this;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (i4 != i5) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                wVar.f359l = animatorSet;
                ArrayList arrayList = new ArrayList();
                wVar.d(arrayList, wVar.f371x, wVar.f372y, 2, i4, i5);
                int i6 = i3;
                wVar.d(arrayList, wVar.f364q, wVar.f365r, 1, i2, i6);
                int size = arrayList.size();
                long j2 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    Animator animator = (Animator) arrayList.get(i7);
                    j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                ofInt.setDuration(j2);
                arrayList.add(0, ofInt);
                animatorSet.playTogether(arrayList);
                int i8 = i6;
                u uVar = new u(this, i8, e(i2), i2, wVar.e(i6));
                wVar = this;
                animatorSet.addListener(uVar);
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (e3 = wVar.e(i5)) == null)) {
                    e3.setVisibility(0);
                    e3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (e2 = e(i2)) == null)) {
                    e2.setVisibility(4);
                    if (i4 == 1) {
                        e2.setText((CharSequence) null);
                    }
                }
                wVar.f361n = i5;
            }
            TextInputLayout textInputLayout = wVar.f355h;
            textInputLayout.r();
            textInputLayout.u(z3, false);
            textInputLayout.x();
        }
    }
}

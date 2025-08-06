package H0;

import F0.g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.cheatbox.R;
import k0.C0281a;
import t0.C0486a;

/* renamed from: H0.e  reason: case insensitive filesystem */
public final class C0004e extends t {

    /* renamed from: e  reason: collision with root package name */
    public final int f284e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f285g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f286h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f287i;

    /* renamed from: j  reason: collision with root package name */
    public final C0000a f288j = new C0000a(0, this);

    /* renamed from: k  reason: collision with root package name */
    public final C0001b f289k = new C0001b(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f290l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f291m;

    public C0004e(s sVar) {
        super(sVar);
        this.f284e = C0486a.q(sVar.getContext(), R.attr.MT_Bin, 100);
        this.f = C0486a.q(sVar.getContext(), R.attr.MT_Bin, 150);
        this.f285g = C0486a.r(sVar.getContext(), R.attr.MT_Bin, C0281a.f3622a);
        this.f286h = C0486a.r(sVar.getContext(), R.attr.MT_Bin, C0281a.f3624d);
    }

    public final void a() {
        if (this.b.f333p == null) {
            t(u());
        }
    }

    public final int c() {
        return R.string.MT_Bin;
    }

    public final int d() {
        return R.drawable.MT_Bin;
    }

    public final View.OnFocusChangeListener e() {
        return this.f289k;
    }

    public final View.OnClickListener f() {
        return this.f288j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f289k;
    }

    public final void m(EditText editText) {
        this.f287i = editText;
        this.f340a.setEndIconVisible(u());
    }

    public final void p(boolean z2) {
        if (this.b.f333p != null) {
            t(z2);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f286h);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new C0002c(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f285g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f284e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new C0002c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f290l.addListener(new C0003d(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new C0002c(this, 0));
        this.f291m = ofFloat3;
        ofFloat3.addListener(new C0003d(this, 1));
    }

    public final void s() {
        EditText editText = this.f287i;
        if (editText != null) {
            editText.post(new g(1, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3;
        if (this.b.d() == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && !this.f290l.isRunning()) {
            this.f291m.cancel();
            this.f290l.start();
            if (z3) {
                this.f290l.end();
            }
        } else if (!z2) {
            this.f290l.cancel();
            this.f291m.start();
            if (z3) {
                this.f291m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f287i;
        if (editText == null) {
            return false;
        }
        if ((editText.hasFocus() || this.f342d.hasFocus()) && this.f287i.getText().length() > 0) {
            return true;
        }
        return false;
    }
}

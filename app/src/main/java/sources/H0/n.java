package H0;

import A.i;
import F0.g;
import I.O;
import J.l;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.cheatbox.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import k0.C0281a;
import t0.C0486a;

public final class n extends t {

    /* renamed from: e  reason: collision with root package name */
    public final int f301e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f302g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f303h;

    /* renamed from: i  reason: collision with root package name */
    public final C0000a f304i = new C0000a(1, this);

    /* renamed from: j  reason: collision with root package name */
    public final C0001b f305j = new C0001b(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final l f306k = new l(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f307l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f308m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f309n;

    /* renamed from: o  reason: collision with root package name */
    public long f310o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f311p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f312q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f313r;

    public n(s sVar) {
        super(sVar);
        this.f = C0486a.q(sVar.getContext(), R.attr.MT_Bin, 67);
        this.f301e = C0486a.q(sVar.getContext(), R.attr.MT_Bin, 50);
        this.f302g = C0486a.r(sVar.getContext(), R.attr.MT_Bin, C0281a.f3622a);
    }

    public final void a() {
        if (this.f311p.isTouchExplorationEnabled() && i.W(this.f303h) && !this.f342d.hasFocus()) {
            this.f303h.dismissDropDown();
        }
        this.f303h.post(new g(2, this));
    }

    public final int c() {
        return R.string.MT_Bin;
    }

    public final int d() {
        return R.drawable.MT_Bin;
    }

    public final View.OnFocusChangeListener e() {
        return this.f305j;
    }

    public final View.OnClickListener f() {
        return this.f304i;
    }

    public final l h() {
        return this.f306k;
    }

    public final boolean i(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.f307l;
    }

    public final boolean l() {
        return this.f309n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f303h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new j(this));
            this.f303h.setOnDismissListener(new k(this));
            this.f303h.setThreshold(0);
            TextInputLayout textInputLayout = this.f340a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!i.W(editText) && this.f311p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = O.f393a;
                this.f342d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(l lVar) {
        boolean z2;
        boolean W2 = i.W(this.f303h);
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
        if (!W2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z2 = accessibilityNodeInfo.isShowingHintText();
        } else {
            z2 = lVar.e(4);
        }
        if (z2) {
            lVar.j((String) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z2;
        if (this.f311p.isEnabled() && !i.W(this.f303h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f309n && !this.f303h.isPopupShowing()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z2) {
                u();
                this.f308m = true;
                this.f310o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f302g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new C0008i(this));
        this.f313r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.f301e);
        ofFloat2.addUpdateListener(new C0008i(this));
        this.f312q = ofFloat2;
        ofFloat2.addListener(new m(0, (Object) this));
        this.f311p = (AccessibilityManager) this.f341c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f303h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f303h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z2) {
        if (this.f309n != z2) {
            this.f309n = z2;
            this.f313r.cancel();
            this.f312q.start();
        }
    }

    public final void u() {
        boolean z2;
        if (this.f303h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f310o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f308m = false;
            }
            if (!this.f308m) {
                t(!this.f309n);
                if (this.f309n) {
                    this.f303h.requestFocus();
                    this.f303h.showDropDown();
                    return;
                }
                this.f303h.dismissDropDown();
                return;
            }
            this.f308m = false;
        }
    }
}

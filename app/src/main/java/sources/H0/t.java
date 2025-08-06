package H0;

import J.l;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f340a;
    public final s b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f341c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f342d;

    public t(s sVar) {
        this.f340a = sVar.f320a;
        this.b = sVar;
        this.f341c = sVar.getContext();
        this.f342d = sVar.f324g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public l h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.b.f(false);
    }

    public void m(EditText editText) {
    }

    public void n(l lVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }
}

package H0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.cheatbox.R;

public final class A extends t {

    /* renamed from: e  reason: collision with root package name */
    public final int f263e = R.drawable.MT_Bin;
    public EditText f;

    /* renamed from: g  reason: collision with root package name */
    public final C0000a f264g = new C0000a(2, this);

    public A(s sVar, int i2) {
        super(sVar);
        if (i2 != 0) {
            this.f263e = i2;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R.string.MT_Bin;
    }

    public final int d() {
        return this.f263e;
    }

    public final View.OnClickListener f() {
        return this.f264g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        boolean z2;
        EditText editText = this.f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }

    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

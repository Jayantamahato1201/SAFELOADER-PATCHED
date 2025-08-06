package H0;

import I.O;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

public final class D implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f273a;
    public final /* synthetic */ EditText b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f274c;

    public D(TextInputLayout textInputLayout, EditText editText) {
        this.f274c = textInputLayout;
        this.b = editText;
        this.f273a = editText.getLineCount();
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f274c;
        textInputLayout.u(!textInputLayout.f2084A0, false);
        if (textInputLayout.f2124k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2139s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i2 = this.f273a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                WeakHashMap weakHashMap = O.f393a;
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f2142t0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f273a = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}

package H0;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f315a;

    public p(s sVar) {
        this.f315a = sVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        s sVar = this.f315a;
        if (sVar.f336s != textInputLayout.getEditText()) {
            EditText editText = sVar.f336s;
            o oVar = sVar.f339v;
            if (editText != null) {
                editText.removeTextChangedListener(oVar);
                if (sVar.f336s.getOnFocusChangeListener() == sVar.b().e()) {
                    sVar.f336s.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            sVar.f336s = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(oVar);
            }
            sVar.b().m(sVar.f336s);
            sVar.j(sVar.b());
        }
    }
}

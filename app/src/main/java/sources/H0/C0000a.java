package H0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.n;

/* renamed from: H0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0000a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f280a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0000a(int i2, Object obj) {
        this.f280a = i2;
        this.b = obj;
    }

    public final void onClick(View view) {
        switch (this.f280a) {
            case 0:
                C0004e eVar = (C0004e) this.b;
                EditText editText = eVar.f287i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 1:
                ((n) this.b).u();
                return;
            case 2:
                A a2 = (A) this.b;
                EditText editText2 = a2.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = a2.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        a2.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        a2.f.setTransformationMethod((TransformationMethod) null);
                    }
                    if (selectionEnd >= 0) {
                        a2.f.setSelection(selectionEnd);
                    }
                    a2.q();
                    return;
                }
                return;
            default:
                ((n) this.b).B();
                throw null;
        }
    }
}

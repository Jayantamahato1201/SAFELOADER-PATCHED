package T;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.j;

public final class i implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f717a;
    public h b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f718c = true;

    public i(EditText editText) {
        this.f717a = editText;
    }

    public static void a(EditText editText, int i2) {
        int i3;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j a2 = j.a();
            if (editableText == null) {
                i3 = 0;
            } else {
                a2.getClass();
                i3 = editableText.length();
            }
            a2.e(editableText, 0, i3);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f717a;
        if (!editText.isInEditMode() && this.f718c && j.f1156j != null && i3 <= i4 && (charSequence instanceof Spannable)) {
            int b2 = j.a().b();
            if (b2 != 0) {
                if (b2 == 1) {
                    j.a().e((Spannable) charSequence, i2, i4 + i2);
                    return;
                } else if (b2 != 3) {
                    return;
                }
            }
            j a2 = j.a();
            if (this.b == null) {
                this.b = new h(editText);
            }
            a2.f(this.b);
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}

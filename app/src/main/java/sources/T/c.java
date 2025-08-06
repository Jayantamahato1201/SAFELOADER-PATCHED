package T;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.h;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f709a;
    public final WeakReference b;

    public c(TextView textView, d dVar) {
        this.f709a = new WeakReference(textView);
        this.b = new WeakReference(dVar);
    }

    public final void a() {
        InputFilter[] filters;
        int i2;
        TextView textView = (TextView) this.f709a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i3 = 0;
            while (i3 < filters.length) {
                if (filters[i3] != inputFilter) {
                    i3++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j a2 = j.a();
                    if (text == null) {
                        i2 = 0;
                    } else {
                        a2.getClass();
                        i2 = text.length();
                    }
                    CharSequence e2 = a2.e(text, 0, i2);
                    if (text != e2) {
                        int selectionStart = Selection.getSelectionStart(e2);
                        int selectionEnd = Selection.getSelectionEnd(e2);
                        textView.setText(e2);
                        if (e2 instanceof Spannable) {
                            Spannable spannable = (Spannable) e2;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}

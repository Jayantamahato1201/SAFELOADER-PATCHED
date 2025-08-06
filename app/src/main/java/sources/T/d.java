package T;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f710a;
    public c b;

    public d(TextView textView) {
        this.f710a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f710a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = j.a().b();
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 3) {
                    return charSequence;
                }
            } else if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i2 == 0 && i3 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
        }
        j a2 = j.a();
        if (this.b == null) {
            this.b = new c(textView, this);
        }
        a2.f(this.b);
        return charSequence;
    }
}

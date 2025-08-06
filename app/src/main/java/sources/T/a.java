package T;

import android.text.Editable;
import androidx.emoji2.text.t;

public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f706a = new Object();
    public static volatile a b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f707c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f707c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

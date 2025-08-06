package T;

import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class h extends androidx.emoji2.text.h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f716a;

    public h(EditText editText) {
        this.f716a = new WeakReference(editText);
    }

    public final void a() {
        i.a((EditText) this.f716a.get(), 1);
    }
}

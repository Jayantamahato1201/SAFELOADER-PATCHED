package T;

import F.c;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f711a;
    public final E0.e b;

    public e(KeyListener keyListener) {
        E0.e eVar = new E0.e(9);
        this.f711a = keyListener;
        this.b = eVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f711a.clearMetaKeyState(view, editable, i2);
    }

    public final int getInputType() {
        return this.f711a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        this.b.getClass();
        if (i2 == 67) {
            z2 = c.b(editable, keyEvent, false);
        } else if (i2 != 112) {
            z2 = false;
        } else {
            z2 = c.b(editable, keyEvent, true);
        }
        if (z2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f711a.onKeyDown(view, editable, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f711a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f711a.onKeyUp(view, editable, i2, keyEvent);
    }
}

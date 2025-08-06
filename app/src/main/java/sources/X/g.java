package x;

import I.C0018j;
import U0.i;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C;
import androidx.lifecycle.E;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

public abstract class g extends Activity implements r, C0018j {

    /* renamed from: a  reason: collision with root package name */
    public final t f4762a = new t(this);

    public final boolean c(KeyEvent keyEvent) {
        i.e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        i.d("window.decorView", decorView);
        if (A.i.C(decorView, keyEvent)) {
            return true;
        }
        return A.i.D(this, decorView, this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        i.d("window.decorView", decorView);
        if (A.i.C(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = E.b;
        C.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        i.e("outState", bundle);
        this.f4762a.g();
        super.onSaveInstanceState(bundle);
    }
}

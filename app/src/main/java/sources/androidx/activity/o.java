package androidx.activity;

import T0.a;
import android.window.OnBackInvokedCallback;
import com.cheatbox.MainActivity;
import e.x;

public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f869a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(int i2, Object obj) {
        this.f869a = i2;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f869a) {
            case 0:
                ((a) this.b).a();
                return;
            case 1:
                ((x) this.b).E();
                return;
            case 2:
                int i2 = MainActivity.f1818B;
                ((MainActivity) this.b).getClass();
                throw null;
            default:
                ((Runnable) this.b).run();
                return;
        }
    }
}

package k;

import android.content.Context;
import android.view.View;
import android.view.Window;
import j.C0197a;

public final class v1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0197a f3577a;
    public final /* synthetic */ w1 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, j.a] */
    public v1(w1 w1Var) {
        this.b = w1Var;
        Context context = w1Var.f3579a.getContext();
        CharSequence charSequence = w1Var.f3584h;
        ? obj = new Object();
        obj.f3052e = 4096;
        obj.f3053g = 4096;
        obj.f3058l = null;
        obj.f3059m = null;
        obj.f3060n = false;
        obj.f3061o = false;
        obj.f3062p = 16;
        obj.f3055i = context;
        obj.f3049a = charSequence;
        this.f3577a = obj;
    }

    public final void onClick(View view) {
        w1 w1Var = this.b;
        Window.Callback callback = w1Var.f3587k;
        if (callback != null && w1Var.f3588l) {
            callback.onMenuItemSelected(0, this.f3577a);
        }
    }
}

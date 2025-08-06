package k;

import A.j;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import j.C0209m;
import j.C0211o;
import java.lang.reflect.Method;

public final class R0 extends L0 implements M0 {

    /* renamed from: E  reason: collision with root package name */
    public static final Method f3407E;
    public j D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3407E = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void c(C0209m mVar, C0211o oVar) {
        j jVar = this.D;
        if (jVar != null) {
            jVar.c(mVar, oVar);
        }
    }

    public final void p(C0209m mVar, C0211o oVar) {
        j jVar = this.D;
        if (jVar != null) {
            jVar.p(mVar, oVar);
        }
    }

    public final C0280z0 q(Context context, boolean z2) {
        Q0 q02 = new Q0(context, z2);
        q02.setHoverListener(this);
        return q02;
    }
}

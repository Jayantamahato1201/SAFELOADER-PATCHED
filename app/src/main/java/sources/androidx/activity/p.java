package androidx.activity;

import T0.a;
import U0.i;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f870a = new Object();

    public final OnBackInvokedCallback a(a aVar) {
        i.e("onBackInvoked", aVar);
        return new o(0, aVar);
    }

    public final void b(Object obj, int i2, Object obj2) {
        i.e("dispatcher", obj);
        i.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        i.e("dispatcher", obj);
        i.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}

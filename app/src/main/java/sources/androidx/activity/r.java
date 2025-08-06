package androidx.activity;

import T0.a;
import T0.l;
import U0.i;
import android.window.OnBackInvokedCallback;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f874a = new Object();

    public final OnBackInvokedCallback a(l lVar, l lVar2, a aVar, a aVar2) {
        i.e("onBackStarted", lVar);
        i.e("onBackProgressed", lVar2);
        i.e("onBackInvoked", aVar);
        i.e("onBackCancelled", aVar2);
        return new q(lVar, lVar2, aVar, aVar2);
    }
}

package androidx.fragment.app;

import Q0.l;
import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final class C0054k extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0056m f1317l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0055l f1318m;

    public C0054k(C0055l lVar, C0056m mVar) {
        this.f1318m = lVar;
        this.f1317l = mVar;
    }

    public final View I(int i2) {
        C0056m mVar = this.f1317l;
        if (mVar.J()) {
            return mVar.I(i2);
        }
        Dialog dialog = this.f1318m.f1328a0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    public final boolean J() {
        if (this.f1317l.J() || this.f1318m.f1331d0) {
            return true;
        }
        return false;
    }
}

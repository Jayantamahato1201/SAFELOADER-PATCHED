package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j  reason: case insensitive filesystem */
public final class C0053j implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0055l f1316a;

    public C0053j(C0055l lVar) {
        this.f1316a = lVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C0055l lVar = this.f1316a;
        Dialog dialog = lVar.f1328a0;
        if (dialog != null) {
            lVar.onDismiss(dialog);
        }
    }
}

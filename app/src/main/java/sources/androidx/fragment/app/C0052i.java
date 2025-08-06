package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
public final class C0052i implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0055l f1315a;

    public C0052i(C0055l lVar) {
        this.f1315a = lVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C0055l lVar = this.f1315a;
        Dialog dialog = lVar.f1328a0;
        if (dialog != null) {
            lVar.onCancel(dialog);
        }
    }
}

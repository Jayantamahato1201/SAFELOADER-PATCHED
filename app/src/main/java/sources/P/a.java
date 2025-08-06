package P;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import k.k1;

public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k1 f639a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(k1 k1Var) {
        super(new Handler());
        this.f639a = k1Var;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z2) {
        Cursor cursor;
        k1 k1Var = this.f639a;
        if (k1Var.b && (cursor = k1Var.f642c) != null && !cursor.isClosed()) {
            k1Var.f641a = k1Var.f642c.requery();
        }
    }
}

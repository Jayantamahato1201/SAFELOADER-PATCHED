package q1;

import android.os.IBinder;
import top.bienvenido.mundo.common.ext.MundoAccountResponse;

public final class U1 extends MundoAccountResponse {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IBinder f4016a;

    public U1(IBinder iBinder) {
        this.f4016a = iBinder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.accounts.Account[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResult(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "accounts"
            android.os.Parcelable[] r5 = r5.getParcelableArray(r0)
            if (r5 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r5.length
            android.accounts.Account[] r1 = new android.accounts.Account[r0]
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0016
            r3 = r5[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0016:
            q1.n2 r5 = q1.C0395n2.b
            android.os.IBinder r0 = r4.f4016a
            r5.getClass()
            q1.C0395n2.U0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.U1.onResult(android.os.Bundle):void");
    }

    public final void onError(int i2, String str) {
    }
}

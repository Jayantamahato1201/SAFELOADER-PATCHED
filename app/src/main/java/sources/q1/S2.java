package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class S2 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final Account f3987l;

    /* renamed from: m  reason: collision with root package name */
    public final String[] f3988m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S2(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
        super(iAccountManagerResponse, account.type, false, true, account.name, false, false);
        this.f3987l = account;
        this.f3988m = strArr;
    }

    public final void b() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f4161h;
            if (iAccountAuthenticator != null) {
                iAccountAuthenticator.hasFeatures(this, this.f3987l, this.f3988m);
            }
        } catch (Exception unused) {
            onError(1, "remote exception");
        }
    }

    public final void onResult(Bundle bundle) {
        IAccountManagerResponse c2 = c();
        if (c2 == null) {
            return;
        }
        if (bundle == null) {
            try {
                c2.onError(5, "null bundle");
            } catch (Exception unused) {
            }
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
            c2.onResult(bundle2);
        }
    }
}

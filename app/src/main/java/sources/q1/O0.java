package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class O0 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final Account f3950l;

    public O0(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z2) {
        super(iAccountManagerResponse, account.type, z2, true, account.name, false, false);
        this.f3950l = account;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountRemovalAllowed(this, this.f3950l);
        }
    }

    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
            if (bundle.getBoolean("booleanResult")) {
                C0395n2 n2Var = C0395n2.b;
                Account account = this.f3950l;
                n2Var.getClass();
                C0395n2.S0(account);
            }
            IAccountManagerResponse c2 = c();
            if (c2 != null) {
                try {
                    c2.onResult(bundle);
                } catch (Exception unused) {
                }
            }
        }
        super.onResult(bundle);
    }
}

package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class J1 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ IAccountManagerResponse f3919l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Account f3920m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f3919l = iAccountManagerResponse;
        this.f3920m = account;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountCredentialsForCloning(this, this.f3920m);
        }
    }

    public final void onResult(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("booleanResult", false)) {
            super.onResult(bundle);
            return;
        }
        Object obj = C0395n2.f4146c.b;
        Account account = this.f3920m;
        new F1(this.f3919l, account, bundle, account.type, account.name).e();
    }
}

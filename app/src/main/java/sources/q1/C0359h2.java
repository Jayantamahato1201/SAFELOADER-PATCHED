package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* renamed from: q1.h2  reason: case insensitive filesystem */
public final class C0359h2 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Account f4109l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f4110m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Bundle f4111n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0359h2(boolean z2, Account account, String str, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str2, String str3) {
        super(iAccountManagerResponse, str2, z2, true, str3, false, true);
        this.f4109l = account;
        this.f4110m = str;
        this.f4111n = bundle;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.updateCredentials(this, this.f4109l, this.f4110m, this.f4111n);
        }
    }
}

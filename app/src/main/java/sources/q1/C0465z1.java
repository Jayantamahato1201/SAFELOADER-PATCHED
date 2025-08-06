package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* renamed from: q1.z1  reason: case insensitive filesystem */
public final class C0465z1 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Account f4255l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Bundle f4256m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0465z1(boolean z2, Account account, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        super(iAccountManagerResponse, str, z2, true, str2, true, true);
        this.f4255l = account;
        this.f4256m = bundle;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.confirmCredentials(this, this.f4255l, this.f4256m);
        }
    }
}

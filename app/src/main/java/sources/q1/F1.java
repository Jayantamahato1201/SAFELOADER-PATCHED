package q1;

import U0.i;
import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.util.ArrayList;

public final class F1 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Account f3880l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Bundle f3881m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F1(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f3880l = account;
        this.f3881m = bundle;
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) C0395n2.f4146c.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (i.a(((a5) obj).f4054a, this.f3880l)) {
                IAccountAuthenticator iAccountAuthenticator = this.f4161h;
                if (iAccountAuthenticator != null) {
                    iAccountAuthenticator.addAccountFromCredentials(this, this.f3880l, this.f3881m);
                    return;
                }
                return;
            }
        }
    }
}

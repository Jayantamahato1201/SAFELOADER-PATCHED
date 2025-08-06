package q1;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* renamed from: q1.f2  reason: case insensitive filesystem */
public final class C0347f2 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f4093l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0347f2(String str, String str2, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, false, false, (String) null, false, false);
        this.f4093l = str2;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAuthTokenLabel(this, this.f4093l);
        }
    }

    public final void onResult(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("authTokenLabelKey");
            Bundle bundle2 = new Bundle();
            bundle2.putString("authTokenLabelKey", string);
            super.onResult(bundle2);
            return;
        }
        super.onResult(bundle);
    }
}

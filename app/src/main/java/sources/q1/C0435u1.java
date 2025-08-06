package q1;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* renamed from: q1.u1  reason: case insensitive filesystem */
public final class C0435u1 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f4215l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String[] f4216m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Bundle f4217n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0435u1(String str, boolean z2, String str2, String[] strArr, Bundle bundle, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, z2, true, (String) null, false, true);
        this.f4215l = str2;
        this.f4216m = strArr;
        this.f4217n = bundle;
    }

    public final void b() {
        IAccountAuthenticator iAccountAuthenticator = this.f4161h;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.addAccount(this, this.f4157c, this.f4215l, this.f4216m, this.f4217n);
        }
    }
}

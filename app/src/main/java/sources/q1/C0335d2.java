package q1;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q1.d2  reason: case insensitive filesystem */
public final class C0335d2 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final String[] f4075l;

    /* renamed from: m  reason: collision with root package name */
    public Account[] f4076m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f4077n;

    /* renamed from: o  reason: collision with root package name */
    public int f4078o;

    public C0335d2(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        super(iAccountManagerResponse, str, false, true, (String) null, false, false);
        this.f4075l = strArr;
    }

    public final void b() {
        Account[] I2 = C0395n2.b.I(this.f4157c);
        this.f4077n = new ArrayList(I2.length);
        this.f4076m = I2;
        this.f4078o = 0;
        f();
    }

    public final void f() {
        int i2 = this.f4078o;
        Account[] accountArr = this.f4076m;
        if (i2 >= accountArr.length) {
            IAccountManagerResponse c2 = c();
            if (c2 != null) {
                try {
                    int size = this.f4077n.size();
                    Parcelable[] parcelableArr = new Account[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        parcelableArr[i3] = this.f4077n.get(i3);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("accounts", parcelableArr);
                    c2.onResult(bundle);
                } catch (Exception unused) {
                }
            }
        } else {
            IAccountAuthenticator iAccountAuthenticator = this.f4161h;
            if (iAccountAuthenticator != null) {
                try {
                    iAccountAuthenticator.hasFeatures(this, accountArr[i2], this.f4075l);
                } catch (Exception unused2) {
                    onError(1, "remote exception");
                }
            }
        }
    }

    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            onError(5, "null bundle");
            return;
        }
        if (bundle.getBoolean("booleanResult", false)) {
            this.f4077n.add(this.f4076m[this.f4078o]);
        }
        this.f4078o++;
        f();
    }
}

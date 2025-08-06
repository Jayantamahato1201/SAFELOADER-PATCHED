package q1;

import N.g;
import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import k.C0241f0;

/* renamed from: q1.a2  reason: case insensitive filesystem */
public final class C0317a2 extends C0406p1 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Account f4049l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f4050m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Bundle f4051n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f4052o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f4053p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0317a2(android.accounts.IAccountManagerResponse r1, boolean r2, android.accounts.Account r3, java.lang.String r4, android.os.Bundle r5, boolean r6, boolean r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = this;
            r0.f4049l = r3
            r0.f4050m = r4
            r0.f4051n = r5
            r0.f4052o = r6
            r0.f4053p = r7
            r7 = 0
            r3 = r8
            r8 = 0
            r5 = 0
            r4 = r2
            r6 = r9
            r2 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0317a2.<init>(android.accounts.IAccountManagerResponse, boolean, android.accounts.Account, java.lang.String, android.os.Bundle, boolean, boolean, java.lang.String, java.lang.String):void");
    }

    public final void b() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f4161h;
            if (iAccountAuthenticator != null) {
                iAccountAuthenticator.getAuthToken(this, this.f4049l, this.f4050m, this.f4051n);
            }
        } catch (Exception unused) {
        }
    }

    public final void onResult(Bundle bundle) {
        Intent intent;
        if (bundle != null) {
            String string = bundle.getString("authtoken");
            if (string != null) {
                String string2 = bundle.getString("authAccount");
                String string3 = bundle.getString("accountType");
                if (string3 == null || string3.length() == 0 || string2 == null || string2.length() == 0) {
                    onError(5, "the type and name should not be empty");
                    return;
                }
                if (!this.f4052o) {
                    C0395n2.b.a0(new Account(string2, string3), this.f4050m, string);
                }
                long j2 = bundle.getLong("android.accounts.expiry", 0);
                if (this.f4052o && j2 > System.currentTimeMillis()) {
                    C0395n2 n2Var = C0395n2.b;
                    g gVar = C0395n2.f4146c;
                    Account account = this.f4049l;
                    String str = this.f4050m;
                    n2Var.getClass();
                    if (!(account == null || str == null)) {
                        C0241f0 f0Var = (C0241f0) gVar.f607d;
                        f0Var.getClass();
                        if (System.currentTimeMillis() <= j2) {
                            Z2 z2 = new Z2(account, str);
                            C0402o3 o3Var = new C0402o3(string, j2);
                            C0372j3 j3Var = (C0372j3) f0Var.f3459a;
                            j3Var.getClass();
                            Pair pair = new Pair(account.type, string);
                            E4 e4 = j3Var.f4126a;
                            C0336d3 d3Var = (C0336d3) e4.get(pair);
                            if (d3Var == null) {
                                d3Var = new C0336d3(j3Var);
                            }
                            d3Var.f4079a.add(z2);
                            e4.put(pair, d3Var);
                            E4 e42 = j3Var.b;
                            C0336d3 d3Var2 = (C0336d3) e42.get(account);
                            if (d3Var2 == null) {
                                d3Var2 = new C0336d3(j3Var);
                            }
                            d3Var2.f4079a.add(z2);
                            e42.put(account, d3Var2);
                            j3Var.put(z2, o3Var);
                        }
                    }
                }
            }
            if (((Intent) bundle.getParcelable("intent")) != null && this.f4053p && !this.f4052o && (intent = (Intent) bundle.getParcelable("intent")) != null && intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText((CharSequence) null, (CharSequence) null));
            }
        }
        super.onResult(bundle);
    }
}

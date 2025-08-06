package q1;

import U0.i;
import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import k.C0241f0;
import top.bienvenido.mundo.common.ext.MundoAccountSession;
import top.bienvenido.mundo.common.ext.MundoServiceConnection;

/* renamed from: q1.p1  reason: case insensitive filesystem */
public abstract class C0406p1 extends MundoAccountSession implements IBinder.DeathRecipient, ServiceConnection {

    /* renamed from: k  reason: collision with root package name */
    public static final C0241f0 f4155k = new C0241f0(3);

    /* renamed from: a  reason: collision with root package name */
    public final Object f4156a = new Object();
    public IAccountManagerResponse b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4157c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4158d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4159e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4160g;

    /* renamed from: h  reason: collision with root package name */
    public IAccountAuthenticator f4161h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4162i;

    /* renamed from: j  reason: collision with root package name */
    public final MundoServiceConnection f4163j = new MundoServiceConnection(this);

    public C0406p1(IAccountManagerResponse iAccountManagerResponse, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        if (str != null) {
            this.f4162i = z3;
            this.b = iAccountManagerResponse;
            this.f4157c = str;
            this.f4158d = z2;
            SystemClock.elapsedRealtime();
            this.f4159e = str2;
            this.f = z4;
            this.f4160g = z5;
            C0241f0 f0Var = f4155k;
            int hashCode = toString().hashCode();
            synchronized (f0Var) {
                ((C0413q2) f0Var.f3459a).b(hashCode, this);
            }
            if (iAccountManagerResponse != null) {
                try {
                    iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                } catch (Exception unused) {
                    this.b = null;
                    a();
                }
            }
        } else {
            throw new IllegalArgumentException("accountType is null");
        }
    }

    public final void a() {
        boolean c2;
        C0241f0 f0Var = f4155k;
        int hashCode = toString().hashCode();
        synchronized (f0Var) {
            c2 = ((C0413q2) f0Var.f3459a).c(hashCode);
        }
        if (c2) {
            IAccountManagerResponse iAccountManagerResponse = this.b;
            if (iAccountManagerResponse != null) {
                iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                this.b = null;
            }
            d();
        }
    }

    public abstract void b();

    public final void binderDied() {
        this.b = null;
        a();
    }

    public final IAccountManagerResponse c() {
        IAccountManagerResponse iAccountManagerResponse = this.b;
        if (iAccountManagerResponse == null) {
            a();
            return null;
        }
        a();
        return iAccountManagerResponse;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [top.bienvenido.mundo.common.ext.MundoServiceConnection, android.os.IBinder] */
    public final void d() {
        synchronized (this.f4156a) {
            if (this.f4161h != null) {
                this.f4161h = null;
                C0330c3.b.R0(this.f4163j);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [top.bienvenido.mundo.common.ext.MundoServiceConnection, android.os.IBinder] */
    public final void e() {
        String str = this.f4157c;
        C0395n2.b.getClass();
        C0341e2 e2Var = (C0341e2) ((Map) C0395n2.f4146c.f606c).get(str);
        if (e2Var != null) {
            Intent intent = new Intent("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = e2Var.f;
            intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
            if (C0330c3.b.n(intent, this.f4163j, "0") != -1) {
                return;
            }
        }
        onError(1, "bind failure");
    }

    public final void onError(int i2, String str) {
        IAccountManagerResponse c2 = c();
        if (c2 != null) {
            try {
                c2.onError(i2, str);
            } catch (Exception unused) {
            }
        }
    }

    public void onResult(Bundle bundle) {
        IAccountManagerResponse iAccountManagerResponse;
        boolean z2;
        boolean z3;
        if (bundle != null) {
            int i2 = 0;
            boolean z4 = bundle.getBoolean("booleanResult", false);
            boolean z5 = true;
            if (!bundle.containsKey("authAccount") || !bundle.containsKey("accountType")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.f4160g || (!z4 && !z2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 || this.f) {
                C0395n2 n2Var = C0395n2.b;
                String str = this.f4159e;
                String str2 = this.f4157c;
                n2Var.getClass();
                try {
                    ArrayList arrayList = (ArrayList) C0395n2.f4146c.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            z5 = false;
                            break;
                        }
                        Object obj = arrayList.get(i3);
                        i3++;
                        Account account = ((a5) obj).f4054a;
                        if (i.a(account.type, str2) && i.a(account.name, str)) {
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                String str3 = "com.google";
                if (z3 && z5) {
                    C0395n2 n2Var2 = C0395n2.b;
                    String str4 = this.f4159e;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    Account account2 = new Account(str4, this.f4157c);
                    n2Var2.getClass();
                    try {
                        ArrayList arrayList2 = (ArrayList) C0395n2.f4146c.b;
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            }
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            a5 a5Var = (a5) obj2;
                            if (i.a(a5Var.f4054a, account2)) {
                                a5Var.f4057e = System.currentTimeMillis();
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.f) {
                    long j2 = -1;
                    if (z5) {
                        C0395n2 n2Var3 = C0395n2.b;
                        String str5 = this.f4159e;
                        if (str5 != null) {
                            str3 = str5;
                        }
                        Account account3 = new Account(str3, this.f4157c);
                        n2Var3.getClass();
                        try {
                            ArrayList arrayList3 = (ArrayList) C0395n2.f4146c.b;
                            int size3 = arrayList3.size();
                            while (true) {
                                if (i2 >= size3) {
                                    break;
                                }
                                Object obj3 = arrayList3.get(i2);
                                i2++;
                                a5 a5Var2 = (a5) obj3;
                                if (i.a(a5Var2.f4054a, account3)) {
                                    j2 = a5Var2.f4057e;
                                    break;
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    bundle.putLong("lastAuthenticatedTime", j2);
                }
            }
        }
        if (bundle != null) {
            Binder.getCallingUid();
            Intent intent = (Intent) bundle.getParcelable("intent");
            if (intent != null && intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText((CharSequence) null, (CharSequence) null));
            }
        }
        if (!this.f4158d || bundle == null || !bundle.containsKey("intent")) {
            iAccountManagerResponse = c();
        } else {
            iAccountManagerResponse = this.b;
        }
        if (iAccountManagerResponse == null) {
            return;
        }
        if (bundle == null) {
            try {
                iAccountManagerResponse.onError(5, "null bundle returned");
            } catch (Exception unused4) {
            }
        } else {
            if (this.f4162i) {
                bundle.remove("authtoken");
            }
            if (bundle.getInt("errorCode", -1) > 0) {
                iAccountManagerResponse.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
            } else {
                iAccountManagerResponse.onResult(bundle);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4156a) {
            this.f4161h = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                b();
            } catch (Exception unused) {
                onError(1, "remote exception");
            }
        }
        return;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        IAccountManagerResponse c2 = c();
        if (c2 != null) {
            try {
                c2.onError(1, "disconnected");
            } catch (Exception unused) {
            }
        }
    }

    public final void onRequestContinued() {
    }
}

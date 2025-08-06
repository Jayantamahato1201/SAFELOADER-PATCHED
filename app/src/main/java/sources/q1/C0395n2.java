package q1;

import L0.b;
import M0.p;
import N.g;
import U0.i;
import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import i0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k.C0241f0;

/* renamed from: q1.n2  reason: case insensitive filesystem */
public final class C0395n2 extends C0461y3 {
    public static final C0395n2 b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f4146c = new g(7);

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, android.os.IInterface, q1.n2] */
    static {
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IMundoAccountManagerService");
        b = binder;
    }

    public static boolean S0(Account account) {
        g gVar = f4146c;
        try {
            Iterator it = ((ArrayList) gVar.b).iterator();
            while (it.hasNext()) {
                if (i.a(((a5) it.next()).f4054a, account)) {
                    C0336d3 d3Var = (C0336d3) ((C0372j3) ((C0241f0) gVar.f607d).f3459a).b.get(account);
                    if (d3Var != null) {
                        d3Var.a();
                    }
                    it.remove();
                    V0();
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void T0(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr) {
        if (accountArr.length == 0) {
            try {
                iAccountManagerResponse.onResult(new Bundle());
            } catch (Exception unused) {
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", accountArr[0].name);
            bundle.putString("accountType", accountArr[0].type);
            iAccountManagerResponse.onResult(bundle);
        }
    }

    public static void U0(IBinder iBinder, Account[] accountArr) {
        try {
            IAccountManagerResponse asInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
            if (asInterface != null) {
                T0(asInterface, accountArr);
            }
        } catch (Throwable unused) {
        }
    }

    public static void V0() {
        d5.b.execute(new l(9));
    }

    public final void B(IBinder iBinder, Account account, Bundle bundle, boolean z2) {
        if (iBinder != null && account != null) {
            try {
                Object obj = f4146c.b;
                boolean z3 = z2;
                new C0465z1(z3, account, bundle, IAccountManagerResponse.Stub.asInterface(iBinder), account.type, account.name).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void D(Account account, String str) {
        g gVar = f4146c;
        if (account != null) {
            try {
                ArrayList arrayList = (ArrayList) gVar.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a, account)) {
                        a5Var.b = str;
                        a5Var.f4056d.clear();
                        C0336d3 d3Var = (C0336d3) ((C0372j3) ((C0241f0) gVar.f607d).f3459a).b.get(account);
                        if (d3Var != null) {
                            d3Var.a();
                        }
                        V0();
                        d5.b.execute(new l(10));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String E(Account account, String str) {
        if (!(account == null || str == null)) {
            try {
                ArrayList arrayList = (ArrayList) f4146c.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a, account)) {
                        return (String) a5Var.f4056d.get(str);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void F(IBinder iBinder, String str, String str2, String[] strArr, boolean z2, Bundle bundle) {
        if (iBinder != null && str != null) {
            try {
                Object obj = f4146c.b;
                boolean z3 = z2;
                new C0435u1(str, z3, str2, strArr, bundle, IAccountManagerResponse.Stub.asInterface(iBinder)).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final Account[] G() {
        try {
            ArrayList arrayList = (ArrayList) f4146c.b;
            ArrayList arrayList2 = new ArrayList(M0.g.A0(arrayList));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(((a5) obj).f4054a);
            }
            return (Account[]) arrayList2.toArray(new Account[0]);
        } catch (Exception unused) {
            return new Account[0];
        }
    }

    public final String H0(Account account) {
        if (account == null) {
            return null;
        }
        try {
            ArrayList arrayList = (ArrayList) f4146c.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a5 a5Var = (a5) obj;
                if (i.a(a5Var.f4054a, account)) {
                    return a5Var.b;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Account[] I(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) f4146c.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                a5 a5Var = (a5) obj;
                if (str == null || i.a(a5Var.f4054a.type, str)) {
                    arrayList.add(a5Var.f4054a);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (Exception unused) {
            return new Account[0];
        }
    }

    public final void J0(IBinder iBinder, Account account) {
        if (iBinder != null && account != null) {
            try {
                IAccountManagerResponse asInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
                Object obj = f4146c.b;
                new J1(asInterface, account, account.type, account.name).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void K0(IBinder iBinder, String str, boolean z2) {
        if (iBinder != null && str != null) {
            try {
                Object obj = f4146c.b;
                new C0406p1(IAccountManagerResponse.Stub.asInterface(iBinder), str, z2, true, (String) null, false, false).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void L(IBinder iBinder, Account account, String str) {
        String str2;
        Account account2;
        String str3;
        g gVar = f4146c;
        if (account != null && str != null) {
            try {
                if (str.length() <= 200) {
                    ArrayList arrayList = (ArrayList) gVar.b;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        str2 = null;
                        if (i2 >= size) {
                            account2 = null;
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        a5 a5Var = (a5) obj;
                        if (i.a(a5Var.f4054a, account)) {
                            account2 = new Account(str, account.type);
                            a5Var.f4054a = account2;
                            C0336d3 d3Var = (C0336d3) ((C0372j3) ((C0241f0) gVar.f607d).f3459a).b.get(account);
                            if (d3Var != null) {
                                d3Var.a();
                            }
                            V0();
                            d5.b.execute(new l(10));
                        }
                    }
                    Bundle bundle = new Bundle();
                    if (account2 != null) {
                        str3 = account2.name;
                    } else {
                        str3 = null;
                    }
                    bundle.putString("authAccount", str3);
                    if (account2 != null) {
                        str2 = account2.type;
                    }
                    bundle.putString("accountType", str2);
                    IAccountManagerResponse asInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
                    if (asInterface != null) {
                        asInterface.onResult(bundle);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void M(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                g gVar = f4146c;
                C0372j3 j3Var = (C0372j3) ((C0241f0) gVar.f607d).f3459a;
                j3Var.getClass();
                C0336d3 d3Var = (C0336d3) j3Var.f4126a.get(new Pair(str, str2));
                if (d3Var != null) {
                    d3Var.a();
                }
                ArrayList arrayList = (ArrayList) gVar.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a.type, str)) {
                        if (a5Var.f4056d.values().remove(str2)) {
                            V0();
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final AuthenticatorDescription[] P0() {
        g gVar = f4146c;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) gVar.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                C0341e2 e2Var = (C0341e2) ((Map) gVar.f606c).get(((a5) obj).f4054a.type);
                if (e2Var != null) {
                    arrayList.add(e2Var);
                }
            }
            return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
        } catch (Exception unused) {
            return new AuthenticatorDescription[0];
        }
    }

    public final void S(IBinder iBinder, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Object obj = f4146c.b;
                new C0347f2(str, str2, IAccountManagerResponse.Stub.asInterface(iBinder)).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a0(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                ArrayList arrayList = (ArrayList) f4146c.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a, account)) {
                        E4 e4 = a5Var.f4056d;
                        if (str2 == null) {
                            e4.remove(str);
                        } else {
                            e4.put(str, str2);
                        }
                        V0();
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void b0(IBinder iBinder, Account account, boolean z2) {
        if (iBinder != null && account != null) {
            try {
                Object obj = f4146c.b;
                new O0(IAccountManagerResponse.Stub.asInterface(iBinder), account, z2).e();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0(android.os.IBinder r3, java.lang.String r4, java.lang.String[] r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0005
            goto L_0x0033
        L_0x0005:
            if (r5 == 0) goto L_0x001c
            int r0 = r5.length     // Catch:{  }
            if (r0 != 0) goto L_0x000b
            goto L_0x001c
        L_0x000b:
            q1.d2 r0 = new q1.d2     // Catch:{  }
            N.g r1 = f4146c     // Catch:{  }
            java.lang.Object r1 = r1.b     // Catch:{  }
            android.accounts.IAccountManagerResponse r3 = android.accounts.IAccountManagerResponse.Stub.asInterface(r3)     // Catch:{  }
            r0.<init>(r3, r4, r5)     // Catch:{  }
            r0.e()     // Catch:{  }
            return
        L_0x001c:
            android.accounts.Account[] r4 = r2.I(r4)     // Catch:{  }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r0 = "accounts"
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4     // Catch:{  }
            r5.putParcelableArray(r0, r4)     // Catch:{  }
            android.accounts.IAccountManagerResponse r3 = android.accounts.IAccountManagerResponse.Stub.asInterface(r3)     // Catch:{  }
            r3.onResult(r5)     // Catch:{ all -> 0x0033 }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0395n2.c0(android.os.IBinder, java.lang.String, java.lang.String[]):void");
    }

    public final void f(IBinder iBinder, String str, String[] strArr) {
        if (iBinder != null && str != null) {
            if (strArr != null) {
                try {
                    if (strArr.length != 0) {
                        U1 u1 = new U1(iBinder);
                        Object obj = f4146c.b;
                        new C0335d2(u1, str, strArr).e();
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            U0(iBinder, I(str));
        }
    }

    public final String i(Account account, String str) {
        if (!(account == null || str == null)) {
            try {
                ArrayList arrayList = (ArrayList) f4146c.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a, account)) {
                        return (String) a5Var.f4055c.get(str);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final HashMap o(String str, String str2) {
        if (str == null) {
            try {
                return new HashMap();
            } catch (Exception unused) {
                if (str2 == null) {
                    str2 = "";
                }
                b[] bVarArr = {new b(new Account(str2, "name"), 1)};
                HashMap hashMap = new HashMap(p.A0(1));
                b bVar = bVarArr[0];
                hashMap.put(bVar.f, bVar.f586g);
                return hashMap;
            }
        } else {
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = (ArrayList) f4146c.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a5 a5Var = (a5) obj;
                if (str2 == null || i.a(a5Var.f4054a.type, str2)) {
                    hashMap2.put(a5Var.f4054a, 1);
                }
            }
            return hashMap2;
        }
    }

    public final void q(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                ArrayList arrayList = (ArrayList) f4146c.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a5 a5Var = (a5) obj;
                    if (i.a(a5Var.f4054a, account)) {
                        E4 e4 = a5Var.f4055c;
                        if (str2 != null) {
                            e4.put(str, str2);
                            V0();
                            return;
                        } else if (e4.remove(str) != null) {
                            V0();
                            return;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r0(android.os.IBinder r14, android.accounts.Account r15, java.lang.String r16, boolean r17, boolean r18, android.os.Bundle r19) {
        /*
            r13 = this;
            r4 = r16
            if (r14 != 0) goto L_0x0006
            goto L_0x00c6
        L_0x0006:
            android.accounts.IAccountManagerResponse r1 = android.accounts.IAccountManagerResponse.Stub.asInterface(r14)     // Catch:{  }
            if (r15 == 0) goto L_0x00c0
            if (r4 != 0) goto L_0x0010
            goto L_0x00c0
        L_0x0010:
            N.g r14 = f4146c     // Catch:{  }
            java.lang.Object r0 = r14.f606c     // Catch:{  }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{  }
            java.lang.String r2 = r15.type     // Catch:{  }
            java.lang.Object r0 = r0.get(r2)     // Catch:{  }
            q1.e2 r0 = (q1.C0341e2) r0     // Catch:{  }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.customTokens     // Catch:{  }
            if (r0 == 0) goto L_0x0027
            r0 = 1
            r6 = 1
            goto L_0x0029
        L_0x0027:
            r0 = 0
            r6 = 0
        L_0x0029:
            java.lang.String r0 = "accountType"
            java.lang.String r2 = "authAccount"
            java.lang.String r5 = "authtoken"
            if (r6 != 0) goto L_0x004d
            java.lang.String r7 = r13.E(r15, r4)     // Catch:{  }
            if (r7 == 0) goto L_0x004d
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{  }
            r14.<init>()     // Catch:{  }
            r14.putString(r5, r7)     // Catch:{  }
            java.lang.String r4 = r15.name     // Catch:{  }
            r14.putString(r2, r4)     // Catch:{  }
            java.lang.String r2 = r15.type     // Catch:{  }
            r14.putString(r0, r2)     // Catch:{  }
            r1.onResult(r14)     // Catch:{ all -> 0x00c6 }
            return
        L_0x004d:
            if (r6 == 0) goto L_0x00ac
            java.lang.Object r14 = r14.f607d     // Catch:{  }
            k.f0 r14 = (k.C0241f0) r14     // Catch:{  }
            r14.getClass()     // Catch:{  }
            q1.Z2 r7 = new q1.Z2     // Catch:{  }
            r7.<init>(r15, r4)     // Catch:{  }
            java.lang.Object r14 = r14.f3459a     // Catch:{  }
            q1.j3 r14 = (q1.C0372j3) r14     // Catch:{  }
            java.lang.Object r7 = r14.get(r7)     // Catch:{  }
            q1.o3 r7 = (q1.C0402o3) r7     // Catch:{  }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{  }
            if (r7 == 0) goto L_0x0072
            long r10 = r7.b     // Catch:{  }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0072
            goto L_0x008b
        L_0x0072:
            if (r7 == 0) goto L_0x008a
            java.lang.String r8 = r15.type     // Catch:{  }
            java.lang.String r7 = r7.f4151a     // Catch:{  }
            android.util.Pair r9 = new android.util.Pair     // Catch:{  }
            r9.<init>(r8, r7)     // Catch:{  }
            q1.E4 r14 = r14.f4126a     // Catch:{  }
            java.lang.Object r14 = r14.get(r9)     // Catch:{  }
            q1.d3 r14 = (q1.C0336d3) r14     // Catch:{  }
            if (r14 == 0) goto L_0x008a
            r14.a()     // Catch:{  }
        L_0x008a:
            r7 = 0
        L_0x008b:
            if (r7 == 0) goto L_0x00ac
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{  }
            r14.<init>()     // Catch:{  }
            java.lang.String r4 = r7.f4151a     // Catch:{  }
            r14.putString(r5, r4)     // Catch:{  }
            java.lang.String r4 = "android.accounts.expiry"
            long r5 = r7.b     // Catch:{  }
            r14.putLong(r4, r5)     // Catch:{  }
            java.lang.String r4 = r15.name     // Catch:{  }
            r14.putString(r2, r4)     // Catch:{  }
            java.lang.String r2 = r15.type     // Catch:{  }
            r14.putString(r0, r2)     // Catch:{  }
            r1.onResult(r14)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00ac:
            java.lang.String r8 = r15.type     // Catch:{  }
            java.lang.String r9 = r15.name     // Catch:{  }
            q1.a2 r0 = new q1.a2     // Catch:{  }
            r3 = r15
            r7 = r17
            r2 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{  }
            r0.e()     // Catch:{  }
            return
        L_0x00c0:
            java.lang.String r14 = "argument should not be null"
            r0 = 7
            r1.onError(r0, r14)     // Catch:{  }
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0395n2.r0(android.os.IBinder, android.accounts.Account, java.lang.String, boolean, boolean, android.os.Bundle):void");
    }

    public final boolean s(Account account, String str, Bundle bundle, Map map) {
        a5 a5Var;
        g gVar = f4146c;
        int i2 = 0;
        if (account == null) {
            return false;
        }
        try {
            ArrayList arrayList = (ArrayList) gVar.b;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    a5Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                a5Var = (a5) obj;
                if (i.a(a5Var.f4054a, account)) {
                    break;
                }
            }
            if (a5Var == null) {
                a5Var = new a5(account);
                ((ArrayList) gVar.b).add(a5Var);
            }
            a5Var.b = str;
            if (bundle != null) {
                for (String next : bundle.keySet()) {
                    Object obj2 = bundle.get(next);
                    if (obj2 instanceof String) {
                        a5Var.f4055c.put(next, obj2);
                    }
                }
            }
            V0();
            d5.b.execute(new l(10));
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public final boolean s0(Account account) {
        if (account == null) {
            return false;
        }
        return S0(account);
    }

    public final void t(IBinder iBinder, Account account, String str, boolean z2, Bundle bundle) {
        if (iBinder != null && account != null) {
            try {
                Object obj = f4146c.b;
                boolean z3 = z2;
                new C0359h2(z3, account, str, bundle, IAccountManagerResponse.Stub.asInterface(iBinder), account.type, account.name).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void t0(IBinder iBinder, Account account, String[] strArr) {
        if (iBinder != null && account != null && strArr != null) {
            try {
                Object obj = f4146c.b;
                new S2(IAccountManagerResponse.Stub.asInterface(iBinder), account, strArr).e();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean v(Account account) {
        if (account == null) {
            return false;
        }
        try {
            ArrayList arrayList = (ArrayList) f4146c.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a5 a5Var = (a5) obj;
                if (i.a(a5Var.f4054a, account)) {
                    a5Var.f4057e = System.currentTimeMillis();
                    V0();
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}

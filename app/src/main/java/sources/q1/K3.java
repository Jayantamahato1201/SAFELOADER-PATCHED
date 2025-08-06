package q1;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.HashMap;
import java.util.Map;

public interface K3 extends IInterface {
    void B(IBinder iBinder, Account account, Bundle bundle, boolean z2);

    void D(Account account, String str);

    String E(Account account, String str);

    void F(IBinder iBinder, String str, String str2, String[] strArr, boolean z2, Bundle bundle);

    Account[] G();

    String H0(Account account);

    Account[] I(String str);

    void J0(IBinder iBinder, Account account);

    void K0(IBinder iBinder, String str, boolean z2);

    void L(IBinder iBinder, Account account, String str);

    void M(String str, String str2);

    AuthenticatorDescription[] P0();

    void S(IBinder iBinder, String str, String str2);

    void a0(Account account, String str, String str2);

    void b0(IBinder iBinder, Account account, boolean z2);

    void c0(IBinder iBinder, String str, String[] strArr);

    void f(IBinder iBinder, String str, String[] strArr);

    String i(Account account, String str);

    HashMap o(String str, String str2);

    void q(Account account, String str, String str2);

    void r0(IBinder iBinder, Account account, String str, boolean z2, boolean z3, Bundle bundle);

    boolean s(Account account, String str, Bundle bundle, Map map);

    boolean s0(Account account);

    void t(IBinder iBinder, Account account, String str, boolean z2, Bundle bundle);

    void t0(IBinder iBinder, Account account, String[] strArr);

    boolean v(Account account);
}

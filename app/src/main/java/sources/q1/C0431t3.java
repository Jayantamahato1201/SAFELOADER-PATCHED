package q1;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q1.t3  reason: case insensitive filesystem */
public final class C0431t3 implements K3 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f4190a;

    public C0431t3(IBinder iBinder) {
        this.f4190a = iBinder;
    }

    public final void B(IBinder iBinder, Account account, Bundle bundle, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(z2 ? 1 : 0);
            this.f4190a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void D(Account account, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f4190a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final String E(Account account, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f4190a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void F(IBinder iBinder, String str, String str2, String[] strArr, boolean z2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeStringArray(strArr);
            obtain.writeInt(z2 ? 1 : 0);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final Account[] G() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeString((String) null);
            obtain.writeInt(0);
            this.f4190a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return (Account[]) obtain2.createTypedArray(Account.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String H0(Account account) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final Account[] I(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeString(str);
            this.f4190a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return (Account[]) obtain2.createTypedArray(Account.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void J0(IBinder iBinder, Account account) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void K0(IBinder iBinder, String str, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeInt(z2 ? 1 : 0);
            this.f4190a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void L(IBinder iBinder, Account account, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f4190a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void M(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f4190a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final AuthenticatorDescription[] P0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            this.f4190a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return (AuthenticatorDescription[]) obtain2.createTypedArray(AuthenticatorDescription.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void S(IBinder iBinder, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f4190a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a0(Account account, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f4190a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final IBinder asBinder() {
        return this.f4190a;
    }

    public final void b0(IBinder iBinder, Account account, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(z2 ? 1 : 0);
            this.f4190a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void c0(IBinder iBinder, String str, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeStringArray(strArr);
            this.f4190a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void f(IBinder iBinder, String str, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeStringArray(strArr);
            this.f4190a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String i(Account account, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f4190a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final HashMap o(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f4190a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(C0431t3.class.getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void q(Account account, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f4190a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void r0(IBinder iBinder, Account account, String str, boolean z2, boolean z3, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean s(Account account, String str, Bundle bundle, Map map) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            boolean z2 = true;
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeMap(map);
            this.f4190a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean s0(Account account) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            boolean z2 = true;
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void t(IBinder iBinder, Account account, String str, boolean z2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(z2 ? 1 : 0);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void t0(IBinder iBinder, Account account, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            obtain.writeStrongBinder(iBinder);
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f4190a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean v(Account account) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoAccountManagerService");
            boolean z2 = true;
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4190a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}

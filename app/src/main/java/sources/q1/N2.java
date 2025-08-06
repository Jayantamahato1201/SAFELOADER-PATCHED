package q1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

public final class N2 implements C0318a3 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3943a;

    public N2(IBinder iBinder) {
        this.f3943a = iBinder;
    }

    public final void A0(Intent intent, IBinder iBinder, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3943a.transact(8, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void N(IBinder iBinder, Intent intent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeStrongBinder(iBinder);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3943a.transact(3, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void W(String str, Intent intent, IBinder iBinder, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeInt(i2);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3943a.transact(4, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final IBinder Y(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeString(str);
            this.f3943a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3943a;
    }

    public final void h0(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeStrongBinder(iBinder);
            this.f3943a.transact(5, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void j0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            this.f3943a.transact(6, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void k0(IBinder iBinder, Intent intent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeStrongBinder(iBinder);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3943a.transact(2, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void r(String str, String str2, String str3, boolean z2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IApplicationThread");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(z2 ? 1 : 0);
            this.f3943a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

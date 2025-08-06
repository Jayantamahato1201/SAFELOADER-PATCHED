package q1;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class R3 implements C0325b4 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3981a;

    public R3(IBinder iBinder) {
        this.f3981a = iBinder;
    }

    public final ComponentName A(Intent intent, String str) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(1);
            intent.writeToParcel(obtain, 0);
            obtain.writeString(str);
            this.f3981a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ComponentName.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ComponentName componentName = (ComponentName) obj;
            obtain2.recycle();
            obtain.recycle();
            return componentName;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final IBinder C0(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(providerInfoArr.length);
            obtain.writeInt(strArr.length);
            obtain.writeInt(i2);
            this.f3981a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            obtain2.readTypedArray(providerInfoArr, ProviderInfo.CREATOR);
            obtain2.readStringArray(strArr);
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int H(Intent intent, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(1);
            intent.writeToParcel(obtain, 0);
            obtain.writeString(str);
            this.f3981a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean K(IBinder iBinder, Intent intent, IBinder iBinder2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeStrongBinder(iBinder);
            boolean z2 = true;
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(iBinder2);
            this.f3981a.transact(7, obtain, obtain2, 0);
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

    public final boolean R0(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeStrongBinder(iBinder);
            boolean z2 = false;
            this.f3981a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3981a;
    }

    public final int g0(Intent intent, String str, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(i2);
            obtain.writeInt(1);
            intent.writeToParcel(obtain, 0);
            obtain.writeString(str);
            this.f3981a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder h(ComponentName componentName, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(1);
            componentName.writeToParcel(obtain, 0);
            obtain.writeString(str);
            this.f3981a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ArrayList l(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(i2);
            this.f3981a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeStrongBinder(iBinder);
            this.f3981a.transact(12, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean m0(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            boolean z2 = false;
            this.f3981a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int n(Intent intent, IBinder iBinder, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            this.f3981a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean p0(ComponentName componentName, IBinder iBinder, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            boolean z2 = true;
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i2);
            this.f3981a.transact(4, obtain, obtain2, 0);
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

    public final void q0(int i2, IBinder iBinder, IntentFilter intentFilter) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeInt(i2);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(1);
            intentFilter.writeToParcel(obtain, 0);
            this.f3981a.transact(11, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void v0(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoActivityManagerService");
            obtain.writeString(str);
            obtain.writeString((String) null);
            this.f3981a.transact(14, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

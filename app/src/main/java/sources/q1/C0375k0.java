package q1;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: q1.k0  reason: case insensitive filesystem */
public final class C0375k0 implements C0422s0 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f4128a;

    public C0375k0(IBinder iBinder) {
        this.f4128a = iBinder;
    }

    public final ComponentName E0(IBinder iBinder) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            this.f4128a.transact(12, obtain, obtain2, 0);
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

    public final void G0(IBinder iBinder, IBinder iBinder2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeStrongBinder(iBinder2);
            this.f4128a.transact(5, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final Intent[] J(IBinder iBinder, Intent[] intentArr, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeTypedArray(intentArr, 0);
            obtain.writeInt(i2);
            this.f4128a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (Intent[]) obtain2.createTypedArray(Intent.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final List M0(int i2, long j2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeLong(j2);
            obtain.writeInt(i2);
            this.f4128a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Intent N0(IBinder iBinder, Intent intent, int i2) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i2);
            this.f4128a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = Intent.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            Intent intent2 = (Intent) obj;
            obtain2.recycle();
            obtain.recycle();
            return intent2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void Q(Intent intent, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f4128a.transact(3, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void T(IBinder iBinder, String str, String str2, String str3, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i2);
            this.f4128a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeString(str);
            obtain.writeString("0");
            this.f4128a.transact(7, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4128a;
    }

    public final List k(long j2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeLong(j2);
            this.f4128a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ActivityManager.RunningTaskInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Intent l0(long j2, Intent intent) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeLong(j2);
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4128a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = Intent.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            Intent intent2 = (Intent) obj;
            obtain2.recycle();
            obtain.recycle();
            return intent2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void n0(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeString(str);
            this.f4128a.transact(16, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean p(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeString(str);
            obtain.writeString("0");
            boolean z2 = false;
            this.f4128a.transact(14, obtain, obtain2, 0);
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

    public final boolean w() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            boolean z2 = false;
            this.f4128a.transact(18, obtain, obtain2, 0);
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

    public final String x() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            this.f4128a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String z(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            this.f4128a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void z0(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoWindowManagerService");
            obtain.writeStrongBinder(iBinder);
            this.f4128a.transact(8, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

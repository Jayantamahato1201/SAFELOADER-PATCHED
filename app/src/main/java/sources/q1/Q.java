package q1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class Q implements C0345f0 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3959a;

    public Q(IBinder iBinder) {
        this.f3959a = iBinder;
    }

    public final boolean B0(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            boolean z2 = false;
            this.f3959a.transact(1, obtain, obtain2, 0);
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

    public final ResolveInfo D0(Intent intent, String str, int i2) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ResolveInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ResolveInfo resolveInfo = (ResolveInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return resolveInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final String[] F0(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(i2);
            this.f3959a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ApplicationInfo I0(int i2, String str) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ApplicationInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return applicationInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final ProviderInfo L0(ComponentName componentName) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3959a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ProviderInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ProviderInfo providerInfo = (ProviderInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return providerInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void O(List list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            H.l(obtain, list, 0);
            this.f3959a.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ActivityInfo O0(ComponentName componentName) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3959a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ActivityInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ActivityInfo activityInfo = (ActivityInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return activityInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final ArrayList P(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f3959a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ProviderInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PackageInfo R(int i2, String str) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = PackageInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            PackageInfo packageInfo = (PackageInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return packageInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final ArrayList U(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(i2);
            this.f3959a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(PackageInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean V(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            boolean z2 = false;
            this.f3959a.transact(2, obtain, obtain2, 0);
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

    public final String[] X(int[] iArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeIntArray(iArr);
            this.f3959a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            this.f3959a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3959a;
    }

    public final List b(Intent intent, String str, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList createTypedArrayList = obtain2.createTypedArrayList(ResolveInfo.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            return createTypedArrayList;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final List c(Intent intent, String str, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList createTypedArrayList = obtain2.createTypedArrayList(ResolveInfo.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            return createTypedArrayList;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final List d(Intent intent, String str, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList createTypedArrayList = obtain2.createTypedArrayList(ResolveInfo.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            return createTypedArrayList;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void d0(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            obtain.writeString("0");
            this.f3959a.transact(27, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final List e(Intent intent, String str, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList createTypedArrayList = obtain2.createTypedArrayList(ResolveInfo.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            return createTypedArrayList;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final ResolveInfo e0(Intent intent, String str, int i2) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeInt(i2);
            this.f3959a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ResolveInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ResolveInfo resolveInfo = (ResolveInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return resolveInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final ArrayList f0(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(i2);
            this.f3959a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ApplicationInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String g(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(i2);
            this.f3959a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int i0(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            this.f3959a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ServiceInfo j(ComponentName componentName) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3959a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ServiceInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ServiceInfo serviceInfo = (ServiceInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return serviceInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final int o0(ComponentName componentName) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(1);
            componentName.writeToParcel(obtain, 0);
            this.f3959a.transact(37, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ActivityInfo u(ComponentName componentName) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3959a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ActivityInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ActivityInfo activityInfo = (ActivityInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return activityInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean u0(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            boolean z2 = false;
            this.f3959a.transact(34, obtain, obtain2, 0);
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

    public final ProviderInfo w0(String str) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            this.f3959a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ProviderInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            ProviderInfo providerInfo = (ProviderInfo) obj;
            obtain2.recycle();
            obtain.recycle();
            return providerInfo;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final String x0(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            this.f3959a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int y(int i2, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeString(str);
            obtain.writeInt(2);
            this.f3959a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void y0(ComponentName componentName, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoPackageManagerService");
            obtain.writeInt(1);
            componentName.writeToParcel(obtain, 0);
            obtain.writeInt(i2);
            this.f3959a.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

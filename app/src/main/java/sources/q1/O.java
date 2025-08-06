package q1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

public final class O extends J4 {

    /* renamed from: c  reason: collision with root package name */
    public static final C0 f3948c;

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3949a;
    public final IInterface b;

    static {
        boolean z2 = T4.f4002h;
        C0 c02 = C0.f3864a;
        if (z2) {
            try {
                Method declaredMethod = IBinder.class.getDeclaredMethod("getExtension", H.f3886c);
                declaredMethod.setAccessible(true);
                c02 = new C0351g0(declaredMethod, 1);
            } catch (Exception unused) {
            }
        }
        f3948c = c02;
    }

    public O(IBinder iBinder, IInterface iInterface) {
        this.f3949a = iBinder;
        this.b = iInterface;
    }

    public final void dump(FileDescriptor fileDescriptor, String[] strArr) {
        this.f3949a.dump(fileDescriptor, strArr);
    }

    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        this.f3949a.dumpAsync(fileDescriptor, strArr);
    }

    public IBinder getExtension() {
        return (IBinder) f3948c.b(this.f3949a, new Object[0]);
    }

    public final String getInterfaceDescriptor() {
        return this.f3949a.getInterfaceDescriptor();
    }

    public final boolean isBinderAlive() {
        return this.f3949a.isBinderAlive();
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i2) {
        this.f3949a.linkToDeath(deathRecipient, i2);
    }

    public final boolean pingBinder() {
        return this.f3949a.pingBinder();
    }

    public final IInterface queryLocalInterface(String str) {
        return this.b;
    }

    public final boolean transact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        return this.f3949a.transact(i2, parcel, parcel2, i3);
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i2) {
        return this.f3949a.unlinkToDeath(deathRecipient, i2);
    }
}

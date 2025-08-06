package q1;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: q1.g  reason: case insensitive filesystem */
public final class C0350g implements C0451x {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f4097a;

    public C0350g(IBinder iBinder) {
        this.f4097a = iBinder;
    }

    public final void C(Uri uri, IBinder iBinder, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoContentService");
            obtain.writeInt(1);
            uri.writeToParcel(obtain, 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeStrongBinder(iBinder);
            this.f4097a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void Q0(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoContentService");
            obtain.writeStrongBinder(iBinder);
            this.f4097a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void Z(Uri uri, IBinder iBinder, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("top.bienvenido.mundo.IMundoContentService");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(z2 ? 1 : 0);
            this.f4097a.transact(3, obtain, obtain2, 0);
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
        return this.f4097a;
    }
}

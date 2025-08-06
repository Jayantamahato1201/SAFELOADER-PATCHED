package q1;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q1.l  reason: case insensitive filesystem */
public abstract class C0380l extends Binder implements C0451x {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4131a = 0;

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("top.bienvenido.mundo.IMundoContentService");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("top.bienvenido.mundo.IMundoContentService");
            return true;
        }
        boolean z2 = false;
        Object obj = null;
        if (i2 == 1) {
            Parcelable.Creator creator = Uri.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            }
            Uri uri = (Uri) obj;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            ((Z) this).C(uri, parcel.readStrongBinder(), z2);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            ((Z) this).Q0(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i2 != 3) {
            return super.onTransact(i2, parcel, parcel2, i3);
        } else {
            Parcelable.Creator creator2 = Uri.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator2.createFromParcel(parcel);
            }
            Uri uri2 = (Uri) obj;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            ((Z) this).Z(uri2, readStrongBinder, z2);
            parcel2.writeNoException();
        }
        return true;
    }

    public final IBinder asBinder() {
        return this;
    }
}

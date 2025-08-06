package q1;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;

public abstract class T2 extends Binder implements C0318a3 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3993a = 0;

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z2;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("top.bienvenido.mundo.IApplicationThread");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("top.bienvenido.mundo.IApplicationThread");
            return true;
        }
        Object obj = null;
        switch (i2) {
            case 1:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((C0433u) this).r(readString, readString2, readString3, z2);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                ((C0433u) this).k0(readStrongBinder, (Intent) obj);
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                Parcelable.Creator creator2 = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                ((C0433u) this).N(readStrongBinder2, (Intent) obj);
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                Parcelable.Creator creator3 = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator3.createFromParcel(parcel);
                }
                ((C0433u) this).W(readString4, (Intent) obj, readStrongBinder3, readInt);
                return true;
            case 5:
                ((C0433u) this).h0(parcel.readStrongBinder());
                return true;
            case 6:
                Process.killProcess(Process.myPid());
                return true;
            case 7:
                IBinder Y2 = ((C0433u) this).Y(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(Y2);
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                String readString5 = parcel.readString();
                Parcelable.Creator creator4 = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator4.createFromParcel(parcel);
                }
                Intent intent = (Intent) obj;
                if (readString5 != null) {
                    C0 c02 = Q0.f3960a;
                    d5.b.execute(new C0315a0(intent, readString5, 1));
                    return true;
                }
                C0 c03 = Q0.f3960a;
                d5.b.execute(new C0404p(readStrongBinder4, intent, 2));
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}

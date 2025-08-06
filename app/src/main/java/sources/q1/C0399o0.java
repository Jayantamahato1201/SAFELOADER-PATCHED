package q1;

import U0.i;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* renamed from: q1.o0  reason: case insensitive filesystem */
public abstract class C0399o0 extends Binder implements C0422s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4149a = 0;

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("top.bienvenido.mundo.IMundoWindowManagerService");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("top.bienvenido.mundo.IMundoWindowManagerService");
            return true;
        }
        Object obj = null;
        switch (i2) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                Intent N02 = ((C0339e0) this).N0(readStrongBinder, (Intent) obj, parcel.readInt());
                parcel2.writeNoException();
                if (N02 != null) {
                    parcel2.writeInt(1);
                    N02.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 2:
                Intent[] J2 = ((C0339e0) this).J(parcel.readStrongBinder(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(J2, 1);
                return true;
            case 3:
                Parcelable.Creator creator2 = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                String readString = parcel.readString();
                ((C0339e0) this).Q((Intent) obj, readString);
                return true;
            case 4:
                long readLong = parcel.readLong();
                Parcelable.Creator creator3 = Intent.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator3.createFromParcel(parcel);
                }
                Intent l02 = ((C0339e0) this).l0(readLong, (Intent) obj);
                parcel2.writeNoException();
                if (l02 != null) {
                    parcel2.writeInt(1);
                    l02.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                ((C0339e0) this).G0(parcel.readStrongBinder(), parcel.readStrongBinder());
                return true;
            case 6:
                C0339e0 e0Var = (C0339e0) this;
                boolean m02 = C0339e0.m0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(m02 ? 1 : 0);
                return true;
            case 7:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                C0339e0 e0Var2 = C0339e0.b;
                d5.f4080a.execute(new C0321b0((ActivityInfo) null, readString2, readString3));
                return true;
            case 8:
                ((C0339e0) this).z0(parcel.readStrongBinder());
                return true;
            case 9:
                List k2 = ((C0339e0) this).k(parcel.readLong());
                parcel2.writeNoException();
                if (k2 != null) {
                    int size = k2.size();
                    parcel2.writeInt(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Parcelable parcelable = (Parcelable) k2.get(i4);
                        if (parcelable != null) {
                            parcel2.writeInt(1);
                            parcelable.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                    }
                    break;
                } else {
                    parcel2.writeInt(-1);
                    return true;
                }
            case 10:
                long readLong2 = parcel.readLong();
                List M02 = ((C0339e0) this).M0(parcel.readInt(), readLong2);
                parcel2.writeNoException();
                if (M02 != null) {
                    int size2 = M02.size();
                    parcel2.writeInt(size2);
                    for (int i5 = 0; i5 < size2; i5++) {
                        Parcelable parcelable2 = (Parcelable) M02.get(i5);
                        if (parcelable2 != null) {
                            parcel2.writeInt(1);
                            parcelable2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                    }
                    break;
                } else {
                    parcel2.writeInt(-1);
                    return true;
                }
            case 11:
                ((C0339e0) this).T(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                ComponentName E02 = ((C0339e0) this).E0(parcel.readStrongBinder());
                parcel2.writeNoException();
                if (E02 != null) {
                    parcel2.writeInt(1);
                    E02.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 13:
                String z2 = ((C0339e0) this).z(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeString(z2);
                return true;
            case 14:
                boolean p2 = ((C0339e0) this).p(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(p2 ? 1 : 0);
                return true;
            case 15:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                C0339e0 e0Var3 = (C0339e0) this;
                try {
                    ArrayList arrayList = new ArrayList();
                    Enumeration elements = C0339e0.f4082c.elements();
                    i.e("<this>", elements);
                    while (elements.hasMoreElements()) {
                        C0354g3 g3Var = (C0354g3) elements.nextElement();
                        if (readString4 == null || i.a(g3Var.f4102c.f3962a, readString4)) {
                            if (readString5 != null) {
                                if (readString5.length() != 0) {
                                    if (!readString5.equals(g3Var.f4101a.name)) {
                                    }
                                }
                            }
                            arrayList.add(g3Var);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C0339e0.b1(arrayList);
                        break;
                    }
                } catch (Exception unused) {
                    break;
                }
                break;
            case 16:
                ((C0339e0) this).n0(parcel.readString());
                return true;
            case 17:
                String x2 = ((C0339e0) this).x();
                parcel2.writeNoException();
                parcel2.writeString(x2);
                return true;
            case 18:
                boolean w2 = ((C0339e0) this).w();
                parcel2.writeNoException();
                parcel2.writeInt(w2 ? 1 : 0);
                return true;
            case 19:
                parcel.readString();
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
        return true;
    }

    public final IBinder asBinder() {
        return this;
    }
}

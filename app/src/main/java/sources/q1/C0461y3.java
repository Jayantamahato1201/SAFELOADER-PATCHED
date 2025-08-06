package q1;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: q1.y3  reason: case insensitive filesystem */
public abstract class C0461y3 extends Binder implements K3 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4252a = 0;

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj2;
        boolean z5;
        Object obj3;
        int i4 = i2;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel3.enforceInterface("top.bienvenido.mundo.IMundoAccountManagerService");
        }
        if (i4 == 1598968902) {
            parcel4.writeString("top.bienvenido.mundo.IMundoAccountManagerService");
            return true;
        }
        boolean z6 = false;
        Object obj4 = null;
        switch (i4) {
            case 1:
                Parcelable.Creator creator = Account.CREATOR;
                String H02 = ((C0395n2) this).H0((Account) H.e(parcel3));
                parcel4.writeNoException();
                parcel4.writeString(H02);
                return true;
            case 2:
                Parcelable.Creator creator2 = Account.CREATOR;
                String i5 = ((C0395n2) this).i((Account) H.e(parcel3), parcel3.readString());
                parcel4.writeNoException();
                parcel4.writeString(i5);
                return true;
            case 3:
                AuthenticatorDescription[] P02 = ((C0395n2) this).P0();
                parcel4.writeNoException();
                parcel4.writeTypedArray(P02, 1);
                return true;
            case 4:
                parcel3.readString();
                parcel3.readInt();
                Account[] G2 = ((C0395n2) this).G();
                parcel4.writeNoException();
                parcel4.writeTypedArray(G2, 1);
                return true;
            case 5:
                Account[] I2 = ((C0395n2) this).I(parcel3.readString());
                parcel4.writeNoException();
                parcel4.writeTypedArray(I2, 1);
                return true;
            case 6:
                IBinder readStrongBinder = parcel3.readStrongBinder();
                Parcelable.Creator creator3 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator3.createFromParcel(parcel3);
                }
                ((C0395n2) this).t0(readStrongBinder, (Account) obj4, parcel3.createStringArray());
                parcel4.writeNoException();
                return true;
            case 7:
                ((C0395n2) this).c0(parcel3.readStrongBinder(), parcel3.readString(), parcel3.createStringArray());
                parcel4.writeNoException();
                return true;
            case 8:
                ((C0395n2) this).f(parcel3.readStrongBinder(), parcel3.readString(), parcel3.createStringArray());
                parcel4.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder2 = parcel3.readStrongBinder();
                Parcelable.Creator creator4 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator4.createFromParcel(parcel3);
                }
                Account account = (Account) obj4;
                if (parcel3.readInt() != 0) {
                    z6 = true;
                }
                ((C0395n2) this).b0(readStrongBinder2, account, z6);
                parcel4.writeNoException();
                return true;
            case 10:
                Parcelable.Creator creator5 = Account.CREATOR;
                Account account2 = (Account) H.e(parcel3);
                if (account2 != null) {
                    z6 = C0395n2.S0(account2);
                }
                parcel4.writeNoException();
                parcel4.writeInt(z6 ? 1 : 0);
                return true;
            case 11:
                ((C0395n2) this).M(parcel3.readString(), parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 12:
                Parcelable.Creator creator6 = Account.CREATOR;
                String E2 = ((C0395n2) this).E((Account) H.e(parcel3), parcel3.readString());
                parcel4.writeNoException();
                parcel4.writeString(E2);
                return true;
            case 13:
                Parcelable.Creator creator7 = Account.CREATOR;
                ((C0395n2) this).a0((Account) H.e(parcel3), parcel3.readString(), parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 14:
                Parcelable.Creator creator8 = Account.CREATOR;
                ((C0395n2) this).D((Account) H.e(parcel3), parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 15:
                Parcelable.Creator creator9 = Account.CREATOR;
                ((C0395n2) this).q((Account) H.e(parcel3), parcel3.readString(), parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel3.readStrongBinder();
                Parcelable.Creator creator10 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj = creator10.createFromParcel(parcel3);
                } else {
                    obj = null;
                }
                Account account3 = (Account) obj;
                String readString = parcel3.readString();
                if (parcel3.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel3.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Parcelable.Creator creator11 = Bundle.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator11.createFromParcel(parcel3);
                }
                ((C0395n2) this).r0(readStrongBinder3, account3, readString, z2, z3, (Bundle) obj4);
                parcel4.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder4 = parcel3.readStrongBinder();
                String readString2 = parcel3.readString();
                String readString3 = parcel3.readString();
                String[] createStringArray = parcel3.createStringArray();
                if (parcel3.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Parcelable.Creator creator12 = Bundle.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator12.createFromParcel(parcel3);
                }
                ((C0395n2) this).F(readStrongBinder4, readString2, readString3, createStringArray, z4, (Bundle) obj4);
                parcel4.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder5 = parcel3.readStrongBinder();
                Parcelable.Creator creator13 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj2 = creator13.createFromParcel(parcel3);
                } else {
                    obj2 = null;
                }
                Account account4 = (Account) obj2;
                String readString4 = parcel3.readString();
                if (parcel3.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Parcelable.Creator creator14 = Bundle.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator14.createFromParcel(parcel3);
                }
                ((C0395n2) this).t(readStrongBinder5, account4, readString4, z5, (Bundle) obj4);
                parcel4.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder6 = parcel3.readStrongBinder();
                String readString5 = parcel3.readString();
                if (parcel3.readInt() != 0) {
                    z6 = true;
                }
                ((C0395n2) this).K0(readStrongBinder6, readString5, z6);
                parcel4.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder7 = parcel3.readStrongBinder();
                Parcelable.Creator creator15 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj3 = creator15.createFromParcel(parcel3);
                } else {
                    obj3 = null;
                }
                Account account5 = (Account) obj3;
                Parcelable.Creator creator16 = Bundle.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator16.createFromParcel(parcel3);
                }
                Bundle bundle = (Bundle) obj4;
                if (parcel3.readInt() != 0) {
                    z6 = true;
                }
                ((C0395n2) this).B(readStrongBinder7, account5, bundle, z6);
                parcel4.writeNoException();
                return true;
            case 21:
                Parcelable.Creator creator17 = Account.CREATOR;
                boolean v2 = ((C0395n2) this).v((Account) H.e(parcel3));
                parcel4.writeNoException();
                parcel4.writeInt(v2 ? 1 : 0);
                return true;
            case 22:
                ((C0395n2) this).S(parcel3.readStrongBinder(), parcel3.readString(), parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 23:
                IBinder readStrongBinder8 = parcel3.readStrongBinder();
                Parcelable.Creator creator18 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator18.createFromParcel(parcel3);
                }
                ((C0395n2) this).L(readStrongBinder8, (Account) obj4, parcel3.readString());
                parcel4.writeNoException();
                return true;
            case 24:
                IBinder readStrongBinder9 = parcel3.readStrongBinder();
                Parcelable.Creator creator19 = Account.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator19.createFromParcel(parcel3);
                }
                ((C0395n2) this).J0(readStrongBinder9, (Account) obj4);
                parcel4.writeNoException();
                return true;
            case 25:
                Parcelable.Creator creator20 = Account.CREATOR;
                Account account6 = (Account) H.e(parcel3);
                String readString6 = parcel3.readString();
                Parcelable.Creator creator21 = Bundle.CREATOR;
                if (parcel3.readInt() != 0) {
                    obj4 = creator21.createFromParcel(parcel3);
                }
                boolean s2 = ((C0395n2) this).s(account6, readString6, (Bundle) obj4, parcel3.readHashMap(getClass().getClassLoader()));
                parcel4.writeNoException();
                parcel4.writeInt(s2 ? 1 : 0);
                return true;
            case 26:
                HashMap o2 = ((C0395n2) this).o(parcel3.readString(), parcel3.readString());
                parcel4.writeNoException();
                parcel4.writeMap(o2);
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}

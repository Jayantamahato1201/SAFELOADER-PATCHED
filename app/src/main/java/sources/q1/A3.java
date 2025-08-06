package q1;

import L0.e;
import T0.l;
import U0.i;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;

public final /* synthetic */ class A3 implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object[] f3862g;

    public /* synthetic */ A3(Object[] objArr, int i2) {
        this.f = i2;
        this.f3862g = objArr;
    }

    public final Object e(Object obj) {
        String str;
        IBinder iBinder;
        IBinder iBinder2;
        IBinder iBinder3;
        String str2;
        IBinder iBinder4;
        String str3;
        String str4;
        IBinder iBinder5;
        IBinder iBinder6;
        String str5;
        String str6;
        IBinder iBinder7;
        String str7;
        Boolean bool;
        IBinder iBinder8;
        String str8;
        String str9;
        IBinder iBinder9;
        String str10;
        String str11;
        switch (this.f) {
            case 0:
                Object[] objArr = this.f3862g;
                return ((C0422s0) obj).M0(H.f3901s, ((((long) ((Integer) objArr[0]).intValue()) << 32) & -4294967296L) | (((long) ((Integer) objArr[1]).intValue()) & 4294967295L));
            case 1:
                K3 k3 = (K3) obj;
                Object[] objArr2 = this.f3862g;
                Account account = (Account) objArr2[0];
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    str = obj2.toString();
                } else {
                    str = null;
                }
                return Boolean.valueOf(k3.s(account, str, (Bundle) objArr2[2], (Map) objArr2[3]));
            case 2:
                K3 k32 = (K3) obj;
                Object[] objArr3 = this.f3862g;
                IInterface iInterface = (IInterface) objArr3[0];
                String str12 = null;
                if (iInterface != null) {
                    iBinder = iInterface.asBinder();
                } else {
                    iBinder = null;
                }
                Account account2 = (Account) objArr3[1];
                Object obj3 = objArr3[2];
                if (obj3 != null) {
                    str12 = obj3.toString();
                }
                k32.L(iBinder, account2, str12);
                return e.f591c;
            case 3:
                K3 k33 = (K3) obj;
                Object[] objArr4 = this.f3862g;
                IInterface iInterface2 = (IInterface) objArr4[0];
                Boolean bool2 = null;
                if (iInterface2 != null) {
                    iBinder2 = iInterface2.asBinder();
                } else {
                    iBinder2 = null;
                }
                Account account3 = (Account) objArr4[1];
                Bundle bundle = (Bundle) objArr4[2];
                Object obj4 = objArr4[3];
                if (obj4 instanceof Boolean) {
                    bool2 = (Boolean) obj4;
                }
                k33.B(iBinder2, account3, bundle, i.a(bool2, Boolean.TRUE));
                return e.f591c;
            case 4:
                K3 k34 = (K3) obj;
                Object[] objArr5 = this.f3862g;
                IInterface iInterface3 = (IInterface) objArr5[0];
                String str13 = null;
                if (iInterface3 != null) {
                    iBinder3 = iInterface3.asBinder();
                } else {
                    iBinder3 = null;
                }
                Object obj5 = objArr5[1];
                if (obj5 != null) {
                    str2 = obj5.toString();
                } else {
                    str2 = null;
                }
                Object obj6 = objArr5[2];
                if (obj6 != null) {
                    str13 = obj6.toString();
                }
                k34.S(iBinder3, str2, str13);
                return e.f591c;
            case 5:
                K3 k35 = (K3) obj;
                Object[] objArr6 = this.f3862g;
                IInterface iInterface4 = (IInterface) objArr6[0];
                Boolean bool3 = null;
                if (iInterface4 != null) {
                    iBinder4 = iInterface4.asBinder();
                } else {
                    iBinder4 = null;
                }
                Object obj7 = objArr6[1];
                if (obj7 != null) {
                    str3 = obj7.toString();
                } else {
                    str3 = null;
                }
                Object obj8 = objArr6[2];
                if (obj8 != null) {
                    str4 = obj8.toString();
                } else {
                    str4 = null;
                }
                String[] strArr = (String[]) objArr6[3];
                Object obj9 = objArr6[4];
                if (obj9 instanceof Boolean) {
                    bool3 = (Boolean) obj9;
                }
                String[] strArr2 = strArr;
                boolean a2 = i.a(bool3, Boolean.TRUE);
                k35.F(iBinder4, str3, str4, strArr2, a2, (Bundle) objArr6[5]);
                return e.f591c;
            case 6:
                K3 k36 = (K3) obj;
                Object[] objArr7 = this.f3862g;
                boolean z2 = false;
                IInterface iInterface5 = (IInterface) objArr7[0];
                if (iInterface5 != null) {
                    iBinder5 = iInterface5.asBinder();
                } else {
                    iBinder5 = null;
                }
                Account account4 = (Account) objArr7[1];
                if (T4.f3997a) {
                    z2 = i.a((Boolean) objArr7[2], Boolean.TRUE);
                }
                k36.b0(iBinder5, account4, z2);
                return e.f591c;
            case 7:
                K3 k37 = (K3) obj;
                Object[] objArr8 = this.f3862g;
                IInterface iInterface6 = (IInterface) objArr8[0];
                Boolean bool4 = null;
                if (iInterface6 != null) {
                    iBinder6 = iInterface6.asBinder();
                } else {
                    iBinder6 = null;
                }
                Object obj10 = objArr8[1];
                if (obj10 != null) {
                    str5 = obj10.toString();
                } else {
                    str5 = null;
                }
                Object obj11 = objArr8[2];
                if (obj11 instanceof Boolean) {
                    bool4 = (Boolean) obj11;
                }
                k37.K0(iBinder6, str5, i.a(bool4, Boolean.TRUE));
                return e.f591c;
            case 8:
                K3 k38 = (K3) obj;
                Object[] objArr9 = this.f3862g;
                Account account5 = (Account) objArr9[0];
                Object obj12 = objArr9[1];
                String str14 = null;
                if (obj12 != null) {
                    str6 = obj12.toString();
                } else {
                    str6 = null;
                }
                Object obj13 = objArr9[2];
                if (obj13 != null) {
                    str14 = obj13.toString();
                }
                k38.q(account5, str6, str14);
                return e.f591c;
            case 9:
                K3 k39 = (K3) obj;
                Object[] objArr10 = this.f3862g;
                IInterface iInterface7 = (IInterface) objArr10[0];
                Boolean bool5 = null;
                if (iInterface7 != null) {
                    iBinder7 = iInterface7.asBinder();
                } else {
                    iBinder7 = null;
                }
                Account account6 = (Account) objArr10[1];
                Object obj14 = objArr10[2];
                if (obj14 != null) {
                    str7 = obj14.toString();
                } else {
                    str7 = null;
                }
                Object obj15 = objArr10[3];
                if (obj15 instanceof Boolean) {
                    bool = (Boolean) obj15;
                } else {
                    bool = null;
                }
                Boolean bool6 = Boolean.TRUE;
                boolean a3 = i.a(bool, bool6);
                Object obj16 = objArr10[4];
                if (obj16 instanceof Boolean) {
                    bool5 = (Boolean) obj16;
                }
                k39.r0(iBinder7, account6, str7, a3, i.a(bool5, bool6), (Bundle) objArr10[5]);
                return e.f591c;
            case 10:
                K3 k310 = (K3) obj;
                Object[] objArr11 = this.f3862g;
                IInterface iInterface8 = (IInterface) objArr11[0];
                Boolean bool7 = null;
                if (iInterface8 != null) {
                    iBinder8 = iInterface8.asBinder();
                } else {
                    iBinder8 = null;
                }
                Account account7 = (Account) objArr11[1];
                Object obj17 = objArr11[2];
                if (obj17 != null) {
                    str8 = obj17.toString();
                } else {
                    str8 = null;
                }
                Object obj18 = objArr11[3];
                if (obj18 instanceof Boolean) {
                    bool7 = (Boolean) obj18;
                }
                k310.t(iBinder8, account7, str8, i.a(bool7, Boolean.TRUE), (Bundle) objArr11[4]);
                return e.f591c;
            case 11:
                K3 k311 = (K3) obj;
                Object[] objArr12 = this.f3862g;
                Account account8 = (Account) objArr12[0];
                Object obj19 = objArr12[1];
                String str15 = null;
                if (obj19 != null) {
                    str9 = obj19.toString();
                } else {
                    str9 = null;
                }
                Object obj20 = objArr12[2];
                if (obj20 != null) {
                    str15 = obj20.toString();
                }
                k311.a0(account8, str9, str15);
                return e.f591c;
            default:
                K3 k312 = (K3) obj;
                Object[] objArr13 = this.f3862g;
                IInterface iInterface9 = (IInterface) objArr13[0];
                Boolean bool8 = null;
                if (iInterface9 != null) {
                    iBinder9 = iInterface9.asBinder();
                } else {
                    iBinder9 = null;
                }
                Object obj21 = objArr13[1];
                if (obj21 != null) {
                    str10 = obj21.toString();
                } else {
                    str10 = null;
                }
                Object obj22 = objArr13[2];
                if (obj22 != null) {
                    str11 = obj22.toString();
                } else {
                    str11 = null;
                }
                String[] strArr3 = (String[]) objArr13[3];
                Object obj23 = objArr13[4];
                if (obj23 instanceof Boolean) {
                    bool8 = (Boolean) obj23;
                }
                k312.F(iBinder9, str10, str11, strArr3, i.a(bool8, Boolean.TRUE), (Bundle) objArr13[5]);
                return e.f591c;
        }
    }
}

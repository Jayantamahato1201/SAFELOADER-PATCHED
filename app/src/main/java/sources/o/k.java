package O;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.a;
import androidx.fragment.app.A;
import androidx.fragment.app.C0045b;
import androidx.fragment.app.E;
import androidx.fragment.app.H;
import androidx.versionedparcelable.ParcelImpl;
import b0.C0097v;
import b0.e0;
import b0.f0;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.p;
import java.util.ArrayList;
import k.S;

public final class k implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f633a;

    public /* synthetic */ k(int i2) {
        this.f633a = i2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$BaseSavedState, java.lang.Object, O.l] */
    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.fragment.app.A, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.E, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, b0.v] */
    /* JADX WARNING: type inference failed for: r0v8, types: [b0.e0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [b0.f0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v19, types: [android.view.View$BaseSavedState, k.S, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.view.View$BaseSavedState, r0.b, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.f633a) {
            case 0:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f = parcel.readInt();
                return baseSavedState;
            case 1:
                return new a(parcel);
            case 2:
                return new C0045b(parcel);
            case 3:
                ? obj = new Object();
                obj.f = parcel.readString();
                obj.f1191g = parcel.readInt();
                return obj;
            case 4:
                ? obj2 = new Object();
                obj2.f1226j = null;
                obj2.f1227k = new ArrayList();
                obj2.f1228l = new ArrayList();
                obj2.f = parcel.createTypedArrayList(H.CREATOR);
                obj2.f1223g = parcel.createStringArrayList();
                obj2.f1224h = (C0045b[]) parcel.createTypedArray(C0045b.CREATOR);
                obj2.f1225i = parcel.readInt();
                obj2.f1226j = parcel.readString();
                obj2.f1227k = parcel.createStringArrayList();
                obj2.f1228l = parcel.createTypedArrayList(Bundle.CREATOR);
                obj2.f1229m = parcel.createTypedArrayList(A.CREATOR);
                return obj2;
            case 5:
                return new H(parcel);
            case 6:
                ? obj3 = new Object();
                obj3.f = parcel.readInt();
                obj3.f1783g = parcel.readInt();
                boolean z5 = true;
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj3.f1784h = z5;
                return obj3;
            case 7:
                ? obj4 = new Object();
                obj4.f = parcel.readInt();
                obj4.f1668g = parcel.readInt();
                boolean z6 = true;
                if (parcel.readInt() != 1) {
                    z6 = false;
                }
                obj4.f1670i = z6;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj4.f1669h = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 8:
                ? obj5 = new Object();
                obj5.f = parcel.readInt();
                obj5.f1675g = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj5.f1676h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj5.f1677i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj5.f1678j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj5.f1679k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z7 = false;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj5.f1681m = z2;
                if (parcel.readInt() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                obj5.f1682n = z3;
                if (parcel.readInt() == 1) {
                    z7 = true;
                }
                obj5.f1683o = z7;
                obj5.f1680l = parcel.readArrayList(e0.class.getClassLoader());
                return obj5;
            case 9:
                Class<p> cls = p.class;
                return new b((p) parcel.readParcelable(cls.getClassLoader()), (p) parcel.readParcelable(cls.getClassLoader()), (d) parcel.readParcelable(d.class.getClassLoader()), (p) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case 10:
                return new d(parcel.readLong());
            case 11:
                return p.a(parcel.readInt(), parcel.readInt());
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                baseSavedState2.f = z4;
                return baseSavedState2;
            default:
                ? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f = ((Integer) parcel.readValue(r0.b.class.getClassLoader())).intValue();
                return baseSavedState3;
        }
    }

    public final Object[] newArray(int i2) {
        switch (this.f633a) {
            case 0:
                return new l[i2];
            case 1:
                return new a[i2];
            case 2:
                return new C0045b[i2];
            case 3:
                return new A[i2];
            case 4:
                return new E[i2];
            case 5:
                return new H[i2];
            case 6:
                return new C0097v[i2];
            case 7:
                return new e0[i2];
            case 8:
                return new f0[i2];
            case 9:
                return new b[i2];
            case 10:
                return new d[i2];
            case 11:
                return new p[i2];
            case 12:
                return new ParcelImpl[i2];
            case 13:
                return new S[i2];
            default:
                return new r0.b[i2];
        }
    }
}

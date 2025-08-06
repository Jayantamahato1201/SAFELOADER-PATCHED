package androidx.fragment.app;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new k(4);
    public ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f1223g;

    /* renamed from: h  reason: collision with root package name */
    public C0045b[] f1224h;

    /* renamed from: i  reason: collision with root package name */
    public int f1225i;

    /* renamed from: j  reason: collision with root package name */
    public String f1226j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f1227k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f1228l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1229m;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f);
        parcel.writeStringList(this.f1223g);
        parcel.writeTypedArray(this.f1224h, i2);
        parcel.writeInt(this.f1225i);
        parcel.writeString(this.f1226j);
        parcel.writeStringList(this.f1227k);
        parcel.writeTypedList(this.f1228l);
        parcel.writeTypedList(this.f1229m);
    }
}

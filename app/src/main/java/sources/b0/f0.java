package b0;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new k(8);
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1675g;

    /* renamed from: h  reason: collision with root package name */
    public int f1676h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1677i;

    /* renamed from: j  reason: collision with root package name */
    public int f1678j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f1679k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f1680l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1681m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1682n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1683o;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.f1675g);
        parcel.writeInt(this.f1676h);
        if (this.f1676h > 0) {
            parcel.writeIntArray(this.f1677i);
        }
        parcel.writeInt(this.f1678j);
        if (this.f1678j > 0) {
            parcel.writeIntArray(this.f1679k);
        }
        parcel.writeInt(this.f1681m ? 1 : 0);
        parcel.writeInt(this.f1682n ? 1 : 0);
        parcel.writeInt(this.f1683o ? 1 : 0);
        parcel.writeList(this.f1680l);
    }
}

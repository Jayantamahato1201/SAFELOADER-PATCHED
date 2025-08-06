package b0;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b0.v  reason: case insensitive filesystem */
public final class C0097v implements Parcelable {
    public static final Parcelable.Creator<C0097v> CREATOR = new k(6);
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1783g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1784h;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.f1783g);
        parcel.writeInt(this.f1784h ? 1 : 0);
    }
}

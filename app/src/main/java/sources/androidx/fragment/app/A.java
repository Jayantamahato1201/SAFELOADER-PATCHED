package androidx.fragment.app;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;

public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new k(3);
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public int f1191g;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeInt(this.f1191g);
    }
}

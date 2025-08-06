package androidx.versionedparcelable;

import O.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0174b;
import h0.C0175c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(12);
    public final C0175c f;

    public ParcelImpl(Parcel parcel) {
        this.f = new C0174b(parcel).g();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        new C0174b(parcel).i(this.f);
    }
}

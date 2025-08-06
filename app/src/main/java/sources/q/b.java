package Q;

import F0.e;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new e(2);

    /* renamed from: g  reason: collision with root package name */
    public static final a f648g = new b();
    public final Parcelable f;

    public b() {
        this.f = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f, i2);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == f648g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f = readParcelable == null ? f648g : readParcelable;
    }
}

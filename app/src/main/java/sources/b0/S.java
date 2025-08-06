package b0;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class S extends b {
    public static final Parcelable.Creator<S> CREATOR = new e(3);

    /* renamed from: h  reason: collision with root package name */
    public Parcelable f1603h;

    public S(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1603h = parcel.readParcelable(classLoader == null ? J.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f1603h, 0);
    }
}

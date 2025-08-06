package p0;

import F0.e;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends Q.b {
    public static final Parcelable.Creator<b> CREATOR = new e(7);

    /* renamed from: h  reason: collision with root package name */
    public boolean f3777h;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f3777h = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3777h ? 1 : 0);
    }
}

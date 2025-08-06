package k;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class u1 extends b {
    public static final Parcelable.Creator<u1> CREATOR = new e(5);

    /* renamed from: h  reason: collision with root package name */
    public int f3568h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3569i;

    public u1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        this.f3568h = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f3569i = z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3568h);
        parcel.writeInt(this.f3569i ? 1 : 0);
    }
}

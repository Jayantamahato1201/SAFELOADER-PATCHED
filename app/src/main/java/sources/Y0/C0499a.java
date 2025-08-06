package y0;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y0.a  reason: case insensitive filesystem */
public final class C0499a extends b {
    public static final Parcelable.Creator<C0499a> CREATOR = new e(9);

    /* renamed from: h  reason: collision with root package name */
    public boolean f4766h;

    public C0499a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4766h = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4766h ? 1 : 0);
    }
}

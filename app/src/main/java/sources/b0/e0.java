package b0;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new k(7);
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1668g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f1669h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1670i;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f + ", mGapDir=" + this.f1668g + ", mHasUnwantedGapAfter=" + this.f1670i + ", mGapPerSpan=" + Arrays.toString(this.f1669h) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.f1668g);
        parcel.writeInt(this.f1670i ? 1 : 0);
        int[] iArr = this.f1669h;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f1669h);
    }
}

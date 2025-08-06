package v;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new e(8);

    /* renamed from: h  reason: collision with root package name */
    public SparseArray f4743h;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4743h = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f4743h.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f4743h;
        if (sparseArray != null) {
            i3 = sparseArray.size();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        int[] iArr = new int[i3];
        Parcelable[] parcelableArr = new Parcelable[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = this.f4743h.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f4743h.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}

package k;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class h1 extends b {
    public static final Parcelable.Creator<h1> CREATOR = new e(4);

    /* renamed from: h  reason: collision with root package name */
    public boolean f3469h;

    public h1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3469h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3469h + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f3469h));
    }
}

package k;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class S extends View.BaseSavedState {
    public static final Parcelable.Creator<S> CREATOR = new k(13);
    public boolean f;

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f ? (byte) 1 : 0);
    }
}

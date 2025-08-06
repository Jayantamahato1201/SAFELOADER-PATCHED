package O;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new k(0);
    public int f;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f);
    }
}

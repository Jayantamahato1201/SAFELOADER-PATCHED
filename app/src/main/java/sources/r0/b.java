package r0;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new k(14);
    public int f;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i2 = this.f;
        if (i2 == 1) {
            str = "checked";
        } else if (i2 != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f));
    }
}

package H0;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class I extends b {
    public static final Parcelable.Creator<I> CREATOR = new e(1);

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f278h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f279i;

    public I(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f278h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f279i = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f278h + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f278h, parcel, i2);
        parcel.writeInt(this.f279i ? 1 : 0);
    }
}

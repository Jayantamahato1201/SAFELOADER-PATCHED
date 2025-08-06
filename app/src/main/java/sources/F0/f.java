package F0;

import Q.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    /* renamed from: h  reason: collision with root package name */
    public final int f227h;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f227h = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f227h);
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f227h = sideSheetBehavior.f2062h;
    }
}

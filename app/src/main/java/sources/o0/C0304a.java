package o0;

import F0.e;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: o0.a  reason: case insensitive filesystem */
public final class C0304a extends b {
    public static final Parcelable.Creator<C0304a> CREATOR = new e(6);

    /* renamed from: h  reason: collision with root package name */
    public final int f3729h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3730i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3731j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3732k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3733l;

    public C0304a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3729h = parcel.readInt();
        this.f3730i = parcel.readInt();
        boolean z2 = false;
        this.f3731j = parcel.readInt() == 1;
        this.f3732k = parcel.readInt() == 1;
        this.f3733l = parcel.readInt() == 1 ? true : z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3729h);
        parcel.writeInt(this.f3730i);
        parcel.writeInt(this.f3731j ? 1 : 0);
        parcel.writeInt(this.f3732k ? 1 : 0);
        parcel.writeInt(this.f3733l ? 1 : 0);
    }

    public C0304a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f3729h = bottomSheetBehavior.f1856L;
        this.f3730i = bottomSheetBehavior.f1878e;
        this.f3731j = bottomSheetBehavior.b;
        this.f3732k = bottomSheetBehavior.f1853I;
        this.f3733l = bottomSheetBehavior.f1854J;
    }
}

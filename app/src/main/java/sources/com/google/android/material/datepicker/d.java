package com.google.android.material.datepicker;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new k(10);
    public final long f;

    public d(long j2) {
        this.f = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f == ((d) obj).f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f);
    }
}

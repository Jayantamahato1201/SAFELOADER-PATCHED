package q1;

import T0.l;
import android.os.Parcel;
import android.os.Parcelable;

public final class J implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable.Creator f3918a;
    public final l b;

    public J(Parcelable.Creator creator, l lVar) {
        this.f3918a = creator;
        this.b = lVar;
    }

    public final Object createFromParcel(Parcel parcel) {
        Object createFromParcel = this.f3918a.createFromParcel(parcel);
        this.b.e(createFromParcel);
        return createFromParcel;
    }

    public final Object[] newArray(int i2) {
        return this.f3918a.newArray(i2);
    }
}

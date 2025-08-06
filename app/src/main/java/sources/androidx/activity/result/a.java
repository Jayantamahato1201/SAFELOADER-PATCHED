package androidx.activity.result;

import O.k;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new k(1);
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f875g;

    public a(int i2, Intent intent) {
        this.f = i2;
        this.f875g = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f;
        if (i2 == -1) {
            str = "RESULT_OK";
        } else if (i2 != 0) {
            str = String.valueOf(i2);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f875g);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeInt(this.f);
        Intent intent = this.f875g;
        if (intent == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        parcel.writeInt(i3);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public a(Parcel parcel) {
        this.f = parcel.readInt();
        this.f875g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

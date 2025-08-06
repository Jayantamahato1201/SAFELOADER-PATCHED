package androidx.fragment.app;

import O.k;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new k(5);
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1239g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1240h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1241i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1242j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1243k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1244l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1245m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1246n;

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f1247o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1248p;

    /* renamed from: q  reason: collision with root package name */
    public final int f1249q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f1250r;

    public H(C0058o oVar) {
        this.f = oVar.getClass().getName();
        this.f1239g = oVar.f1361e;
        this.f1240h = oVar.f1368m;
        this.f1241i = oVar.f1377v;
        this.f1242j = oVar.f1378w;
        this.f1243k = oVar.f1379x;
        this.f1244l = oVar.f1343A;
        this.f1245m = oVar.f1367l;
        this.f1246n = oVar.f1381z;
        this.f1247o = oVar.f;
        this.f1248p = oVar.f1380y;
        this.f1249q = oVar.f1352K.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f);
        sb.append(" (");
        sb.append(this.f1239g);
        sb.append(")}:");
        if (this.f1240h) {
            sb.append(" fromLayout");
        }
        int i2 = this.f1242j;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1243k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1244l) {
            sb.append(" retainInstance");
        }
        if (this.f1245m) {
            sb.append(" removing");
        }
        if (this.f1246n) {
            sb.append(" detached");
        }
        if (this.f1248p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeString(this.f1239g);
        parcel.writeInt(this.f1240h ? 1 : 0);
        parcel.writeInt(this.f1241i);
        parcel.writeInt(this.f1242j);
        parcel.writeString(this.f1243k);
        parcel.writeInt(this.f1244l ? 1 : 0);
        parcel.writeInt(this.f1245m ? 1 : 0);
        parcel.writeInt(this.f1246n ? 1 : 0);
        parcel.writeBundle(this.f1247o);
        parcel.writeInt(this.f1248p ? 1 : 0);
        parcel.writeBundle(this.f1250r);
        parcel.writeInt(this.f1249q);
    }

    public H(Parcel parcel) {
        this.f = parcel.readString();
        this.f1239g = parcel.readString();
        boolean z2 = false;
        this.f1240h = parcel.readInt() != 0;
        this.f1241i = parcel.readInt();
        this.f1242j = parcel.readInt();
        this.f1243k = parcel.readString();
        this.f1244l = parcel.readInt() != 0;
        this.f1245m = parcel.readInt() != 0;
        this.f1246n = parcel.readInt() != 0;
        this.f1247o = parcel.readBundle();
        this.f1248p = parcel.readInt() != 0 ? true : z2;
        this.f1250r = parcel.readBundle();
        this.f1249q = parcel.readInt();
    }
}

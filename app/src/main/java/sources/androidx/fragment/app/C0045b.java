package androidx.fragment.app;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
public final class C0045b implements Parcelable {
    public static final Parcelable.Creator<C0045b> CREATOR = new k(2);
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1288g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f1289h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1290i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1291j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1292k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1293l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1294m;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f1295n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1296o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f1297p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f1298q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f1299r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1300s;

    public C0045b(C0044a aVar) {
        int size = aVar.f1272a.size();
        this.f = new int[(size * 5)];
        if (aVar.f1276g) {
            this.f1288g = new ArrayList(size);
            this.f1289h = new int[size];
            this.f1290i = new int[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                J j2 = (J) aVar.f1272a.get(i3);
                int i4 = i2 + 1;
                this.f[i2] = j2.f1255a;
                ArrayList arrayList = this.f1288g;
                C0058o oVar = j2.b;
                arrayList.add(oVar != null ? oVar.f1361e : null);
                int[] iArr = this.f;
                iArr[i4] = j2.f1256c;
                iArr[i2 + 2] = j2.f1257d;
                int i5 = i2 + 4;
                iArr[i2 + 3] = j2.f1258e;
                i2 += 5;
                iArr[i5] = j2.f;
                this.f1289h[i3] = j2.f1259g.ordinal();
                this.f1290i[i3] = j2.f1260h.ordinal();
            }
            this.f1291j = aVar.f;
            this.f1292k = aVar.f1277h;
            this.f1293l = aVar.f1287r;
            this.f1294m = aVar.f1278i;
            this.f1295n = aVar.f1279j;
            this.f1296o = aVar.f1280k;
            this.f1297p = aVar.f1281l;
            this.f1298q = aVar.f1282m;
            this.f1299r = aVar.f1283n;
            this.f1300s = aVar.f1284o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.f1288g);
        parcel.writeIntArray(this.f1289h);
        parcel.writeIntArray(this.f1290i);
        parcel.writeInt(this.f1291j);
        parcel.writeString(this.f1292k);
        parcel.writeInt(this.f1293l);
        parcel.writeInt(this.f1294m);
        TextUtils.writeToParcel(this.f1295n, parcel, 0);
        parcel.writeInt(this.f1296o);
        TextUtils.writeToParcel(this.f1297p, parcel, 0);
        parcel.writeStringList(this.f1298q);
        parcel.writeStringList(this.f1299r);
        parcel.writeInt(this.f1300s ? 1 : 0);
    }

    public C0045b(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.f1288g = parcel.createStringArrayList();
        this.f1289h = parcel.createIntArray();
        this.f1290i = parcel.createIntArray();
        this.f1291j = parcel.readInt();
        this.f1292k = parcel.readString();
        this.f1293l = parcel.readInt();
        this.f1294m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1295n = (CharSequence) creator.createFromParcel(parcel);
        this.f1296o = parcel.readInt();
        this.f1297p = (CharSequence) creator.createFromParcel(parcel);
        this.f1298q = parcel.createStringArrayList();
        this.f1299r = parcel.createStringArrayList();
        this.f1300s = parcel.readInt() != 0;
    }
}

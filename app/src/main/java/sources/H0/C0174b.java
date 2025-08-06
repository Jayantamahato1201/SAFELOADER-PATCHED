package h0;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0289b;
import n.k;

/* renamed from: h0.b  reason: case insensitive filesystem */
public final class C0174b extends C0173a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f2901d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f2902e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2903g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2904h;

    /* renamed from: i  reason: collision with root package name */
    public int f2905i;

    /* renamed from: j  reason: collision with root package name */
    public int f2906j;

    /* renamed from: k  reason: collision with root package name */
    public int f2907k;

    /* JADX WARNING: type inference failed for: r5v0, types: [n.b, n.k] */
    /* JADX WARNING: type inference failed for: r6v0, types: [n.b, n.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [n.b, n.k] */
    public C0174b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(), new k(), new k());
    }

    public final C0174b a() {
        Parcel parcel = this.f2902e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f2906j;
        if (i2 == this.f) {
            i2 = this.f2903g;
        }
        return new C0174b(parcel, dataPosition, i2, this.f2904h + "  ", this.f2899a, this.b, this.f2900c);
    }

    public final boolean e(int i2) {
        while (this.f2906j < this.f2903g) {
            int i3 = this.f2907k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f2906j;
            Parcel parcel = this.f2902e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f2907k = parcel.readInt();
            this.f2906j += readInt;
        }
        if (this.f2907k == i2) {
            return true;
        }
        return false;
    }

    public final void h(int i2) {
        int i3 = this.f2905i;
        SparseIntArray sparseIntArray = this.f2901d;
        Parcel parcel = this.f2902e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f2905i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C0174b(Parcel parcel, int i2, int i3, String str, C0289b bVar, C0289b bVar2, C0289b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f2901d = new SparseIntArray();
        this.f2905i = -1;
        this.f2907k = -1;
        this.f2902e = parcel;
        this.f = i2;
        this.f2903g = i3;
        this.f2906j = i2;
        this.f2904h = str;
    }
}

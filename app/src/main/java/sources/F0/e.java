package F0;

import H0.I;
import Q.b;
import android.os.Parcel;
import android.os.Parcelable;
import b0.S;
import k.h1;
import k.u1;
import o0.C0304a;
import v.f;
import y0.C0499a;

public final class e implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f226a;

    public /* synthetic */ e(int i2) {
        this.f226a = i2;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f226a) {
            case 0:
                return new f(parcel, classLoader);
            case 1:
                return new I(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return b.f648g;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new S(parcel, classLoader);
            case 4:
                return new h1(parcel, classLoader);
            case 5:
                return new u1(parcel, classLoader);
            case 6:
                return new C0304a(parcel, classLoader);
            case 7:
                return new p0.b(parcel, classLoader);
            case 8:
                return new f(parcel, classLoader);
            default:
                return new C0499a(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i2) {
        switch (this.f226a) {
            case 0:
                return new f[i2];
            case 1:
                return new I[i2];
            case 2:
                return new b[i2];
            case 3:
                return new S[i2];
            case 4:
                return new h1[i2];
            case 5:
                return new u1[i2];
            case 6:
                return new C0304a[i2];
            case 7:
                return new p0.b[i2];
            case 8:
                return new f[i2];
            default:
                return new C0499a[i2];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f226a) {
            case 0:
                return new f(parcel, (ClassLoader) null);
            case 1:
                return new I(parcel, (ClassLoader) null);
            case 2:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return b.f648g;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new S(parcel, (ClassLoader) null);
            case 4:
                return new h1(parcel, (ClassLoader) null);
            case 5:
                return new u1(parcel, (ClassLoader) null);
            case 6:
                return new C0304a(parcel, (ClassLoader) null);
            case 7:
                return new p0.b(parcel, (ClassLoader) null);
            case 8:
                return new f(parcel, (ClassLoader) null);
            default:
                return new C0499a(parcel, (ClassLoader) null);
        }
    }
}

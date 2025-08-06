package q1;

import Q0.k;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import h1.h;
import java.io.File;
import java.util.Arrays;

/* renamed from: q1.r2  reason: case insensitive filesystem */
public final class C0418r2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4181a;
    public final Object b;

    public C0418r2(X3 x3) {
        this.f4181a = x3;
        h hVar = new h();
        int[] iArr = H.b;
        hVar.f2923c = iArr;
        hVar.f2924d = iArr;
        hVar.b = 0;
        this.b = hVar;
    }

    public int a(String str) {
        try {
            h hVar = (h) this.b;
            int a2 = H.a(hVar.b, str.hashCode(), (int[]) hVar.f2923c);
            if (a2 < 0) {
                return 0;
            }
            return ((int[]) hVar.f2924d)[a2];
        } catch (Exception unused) {
            return 0;
        }
    }

    public void b() {
        X3 x3 = (X3) this.f4181a;
        try {
            boolean z2 = F3.f3882a;
            String str = x3.f4254a;
            PackageInfo packageInfo = x3.f4034c;
            File d2 = H.d(F3.b, str, "components.bin");
            if (d2.exists()) {
                byte[] g02 = k.g0(d2);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(g02, 0, g02.length);
                obtain.setDataPosition(0);
                int readInt = obtain.readInt();
                int[] iArr = new int[readInt];
                int[] iArr2 = new int[readInt];
                obtain.readIntArray(iArr);
                obtain.readIntArray(iArr2);
                obtain.recycle();
                h hVar = (h) this.b;
                hVar.b = readInt;
                hVar.f2923c = iArr;
                hVar.f2924d = iArr2;
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (!serviceInfo.enabled && a(serviceInfo.name) == 1) {
                            serviceInfo.enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!activityInfo.enabled && a(activityInfo.name) == 1) {
                            activityInfo.enabled = true;
                        }
                    }
                }
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (!providerInfo.enabled && a(providerInfo.name) == 1) {
                            providerInfo.enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                if (activityInfoArr2 != null) {
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        if (!activityInfo2.enabled && a(activityInfo2.name) == 1) {
                            activityInfo2.enabled = true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void c(int i2, String str) {
        try {
            ComponentInfo componentInfo = (ComponentInfo) ((X3) this.f4181a).f.f4141a.a(str.hashCode());
            if (componentInfo != null) {
                boolean z2 = false;
                h hVar = (h) this.b;
                if (i2 == 0) {
                    int a2 = H.a(hVar.b, str.hashCode(), (int[]) hVar.f2923c);
                    if (a2 >= 0) {
                        int[] iArr = (int[]) hVar.f2923c;
                        int i3 = a2 + 1;
                        System.arraycopy(iArr, i3, iArr, a2, hVar.b - i3);
                        int[] iArr2 = (int[]) hVar.f2924d;
                        System.arraycopy(iArr2, i3, iArr2, a2, hVar.b - i3);
                        hVar.b--;
                    }
                    if (hVar.b == 0) {
                        hVar.b = 0;
                        int[] iArr3 = H.b;
                        hVar.f2923c = iArr3;
                        hVar.f2924d = iArr3;
                    }
                } else {
                    int hashCode = str.hashCode();
                    int[] iArr4 = (int[]) hVar.f2923c;
                    int i4 = hVar.b;
                    int a3 = H.a(i4, hashCode, iArr4);
                    if (a3 >= 0) {
                        ((int[]) hVar.f2924d)[a3] = i2;
                    } else {
                        int i5 = ~a3;
                        hVar.f2923c = H.s(iArr4, i4, i5, hashCode);
                        hVar.f2924d = H.s((int[]) hVar.f2924d, i4, i5, i2);
                        hVar.b = i4 + 1;
                    }
                }
                if (!(i2 == 2 || i2 == 3)) {
                    z2 = true;
                }
                componentInfo.enabled = z2;
            }
        } catch (Exception unused) {
        }
    }

    public void d() {
        h hVar = (h) this.b;
        try {
            int i2 = hVar.b;
            int[] copyOf = Arrays.copyOf((int[]) hVar.f2923c, i2);
            int[] copyOf2 = Arrays.copyOf((int[]) hVar.f2924d, i2);
            Parcel obtain = Parcel.obtain();
            obtain.writeInt(i2);
            obtain.writeIntArray(copyOf);
            obtain.writeIntArray(copyOf2);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            boolean z2 = F3.f3882a;
            k.h0(H.d(F3.b, ((X3) this.f4181a).f4254a, "components.bin"), marshall);
        } catch (Exception unused) {
        }
    }

    public C0418r2(E4 e4) {
        this.b = e4;
        this.f4181a = new H0(this);
    }
}

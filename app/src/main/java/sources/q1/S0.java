package q1;

import L0.e;
import T0.l;
import T0.r;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.storage.StorageVolume;
import java.io.File;
import java.util.List;

public final /* synthetic */ class S0 implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object[] f3983g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3984h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3985i;

    public /* synthetic */ S0(Object obj, Object obj2, Object[] objArr, int i2) {
        this.f = i2;
        this.f3984h = obj;
        this.f3985i = obj2;
        this.f3983g = objArr;
    }

    public final Object e(Object obj) {
        Intent intent;
        int i2;
        String str;
        int i3;
        switch (this.f) {
            case 0:
                C0345f0 f0Var = (C0345f0) obj;
                r e2 = ((T0) this.f3984h).e();
                Object obj2 = this.f3985i;
                String str2 = null;
                if (obj2 instanceof Intent) {
                    intent = (Intent) obj2;
                } else {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Object[] objArr = this.f3983g;
                Object obj3 = objArr[1];
                if (obj3 != null) {
                    str2 = obj3.toString();
                }
                Object obj4 = objArr[2];
                if (obj4 instanceof Number) {
                    i2 = ((Number) obj4).intValue();
                } else {
                    i2 = 0;
                }
                return (List) e2.b(f0Var, intent, str2, Integer.valueOf(i2));
            case 1:
                C0345f0 f0Var2 = (C0345f0) obj;
                r f2 = ((Y0) this.f3984h).f();
                Object[] objArr2 = this.f3983g;
                Object obj5 = objArr2[1];
                if (obj5 != null) {
                    str = obj5.toString();
                } else {
                    str = null;
                }
                Object obj6 = objArr2[2];
                if (obj6 instanceof Number) {
                    i3 = ((Number) obj6).intValue();
                } else {
                    i3 = 0;
                }
                return (ResolveInfo) f2.b(f0Var2, (Intent) this.f3985i, str, Integer.valueOf(i3));
            default:
                StorageVolume storageVolume = (StorageVolume) this.f3985i;
                StorageVolume[] storageVolumeArr = (StorageVolume[]) this.f3983g;
                String x02 = ((C0345f0) obj).x0(H.f3896n);
                if (x02 != null) {
                    File file = new File(x02);
                    file.mkdirs();
                    ((C0) this.f3984h).c(storageVolume, file);
                    Q3.f3975e = new W2(storageVolumeArr);
                }
                return e.f591c;
        }
    }
}

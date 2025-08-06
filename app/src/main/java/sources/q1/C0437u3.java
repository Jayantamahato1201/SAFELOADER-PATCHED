package q1;

import U0.k;
import android.content.IntentFilter;
import android.content.pm.PackageParser;
import java.util.ArrayList;

/* renamed from: q1.u3  reason: case insensitive filesystem */
public final class C0437u3 extends U0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0467z3 f4218g;

    public C0437u3(C0467z3 z3Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f4218g = z3Var;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            PackageParser.Service service = (PackageParser.Service) obj;
            if (!(service.info == null || (arrayList2 = service.intents) == null)) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    d((PackageParser.ServiceIntentInfo) obj2);
                }
            }
        }
    }

    public final Object a(IntentFilter intentFilter, int i2, int i3) {
        PackageParser.ServiceIntentInfo serviceIntentInfo = (PackageParser.ServiceIntentInfo) intentFilter;
        return C0467z3.a(this.f4218g, serviceIntentInfo.service.info, new K(2, C0414q3.f4179m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 9), serviceIntentInfo, i3, i2);
    }

    public final int h(IntentFilter intentFilter) {
        return ((PackageParser.ServiceIntentInfo) intentFilter).service.info.name.hashCode();
    }
}

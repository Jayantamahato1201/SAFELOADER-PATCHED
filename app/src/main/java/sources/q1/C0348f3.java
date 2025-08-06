package q1;

import U0.k;
import android.content.IntentFilter;
import android.content.pm.PackageParser;
import java.util.ArrayList;

/* renamed from: q1.f3  reason: case insensitive filesystem */
public final class C0348f3 extends U0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0467z3 f4094g;

    public C0348f3(C0467z3 z3Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f4094g = z3Var;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            PackageParser.Provider provider = (PackageParser.Provider) obj;
            if (!(provider.info == null || (arrayList2 = provider.intents) == null)) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    d((PackageParser.ProviderIntentInfo) obj2);
                }
            }
        }
    }

    public final Object a(IntentFilter intentFilter, int i2, int i3) {
        PackageParser.ProviderIntentInfo providerIntentInfo = (PackageParser.ProviderIntentInfo) intentFilter;
        return C0467z3.a(this.f4094g, providerIntentInfo.provider.info, new K(2, C0324b3.f4064m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 8), providerIntentInfo, i3, i2);
    }

    public final int h(IntentFilter intentFilter) {
        return ((PackageParser.ProviderIntentInfo) intentFilter).provider.info.name.hashCode();
    }
}

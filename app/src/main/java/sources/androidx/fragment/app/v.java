package androidx.fragment.app;

import N.g;
import android.util.Log;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.Map;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1395a;
    public final /* synthetic */ D b;

    public /* synthetic */ v(D d2, int i2) {
        this.f1395a = i2;
        this.b = d2;
    }

    public final void a(Object obj) {
        int i2;
        switch (this.f1395a) {
            case 0:
                a aVar = (a) obj;
                D d2 = this.b;
                A a2 = (A) d2.f1219w.pollFirst();
                if (a2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                g gVar = d2.f1200c;
                String str = a2.f;
                C0058o k2 = gVar.k(str);
                if (k2 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                k2.k(a2.f1191g, aVar.f, aVar.f875g);
                return;
            case 1:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((Boolean) arrayList.get(i3)).booleanValue()) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    iArr[i3] = i2;
                }
                D d3 = this.b;
                A a3 = (A) d3.f1219w.pollFirst();
                if (a3 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                g gVar2 = d3.f1200c;
                String str2 = a3.f;
                if (gVar2.k(str2) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                    return;
                }
                return;
            default:
                a aVar2 = (a) obj;
                D d4 = this.b;
                A a4 = (A) d4.f1219w.pollFirst();
                if (a4 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                g gVar3 = d4.f1200c;
                String str3 = a4.f;
                C0058o k3 = gVar3.k(str3);
                if (k3 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                    return;
                }
                k3.k(a4.f1191g, aVar2.f, aVar2.f875g);
                return;
        }
    }
}

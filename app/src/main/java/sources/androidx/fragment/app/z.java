package androidx.fragment.app;

import L0.b;
import M0.g;
import M0.n;
import M0.p;
import Q0.l;
import android.content.Intent;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class z extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f1402l;

    public /* synthetic */ z(int i2) {
        this.f1402l = i2;
    }

    public final Object P(int i2, Intent intent) {
        boolean z2;
        switch (this.f1402l) {
            case 0:
                return new a(i2, intent);
            case 1:
                n nVar = n.f;
                if (i2 != -1 || intent == null) {
                    return nVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return nVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(Boolean.valueOf(z2));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(g.A0(arrayList2), g.A0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new b(it.next(), it2.next()));
                }
                return p.B0(arrayList3);
            default:
                return new a(i2, intent);
        }
    }
}

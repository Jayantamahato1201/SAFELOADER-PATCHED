package androidx.activity;

import a.C0042b;
import android.os.Bundle;
import c0.C0106d;
import e.C0137h;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class f implements C0042b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0137h f843a;

    public /* synthetic */ f(C0137h hVar) {
        this.f843a = hVar;
    }

    public final void a() {
        C0137h hVar = this.f843a;
        Bundle c2 = ((C0106d) hVar.f855e.f866c).c("android:support:activity-result");
        if (c2 != null) {
            g gVar = hVar.f859j;
            gVar.getClass();
            ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                gVar.f846d = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = gVar.f848g;
                bundle2.putAll(bundle);
                for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                    String str = stringArrayList.get(i2);
                    HashMap hashMap = gVar.b;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = gVar.f844a;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i2);
                    num2.intValue();
                    String str2 = stringArrayList.get(i2);
                    hashMap2.put(num2, str2);
                    hashMap.put(str2, num2);
                }
            }
        }
    }
}

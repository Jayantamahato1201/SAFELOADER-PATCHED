package q1;

import U0.k;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import java.util.ArrayList;

public final class O2 extends U0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0467z3 f3951g;

    public O2(C0467z3 z3Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f3951g = z3Var;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            PackageParser.Activity activity = (PackageParser.Activity) obj;
            if (!(activity.info == null || (arrayList2 = activity.intents) == null)) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    d((PackageParser.ActivityIntentInfo) obj2);
                }
            }
        }
    }

    public final Object a(IntentFilter intentFilter, int i2, int i3) {
        PackageParser.ActivityIntentInfo activityIntentInfo = (PackageParser.ActivityIntentInfo) intentFilter;
        return C0467z3.a(this.f3951g, activityIntentInfo.activity.info, new K(2, H2.f3902m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 7), activityIntentInfo, i3, i2);
    }

    public final int h(IntentFilter intentFilter) {
        ActivityInfo activityInfo = ((PackageParser.ActivityIntentInfo) intentFilter).activity.info;
        String str = activityInfo.targetActivity;
        if (str == null) {
            str = activityInfo.name;
        }
        return str.hashCode();
    }
}

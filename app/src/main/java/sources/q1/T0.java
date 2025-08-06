package q1;

import T0.l;
import T0.r;
import U0.i;
import U0.k;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class T0 extends L3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        String str;
        int i2 = 0;
        try {
            Intent intent = objArr[0];
            List list = (List) C0382l1.f4134c.d(new S0(this, intent, objArr, 0));
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            l lVar = C0459y1.f4250a;
            List<ResolveInfo> b = C0459y1.b(method.invoke(obj, objArr));
            if (b == null) {
                b = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            if (!(intent instanceof Intent) || !i.a(intent.getScheme(), "fbconnect")) {
                if (b != null) {
                    arrayList.addAll(b);
                }
            } else if (b != null) {
                for (ResolveInfo resolveInfo : b) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        str = activityInfo.packageName;
                    } else {
                        str = null;
                    }
                    if (i.a(str, H.f3896n)) {
                        if (arrayList.size() <= 1) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
            }
            int size = arrayList.size();
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                C0444v4 v4Var = C0444v4.f4223a;
                C0444v4.b(((ComponentInfo) ((k) d()).i((ResolveInfo) obj2)).applicationInfo);
            }
            l lVar2 = C0459y1.f4250a;
            if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                return C0459y1.a(arrayList);
            }
            return arrayList;
        } catch (Exception unused) {
            l lVar3 = C0459y1.f4250a;
            if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                return M1.f3937a;
            }
            return Collections.EMPTY_LIST;
        }
    }

    public abstract l d();

    public abstract r e();
}

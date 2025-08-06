package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public final class C0059a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1425a = new HashMap();
    public final HashMap b;

    public C0059a(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0070l lVar = (C0070l) entry.getValue();
            List list = (List) this.f1425a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f1425a.put(lVar, list);
            }
            list.add((C0060b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, C0070l lVar, q qVar) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0060b bVar = (C0060b) list.get(size);
                bVar.getClass();
                try {
                    int i2 = bVar.f1426a;
                    Method method = bVar.b;
                    if (i2 == 0) {
                        method.invoke(qVar, (Object[]) null);
                    } else if (i2 == 1) {
                        method.invoke(qVar, new Object[]{rVar});
                    } else if (i2 == 2) {
                        method.invoke(qVar, new Object[]{rVar, lVar});
                    }
                    size--;
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
    }
}

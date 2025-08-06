package M0;

import A.i;
import L0.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class p extends i {
    public static int A0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map B0(ArrayList arrayList) {
        n nVar = n.f;
        int size = arrayList.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0(arrayList.size()));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                b bVar = (b) obj;
                linkedHashMap.put(bVar.f, bVar.f586g);
            }
            return linkedHashMap;
        }
        b bVar2 = (b) arrayList.get(0);
        U0.i.e("pair", bVar2);
        Map singletonMap = Collections.singletonMap(bVar2.f, bVar2.f586g);
        U0.i.d("singletonMap(pair.first, pair.second)", singletonMap);
        return singletonMap;
    }
}

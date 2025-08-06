package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {
    public c f;

    /* renamed from: g  reason: collision with root package name */
    public c f3658g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakHashMap f3659h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f3660i = 0;

    public c a(Object obj) {
        c cVar = this.f;
        while (cVar != null && !cVar.f.equals(obj)) {
            cVar = cVar.f3654h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f3660i--;
        WeakHashMap weakHashMap = this.f3659h;
        if (!weakHashMap.isEmpty()) {
            for (e a3 : weakHashMap.keySet()) {
                a3.a(a2);
            }
        }
        c cVar = a2.f3655i;
        if (cVar != null) {
            cVar.f3654h = a2.f3654h;
        } else {
            this.f = a2.f3654h;
        }
        c cVar2 = a2.f3654h;
        if (cVar2 != null) {
            cVar2.f3655i = cVar;
        } else {
            this.f3658g = cVar;
        }
        a2.f3654h = null;
        a2.f3655i = null;
        return a2.f3653g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((m.b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof m.f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            m.f r7 = (m.f) r7
            int r1 = r6.f3660i
            int r3 = r7.f3660i
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            m.b r3 = (m.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            m.b r4 = (m.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            m.b r7 = (m.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            return r0
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        b bVar = new b(this.f, this.f3658g, 0);
        this.f3659h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}

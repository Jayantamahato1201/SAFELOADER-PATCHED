package n;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: n.f  reason: case insensitive filesystem */
public class C0293f {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3689a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3690c;

    /* renamed from: d  reason: collision with root package name */
    public int f3691d;

    /* renamed from: e  reason: collision with root package name */
    public int f3692e;

    public C0293f(int i2) {
        if (i2 > 0) {
            this.f3690c = i2;
            this.f3689a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.f3689a.get(obj);
                    if (obj2 != null) {
                        this.f3691d++;
                        return obj2;
                    }
                    this.f3692e++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    this.b++;
                    put = this.f3689a.put(obj, obj2);
                    if (put != null) {
                        this.b--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            c(this.f3690c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.b     // Catch:{ all -> 0x0012 }
            if (r0 < 0) goto L_0x0047
            java.util.LinkedHashMap r0 = r2.f3689a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            int r0 = r2.b     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0047
            goto L_0x0014
        L_0x0012:
            r3 = move-exception
            goto L_0x0066
        L_0x0014:
            int r0 = r2.b     // Catch:{ all -> 0x0012 }
            if (r0 <= r3) goto L_0x0045
            java.util.LinkedHashMap r0 = r2.f3689a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0045
        L_0x0021:
            java.util.LinkedHashMap r0 = r2.f3689a     // Catch:{ all -> 0x0012 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0012 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0012 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0012 }
            r0.getValue()     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r0 = r2.f3689a     // Catch:{ all -> 0x0012 }
            r0.remove(r1)     // Catch:{ all -> 0x0012 }
            int r0 = r2.b     // Catch:{ all -> 0x0012 }
            int r0 = r0 + -1
            r2.b = r0     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            goto L_0x0000
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0047:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0012 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r0.<init>()     // Catch:{ all -> 0x0012 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0012 }
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0012 }
            r3.<init>(r0)     // Catch:{ all -> 0x0012 }
            throw r3     // Catch:{ all -> 0x0012 }
        L_0x0066:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0293f.c(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            i2 = this.f3691d;
            i3 = this.f3692e;
            int i6 = i2 + i3;
            if (i6 != 0) {
                i4 = (i2 * 100) / i6;
            } else {
                i4 = 0;
            }
            Locale locale = Locale.US;
            i5 = this.f3690c;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return "LruCache[maxSize=" + i5 + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}

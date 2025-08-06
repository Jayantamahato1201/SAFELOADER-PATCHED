package androidx.lifecycle;

import A.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1421a = new LinkedHashMap();

    public final void a() {
        for (I i2 : this.f1421a.values()) {
            HashMap hashMap = i2.f1419a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object next : i2.f1419a.values()) {
                            if (next instanceof Closeable) {
                                ((Closeable) next).close();
                            }
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = i2.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : i2.b) {
                            if (g.k(closeable)) {
                                closeable.close();
                            }
                        }
                    } catch (IOException e3) {
                        throw new RuntimeException(e3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i2.a();
        }
        this.f1421a.clear();
    }
}

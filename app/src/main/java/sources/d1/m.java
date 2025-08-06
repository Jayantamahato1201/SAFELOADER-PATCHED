package d1;

import A.j;
import H0.E;
import e1.b;
import e1.c;
import g1.e;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.g;

public final class m {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f2332g;

    /* renamed from: a  reason: collision with root package name */
    public final int f2333a = 5;
    public final long b;

    /* renamed from: c  reason: collision with root package name */
    public final E f2334c = new E(11, this);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f2335d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final j f2336e = new j(25);
    public boolean f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.f2613a;
        f2332g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new b("OkHttp ConnectionPool", true));
    }

    public m() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.b = timeUnit.toNanos(5);
    }

    public final long a(long j2) {
        synchronized (this) {
            try {
                Iterator it = this.f2335d.iterator();
                g1.b bVar = null;
                long j3 = Long.MIN_VALUE;
                int i2 = 0;
                int i3 = 0;
                while (it.hasNext()) {
                    g1.b bVar2 = (g1.b) it.next();
                    if (b(bVar2, j2) > 0) {
                        i3++;
                    } else {
                        i2++;
                        long j4 = j2 - bVar2.f2879o;
                        if (j4 > j3) {
                            bVar = bVar2;
                            j3 = j4;
                        }
                    }
                }
                long j5 = this.b;
                if (j3 < j5) {
                    if (i2 <= this.f2333a) {
                        if (i2 > 0) {
                            long j6 = j5 - j3;
                            return j6;
                        } else if (i3 > 0) {
                            return j5;
                        } else {
                            this.f = false;
                            return -1;
                        }
                    }
                }
                this.f2335d.remove(bVar);
                c.e(bVar.f2870e);
                return 0;
            } finally {
                while (true) {
                }
            }
        }
    }

    public final int b(g1.b bVar, long j2) {
        ArrayList arrayList = bVar.f2878n;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                g.f3649a.l("A connection to " + bVar.f2868c.f2264a.f2272a + " was leaked. Did you forget to close a response body?", ((e) reference).f2886a);
                arrayList.remove(i2);
                bVar.f2875k = true;
                if (arrayList.isEmpty()) {
                    bVar.f2879o = j2 - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}

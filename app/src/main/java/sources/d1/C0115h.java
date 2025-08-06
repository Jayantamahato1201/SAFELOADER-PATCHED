package d1;

import A.j;
import e1.b;
import e1.c;
import f1.g;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o1.e;
import o1.q;

/* renamed from: d1.h  reason: case insensitive filesystem */
public final class C0115h implements Closeable, Flushable, AutoCloseable {
    public final j f = new j(22, (Object) this);

    /* renamed from: g  reason: collision with root package name */
    public final g f2303g;

    public C0115h(File file, long j2) {
        Pattern pattern = g.f2713z;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            byte[] bArr = c.f2613a;
            this.f2303g = new g(file, j2, new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new b("OkHttp DiskLruCache", true)));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static int k(q qVar) {
        e eVar;
        byte n2;
        try {
            qVar.u(1);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                boolean t2 = qVar.t((long) i3);
                eVar = qVar.f;
                if (!t2) {
                    break;
                }
                n2 = eVar.n((long) i2);
                if (n2 < 48 || n2 > 57) {
                    if (i2 != 0) {
                        break;
                    } else if (n2 != 45) {
                        break;
                    }
                }
                i2 = i3;
            }
            if (i2 != 0) {
                long r2 = eVar.r();
                String s2 = qVar.s(Long.MAX_VALUE);
                if (r2 >= 0 && r2 <= 2147483647L && s2.isEmpty()) {
                    return (int) r2;
                }
                throw new IOException("expected an int but was \"" + r2 + s2 + "\"");
            }
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(n2)}));
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final void close() {
        this.f2303g.close();
    }

    public final void flush() {
        this.f2303g.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(d1.C r6) {
        /*
            r5 = this;
            f1.g r0 = r5.f2303g
            d1.t r6 = r6.f2231a
            java.lang.String r6 = r6.f2371h
            o1.h r6 = o1.h.f(r6)
            java.lang.String r1 = "MD5"
            o1.h r6 = r6.e(r1)
            java.lang.String r6 = r6.h()
            monitor-enter(r0)
            r0.o()     // Catch:{ all -> 0x0039 }
            r0.k()     // Catch:{ all -> 0x0039 }
            f1.g.y(r6)     // Catch:{ all -> 0x0039 }
            java.util.LinkedHashMap r1 = r0.f2723p     // Catch:{ all -> 0x0039 }
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x0039 }
            f1.e r6 = (f1.e) r6     // Catch:{ all -> 0x0039 }
            if (r6 != 0) goto L_0x002a
            monitor-exit(r0)
            return
        L_0x002a:
            r0.w(r6)     // Catch:{ all -> 0x0039 }
            long r1 = r0.f2721n     // Catch:{ all -> 0x0039 }
            long r3 = r0.f2719l     // Catch:{ all -> 0x0039 }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x003b
            r6 = 0
            r0.f2728u = r6     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r6 = move-exception
            goto L_0x003d
        L_0x003b:
            monitor-exit(r0)
            return
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0115h.l(d1.C):void");
    }
}

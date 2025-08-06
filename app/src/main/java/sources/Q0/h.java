package Q0;

import F.c;
import M0.q;
import V0.a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h implements Iterator, a {
    public q f = q.f596g;

    /* renamed from: g  reason: collision with root package name */
    public File f655g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f656h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c f657i;

    public h(c cVar) {
        this.f657i = cVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f656h = arrayDeque;
        boolean isDirectory = ((File) cVar.b).isDirectory();
        File file = (File) cVar.b;
        if (isDirectory) {
            arrayDeque.push(a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new i(file));
        } else {
            this.f = q.f597h;
        }
    }

    public final d a(File file) {
        int ordinal = ((j) this.f657i.f194c).ordinal();
        if (ordinal == 0) {
            return new g(this, file);
        }
        if (ordinal == 1) {
            return new e(this, file);
        }
        throw new RuntimeException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r0 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r4 = this;
            M0.q r0 = r4.f
            M0.q r1 = M0.q.f598i
            if (r0 == r1) goto L_0x0063
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0061
            r2 = 2
            if (r0 == r2) goto L_0x005f
            r4.f = r1
        L_0x0011:
            java.util.ArrayDeque r0 = r4.f656h
            java.lang.Object r1 = r0.peek()
            Q0.i r1 = (Q0.i) r1
            if (r1 != 0) goto L_0x001d
            r0 = 0
            goto L_0x004d
        L_0x001d:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L_0x0027
            r0.pop()
            goto L_0x0011
        L_0x0027:
            java.io.File r1 = r1.f658a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x004c
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L_0x004c
            int r1 = r0.size()
            F.c r3 = r4.f657i
            r3.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L_0x0044
            goto L_0x004c
        L_0x0044:
            Q0.d r1 = r4.a(r2)
            r0.push(r1)
            goto L_0x0011
        L_0x004c:
            r0 = r2
        L_0x004d:
            M0.q r1 = M0.q.f
            if (r0 == 0) goto L_0x0056
            r4.f655g = r0
            r4.f = r1
            goto L_0x005a
        L_0x0056:
            M0.q r0 = M0.q.f597h
            r4.f = r0
        L_0x005a:
            M0.q r0 = r4.f
            if (r0 != r1) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r0 = 0
            return r0
        L_0x0061:
            r0 = 1
            return r0
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.h.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.f = q.f596g;
            return this.f655g;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

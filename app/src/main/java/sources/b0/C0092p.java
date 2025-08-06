package b0;

import E.l;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: b0.p  reason: case insensitive filesystem */
public final class C0092p implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f1753j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final C0089m f1754k = new C0089m(0);
    public ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public long f1755g;

    /* renamed from: h  reason: collision with root package name */
    public long f1756h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f1757i;

    public static Y c(RecyclerView recyclerView, int i2, long j2) {
        int x2 = recyclerView.f1512e.x();
        for (int i3 = 0; i3 < x2; i3++) {
            Y I2 = RecyclerView.I(recyclerView.f1512e.w(i3));
            if (I2.f1629c == i2 && !I2.f()) {
                return null;
            }
        }
        P p2 = recyclerView.b;
        try {
            recyclerView.P();
            Y i4 = p2.i(i2, j2);
            if (i4 != null) {
                if (!i4.e() || i4.f()) {
                    p2.a(i4, false);
                } else {
                    p2.f(i4.f1628a);
                }
            }
            return i4;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1531p && this.f1755g == 0) {
            this.f1755g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0090n nVar = recyclerView.f1507b0;
        nVar.f1746a = i2;
        nVar.b = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: b0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: b0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: b0.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r3 = (b0.C0091o) r5.get(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.util.ArrayList r2 = r1.f
            int r3 = r2.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000c:
            if (r5 >= r3) goto L_0x0024
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 != 0) goto L_0x0022
            b0.n r8 = r7.f1507b0
            r8.b(r7, r4)
            int r7 = r8.f1748d
            int r6 = r6 + r7
        L_0x0022:
            int r5 = r5 + r0
            goto L_0x000c
        L_0x0024:
            java.util.ArrayList r5 = r1.f1757i
            r5.ensureCapacity(r6)
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r6 >= r3) goto L_0x0082
            java.lang.Object r8 = r2.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L_0x003a
            goto L_0x0080
        L_0x003a:
            b0.n r9 = r8.f1507b0
            int r10 = r9.f1746a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = 0
        L_0x004a:
            int r12 = r9.f1748d
            int r12 = r12 * 2
            if (r10 >= r12) goto L_0x0080
            int r12 = r5.size()
            if (r7 < r12) goto L_0x005f
            b0.o r12 = new b0.o
            r12.<init>()
            r5.add(r12)
            goto L_0x0065
        L_0x005f:
            java.lang.Object r12 = r5.get(r7)
            b0.o r12 = (b0.C0091o) r12
        L_0x0065:
            int[] r13 = r9.f1747c
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L_0x006f
            r15 = 1
            goto L_0x0070
        L_0x006f:
            r15 = 0
        L_0x0070:
            r12.f1749a = r15
            r12.b = r11
            r12.f1750c = r14
            r12.f1751d = r8
            r13 = r13[r10]
            r12.f1752e = r13
            int r7 = r7 + r0
            int r10 = r10 + 2
            goto L_0x004a
        L_0x0080:
            int r6 = r6 + r0
            goto L_0x002b
        L_0x0082:
            b0.m r2 = f1754k
            java.util.Collections.sort(r5, r2)
            r2 = 0
        L_0x0088:
            int r3 = r5.size()
            if (r2 >= r3) goto L_0x0145
            java.lang.Object r3 = r5.get(r2)
            b0.o r3 = (b0.C0091o) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.f1751d
            if (r6 != 0) goto L_0x009a
            goto L_0x0145
        L_0x009a:
            boolean r7 = r3.f1749a
            if (r7 == 0) goto L_0x00a4
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00a6
        L_0x00a4:
            r7 = r17
        L_0x00a6:
            int r9 = r3.f1752e
            b0.Y r6 = c(r6, r9, r7)
            if (r6 == 0) goto L_0x00c8
            java.lang.ref.WeakReference r7 = r6.b
            if (r7 == 0) goto L_0x00c8
            boolean r7 = r6.e()
            if (r7 == 0) goto L_0x00c8
            boolean r7 = r6.f()
            if (r7 != 0) goto L_0x00c8
            java.lang.ref.WeakReference r6 = r6.b
            java.lang.Object r6 = r6.get()
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 != 0) goto L_0x00cb
        L_0x00c8:
            r10 = r17
            goto L_0x0137
        L_0x00cb:
            boolean r7 = r6.f1543y
            if (r7 == 0) goto L_0x00f4
            N.g r7 = r6.f1512e
            int r7 = r7.x()
            if (r7 == 0) goto L_0x00f4
            b0.F r7 = r6.f1489H
            if (r7 == 0) goto L_0x00de
            r7.e()
        L_0x00de:
            b0.J r7 = r6.f1524l
            b0.P r8 = r6.b
            if (r7 == 0) goto L_0x00ec
            r7.g0(r8)
            b0.J r7 = r6.f1524l
            r7.h0(r8)
        L_0x00ec:
            java.util.ArrayList r7 = r8.f1597a
            r7.clear()
            r8.d()
        L_0x00f4:
            b0.n r7 = r6.f1507b0
            r7.b(r6, r0)
            int r8 = r7.f1748d
            if (r8 == 0) goto L_0x00c8
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = E.l.f93a     // Catch:{ all -> 0x0129 }
            android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x0129 }
            b0.V r8 = r6.f1509c0     // Catch:{ all -> 0x0129 }
            b0.B r9 = r6.f1522k     // Catch:{ all -> 0x0129 }
            r8.f1611d = r0     // Catch:{ all -> 0x0129 }
            int r9 = r9.a()     // Catch:{ all -> 0x0129 }
            r8.f1612e = r9     // Catch:{ all -> 0x0129 }
            r8.f1613g = r4     // Catch:{ all -> 0x0129 }
            r8.f1614h = r4     // Catch:{ all -> 0x0129 }
            r8.f1615i = r4     // Catch:{ all -> 0x0129 }
            r8 = 0
        L_0x0117:
            int r9 = r7.f1748d     // Catch:{ all -> 0x0129 }
            int r9 = r9 * 2
            if (r8 >= r9) goto L_0x012b
            int[] r9 = r7.f1747c     // Catch:{ all -> 0x0129 }
            r9 = r9[r8]     // Catch:{ all -> 0x0129 }
            r10 = r17
            c(r6, r9, r10)     // Catch:{ all -> 0x0129 }
            int r8 = r8 + 2
            goto L_0x0117
        L_0x0129:
            r0 = move-exception
            goto L_0x0131
        L_0x012b:
            r10 = r17
            android.os.Trace.endSection()
            goto L_0x0137
        L_0x0131:
            int r2 = E.l.f93a
            android.os.Trace.endSection()
            throw r0
        L_0x0137:
            r3.f1749a = r4
            r3.b = r4
            r3.f1750c = r4
            r6 = 0
            r3.f1751d = r6
            r3.f1752e = r4
            int r2 = r2 + r0
            goto L_0x0088
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0092p.b(long):void");
    }

    public final void run() {
        try {
            int i2 = l.f93a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                this.f1755g = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f1755g = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1756h);
            this.f1755g = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1755g = 0;
            int i4 = l.f93a;
            Trace.endSection();
            throw th;
        }
    }
}

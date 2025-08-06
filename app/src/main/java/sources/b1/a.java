package b1;

import U0.i;
import Y0.c;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator, V0.a {
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f1805g;

    /* renamed from: h  reason: collision with root package name */
    public int f1806h;

    /* renamed from: i  reason: collision with root package name */
    public c f1807i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ F.c f1808j;

    public a(F.c cVar) {
        this.f1808j = cVar;
        cVar.getClass();
        int length = ((String) cVar.b).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f1805g = length;
            this.f1806h = length;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [Y0.a] */
    /* JADX WARNING: type inference failed for: r0v8, types: [Y0.a, Y0.c] */
    /* JADX WARNING: type inference failed for: r0v9, types: [Y0.a, Y0.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f1806h
            r1 = 0
            if (r0 >= 0) goto L_0x000b
            r7.f = r1
            r0 = 0
            r7.f1807i = r0
            return
        L_0x000b:
            F.c r2 = r7.f1808j
            r2.getClass()
            java.lang.Object r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            r5 = 1
            r6 = -1
            if (r0 <= r4) goto L_0x002d
            Y0.c r0 = new Y0.c
            int r1 = r7.f1805g
            int r2 = r3.length()
            int r2 = r2 - r5
            r0.<init>(r1, r2, r5)
            r7.f1807i = r0
            r7.f1806h = r6
            goto L_0x007c
        L_0x002d:
            java.lang.Object r0 = r2.f194c
            b1.h r0 = (b1.h) r0
            int r2 = r7.f1806h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.d(r3, r2)
            L0.b r0 = (L0.b) r0
            if (r0 != 0) goto L_0x0050
            Y0.c r0 = new Y0.c
            int r1 = r7.f1805g
            int r2 = r3.length()
            int r2 = r2 - r5
            r0.<init>(r1, r2, r5)
            r7.f1807i = r0
            r7.f1806h = r6
            goto L_0x007c
        L_0x0050:
            java.lang.Object r2 = r0.f
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f586g
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f1805g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r4) goto L_0x0069
            Y0.c r3 = Y0.c.f789i
            goto L_0x0071
        L_0x0069:
            Y0.c r4 = new Y0.c
            int r6 = r2 + -1
            r4.<init>(r3, r6, r5)
            r3 = r4
        L_0x0071:
            r7.f1807i = r3
            int r2 = r2 + r0
            r7.f1805g = r2
            if (r0 != 0) goto L_0x0079
            r1 = 1
        L_0x0079:
            int r2 = r2 + r1
            r7.f1806h = r2
        L_0x007c:
            r7.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.a.a():void");
    }

    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f != 0) {
            c cVar = this.f1807i;
            i.c("null cannot be cast to non-null type kotlin.ranges.IntRange", cVar);
            this.f1807i = null;
            this.f = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

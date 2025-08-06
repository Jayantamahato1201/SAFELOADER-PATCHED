package i1;

import d1.t;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class c extends a {

    /* renamed from: j  reason: collision with root package name */
    public final t f3016j;

    /* renamed from: k  reason: collision with root package name */
    public long f3017k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3018l = true;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ g f3019m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(g gVar, t tVar) {
        super(gVar);
        this.f3019m = gVar;
        this.f3016j = tVar;
    }

    public final void close() {
        boolean z2;
        if (!this.f3011g) {
            if (this.f3018l) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                try {
                    z2 = e1.c.q(this, 100);
                } catch (IOException unused) {
                    z2 = false;
                }
                if (!z2) {
                    k(false, (IOException) null);
                }
            }
            this.f3011g = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r13 == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", new java.lang.Object[]{java.lang.Byte.valueOf(r6)}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(o1.e r18, long r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 0
            r4 = 1
            boolean r5 = r1.f3011g
            if (r5 != 0) goto L_0x013c
            boolean r5 = r1.f3018l
            r6 = -1
            if (r5 != 0) goto L_0x0017
            r19 = r6
            goto L_0x00f2
        L_0x0017:
            long r8 = r1.f3017k
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0028
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            r19 = r6
            goto L_0x00f3
        L_0x0028:
            java.lang.String r5 = "expected chunk size and optional extensions but was \""
            i1.g r12 = r1.f3019m
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x0035
            o1.q r8 = r12.f3026c
            r8.s(r2)
        L_0x0035:
            o1.q r8 = r12.f3026c     // Catch:{ NumberFormatException -> 0x00ab }
            o1.q r9 = r12.f3026c
            r13 = 1
            r8.u(r13)     // Catch:{ NumberFormatException -> 0x00ab }
            r13 = 0
        L_0x003f:
            int r14 = r13 + 1
            r19 = r6
            long r6 = (long) r14     // Catch:{ NumberFormatException -> 0x00ab }
            boolean r6 = r8.t(r6)     // Catch:{ NumberFormatException -> 0x00ab }
            o1.e r7 = r8.f     // Catch:{ NumberFormatException -> 0x00ab }
            if (r6 == 0) goto L_0x0087
            r15 = r10
            long r10 = (long) r13     // Catch:{ NumberFormatException -> 0x00ab }
            byte r6 = r7.n(r10)     // Catch:{ NumberFormatException -> 0x00ab }
            r10 = 48
            if (r6 < r10) goto L_0x005a
            r10 = 57
            if (r6 <= r10) goto L_0x006b
        L_0x005a:
            r10 = 97
            if (r6 < r10) goto L_0x0062
            r10 = 102(0x66, float:1.43E-43)
            if (r6 <= r10) goto L_0x006b
        L_0x0062:
            r10 = 65
            if (r6 < r10) goto L_0x0070
            r10 = 70
            if (r6 <= r10) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r6 = r19
            r13 = r14
            r10 = r15
            goto L_0x003f
        L_0x0070:
            if (r13 == 0) goto L_0x0073
            goto L_0x0088
        L_0x0073:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.Byte r3 = java.lang.Byte.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ NumberFormatException -> 0x00ab }
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r4)     // Catch:{ NumberFormatException -> 0x00ab }
            r2.<init>(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            throw r2     // Catch:{ NumberFormatException -> 0x00ab }
        L_0x0087:
            r15 = r10
        L_0x0088:
            long r6 = r7.s()     // Catch:{ NumberFormatException -> 0x00ab }
            r1.f3017k = r6     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r2 = r9.s(r2)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r2 = r2.trim()     // Catch:{ NumberFormatException -> 0x00ab }
            long r6 = r1.f3017k     // Catch:{ NumberFormatException -> 0x00ab }
            int r3 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r3 < 0) goto L_0x0116
            boolean r3 = r2.isEmpty()     // Catch:{ NumberFormatException -> 0x00ab }
            if (r3 != 0) goto L_0x00ae
            java.lang.String r3 = ";"
            boolean r3 = r2.startsWith(r3)     // Catch:{ NumberFormatException -> 0x00ab }
            if (r3 == 0) goto L_0x0116
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            goto L_0x0132
        L_0x00ae:
            long r2 = r1.f3017k
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x00ee
            r1.f3018l = r0
            d1.z r2 = r12.f3025a
            d1.b r2 = r2.f2414m
            A.j r3 = new A.j
            r5 = 23
            r3.<init>((int) r5)
        L_0x00c1:
            long r5 = r12.f
            java.lang.String r5 = r9.s(r5)
            long r6 = r12.f
            int r8 = r5.length()
            long r10 = (long) r8
            long r6 = r6 - r10
            r12.f = r6
            int r6 = r5.length()
            if (r6 == 0) goto L_0x00e0
            d1.b r6 = d1.C0109b.f2283e
            r6.getClass()
            r3.s(r5)
            goto L_0x00c1
        L_0x00e0:
            d1.r r5 = new d1.r
            r5.<init>((A.j) r3)
            d1.t r3 = r1.f3016j
            h1.e.d(r2, r3, r5)
            r2 = 0
            r1.k(r4, r2)
        L_0x00ee:
            boolean r2 = r1.f3018l
            if (r2 != 0) goto L_0x00f3
        L_0x00f2:
            return r19
        L_0x00f3:
            long r2 = r1.f3017k
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            r4 = r18
            long r2 = super.f(r4, r2)
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x010b
            long r4 = r1.f3017k
            long r4 = r4 - r2
            r1.f3017k = r4
            return r2
        L_0x010b:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r3 = "unexpected end of stream"
            r2.<init>(r3)
            r1.k(r0, r2)
            throw r2
        L_0x0116:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00ab }
            r3.<init>(r5)     // Catch:{ NumberFormatException -> 0x00ab }
            long r4 = r1.f3017k     // Catch:{ NumberFormatException -> 0x00ab }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x00ab }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r2 = r3.toString()     // Catch:{ NumberFormatException -> 0x00ab }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x00ab }
            throw r0     // Catch:{ NumberFormatException -> 0x00ab }
        L_0x0132:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r0)
            throw r2
        L_0x013c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.f(o1.e, long):long");
    }
}

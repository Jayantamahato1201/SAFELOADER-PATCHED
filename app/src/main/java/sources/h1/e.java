package h1;

import d1.G;
import d1.r;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2910a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(G g2) {
        String a2 = g2.f2254k.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(G g2) {
        if (g2.f.b.equals("HEAD")) {
            return false;
        }
        int i2 = g2.f2251h;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(g2) == -1 && !"chunked".equalsIgnoreCase(g2.l("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(int i2, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f5, code lost:
        if (e1.c.f2617g.matcher(r0).matches() == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0226, code lost:
        if (r12 != false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0228, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023b, code lost:
        if (r12 == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0339, code lost:
        if (r0 != null) goto L_0x034b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(d1.C0109b r36, d1.t r37, d1.r r38) {
        /*
            r1 = r37
            d1.b r0 = d1.C0109b.b
            r3 = r36
            if (r3 != r0) goto L_0x000a
            goto L_0x03c1
        L_0x000a:
            java.util.regex.Pattern r0 = d1.p.f2344j
            java.lang.String r0 = "Set-Cookie"
            r4 = r38
            java.util.List r4 = r4.f(r0)
            int r5 = r4.size()
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x001b:
            if (r8 >= r5) goto L_0x03b2
            java.lang.Object r0 = r4.get(r8)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            long r11 = java.lang.System.currentTimeMillis()
            int r13 = r10.length()
            r14 = 59
            int r0 = e1.c.h(r10, r6, r13, r14)
            r15 = 61
            int r7 = e1.c.h(r10, r6, r0, r15)
            if (r7 != r0) goto L_0x003d
        L_0x003a:
            r12 = 0
            goto L_0x039a
        L_0x003d:
            r16 = 1
            int r2 = e1.c.r(r10, r6, r7)
            int r6 = e1.c.s(r10, r2, r7)
            java.lang.String r2 = r10.substring(r2, r6)
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x003a
            int r6 = r2.length()
            r15 = 0
        L_0x0056:
            if (r15 >= r6) goto L_0x006e
            char r14 = r2.charAt(r15)
            r22 = r2
            r2 = 31
            if (r14 <= r2) goto L_0x006c
            r2 = 127(0x7f, float:1.78E-43)
            if (r14 < r2) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            int r15 = r15 + 1
            r2 = r22
            goto L_0x0056
        L_0x006c:
            r2 = -1
            goto L_0x0072
        L_0x006e:
            r22 = r2
            r15 = -1
            goto L_0x006c
        L_0x0072:
            if (r15 == r2) goto L_0x0075
            goto L_0x003a
        L_0x0075:
            int r7 = r7 + 1
            int r2 = e1.c.r(r10, r7, r0)
            int r6 = e1.c.s(r10, r2, r0)
            java.lang.String r2 = r10.substring(r2, r6)
            int r6 = r2.length()
            r7 = 0
        L_0x0088:
            if (r7 >= r6) goto L_0x009c
            char r14 = r2.charAt(r7)
            r15 = 31
            if (r14 <= r15) goto L_0x009a
            r15 = 127(0x7f, float:1.78E-43)
            if (r14 < r15) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r7 = r7 + 1
            goto L_0x0088
        L_0x009a:
            r6 = -1
            goto L_0x009e
        L_0x009c:
            r7 = -1
            goto L_0x009a
        L_0x009e:
            if (r7 == r6) goto L_0x00a1
            goto L_0x003a
        L_0x00a1:
            int r0 = r0 + 1
            r6 = 0
            r7 = 0
            r19 = -1
            r21 = 0
            r23 = -1
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x00b6:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r13) goto L_0x0191
            r14 = 59
            r34 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r15 = e1.c.h(r10, r0, r13, r14)
            r17 = r2
            r14 = 61
            int r2 = e1.c.h(r10, r0, r15, r14)
            int r0 = e1.c.r(r10, r0, r2)
            int r14 = e1.c.s(r10, r0, r2)
            java.lang.String r0 = r10.substring(r0, r14)
            if (r2 >= r15) goto L_0x00ef
            int r2 = r2 + 1
            int r2 = e1.c.r(r10, r2, r15)
            int r14 = e1.c.s(r10, r2, r15)
            java.lang.String r2 = r10.substring(r2, r14)
            goto L_0x00f1
        L_0x00ef:
            java.lang.String r2 = ""
        L_0x00f1:
            java.lang.String r14 = "expires"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0105
            int r0 = r2.length()     // Catch:{ IllegalArgumentException -> 0x016d }
            long r28 = d1.p.b(r0, r2)     // Catch:{ IllegalArgumentException -> 0x016d }
        L_0x0101:
            r27 = 1
            goto L_0x0189
        L_0x0105:
            java.lang.String r14 = "max-age"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0131
            long r19 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x011a }
            r30 = 0
            int r0 = (r19 > r30 ? 1 : (r19 == r30 ? 0 : -1))
            if (r0 > 0) goto L_0x0101
            r19 = r32
            goto L_0x0101
        L_0x011a:
            r0 = move-exception
            java.lang.String r14 = "-?\\d+"
            boolean r14 = r2.matches(r14)     // Catch:{  }
            if (r14 == 0) goto L_0x0130
            java.lang.String r0 = "-"
            boolean r0 = r2.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x012d
            r30 = r32
        L_0x012d:
            r19 = r30
            goto L_0x0101
        L_0x0130:
            throw r0     // Catch:{  }
        L_0x0131:
            java.lang.String r14 = "domain"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0164
            java.lang.String r0 = "."
            boolean r14 = r2.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x016d }
            if (r14 != 0) goto L_0x015e
            boolean r0 = r2.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x016d }
            if (r0 == 0) goto L_0x014c
            r14 = 1
            java.lang.String r2 = r2.substring(r14)     // Catch:{ IllegalArgumentException -> 0x016d }
        L_0x014c:
            java.lang.String r0 = e1.c.b(r2)     // Catch:{ IllegalArgumentException -> 0x016d }
            if (r0 == 0) goto L_0x0158
            r6 = r0
            r16 = 1
            r26 = 0
            goto L_0x0189
        L_0x0158:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x016d }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x016d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x016d }
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x016d }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x016d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x016d }
        L_0x0164:
            java.lang.String r14 = "path"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0170
            r7 = r2
        L_0x016d:
            r16 = 1
            goto L_0x0189
        L_0x0170:
            java.lang.String r2 = "secure"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x017d
            r16 = 1
            r21 = 1
            goto L_0x0189
        L_0x017d:
            java.lang.String r2 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x016d
            r16 = 1
            r25 = 1
        L_0x0189:
            int r0 = r15 + 1
            r2 = r17
            r16 = 1
            goto L_0x00b6
        L_0x0191:
            r17 = r2
            r34 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r0 = (r19 > r32 ? 1 : (r19 == r32 ? 0 : -1))
            if (r0 != 0) goto L_0x019f
            r14 = r32
            goto L_0x01c3
        L_0x019f:
            int r0 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x01c1
            r13 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x01b0
            r13 = 1000(0x3e8, double:4.94E-321)
            long r30 = r19 * r13
        L_0x01b0:
            long r30 = r11 + r30
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01be
            int r0 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bb
            goto L_0x01be
        L_0x01bb:
            r14 = r30
            goto L_0x01c3
        L_0x01be:
            r14 = r34
            goto L_0x01c3
        L_0x01c1:
            r14 = r28
        L_0x01c3:
            java.lang.String r0 = r1.f2368d
            r2 = 46
            if (r6 != 0) goto L_0x01cb
            r6 = r0
            goto L_0x01f7
        L_0x01cb:
            boolean r10 = r0.equals(r6)
            if (r10 == 0) goto L_0x01d2
            goto L_0x01f7
        L_0x01d2:
            boolean r10 = r0.endsWith(r6)
            if (r10 == 0) goto L_0x033b
            int r10 = r0.length()
            int r11 = r6.length()
            int r10 = r10 - r11
            r16 = 1
            int r10 = r10 + -1
            char r10 = r0.charAt(r10)
            if (r10 != r2) goto L_0x033b
            java.util.regex.Pattern r10 = e1.c.f2617g
            java.util.regex.Matcher r10 = r10.matcher(r0)
            boolean r10 = r10.matches()
            if (r10 != 0) goto L_0x033b
        L_0x01f7:
            int r0 = r0.length()
            int r10 = r6.length()
            if (r0 == r10) goto L_0x034b
            m1.a r10 = m1.a.f3666h
            r10.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r6)
            java.lang.String r11 = "\\."
            java.lang.String[] r11 = r0.split(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f3667a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x024c
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f3667a
            r12 = 0
            r13 = 1
            boolean r0 = r0.compareAndSet(r12, r13)
            if (r0 == 0) goto L_0x024c
            r12 = 0
        L_0x0223:
            r10.b()     // Catch:{ InterruptedIOException -> 0x0248, IOException -> 0x0232 }
            if (r12 == 0) goto L_0x0251
        L_0x0228:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0251
        L_0x0230:
            r0 = move-exception
            goto L_0x023e
        L_0x0232:
            r0 = move-exception
            l1.g r13 = l1.g.f3649a     // Catch:{ all -> 0x0230 }
            java.lang.String r2 = "Failed to read public suffix list"
            r3 = 5
            r13.k(r3, r2, r0)     // Catch:{ all -> 0x0230 }
            if (r12 == 0) goto L_0x0251
            goto L_0x0228
        L_0x023e:
            if (r12 == 0) goto L_0x0247
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0247:
            throw r0
        L_0x0248:
            r12 = 1
            r3 = r36
            goto L_0x0223
        L_0x024c:
            java.util.concurrent.CountDownLatch r0 = r10.b     // Catch:{ InterruptedException -> 0x0251 }
            r0.await()     // Catch:{ InterruptedException -> 0x0251 }
        L_0x0251:
            monitor-enter(r10)
            byte[] r0 = r10.f3668c     // Catch:{ all -> 0x033f }
            if (r0 == 0) goto L_0x0341
            monitor-exit(r10)     // Catch:{ all -> 0x033f }
            int r0 = r11.length
            byte[][] r2 = new byte[r0][]
            r3 = 0
        L_0x025b:
            int r12 = r11.length
            if (r3 >= r12) goto L_0x026b
            r12 = r11[r3]
            java.nio.charset.Charset r13 = e1.c.f2615d
            byte[] r12 = r12.getBytes(r13)
            r2[r3] = r12
            r13 = 1
            int r3 = r3 + r13
            goto L_0x025b
        L_0x026b:
            r13 = 1
            r3 = 0
        L_0x026d:
            if (r3 >= r0) goto L_0x027a
            byte[] r12 = r10.f3668c
            java.lang.String r12 = m1.a.a(r12, r2, r3)
            if (r12 == 0) goto L_0x0278
            goto L_0x027b
        L_0x0278:
            int r3 = r3 + r13
            goto L_0x026d
        L_0x027a:
            r12 = 0
        L_0x027b:
            if (r0 <= r13) goto L_0x029d
            java.lang.Object r3 = r2.clone()
            byte[][] r3 = (byte[][]) r3
            r19 = r0
            r13 = 0
            r16 = 1
        L_0x0288:
            int r0 = r3.length
            int r0 = r0 + -1
            if (r13 >= r0) goto L_0x02a1
            byte[] r0 = m1.a.f3664e
            r3[r13] = r0
            byte[] r0 = r10.f3668c
            java.lang.String r0 = m1.a.a(r0, r3, r13)
            if (r0 == 0) goto L_0x029a
            goto L_0x02a2
        L_0x029a:
            int r13 = r13 + 1
            goto L_0x0288
        L_0x029d:
            r19 = r0
            r16 = 1
        L_0x02a1:
            r0 = 0
        L_0x02a2:
            if (r0 == 0) goto L_0x02b7
            r3 = 0
        L_0x02a5:
            int r13 = r19 + -1
            if (r3 >= r13) goto L_0x02b7
            byte[] r13 = r10.f3669d
            java.lang.String r13 = m1.a.a(r13, r2, r3)
            if (r13 == 0) goto L_0x02b2
            goto L_0x02b8
        L_0x02b2:
            int r3 = r3 + 1
            r16 = 1
            goto L_0x02a5
        L_0x02b7:
            r13 = 0
        L_0x02b8:
            if (r13 == 0) goto L_0x02c7
            java.lang.String r0 = "!"
            java.lang.String r0 = r0.concat(r13)
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            goto L_0x02e9
        L_0x02c7:
            if (r12 != 0) goto L_0x02ce
            if (r0 != 0) goto L_0x02ce
            java.lang.String[] r0 = m1.a.f3665g
            goto L_0x02e9
        L_0x02ce:
            if (r12 == 0) goto L_0x02d7
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r12.split(r2)
            goto L_0x02d9
        L_0x02d7:
            java.lang.String[] r2 = m1.a.f
        L_0x02d9:
            if (r0 == 0) goto L_0x02e2
            java.lang.String r3 = "\\."
            java.lang.String[] r0 = r0.split(r3)
            goto L_0x02e4
        L_0x02e2:
            java.lang.String[] r0 = m1.a.f
        L_0x02e4:
            int r3 = r2.length
            int r10 = r0.length
            if (r3 <= r10) goto L_0x02e9
            r0 = r2
        L_0x02e9:
            int r2 = r11.length
            int r3 = r0.length
            r10 = 33
            r12 = 0
            if (r2 != r3) goto L_0x02fa
            r2 = r0[r12]
            char r2 = r2.charAt(r12)
            if (r2 == r10) goto L_0x02fa
            r0 = 0
            goto L_0x0339
        L_0x02fa:
            r2 = r0[r12]
            char r2 = r2.charAt(r12)
            if (r2 != r10) goto L_0x0306
            int r2 = r11.length
            int r0 = r0.length
        L_0x0304:
            int r2 = r2 - r0
            goto L_0x030d
        L_0x0306:
            int r2 = r11.length
            int r0 = r0.length
            r16 = 1
            int r0 = r0 + 1
            goto L_0x0304
        L_0x030d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "\\."
            java.lang.String[] r3 = r6.split(r3)
        L_0x0318:
            int r10 = r3.length
            if (r2 >= r10) goto L_0x032a
            r10 = r3[r2]
            r0.append(r10)
            r10 = 46
            r0.append(r10)
            r16 = 1
            int r2 = r2 + 1
            goto L_0x0318
        L_0x032a:
            r16 = 1
            int r2 = r0.length()
            int r2 = r2 + -1
            r0.deleteCharAt(r2)
            java.lang.String r0 = r0.toString()
        L_0x0339:
            if (r0 != 0) goto L_0x034b
        L_0x033b:
            r12 = 0
            r17 = 0
            goto L_0x0397
        L_0x033f:
            r0 = move-exception
            goto L_0x0349
        L_0x0341:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x033f }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x033f }
            throw r0     // Catch:{ all -> 0x033f }
        L_0x0349:
            monitor-exit(r10)     // Catch:{ all -> 0x033f }
            throw r0
        L_0x034b:
            if (r7 == 0) goto L_0x035c
            java.lang.String r0 = "/"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0356
            goto L_0x035c
        L_0x0356:
            r12 = 0
        L_0x0357:
            r23 = r7
            r19 = r17
            goto L_0x038a
        L_0x035c:
            java.lang.String r0 = r1.f2366a
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r2 = r1.f2371h
            r3 = 47
            int r0 = r2.indexOf(r3, r0)
            int r7 = r2.length()
            java.lang.String r10 = "?#"
            int r7 = e1.c.i(r2, r0, r7, r10)
            java.lang.String r0 = r2.substring(r0, r7)
            int r2 = r0.lastIndexOf(r3)
            r12 = 0
            if (r2 == 0) goto L_0x0387
            java.lang.String r0 = r0.substring(r12, r2)
        L_0x0385:
            r7 = r0
            goto L_0x0357
        L_0x0387:
            java.lang.String r0 = "/"
            goto L_0x0385
        L_0x038a:
            d1.p r17 = new d1.p
            r24 = r21
            r18 = r22
            r22 = r6
            r20 = r14
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27)
        L_0x0397:
            r0 = r17
            goto L_0x039b
        L_0x039a:
            r0 = 0
        L_0x039b:
            if (r0 != 0) goto L_0x03a0
        L_0x039d:
            r16 = 1
            goto L_0x03ab
        L_0x03a0:
            if (r9 != 0) goto L_0x03a7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x03a7:
            r9.add(r0)
            goto L_0x039d
        L_0x03ab:
            int r8 = r8 + 1
            r6 = 0
            r3 = r36
            goto L_0x001b
        L_0x03b2:
            if (r9 == 0) goto L_0x03b9
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            goto L_0x03bb
        L_0x03b9:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L_0x03bb:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03c2
        L_0x03c1:
            return
        L_0x03c2:
            r36.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e.d(d1.b, d1.t, d1.r):void");
    }

    public static int e(int i2, String str, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static Set f(r rVar) {
        Set set = Collections.EMPTY_SET;
        int d2 = rVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            if ("Vary".equalsIgnoreCase(rVar.b(i2))) {
                String e2 = rVar.e(i2);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : e2.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }
}

package A;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import n.C0293f;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final i f23a;
    public static final C0293f b = new C0293f(16);

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f23a = new i();
        } else if (i2 >= 28) {
            f23a = new n();
        } else if (i2 >= 26) {
            f23a = new n();
        } else {
            if (i2 >= 24) {
                Method method = m.f31q;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f23a = new i();
                }
            }
            f23a = new i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r2.equals(r3) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r12, z.C0506e r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, z.C0503b r19, boolean r20) {
        /*
            r4 = r18
            r0 = r19
            r6 = 1
            r1 = 7
            r7 = 0
            boolean r2 = r13 instanceof z.C0509h
            r8 = -3
            if (r2 == 0) goto L_0x017c
            z.h r13 = (z.C0509h) r13
            java.lang.String r2 = r13.f4866d
            r9 = 0
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r7)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r7)
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r9
        L_0x002e:
            if (r2 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0043
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            Z.g r13 = new Z.g
            r13.<init>(r0, r1, r2)
            r12.post(r13)
        L_0x0043:
            return r2
        L_0x0044:
            if (r20 == 0) goto L_0x004e
            int r1 = r13.f4865c
            if (r1 != 0) goto L_0x004c
        L_0x004a:
            r1 = 1
            goto L_0x0051
        L_0x004c:
            r1 = 0
            goto L_0x0051
        L_0x004e:
            if (r0 != 0) goto L_0x004c
            goto L_0x004a
        L_0x0051:
            r2 = -1
            if (r20 == 0) goto L_0x0058
            int r3 = r13.b
            r10 = r3
            goto L_0x0059
        L_0x0058:
            r10 = -1
        L_0x0059:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            A.j r5 = new A.j
            r5.<init>((int) r7)
            r5.b = r0
            F.g r13 = r13.f4864a
            F.c r11 = new F.c
            r11.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x00f3
            n.f r0 = F.k.f207a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r13.f200e
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            n.f r0 = F.k.f207a
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00a1
            F.a r12 = new F.a
            r12.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r0)
            r3.post(r12)
        L_0x009e:
            r9 = r0
            goto L_0x019d
        L_0x00a1:
            if (r10 != r2) goto L_0x00ae
            F.j r12 = F.k.a(r1, r12, r13, r4)
            r11.F(r12)
            android.graphics.Typeface r9 = r12.f206a
            goto L_0x019d
        L_0x00ae:
            F.h r0 = new F.h
            r5 = 0
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r12 = F.k.b     // Catch:{ InterruptedException -> 0x00e1 }
            java.util.concurrent.Future r12 = r12.submit(r0)     // Catch:{ InterruptedException -> 0x00e1 }
            long r0 = (long) r10
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00cf, InterruptedException -> 0x00cc, TimeoutException -> 0x00d2 }
            java.lang.Object r12 = r12.get(r0, r13)     // Catch:{ ExecutionException -> 0x00cf, InterruptedException -> 0x00cc, TimeoutException -> 0x00d2 }
            F.j r12 = (F.j) r12     // Catch:{ InterruptedException -> 0x00e1 }
            r11.F(r12)     // Catch:{ InterruptedException -> 0x00e1 }
            android.graphics.Typeface r9 = r12.f206a     // Catch:{ InterruptedException -> 0x00e1 }
            goto L_0x019d
        L_0x00cc:
            r0 = move-exception
            r12 = r0
            goto L_0x00da
        L_0x00cf:
            r0 = move-exception
            r12 = r0
            goto L_0x00db
        L_0x00d2:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e1 }
            java.lang.String r13 = "timeout"
            r12.<init>(r13)     // Catch:{ InterruptedException -> 0x00e1 }
            throw r12     // Catch:{ InterruptedException -> 0x00e1 }
        L_0x00da:
            throw r12     // Catch:{ InterruptedException -> 0x00e1 }
        L_0x00db:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e1 }
            r13.<init>(r12)     // Catch:{ InterruptedException -> 0x00e1 }
            throw r13     // Catch:{ InterruptedException -> 0x00e1 }
        L_0x00e1:
            F.b r12 = new F.b
            java.lang.Object r13 = r11.b
            A.j r13 = (A.j) r13
            r12.<init>((java.lang.Object) r13, (int) r8, (int) r7)
            java.lang.Object r13 = r11.f194c
            android.os.Handler r13 = (android.os.Handler) r13
            r13.post(r12)
            goto L_0x019d
        L_0x00f3:
            n.f r0 = F.k.f207a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r13.f200e
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            n.f r0 = F.k.f207a
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0121
            F.a r12 = new F.a
            r12.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r0)
            r3.post(r12)
            goto L_0x009e
        L_0x0121:
            F.i r0 = new F.i
            r0.<init>(r7, r11)
            java.lang.Object r2 = F.k.f208c
            monitor-enter(r2)
            n.k r3 = F.k.f209d     // Catch:{ all -> 0x0138 }
            java.lang.Object r5 = r3.getOrDefault(r1, r9)     // Catch:{ all -> 0x0138 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0138 }
            if (r5 == 0) goto L_0x013b
            r5.add(r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            goto L_0x019d
        L_0x0138:
            r0 = move-exception
            r12 = r0
            goto L_0x017a
        L_0x013b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0138 }
            r5.<init>()     // Catch:{ all -> 0x0138 }
            r5.add(r0)     // Catch:{ all -> 0x0138 }
            r3.put(r1, r5)     // Catch:{ all -> 0x0138 }
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            F.h r0 = new F.h
            r5 = 1
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r12 = F.k.b
            F.i r13 = new F.i
            r13.<init>(r6, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x0166
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            goto L_0x016b
        L_0x0166:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L_0x016b:
            F.p r2 = new F.p
            r2.<init>()
            r2.f216g = r0
            r2.f217h = r13
            r2.f218i = r1
            r12.execute(r2)
            goto L_0x019d
        L_0x017a:
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            throw r12
        L_0x017c:
            A.i r2 = f23a
            z.f r13 = (z.C0507f) r13
            android.graphics.Typeface r9 = r2.v(r12, r13, r14, r4)
            if (r0 == 0) goto L_0x019d
            if (r9 == 0) goto L_0x019a
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            Z.g r13 = new Z.g
            r13.<init>(r0, r1, r9)
            r12.post(r13)
            goto L_0x019d
        L_0x019a:
            r0.a(r8)
        L_0x019d:
            if (r9 == 0) goto L_0x01a8
            n.f r12 = b
            java.lang.String r13 = b(r14, r15, r16, r17, r18)
            r12.b(r13, r9)
        L_0x01a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A.k.a(android.content.Context, z.e, android.content.res.Resources, int, java.lang.String, int, int, z.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}

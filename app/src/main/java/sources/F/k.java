package F;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0293f;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final C0293f f207a = new C0293f(16);
    public static final ThreadPoolExecutor b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f208c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final n.k f209d = new n.k();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F.j a(java.lang.String r6, android.content.Context r7, F.g r8, int r9) {
        /*
            n.f r0 = f207a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            F.j r6 = new F.j
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            F.l r8 = F.f.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.b
            F.m[] r3 = (F.m[]) r3
            int r8 = r8.f210a
            if (r8 == 0) goto L_0x0024
            if (r8 == r1) goto L_0x0022
        L_0x0020:
            r1 = -3
            goto L_0x003d
        L_0x0022:
            r1 = -2
            goto L_0x003d
        L_0x0024:
            if (r3 == 0) goto L_0x003d
            int r8 = r3.length
            if (r8 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            int r8 = r3.length
            r1 = 0
            r4 = 0
        L_0x002d:
            if (r4 >= r8) goto L_0x003d
            r5 = r3[r4]
            int r5 = r5.f214e
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r1 = r5
            goto L_0x003d
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            F.j r6 = new F.j
            r6.<init>((int) r1)
            return r6
        L_0x0045:
            A.i r8 = A.k.f23a
            android.graphics.Typeface r7 = r8.w(r7, r3, r9)
            if (r7 == 0) goto L_0x0056
            r0.b(r6, r7)
            F.j r6 = new F.j
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0056:
            F.j r6 = new F.j
            r6.<init>((int) r2)
            return r6
        L_0x005c:
            F.j r6 = new F.j
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.k.a(java.lang.String, android.content.Context, F.g, int):F.j");
    }
}

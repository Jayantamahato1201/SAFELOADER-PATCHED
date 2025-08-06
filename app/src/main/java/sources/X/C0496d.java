package x;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: x.d  reason: case insensitive filesystem */
public abstract class C0496d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f4757a;
    public static final Field b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f4758c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f4759d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f4760e;
    public static final Method f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f4761g = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            r0 = 3
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 2
            r4 = 0
            r5 = 1
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            f4761g = r7
            r7 = 0
            java.lang.String r8 = "android.app.ActivityThread"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r8 = r7
        L_0x001e:
            f4757a = r8
            java.lang.String r8 = "mMainThread"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)     // Catch:{ all -> 0x002a }
            r8.setAccessible(r5)     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r8 = r7
        L_0x002b:
            b = r8
            java.lang.String r8 = "mToken"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r8)     // Catch:{ all -> 0x0037 }
            r6.setAccessible(r5)     // Catch:{ all -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r6 = r7
        L_0x0038:
            f4758c = r6
            java.lang.Class r6 = f4757a
            java.lang.String r8 = "performStopActivity"
            if (r6 != 0) goto L_0x0042
        L_0x0040:
            r6 = r7
            goto L_0x0053
        L_0x0042:
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ all -> 0x0040 }
            r9[r4] = r1     // Catch:{ all -> 0x0040 }
            r9[r5] = r2     // Catch:{ all -> 0x0040 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r3] = r10     // Catch:{ all -> 0x0040 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r9)     // Catch:{ all -> 0x0040 }
            r6.setAccessible(r5)     // Catch:{ all -> 0x0040 }
        L_0x0053:
            f4759d = r6
            java.lang.Class r6 = f4757a
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r6 = r7
            goto L_0x0068
        L_0x005b:
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0059 }
            r9[r4] = r1     // Catch:{ all -> 0x0059 }
            r9[r5] = r2     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r9)     // Catch:{ all -> 0x0059 }
            r6.setAccessible(r5)     // Catch:{ all -> 0x0059 }
        L_0x0068:
            f4760e = r6
            java.lang.Class r6 = f4757a
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 == r9) goto L_0x0076
            r9 = 27
            if (r8 != r9) goto L_0x00a5
        L_0x0076:
            if (r6 != 0) goto L_0x0079
            goto L_0x00a5
        L_0x0079:
            java.lang.String r8 = "requestRelaunchActivity"
            r9 = 9
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ all -> 0x00a5 }
            r9[r4] = r1     // Catch:{ all -> 0x00a5 }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r9[r5] = r1     // Catch:{ all -> 0x00a5 }
            r9[r3] = r1     // Catch:{ all -> 0x00a5 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a5 }
            r9[r0] = r1     // Catch:{ all -> 0x00a5 }
            r0 = 4
            r9[r0] = r2     // Catch:{ all -> 0x00a5 }
            java.lang.Class<android.content.res.Configuration> r0 = android.content.res.Configuration.class
            r1 = 5
            r9[r1] = r0     // Catch:{ all -> 0x00a5 }
            r1 = 6
            r9[r1] = r0     // Catch:{ all -> 0x00a5 }
            r0 = 7
            r9[r0] = r2     // Catch:{ all -> 0x00a5 }
            r0 = 8
            r9[r0] = r2     // Catch:{ all -> 0x00a5 }
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r8, r9)     // Catch:{ all -> 0x00a5 }
            r0.setAccessible(r5)     // Catch:{ all -> 0x00a5 }
            r7 = r0
        L_0x00a5:
            f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C0496d.<clinit>():void");
    }
}

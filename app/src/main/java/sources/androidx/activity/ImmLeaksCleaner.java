package androidx.activity;

import androidx.lifecycle.p;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements p {
    public static int b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f831c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f832d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f833e;

    /* renamed from: a  reason: collision with root package name */
    public k f834a;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:31|32|33|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.lifecycle.r r3, androidx.lifecycle.C0070l r4) {
        /*
            r2 = this;
            androidx.lifecycle.l r3 = androidx.lifecycle.C0070l.ON_DESTROY
            if (r4 == r3) goto L_0x0006
            goto L_0x0076
        L_0x0006:
            int r3 = b
            r4 = 1
            if (r3 != 0) goto L_0x0035
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            r0 = 2
            b = r0     // Catch:{ NoSuchFieldException -> 0x0034 }
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0034 }
            f832d = r0     // Catch:{ NoSuchFieldException -> 0x0034 }
            r0.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0034 }
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0034 }
            f833e = r0     // Catch:{ NoSuchFieldException -> 0x0034 }
            r0.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0034 }
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0034 }
            f831c = r3     // Catch:{ NoSuchFieldException -> 0x0034 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0034 }
            b = r4     // Catch:{ NoSuchFieldException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            int r3 = b
            if (r3 != r4) goto L_0x0076
            androidx.activity.k r3 = r2.f834a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f831c     // Catch:{ IllegalAccessException -> 0x0076 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
            if (r4 != 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f832d     // Catch:{ IllegalAccessException -> 0x0072, ClassCastException -> 0x0070 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0072, ClassCastException -> 0x0070 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0072, ClassCastException -> 0x0070 }
            if (r0 != 0) goto L_0x005b
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0076
        L_0x0059:
            r3 = move-exception
            goto L_0x0074
        L_0x005b:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0063
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0076
        L_0x0063:
            java.lang.reflect.Field r0 = f833e     // Catch:{ IllegalAccessException -> 0x006e }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006e }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            r3.isActive()
            goto L_0x0076
        L_0x006e:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0076
        L_0x0070:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0076
        L_0x0072:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0076
        L_0x0074:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r3
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.b(androidx.lifecycle.r, androidx.lifecycle.l):void");
    }
}

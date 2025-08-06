package A;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z.C0507f;
import z.C0508g;

public class l extends i {

    /* renamed from: o  reason: collision with root package name */
    public static Class f24o = null;

    /* renamed from: p  reason: collision with root package name */
    public static Constructor f25p = null;

    /* renamed from: q  reason: collision with root package name */
    public static Method f26q = null;

    /* renamed from: r  reason: collision with root package name */
    public static Method f27r = null;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f28s = false;

    public static boolean A0(Object obj, String str, int i2, boolean z2) {
        B0();
        try {
            try {
                return ((Boolean) f26q.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z2)})).booleanValue();
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public static void B0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f28s) {
            f28s = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f25p = constructor;
            f24o = cls;
            f26q = method;
            f27r = method2;
        }
    }

    public Typeface v(Context context, C0507f fVar, Resources resources, int i2) {
        B0();
        try {
            Object newInstance = f25p.newInstance((Object[]) null);
            C0508g[] gVarArr = fVar.f4859a;
            int length = gVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0508g gVar = gVarArr[i3];
                File T2 = i.T(context);
                if (T2 == null) {
                    return null;
                }
                try {
                    if (!i.s(T2, resources, gVar.f)) {
                        T2.delete();
                        return null;
                    } else if (!A0(newInstance, T2.getPath(), gVar.b, gVar.f4861c)) {
                        return null;
                    } else {
                        T2.delete();
                        i3++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    T2.delete();
                }
            }
            B0();
            try {
                Object newInstance2 = Array.newInstance(f24o, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f27r.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface w(android.content.Context r4, F.m[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0007
            goto L_0x0083
        L_0x0007:
            F.m r5 = r3.E(r6, r5)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f211a     // Catch:{ IOException -> 0x0083 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0083 }
            if (r5 != 0) goto L_0x001f
            if (r5 == 0) goto L_0x0083
            r5.close()     // Catch:{ IOException -> 0x0083 }
            return r2
        L_0x001f:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0047 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0047 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0047 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0047 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0047 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0047 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0047 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0047 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0047 }
            if (r0 == 0) goto L_0x0048
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0047 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0047 }
            goto L_0x0049
        L_0x0047:
        L_0x0048:
            r0 = r2
        L_0x0049:
            if (r0 == 0) goto L_0x005c
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x005a }
            if (r6 != 0) goto L_0x0052
            goto L_0x005c
        L_0x0052:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x005a }
            r5.close()     // Catch:{ IOException -> 0x0083 }
            return r4
        L_0x005a:
            r4 = move-exception
            goto L_0x007a
        L_0x005c:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x005a }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x005a }
            r6.<init>(r0)     // Catch:{ all -> 0x005a }
            android.graphics.Typeface r4 = r3.x(r4, r6)     // Catch:{ all -> 0x0070 }
            r6.close()     // Catch:{ all -> 0x005a }
            r5.close()     // Catch:{ IOException -> 0x0083 }
            return r4
        L_0x0070:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x005a }
        L_0x0079:
            throw r4     // Catch:{ all -> 0x005a }
        L_0x007a:
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0083 }
        L_0x0082:
            throw r4     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A.l.w(android.content.Context, F.m[], int):android.graphics.Typeface");
    }
}

package A;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import n.k;

public final class m extends i {

    /* renamed from: o  reason: collision with root package name */
    public static final Class f29o;

    /* renamed from: p  reason: collision with root package name */
    public static final Constructor f30p;

    /* renamed from: q  reason: collision with root package name */
    public static final Method f31q;

    /* renamed from: r  reason: collision with root package name */
    public static final Method f32r;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method2 = null;
            cls = null;
            method = null;
        }
        f30p = constructor;
        f29o = cls;
        f31q = method;
        f32r = method2;
    }

    public static boolean A0(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f31q.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface B0(Object obj) {
        try {
            Object newInstance = Array.newInstance(f29o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f32r.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface v(android.content.Context r17, z.C0507f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = f30p     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            r2 = r0
            goto L_0x000b
        L_0x0009:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            goto L_0x0068
        L_0x000e:
            r0 = r18
            z.g[] r3 = r0.f4859a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0071
            r6 = r3[r5]
            int r0 = r6.f
            java.io.File r7 = A.i.T(r17)
            if (r7 != 0) goto L_0x0025
            r8 = r19
        L_0x0023:
            r0 = r1
            goto L_0x0059
        L_0x0025:
            r8 = r19
            boolean r0 = A.i.s(r7, r8, r0)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0031
            r7.delete()
            goto L_0x0023
        L_0x0031:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0055 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x004a }
            long r14 = r10.size()     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x004a }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x004a }
            r9.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x004a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r10     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r1
        L_0x0056:
            r7.delete()
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            goto L_0x0068
        L_0x005c:
            int r7 = r6.b
            boolean r9 = r6.f4861c
            int r6 = r6.f4863e
            boolean r0 = A0(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            return r1
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x006c:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0071:
            android.graphics.Typeface r0 = B0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.m.v(android.content.Context, z.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface w(Context context, F.m[] mVarArr, int i2) {
        Object obj;
        try {
            obj = f30p.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            k kVar = new k();
            int length = mVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Typeface B02 = B0(obj);
                    if (B02 != null) {
                        return Typeface.create(B02, i2);
                    }
                } else {
                    F.m mVar = mVarArr[i3];
                    Uri uri = mVar.f211a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, (Object) null);
                    if (byteBuffer == null) {
                        byteBuffer = i.c0(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!A0(obj, byteBuffer, mVar.b, mVar.f212c, mVar.f213d)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }
}

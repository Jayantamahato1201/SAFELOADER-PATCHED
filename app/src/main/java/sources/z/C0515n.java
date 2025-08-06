package z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: z.n  reason: case insensitive filesystem */
public abstract class C0515n {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4870a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4871c = new Object();

    public static void a(C0513l lVar, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f4871c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(lVar, sparseArray);
                }
                sparseArray.append(i2, new C0512k(colorStateList, lVar.f4869a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i2, new TypedValue(), 0, (C0503b) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface c(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, z.C0503b r16, boolean r17, boolean r18) {
        /*
            r7 = r16
            android.content.res.Resources r2 = r12.getResources()
            r0 = 1
            r2.getValue(r13, r14, r0)
            java.lang.String r9 = "ResourcesCompat"
            java.lang.CharSequence r0 = r14.string
            if (r0 == 0) goto L_0x00f1
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r10 = 0
            r11 = -3
            if (r0 != 0) goto L_0x0025
            if (r7 == 0) goto L_0x00cc
            r7.a(r11)
            goto L_0x00cc
        L_0x0025:
            int r0 = r14.assetCookie
            n.f r6 = A.k.b
            java.lang.String r0 = A.k.b(r2, r13, r4, r0, r15)
            java.lang.Object r0 = r6.a(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x004c
            if (r7 == 0) goto L_0x0049
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r12.<init>(r14)
            Z.g r14 = new Z.g
            r15 = 7
            r14.<init>(r7, r15, r0)
            r12.post(r14)
        L_0x0049:
            r10 = r0
            goto L_0x00cc
        L_0x004c:
            if (r18 == 0) goto L_0x0050
            goto L_0x00cc
        L_0x0050:
            java.lang.String r0 = r4.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            if (r0 == 0) goto L_0x0084
            android.content.res.XmlResourceParser r0 = r2.getXml(r13)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            z.e r1 = z.C0503b.j(r0, r2)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            if (r1 != 0) goto L_0x0078
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r9, r12)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            if (r7 == 0) goto L_0x00cc
            r7.a(r11)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            goto L_0x00cc
        L_0x0072:
            r0 = move-exception
            r12 = r0
            goto L_0x00b4
        L_0x0075:
            r0 = move-exception
            r12 = r0
            goto L_0x00be
        L_0x0078:
            int r5 = r14.assetCookie     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r0 = r12
            r3 = r13
            r6 = r15
            r8 = r17
            android.graphics.Typeface r10 = A.k.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            goto L_0x00cc
        L_0x0084:
            int r14 = r14.assetCookie     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            A.i r0 = A.k.f23a     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r1 = r12
            r3 = r13
            r5 = r15
            android.graphics.Typeface r12 = r0.y(r1, r2, r3, r4, r5)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            if (r12 == 0) goto L_0x0098
            java.lang.String r14 = A.k.b(r2, r13, r4, r14, r15)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r6.b(r14, r12)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
        L_0x0098:
            if (r7 == 0) goto L_0x00ae
            if (r12 == 0) goto L_0x00b0
            android.os.Handler r14 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            android.os.Looper r15 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            Z.g r15 = new Z.g     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r0 = 7
            r15.<init>(r7, r0, r12)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            r14.post(r15)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
        L_0x00ae:
            r10 = r12
            goto L_0x00cc
        L_0x00b0:
            r7.a(r11)     // Catch:{ XmlPullParserException -> 0x0075, IOException -> 0x0072 }
            goto L_0x00ae
        L_0x00b4:
            java.lang.String r14 = "Failed to read xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
            goto L_0x00c7
        L_0x00be:
            java.lang.String r14 = "Failed to parse xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
        L_0x00c7:
            if (r7 == 0) goto L_0x00cc
            r7.a(r11)
        L_0x00cc:
            if (r10 != 0) goto L_0x00f0
            if (r7 != 0) goto L_0x00f0
            if (r18 == 0) goto L_0x00d3
            goto L_0x00f0
        L_0x00d3:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Font resource ID #0x"
            r14.<init>(r15)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r14.append(r13)
            java.lang.String r13 = " could not be retrieved."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x00f0:
            return r10
        L_0x00f1:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Resource \""
            r15.<init>(r0)
            java.lang.String r0 = r2.getResourceName(r13)
            r15.append(r0)
            java.lang.String r0 = "\" ("
            r15.append(r0)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r15.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C0515n.c(android.content.Context, int, android.util.TypedValue, int, z.b, boolean, boolean):android.graphics.Typeface");
    }
}

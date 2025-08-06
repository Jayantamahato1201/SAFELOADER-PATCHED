package K0;

import android.os.Handler;
import android.os.Looper;

public final class j extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f550a;
    public Object b;

    public /* synthetic */ j() {
        this.f550a = 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x00c8, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = -1
            r5 = 1
            int r6 = r11.f550a
            switch(r6) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0034;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r12.what
            r1 = -3
            if (r0 == r1) goto L_0x0020
            r1 = -2
            if (r0 == r1) goto L_0x0020
            if (r0 == r4) goto L_0x0020
            if (r0 == r5) goto L_0x0018
            goto L_0x0033
        L_0x0018:
            java.lang.Object r12 = r12.obj
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            r12.dismiss()
            goto L_0x0033
        L_0x0020:
            java.lang.Object r0 = r12.obj
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            java.lang.Object r1 = r11.b
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.content.DialogInterface r1 = (android.content.DialogInterface) r1
            int r12 = r12.what
            r0.onClick(r1, r12)
        L_0x0033:
            return
        L_0x0034:
            int r0 = r12.what
            r6 = 1
            java.lang.Object r4 = r11.b
            K0.D r4 = (K0.D) r4
            if (r0 == 0) goto L_0x0096
            if (r0 == r5) goto L_0x0090
            if (r0 == r3) goto L_0x007e
            if (r0 == r2) goto L_0x006a
            if (r0 == r1) goto L_0x0051
            K0.u r0 = K0.w.f574i
            K0.i r1 = new K0.i
            r1.<init>(r12, r5)
            r0.post(r1)
            goto L_0x009b
        L_0x0051:
            java.lang.Object r12 = r12.obj
            java.lang.Long r12 = (java.lang.Long) r12
            int r0 = r4.f505k
            int r0 = r0 + r5
            r4.f505k = r0
            long r0 = r4.f500e
            long r2 = r12.longValue()
            long r2 = r2 + r0
            r4.f500e = r2
            int r12 = r4.f505k
            long r0 = (long) r12
            long r2 = r2 / r0
            r4.f502h = r2
            goto L_0x009b
        L_0x006a:
            int r12 = r12.arg1
            long r0 = (long) r12
            int r12 = r4.f507m
            int r12 = r12 + r5
            r4.f507m = r12
            long r2 = r4.f501g
            long r2 = r2 + r0
            r4.f501g = r2
            int r12 = r4.f506l
            long r0 = (long) r12
            long r2 = r2 / r0
            r4.f504j = r2
            goto L_0x009b
        L_0x007e:
            int r12 = r12.arg1
            long r0 = (long) r12
            int r12 = r4.f506l
            int r12 = r12 + r5
            r4.f506l = r12
            long r2 = r4.f
            long r2 = r2 + r0
            r4.f = r2
            long r0 = (long) r12
            long r2 = r2 / r0
            r4.f503i = r2
            goto L_0x009b
        L_0x0090:
            long r0 = r4.f499d
            long r0 = r0 + r6
            r4.f499d = r0
            goto L_0x009b
        L_0x0096:
            long r0 = r4.f498c
            long r0 = r0 + r6
            r4.f498c = r0
        L_0x009b:
            return
        L_0x009c:
            int r6 = r12.what
            java.lang.Object r7 = r11.b
            K0.m r7 = (K0.m) r7
            r8 = 0
            switch(r6) {
                case 1: goto L_0x0378;
                case 2: goto L_0x032a;
                case 3: goto L_0x00a6;
                case 4: goto L_0x02cb;
                case 5: goto L_0x022f;
                case 6: goto L_0x0226;
                case 7: goto L_0x01f9;
                case 8: goto L_0x00a6;
                case 9: goto L_0x017d;
                case 10: goto L_0x0178;
                case 11: goto L_0x00f9;
                case 12: goto L_0x00b2;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            K0.u r1 = K0.w.f574i
            K0.i r2 = new K0.i
            r2.<init>(r12, r0)
            r1.post(r2)
            goto L_0x037f
        L_0x00b2:
            java.lang.Object r12 = r12.obj
            java.util.LinkedHashSet r0 = r7.f556g
            boolean r0 = r0.remove(r12)
            if (r0 != 0) goto L_0x00be
            goto L_0x037f
        L_0x00be:
            java.util.WeakHashMap r0 = r7.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r0.next()
            K0.n r1 = (K0.n) r1
            K0.n r2 = r1.f566e
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x00c8
            if (r8 != 0) goto L_0x00e3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x00e3:
            r8.add(r1)
            r0.remove()
            goto L_0x00c8
        L_0x00ea:
            if (r8 == 0) goto L_0x037f
            r12 = 13
            K0.u r0 = r7.f558i
            android.os.Message r12 = r0.obtainMessage(r12, r8)
            r0.sendMessage(r12)
            goto L_0x037f
        L_0x00f9:
            java.lang.Object r12 = r12.obj
            java.util.LinkedHashSet r1 = r7.f556g
            boolean r1 = r1.add(r12)
            if (r1 != 0) goto L_0x0105
            goto L_0x037f
        L_0x0105:
            java.util.LinkedHashMap r1 = r7.f554d
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x010f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037f
            java.lang.Object r2 = r1.next()
            K0.f r2 = (K0.C0039f) r2
            K0.w r3 = r2.f530g
            r3.getClass()
            K0.n r3 = r2.f538o
            java.util.ArrayList r6 = r2.f539p
            if (r6 == 0) goto L_0x012e
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x012e
            r8 = 1
            goto L_0x012f
        L_0x012e:
            r8 = 0
        L_0x012f:
            if (r3 != 0) goto L_0x0134
            if (r8 != 0) goto L_0x0134
            goto L_0x010f
        L_0x0134:
            java.util.WeakHashMap r9 = r7.f
            if (r3 == 0) goto L_0x014a
            K0.n r10 = r3.f566e
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x014a
            r2.c(r3)
            java.lang.Object r10 = r3.a()
            r9.put(r10, r3)
        L_0x014a:
            if (r8 == 0) goto L_0x016e
            int r3 = r6.size()
            int r3 = r3 - r5
        L_0x0151:
            if (r3 < 0) goto L_0x016e
            java.lang.Object r8 = r6.get(r3)
            K0.n r8 = (K0.n) r8
            K0.n r10 = r8.f566e
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0162
            goto L_0x016c
        L_0x0162:
            r2.c(r8)
            java.lang.Object r10 = r8.a()
            r9.put(r10, r8)
        L_0x016c:
            int r3 = r3 + r4
            goto L_0x0151
        L_0x016e:
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x010f
            r1.remove()
            goto L_0x010f
        L_0x0178:
            r7.getClass()
            goto L_0x037f
        L_0x017d:
            java.lang.Object r12 = r12.obj
            android.net.NetworkInfo r12 = (android.net.NetworkInfo) r12
            K0.z r4 = r7.b
            boolean r6 = A.g.k(r4)
            if (r6 == 0) goto L_0x01c9
            if (r12 == 0) goto L_0x01c6
            r4.getClass()
            boolean r6 = r12.isConnectedOrConnecting()
            if (r6 != 0) goto L_0x0195
            goto L_0x01c6
        L_0x0195:
            int r6 = r12.getType()
            if (r6 == 0) goto L_0x01ac
            if (r6 == r5) goto L_0x01a8
            r3 = 6
            if (r6 == r3) goto L_0x01a8
            r3 = 9
            if (r6 == r3) goto L_0x01a8
            r4.a(r2)
            goto L_0x01c9
        L_0x01a8:
            r4.a(r1)
            goto L_0x01c9
        L_0x01ac:
            int r1 = r12.getSubtype()
            switch(r1) {
                case 1: goto L_0x01c2;
                case 2: goto L_0x01c2;
                case 3: goto L_0x01be;
                case 4: goto L_0x01be;
                case 5: goto L_0x01be;
                case 6: goto L_0x01be;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            switch(r1) {
                case 12: goto L_0x01be;
                case 13: goto L_0x01ba;
                case 14: goto L_0x01ba;
                case 15: goto L_0x01ba;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            r4.a(r2)
            goto L_0x01c9
        L_0x01ba:
            r4.a(r2)
            goto L_0x01c9
        L_0x01be:
            r4.a(r3)
            goto L_0x01c9
        L_0x01c2:
            r4.a(r5)
            goto L_0x01c9
        L_0x01c6:
            r4.a(r2)
        L_0x01c9:
            if (r12 == 0) goto L_0x037f
            boolean r12 = r12.isConnected()
            if (r12 == 0) goto L_0x037f
            java.util.WeakHashMap r12 = r7.f555e
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x037f
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x01e1:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x037f
            java.lang.Object r1 = r12.next()
            K0.n r1 = (K0.n) r1
            r12.remove()
            K0.w r2 = r1.f563a
            r2.getClass()
            r7.d(r1, r0)
            goto L_0x01e1
        L_0x01f9:
            r7.getClass()
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.ArrayList r1 = r7.f561l
            r12.<init>(r1)
            r1.clear()
            r1 = 8
            K0.u r2 = r7.f558i
            android.os.Message r1 = r2.obtainMessage(r1, r12)
            r2.sendMessage(r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0219
            goto L_0x037f
        L_0x0219:
            java.lang.Object r12 = r12.get(r0)
            K0.f r12 = (K0.C0039f) r12
            K0.w r12 = r12.f530g
            r12.getClass()
            goto L_0x037f
        L_0x0226:
            java.lang.Object r12 = r12.obj
            K0.f r12 = (K0.C0039f) r12
            r7.c(r12, r0)
            goto L_0x037f
        L_0x022f:
            java.lang.Object r12 = r12.obj
            K0.f r12 = (K0.C0039f) r12
            r7.getClass()
            java.util.concurrent.Future r1 = r12.f541r
            if (r1 == 0) goto L_0x0242
            boolean r1 = r1.isCancelled()
            if (r1 == 0) goto L_0x0242
            goto L_0x037f
        L_0x0242:
            K0.z r1 = r7.b
            boolean r2 = r1.isShutdown()
            if (r2 == 0) goto L_0x024f
            r7.c(r12, r0)
            goto L_0x037f
        L_0x024f:
            boolean r2 = r7.f562m
            if (r2 == 0) goto L_0x0263
            java.lang.StringBuilder r3 = K0.G.f520a
            java.lang.String r3 = "connectivity"
            android.content.Context r4 = r7.f552a
            java.lang.Object r3 = r4.getSystemService(r3)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r8 = r3.getActiveNetworkInfo()
        L_0x0263:
            int r3 = r12.f545v
            K0.C r4 = r12.f537n
            if (r3 <= 0) goto L_0x0271
            int r3 = r3 - r5
            r12.f545v = r3
            boolean r3 = r4.d(r8)
            goto L_0x0272
        L_0x0271:
            r3 = 0
        L_0x0272:
            if (r3 == 0) goto L_0x028c
            K0.w r0 = r12.f530g
            r0.getClass()
            java.lang.Exception r0 = r12.f543t
            boolean r0 = r0 instanceof K0.r
            if (r0 == 0) goto L_0x0284
            int r0 = r12.f536m
            r0 = r0 | r5
            r12.f536m = r0
        L_0x0284:
            java.util.concurrent.Future r0 = r1.submit(r12)
            r12.f541r = r0
            goto L_0x037f
        L_0x028c:
            if (r2 == 0) goto L_0x0297
            r4.getClass()
            boolean r1 = r4 instanceof K0.t
            if (r1 == 0) goto L_0x0297
            r1 = 1
            goto L_0x0298
        L_0x0297:
            r1 = 0
        L_0x0298:
            r7.c(r12, r1)
            if (r1 == 0) goto L_0x037f
            K0.n r1 = r12.f538o
            java.util.WeakHashMap r2 = r7.f555e
            if (r1 == 0) goto L_0x02ae
            java.lang.Object r3 = r1.a()
            if (r3 == 0) goto L_0x02ae
            r1.f = r5
            r2.put(r3, r1)
        L_0x02ae:
            java.util.ArrayList r12 = r12.f539p
            if (r12 == 0) goto L_0x037f
            int r1 = r12.size()
        L_0x02b6:
            if (r0 >= r1) goto L_0x037f
            java.lang.Object r3 = r12.get(r0)
            K0.n r3 = (K0.n) r3
            java.lang.Object r4 = r3.a()
            if (r4 == 0) goto L_0x02c9
            r3.f = r5
            r2.put(r4, r3)
        L_0x02c9:
            int r0 = r0 + r5
            goto L_0x02b6
        L_0x02cb:
            java.lang.Object r12 = r12.obj
            K0.f r12 = (K0.C0039f) r12
            r7.getClass()
            r12.getClass()
            android.graphics.Bitmap r0 = r12.f540q
            A.j r1 = r7.f559j
            r1.getClass()
            java.lang.String r2 = r12.f534k
            if (r2 == 0) goto L_0x0322
            if (r0 == 0) goto L_0x0322
            java.lang.StringBuilder r3 = K0.G.f520a
            int r3 = r0.getAllocationByteCount()
            if (r3 < 0) goto L_0x030e
            java.lang.Object r1 = r1.b
            K0.o r1 = (K0.o) r1
            int r4 = r1.maxSize()
            if (r3 <= r4) goto L_0x02f8
            r1.remove(r2)
            goto L_0x0300
        L_0x02f8:
            K0.p r4 = new K0.p
            r4.<init>(r0, r3)
            r1.put(r2, r4)
        L_0x0300:
            java.util.LinkedHashMap r0 = r7.f554d
            r0.remove(r2)
            r7.a(r12)
            K0.w r12 = r12.f530g
            r12.getClass()
            goto L_0x037f
        L_0x030e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        L_0x0322:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null || bitmap == null"
            r12.<init>(r0)
            throw r12
        L_0x032a:
            java.lang.Object r12 = r12.obj
            K0.n r12 = (K0.n) r12
            r7.getClass()
            java.lang.String r0 = r12.f565d
            java.util.LinkedHashMap r1 = r7.f554d
            java.lang.Object r2 = r1.get(r0)
            K0.f r2 = (K0.C0039f) r2
            K0.w r3 = r12.f563a
            if (r2 == 0) goto L_0x034e
            r2.c(r12)
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x034e
            r1.remove(r0)
            r3.getClass()
        L_0x034e:
            java.util.LinkedHashSet r0 = r7.f556g
            K0.n r1 = r12.f566e
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0364
            java.util.WeakHashMap r0 = r7.f
            java.lang.Object r1 = r12.a()
            r0.remove(r1)
            r3.getClass()
        L_0x0364:
            java.util.WeakHashMap r0 = r7.f555e
            java.lang.Object r12 = r12.a()
            java.lang.Object r12 = r0.remove(r12)
            K0.n r12 = (K0.n) r12
            if (r12 == 0) goto L_0x037f
            K0.w r12 = r12.f563a
            r12.getClass()
            goto L_0x037f
        L_0x0378:
            java.lang.Object r12 = r12.obj
            K0.n r12 = (K0.n) r12
            r7.d(r12, r5)
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.j.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Looper looper, Object obj, int i2) {
        super(looper);
        this.f550a = i2;
        this.b = obj;
    }
}

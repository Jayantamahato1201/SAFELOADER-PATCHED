package K0;

import android.content.Context;
import android.net.Uri;

public final class q extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f569d = {"orientation"};

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f570c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i2) {
        super(context, 0);
        this.f570c = i2;
    }

    public final boolean a(A a2) {
        switch (this.f570c) {
            case 0:
                Uri uri = a2.f493a;
                if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
                    return false;
                }
                return true;
            default:
                return "file".equals(a2.f493a.getScheme());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r1 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r1 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final H0.r c(K0.A r9, int r10) {
        /*
            r8 = this;
            int r10 = r8.f570c
            switch(r10) {
                case 0: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r10 = r8.b
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r0 = r9.f493a
            java.io.InputStream r10 = r10.openInputStream(r0)
            o1.b r10 = o1.o.c(r10)
            H0.r r0 = new H0.r
            U.e r1 = new U.e
            android.net.Uri r9 = r9.f493a
            java.lang.String r9 = r9.getPath()
            r1.<init>(r9)
            java.lang.String r9 = "Orientation"
            U.b r9 = r1.d(r9)
            if (r9 != 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            java.nio.ByteOrder r1 = r1.f751e     // Catch:{ NumberFormatException -> 0x0032 }
            int r9 = r9.e(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r9 = 1
        L_0x0033:
            r1 = 0
            r2 = 2
            r0.<init>(r1, r10, r2, r9)
            return r0
        L_0x0039:
            android.content.Context r10 = r8.b
            android.content.ContentResolver r0 = r10.getContentResolver()
            android.net.Uri r1 = r9.f493a
            r6 = 0
            r7 = 0
            java.lang.String[] r2 = f569d     // Catch:{ RuntimeException -> 0x0069, all -> 0x0066 }
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ RuntimeException -> 0x0069, all -> 0x0066 }
            if (r1 == 0) goto L_0x0063
            boolean r2 = r1.moveToFirst()     // Catch:{ RuntimeException -> 0x0061, all -> 0x005d }
            if (r2 != 0) goto L_0x0055
            goto L_0x0063
        L_0x0055:
            int r6 = r1.getInt(r6)     // Catch:{ RuntimeException -> 0x0061, all -> 0x005d }
        L_0x0059:
            r1.close()
            goto L_0x0075
        L_0x005d:
            r0 = move-exception
            r9 = r0
            r7 = r1
            goto L_0x006c
        L_0x0061:
            goto L_0x0072
        L_0x0063:
            if (r1 == 0) goto L_0x0075
            goto L_0x0059
        L_0x0066:
            r0 = move-exception
            r9 = r0
            goto L_0x006c
        L_0x0069:
            r1 = r7
            goto L_0x0072
        L_0x006c:
            if (r7 == 0) goto L_0x0071
            r7.close()
        L_0x0071:
            throw r9
        L_0x0072:
            if (r1 == 0) goto L_0x0075
            goto L_0x0059
        L_0x0075:
            android.net.Uri r9 = r9.f493a
            java.lang.String r0 = r0.getType(r9)
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = "video/"
            boolean r0 = r0.startsWith(r1)
        L_0x0083:
            android.content.ContentResolver r10 = r10.getContentResolver()
            java.io.InputStream r9 = r10.openInputStream(r9)
            o1.b r9 = o1.o.c(r9)
            H0.r r10 = new H0.r
            r0 = 2
            r10.<init>(r7, r9, r0, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.q.c(K0.A, int):H0.r");
    }
}

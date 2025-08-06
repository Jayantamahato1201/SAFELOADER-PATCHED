package K0;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: K0.g  reason: case insensitive filesystem */
public final class C0040g extends C {
    public static final UriMatcher b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f547a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C0040g(Context context) {
        this.f547a = context;
    }

    public final boolean a(A a2) {
        Uri uri = a2.f493a;
        if (!"content".equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || b.match(uri) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final H0.r c(K0.A r6, int r7) {
        /*
            r5 = this;
            android.content.Context r7 = r5.f547a
            android.content.ContentResolver r7 = r7.getContentResolver()
            android.net.Uri r6 = r6.f493a
            android.content.UriMatcher r0 = b
            int r0 = r0.match(r6)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0035
            if (r0 == r1) goto L_0x0030
            r4 = 3
            if (r0 == r4) goto L_0x003d
            r3 = 4
            if (r0 != r3) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uri: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0030:
            java.io.InputStream r6 = r7.openInputStream(r6)
            goto L_0x0041
        L_0x0035:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.lookupContact(r7, r6)
            if (r6 != 0) goto L_0x003d
            r6 = r2
            goto L_0x0041
        L_0x003d:
            java.io.InputStream r6 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r7, r6, r3)
        L_0x0041:
            if (r6 != 0) goto L_0x0044
            return r2
        L_0x0044:
            H0.r r7 = new H0.r
            o1.b r6 = o1.o.c(r6)
            r7.<init>((o1.v) r6, (int) r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.C0040g.c(K0.A, int):H0.r");
    }
}

package q1;

import A.g;
import L0.b;
import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b1.i;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: q1.w0  reason: case insensitive filesystem */
public abstract class C0446w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4224a = g.h(C0394n1.b, ".provider.stub");
    public static final C0351g0 b = new C0351g0("mLocalProvider");

    public static b a(Uri uri) {
        try {
            String str = "content://" + (f4224a + H.f3901s) + "/";
            if (!i.j0(uri.toString(), str)) {
                return null;
            }
            Uri parse = Uri.parse("content://" + uri.toString().substring(str.length()));
            C0433u uVar = C0433u.b;
            String authority = parse.getAuthority();
            Map map = C0433u.f4214z;
            uVar.getClass();
            Object obj = map.get(C0433u.f4213y.newInstance(new Object[]{authority, Integer.valueOf(C0394n1.f4145d)}));
            if (obj == null) {
                return null;
            }
            ContentProvider contentProvider = (ContentProvider) ((C0) b.f4098c).a(obj);
            if (contentProvider == null) {
                return null;
            }
            return new b(parse, contentProvider);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r5 = r3.getItemAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent b(android.content.Intent r13) {
        /*
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.lang.String r2 = "output"
            java.lang.String r3 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r4 = "app_package"
            java.lang.String r5 = "android.intent.extra.INTENT"
            android.os.Parcelable r6 = r13.getParcelableExtra(r5)     // Catch:{ Exception -> 0x00df }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x00df }
            if (r6 == 0) goto L_0x001b
            android.content.Intent r6 = b(r6)     // Catch:{ Exception -> 0x00df }
            r13.putExtra(r5, r6)     // Catch:{ Exception -> 0x00df }
        L_0x001b:
            boolean r5 = r13.hasExtra(r4)     // Catch:{ Exception -> 0x00df }
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = q1.C0394n1.b     // Catch:{ Exception -> 0x00df }
            r13.putExtra(r4, r5)     // Catch:{ Exception -> 0x00df }
        L_0x0026:
            boolean r4 = q1.T4.f4000e     // Catch:{ Exception -> 0x00df }
            if (r4 == 0) goto L_0x0035
            boolean r4 = r13.hasExtra(r3)     // Catch:{ Exception -> 0x00df }
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = q1.C0394n1.b     // Catch:{ Exception -> 0x00df }
            r13.putExtra(r3, r4)     // Catch:{ Exception -> 0x00df }
        L_0x0035:
            android.net.Uri r3 = r13.getData()     // Catch:{ Exception -> 0x00df }
            if (r3 == 0) goto L_0x0046
            android.net.Uri r3 = d(r3)     // Catch:{ Exception -> 0x00df }
            java.lang.String r4 = r13.getType()     // Catch:{ Exception -> 0x00df }
            r13.setDataAndType(r3, r4)     // Catch:{ Exception -> 0x00df }
        L_0x0046:
            android.content.ClipData r3 = r13.getClipData()     // Catch:{ Exception -> 0x00df }
            r4 = 0
            if (r3 == 0) goto L_0x00b0
            int r5 = r3.getItemCount()     // Catch:{ Exception -> 0x00df }
            if (r5 < 0) goto L_0x00b0
            android.content.ClipData$Item r5 = r3.getItemAt(r4)     // Catch:{ Exception -> 0x00df }
            android.net.Uri r6 = r5.getUri()     // Catch:{ Exception -> 0x00df }
            if (r6 == 0) goto L_0x00b0
            android.net.Uri r7 = d(r6)     // Catch:{ Exception -> 0x00df }
            boolean r6 = U0.i.a(r7, r6)     // Catch:{ Exception -> 0x00df }
            if (r6 != 0) goto L_0x00b0
            android.content.ClipData r6 = new android.content.ClipData     // Catch:{ Exception -> 0x00df }
            android.content.ClipDescription r8 = r3.getDescription()     // Catch:{ Exception -> 0x00df }
            android.content.ClipData$Item r9 = new android.content.ClipData$Item     // Catch:{ Exception -> 0x00df }
            java.lang.CharSequence r10 = r5.getText()     // Catch:{ Exception -> 0x00df }
            java.lang.String r11 = r5.getHtmlText()     // Catch:{ Exception -> 0x00df }
            android.content.Intent r5 = r5.getIntent()     // Catch:{ Exception -> 0x00df }
            r9.<init>(r10, r11, r5, r7)     // Catch:{ Exception -> 0x00df }
            r6.<init>(r8, r9)     // Catch:{ Exception -> 0x00df }
            int r5 = r3.getItemCount()     // Catch:{ Exception -> 0x00df }
            r7 = 1
        L_0x0086:
            if (r7 >= r5) goto L_0x00ad
            android.content.ClipData$Item r8 = r3.getItemAt(r7)     // Catch:{ Exception -> 0x00df }
            android.net.Uri r9 = r8.getUri()     // Catch:{ Exception -> 0x00df }
            if (r9 == 0) goto L_0x0096
            android.net.Uri r9 = d(r9)     // Catch:{ Exception -> 0x00df }
        L_0x0096:
            android.content.ClipData$Item r10 = new android.content.ClipData$Item     // Catch:{ Exception -> 0x00df }
            java.lang.CharSequence r11 = r8.getText()     // Catch:{ Exception -> 0x00df }
            java.lang.String r12 = r8.getHtmlText()     // Catch:{ Exception -> 0x00df }
            android.content.Intent r8 = r8.getIntent()     // Catch:{ Exception -> 0x00df }
            r10.<init>(r11, r12, r8, r9)     // Catch:{ Exception -> 0x00df }
            r6.addItem(r10)     // Catch:{ Exception -> 0x00df }
            int r7 = r7 + 1
            goto L_0x0086
        L_0x00ad:
            r13.setClipData(r6)     // Catch:{ Exception -> 0x00df }
        L_0x00b0:
            boolean r3 = r13.hasExtra(r2)     // Catch:{ Exception -> 0x00df }
            if (r3 == 0) goto L_0x00b9
            c(r13, r2)     // Catch:{ Exception -> 0x00df }
        L_0x00b9:
            boolean r2 = r13.hasExtra(r1)     // Catch:{ Exception -> 0x00df }
            if (r2 == 0) goto L_0x00c2
            c(r13, r1)     // Catch:{ Exception -> 0x00df }
        L_0x00c2:
            android.os.Parcelable[] r1 = r13.getParcelableArrayExtra(r0)     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x00df
            int r2 = r1.length     // Catch:{ Exception -> 0x00df }
            android.content.Intent[] r3 = new android.content.Intent[r2]     // Catch:{ Exception -> 0x00df }
        L_0x00cb:
            if (r4 >= r2) goto L_0x00da
            r5 = r1[r4]     // Catch:{ Exception -> 0x00df }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x00df }
            android.content.Intent r5 = b(r5)     // Catch:{ Exception -> 0x00df }
            r3[r4] = r5     // Catch:{ Exception -> 0x00df }
            int r4 = r4 + 1
            goto L_0x00cb
        L_0x00da:
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3     // Catch:{ Exception -> 0x00df }
            r13.putExtra(r0, r3)     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0446w0.b(android.content.Intent):android.content.Intent");
    }

    public static void c(Intent intent, String str) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Object obj = extras.get(str);
                if (obj instanceof Uri) {
                    intent.putExtra(str, d((Uri) obj));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = new ArrayList(((ArrayList) obj).size());
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        arrayList.add(d((Uri) obj2));
                    }
                    if (!arrayList.isEmpty()) {
                        intent.putExtra(str, arrayList);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static Uri d(Uri uri) {
        try {
            if (U0.i.a(uri.getScheme(), "content")) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    String str = f4224a;
                    if (!i.j0(authority, str)) {
                        C0351g0 g0Var = b;
                        C0433u uVar = C0433u.b;
                        Map map = C0433u.f4214z;
                        uVar.getClass();
                        Object obj = map.get(C0433u.f4213y.newInstance(new Object[]{authority, Integer.valueOf(C0394n1.f4145d)}));
                        if (obj != null) {
                            if (((C0) g0Var.f4098c).a(obj) != null) {
                                return Uri.parse("content://" + (str + H.f3901s) + "/" + uri.toString().substring(10));
                            }
                        }
                    }
                }
            } else if (U0.i.a(uri.getScheme(), "package") && U0.i.a(uri.getSchemeSpecificPart(), H.f3896n)) {
                return Uri.fromParts("package", C0394n1.b, (String) null);
            }
            return uri;
        } catch (Exception unused) {
            return uri;
        }
    }
}

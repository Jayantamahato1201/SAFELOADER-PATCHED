package q1;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.internal.R;
import java.util.ArrayList;
import java.util.List;

public abstract class U4 {
    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        K2.b.getClass();
        ArrayList U02 = K2.U0();
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        int size = U02.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = U02.get(i2);
            i2++;
            String str = (String) obj;
            K2 k2 = K2.b;
            k2.getClass();
            List<ResolveInfo> list = null;
            if (K2.f3929c.containsKey(str)) {
                arrayList.addAll(k2.b(intent.setPackage(str), (String) null, 128));
            } else {
                try {
                    list = C0394n1.f4143a.getPackageManager().queryIntentServices(intent.setPackage(str), 128);
                } catch (Exception unused) {
                }
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        Q0.l.n(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q1.C0341e2 b(android.content.pm.ResolveInfo r6) {
        /*
            android.content.pm.ServiceInfo r6 = r6.serviceInfo
            android.content.Context r0 = q1.C0394n1.f4143a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.lang.String r2 = "android.accounts.AccountAuthenticator"
            android.content.res.XmlResourceParser r2 = r6.loadXmlMetaData(r0, r2)     // Catch:{ Exception -> 0x0047 }
            if (r2 != 0) goto L_0x0012
            goto L_0x0047
        L_0x0012:
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch:{ all -> 0x0040 }
        L_0x0016:
            int r4 = r2.next()     // Catch:{ all -> 0x0040 }
            r5 = 1
            if (r4 == r5) goto L_0x0020
            r5 = 2
            if (r4 != r5) goto L_0x0016
        L_0x0020:
            java.lang.String r4 = r2.getName()     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "account-authenticator"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x0030
            Q0.l.n(r2, r1)     // Catch:{ Exception -> 0x0047 }
            return r1
        L_0x0030:
            android.content.pm.ApplicationInfo r4 = r6.applicationInfo     // Catch:{ all -> 0x0040 }
            android.content.res.Resources r0 = r0.getResourcesForApplication(r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = r6.packageName     // Catch:{ all -> 0x0040 }
            q1.e2 r6 = c(r0, r4, r3, r6)     // Catch:{ all -> 0x0040 }
            Q0.l.n(r2, r1)     // Catch:{ Exception -> 0x0047 }
            return r6
        L_0x0040:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            Q0.l.n(r2, r6)     // Catch:{ Exception -> 0x0047 }
            throw r0     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.U4.b(android.content.pm.ResolveInfo):q1.e2");
    }

    public static C0341e2 c(Resources resources, String str, AttributeSet attributeSet, ServiceInfo serviceInfo) {
        TypedArray obtainAttributes;
        try {
            obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.AccountAuthenticator);
            String string = obtainAttributes.getString(R.styleable.AccountAuthenticator_accountType);
            if (string != null) {
                if (string.length() != 0) {
                    C0341e2 e2Var = new C0341e2(string, str, obtainAttributes.getResourceId(R.styleable.AccountAuthenticator_label, 0), obtainAttributes.getResourceId(R.styleable.AccountAuthenticator_icon, 0), obtainAttributes.getResourceId(R.styleable.AccountAuthenticator_smallIcon, 0), obtainAttributes.getResourceId(R.styleable.AccountAuthenticator_accountPreferences, 0), obtainAttributes.getBoolean(R.styleable.AccountAuthenticator_customTokens, false), serviceInfo);
                    obtainAttributes.recycle();
                    return e2Var;
                }
            }
            obtainAttributes.recycle();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

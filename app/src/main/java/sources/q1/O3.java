package q1;

import L0.d;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.reflect.Method;

public abstract class O3 {

    /* renamed from: a  reason: collision with root package name */
    public static C0413q2 f3952a = new C0413q2(0);
    public static final C0 b;

    static {
        C0 c02;
        try {
            Method declaredMethod = Context.class.getDeclaredMethod("createApplicationContext", new Class[]{ApplicationInfo.class, Integer.TYPE});
            declaredMethod.setAccessible(true);
            c02 = new C0351g0(declaredMethod, 1);
        } catch (Exception unused) {
            c02 = C0.f3864a;
        }
        b = c02;
    }

    public static H3 a(Context context) {
        int i2;
        int i3;
        Drawable drawable;
        try {
            ActivityInfo c2 = H.c(context.getPackageName());
            if (c2 != null) {
                int themeResource = c2.getThemeResource();
                if (themeResource != 0) {
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.applyStyle(themeResource, true);
                    TypedValue typedValue = new TypedValue();
                    if (newTheme.resolveAttribute(16842836, typedValue, true) && (i2 = typedValue.resourceId) != 0 && (((i3 = typedValue.type) < 28 || i3 > 31) && (drawable = newTheme.getDrawable(i2)) != null)) {
                        return new H3(drawable, (d) null);
                    }
                    if (T4.f4003i) {
                        return b(newTheme, typedValue);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047 A[Catch:{ Exception -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q1.H3 b(android.content.res.Resources.Theme r6, android.util.TypedValue r7) {
        /*
            r0 = 16844333(0x101062d, float:2.369799E-38)
            r1 = 1
            r2 = 0
            boolean r0 = r6.resolveAttribute(r0, r7, r1)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0063
            int r0 = r7.resourceId     // Catch:{ Exception -> 0x0063 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0063
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)     // Catch:{ Exception -> 0x0063 }
            if (r0 != 0) goto L_0x0017
            goto L_0x0063
        L_0x0017:
            r3 = 16844335(0x101062f, float:2.3697995E-38)
            boolean r3 = r6.resolveAttribute(r3, r7, r1)     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x002a
            int r3 = r7.resourceId     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x0025
            goto L_0x002a
        L_0x0025:
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            r4 = 16844332(0x101062c, float:2.3697986E-38)
            boolean r4 = r6.resolveAttribute(r4, r7, r1)     // Catch:{ Exception -> 0x0063 }
            if (r4 == 0) goto L_0x003b
            int r4 = r7.data     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            boolean r5 = q1.T4.f4000e     // Catch:{ Exception -> 0x0063 }
            if (r5 == 0) goto L_0x0047
            boolean r5 = G.f.y(r0)     // Catch:{ Exception -> 0x0063 }
            if (r5 == 0) goto L_0x0047
            goto L_0x0057
        L_0x0047:
            r5 = 16844336(0x1010630, float:2.3697997E-38)
            boolean r6 = r6.resolveAttribute(r5, r7, r1)     // Catch:{ Exception -> 0x0063 }
            if (r6 == 0) goto L_0x0057
            int r6 = r7.data     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            q1.H3 r7 = new q1.H3     // Catch:{ Exception -> 0x0063 }
            L0.d r1 = new L0.d     // Catch:{ Exception -> 0x0063 }
            r1.<init>(r3, r4, r6)     // Catch:{ Exception -> 0x0063 }
            r7.<init>(r0, r1)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.O3.b(android.content.res.Resources$Theme, android.util.TypedValue):q1.H3");
    }
}

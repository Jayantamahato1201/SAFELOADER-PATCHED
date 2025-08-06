package t0;

import B.a;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.cheatbox.LoginActivity;
import e.C0137h;
import f0.C0143B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import k.X;
import x.C0493a;
import x.h;
import x.i;
import y.b;

/* renamed from: t0.a  reason: case insensitive filesystem */
public abstract class C0486a {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r9, java.lang.String r10) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r9.getPackageName()
            int r0 = r9.checkPermission(r10, r0, r1)
            r3 = -1
            if (r0 != r3) goto L_0x0014
            goto L_0x0037
        L_0x0014:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L_0x001f
            java.lang.String r10 = x.e.d(r10)
            goto L_0x0020
        L_0x001f:
            r10 = 0
        L_0x0020:
            r5 = 0
            if (r10 != 0) goto L_0x0024
            goto L_0x0083
        L_0x0024:
            if (r2 != 0) goto L_0x0038
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L_0x0037
            int r6 = r2.length
            if (r6 > 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r2 = r2[r5]
            goto L_0x0038
        L_0x0037:
            return r3
        L_0x0038:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r9.getPackageName()
            r7 = 1
            java.lang.Class<android.app.AppOpsManager> r8 = android.app.AppOpsManager.class
            if (r3 != r1) goto L_0x0074
            boolean r3 = java.util.Objects.equals(r6, r2)
            if (r3 == 0) goto L_0x0074
            r3 = 29
            if (r0 < r3) goto L_0x0067
            android.app.AppOpsManager r0 = x.f.c(r9)
            int r3 = android.os.Binder.getCallingUid()
            int r2 = x.f.a(r0, r10, r3, r2)
            if (r2 == 0) goto L_0x005e
            goto L_0x0081
        L_0x005e:
            java.lang.String r9 = x.f.b(r9)
            int r2 = x.f.a(r0, r10, r1, r9)
            goto L_0x0081
        L_0x0067:
            if (r0 < r4) goto L_0x0080
            java.lang.Object r9 = x.e.a(r9, r8)
            android.app.AppOpsManager r9 = (android.app.AppOpsManager) r9
            int r7 = x.e.c(r9, r10, r2)
            goto L_0x0080
        L_0x0074:
            if (r0 < r4) goto L_0x0080
            java.lang.Object r9 = x.e.a(r9, r8)
            android.app.AppOpsManager r9 = (android.app.AppOpsManager) r9
            int r7 = x.e.c(r9, r10, r2)
        L_0x0080:
            r2 = r7
        L_0x0081:
            if (r2 != 0) goto L_0x0084
        L_0x0083:
            return r5
        L_0x0084:
            r9 = -2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0486a.a(android.content.Context, java.lang.String):int");
    }

    public static int b(LoginActivity loginActivity, String str) {
        boolean z2 = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return loginActivity.checkPermission(str, Process.myPid(), Process.myUid());
        }
        i iVar = new i(loginActivity);
        if (i2 >= 24) {
            z2 = h.a(iVar.f4763a);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) loginActivity.getSystemService("appops");
            ApplicationInfo applicationInfo = loginActivity.getApplicationInfo();
            String packageName = loginActivity.getApplicationContext().getPackageName();
            int i3 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class});
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                if (((Integer) method.invoke(appOpsManager, new Object[]{num, Integer.valueOf(i3), packageName})).intValue() != 0) {
                    z2 = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        if (z2) {
            return 0;
        }
        return -1;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z2;
        if (Build.VERSION.SDK_INT < 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = A.i.y0(drawable).mutate();
            if (mode != null) {
                a.i(mutate, mode);
            }
            return mutate;
        }
        if (z2) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int d(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(context, i2);
        }
        return context.getResources().getColor(i2);
    }

    public static int e(Context context, int i2, int i3) {
        Integer num;
        int i4;
        TypedValue h02 = A.i.h0(context, i2);
        if (h02 != null) {
            int i5 = h02.resourceId;
            if (i5 != 0) {
                i4 = d(context, i5);
            } else {
                i4 = h02.data;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i3;
    }

    public static int f(View view, int i2) {
        Context context = view.getContext();
        TypedValue j02 = A.i.j0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = j02.resourceId;
        if (i3 != 0) {
            return d(context, i3);
        }
        return j02.data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.f4868c == r8.hashCode()) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList g(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            z.l r1 = new z.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = z.C0515n.f4871c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = z.C0515n.b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x004f
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x004f
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            z.k r5 = (z.C0512k) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x004f
            android.content.res.Configuration r6 = r5.b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004c
            if (r8 != 0) goto L_0x003e
            int r6 = r5.f4868c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0048
            goto L_0x003e
        L_0x003c:
            r8 = move-exception
            goto L_0x009c
        L_0x003e:
            if (r8 == 0) goto L_0x004c
            int r6 = r5.f4868c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004c
        L_0x0048:
            android.content.res.ColorStateList r3 = r5.f4867a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0051
        L_0x004c:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0051:
            if (r3 == 0) goto L_0x0054
            return r3
        L_0x0054:
            java.lang.ThreadLocal r2 = z.C0515n.f4870a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0066
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0066:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0075
            r3 = 31
            if (r2 > r3) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = z.C0504c.a(r0, r2, r8)     // Catch:{ Exception -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L_0x0086:
            if (r4 == 0) goto L_0x008c
            z.C0515n.a(r1, r9, r4, r8)
            goto L_0x009b
        L_0x008c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0097
            android.content.res.ColorStateList r4 = z.C0511j.b(r0, r9, r8)
            goto L_0x009b
        L_0x0097:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9)
        L_0x009b:
            return r4
        L_0x009c:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0486a.g(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList h(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C0143B.n(drawable)) {
            return null;
        }
        return C0143B.b(drawable).getColorStateList();
    }

    public static float i(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static Intent j(C0137h hVar) {
        Intent parentActivityIntent = hVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String l2 = l(hVar, hVar.getComponentName());
            if (l2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(hVar, l2);
            try {
                if (l(hVar, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + l2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent k(C0137h hVar, ComponentName componentName) {
        String l2 = l(hVar, componentName);
        if (l2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), l2);
        if (l(hVar, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String l(Activity activity, ComponentName componentName) {
        int i2;
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = 269222528;
        } else if (i3 >= 24) {
            i2 = 787072;
        } else {
            i2 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    public static boolean m(int i2) {
        double d2;
        double pow;
        double d3;
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = A.a.f2a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length == 3) {
            double d4 = ((double) red) / 255.0d;
            if (d4 < 0.04045d) {
                d2 = d4 / 12.92d;
            } else {
                d2 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) green) / 255.0d;
            if (d5 < 0.04045d) {
                pow = d5 / 12.92d;
            } else {
                pow = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) blue) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * d3) + (0.3576d * pow) + (0.4124d * d2)) * 100.0d;
            double d7 = ((0.0722d * d3) + (0.7152d * pow) + (0.2126d * d2)) * 100.0d;
            dArr[1] = d7;
            double d8 = d3 * 0.9505d;
            dArr[2] = (d8 + (pow * 0.1192d) + (d2 * 0.0193d)) * 100.0d;
            if (d7 / 100.0d > 0.5d) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static boolean n(String str, String str2) {
        if (!str.startsWith(str2.concat("(")) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    public static int o(int i2, int i3, float f) {
        return A.a.b(A.a.d(i3, Math.round(((float) Color.alpha(i3)) * f)), i2);
    }

    public static void p(LoginActivity loginActivity, String[] strArr, int i2) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (i3 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
                i3++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i4 = 0;
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr2[i4] = strArr[i5];
                        i4++;
                    }
                }
            } else {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            C0493a.b(loginActivity, strArr, i2);
        } else {
            new Handler(Looper.getMainLooper()).post(new X(strArr2, loginActivity, i2, 2));
        }
    }

    public static int q(Context context, int i2, int i3) {
        TypedValue h02 = A.i.h0(context, i2);
        if (h02 == null || h02.type != 16) {
            return i3;
        }
        return h02.data;
    }

    public static TimeInterpolator r(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!n(valueOf, "cubic-bezier") && !n(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (n(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return K.a.b(i(split, 0), i(split, 1), i(split, 2), i(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (n(valueOf, "path")) {
                return K.a.c(A.i.A(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }
}

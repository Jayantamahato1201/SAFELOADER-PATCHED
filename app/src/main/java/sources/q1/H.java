package q1;

import A.j;
import F0.c;
import H0.C;
import L0.d;
import M0.e;
import T0.p;
import U0.i;
import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final C f3885a = new Object();
    public static final int[] b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f3886c = new Class[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f3887d = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f3888e = new String[0];
    public static final String[] f = {"com.rekoo.pubgm", "com.pubg.krmobile", "com.vng.pubgmobile", "com.pubg.imobile", "com.tencent.ig"};

    /* renamed from: g  reason: collision with root package name */
    public static boolean f3889g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f3890h = {325967443, 325967270, -1046965711};

    /* renamed from: i  reason: collision with root package name */
    public static final C0376k1 f3891i = new C0376k1(16);

    /* renamed from: j  reason: collision with root package name */
    public static final C0376k1 f3892j = new C0376k1(25);

    /* renamed from: k  reason: collision with root package name */
    public static j f3893k = null;

    /* renamed from: l  reason: collision with root package name */
    public static d f3894l = null;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f3895m = false;

    /* renamed from: n  reason: collision with root package name */
    public static String f3896n = "";

    /* renamed from: o  reason: collision with root package name */
    public static String f3897o = "";

    /* renamed from: p  reason: collision with root package name */
    public static String f3898p = "";

    /* renamed from: q  reason: collision with root package name */
    public static String f3899q = "";

    /* renamed from: r  reason: collision with root package name */
    public static boolean f3900r;

    /* renamed from: s  reason: collision with root package name */
    public static int f3901s;

    public static int a(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static int b(String str, boolean z2) {
        ApplicationInfo applicationInfo;
        if (z2) {
            applicationInfo = K2.b.I0(0, str);
        } else {
            try {
                applicationInfo = C0394n1.f4143a.getPackageManager().getApplicationInfo(str, 512);
            } catch (Exception unused) {
                applicationInfo = null;
            }
        }
        if (applicationInfo != null) {
            return applicationInfo.uid;
        }
        return -1;
    }

    public static ActivityInfo c(String str) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str);
        K2 k2 = K2.b;
        k2.getClass();
        if (K2.f3929c.containsKey(str)) {
            List c2 = k2.c(intent, (String) null, 0);
            n(c2);
            resolveInfo = (ResolveInfo) e.B0(c2);
        } else {
            try {
                resolveInfo = C0394n1.f4143a.getPackageManager().resolveActivity(intent, 0);
            } catch (Exception unused) {
                resolveInfo = null;
            }
        }
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    public static final File d(File file, String... strArr) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            i2++;
            file = new File(file, strArr[i2]);
        }
        return file;
    }

    public static Object e(Parcel parcel) {
        Parcelable.Creator creator = Account.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object f(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object g(Object obj, L3 l3) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        C0436u2 u2Var = new C0436u2(2);
        m(cls, u2Var);
        return Proxy.newProxyInstance(classLoader, (Class[]) u2Var.toArray(f3886c), new C0370j1(obj, l3));
    }

    public static String h(String str) {
        int i2 = 0;
        char c2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '\'' || charAt == '\"') {
                if (c2 == 0) {
                    c2 = charAt;
                } else if (c2 == charAt) {
                    c2 = 0;
                }
            }
            if (c2 == 0) {
                if (charAt == '(') {
                    i2++;
                } else if (charAt == ')') {
                    i2--;
                }
            }
        }
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(Math.abs(i2) + str.length());
        sb.append(str);
        while (i2 > 0) {
            sb.append(')');
            i2--;
        }
        while (i2 < 0) {
            sb.insert(0, '(');
            i2++;
        }
        return sb.toString();
    }

    public static void i(int i2, Q2 q2) {
        try {
            d dVar = f3894l;
            f3894l = null;
            if (dVar != null) {
                Object obj = dVar.f589g;
                if (((Number) dVar.f).intValue() == i2) {
                    IBinder asBinder = ((C0318a3) obj).asBinder();
                    if (asBinder.isBinderAlive() && asBinder.pingBinder()) {
                        q2.f3968i = ((Number) dVar.f590h).intValue();
                        q2.f3967h = (C0318a3) obj;
                        d5.b.execute(new C0333d0(i2, q2));
                        return;
                    }
                }
            }
            d5.b.execute(new c(i2, q2));
        } catch (Exception unused) {
        }
    }

    public static void j(int i2, boolean z2, p pVar) {
        C0318a3 a3Var;
        try {
            Context context = C0394n1.f4143a;
            ContentResolver contentResolver = context.getContentResolver();
            String str = C0394n1.b;
            Uri parse = Uri.parse("content://" + (str + ".provider.stub" + i2));
            String valueOf = String.valueOf(i2);
            C0364i1.f4115a.getClass();
            Bundle bundle = C0364i1.b;
            bundle.putBoolean("mundo_base_bundle", K2.b.B0("com.google.android.gms"));
            Bundle call = contentResolver.call(parse, valueOf, (String) null, bundle);
            if (call == null) {
                pVar.d((Object) null, 0);
                return;
            }
            IBinder binder = call.getBinder("user_handler");
            int i3 = call.getInt("user_pid", 0);
            boolean z3 = call.getBoolean("mundo_am_service", false);
            if (binder != null) {
                int i4 = T2.f3993a;
                IInterface queryLocalInterface = binder.queryLocalInterface("top.bienvenido.mundo.IApplicationThread");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C0318a3)) {
                    a3Var = new N2(binder);
                } else {
                    a3Var = (C0318a3) queryLocalInterface;
                }
            } else {
                a3Var = null;
            }
            if (a3Var == null) {
                pVar.d((Object) null, Integer.valueOf(i3));
            } else if (!z3) {
                pVar.d(a3Var, Integer.valueOf(i3));
                context.startService(new Intent().setComponent(new ComponentName(str, MundoService$Companion$STUB.class.getName() + i2)));
            } else if (z2) {
                try {
                    a3Var.j0();
                } catch (Exception unused) {
                }
                j(i2, true, pVar);
            } else {
                pVar.d((Object) null, Integer.valueOf(i3));
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(android.os.Bundle r6) {
        /*
            r0 = 1
            r1 = 0
            java.util.ArrayList r2 = q1.C0398o.b     // Catch:{ Exception -> 0x0016 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x0016 }
            r4 = 0
        L_0x0009:
            if (r4 >= r3) goto L_0x0016
            java.lang.Object r5 = r2.get(r4)     // Catch:{ Exception -> 0x0016 }
            int r4 = r4 + r0
            T0.l r5 = (T0.l) r5     // Catch:{ Exception -> 0x0016 }
            r5.e(r6)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0009
        L_0x0016:
            java.lang.String r2 = "mundo_uid_binder"
            android.os.IBinder r2 = r6.getBinder(r2)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0040
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0040 }
            int r6 = r6.getInt(r3, r1)     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0040 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0040 }
            r3[r1] = r2     // Catch:{ all -> 0x0040 }
            r3[r0] = r6     // Catch:{ all -> 0x0040 }
            java.util.ArrayList r6 = q1.C0398o.b     // Catch:{ all -> 0x0040 }
            monitor-enter(r6)     // Catch:{ all -> 0x0040 }
            r0 = 1001(0x3e9, float:1.403E-42)
            top.bienvenido.mundo.common.initialize.MNative.a(r0, r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.H.k(android.os.Bundle):void");
    }

    public static void l(Parcel parcel, List list, int i2) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    public static void m(Class cls, C0436u2 u2Var) {
        Class[] interfaces = cls.getInterfaces();
        i.e("elements", interfaces);
        List asList = Arrays.asList(interfaces);
        i.d("asList(this)", asList);
        u2Var.addAll(asList);
        Class superclass = cls.getSuperclass();
        if (Object.class.equals(superclass)) {
            superclass = null;
        }
        if (superclass != null) {
            m(superclass, u2Var);
        }
    }

    public static final void n(List list) {
        C0442v2 v2Var = new C0442v2(new C(9));
        i.e("<this>", list);
        if (list.size() > 1) {
            Collections.sort(list, v2Var);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|8|9|10|(2:12|18)|21|22|23|24|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void o(q1.Q2 r6) {
        /*
            r0 = 0
            q1.a3 r1 = r6.f3967h     // Catch:{ Exception -> 0x0045 }
            if (r1 != 0) goto L_0x0010
            q1.C0360h3.c(r6)     // Catch:{ Exception -> 0x004f }
            r6.f3966g = r0     // Catch:{ Exception -> 0x004f }
            android.os.ConditionVariable r6 = r6.f3969j     // Catch:{ Exception -> 0x004f }
            r6.open()     // Catch:{ Exception -> 0x004f }
            return
        L_0x0010:
            k.f0 r2 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0045 }
            int r2 = r6.f3968i     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x0025
            k.f0 r3 = q1.C0360h3.b     // Catch:{ Exception -> 0x0025 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0025 }
            java.lang.Object r4 = r3.f3459a     // Catch:{ all -> 0x0022 }
            q1.q2 r4 = (q1.C0413q2) r4     // Catch:{ all -> 0x0022 }
            r4.b(r2, r6)     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0025 }
            throw r2     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            k.f0 r2 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0045 }
            android.os.IBinder r2 = r1.asBinder()     // Catch:{ Exception -> 0x0045 }
            q1.b r3 = new q1.b     // Catch:{ Exception -> 0x0045 }
            r4 = 1
            r3.<init>(r2, r6, r4)     // Catch:{ Exception -> 0x0045 }
            r2.linkToDeath(r3, r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r6.f3962a     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = r6.b     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = r6.f3963c     // Catch:{ Exception -> 0x0045 }
            boolean r5 = r6.f3964d     // Catch:{ Exception -> 0x0045 }
            r1.r(r2, r3, r4, r5)     // Catch:{ Exception -> 0x0045 }
            android.os.ConditionVariable r1 = r6.f3969j     // Catch:{ Exception -> 0x0045 }
            r1.open()     // Catch:{ Exception -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            q1.C0360h3.c(r6)     // Catch:{ Exception -> 0x004f }
            r6.f3966g = r0     // Catch:{ Exception -> 0x004f }
            android.os.ConditionVariable r6 = r6.f3969j     // Catch:{ Exception -> 0x004f }
            r6.open()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.H.o(q1.Q2):void");
    }

    public static boolean p() {
        try {
            Object a2 = MNative.a(49845, (Serializable) null);
            if (a2 == null) {
                return false;
            }
            return Boolean.parseBoolean(a2.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean q(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    public static boolean r(int i2, String str) {
        String str2;
        if (i2 > 2) {
            return false;
        }
        try {
            if (str.length() == 0) {
                return false;
            }
            int i3 = MNative.f4717a;
            C0351g0 g0Var = X1.f4033a;
            Object a2 = X1.a(C0394n1.f4143a);
            if (a2 instanceof Proxy) {
                str2 = "";
            } else if (a2 == null) {
                return true;
            } else {
                str2 = str;
            }
            MNative.a(49844, str2);
            if (!p()) {
                return r(i2 + 1, str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int[] s(int[] iArr, int i2, int i3, int i4) {
        if (i2 + 1 <= iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i2 - i3);
            iArr[i3] = i4;
            return iArr;
        }
        int i5 = 4;
        if (i2 >= 4) {
            i5 = i2 * 2;
        }
        int[] iArr2 = new int[i5];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        iArr2[i3] = i4;
        System.arraycopy(iArr, i3, iArr2, i3 + 1, iArr.length - i3);
        return iArr2;
    }
}

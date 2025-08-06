package q1;

import A.g;
import android.content.AttributionSourceState;
import android.os.Binder;

/* renamed from: q1.p3  reason: case insensitive filesystem */
public final class C0408p3 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final C0408p3 f4165d = new C0376k1(3);

    /* renamed from: e  reason: collision with root package name */
    public static final int f4166e;
    public static final String f = g.h(C0394n1.b, ".service.provider");

    /* renamed from: g  reason: collision with root package name */
    public static final C0 f4167g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0351g0 f4168h = new C0351g0("provider");

    /* renamed from: i  reason: collision with root package name */
    public static final C0351g0 f4169i = new C0351g0("info");

    /* renamed from: j  reason: collision with root package name */
    public static final C0351g0 f4170j = new C0351g0("mLocal");

    /* renamed from: k  reason: collision with root package name */
    public static final L3 f4171k;

    /* JADX WARNING: type inference failed for: r3v0, types: [q1.k1, q1.p3] */
    /* JADX WARNING: type inference failed for: r0v2, types: [q1.l0] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, T0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            r1 = 1
            q1.C0 r2 = q1.C0.f3864a
            q1.p3 r3 = new q1.p3
            r4 = 3
            r3.<init>(r4)
            f4165d = r3
            boolean r3 = q1.T4.f4001g
            if (r3 == 0) goto L_0x0012
            r3 = 2
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            f4166e = r3
            java.lang.String r3 = q1.C0394n1.b
            java.lang.String r4 = ".service.provider"
            java.lang.String r3 = A.g.h(r3, r4)
            f = r3
            java.lang.String r3 = "android.content.ContentProviderNative"
            java.lang.String r4 = "asInterface"
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r0] = r6
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x003a }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x003a }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x003a }
            q1.g0 r4 = new q1.g0     // Catch:{ Exception -> 0x003a }
            r4.<init>(r3, r1)     // Catch:{ Exception -> 0x003a }
            r2 = r4
        L_0x003a:
            f4167g = r2
            boolean r1 = q1.T4.f4003i     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x004c
            java.lang.Class<android.content.AttributionSourceState> r1 = android.content.AttributionSourceState.class
            android.os.Parcelable$Creator r2 = android.content.AttributionSourceState.CREATOR     // Catch:{ all -> 0x004c }
            q1.k3 r3 = new q1.k3     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            q1.E.a(r1, r2, r3)     // Catch:{ all -> 0x004c }
        L_0x004c:
            q1.g0 r1 = new q1.g0
            java.lang.String r2 = "provider"
            r1.<init>(r2)
            f4168h = r1
            q1.g0 r1 = new q1.g0
            java.lang.String r2 = "info"
            r1.<init>(r2)
            f4169i = r1
            q1.g0 r1 = new q1.g0
            java.lang.String r2 = "mLocal"
            r1.<init>(r2)
            f4170j = r1
            q1.L3 r1 = q1.C0458y0.f4242a
            q1.e3 r1 = new q1.e3
            r1.<init>(r0)
            boolean r0 = q1.T4.f4003i
            if (r0 == 0) goto L_0x0078
            q1.l0 r0 = new q1.l0
            r0.<init>(r1)
            r1 = r0
        L_0x0078:
            f4171k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0408p3.<clinit>():void");
    }

    public static Object d(Object obj) {
        C0412q1 q1Var = new C0412q1(obj, f4171k);
        try {
            if (T4.f4002h) {
                q1Var.f4174a.b(107944136, new C0376k1(4));
            }
        } catch (Exception unused) {
        }
        return q1Var.f4176d;
    }

    public static final void e(AttributionSourceState attributionSourceState) {
        try {
            attributionSourceState.uid = Binder.getCallingUid();
            if (T4.f4004j) {
                attributionSourceState.pid = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5 = q1.C0394n1.f4143a;
        r5.startService(new android.content.Intent(r5, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r13, java.lang.reflect.Method r14, java.lang.Object[] r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            q1.g0 r2 = f4168h
            r3 = 0
            boolean r4 = q1.H.f3895m     // Catch:{ Exception -> 0x0088 }
            if (r4 != 0) goto L_0x000e
            java.lang.Object r13 = super.a(r13, r14, r15)     // Catch:{ Exception -> 0x0088 }
            return r13
        L_0x000e:
            int r4 = f4166e     // Catch:{ Exception -> 0x0088 }
            r5 = r15[r4]     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x00b7
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x0088 }
            if (r7 != 0) goto L_0x001c
            goto L_0x00b7
        L_0x001c:
            java.lang.String r5 = f     // Catch:{ Exception -> 0x0088 }
            boolean r5 = r7.equals(r5)     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x0029
            java.lang.Object r13 = super.a(r13, r14, r15)     // Catch:{ Exception -> 0x0088 }
            return r13
        L_0x0029:
            android.content.pm.ProviderInfo[] r9 = new android.content.pm.ProviderInfo[r1]     // Catch:{ Exception -> 0x0088 }
            r5 = 2
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0088 }
            q1.T3 r5 = q1.T3.f3994c     // Catch:{ Exception -> 0x0088 }
            r5.getClass()     // Catch:{ Exception -> 0x0088 }
            android.os.IInterface r5 = r5.b()     // Catch:{ Exception -> 0x0043 }
            r6 = r5
            q1.b4 r6 = (q1.C0325b4) r6     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = q1.H.f3898p     // Catch:{ Exception -> 0x0043 }
            int r11 = q1.H.f3901s     // Catch:{ Exception -> 0x0043 }
            android.os.IBinder r5 = r6.C0(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0050
        L_0x0043:
            android.content.Context r5 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x004f }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x004f }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r7 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r6.<init>(r5, r7)     // Catch:{ Exception -> 0x004f }
            r5.startService(r6)     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            r5 = r3
        L_0x0050:
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x0088 }
            q1.g0 r6 = f4169i
            if (r5 == 0) goto L_0x008b
            r7 = r10[r0]     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x00bc
            q1.C0 r8 = f4167g     // Catch:{ Exception -> 0x0088 }
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0088 }
            r9[r0] = r5     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r0 = r8.b(r3, r9)     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x00bc
            q1.p3 r5 = f4165d     // Catch:{ Exception -> 0x0088 }
            r15[r4] = r7     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r4 = super.a(r13, r14, r15)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r5 = r2.f4098c     // Catch:{ Exception -> 0x0088 }
            q1.C0 r5 = (q1.C0) r5     // Catch:{ Exception -> 0x0088 }
            r5.c(r4, r0)     // Catch:{ Exception -> 0x0088 }
            r0 = r10[r1]     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r1 = r6.f4098c     // Catch:{ Exception -> 0x0088 }
            q1.C0 r1 = (q1.C0) r1     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r1 = r1.a(r4)     // Catch:{ Exception -> 0x0088 }
            android.content.pm.ProviderInfo r1 = (android.content.pm.ProviderInfo) r1     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x008a
            r1.authority = r0     // Catch:{ Exception -> 0x0088 }
            return r4
        L_0x0088:
            goto L_0x00bc
        L_0x008a:
            return r4
        L_0x008b:
            r0 = r9[r0]     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x00bc
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0088 }
            java.lang.Class r4 = r14.getReturnType()     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r1 = r1.allocateInstance(r4)     // Catch:{ Exception -> 0x0088 }
            q1.v4 r4 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x0088 }
            android.content.pm.ApplicationInfo r4 = r0.applicationInfo     // Catch:{ Exception -> 0x0088 }
            q1.C0444v4.b(r4)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r4 = r6.f4098c     // Catch:{ Exception -> 0x0088 }
            q1.C0 r4 = (q1.C0) r4     // Catch:{ Exception -> 0x0088 }
            r4.c(r1, r0)     // Catch:{ Exception -> 0x0088 }
            boolean r0 = q1.T4.f4003i     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x00b6
            q1.g0 r0 = f4170j     // Catch:{ Exception -> 0x0088 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r0 = r0.f4098c     // Catch:{ Exception -> 0x0088 }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ Exception -> 0x0088 }
            r0.c(r1, r4)     // Catch:{ Exception -> 0x0088 }
        L_0x00b6:
            return r1
        L_0x00b7:
            java.lang.Object r13 = super.a(r13, r14, r15)     // Catch:{ Exception -> 0x0088 }
            return r13
        L_0x00bc:
            java.lang.Object r13 = super.a(r13, r14, r15)
            if (r13 == 0) goto L_0x00d9
            java.lang.Object r14 = r2.f4098c     // Catch:{ Exception -> 0x00d8 }
            q1.C0 r14 = (q1.C0) r14     // Catch:{ Exception -> 0x00d8 }
            java.lang.Object r14 = r14.a(r13)     // Catch:{ Exception -> 0x00d8 }
            if (r14 != 0) goto L_0x00cd
            goto L_0x00d8
        L_0x00cd:
            java.lang.Object r14 = d(r14)     // Catch:{ Exception -> 0x00d8 }
            java.lang.Object r15 = r2.f4098c     // Catch:{ Exception -> 0x00d8 }
            q1.C0 r15 = (q1.C0) r15     // Catch:{ Exception -> 0x00d8 }
            r15.c(r13, r14)     // Catch:{ Exception -> 0x00d8 }
        L_0x00d8:
            r3 = r13
        L_0x00d9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0408p3.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}

package q1;

/* renamed from: q1.s1  reason: case insensitive filesystem */
public final class C0423s1 extends V4 {
    public static final C0423s1 b = new V4();

    /* renamed from: c  reason: collision with root package name */
    public static final C0351g0 f4182c = new C0351g0("mAllFields");

    /* renamed from: d  reason: collision with root package name */
    public static final C0351g0 f4183d = new C0351g0("mReadableFieldsWithMaxTargetSdk");

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = q1.C0.f3864a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ Exception -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[Catch:{ Exception -> 0x005f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.lang.Class r2) {
        /*
            java.lang.String r0 = "sNameValueCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0033 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x0033 }
            int r0 = r2.getModifiers()     // Catch:{ Exception -> 0x0033 }
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch:{ Exception -> 0x0033 }
            if (r0 != 0) goto L_0x002b
            java.lang.Class r0 = r2.getType()     // Catch:{ Exception -> 0x0033 }
            boolean r0 = r0.isPrimitive()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x001f
            goto L_0x002b
        L_0x001f:
            sun.misc.Unsafe r0 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0033 }
            long r0 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0033 }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x0033 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0035
        L_0x002b:
            q1.g0 r0 = new q1.g0     // Catch:{ Exception -> 0x0033 }
            r1 = 2
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0033 }
            r2 = r0
            goto L_0x0035
        L_0x0033:
            q1.C0 r2 = q1.C0.f3864a     // Catch:{ Exception -> 0x005f }
        L_0x0035:
            r0 = 0
            java.lang.Object r2 = r2.a(r0)     // Catch:{ Exception -> 0x005f }
            if (r2 != 0) goto L_0x003d
            goto L_0x005f
        L_0x003d:
            q1.g0 r0 = f4182c     // Catch:{ Exception -> 0x005f }
            java.lang.Object r0 = r0.f4098c     // Catch:{ Exception -> 0x005f }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ Exception -> 0x005f }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ Exception -> 0x005f }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x004e
            r0.clear()     // Catch:{ Exception -> 0x005f }
        L_0x004e:
            q1.g0 r0 = f4183d     // Catch:{ Exception -> 0x005f }
            java.lang.Object r0 = r0.f4098c     // Catch:{ Exception -> 0x005f }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ Exception -> 0x005f }
            java.lang.Object r2 = r0.a(r2)     // Catch:{ Exception -> 0x005f }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x005f }
            if (r2 == 0) goto L_0x005f
            r2.clear()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0423s1.d(java.lang.Class):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|(1:83)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a A[Catch:{ Exception -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136 A[Catch:{ Exception -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00be A[EDGE_INSN: B:83:0x00be->B:29:0x00be ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0084=Splitter:B:18:0x0084, B:26:0x00b8=Splitter:B:26:0x00b8, B:37:0x00db=Splitter:B:37:0x00db} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r0 = 3
            r1 = 2
            java.lang.String r2 = "$Config"
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 4
            r3.<init>(r4)
            android.content.Context r4 = q1.C0394n1.f4143a
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "debug_app"
            r6 = 0
            android.provider.Settings.Global.getInt(r4, r5, r6)
            java.lang.Class<android.provider.Settings$Global> r5 = android.provider.Settings.Global.class
            r3.add(r5)
            java.lang.String r5 = "font_scale"
            android.provider.Settings.System.getInt(r4, r5, r6)
            java.lang.Class<android.provider.Settings$System> r5 = android.provider.Settings.System.class
            r3.add(r5)
            java.lang.String r5 = "accessibility_enabled"
            android.provider.Settings.Secure.getInt(r4, r5, r6)
            java.lang.Class<android.provider.Settings$Secure> r5 = android.provider.Settings.Secure.class
            r3.add(r5)
            boolean r5 = q1.T4.f4001g
            q1.C0 r7 = q1.C0.f3864a
            java.lang.String r8 = "sNameValueCache"
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x00e4
            java.lang.Class<android.provider.Settings> r5 = android.provider.Settings.class
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r5.concat(r2)     // Catch:{ Exception -> 0x00e4 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x00e4 }
            r3.add(r2)     // Catch:{ Exception -> 0x00e4 }
            boolean r5 = q1.T4.f4005k     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r11 = "mimi"
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Class<android.content.ContentResolver> r13 = android.content.ContentResolver.class
            if (r5 == 0) goto L_0x00c5
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ Exception -> 0x0083 }
            r2.setAccessible(r10)     // Catch:{ Exception -> 0x0083 }
            int r5 = r2.getModifiers()     // Catch:{ Exception -> 0x0083 }
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch:{ Exception -> 0x0083 }
            if (r5 != 0) goto L_0x007c
            java.lang.Class r5 = r2.getType()     // Catch:{ Exception -> 0x0083 }
            boolean r5 = r5.isPrimitive()     // Catch:{ Exception -> 0x0083 }
            if (r5 == 0) goto L_0x0070
            goto L_0x007c
        L_0x0070:
            sun.misc.Unsafe r5 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0083 }
            long r14 = r5.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0083 }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x0083 }
            r2.<init>(r14)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0084
        L_0x007c:
            q1.g0 r5 = new q1.g0     // Catch:{ Exception -> 0x0083 }
            r5.<init>(r2, r1)     // Catch:{ Exception -> 0x0083 }
            r2 = r5
            goto L_0x0084
        L_0x0083:
            r2 = r7
        L_0x0084:
            java.lang.Object r2 = r2.a(r9)     // Catch:{ Exception -> 0x00e4 }
            if (r2 == 0) goto L_0x00e4
            java.lang.String r5 = "getStringForUser"
            java.lang.Class[] r14 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00e4 }
            r14[r6] = r13     // Catch:{ Exception -> 0x00e4 }
            r14[r10] = r12     // Catch:{ Exception -> 0x00e4 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00e4 }
            r14[r1] = r12     // Catch:{ Exception -> 0x00e4 }
            int r12 = q1.C0394n1.f4145d     // Catch:{ Exception -> 0x00e4 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x00e4 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00e4 }
            r0[r6] = r4     // Catch:{ Exception -> 0x00e4 }
            r0[r10] = r11     // Catch:{ Exception -> 0x00e4 }
            r0[r1] = r12     // Catch:{ Exception -> 0x00e4 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ Exception -> 0x00e4 }
        L_0x00a8:
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            boolean r11 = r4.equals(r11)     // Catch:{ Exception -> 0x00e4 }
            if (r11 != 0) goto L_0x00be
            java.lang.reflect.Method r11 = r4.getDeclaredMethod(r5, r14)     // Catch:{ Exception -> 0x00b8 }
            r11.setAccessible(r10)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00bf
        L_0x00b8:
            java.lang.Class r4 = r4.getSuperclass()     // Catch:{ Exception -> 0x00e4 }
            if (r4 != 0) goto L_0x00a8
        L_0x00be:
            r11 = r9
        L_0x00bf:
            if (r11 == 0) goto L_0x00e4
            r11.invoke(r2, r0)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00e4
        L_0x00c5:
            java.lang.String r0 = "getString"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00e4 }
            r5[r6] = r13     // Catch:{ Exception -> 0x00e4 }
            r5[r10] = r12     // Catch:{ Exception -> 0x00e4 }
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r5)     // Catch:{ Exception -> 0x00da }
            r0.setAccessible(r10)     // Catch:{ Exception -> 0x00da }
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x00da }
            r2.<init>(r0, r10)     // Catch:{ Exception -> 0x00da }
            goto L_0x00db
        L_0x00da:
            r2 = r7
        L_0x00db:
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00e4 }
            r0[r6] = r4     // Catch:{ Exception -> 0x00e4 }
            r0[r10] = r11     // Catch:{ Exception -> 0x00e4 }
            r2.b(r9, r0)     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            q1.g0 r0 = new q1.g0
            java.lang.String r2 = "mContentProvider"
            r0.<init>(r2)
            int r2 = r3.size()
            r4 = 0
        L_0x00f0:
            if (r4 >= r2) goto L_0x015d
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + r10
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r11 = q1.T4.f4000e     // Catch:{ Exception -> 0x015b }
            if (r11 == 0) goto L_0x0100
            java.lang.String r11 = "sProviderHolder"
            goto L_0x0101
        L_0x0100:
            r11 = r8
        L_0x0101:
            java.lang.reflect.Field r11 = r5.getDeclaredField(r11)     // Catch:{ Exception -> 0x012f }
            r11.setAccessible(r10)     // Catch:{ Exception -> 0x012f }
            int r12 = r11.getModifiers()     // Catch:{ Exception -> 0x012f }
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)     // Catch:{ Exception -> 0x012f }
            if (r12 != 0) goto L_0x0129
            java.lang.Class r12 = r11.getType()     // Catch:{ Exception -> 0x012f }
            boolean r12 = r12.isPrimitive()     // Catch:{ Exception -> 0x012f }
            if (r12 == 0) goto L_0x011d
            goto L_0x0129
        L_0x011d:
            sun.misc.Unsafe r12 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x012f }
            long r11 = r12.objectFieldOffset(r11)     // Catch:{ Exception -> 0x012f }
            q1.t0 r13 = new q1.t0     // Catch:{ Exception -> 0x012f }
            r13.<init>(r11)     // Catch:{ Exception -> 0x012f }
            goto L_0x0130
        L_0x0129:
            q1.g0 r13 = new q1.g0     // Catch:{ Exception -> 0x012f }
            r13.<init>(r11, r1)     // Catch:{ Exception -> 0x012f }
            goto L_0x0130
        L_0x012f:
            r13 = r7
        L_0x0130:
            java.lang.Object r11 = r13.a(r9)     // Catch:{ Exception -> 0x015b }
            if (r11 == 0) goto L_0x00f0
            boolean r12 = q1.T4.f4003i     // Catch:{ Exception -> 0x015b }
            if (r12 == 0) goto L_0x0142
            q1.s1 r12 = b     // Catch:{ Exception -> 0x015b }
            r12.getClass()     // Catch:{ Exception -> 0x015b }
            d(r5)     // Catch:{ Exception -> 0x015b }
        L_0x0142:
            q1.p3 r5 = q1.C0408p3.f4165d     // Catch:{ Exception -> 0x015b }
            java.lang.Object r5 = r0.f4098c     // Catch:{ Exception -> 0x015b }
            q1.C0 r5 = (q1.C0) r5     // Catch:{ Exception -> 0x015b }
            java.lang.Object r5 = r5.a(r11)     // Catch:{ Exception -> 0x015b }
            if (r5 != 0) goto L_0x014f
            goto L_0x00f0
        L_0x014f:
            java.lang.Object r5 = q1.C0408p3.d(r5)     // Catch:{ Exception -> 0x015b }
            java.lang.Object r12 = r0.f4098c     // Catch:{ Exception -> 0x015b }
            q1.C0 r12 = (q1.C0) r12     // Catch:{ Exception -> 0x015b }
            r12.c(r11, r5)     // Catch:{ Exception -> 0x015b }
            goto L_0x00f0
        L_0x015b:
            goto L_0x00f0
        L_0x015d:
            q1.u r0 = q1.C0433u.b
            java.util.Map r2 = q1.C0433u.f4214z
            r0.getClass()
            java.lang.reflect.Constructor r0 = q1.C0433u.f4213y
            int r3 = q1.C0394n1.f4145d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "settings"
            r4[r6] = r5
            r4[r10] = r3
            java.lang.Object r0 = r0.newInstance(r4)
            r2.remove(r0)
            java.lang.Class<android.app.ActivityThread> r0 = android.app.ActivityThread.class
            java.lang.String r2 = "mProviderRefCountMap"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x01ae }
            r0.setAccessible(r10)     // Catch:{ Exception -> 0x01ae }
            int r2 = r0.getModifiers()     // Catch:{ Exception -> 0x01ae }
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch:{ Exception -> 0x01ae }
            if (r2 != 0) goto L_0x01a8
            java.lang.Class r2 = r0.getType()     // Catch:{ Exception -> 0x01ae }
            boolean r2 = r2.isPrimitive()     // Catch:{ Exception -> 0x01ae }
            if (r2 == 0) goto L_0x019b
            goto L_0x01a8
        L_0x019b:
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x01ae }
            long r0 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x01ae }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x01ae }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01ae }
        L_0x01a6:
            r7 = r2
            goto L_0x01ae
        L_0x01a8:
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x01ae }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x01ae }
            goto L_0x01a6
        L_0x01ae:
            android.app.ActivityThread r0 = q1.C0433u.f4192c
            java.lang.Object r0 = r7.a(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0423s1.b():void");
    }
}

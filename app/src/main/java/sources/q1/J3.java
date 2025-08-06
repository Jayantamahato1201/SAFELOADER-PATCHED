package q1;

public abstract class J3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3923a;
    public static final C0 b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0 f3924c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0 f3925d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0 f3926e;

    static {
        C0 c02;
        C0 c03;
        Class<?> cls = Class.forName("dalvik.system.VMRuntime");
        Class[] clsArr = H.f3886c;
        f3923a = C0452x0.b(cls, "getRuntime", clsArr).b((Object) null, new Object[0]);
        boolean z2 = T4.f;
        C0 c04 = C0.f3864a;
        Class<String> cls2 = String.class;
        if (z2) {
            c02 = C0452x0.b(cls, "setProcessPackageName", new Class[]{cls2});
        } else {
            c02 = c04;
        }
        b = c02;
        f3924c = C0452x0.b(cls, "setTargetSdkVersion", new Class[]{Integer.TYPE});
        if (T4.f4001g) {
            c03 = C0452x0.b(cls, "setProcessDataDirectory", new Class[]{cls2});
        } else {
            c03 = c04;
        }
        f3925d = c03;
        if (!T4.b) {
            c04 = C0452x0.b(cls, "is64Bit", clsArr);
        }
        f3926e = c04;
    }
}

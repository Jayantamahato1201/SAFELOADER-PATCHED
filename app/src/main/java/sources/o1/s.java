package o1;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static r f3768a;
    public static long b;

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3769c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static void a(r rVar) {
        if (rVar.f != null || rVar.f3767g != null) {
            throw new IllegalArgumentException();
        } else if (!rVar.f3765d) {
            synchronized (s.class) {
                try {
                    long j2 = b + 8192;
                    if (j2 <= 65536) {
                        b = j2;
                        rVar.f = f3768a;
                        rVar.f3764c = 0;
                        rVar.b = 0;
                        f3768a = rVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static r b() {
        synchronized (s.class) {
            try {
                r rVar = f3768a;
                if (rVar == null) {
                    return new r();
                }
                f3768a = rVar.f;
                rVar.f = null;
                b -= 8192;
                return rVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}

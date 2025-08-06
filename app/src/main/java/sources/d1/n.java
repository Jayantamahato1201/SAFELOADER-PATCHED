package d1;

import java.io.Serializable;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2337a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2338c;

    /* renamed from: d  reason: collision with root package name */
    public Serializable f2339d;

    public n(boolean z2) {
        this.f2337a = z2;
    }

    public void a(String... strArr) {
        if (!this.f2337a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f2338c = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }

    public void b(K... kArr) {
        if (this.f2337a) {
            String[] strArr = new String[kArr.length];
            for (int i2 = 0; i2 < kArr.length; i2++) {
                strArr[i2] = kArr[i2].f;
            }
            c(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String[], java.io.Serializable] */
    public void c(String... strArr) {
        if (!this.f2337a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f2339d = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String[], java.io.Serializable] */
    public n(o oVar) {
        this.f2337a = oVar.f2341a;
        this.f2338c = oVar.f2342c;
        this.f2339d = oVar.f2343d;
        this.b = oVar.b;
    }
}

package q1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: q1.q1  reason: case insensitive filesystem */
public final class C0412q1 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final C0413q2 f4174a = new C0413q2(0);
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final L3 f4175c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4176d;

    public C0412q1(Object obj, L3 l3) {
        this.f4175c = l3;
        this.b = obj;
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        C0436u2 u2Var = new C0436u2(2);
        H.m(cls, u2Var);
        this.f4176d = Proxy.newProxyInstance(classLoader, (Class[]) u2Var.toArray(H.f3886c), this);
    }

    public final void a(int[] iArr, L3 l3) {
        for (int b2 : iArr) {
            this.f4174a.b(b2, l3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) {
        /*
            r1 = this;
            java.lang.String r2 = r3.getName()     // Catch:{ InvocationTargetException -> 0x0015 }
            q1.q2 r0 = r1.f4174a     // Catch:{ InvocationTargetException -> 0x0015 }
            int r2 = r2.hashCode()     // Catch:{ InvocationTargetException -> 0x0015 }
            java.lang.Object r2 = r0.a(r2)     // Catch:{ InvocationTargetException -> 0x0015 }
            q1.L3 r2 = (q1.L3) r2     // Catch:{ InvocationTargetException -> 0x0015 }
            if (r2 != 0) goto L_0x0017
            q1.L3 r2 = r1.f4175c     // Catch:{ InvocationTargetException -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r2 = move-exception
            goto L_0x0022
        L_0x0017:
            java.lang.Object r0 = r1.b     // Catch:{ InvocationTargetException -> 0x0015 }
            if (r4 != 0) goto L_0x001d
            java.lang.Object[] r4 = q1.H.f3887d     // Catch:{ InvocationTargetException -> 0x0015 }
        L_0x001d:
            java.lang.Object r2 = r2.a(r0, r3, r4)     // Catch:{ InvocationTargetException -> 0x0015 }
            return r2
        L_0x0022:
            java.lang.Throwable r3 = r2.getCause()
            if (r3 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0412q1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}

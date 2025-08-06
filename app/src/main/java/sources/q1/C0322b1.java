package q1;

import U0.i;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.Callable;

/* renamed from: q1.b1  reason: case insensitive filesystem */
public final class C0322b1 implements Callable, Comparable {
    public GenericDeclaration f;

    public final Object call() {
        return this.f;
    }

    public final int compareTo(Object obj) {
        try {
            if (obj instanceof Class) {
                this.f = (GenericDeclaration) obj;
                return 1;
            }
            if (obj instanceof String) {
                Method[] declaredMethods = ((Class) this.f).getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (i2 < length) {
                    Method method = declaredMethods[i2];
                    if (!i.a(method.getName(), obj) || !Modifier.isNative(method.getModifiers())) {
                        i2++;
                    } else {
                        this.f = method;
                        return 1;
                    }
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }
}

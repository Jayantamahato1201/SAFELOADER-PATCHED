package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C0061c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0061c f1427c = new C0061c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1428a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, C0060b bVar, C0070l lVar, Class cls) {
        C0070l lVar2 = (C0070l) hashMap.get(bVar);
        if (lVar2 != null && lVar != lVar2) {
            Method method = bVar.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
        } else if (lVar2 == null) {
            hashMap.put(bVar, lVar);
        }
    }

    public final C0059a a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1428a;
        if (superclass != null) {
            C0059a aVar = (C0059a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, (Method[]) null);
            }
            hashMap.putAll(aVar.b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C0059a aVar2 = (C0059a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : aVar2.b.entrySet()) {
                b(hashMap, (C0060b) entry.getKey(), (C0070l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (r.class.isAssignableFrom(parameterTypes[0])) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0070l value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!C0070l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0070l.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0060b(i2, method), value, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0059a aVar3 = new C0059a(hashMap);
        hashMap2.put(cls, aVar3);
        this.b.put(cls, Boolean.valueOf(z2));
        return aVar3;
    }
}

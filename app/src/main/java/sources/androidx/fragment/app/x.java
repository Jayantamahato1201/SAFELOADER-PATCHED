package androidx.fragment.app;

import A.g;
import java.lang.reflect.InvocationTargetException;
import n.k;

public final class x {
    public static final k b = new k();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f1400a;

    public x(D d2) {
        this.f1400a = d2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        k kVar = b;
        k kVar2 = (k) kVar.getOrDefault(classLoader, (Object) null);
        if (kVar2 == null) {
            kVar2 = new k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, (Object) null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        } catch (ClassCastException e3) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        }
    }

    public final C0058o a(String str) {
        try {
            return (C0058o) c(this.f1400a.f1210n.f1385m.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e2) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(g.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}

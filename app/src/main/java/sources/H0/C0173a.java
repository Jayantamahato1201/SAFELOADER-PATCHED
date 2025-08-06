package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0289b;

/* renamed from: h0.a  reason: case insensitive filesystem */
public abstract class C0173a {

    /* renamed from: a  reason: collision with root package name */
    public final C0289b f2899a;
    public final C0289b b;

    /* renamed from: c  reason: collision with root package name */
    public final C0289b f2900c;

    public C0173a(C0289b bVar, C0289b bVar2, C0289b bVar3) {
        this.f2899a = bVar;
        this.b = bVar2;
        this.f2900c = bVar3;
    }

    public abstract C0174b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0289b bVar = this.f2900c;
        Class cls2 = (Class) bVar.getOrDefault(name, (Object) null);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0289b bVar = this.f2899a;
        Method method = (Method) bVar.getOrDefault(str, (Object) null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<C0173a> cls = C0173a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0289b bVar = this.b;
        Method method = (Method) bVar.getOrDefault(name, (Object) null);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, C0173a.class});
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((C0174b) this).f2902e.readParcelable(C0174b.class.getClassLoader());
    }

    public final C0175c g() {
        String readString = ((C0174b) this).f2902e.readString();
        if (readString == null) {
            return null;
        }
        C0174b a2 = a();
        try {
            return (C0175c) c(readString).invoke((Object) null, new Object[]{a2});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public abstract void h(int i2);

    public final void i(C0175c cVar) {
        if (cVar == null) {
            ((C0174b) this).f2902e.writeString((String) null);
            return;
        }
        try {
            ((C0174b) this).f2902e.writeString(b(cVar.getClass()).getName());
            C0174b a2 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a2});
                int i2 = a2.f2905i;
                if (i2 >= 0) {
                    int i3 = a2.f2901d.get(i2);
                    Parcel parcel = a2.f2902e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e3.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}

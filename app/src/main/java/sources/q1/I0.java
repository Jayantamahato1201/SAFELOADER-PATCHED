package q1;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Class;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Executable;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$InvokeStub;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$MethodHandle;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$NeverCall;

public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f3906a;
    public final long b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3907c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3908d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3909e;

    public I0(Class cls) {
        Unsafe unsafe = C0455x3.f4236a;
        this.f3906a = unsafe.objectFieldOffset(MundoReflectionStub$Executable.class.getDeclaredField("artMethod"));
        long objectFieldOffset = unsafe.objectFieldOffset(MundoReflectionStub$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
        MethodHandles.Lookup n2 = MethodHandles.lookup();
        Class[] clsArr = H.f3886c;
        Class<MundoReflectionStub$NeverCall> cls2 = MundoReflectionStub$NeverCall.class;
        Method declaredMethod = cls2.getDeclaredMethod("a", clsArr);
        declaredMethod.setAccessible(true);
        long j2 = unsafe.getLong(n2.unreflect(declaredMethod), objectFieldOffset);
        MethodHandles.Lookup n3 = MethodHandles.lookup();
        Method declaredMethod2 = cls2.getDeclaredMethod("b", clsArr);
        declaredMethod2.setAccessible(true);
        long j3 = unsafe.getLong(n3.unreflect(declaredMethod2), objectFieldOffset) - j2;
        this.b = j3;
        Method declaredMethod3 = MundoReflectionStub$InvokeStub.class.getDeclaredMethod("invoke", new Class[]{Object[].class});
        declaredMethod3.setAccessible(true);
        this.f3908d = declaredMethod3;
        long objectFieldOffset2 = unsafe.objectFieldOffset(MundoReflectionStub$Class.class.getDeclaredField("methods"));
        long j4 = unsafe.getLong(cls, objectFieldOffset2);
        this.f3907c = unsafe.getInt(j4);
        this.f3909e = ((j2 - unsafe.getLong(cls2, objectFieldOffset2)) - j3) + j4;
    }

    public final Object a(Object obj, String str, Object[] objArr) {
        for (int i2 = 0; i2 < this.f3907c; i2++) {
            C0455x3.f4236a.putLong(this.f3908d, this.f3906a, (((long) i2) * this.b) + this.f3909e);
            Method method = this.f3908d;
            if (str.equals(method.getName())) {
                return method.invoke(obj, objArr);
            }
        }
        return null;
    }
}

package U0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f771a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void c(String str, Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(String str, Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<i> cls = i.class;
            String name = cls.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f(nullPointerException, cls.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final Object[] g(Collection collection) {
        int size = collection.size();
        Object[] objArr = f771a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                        d("copyOf(result, newSize)", objArr2);
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i3);
                        d("copyOf(result, size)", copyOf);
                        return copyOf;
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    public static final Object[] h(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", newInstance);
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                        d("copyOf(result, newSize)", objArr2);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i3);
                        d("copyOf(result, size)", copyOf);
                        return copyOf;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}

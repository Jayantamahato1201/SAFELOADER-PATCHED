package l1;

import e1.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class f implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3647a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public String f3648c;

    public f(ArrayList arrayList) {
        this.f3647a = arrayList;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = c.b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (!name.equals("unsupported") || Void.TYPE != returnType) {
            boolean equals = name.equals("protocols");
            ArrayList arrayList = this.f3647a;
            if (equals && objArr.length == 0) {
                return arrayList;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (arrayList.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.f3648c = str;
                            return str;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f3648c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f3648c = (String) objArr[0];
            return null;
        }
        this.b = true;
        return null;
    }
}

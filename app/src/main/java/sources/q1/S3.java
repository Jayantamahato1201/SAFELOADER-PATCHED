package q1;

import L0.b;
import T0.l;
import U0.i;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class S3 extends C0376k1 {

    /* renamed from: c  reason: collision with root package name */
    public static final C0413q2 f3989c;

    static {
        b bVar = new b(Integer.valueOf(CharSequence.class.hashCode()), "0");
        b bVar2 = new b(Integer.valueOf(String.class.hashCode()), "0");
        b bVar3 = new b(Integer.valueOf(Long.TYPE.hashCode()), 0L);
        b bVar4 = new b(Integer.valueOf(Short.TYPE.hashCode()), (short) 0);
        b bVar5 = new b(Integer.valueOf(Long.class.hashCode()), 0L);
        b bVar6 = new b(Integer.valueOf(Float.TYPE.hashCode()), Float.valueOf(0.0f));
        b bVar7 = new b(Integer.valueOf(Byte.class.hashCode()), (byte) 0);
        b bVar8 = new b(Integer.valueOf(Character.TYPE.hashCode()), '0');
        b bVar9 = new b(Integer.valueOf(Character.class.hashCode()), '0');
        b bVar10 = new b(Integer.valueOf(Byte.TYPE.hashCode()), (byte) 0);
        b bVar11 = new b(Integer.valueOf(Short.class.hashCode()), (short) 0);
        b bVar12 = new b(Integer.valueOf(Integer.TYPE.hashCode()), 0);
        b bVar13 = new b(Integer.valueOf(Float.class.hashCode()), Float.valueOf(0.0f));
        b bVar14 = new b(Integer.valueOf(Double.TYPE.hashCode()), Double.valueOf(0.0d));
        b bVar15 = bVar11;
        b bVar16 = new b(Integer.valueOf(Double.class.hashCode()), Double.valueOf(0.0d));
        b bVar17 = new b(Integer.valueOf(Integer.class.hashCode()), 0);
        Integer valueOf = Integer.valueOf(Boolean.class.hashCode());
        Boolean bool = Boolean.FALSE;
        b bVar18 = bVar17;
        b bVar19 = new b(valueOf, bool);
        b bVar20 = new b(Integer.valueOf(Boolean.TYPE.hashCode()), bool);
        b bVar21 = new b(Integer.valueOf(List.class.hashCode()), new ArrayList());
        Integer valueOf2 = Integer.valueOf(ParceledListSlice.class.hashCode());
        l lVar = C0459y1.f4250a;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar15, bVar12, bVar13, bVar14, bVar16, bVar18, bVar19, bVar20, bVar21, new b(valueOf2, M1.f3937a)};
        C0413q2 q2Var = new C0413q2(20);
        for (int i2 = 0; i2 < 20; i2++) {
            b bVar22 = bVarArr[i2];
            q2Var.b(((Number) bVar22.f).intValue(), bVar22.f586g);
        }
        f3989c = q2Var;
    }

    public Object a(Object obj, Method method, Object[] objArr) {
        try {
            return super.a(obj, method, objArr);
        } catch (Throwable unused) {
            Class<?> returnType = method.getReturnType();
            if (!i.a(returnType, Void.TYPE)) {
                Object a2 = f3989c.a(returnType.hashCode());
                if (a2 != null) {
                    return a2;
                }
                Class<?> componentType = returnType.getComponentType();
                if (componentType != null) {
                    return Array.newInstance(componentType, 0);
                }
            }
            return null;
        }
    }
}

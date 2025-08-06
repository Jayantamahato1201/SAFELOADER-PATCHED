package q1;

import android.content.ComponentName;
import java.lang.reflect.Method;

/* renamed from: q1.p0  reason: case insensitive filesystem */
public final class C0405p0 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public final ComponentName f4154d;

    public C0405p0() {
        super(3);
        String str = C0394n1.b;
        this.f4154d = new ComponentName(str, str);
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        Class<ComponentName> cls = ComponentName.class;
        try {
            ComponentName componentName = this.f4154d;
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (cls.isInstance(objArr[i2])) {
                    objArr[i2] = componentName;
                    break;
                } else {
                    i2++;
                }
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

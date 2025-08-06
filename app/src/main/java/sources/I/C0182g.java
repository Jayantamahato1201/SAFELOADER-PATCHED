package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: i.g  reason: case insensitive filesystem */
public final class C0182g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f2936c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f2937a;
    public Method b;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f2937a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

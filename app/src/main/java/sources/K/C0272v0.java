package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: k.v0  reason: case insensitive filesystem */
public abstract class C0272v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f3574a;
    public static final Method b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f3575c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3576d = true;

    static {
        Class<AdapterView> cls = AdapterView.class;
        Class<AbsListView> cls2 = AbsListView.class;
        try {
            Class cls3 = Integer.TYPE;
            Class cls4 = Float.TYPE;
            Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, Boolean.TYPE, cls4, cls4});
            f3574a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
            f3575c = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}

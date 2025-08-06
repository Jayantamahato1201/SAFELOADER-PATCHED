package k;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: k.y0  reason: case insensitive filesystem */
public abstract class C0278y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f3598a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f3598a = field;
    }
}

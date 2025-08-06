package I;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f431a;
    public static final Field b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f432c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f433d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f431a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f432c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}

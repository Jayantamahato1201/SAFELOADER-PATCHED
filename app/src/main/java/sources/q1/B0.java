package q1;

import android.view.inputmethod.EditorInfo;
import java.lang.reflect.Method;

public final class B0 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            EditorInfo editorInfo = (EditorInfo) L3.b(objArr, EditorInfo.class);
            if (editorInfo != null) {
                editorInfo.packageName = C0394n1.b;
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}

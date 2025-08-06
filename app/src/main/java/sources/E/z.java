package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f2609a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public Method f2610c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2611d;

    public z(View view, String str) {
        this.f2609a = view;
        this.b = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2610c == null) {
            View view2 = this.f2609a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.f2610c = method;
                            this.f2611d = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.f2610c.invoke(this.f2611d, new Object[]{view});
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}

package e;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.cheatbox.R;
import java.lang.reflect.Constructor;
import k.C0245h0;
import k.C0256n;
import k.C0260p;
import k.C0262q;
import k.E;
import n.k;

/* renamed from: e.A  reason: case insensitive filesystem */
public class C0119A {
    public static final Class[] b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2428c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2429d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2430e = {16844156};
    public static final int[] f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2431g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final k f2432h = new k();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2433a = new Object[2];

    public C0256n a(Context context, AttributeSet attributeSet) {
        return new C0256n(context, attributeSet);
    }

    public C0260p b(Context context, AttributeSet attributeSet) {
        return new C0260p(context, attributeSet, R.attr.MT_Bin);
    }

    public C0262q c(Context context, AttributeSet attributeSet) {
        return new C0262q(context, attributeSet, R.attr.MT_Bin);
    }

    public E d(Context context, AttributeSet attributeSet) {
        return new E(context, attributeSet);
    }

    public C0245h0 e(Context context, AttributeSet attributeSet) {
        return new C0245h0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        k kVar = f2432h;
        Constructor<? extends U> constructor = (Constructor) kVar.getOrDefault(str, (Object) null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2433a);
    }
}

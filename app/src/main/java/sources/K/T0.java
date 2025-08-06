package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import g.C0162e;
import g0.C0169e;
import g0.q;
import h.C0171b;

public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3408a;

    public /* synthetic */ T0(int i2) {
        this.f3408a = i2;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f3408a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) T0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C0171b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                    return null;
                }
            case 1:
                try {
                    return C0162e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e3) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C0169e eVar = new C0169e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e4) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    q qVar = new q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e5) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                    return null;
                }
        }
    }
}

package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import u.C0487a;

public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public C0489a f4729a;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public final int f4730c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f4731d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f4732e = -1;
    public final int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final int f4733g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4734h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4735i;

    /* renamed from: j  reason: collision with root package name */
    public int f4736j;

    /* renamed from: k  reason: collision with root package name */
    public View f4737k;

    /* renamed from: l  reason: collision with root package name */
    public View f4738l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4739m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4740n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f4741o = new Rect();

    public d() {
        super(-2, -2);
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f4739m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f4740n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0489a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0487a.b);
        this.f4730c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4731d = obtainStyledAttributes.getInteger(2, 0);
        this.f4732e = obtainStyledAttributes.getInteger(6, -1);
        this.f4733g = obtainStyledAttributes.getInt(5, 0);
        this.f4734h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1084t;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1084t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1086v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1085u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (C0489a) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4729a = aVar;
        }
        obtainStyledAttributes.recycle();
        C0489a aVar2 = this.f4729a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super(dVar);
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

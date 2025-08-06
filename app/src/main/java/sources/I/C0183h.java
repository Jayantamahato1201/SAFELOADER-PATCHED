package i;

import C.a;
import I.C0019k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.C0211o;
import j.C0212p;
import j.C0216t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: i.h  reason: case insensitive filesystem */
public final class C0183h {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f2938A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f2939B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f2940C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ C0184i f2941E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f2942a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2943c;

    /* renamed from: d  reason: collision with root package name */
    public int f2944d;

    /* renamed from: e  reason: collision with root package name */
    public int f2945e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2946g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2947h;

    /* renamed from: i  reason: collision with root package name */
    public int f2948i;

    /* renamed from: j  reason: collision with root package name */
    public int f2949j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2950k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f2951l;

    /* renamed from: m  reason: collision with root package name */
    public int f2952m;

    /* renamed from: n  reason: collision with root package name */
    public char f2953n;

    /* renamed from: o  reason: collision with root package name */
    public int f2954o;

    /* renamed from: p  reason: collision with root package name */
    public char f2955p;

    /* renamed from: q  reason: collision with root package name */
    public int f2956q;

    /* renamed from: r  reason: collision with root package name */
    public int f2957r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2958s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2959t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2960u;

    /* renamed from: v  reason: collision with root package name */
    public int f2961v;

    /* renamed from: w  reason: collision with root package name */
    public int f2962w;

    /* renamed from: x  reason: collision with root package name */
    public String f2963x;

    /* renamed from: y  reason: collision with root package name */
    public String f2964y;

    /* renamed from: z  reason: collision with root package name */
    public C0212p f2965z;

    public C0183h(C0184i iVar, Menu menu) {
        this.f2941E = iVar;
        this.f2942a = menu;
        this.b = 0;
        this.f2943c = 0;
        this.f2944d = 0;
        this.f2945e = 0;
        this.f = true;
        this.f2946g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2941E.f2968c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, i.g, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z2;
        MenuItem enabled = menuItem.setChecked(this.f2958s).setVisible(this.f2959t).setEnabled(this.f2960u);
        boolean z3 = false;
        if (this.f2957r >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.f2951l).setIcon(this.f2952m);
        int i2 = this.f2961v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2964y;
        C0184i iVar = this.f2941E;
        if (str != null) {
            if (!iVar.f2968c.isRestricted()) {
                if (iVar.f2969d == null) {
                    iVar.f2969d = C0184i.a(iVar.f2968c);
                }
                Object obj = iVar.f2969d;
                String str2 = this.f2964y;
                ? obj2 = new Object();
                obj2.f2937a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.b = cls.getMethod(str2, C0182g.f2936c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e2) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f2957r >= 2) {
            if (menuItem instanceof C0211o) {
                C0211o oVar = (C0211o) menuItem;
                oVar.f3152x = (oVar.f3152x & -5) | 4;
            } else if (menuItem instanceof C0216t) {
                C0216t tVar = (C0216t) menuItem;
                try {
                    Method method = tVar.f3161d;
                    a aVar = tVar.f3160c;
                    if (method == null) {
                        tVar.f3161d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    tVar.f3161d.invoke(aVar, new Object[]{Boolean.TRUE});
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2963x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0184i.f2966e, iVar.f2967a));
            z3 = true;
        }
        int i3 = this.f2962w;
        if (i3 > 0) {
            if (!z3) {
                menuItem.setActionView(i3);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        C0212p pVar = this.f2965z;
        if (pVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2938A;
        boolean z4 = menuItem instanceof a;
        if (z4) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0019k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2939B;
        if (z4) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0019k.m(menuItem, charSequence2);
        }
        char c2 = this.f2953n;
        int i4 = this.f2954o;
        if (z4) {
            ((a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0019k.g(menuItem, c2, i4);
        }
        char c3 = this.f2955p;
        int i5 = this.f2956q;
        if (z4) {
            ((a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0019k.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0019k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2940C;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((a) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0019k.i(menuItem, colorStateList);
        }
    }
}

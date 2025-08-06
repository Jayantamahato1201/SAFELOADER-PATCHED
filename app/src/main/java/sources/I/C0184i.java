package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import d.a;
import j.C0209m;
import j.C0212p;
import java.io.IOException;
import k.C0268t0;
import org.xmlpull.v1.XmlPullParserException;
import t0.C0486a;

/* renamed from: i.i  reason: case insensitive filesystem */
public final class C0184i extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f2966e;
    public static final Class[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2967a;
    public final Object[] b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2968c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2969d;

    static {
        Class[] clsArr = {Context.class};
        f2966e = clsArr;
        f = clsArr;
    }

    public C0184i(Context context) {
        super(context);
        this.f2968c = context;
        Object[] objArr = {context};
        this.f2967a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        boolean z2;
        int i2;
        XmlResourceParser xmlResourceParser2;
        char c2;
        char c3;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        C0183h hVar = new C0183h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            z2 = true;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser3 = xmlResourceParser;
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType != z2) {
                if (eventType != i2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z5 && name2.equals(str)) {
                            xmlResourceParser2 = xmlResourceParser;
                            z5 = false;
                            str = null;
                            eventType = xmlResourceParser2.next();
                            z2 = true;
                            i2 = 2;
                        } else if (name2.equals("group")) {
                            hVar.b = 0;
                            hVar.f2943c = 0;
                            hVar.f2944d = 0;
                            hVar.f2945e = 0;
                            hVar.f = z2;
                            hVar.f2946g = z2;
                        } else if (name2.equals("item")) {
                            if (!hVar.f2947h) {
                                C0212p pVar = hVar.f2965z;
                                if (pVar == null || !pVar.f3155a.hasSubMenu()) {
                                    hVar.f2947h = z2;
                                    hVar.b(hVar.f2942a.add(hVar.b, hVar.f2948i, hVar.f2949j, hVar.f2950k));
                                } else {
                                    hVar.f2947h = z2;
                                    hVar.b(hVar.f2942a.addSubMenu(hVar.b, hVar.f2948i, hVar.f2949j, hVar.f2950k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z4 = true;
                            eventType = xmlResourceParser2.next();
                            z2 = true;
                            i2 = 2;
                        }
                    }
                } else if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0184i iVar = hVar.f2941E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = iVar.f2968c.obtainStyledAttributes(attributeSet2, a.f2206p);
                        hVar.b = obtainStyledAttributes.getResourceId(z2 ? 1 : 0, 0);
                        hVar.f2943c = obtainStyledAttributes.getInt(3, 0);
                        hVar.f2944d = obtainStyledAttributes.getInt(4, 0);
                        hVar.f2945e = obtainStyledAttributes.getInt(5, 0);
                        hVar.f = obtainStyledAttributes.getBoolean(2, z2);
                        hVar.f2946g = obtainStyledAttributes.getBoolean(0, z2);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = iVar.f2968c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, a.f2207q);
                        hVar.f2948i = obtainStyledAttributes2.getResourceId(2, 0);
                        hVar.f2949j = (obtainStyledAttributes2.getInt(5, hVar.f2943c) & -65536) | (obtainStyledAttributes2.getInt(6, hVar.f2944d) & 65535);
                        hVar.f2950k = obtainStyledAttributes2.getText(7);
                        hVar.f2951l = obtainStyledAttributes2.getText(8);
                        hVar.f2952m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            c2 = 0;
                        } else {
                            c2 = string.charAt(0);
                        }
                        hVar.f2953n = c2;
                        hVar.f2954o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            c3 = 0;
                        } else {
                            c3 = string2.charAt(0);
                        }
                        hVar.f2955p = c3;
                        hVar.f2956q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            hVar.f2957r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            hVar.f2957r = hVar.f2945e;
                        }
                        hVar.f2958s = obtainStyledAttributes2.getBoolean(3, false);
                        hVar.f2959t = obtainStyledAttributes2.getBoolean(4, hVar.f);
                        hVar.f2960u = obtainStyledAttributes2.getBoolean(1, hVar.f2946g);
                        hVar.f2961v = obtainStyledAttributes2.getInt(21, -1);
                        hVar.f2964y = obtainStyledAttributes2.getString(12);
                        hVar.f2962w = obtainStyledAttributes2.getResourceId(13, 0);
                        hVar.f2963x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && hVar.f2962w == 0 && hVar.f2963x == null) {
                            hVar.f2965z = (C0212p) hVar.a(string3, f, iVar.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            hVar.f2965z = null;
                        }
                        hVar.f2938A = obtainStyledAttributes2.getText(17);
                        hVar.f2939B = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            hVar.D = C0268t0.b(obtainStyledAttributes2.getInt(19, -1), hVar.D);
                        } else {
                            hVar.D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = C0486a.g(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            hVar.f2940C = colorStateList;
                        } else {
                            hVar.f2940C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        hVar.f2947h = false;
                        xmlResourceParser2 = xmlResourceParser;
                        eventType = xmlResourceParser2.next();
                        z2 = true;
                        i2 = 2;
                    } else {
                        if (name3.equals("menu")) {
                            hVar.f2947h = true;
                            SubMenu addSubMenu = hVar.f2942a.addSubMenu(hVar.b, hVar.f2948i, hVar.f2949j, hVar.f2950k);
                            hVar.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet2, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        z2 = true;
                        i2 = 2;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                eventType = xmlResourceParser2.next();
                z2 = true;
                i2 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof C0209m)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2968c.getResources().getLayout(i2);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}

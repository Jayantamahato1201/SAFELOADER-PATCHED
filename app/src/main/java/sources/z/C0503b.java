package z;

import A.a;
import F.g;
import F0.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h1.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w.C0491a;

/* renamed from: z.b  reason: case insensitive filesystem */
public abstract class C0503b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f4853a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f4854c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f4855d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e  reason: collision with root package name */
    public static final Object f4856e = new Object();
    public static Method f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f4857g;

    public static h b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        h hVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new h((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                hVar = h.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                hVar = null;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h((Shader) null, (ColorStateList) null, 0);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i2) {
        if (!d(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i2);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int e(float f2) {
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f4854c;
        return a.a((double) (f4 * fArr[0]), (double) (f3 * fArr[1]), (double) (f6 * fArr[2]));
    }

    public static float f(int i2) {
        float pow;
        float f2 = ((float) i2) / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static C0506e j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        boolean z2;
        int i3;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            xmlResourceParser2.require(2, (String) null, "font-family");
            if (xmlResourceParser2.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser2), C0491a.b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser2.next() != 3) {
                        if (xmlResourceParser2.getEventType() == 2) {
                            if (xmlResourceParser2.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser2), C0491a.f4746c);
                                int i4 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i4 = 1;
                                }
                                int i5 = obtainAttributes2.getInt(i4, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i2 = 6;
                                } else {
                                    i2 = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i2, 0)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i6 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i6 = 3;
                                }
                                int i7 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i7 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i7);
                                int i8 = obtainAttributes2.getInt(i6, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i3 = 5;
                                } else {
                                    i3 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i3, 0);
                                String string6 = obtainAttributes2.getString(i3);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser2.next() != 3) {
                                    m(xmlResourceParser2);
                                }
                                arrayList.add(new C0508g(string6, i5, z2, string5, i8, resourceId2));
                            } else {
                                m(xmlResourceParser2);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C0507f((C0508g[]) arrayList.toArray(new C0508g[0]));
                }
                while (xmlResourceParser2.next() != 3) {
                    m(xmlResourceParser2);
                }
                return new C0509h(new g(string, string2, string3, k(resources2, resourceId)), integer, integer2, string4);
            }
            m(xmlResourceParser2);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List k(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (C0505d.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void l(Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            C0514m.a(theme);
        } else if (i2 >= 23) {
            synchronized (f4856e) {
                if (!f4857g) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                        f = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                    }
                    f4857g = true;
                }
                Method method = f;
                if (method != null) {
                    try {
                        method.invoke(theme, (Object[]) null);
                    } catch (IllegalAccessException | InvocationTargetException e3) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                        f = null;
                    }
                }
            }
        }
    }

    public static void m(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i2) {
        new Handler(Looper.getMainLooper()).post(new c(this, i2, 2));
    }

    public abstract void h(int i2);

    public abstract void i(Typeface typeface);
}

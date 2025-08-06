package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import q.h;

/* renamed from: t.b  reason: case insensitive filesystem */
public final class C0477b {

    /* renamed from: a  reason: collision with root package name */
    public int f4545a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public float f4546c;

    /* renamed from: d  reason: collision with root package name */
    public String f4547d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4548e;
    public int f;

    public C0477b(C0477b bVar, Object obj) {
        bVar.getClass();
        this.f4545a = bVar.f4545a;
        b(obj);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [t.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f4707c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i2 = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i2 = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i2 = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i2 = 1;
                } else if (index == 8) {
                    obj = obtainStyledAttributes.getString(index);
                    i2 = 5;
                }
                i2 = 7;
            }
        }
        if (!(str == null || obj == null)) {
            ? obj2 = new Object();
            obj2.f4545a = i2;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (h.b(this.f4545a)) {
            case 0:
                this.b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f4546c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f4547d = (String) obj;
                return;
            case 5:
                this.f4548e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f4546c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}

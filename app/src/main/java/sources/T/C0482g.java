package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: t.g  reason: case insensitive filesystem */
public final class C0482g {

    /* renamed from: a  reason: collision with root package name */
    public final float f4618a = Float.NaN;
    public final float b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f4619c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public final float f4620d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public final int f4621e = -1;

    public C0482g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f4712i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4621e);
                this.f4621e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4620d = obtainStyledAttributes.getDimension(index, this.f4620d);
            } else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            } else if (index == 3) {
                this.f4619c = obtainStyledAttributes.getDimension(index, this.f4619c);
            } else if (index == 4) {
                this.f4618a = obtainStyledAttributes.getDimension(index, this.f4618a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}

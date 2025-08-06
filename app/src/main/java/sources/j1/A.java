package j1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import t.m;
import t.q;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final int f3200a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3201c;

    public A(Context context, XmlResourceParser xmlResourceParser) {
        this.f3201c = new ArrayList();
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f4710g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f3200a = obtainStyledAttributes.getResourceId(index, this.f3200a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public A() {
        this.f3201c = new A[256];
        this.f3200a = 0;
        this.b = 0;
    }

    public A(int i2, int i3) {
        this.f3201c = null;
        this.f3200a = i2;
        int i4 = i3 & 7;
        this.b = i4 == 0 ? 8 : i4;
    }
}

package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f4688a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public float f4689c;

    /* renamed from: d  reason: collision with root package name */
    public float f4690d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f4689c = obtainStyledAttributes.getFloat(index, this.f4689c);
            } else if (index == 0) {
                int i3 = obtainStyledAttributes.getInt(index, this.f4688a);
                this.f4688a = i3;
                this.f4688a = m.f4702d[i3];
            } else if (index == 4) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 3) {
                this.f4690d = obtainStyledAttributes.getFloat(index, this.f4690d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}

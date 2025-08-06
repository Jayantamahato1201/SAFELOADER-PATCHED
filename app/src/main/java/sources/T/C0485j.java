package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p.C0305a;

/* renamed from: t.j  reason: case insensitive filesystem */
public final class C0485j {

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f4684e;

    /* renamed from: a  reason: collision with root package name */
    public int f4685a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public float f4686c;

    /* renamed from: d  reason: collision with root package name */
    public float f4687d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4684e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f4709e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f4684e.get(index)) {
                case 1:
                    this.f4687d = obtainStyledAttributes.getFloat(index, this.f4687d);
                    break;
                case 2:
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0305a.f3776a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4685a = m.f(obtainStyledAttributes, index, this.f4685a);
                    break;
                case 6:
                    this.f4686c = obtainStyledAttributes.getFloat(index, this.f4686c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}

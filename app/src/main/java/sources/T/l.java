package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class l {

    /* renamed from: m  reason: collision with root package name */
    public static final SparseIntArray f4691m;

    /* renamed from: a  reason: collision with root package name */
    public float f4692a;
    public float b;

    /* renamed from: c  reason: collision with root package name */
    public float f4693c;

    /* renamed from: d  reason: collision with root package name */
    public float f4694d;

    /* renamed from: e  reason: collision with root package name */
    public float f4695e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f4696g;

    /* renamed from: h  reason: collision with root package name */
    public float f4697h;

    /* renamed from: i  reason: collision with root package name */
    public float f4698i;

    /* renamed from: j  reason: collision with root package name */
    public float f4699j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4700k;

    /* renamed from: l  reason: collision with root package name */
    public float f4701l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4691m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f4711h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f4691m.get(index)) {
                case 1:
                    this.f4692a = obtainStyledAttributes.getFloat(index, this.f4692a);
                    break;
                case 2:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 3:
                    this.f4693c = obtainStyledAttributes.getFloat(index, this.f4693c);
                    break;
                case 4:
                    this.f4694d = obtainStyledAttributes.getFloat(index, this.f4694d);
                    break;
                case 5:
                    this.f4695e = obtainStyledAttributes.getFloat(index, this.f4695e);
                    break;
                case 6:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.f4696g = obtainStyledAttributes.getDimension(index, this.f4696g);
                    break;
                case 8:
                    this.f4697h = obtainStyledAttributes.getDimension(index, this.f4697h);
                    break;
                case 9:
                    this.f4698i = obtainStyledAttributes.getDimension(index, this.f4698i);
                    break;
                case 10:
                    this.f4699j = obtainStyledAttributes.getDimension(index, this.f4699j);
                    break;
                case 11:
                    this.f4700k = true;
                    this.f4701l = obtainStyledAttributes.getDimension(index, this.f4701l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}

package T;

import Q0.l;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f extends l {

    /* renamed from: l  reason: collision with root package name */
    public final TextView f712l;

    /* renamed from: m  reason: collision with root package name */
    public final d f713m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f714n = true;

    public f(TextView textView) {
        this.f712l = textView;
        this.f713m = new d(textView);
    }

    public final void X(boolean z2) {
        if (z2) {
            f0();
        }
    }

    public final void Y(boolean z2) {
        this.f714n = z2;
        f0();
        TextView textView = this.f712l;
        textView.setFilters(w(textView.getFilters()));
    }

    public final void f0() {
        TextView textView = this.f712l;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f714n) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f719a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        if (!this.f714n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            d dVar = this.f713m;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i5] == dVar) {
                return inputFilterArr;
            } else {
                i5++;
            }
        }
    }
}

package E0;

import D0.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

public final class n extends t {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f170c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f171d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f170c = arrayList;
        this.f171d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        ArrayList arrayList = this.f170c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((t) obj).a(this.f171d, aVar, i2, canvas);
        }
    }
}

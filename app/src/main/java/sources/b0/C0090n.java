package b0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: b0.n  reason: case insensitive filesystem */
public final class C0090n {

    /* renamed from: a  reason: collision with root package name */
    public int f1746a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f1747c;

    /* renamed from: d  reason: collision with root package name */
    public int f1748d;

    public final void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i3 >= 0) {
            int i4 = this.f1748d;
            int i5 = i4 * 2;
            int[] iArr = this.f1747c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f1747c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[(i4 * 4)];
                this.f1747c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f1747c;
            iArr4[i5] = i2;
            iArr4[i5 + 1] = i3;
            this.f1748d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f1748d = 0;
        int[] iArr = this.f1747c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        J j2 = recyclerView.f1524l;
        if (recyclerView.f1522k != null && j2 != null && j2.f1583i) {
            if (z2) {
                if (!recyclerView.f1510d.g()) {
                    j2.i(recyclerView.f1522k.a(), this);
                }
            } else if (!recyclerView.K()) {
                j2.h(this.f1746a, this.b, recyclerView.f1509c0, this);
            }
            int i2 = this.f1748d;
            if (i2 > j2.f1584j) {
                j2.f1584j = i2;
                j2.f1585k = z2;
                recyclerView.b.k();
            }
        }
    }
}

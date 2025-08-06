package b0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    public int f1604a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1605c;

    /* renamed from: d  reason: collision with root package name */
    public int f1606d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f1607e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f1608g;

    public final void a(RecyclerView recyclerView) {
        int i2 = this.f1606d;
        if (i2 >= 0) {
            this.f1606d = -1;
            recyclerView.M(i2);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.f1607e;
            if (interpolator == null || this.f1605c >= 1) {
                int i3 = this.f1605c;
                if (i3 >= 1) {
                    recyclerView.f1504W.b(this.f1604a, this.b, i3, interpolator);
                    int i4 = this.f1608g + 1;
                    this.f1608g = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.f1608g = 0;
        }
    }
}

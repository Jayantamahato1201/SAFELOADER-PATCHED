package R;

import E0.e;
import J.l;
import android.graphics.Rect;
import java.util.Comparator;

public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f682a = new Rect();
    public final Rect b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f683c;

    /* renamed from: d  reason: collision with root package name */
    public final e f684d;

    public c(boolean z2, e eVar) {
        this.f683c = z2;
        this.f684d = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        this.f684d.getClass();
        Rect rect = this.f682a;
        ((l) obj).f(rect);
        Rect rect2 = this.b;
        ((l) obj2).f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f683c;
        if (i4 < i5) {
            if (z2) {
                return 1;
            }
            return -1;
        } else if (i4 <= i5) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                if (z2) {
                    return 1;
                }
                return -1;
            } else if (i8 <= i9) {
                return 0;
            } else {
                if (z2) {
                    return -1;
                }
                return 1;
            }
        } else if (z2) {
            return -1;
        } else {
            return 1;
        }
    }
}

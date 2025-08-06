package g;

import android.animation.TimeInterpolator;

/* renamed from: g.d  reason: case insensitive filesystem */
public final class C0161d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f2770a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2771c;

    public final float getInterpolation(float f) {
        float f2;
        int i2 = (int) ((f * ((float) this.f2771c)) + 0.5f);
        int i3 = this.b;
        int[] iArr = this.f2770a;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i4];
            if (i2 < i5) {
                break;
            }
            i2 -= i5;
            i4++;
        }
        if (i4 < i3) {
            f2 = ((float) i2) / ((float) this.f2771c);
        } else {
            f2 = 0.0f;
        }
        return (((float) i4) / ((float) i3)) + f2;
    }
}

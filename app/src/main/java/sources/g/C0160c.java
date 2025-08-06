package g;

import Q0.l;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import h.C0170a;

/* renamed from: g.c  reason: case insensitive filesystem */
public final class C0160c extends l {

    /* renamed from: l  reason: collision with root package name */
    public final ObjectAnimator f2768l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2769m;

    /* JADX WARNING: type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, g.d] */
    public C0160c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int i2;
        int i3;
        int i4;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z2) {
            i2 = numberOfFrames - 1;
        } else {
            i2 = 0;
        }
        if (z2) {
            i3 = 0;
        } else {
            i3 = numberOfFrames - 1;
        }
        ? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.b = numberOfFrames2;
        int[] iArr = obj.f2770a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f2770a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f2770a;
        int i5 = 0;
        for (int i6 = 0; i6 < numberOfFrames2; i6++) {
            if (z2) {
                i4 = (numberOfFrames2 - i6) - 1;
            } else {
                i4 = i6;
            }
            int duration = animationDrawable.getDuration(i4);
            iArr2[i6] = duration;
            i5 += duration;
        }
        obj.f2771c = i5;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
        C0170a.a(ofInt, true);
        ofInt.setDuration((long) obj.f2771c);
        ofInt.setInterpolator(obj);
        this.f2769m = z3;
        this.f2768l = ofInt;
    }

    public final void W() {
        this.f2768l.reverse();
    }

    public final void a0() {
        this.f2768l.start();
    }

    public final void b0() {
        this.f2768l.cancel();
    }

    public final boolean g() {
        return this.f2769m;
    }
}

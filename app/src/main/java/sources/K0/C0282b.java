package k0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.k;

/* renamed from: k0.b  reason: case insensitive filesystem */
public final class C0282b {

    /* renamed from: a  reason: collision with root package name */
    public final k f3625a = new k();
    public final k b = new k();

    public static C0282b a(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, k0.c] */
    public static C0282b b(ArrayList arrayList) {
        C0282b bVar = new C0282b();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Animator animator = (Animator) arrayList.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0281a.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0281a.f3623c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0281a.f3624d;
                }
                ? obj = new Object();
                obj.f3628d = 0;
                obj.f3629e = 1;
                obj.f3626a = startDelay;
                obj.b = duration;
                obj.f3627c = interpolator;
                obj.f3628d = objectAnimator.getRepeatCount();
                obj.f3629e = objectAnimator.getRepeatMode();
                bVar.f3625a.put(propertyName, obj);
                i2++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282b)) {
            return false;
        }
        return this.f3625a.equals(((C0282b) obj).f3625a);
    }

    public final int hashCode() {
        return this.f3625a.hashCode();
    }

    public final String toString() {
        return "\n" + C0282b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3625a + "}\n";
    }
}

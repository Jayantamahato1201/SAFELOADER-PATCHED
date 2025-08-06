package R;

import A.j;
import I.O;
import J.l;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import s0.d;

public final class a extends j {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(5);
        this.f669d = bVar;
    }

    public final boolean B(int i2, int i3, Bundle bundle) {
        int i4;
        b bVar = this.f669d;
        Chip chip = bVar.f677i;
        if (i2 == -1) {
            WeakHashMap weakHashMap = O.f393a;
            return chip.performAccessibilityAction(i3, bundle);
        } else if (i3 == 1) {
            return bVar.p(i2);
        } else {
            if (i3 == 2) {
                return bVar.j(i2);
            }
            boolean z2 = false;
            if (i3 == 64) {
                AccessibilityManager accessibilityManager = bVar.f676h;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = bVar.f679k) == i2) {
                    return false;
                }
                if (i4 != Integer.MIN_VALUE) {
                    bVar.f679k = Integer.MIN_VALUE;
                    bVar.f677i.invalidate();
                    bVar.q(i4, 65536);
                }
                bVar.f679k = i2;
                chip.invalidate();
                bVar.q(i2, 32768);
                return true;
            } else if (i3 != 128) {
                d dVar = (d) bVar;
                if (i3 == 16) {
                    Chip chip2 = dVar.f4483q;
                    if (i2 == 0) {
                        return chip2.performClick();
                    }
                    if (i2 == 1) {
                        chip2.playSoundEffect(0);
                        View.OnClickListener onClickListener = chip2.f1931h;
                        if (onClickListener != null) {
                            onClickListener.onClick(chip2);
                            z2 = true;
                        }
                        if (chip2.f1942s) {
                            chip2.f1941r.q(1, 1);
                        }
                    }
                }
                return z2;
            } else if (bVar.f679k != i2) {
                return false;
            } else {
                bVar.f679k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i2, 65536);
                return true;
            }
        }
    }

    public final l w(int i2) {
        return new l(AccessibilityNodeInfo.obtain(this.f669d.n(i2).f490a));
    }

    public final l x(int i2) {
        int i3;
        b bVar = this.f669d;
        if (i2 == 2) {
            i3 = bVar.f679k;
        } else {
            i3 = bVar.f680l;
        }
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i3);
    }
}

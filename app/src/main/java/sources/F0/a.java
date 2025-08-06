package F0;

import A.i;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f219o;

    /* renamed from: p  reason: collision with root package name */
    public final SideSheetBehavior f220p;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f219o = i2;
        this.f220p = sideSheetBehavior;
    }

    public final int L() {
        switch (this.f219o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f220p;
                return Math.max(0, sideSheetBehavior.f2068n + sideSheetBehavior.f2069o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f220p;
                return Math.max(0, (sideSheetBehavior2.f2067m - sideSheetBehavior2.f2066l) - sideSheetBehavior2.f2069o);
        }
    }

    public final int M() {
        switch (this.f219o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f220p;
                return (-sideSheetBehavior.f2066l) - sideSheetBehavior.f2069o;
            default:
                return this.f220p.f2067m;
        }
    }

    public final int O() {
        switch (this.f219o) {
            case 0:
                return this.f220p.f2069o;
            default:
                return this.f220p.f2067m;
        }
    }

    public final int P() {
        switch (this.f219o) {
            case 0:
                return -this.f220p.f2066l;
            default:
                return L();
        }
    }

    public final int Q(View view) {
        switch (this.f219o) {
            case 0:
                return view.getRight() + this.f220p.f2069o;
            default:
                return view.getLeft() - this.f220p.f2069o;
        }
    }

    public final int R(CoordinatorLayout coordinatorLayout) {
        switch (this.f219o) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int S() {
        switch (this.f219o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean X(float f) {
        switch (this.f219o) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    public final boolean Z(View view) {
        switch (this.f219o) {
            case 0:
                if (view.getRight() < (L() - M()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (L() + this.f220p.f2067m) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean a0(float f, float f2) {
        switch (this.f219o) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.f220p.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.f220p.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f219o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float g(int i2) {
        switch (this.f219o) {
            case 0:
                float M2 = (float) M();
                return (((float) i2) - M2) / (((float) L()) - M2);
            default:
                float f = (float) this.f220p.f2067m;
                return (f - ((float) i2)) / (f - ((float) L()));
        }
    }

    public final boolean v0(View view, float f) {
        switch (this.f219o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f220p;
                float abs = Math.abs((f * sideSheetBehavior.f2065k) + ((float) view.getLeft()));
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f220p;
                float abs2 = Math.abs((f * sideSheetBehavior2.f2065k) + ((float) view.getRight()));
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    public final void x0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f219o) {
            case 0:
                if (i2 <= this.f220p.f2067m) {
                    marginLayoutParams.leftMargin = i3;
                    return;
                }
                return;
            default:
                int i4 = this.f220p.f2067m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                    return;
                }
                return;
        }
    }
}

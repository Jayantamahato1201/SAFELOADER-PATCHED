package A0;

import O.b;
import android.content.res.ColorStateList;
import com.cheatbox.R;
import k.E;
import t0.C0486a;

public final class a extends E {

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f40g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f41e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41e == null) {
            int f2 = C0486a.f(this, R.attr.MT_Bin);
            int f3 = C0486a.f(this, R.attr.MT_Bin);
            int f4 = C0486a.f(this, R.attr.MT_Bin);
            this.f41e = new ColorStateList(f40g, new int[]{C0486a.o(f4, f2, 1.0f), C0486a.o(f4, f3, 0.54f), C0486a.o(f4, f3, 0.38f), C0486a.o(f4, f3, 0.38f)});
        }
        return this.f41e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }
}

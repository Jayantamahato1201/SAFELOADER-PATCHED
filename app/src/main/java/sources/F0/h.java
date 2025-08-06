package F0;

import H0.E;
import I.O;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v.C0489a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f229a = 1;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f230c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f231d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0489a f232e;

    public h(SideSheetBehavior sideSheetBehavior) {
        this.f232e = sideSheetBehavior;
        this.f231d = new g(0, this);
    }

    public final void a(int i2) {
        Runnable runnable = this.f231d;
        C0489a aVar = this.f232e;
        switch (this.f229a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference = sideSheetBehavior.f2070p;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i2;
                    if (!this.f230c) {
                        WeakHashMap weakHashMap = O.f393a;
                        ((View) sideSheetBehavior.f2070p.get()).postOnAnimation((g) runnable);
                        this.f230c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference2 = bottomSheetBehavior.f1865U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i2;
                    if (!this.f230c) {
                        WeakHashMap weakHashMap2 = O.f393a;
                        ((View) bottomSheetBehavior.f1865U.get()).postOnAnimation((E) runnable);
                        this.f230c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.f232e = bottomSheetBehavior;
        this.f231d = new E(16, this);
    }
}

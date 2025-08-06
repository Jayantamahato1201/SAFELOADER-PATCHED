package J;

import A.i;
import H0.l;
import H0.n;
import I.O;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final l f477a;

    public b(l lVar) {
        this.f477a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f477a.equals(((b) obj).f477a);
    }

    public final int hashCode() {
        return this.f477a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z2) {
        int i2;
        n nVar = (n) this.f477a.f299a;
        AutoCompleteTextView autoCompleteTextView = nVar.f303h;
        if (autoCompleteTextView != null && !i.W(autoCompleteTextView)) {
            if (z2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            WeakHashMap weakHashMap = O.f393a;
            nVar.f342d.setImportantForAccessibility(i2);
        }
    }
}

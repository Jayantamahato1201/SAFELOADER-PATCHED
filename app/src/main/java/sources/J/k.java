package J;

import android.view.accessibility.AccessibilityNodeInfo;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f488a;

    public k(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f488a = collectionItemInfo;
    }

    public static k a(boolean z2, int i2, int i3, int i4, int i5) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
    }
}

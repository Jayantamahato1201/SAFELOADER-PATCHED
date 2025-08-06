package J;

import A.j;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class m extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final j f491a;

    public m(j jVar) {
        this.f491a = jVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        l w2 = this.f491a.w(i2);
        if (w2 == null) {
            return null;
        }
        return w2.f490a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f491a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i2) {
        l x2 = this.f491a.x(i2);
        if (x2 == null) {
            return null;
        }
        return x2.f490a;
    }

    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f491a.B(i2, i3, bundle);
    }
}

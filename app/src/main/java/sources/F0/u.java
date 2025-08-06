package f0;

import A.g;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2691a = new HashMap();
    public final View b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2692c = new ArrayList();

    public u(View view) {
        this.b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (f0.u) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof f0.u
            if (r0 == 0) goto L_0x0018
            f0.u r3 = (f0.u) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f2691a
            java.util.HashMap r3 = r3.f2691a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.u.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f2691a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String h2 = g.h(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap hashMap = this.f2691a;
        for (String str : hashMap.keySet()) {
            h2 = h2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h2;
    }
}

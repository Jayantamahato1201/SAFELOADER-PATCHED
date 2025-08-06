package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.I;
import java.util.HashMap;
import java.util.Iterator;

public final class F extends I {

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1230c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1231d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f1232e = new HashMap();
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1233g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1234h = false;

    public F(boolean z2) {
        this.f = z2;
    }

    public final void a() {
        if (D.D(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1233g = true;
    }

    public final void b(C0058o oVar) {
        if (this.f1234h) {
            if (D.D(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f1230c.remove(oVar.f1361e) != null && D.D(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f2 = (F) obj;
            if (!this.f1230c.equals(f2.f1230c) || !this.f1231d.equals(f2.f1231d) || !this.f1232e.equals(f2.f1232e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f1231d.hashCode();
        return this.f1232e.hashCode() + ((hashCode + (this.f1230c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1230c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1231d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1232e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

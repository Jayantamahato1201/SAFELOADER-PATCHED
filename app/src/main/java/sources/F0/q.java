package f0;

import android.view.ViewGroup;
import com.cheatbox.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n.C0289b;
import n.k;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0150a f2687a;
    public static final ThreadLocal b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f2688c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [f0.a, f0.m] */
    static {
        ? mVar = new m();
        mVar.f2632F = new ArrayList();
        mVar.f2633G = true;
        mVar.f2635I = false;
        mVar.f2636J = 0;
        mVar.f2633G = false;
        mVar.I(new C0157h(2));
        mVar.I(new m());
        mVar.I(new C0157h(1));
        f2687a = mVar;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [f0.p, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = f2688c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (mVar == null) {
                mVar = f2687a;
            }
            m j2 = mVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, (Object) null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((m) obj).w(viewGroup);
                }
            }
            j2.h(viewGroup, true);
            if (viewGroup.getTag(R.id.MT_Bin) == null) {
                viewGroup.setTag(R.id.MT_Bin, (Object) null);
                ? obj2 = new Object();
                obj2.f2686a = j2;
                obj2.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [n.b, n.k, java.lang.Object] */
    public static C0289b b() {
        C0289b bVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (C0289b) weakReference.get()) != null) {
            return bVar;
        }
        ? kVar = new k();
        threadLocal.set(new WeakReference(kVar));
        return kVar;
    }
}

package f0;

import E0.e;
import I.D;
import I.O;
import I.Z;
import Q0.l;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.emoji2.text.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n.C0289b;
import n.C0291d;
import n.C0292e;
import n.k;

public abstract class m implements Cloneable {

    /* renamed from: B  reason: collision with root package name */
    public static final Animator[] f2661B = new Animator[0];

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2662C = {2, 1, 3, 4};
    public static final e D = new e(24);

    /* renamed from: E  reason: collision with root package name */
    public static final ThreadLocal f2663E = new ThreadLocal();

    /* renamed from: A  reason: collision with root package name */
    public e f2664A = D;
    public final String f = getClass().getName();

    /* renamed from: g  reason: collision with root package name */
    public long f2665g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f2666h = -1;

    /* renamed from: i  reason: collision with root package name */
    public TimeInterpolator f2667i = null;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f2668j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f2669k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public r f2670l = new r(1);

    /* renamed from: m  reason: collision with root package name */
    public r f2671m = new r(1);

    /* renamed from: n  reason: collision with root package name */
    public C0150a f2672n = null;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f2673o = f2662C;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f2674p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f2675q;

    /* renamed from: r  reason: collision with root package name */
    public k[] f2676r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f2677s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public Animator[] f2678t = f2661B;

    /* renamed from: u  reason: collision with root package name */
    public int f2679u = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2680v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2681w = false;

    /* renamed from: x  reason: collision with root package name */
    public m f2682x = null;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f2683y = null;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f2684z = new ArrayList();

    public static void b(r rVar, View view, u uVar) {
        ((C0289b) rVar.f1183a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) rVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = O.f393a;
        String k2 = D.k(view);
        if (k2 != null) {
            C0289b bVar = (C0289b) rVar.f1185d;
            if (bVar.containsKey(k2)) {
                bVar.put(k2, (Object) null);
            } else {
                bVar.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0292e eVar = (C0292e) rVar.f1184c;
                if (eVar.f) {
                    eVar.d();
                }
                if (C0291d.b(eVar.f3686g, eVar.f3688i, itemIdAtPosition) >= 0) {
                    View view2 = (View) eVar.e(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        eVar.f(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                eVar.f(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [n.b, n.k, java.lang.Object] */
    public static C0289b p() {
        ThreadLocal threadLocal = f2663E;
        C0289b bVar = (C0289b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        ? kVar = new k();
        threadLocal.set(kVar);
        return kVar;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f2691a.get(str);
        Object obj2 = uVar2.f2691a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2666h = j2;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f2667i = timeInterpolator;
    }

    public void D(e eVar) {
        if (eVar == null) {
            this.f2664A = D;
        } else {
            this.f2664A = eVar;
        }
    }

    public void F(long j2) {
        this.f2665g = j2;
    }

    public final void G() {
        if (this.f2679u == 0) {
            v(this, l.f2657a);
            this.f2681w = false;
        }
        this.f2679u++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2666h != -1) {
            sb.append("dur(");
            sb.append(this.f2666h);
            sb.append(") ");
        }
        if (this.f2665g != -1) {
            sb.append("dly(");
            sb.append(this.f2665g);
            sb.append(") ");
        }
        if (this.f2667i != null) {
            sb.append("interp(");
            sb.append(this.f2667i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2668j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2669k;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(k kVar) {
        if (this.f2683y == null) {
            this.f2683y = new ArrayList();
        }
        this.f2683y.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f2677s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2678t);
        this.f2678t = f2661B;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f2678t = animatorArr;
        v(this, l.f2658c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                u uVar = new u(view);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f2692c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f2670l, view, uVar);
                } else {
                    b(this.f2671m, view, uVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public abstract void g(u uVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f2668j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2669k;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
                if (findViewById != null) {
                    u uVar = new u(findViewById);
                    if (z2) {
                        g(uVar);
                    } else {
                        d(uVar);
                    }
                    uVar.f2692c.add(this);
                    f(uVar);
                    if (z2) {
                        b(this.f2670l, findViewById, uVar);
                    } else {
                        b(this.f2671m, findViewById, uVar);
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                View view = (View) arrayList2.get(i3);
                u uVar2 = new u(view);
                if (z2) {
                    g(uVar2);
                } else {
                    d(uVar2);
                }
                uVar2.f2692c.add(this);
                f(uVar2);
                if (z2) {
                    b(this.f2670l, view, uVar2);
                } else {
                    b(this.f2671m, view, uVar2);
                }
            }
            return;
        }
        e(viewGroup, z2);
    }

    public final void i(boolean z2) {
        if (z2) {
            ((C0289b) this.f2670l.f1183a).clear();
            ((SparseArray) this.f2670l.b).clear();
            ((C0292e) this.f2670l.f1184c).b();
            return;
        }
        ((C0289b) this.f2671m.f1183a).clear();
        ((SparseArray) this.f2671m.b).clear();
        ((C0292e) this.f2671m.f1184c).b();
    }

    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f2684z = new ArrayList();
            mVar.f2670l = new r(1);
            mVar.f2671m = new r(1);
            mVar.f2674p = null;
            mVar.f2675q = null;
            mVar.f2682x = this;
            mVar.f2683y = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [f0.j, java.lang.Object] */
    public void l(ViewGroup viewGroup, r rVar, r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        u uVar;
        u uVar2;
        Animator animator;
        C0289b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i4 = 0;
        while (i4 < size) {
            u uVar3 = (u) arrayList.get(i4);
            u uVar4 = (u) arrayList2.get(i4);
            if (uVar3 != null && !uVar3.f2692c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f2692c.contains(this)) {
                uVar4 = null;
            }
            if (!(uVar3 == null && uVar4 == null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                ViewGroup viewGroup2 = viewGroup;
                Animator k2 = k(viewGroup2, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((C0289b) rVar2.f1183a).getOrDefault(view, (Object) null);
                            i3 = size;
                            if (uVar5 != null) {
                                int i5 = 0;
                                while (i5 < q2.length) {
                                    HashMap hashMap = uVar2.f2691a;
                                    int i6 = i4;
                                    String str2 = q2[i5];
                                    hashMap.put(str2, uVar5.f2691a.get(str2));
                                    i5++;
                                    i4 = i6;
                                }
                            }
                            i2 = i4;
                            int i7 = p2.f3706h;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i8), (Object) null);
                                if (jVar.f2654c != null && jVar.f2653a == view && jVar.b.equals(str) && jVar.f2654c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            r rVar3 = rVar2;
                            i3 = size;
                            i2 = i4;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        r rVar4 = rVar2;
                        i3 = size;
                        i2 = i4;
                        view = uVar3.b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = viewGroup2.getWindowId();
                        ? obj = new Object();
                        obj.f2653a = view;
                        obj.b = str;
                        obj.f2654c = uVar;
                        obj.f2655d = windowId;
                        obj.f2656e = this;
                        obj.f = k2;
                        p2.put(k2, obj);
                        this.f2684z.add(k2);
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            } else {
                ViewGroup viewGroup3 = viewGroup;
            }
            r rVar5 = rVar2;
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                j jVar2 = (j) p2.getOrDefault((Animator) this.f2684z.get(sparseIntArray.keyAt(i9)), (Object) null);
                jVar2.f.setStartDelay(jVar2.f.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i2 = this.f2679u - 1;
        this.f2679u = i2;
        if (i2 == 0) {
            v(this, l.b);
            for (int i3 = 0; i3 < ((C0292e) this.f2670l.f1184c).g(); i3++) {
                View view = (View) ((C0292e) this.f2670l.f1184c).h(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C0292e) this.f2671m.f1184c).g(); i4++) {
                View view2 = (View) ((C0292e) this.f2671m.f1184c).h(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2681w = true;
        }
    }

    public final u n(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0150a aVar = this.f2672n;
        if (aVar != null) {
            return aVar.n(view, z2);
        }
        if (z2) {
            arrayList = this.f2674p;
        } else {
            arrayList = this.f2675q;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            u uVar = (u) arrayList.get(i2);
            if (uVar == null) {
                return null;
            }
            if (uVar.b == view) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return null;
        }
        if (z2) {
            arrayList2 = this.f2675q;
        } else {
            arrayList2 = this.f2674p;
        }
        return (u) arrayList2.get(i2);
    }

    public final m o() {
        C0150a aVar = this.f2672n;
        if (aVar != null) {
            return aVar.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        r rVar;
        C0150a aVar = this.f2672n;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        if (z2) {
            rVar = this.f2670l;
        } else {
            rVar = this.f2671m;
        }
        return (u) ((C0289b) rVar.f1183a).getOrDefault(view, (Object) null);
    }

    public boolean s(u uVar, u uVar2) {
        if (!(uVar == null || uVar2 == null)) {
            String[] q2 = q();
            if (q2 != null) {
                for (String u2 : q2) {
                    if (u(uVar, uVar2, u2)) {
                        return true;
                    }
                }
            } else {
                for (String u3 : uVar.f2691a.keySet()) {
                    if (u(uVar, uVar2, u3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2668j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2669k;
        if ((size != 0 || arrayList2.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !arrayList2.contains(view)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f2682x;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f2683y;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f2683y.size();
            k[] kVarArr = this.f2676r;
            if (kVarArr == null) {
                kVarArr = new k[size];
            }
            this.f2676r = null;
            k[] kVarArr2 = (k[]) this.f2683y.toArray(kVarArr);
            for (int i2 = 0; i2 < size; i2++) {
                lVar.a(kVarArr2[i2], mVar);
                kVarArr2[i2] = null;
            }
            this.f2676r = kVarArr2;
        }
    }

    public void w(ViewGroup viewGroup) {
        if (!this.f2681w) {
            ArrayList arrayList = this.f2677s;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2678t);
            this.f2678t = f2661B;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
            }
            this.f2678t = animatorArr;
            v(this, l.f2659d);
            this.f2680v = true;
        }
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f2683y;
        if (arrayList != null) {
            if (!arrayList.remove(kVar) && (mVar = this.f2682x) != null) {
                mVar.x(kVar);
            }
            if (this.f2683y.size() == 0) {
                this.f2683y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f2680v) {
            if (!this.f2681w) {
                ArrayList arrayList = this.f2677s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2678t);
                this.f2678t = f2661B;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f2678t = animatorArr;
                v(this, l.f2660e);
            }
            this.f2680v = false;
        }
    }

    public void z() {
        G();
        C0289b p2 = p();
        ArrayList arrayList = this.f2684z;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new Z(this, p2));
                    long j2 = this.f2666h;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2665g;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2667i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new H0.m(2, (Object) this));
                    animator.start();
                }
            }
        }
        this.f2684z.clear();
        m();
    }

    public void B(l lVar) {
    }

    public void f(u uVar) {
    }

    public void E() {
    }
}

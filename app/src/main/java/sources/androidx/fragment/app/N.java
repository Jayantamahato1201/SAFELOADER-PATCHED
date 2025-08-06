package androidx.fragment.app;

import A.g;
import A.j;
import E.c;
import E.d;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import q.h;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public int f1266a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public final C0058o f1267c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1268d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f1269e = new HashSet();
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1270g = false;

    /* renamed from: h  reason: collision with root package name */
    public final I f1271h;

    public N(int i2, int i3, I i4, d dVar) {
        this.f1266a = i2;
        this.b = i3;
        this.f1267c = i4.f1252c;
        dVar.a(new j(17, (Object) this));
        this.f1271h = i4;
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            HashSet hashSet = this.f1269e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d dVar = (d) obj;
                synchronized (dVar) {
                    try {
                        if (!dVar.f86a) {
                            dVar.f86a = true;
                            dVar.f87c = true;
                            c cVar = dVar.b;
                            if (cVar != null) {
                                try {
                                    cVar.q();
                                } catch (Throwable th) {
                                    synchronized (dVar) {
                                        dVar.f87c = false;
                                        dVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (dVar) {
                                dVar.f87c = false;
                                dVar.notifyAll();
                            }
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f1270g) {
            if (D.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1270g = true;
            ArrayList arrayList = this.f1268d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
        this.f1271h.k();
    }

    public final void c(int i2, int i3) {
        int b2 = h.b(i3);
        C0058o oVar = this.f1267c;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    if (D.D(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + g.n(this.f1266a) + " -> REMOVED. mLifecycleImpact  = " + g.m(this.b) + " to REMOVING.");
                    }
                    this.f1266a = 1;
                    this.b = 3;
                }
            } else if (this.f1266a == 1) {
                if (D.D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + g.m(this.b) + " to ADDING.");
                }
                this.f1266a = 2;
                this.b = 2;
            }
        } else if (this.f1266a != 1) {
            if (D.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + g.n(this.f1266a) + " -> " + g.n(i2) + ". ");
            }
            this.f1266a = i2;
        }
    }

    public final void d() {
        float f2;
        if (this.b == 2) {
            I i2 = this.f1271h;
            C0058o oVar = i2.f1252c;
            View findFocus = oVar.f1346E.findFocus();
            if (findFocus != null) {
                oVar.f().f1341k = findFocus;
                if (D.D(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                }
            }
            View x2 = this.f1267c.x();
            if (x2.getParent() == null) {
                i2.b();
                x2.setAlpha(0.0f);
            }
            if (x2.getAlpha() == 0.0f && x2.getVisibility() == 0) {
                x2.setVisibility(4);
            }
            C0057n nVar = oVar.f1349H;
            if (nVar == null) {
                f2 = 1.0f;
            } else {
                f2 = nVar.f1340j;
            }
            x2.setAlpha(f2);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + g.n(this.f1266a) + "} {mLifecycleImpact = " + g.m(this.b) + "} {mFragment = " + this.f1267c + "}";
    }
}

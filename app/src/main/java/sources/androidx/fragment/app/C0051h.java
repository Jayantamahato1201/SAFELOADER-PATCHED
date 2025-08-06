package androidx.fragment.app;

import A.g;
import A.j;
import E.d;
import E0.e;
import F.c;
import F.p;
import I.O;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.cheatbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.h;

/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
public final class C0051h {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1311a;
    public final ArrayList b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1312c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1313d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1314e = false;

    public C0051h(ViewGroup viewGroup) {
        this.f1311a = viewGroup;
    }

    public static C0051h f(ViewGroup viewGroup, e eVar) {
        Object tag = viewGroup.getTag(R.id.MT_Bin);
        if (tag instanceof C0051h) {
            return (C0051h) tag;
        }
        eVar.getClass();
        C0051h hVar = new C0051h(viewGroup);
        viewGroup.setTag(R.id.MT_Bin, hVar);
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, E.d] */
    public final void a(int i2, int i3, I i4) {
        synchronized (this.b) {
            try {
                ? obj = new Object();
                N d2 = d(i4.f1252c);
                if (d2 != null) {
                    d2.c(i2, i3);
                    return;
                }
                N n2 = new N(i2, i3, i4, obj);
                this.b.add(n2);
                n2.f1268d.add(new M(this, n2, 0));
                n2.f1268d.add(new M(this, n2, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r15v3, types: [java.lang.Object, E.d] */
    /* JADX WARNING: type inference failed for: r8v11, types: [androidx.fragment.app.e, java.lang.Object, androidx.fragment.app.f] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, E.d] */
    public final void b(ArrayList arrayList, boolean z2) {
        boolean z3;
        boolean z4;
        ArrayList arrayList2 = arrayList;
        boolean z5 = z2;
        int size = arrayList2.size();
        boolean z6 = false;
        N n2 = null;
        N n3 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            N n4 = (N) obj;
            int c2 = g.c(n4.f1267c.f1346E);
            int b2 = h.b(n4.f1266a);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (!(b2 == 2 || b2 == 3)) {
                    }
                } else if (c2 != 2) {
                    n3 = n4;
                }
            }
            if (c2 == 2 && n2 == null) {
                n2 = n4;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            N n5 = (N) obj2;
            ? obj3 = new Object();
            n5.d();
            HashSet hashSet = n5.f1269e;
            hashSet.add(obj3);
            ? fVar = new C0049f(n5, obj3);
            fVar.f1308d = z6;
            fVar.f1307c = z5;
            arrayList3.add(fVar);
            ? obj4 = new Object();
            n5.d();
            hashSet.add(obj4);
            if (!z5 ? n5 != n3 : n5 != n2) {
                z4 = false;
            } else {
                z4 = true;
            }
            C0049f fVar2 = new C0049f(n5, obj4);
            int i4 = n5.f1266a;
            C0058o oVar = n5.f1267c;
            if (i4 == 2) {
                if (z5) {
                    oVar.getClass();
                } else {
                    oVar.getClass();
                }
                if (z5) {
                    oVar.getClass();
                } else {
                    oVar.getClass();
                }
            } else if (z5) {
                oVar.getClass();
            } else {
                oVar.getClass();
            }
            if (z4) {
                if (z5) {
                    oVar.getClass();
                } else {
                    oVar.getClass();
                }
            }
            arrayList4.add(fVar2);
            n5.f1268d.add(new p(this, arrayList5, n5));
            z6 = false;
        }
        HashMap hashMap = new HashMap();
        int size3 = arrayList4.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj5 = arrayList4.get(i5);
            i5++;
            N n6 = (N) ((C0050g) obj5).f1310a;
            int c3 = g.c(n6.f1267c.f1346E);
            int i6 = n6.f1266a;
        }
        int size4 = arrayList4.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj6 = arrayList4.get(i7);
            i7++;
            C0050g gVar = (C0050g) obj6;
            hashMap.put((N) gVar.f1310a, Boolean.FALSE);
            gVar.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1311a;
        Context context = viewGroup.getContext();
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList3.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            C0048e eVar = (C0048e) it.next();
            N n7 = (N) eVar.f1310a;
            int c4 = g.c(n7.f1267c.f1346E);
            int i8 = n7.f1266a;
            if (c4 == i8 || !(c4 == 2 || i8 == 2)) {
                eVar.d();
            } else {
                c j2 = eVar.j(context);
                if (j2 == null) {
                    eVar.d();
                } else {
                    Animator animator = (Animator) j2.f194c;
                    if (animator == null) {
                        arrayList6.add(eVar);
                    } else {
                        N n8 = (N) eVar.f1310a;
                        boolean equals = Boolean.TRUE.equals(hashMap.get(n8));
                        C0058o oVar2 = n8.f1267c;
                        if (equals) {
                            if (D.D(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + oVar2 + " as this Fragment was involved in a Transition.");
                            }
                            eVar.d();
                        } else {
                            if (n8.f1266a == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList5.remove(n8);
                            }
                            View view = oVar2.f1346E;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0046c(viewGroup, view, z3, n8, eVar));
                            animator.setTarget(view);
                            animator.start();
                            ((d) eVar.b).a(new j(14, (Object) animator));
                            z7 = true;
                        }
                    }
                }
            }
        }
        int size5 = arrayList6.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj7 = arrayList6.get(i9);
            i9++;
            C0048e eVar2 = (C0048e) obj7;
            N n9 = (N) eVar2.f1310a;
            C0058o oVar3 = n9.f1267c;
            if (containsValue) {
                if (D.D(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + oVar3 + " as Animations cannot run alongside Transitions.");
                }
                eVar2.d();
            } else if (z7) {
                if (D.D(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + oVar3 + " as Animations cannot run alongside Animators.");
                }
                eVar2.d();
            } else {
                View view2 = oVar3.f1346E;
                c j3 = eVar2.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.b;
                animation.getClass();
                if (n9.f1266a != 1) {
                    view2.startAnimation(animation);
                    eVar2.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    s sVar = new s(animation, viewGroup, view2);
                    sVar.setAnimationListener(new C0047d(viewGroup, view2, eVar2));
                    view2.startAnimation(sVar);
                }
                ((d) eVar2.b).a(new N.g(view2, viewGroup, eVar2, 1));
            }
        }
        int size6 = arrayList5.size();
        int i10 = 0;
        while (i10 < size6) {
            Object obj8 = arrayList5.get(i10);
            i10++;
            N n10 = (N) obj8;
            g.a(n10.f1267c.f1346E, n10.f1266a);
        }
        arrayList5.clear();
    }

    public final void c() {
        if (!this.f1314e) {
            ViewGroup viewGroup = this.f1311a;
            WeakHashMap weakHashMap = O.f393a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.f1313d = false;
                return;
            }
            synchronized (this.b) {
                try {
                    if (!this.b.isEmpty()) {
                        ArrayList arrayList = new ArrayList(this.f1312c);
                        this.f1312c.clear();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            N n2 = (N) obj;
                            if (D.D(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + n2);
                            }
                            n2.a();
                            if (!n2.f1270g) {
                                this.f1312c.add(n2);
                            }
                        }
                        g();
                        ArrayList arrayList2 = new ArrayList(this.b);
                        this.b.clear();
                        this.f1312c.addAll(arrayList2);
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            i3++;
                            ((N) obj2).d();
                        }
                        b(arrayList2, this.f1313d);
                        this.f1313d = false;
                    }
                } finally {
                }
            }
        }
    }

    public final N d(C0058o oVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            N n2 = (N) obj;
            if (n2.f1267c.equals(oVar) && !n2.f) {
                return n2;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1311a;
        WeakHashMap weakHashMap = O.f393a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((N) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f1312c);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    N n2 = (N) obj2;
                    if (D.D(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1311a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(n2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    n2.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj3 = arrayList3.get(i2);
                    i2++;
                    N n3 = (N) obj3;
                    if (D.D(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1311a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(n3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    n3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            N n2 = (N) obj;
            if (n2.b == 2) {
                n2.c(g.b(n2.f1267c.x().getVisibility()), 1);
            }
        }
    }
}

package androidx.fragment.app;

import F.c;
import H0.q;
import I.B;
import I.O;
import N.g;
import Y.a;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.K;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.cheatbox.R;
import e.C0137h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import n.l;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final c f1251a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final C0058o f1252c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1253d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1254e = -1;

    public I(c cVar, g gVar, C0058o oVar) {
        this.f1251a = cVar;
        this.b = gVar;
        this.f1252c = oVar;
    }

    public final void a() {
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + oVar);
        }
        Bundle bundle = oVar.b;
        oVar.f1375t.I();
        oVar.f1358a = 3;
        oVar.f1345C = true;
        if (D.D(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + oVar);
        }
        View view = oVar.f1346E;
        if (view != null) {
            Bundle bundle2 = oVar.b;
            SparseArray sparseArray = oVar.f1359c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                oVar.f1359c = null;
            }
            if (oVar.f1346E != null) {
                K k2 = oVar.f1354M;
                k2.f1262c.b(oVar.f1360d);
                oVar.f1360d = null;
            }
            oVar.f1345C = false;
            oVar.u(bundle2);
            if (!oVar.f1345C) {
                throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onViewStateRestored()");
            } else if (oVar.f1346E != null) {
                oVar.f1354M.c(C0070l.ON_CREATE);
            }
        }
        oVar.b = null;
        D d2 = oVar.f1375t;
        d2.f1221y = false;
        d2.f1222z = false;
        d2.f1197F.f1234h = false;
        d2.s(4);
        this.f1251a.d(false);
    }

    public final void b() {
        View view;
        View view2;
        g gVar = this.b;
        gVar.getClass();
        C0058o oVar = this.f1252c;
        ViewGroup viewGroup = oVar.D;
        int i2 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) gVar.b;
            int indexOf = arrayList.indexOf(oVar);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        C0058o oVar2 = (C0058o) arrayList.get(indexOf);
                        if (oVar2.D == viewGroup && (view = oVar2.f1346E) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C0058o oVar3 = (C0058o) arrayList.get(i3);
                    if (oVar3.D == viewGroup && (view2 = oVar3.f1346E) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        oVar.D.addView(oVar.f1346E, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.fragment.app.I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.D.D(r0)
            androidx.fragment.app.o r1 = r7.f1252c
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L_0x001c:
            androidx.fragment.app.o r0 = r1.f1362g
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            N.g r4 = r7.b
            r5 = 0
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.f1361e
            java.lang.Object r4 = r4.f606c
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            androidx.fragment.app.I r0 = (androidx.fragment.app.I) r0
            if (r0 == 0) goto L_0x0041
            androidx.fragment.app.o r2 = r1.f1362g
            java.lang.String r2 = r2.f1361e
            r1.f1363h = r2
            r1.f1362g = r5
            r5 = r0
            goto L_0x008d
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            androidx.fragment.app.o r1 = r1.f1362g
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = r1.f1363h
            if (r0 == 0) goto L_0x008d
            java.lang.Object r4 = r4.f606c
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            r5 = r0
            androidx.fragment.app.I r5 = (androidx.fragment.app.I) r5
            if (r5 == 0) goto L_0x0070
            goto L_0x008d
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r1.f1363h
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            r5.k()
        L_0x0092:
            androidx.fragment.app.D r0 = r1.f1373r
            androidx.fragment.app.r r2 = r0.f1210n
            r1.f1374s = r2
            androidx.fragment.app.o r0 = r0.f1212p
            r1.f1376u = r0
            F.c r0 = r7.f1251a
            r2 = 0
            r0.j(r2)
            java.util.ArrayList r3 = r1.f1357P
            java.util.Iterator r4 = r3.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x010b
            r3.clear()
            androidx.fragment.app.D r3 = r1.f1375t
            androidx.fragment.app.r r4 = r1.f1374s
            Q0.l r5 = r1.c()
            r3.b(r4, r5, r1)
            r1.f1358a = r2
            r1.f1345C = r2
            androidx.fragment.app.r r3 = r1.f1374s
            e.h r3 = r3.f1385m
            r1.l(r3)
            boolean r3 = r1.f1345C
            if (r3 == 0) goto L_0x00f4
            androidx.fragment.app.D r3 = r1.f1373r
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.f1208l
            java.util.Iterator r3 = r3.iterator()
        L_0x00d3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.G r4 = (androidx.fragment.app.G) r4
            r4.a()
            goto L_0x00d3
        L_0x00e3:
            androidx.fragment.app.D r1 = r1.f1375t
            r1.f1221y = r2
            r1.f1222z = r2
            androidx.fragment.app.F r3 = r1.f1197F
            r3.f1234h = r2
            r1.s(r2)
            r0.e(r2)
            return
        L_0x00f4:
            androidx.fragment.app.O r0 = new androidx.fragment.app.O
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x010b:
            java.lang.ClassCastException r0 = A.g.e(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.I.c():void");
    }

    public final int d() {
        int i2;
        N n2;
        C0058o oVar = this.f1252c;
        if (oVar.f1373r == null) {
            return oVar.f1358a;
        }
        int i3 = this.f1254e;
        int ordinal = oVar.f1352K.ordinal();
        int i4 = 0;
        if (ordinal == 1) {
            i3 = Math.min(i3, 0);
        } else if (ordinal == 2) {
            i3 = Math.min(i3, 1);
        } else if (ordinal == 3) {
            i3 = Math.min(i3, 5);
        } else if (ordinal != 4) {
            i3 = Math.min(i3, -1);
        }
        if (oVar.f1368m) {
            if (oVar.f1369n) {
                i3 = Math.max(this.f1254e, 2);
                View view = oVar.f1346E;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = this.f1254e < 4 ? Math.min(i3, oVar.f1358a) : Math.min(i3, 1);
            }
        }
        if (!oVar.f1366k) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = oVar.D;
        if (viewGroup != null) {
            C0051h f = C0051h.f(viewGroup, oVar.j().B());
            f.getClass();
            N d2 = f.d(oVar);
            if (d2 != null) {
                i2 = d2.b;
            } else {
                i2 = 0;
            }
            ArrayList arrayList = f.f1312c;
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    n2 = null;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                n2 = (N) obj;
                if (n2.f1267c.equals(oVar) && !n2.f) {
                    break;
                }
            }
            if (n2 == null || !(i2 == 0 || i2 == 1)) {
                i4 = i2;
            } else {
                i4 = n2.b;
            }
        }
        if (i4 == 2) {
            i3 = Math.min(i3, 6);
        } else if (i4 == 3) {
            i3 = Math.max(i3, 3);
        } else if (oVar.f1367l) {
            if (oVar.f1372q > 0) {
                i3 = Math.min(i3, 1);
            } else {
                i3 = Math.min(i3, -1);
            }
        }
        if (oVar.f1347F && oVar.f1358a < 5) {
            i3 = Math.min(i3, 4);
        }
        if (D.D(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i3 + " for " + oVar);
        }
        return i3;
    }

    public final void e() {
        Parcelable parcelable;
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "moveto CREATED: " + oVar);
        }
        if (!oVar.f1351J) {
            c cVar = this.f1251a;
            cVar.k(false);
            Bundle bundle = oVar.b;
            oVar.f1375t.I();
            oVar.f1358a = 1;
            oVar.f1345C = false;
            oVar.f1353L.a(new Fragment$5(oVar));
            oVar.f1356O.b(bundle);
            oVar.m(bundle);
            oVar.f1351J = true;
            if (oVar.f1345C) {
                oVar.f1353L.d(C0070l.ON_CREATE);
                cVar.f(false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = oVar.b;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            oVar.f1375t.N(parcelable);
            D d2 = oVar.f1375t;
            d2.f1221y = false;
            d2.f1222z = false;
            d2.f1197F.f1234h = false;
            d2.s(1);
        }
        oVar.f1358a = 1;
    }

    public final void f() {
        String str;
        C0058o oVar = this.f1252c;
        if (!oVar.f1368m) {
            if (D.D(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
            }
            LayoutInflater q2 = oVar.q(oVar.b);
            ViewGroup viewGroup = oVar.D;
            if (viewGroup == null) {
                int i2 = oVar.f1378w;
                if (i2 == 0) {
                    viewGroup = null;
                } else if (i2 != -1) {
                    viewGroup = (ViewGroup) oVar.f1373r.f1211o.I(i2);
                    if (viewGroup == null && !oVar.f1370o) {
                        try {
                            str = oVar.w().getResources().getResourceName(oVar.f1378w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(oVar.f1378w) + " (" + str + ") for fragment " + oVar);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + oVar + " for a container view with no id");
                }
            }
            oVar.D = viewGroup;
            oVar.v(q2, viewGroup, oVar.b);
            View view = oVar.f1346E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                oVar.f1346E.setTag(R.id.MT_Bin, oVar);
                if (viewGroup != null) {
                    b();
                }
                if (oVar.f1380y) {
                    oVar.f1346E.setVisibility(8);
                }
                View view2 = oVar.f1346E;
                WeakHashMap weakHashMap = O.f393a;
                if (view2.isAttachedToWindow()) {
                    B.c(oVar.f1346E);
                } else {
                    View view3 = oVar.f1346E;
                    view3.addOnAttachStateChangeListener(new q(1, view3));
                }
                oVar.f1375t.s(2);
                this.f1251a.p(false);
                int visibility = oVar.f1346E.getVisibility();
                oVar.f().f1340j = oVar.f1346E.getAlpha();
                if (oVar.D != null && visibility == 0) {
                    View findFocus = oVar.f1346E.findFocus();
                    if (findFocus != null) {
                        oVar.f().f1341k = findFocus;
                        if (D.D(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                        }
                    }
                    oVar.f1346E.setAlpha(0.0f);
                }
            }
            oVar.f1358a = 2;
        }
    }

    public final void g() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0058o j2;
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "movefrom CREATED: " + oVar);
        }
        int i2 = 0;
        if (!oVar.f1367l || oVar.f1372q > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        g gVar = this.b;
        if (!z2) {
            F f = (F) gVar.f607d;
            if (f.f1230c.containsKey(oVar.f1361e) && f.f) {
                z5 = f.f1233g;
            } else {
                z5 = true;
            }
            if (!z5) {
                String str = oVar.f1363h;
                if (!(str == null || (j2 = gVar.j(str)) == null || !j2.f1343A)) {
                    oVar.f1362g = j2;
                }
                oVar.f1358a = 0;
                return;
            }
        }
        r rVar = oVar.f1374s;
        if (rVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            z4 = ((F) gVar.f607d).f1233g;
        } else {
            C0137h hVar = rVar.f1385m;
            if (A.g.k(hVar)) {
                z4 = !hVar.isChangingConfigurations();
            } else {
                z4 = true;
            }
        }
        if (z2 || z4) {
            F f2 = (F) gVar.f607d;
            f2.getClass();
            if (D.D(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + oVar);
            }
            HashMap hashMap = f2.f1231d;
            F f3 = (F) hashMap.get(oVar.f1361e);
            if (f3 != null) {
                f3.a();
                hashMap.remove(oVar.f1361e);
            }
            HashMap hashMap2 = f2.f1232e;
            K k2 = (K) hashMap2.get(oVar.f1361e);
            if (k2 != null) {
                k2.a();
                hashMap2.remove(oVar.f1361e);
            }
        }
        oVar.f1375t.k();
        oVar.f1353L.d(C0070l.ON_DESTROY);
        oVar.f1358a = 0;
        oVar.f1351J = false;
        oVar.f1345C = true;
        this.f1251a.g(false);
        ArrayList l2 = gVar.l();
        int size = l2.size();
        while (i2 < size) {
            Object obj = l2.get(i2);
            i2++;
            I i3 = (I) obj;
            if (i3 != null) {
                String str2 = oVar.f1361e;
                C0058o oVar2 = i3.f1252c;
                if (str2.equals(oVar2.f1363h)) {
                    oVar2.f1362g = oVar;
                    oVar2.f1363h = null;
                }
            }
        }
        String str3 = oVar.f1363h;
        if (str3 != null) {
            oVar.f1362g = gVar.j(str3);
        }
        gVar.C(this);
    }

    public final void h() {
        View view;
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + oVar);
        }
        ViewGroup viewGroup = oVar.D;
        if (!(viewGroup == null || (view = oVar.f1346E) == null)) {
            viewGroup.removeView(view);
        }
        oVar.f1375t.s(1);
        if (oVar.f1346E != null) {
            K k2 = oVar.f1354M;
            k2.f();
            if (k2.b.f1439c.compareTo(m.f1432h) >= 0) {
                oVar.f1354M.c(C0070l.ON_DESTROY);
            }
        }
        oVar.f1358a = 1;
        oVar.f1345C = false;
        oVar.o();
        if (oVar.f1345C) {
            l lVar = ((a) new c((r) oVar, oVar.d()).f194c).f783c;
            if (lVar.f3709h <= 0) {
                oVar.f1371p = false;
                this.f1251a.q(false);
                oVar.D = null;
                oVar.f1346E = null;
                oVar.f1354M = null;
                oVar.f1355N.e((Object) null);
                oVar.f1369n = false;
                return;
            }
            lVar.f3708g[0].getClass();
            throw new ClassCastException();
        }
        throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean z2;
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + oVar);
        }
        oVar.f1358a = -1;
        oVar.f1345C = false;
        oVar.p();
        if (oVar.f1345C) {
            D d2 = oVar.f1375t;
            if (!d2.f1193A) {
                d2.k();
                oVar.f1375t = new D();
            }
            this.f1251a.h(false);
            oVar.f1358a = -1;
            oVar.f1374s = null;
            oVar.f1376u = null;
            oVar.f1373r = null;
            if (!oVar.f1367l || oVar.f1372q > 0) {
                F f = (F) this.b.f607d;
                if (f.f1230c.containsKey(oVar.f1361e) && f.f) {
                    z2 = f.f1233g;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
            }
            if (D.D(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + oVar);
            }
            oVar.f1353L = new t(oVar);
            oVar.f1356O = new androidx.activity.l(oVar);
            oVar.f1361e = UUID.randomUUID().toString();
            oVar.f1366k = false;
            oVar.f1367l = false;
            oVar.f1368m = false;
            oVar.f1369n = false;
            oVar.f1370o = false;
            oVar.f1372q = 0;
            oVar.f1373r = null;
            oVar.f1375t = new D();
            oVar.f1374s = null;
            oVar.f1377v = 0;
            oVar.f1378w = 0;
            oVar.f1379x = null;
            oVar.f1380y = false;
            oVar.f1381z = false;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        C0058o oVar = this.f1252c;
        if (oVar.f1368m && oVar.f1369n && !oVar.f1371p) {
            if (D.D(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
            }
            oVar.v(oVar.q(oVar.b), (ViewGroup) null, oVar.b);
            View view = oVar.f1346E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                oVar.f1346E.setTag(R.id.MT_Bin, oVar);
                if (oVar.f1380y) {
                    oVar.f1346E.setVisibility(8);
                }
                oVar.f1375t.s(2);
                this.f1251a.p(false);
                oVar.f1358a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f1253d;
        C0058o oVar = this.f1252c;
        if (!z2) {
            try {
                this.f1253d = true;
                while (true) {
                    int d2 = d();
                    int i2 = oVar.f1358a;
                    if (d2 != i2) {
                        if (d2 <= i2) {
                            switch (i2 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    oVar.f1358a = 1;
                                    break;
                                case 2:
                                    oVar.f1369n = false;
                                    oVar.f1358a = 2;
                                    break;
                                case 3:
                                    if (D.D(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + oVar);
                                    }
                                    if (oVar.f1346E != null && oVar.f1359c == null) {
                                        o();
                                    }
                                    if (!(oVar.f1346E == null || (viewGroup2 = oVar.D) == null)) {
                                        C0051h f = C0051h.f(viewGroup2, oVar.j().B());
                                        f.getClass();
                                        if (D.D(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar);
                                        }
                                        f.a(1, 3, this);
                                    }
                                    oVar.f1358a = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    oVar.f1358a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(oVar.f1346E == null || (viewGroup3 = oVar.D) == null)) {
                                        C0051h f2 = C0051h.f(viewGroup3, oVar.j().B());
                                        int b2 = A.g.b(oVar.f1346E.getVisibility());
                                        f2.getClass();
                                        if (D.D(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar);
                                        }
                                        f2.a(b2, 2, this);
                                    }
                                    oVar.f1358a = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    oVar.f1358a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (oVar.f1350I) {
                            if (!(oVar.f1346E == null || (viewGroup = oVar.D) == null)) {
                                C0051h f3 = C0051h.f(viewGroup, oVar.j().B());
                                if (oVar.f1380y) {
                                    f3.getClass();
                                    if (D.D(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar);
                                    }
                                    f3.a(3, 1, this);
                                } else {
                                    f3.getClass();
                                    if (D.D(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar);
                                    }
                                    f3.a(2, 1, this);
                                }
                            }
                            D d3 = oVar.f1373r;
                            if (d3 != null && oVar.f1366k && D.E(oVar)) {
                                d3.f1220x = true;
                            }
                            oVar.f1350I = false;
                        }
                        this.f1253d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f1253d = false;
                throw th;
            }
        } else if (D.D(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + oVar);
        }
    }

    public final void l() {
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "movefrom RESUMED: " + oVar);
        }
        oVar.f1375t.s(5);
        if (oVar.f1346E != null) {
            oVar.f1354M.c(C0070l.ON_PAUSE);
        }
        oVar.f1353L.d(C0070l.ON_PAUSE);
        oVar.f1358a = 6;
        oVar.f1345C = true;
        this.f1251a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        C0058o oVar = this.f1252c;
        Bundle bundle = oVar.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            oVar.f1359c = oVar.b.getSparseParcelableArray("android:view_state");
            oVar.f1360d = oVar.b.getBundle("android:view_registry_state");
            String string = oVar.b.getString("android:target_state");
            oVar.f1363h = string;
            if (string != null) {
                oVar.f1364i = oVar.b.getInt("android:target_req_state", 0);
            }
            boolean z2 = oVar.b.getBoolean("android:user_visible_hint", true);
            oVar.f1348G = z2;
            if (!z2) {
                oVar.f1347F = true;
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "moveto RESUMED: " + oVar);
        }
        C0057n nVar = oVar.f1349H;
        if (nVar == null) {
            view = null;
        } else {
            view = nVar.f1341k;
        }
        if (view != null) {
            if (view != oVar.f1346E) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == oVar.f1346E) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (D.D(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(oVar);
                sb.append(" resulting in focused view ");
                sb.append(oVar.f1346E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        oVar.f().f1341k = null;
        oVar.f1375t.I();
        oVar.f1375t.w(true);
        oVar.f1358a = 7;
        oVar.f1345C = true;
        t tVar = oVar.f1353L;
        C0070l lVar = C0070l.ON_RESUME;
        tVar.d(lVar);
        if (oVar.f1346E != null) {
            oVar.f1354M.b.d(lVar);
        }
        D d2 = oVar.f1375t;
        d2.f1221y = false;
        d2.f1222z = false;
        d2.f1197F.f1234h = false;
        d2.s(7);
        this.f1251a.l(false);
        oVar.b = null;
        oVar.f1359c = null;
        oVar.f1360d = null;
    }

    public final void o() {
        C0058o oVar = this.f1252c;
        if (oVar.f1346E != null) {
            SparseArray sparseArray = new SparseArray();
            oVar.f1346E.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                oVar.f1359c = sparseArray;
            }
            Bundle bundle = new Bundle();
            oVar.f1354M.f1262c.c(bundle);
            if (!bundle.isEmpty()) {
                oVar.f1360d = bundle;
            }
        }
    }

    public final void p() {
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "moveto STARTED: " + oVar);
        }
        oVar.f1375t.I();
        oVar.f1375t.w(true);
        oVar.f1358a = 5;
        oVar.f1345C = false;
        oVar.s();
        if (oVar.f1345C) {
            t tVar = oVar.f1353L;
            C0070l lVar = C0070l.ON_START;
            tVar.d(lVar);
            if (oVar.f1346E != null) {
                oVar.f1354M.b.d(lVar);
            }
            D d2 = oVar.f1375t;
            d2.f1221y = false;
            d2.f1222z = false;
            d2.f1197F.f1234h = false;
            d2.s(5);
            this.f1251a.n(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean D = D.D(3);
        C0058o oVar = this.f1252c;
        if (D) {
            Log.d("FragmentManager", "movefrom STARTED: " + oVar);
        }
        D d2 = oVar.f1375t;
        d2.f1222z = true;
        d2.f1197F.f1234h = true;
        d2.s(4);
        if (oVar.f1346E != null) {
            oVar.f1354M.c(C0070l.ON_STOP);
        }
        oVar.f1353L.d(C0070l.ON_STOP);
        oVar.f1358a = 4;
        oVar.f1345C = false;
        oVar.t();
        if (oVar.f1345C) {
            this.f1251a.o(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + oVar + " did not call through to super.onStop()");
    }

    public I(c cVar, g gVar, ClassLoader classLoader, x xVar, H h2) {
        this.f1251a = cVar;
        this.b = gVar;
        C0058o a2 = xVar.a(h2.f);
        this.f1252c = a2;
        Bundle bundle = h2.f1247o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.z(bundle);
        a2.f1361e = h2.f1239g;
        a2.f1368m = h2.f1240h;
        a2.f1370o = true;
        a2.f1377v = h2.f1241i;
        a2.f1378w = h2.f1242j;
        a2.f1379x = h2.f1243k;
        a2.f1343A = h2.f1244l;
        a2.f1367l = h2.f1245m;
        a2.f1381z = h2.f1246n;
        a2.f1380y = h2.f1248p;
        a2.f1352K = m.values()[h2.f1249q];
        Bundle bundle2 = h2.f1250r;
        if (bundle2 != null) {
            a2.b = bundle2;
        } else {
            a2.b = new Bundle();
        }
        if (D.D(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public I(c cVar, g gVar, C0058o oVar, H h2) {
        this.f1251a = cVar;
        this.b = gVar;
        this.f1252c = oVar;
        oVar.f1359c = null;
        oVar.f1360d = null;
        oVar.f1372q = 0;
        oVar.f1369n = false;
        oVar.f1366k = false;
        C0058o oVar2 = oVar.f1362g;
        oVar.f1363h = oVar2 != null ? oVar2.f1361e : null;
        oVar.f1362g = null;
        Bundle bundle = h2.f1250r;
        if (bundle != null) {
            oVar.b = bundle;
        } else {
            oVar.b = new Bundle();
        }
    }
}

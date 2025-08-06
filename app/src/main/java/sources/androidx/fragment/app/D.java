package androidx.fragment.app;

import E0.e;
import F.c;
import H0.E;
import N.g;
import Q0.l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.u;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import com.cheatbox.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class D {

    /* renamed from: A  reason: collision with root package name */
    public boolean f1193A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1194B;

    /* renamed from: C  reason: collision with root package name */
    public ArrayList f1195C;
    public ArrayList D;

    /* renamed from: E  reason: collision with root package name */
    public ArrayList f1196E;

    /* renamed from: F  reason: collision with root package name */
    public F f1197F;

    /* renamed from: G  reason: collision with root package name */
    public final E f1198G;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1199a = new ArrayList();
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1200c = new g(2);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1201d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1202e;
    public final u f = new u(this);

    /* renamed from: g  reason: collision with root package name */
    public u f1203g;

    /* renamed from: h  reason: collision with root package name */
    public final w f1204h = new w(this);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1205i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f1206j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final c f1207k;

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList f1208l;

    /* renamed from: m  reason: collision with root package name */
    public int f1209m;

    /* renamed from: n  reason: collision with root package name */
    public r f1210n;

    /* renamed from: o  reason: collision with root package name */
    public l f1211o;

    /* renamed from: p  reason: collision with root package name */
    public C0058o f1212p;

    /* renamed from: q  reason: collision with root package name */
    public C0058o f1213q;

    /* renamed from: r  reason: collision with root package name */
    public final x f1214r;

    /* renamed from: s  reason: collision with root package name */
    public final e f1215s;

    /* renamed from: t  reason: collision with root package name */
    public c f1216t;

    /* renamed from: u  reason: collision with root package name */
    public c f1217u;

    /* renamed from: v  reason: collision with root package name */
    public c f1218v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayDeque f1219w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1220x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1221y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1222z;

    public D() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new e(19, this);
        this.f1207k = new c(this);
        this.f1208l = new CopyOnWriteArrayList();
        this.f1209m = -1;
        this.f1214r = new x(this);
        this.f1215s = new e(20);
        this.f1219w = new ArrayDeque();
        this.f1198G = new E(7, this);
    }

    public static boolean D(int i2) {
        if (Log.isLoggable("FragmentManager", i2)) {
            return true;
        }
        return false;
    }

    public static boolean E(C0058o oVar) {
        oVar.getClass();
        g gVar = oVar.f1375t.f1200c;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (I i2 : ((HashMap) gVar.f606c).values()) {
            if (i2 != null) {
                arrayList.add(i2.f1252c);
            } else {
                arrayList.add((Object) null);
            }
        }
        int size = arrayList.size();
        boolean z2 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0058o oVar2 = (C0058o) obj;
            if (oVar2 != null) {
                z2 = E(oVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(C0058o oVar) {
        if (oVar == null) {
            return true;
        }
        if (!oVar.f1344B) {
            return false;
        }
        if (oVar.f1373r == null || F(oVar.f1376u)) {
            return true;
        }
        return false;
    }

    public static boolean G(C0058o oVar) {
        if (oVar == null) {
            return true;
        }
        D d2 = oVar.f1373r;
        if (!oVar.equals(d2.f1213q) || !G(d2.f1212p)) {
            return false;
        }
        return true;
    }

    public static void U(C0058o oVar) {
        if (D(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.f1380y) {
            oVar.f1380y = false;
            oVar.f1350I = !oVar.f1350I;
        }
    }

    public final x A() {
        C0058o oVar = this.f1212p;
        if (oVar != null) {
            return oVar.f1373r.A();
        }
        return this.f1214r;
    }

    public final e B() {
        C0058o oVar = this.f1212p;
        if (oVar != null) {
            return oVar.f1373r.B();
        }
        return this.f1215s;
    }

    public final void C(C0058o oVar) {
        if (D(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (!oVar.f1380y) {
            oVar.f1380y = true;
            oVar.f1350I = true ^ oVar.f1350I;
            T(oVar);
        }
    }

    public final void H(int i2, boolean z2) {
        HashMap hashMap;
        r rVar;
        if (this.f1210n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f1209m) {
            this.f1209m = i2;
            g gVar = this.f1200c;
            ArrayList arrayList = (ArrayList) gVar.b;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                hashMap = (HashMap) gVar.f606c;
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                I i4 = (I) hashMap.get(((C0058o) obj).f1361e);
                if (i4 != null) {
                    i4.k();
                }
            }
            for (I i5 : hashMap.values()) {
                if (i5 != null) {
                    i5.k();
                    C0058o oVar = i5.f1252c;
                    if (oVar.f1367l && oVar.f1372q <= 0) {
                        gVar.C(i5);
                    }
                }
            }
            V();
            if (this.f1220x && (rVar = this.f1210n) != null && this.f1209m == 7) {
                rVar.f1388p.i().b();
                this.f1220x = false;
            }
        }
    }

    public final void I() {
        if (this.f1210n != null) {
            this.f1221y = false;
            this.f1222z = false;
            this.f1197F.f1234h = false;
            for (C0058o oVar : this.f1200c.t()) {
                if (oVar != null) {
                    oVar.f1375t.I();
                }
            }
        }
    }

    public final boolean J() {
        w(false);
        v(true);
        C0058o oVar = this.f1213q;
        if (oVar != null && oVar.g().J()) {
            return true;
        }
        boolean K2 = K(this.f1195C, this.D, -1, 0);
        if (K2) {
            this.b = true;
            try {
                M(this.f1195C, this.D);
            } finally {
                d();
            }
        }
        W();
        if (this.f1194B) {
            this.f1194B = false;
            V();
        }
        ((HashMap) this.f1200c.f606c).values().removeAll(Collections.singleton((Object) null));
        return K2;
    }

    public final boolean K(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        int i4;
        C0044a aVar;
        ArrayList arrayList3 = this.f1201d;
        if (arrayList3 == null) {
            return false;
        }
        if (i2 >= 0 || (i3 & 1) != 0) {
            if (i2 >= 0) {
                i4 = arrayList3.size() - 1;
                while (i4 >= 0) {
                    C0044a aVar2 = (C0044a) this.f1201d.get(i4);
                    if (i2 >= 0 && i2 == aVar2.f1287r) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    do {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        aVar = (C0044a) this.f1201d.get(i4);
                        if (i2 < 0) {
                            break;
                        }
                    } while (i2 != aVar.f1287r);
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.f1201d.size() - 1) {
                return false;
            }
            for (int size = this.f1201d.size() - 1; size > i4; size--) {
                arrayList.add(this.f1201d.remove(size));
                arrayList2.add(Boolean.TRUE);
            }
            return true;
        }
        int size2 = arrayList3.size() - 1;
        if (size2 < 0) {
            return false;
        }
        arrayList.add(this.f1201d.remove(size2));
        arrayList2.add(Boolean.TRUE);
        return true;
    }

    public final void L(C0058o oVar) {
        boolean z2;
        if (D(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.f1372q);
        }
        if (oVar.f1372q > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!oVar.f1381z || !z2) {
            g gVar = this.f1200c;
            synchronized (((ArrayList) gVar.b)) {
                ((ArrayList) gVar.b).remove(oVar);
            }
            oVar.f1366k = false;
            if (E(oVar)) {
                this.f1220x = true;
            }
            oVar.f1367l = true;
            T(oVar);
        }
    }

    public final void M(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((C0044a) arrayList.get(i2)).f1284o) {
                        if (i3 != i2) {
                            x(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0044a) arrayList.get(i3)).f1284o) {
                                i3++;
                            }
                        }
                        x(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    x(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [java.lang.Object, androidx.fragment.app.J] */
    public final void N(Parcelable parcelable) {
        c cVar;
        boolean z2;
        I i2;
        if (parcelable != null) {
            E e2 = (E) parcelable;
            if (e2.f != null) {
                g gVar = this.f1200c;
                ((HashMap) gVar.f606c).clear();
                ArrayList arrayList = e2.f;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    cVar = this.f1207k;
                    if (i3 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    H h2 = (H) obj;
                    if (h2 != null) {
                        C0058o oVar = (C0058o) this.f1197F.f1230c.get(h2.f1239g);
                        if (oVar != null) {
                            if (D(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                            }
                            i2 = new I(cVar, gVar, oVar, h2);
                        } else {
                            i2 = new I(this.f1207k, this.f1200c, this.f1210n.f1385m.getClassLoader(), A(), h2);
                        }
                        C0058o oVar2 = i2.f1252c;
                        oVar2.f1373r = this;
                        if (D(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + oVar2.f1361e + "): " + oVar2);
                        }
                        i2.m(this.f1210n.f1385m.getClassLoader());
                        gVar.B(i2);
                        i2.f1254e = this.f1209m;
                    }
                }
                F f2 = this.f1197F;
                f2.getClass();
                ArrayList arrayList2 = new ArrayList(f2.f1230c.values());
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    C0058o oVar3 = (C0058o) obj2;
                    if (((HashMap) gVar.f606c).get(oVar3.f1361e) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (D(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + e2.f);
                        }
                        this.f1197F.b(oVar3);
                        oVar3.f1373r = this;
                        I i5 = new I(cVar, gVar, oVar3);
                        i5.f1254e = 1;
                        i5.k();
                        oVar3.f1367l = true;
                        i5.k();
                    }
                }
                ArrayList arrayList3 = e2.f1223g;
                ((ArrayList) gVar.b).clear();
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj3 = arrayList3.get(i6);
                        i6++;
                        String str = (String) obj3;
                        C0058o j2 = gVar.j(str);
                        if (j2 != null) {
                            if (D(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + j2);
                            }
                            gVar.f(j2);
                        } else {
                            throw new IllegalStateException(A.g.i("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                C0058o oVar4 = null;
                if (e2.f1224h != null) {
                    this.f1201d = new ArrayList(e2.f1224h.length);
                    int i7 = 0;
                    while (true) {
                        C0045b[] bVarArr = e2.f1224h;
                        if (i7 >= bVarArr.length) {
                            break;
                        }
                        C0045b bVar = bVarArr[i7];
                        bVar.getClass();
                        C0044a aVar = new C0044a(this);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            int[] iArr = bVar.f;
                            if (i8 >= iArr.length) {
                                break;
                            }
                            ? obj4 = new Object();
                            int i10 = i8 + 1;
                            obj4.f1255a = iArr[i8];
                            if (D(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                            }
                            String str2 = (String) bVar.f1288g.get(i9);
                            if (str2 != null) {
                                obj4.b = gVar.j(str2);
                            } else {
                                obj4.b = oVar4;
                            }
                            obj4.f1259g = m.values()[bVar.f1289h[i9]];
                            obj4.f1260h = m.values()[bVar.f1290i[i9]];
                            int i11 = iArr[i10];
                            obj4.f1256c = i11;
                            int i12 = iArr[i8 + 2];
                            obj4.f1257d = i12;
                            int i13 = i8 + 4;
                            int i14 = iArr[i8 + 3];
                            obj4.f1258e = i14;
                            i8 += 5;
                            int i15 = iArr[i13];
                            obj4.f = i15;
                            aVar.b = i11;
                            aVar.f1273c = i12;
                            aVar.f1274d = i14;
                            aVar.f1275e = i15;
                            aVar.b(obj4);
                            i9++;
                            oVar4 = null;
                        }
                        aVar.f = bVar.f1291j;
                        aVar.f1277h = bVar.f1292k;
                        aVar.f1287r = bVar.f1293l;
                        aVar.f1276g = true;
                        aVar.f1278i = bVar.f1294m;
                        aVar.f1279j = bVar.f1295n;
                        aVar.f1280k = bVar.f1296o;
                        aVar.f1281l = bVar.f1297p;
                        aVar.f1282m = bVar.f1298q;
                        aVar.f1283n = bVar.f1299r;
                        aVar.f1284o = bVar.f1300s;
                        aVar.c(1);
                        if (D(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + aVar.f1287r + "): " + aVar);
                            PrintWriter printWriter = new PrintWriter(new L());
                            aVar.d("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1201d.add(aVar);
                        i7++;
                        oVar4 = null;
                    }
                } else {
                    this.f1201d = null;
                }
                this.f1205i.set(e2.f1225i);
                String str3 = e2.f1226j;
                if (str3 != null) {
                    C0058o j3 = gVar.j(str3);
                    this.f1213q = j3;
                    p(j3);
                }
                ArrayList arrayList4 = e2.f1227k;
                if (arrayList4 != null) {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        Bundle bundle = (Bundle) e2.f1228l.get(i16);
                        bundle.setClassLoader(this.f1210n.f1385m.getClassLoader());
                        this.f1206j.put(arrayList4.get(i16), bundle);
                    }
                }
                this.f1219w = new ArrayDeque(e2.f1229m);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [androidx.fragment.app.E, java.lang.Object] */
    public final E O() {
        int i2;
        ArrayList arrayList;
        C0045b[] bVarArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0051h hVar = (C0051h) it.next();
            if (hVar.f1314e) {
                hVar.f1314e = false;
                hVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0051h) it2.next()).e();
        }
        w(true);
        this.f1221y = true;
        this.f1197F.f1234h = true;
        g gVar = this.f1200c;
        gVar.getClass();
        HashMap hashMap = (HashMap) gVar.f606c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it3.hasNext()) {
                break;
            }
            I i3 = (I) it3.next();
            if (i3 != null) {
                C0058o oVar = i3.f1252c;
                H h2 = new H(oVar);
                if (oVar.f1358a <= -1 || h2.f1250r != null) {
                    h2.f1250r = oVar.b;
                } else {
                    Bundle bundle2 = new Bundle();
                    oVar.r(bundle2);
                    oVar.f1356O.c(bundle2);
                    E O2 = oVar.f1375t.O();
                    if (O2 != null) {
                        bundle2.putParcelable("android:support:fragments", O2);
                    }
                    i3.f1251a.m(false);
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (oVar.f1346E != null) {
                        i3.o();
                    }
                    if (oVar.f1359c != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", oVar.f1359c);
                    }
                    if (oVar.f1360d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", oVar.f1360d);
                    }
                    if (!oVar.f1348G) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", oVar.f1348G);
                    }
                    h2.f1250r = bundle;
                    if (oVar.f1363h != null) {
                        if (bundle == null) {
                            h2.f1250r = new Bundle();
                        }
                        h2.f1250r.putString("android:target_state", oVar.f1363h);
                        int i4 = oVar.f1364i;
                        if (i4 != 0) {
                            h2.f1250r.putInt("android:target_req_state", i4);
                        }
                    }
                }
                arrayList2.add(h2);
                if (D(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + h2.f1250r);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (D(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        g gVar2 = this.f1200c;
        synchronized (((ArrayList) gVar2.b)) {
            try {
                if (((ArrayList) gVar2.b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) gVar2.b).size());
                    ArrayList arrayList3 = (ArrayList) gVar2.b;
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj = arrayList3.get(i5);
                        i5++;
                        C0058o oVar2 = (C0058o) obj;
                        arrayList.add(oVar2.f1361e);
                        if (D(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar2.f1361e + "): " + oVar2);
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ArrayList arrayList4 = this.f1201d;
        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
            bVarArr = null;
        } else {
            bVarArr = new C0045b[size];
            for (i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new C0045b((C0044a) this.f1201d.get(i2));
                if (D(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1201d.get(i2));
                }
            }
        }
        ? obj2 = new Object();
        obj2.f1226j = null;
        ArrayList arrayList5 = new ArrayList();
        obj2.f1227k = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        obj2.f1228l = arrayList6;
        obj2.f = arrayList2;
        obj2.f1223g = arrayList;
        obj2.f1224h = bVarArr;
        obj2.f1225i = this.f1205i.get();
        C0058o oVar3 = this.f1213q;
        if (oVar3 != null) {
            obj2.f1226j = oVar3.f1361e;
        }
        arrayList5.addAll(this.f1206j.keySet());
        arrayList6.addAll(this.f1206j.values());
        obj2.f1229m = new ArrayList(this.f1219w);
        return obj2;
    }

    public final void P() {
        synchronized (this.f1199a) {
            try {
                if (this.f1199a.size() == 1) {
                    this.f1210n.f1386n.removeCallbacks(this.f1198G);
                    this.f1210n.f1386n.post(this.f1198G);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(C0058o oVar, boolean z2) {
        ViewGroup z3 = z(oVar);
        if (z3 != null && (z3 instanceof FragmentContainerView)) {
            ((FragmentContainerView) z3).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void R(C0058o oVar, m mVar) {
        if (!oVar.equals(this.f1200c.j(oVar.f1361e)) || !(oVar.f1374s == null || oVar.f1373r == this)) {
            throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
        }
        oVar.f1352K = mVar;
    }

    public final void S(C0058o oVar) {
        if (oVar != null) {
            if (!oVar.equals(this.f1200c.j(oVar.f1361e)) || !(oVar.f1374s == null || oVar.f1373r == this)) {
                throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        C0058o oVar2 = this.f1213q;
        this.f1213q = oVar;
        p(oVar2);
        p(this.f1213q);
    }

    public final void T(C0058o oVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup z2 = z(oVar);
        if (z2 != null) {
            C0057n nVar = oVar.f1349H;
            boolean z3 = false;
            if (nVar == null) {
                i2 = 0;
            } else {
                i2 = nVar.b;
            }
            if (nVar == null) {
                i3 = 0;
            } else {
                i3 = nVar.f1334c;
            }
            int i6 = i3 + i2;
            if (nVar == null) {
                i4 = 0;
            } else {
                i4 = nVar.f1335d;
            }
            int i7 = i4 + i6;
            if (nVar == null) {
                i5 = 0;
            } else {
                i5 = nVar.f1336e;
            }
            if (i5 + i7 > 0) {
                if (z2.getTag(R.id.MT_Bin) == null) {
                    z2.setTag(R.id.MT_Bin, oVar);
                }
                C0058o oVar2 = (C0058o) z2.getTag(R.id.MT_Bin);
                C0057n nVar2 = oVar.f1349H;
                if (nVar2 != null) {
                    z3 = nVar2.f1333a;
                }
                if (oVar2.f1349H != null) {
                    oVar2.f().f1333a = z3;
                }
            }
        }
    }

    public final void V() {
        ArrayList l2 = this.f1200c.l();
        int size = l2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = l2.get(i2);
            i2++;
            I i3 = (I) obj;
            C0058o oVar = i3.f1252c;
            if (oVar.f1347F) {
                if (this.b) {
                    this.f1194B = true;
                } else {
                    oVar.f1347F = false;
                    i3.k();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [U0.h, T0.a] */
    /* JADX WARNING: type inference failed for: r1v10, types: [U0.h, T0.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r0 = r4.f1204h;
        r1 = r4.f1201d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1 <= 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (G(r4.f1212p) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r0.f1396a = r2;
        r0 = r0.f1397c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r0 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f1199a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f1199a     // Catch:{ all -> 0x0019 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0019 }
            r2 = 1
            if (r1 != 0) goto L_0x001b
            androidx.fragment.app.w r1 = r4.f1204h     // Catch:{ all -> 0x0019 }
            r1.f1396a = r2     // Catch:{ all -> 0x0019 }
            U0.h r1 = r1.f1397c     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            r1.a()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x003f
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            androidx.fragment.app.w r0 = r4.f1204h
            java.util.ArrayList r1 = r4.f1201d
            r3 = 0
            if (r1 == 0) goto L_0x0028
            int r1 = r1.size()
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 <= 0) goto L_0x0034
            androidx.fragment.app.o r1 = r4.f1212p
            boolean r1 = G(r1)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r0.f1396a = r2
            U0.h r0 = r0.f1397c
            if (r0 == 0) goto L_0x003e
            r0.a()
        L_0x003e:
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.D.W():void");
    }

    public final I a(C0058o oVar) {
        if (D(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        I f2 = f(oVar);
        oVar.f1373r = this;
        g gVar = this.f1200c;
        gVar.B(f2);
        if (!oVar.f1381z) {
            gVar.f(oVar);
            oVar.f1367l = false;
            if (oVar.f1346E == null) {
                oVar.f1350I = false;
            }
            if (E(oVar)) {
                this.f1220x = true;
            }
        }
        return f2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.fragment.app.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.r r6, Q0.l r7, androidx.fragment.app.C0058o r8) {
        /*
            r5 = this;
            androidx.fragment.app.r r0 = r5.f1210n
            if (r0 != 0) goto L_0x0159
            r5.f1210n = r6
            r5.f1211o = r7
            r5.f1212p = r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f1208l
            if (r8 == 0) goto L_0x0017
            androidx.fragment.app.y r0 = new androidx.fragment.app.y
            r0.<init>(r8)
            r7.add(r0)
            goto L_0x001c
        L_0x0017:
            if (r6 == 0) goto L_0x001c
            r7.add(r6)
        L_0x001c:
            androidx.fragment.app.o r7 = r5.f1212p
            if (r7 == 0) goto L_0x0023
            r5.W()
        L_0x0023:
            if (r6 == 0) goto L_0x0037
            e.h r7 = r6.f1388p
            androidx.activity.u r7 = r7.h()
            r5.f1203g = r7
            if (r8 == 0) goto L_0x0031
            r0 = r8
            goto L_0x0032
        L_0x0031:
            r0 = r6
        L_0x0032:
            androidx.fragment.app.w r1 = r5.f1204h
            r7.a(r0, r1)
        L_0x0037:
            r7 = 0
            r0 = 1
            if (r8 == 0) goto L_0x005b
            androidx.fragment.app.D r6 = r8.f1373r
            androidx.fragment.app.F r6 = r6.f1197F
            java.util.HashMap r1 = r6.f1231d
            java.lang.String r2 = r8.f1361e
            java.lang.Object r2 = r1.get(r2)
            androidx.fragment.app.F r2 = (androidx.fragment.app.F) r2
            if (r2 != 0) goto L_0x0057
            androidx.fragment.app.F r2 = new androidx.fragment.app.F
            boolean r6 = r6.f
            r2.<init>(r6)
            java.lang.String r6 = r8.f1361e
            r1.put(r6, r2)
        L_0x0057:
            r5.f1197F = r2
            goto L_0x00d1
        L_0x005b:
            if (r6 == 0) goto L_0x00ca
            e.h r6 = r6.f1388p
            androidx.lifecycle.K r6 = r6.d()
            java.lang.String r1 = "store"
            U0.i.e(r1, r6)
            X.a r1 = X.a.b
            java.lang.String r2 = "defaultCreationExtras"
            U0.i.e(r2, r1)
            java.lang.Class<androidx.fragment.app.F> r2 = androidx.fragment.app.F.class
            java.lang.String r3 = r2.getCanonicalName()
            if (r3 == 0) goto L_0x00c2
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "key"
            U0.i.e(r4, r3)
            java.util.LinkedHashMap r6 = r6.f1421a
            java.lang.Object r4 = r6.get(r3)
            androidx.lifecycle.I r4 = (androidx.lifecycle.I) r4
            boolean r2 = r2.isInstance(r4)
            if (r2 == 0) goto L_0x0096
            java.lang.String r6 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            U0.i.c(r6, r4)
            goto L_0x00bd
        L_0x0096:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r1 = r1.f781a
            r2.putAll(r1)
            androidx.lifecycle.J r1 = androidx.lifecycle.J.b
            r2.put(r1, r3)
            androidx.fragment.app.F r1 = new androidx.fragment.app.F     // Catch:{ AbstractMethodError -> 0x00ac }
            r1.<init>(r0)     // Catch:{ AbstractMethodError -> 0x00ac }
        L_0x00aa:
            r4 = r1
            goto L_0x00b2
        L_0x00ac:
            androidx.fragment.app.F r1 = new androidx.fragment.app.F
            r1.<init>(r0)
            goto L_0x00aa
        L_0x00b2:
            java.lang.Object r6 = r6.put(r3, r4)
            androidx.lifecycle.I r6 = (androidx.lifecycle.I) r6
            if (r6 == 0) goto L_0x00bd
            r6.a()
        L_0x00bd:
            androidx.fragment.app.F r4 = (androidx.fragment.app.F) r4
            r5.f1197F = r4
            goto L_0x00d1
        L_0x00c2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Local and anonymous classes can not be ViewModels"
            r6.<init>(r7)
            throw r6
        L_0x00ca:
            androidx.fragment.app.F r6 = new androidx.fragment.app.F
            r6.<init>(r7)
            r5.f1197F = r6
        L_0x00d1:
            androidx.fragment.app.F r6 = r5.f1197F
            boolean r1 = r5.f1221y
            if (r1 != 0) goto L_0x00db
            boolean r1 = r5.f1222z
            if (r1 == 0) goto L_0x00dc
        L_0x00db:
            r7 = 1
        L_0x00dc:
            r6.f1234h = r7
            N.g r7 = r5.f1200c
            r7.f607d = r6
            androidx.fragment.app.r r6 = r5.f1210n
            if (r6 == 0) goto L_0x0158
            e.h r6 = r6.f1388p
            if (r8 == 0) goto L_0x00fe
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r8.f1361e
            r7.append(r8)
            java.lang.String r8 = ":"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0100
        L_0x00fe:
            java.lang.String r7 = ""
        L_0x0100:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentManager:"
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "StartActivityForResult"
            java.lang.String r8 = A.g.h(r7, r8)
            androidx.fragment.app.z r0 = new androidx.fragment.app.z
            r1 = 2
            r0.<init>(r1)
            androidx.fragment.app.v r1 = new androidx.fragment.app.v
            r2 = 2
            r1.<init>(r5, r2)
            androidx.activity.g r6 = r6.f859j
            F.c r8 = r6.b(r8, r0, r1)
            r5.f1216t = r8
            java.lang.String r8 = "StartIntentSenderForResult"
            java.lang.String r8 = A.g.h(r7, r8)
            androidx.fragment.app.z r0 = new androidx.fragment.app.z
            r1 = 0
            r0.<init>(r1)
            androidx.fragment.app.v r1 = new androidx.fragment.app.v
            r2 = 0
            r1.<init>(r5, r2)
            F.c r8 = r6.b(r8, r0, r1)
            r5.f1217u = r8
            java.lang.String r8 = "RequestPermissions"
            java.lang.String r7 = A.g.h(r7, r8)
            androidx.fragment.app.z r8 = new androidx.fragment.app.z
            r0 = 1
            r8.<init>(r0)
            androidx.fragment.app.v r0 = new androidx.fragment.app.v
            r1 = 1
            r0.<init>(r5, r1)
            F.c r6 = r6.b(r7, r8, r0)
            r5.f1218v = r6
        L_0x0158:
            return
        L_0x0159:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already attached"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.D.b(androidx.fragment.app.r, Q0.l, androidx.fragment.app.o):void");
    }

    public final void c(C0058o oVar) {
        if (D(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.f1381z) {
            oVar.f1381z = false;
            if (!oVar.f1366k) {
                this.f1200c.f(oVar);
                if (D(2)) {
                    Log.v("FragmentManager", "add from attach: " + oVar);
                }
                if (E(oVar)) {
                    this.f1220x = true;
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.D.clear();
        this.f1195C.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList l2 = this.f1200c.l();
        int size = l2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = l2.get(i2);
            i2++;
            ViewGroup viewGroup = ((I) obj).f1252c.D;
            if (viewGroup != null) {
                hashSet.add(C0051h.f(viewGroup, B()));
            }
        }
        return hashSet;
    }

    public final I f(C0058o oVar) {
        String str = oVar.f1361e;
        g gVar = this.f1200c;
        I i2 = (I) ((HashMap) gVar.f606c).get(str);
        if (i2 != null) {
            return i2;
        }
        I i3 = new I(this.f1207k, gVar, oVar);
        i3.m(this.f1210n.f1385m.getClassLoader());
        i3.f1254e = this.f1209m;
        return i3;
    }

    public final void g(C0058o oVar) {
        if (D(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.f1381z) {
            oVar.f1381z = true;
            if (oVar.f1366k) {
                if (D(2)) {
                    Log.v("FragmentManager", "remove from detach: " + oVar);
                }
                g gVar = this.f1200c;
                synchronized (((ArrayList) gVar.b)) {
                    ((ArrayList) gVar.b).remove(oVar);
                }
                oVar.f1366k = false;
                if (E(oVar)) {
                    this.f1220x = true;
                }
                T(oVar);
            }
        }
    }

    public final void h() {
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null) {
                oVar.f1345C = true;
                oVar.f1375t.h();
            }
        }
    }

    public final boolean i() {
        boolean z2;
        if (this.f1209m >= 1) {
            for (C0058o oVar : this.f1200c.t()) {
                if (oVar != null) {
                    if (!oVar.f1380y) {
                        z2 = oVar.f1375t.i();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z2;
        if (this.f1209m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null && F(oVar)) {
                if (!oVar.f1380y) {
                    z2 = oVar.f1375t.j();
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(oVar);
                    z3 = true;
                }
            }
        }
        if (this.f1202e != null) {
            for (int i2 = 0; i2 < this.f1202e.size(); i2++) {
                C0058o oVar2 = (C0058o) this.f1202e.get(i2);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.getClass();
                }
            }
        }
        this.f1202e = arrayList;
        return z3;
    }

    public final void k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f1193A = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0051h) it.next()).e();
        }
        s(-1);
        this.f1210n = null;
        this.f1211o = null;
        this.f1212p = null;
        if (this.f1203g != null) {
            Iterator it2 = this.f1204h.b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.f1203g = null;
        }
        c cVar = this.f1216t;
        if (cVar != null) {
            androidx.activity.g gVar = (androidx.activity.g) cVar.f194c;
            ArrayList arrayList = gVar.f846d;
            String str = (String) cVar.b;
            if (!arrayList.contains(str) && (num3 = (Integer) gVar.b.remove(str)) != null) {
                gVar.f844a.remove(num3);
            }
            gVar.f847e.remove(str);
            HashMap hashMap = gVar.f;
            if (hashMap.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
                hashMap.remove(str);
            }
            Bundle bundle = gVar.f848g;
            if (bundle.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                bundle.remove(str);
            }
            if (gVar.f845c.get(str) == null) {
                c cVar2 = this.f1217u;
                androidx.activity.g gVar2 = (androidx.activity.g) cVar2.f194c;
                ArrayList arrayList2 = gVar2.f846d;
                String str2 = (String) cVar2.b;
                if (!arrayList2.contains(str2) && (num2 = (Integer) gVar2.b.remove(str2)) != null) {
                    gVar2.f844a.remove(num2);
                }
                gVar2.f847e.remove(str2);
                HashMap hashMap2 = gVar2.f;
                if (hashMap2.containsKey(str2)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + hashMap2.get(str2));
                    hashMap2.remove(str2);
                }
                Bundle bundle2 = gVar2.f848g;
                if (bundle2.containsKey(str2)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                    bundle2.remove(str2);
                }
                if (gVar2.f845c.get(str2) == null) {
                    c cVar3 = this.f1218v;
                    androidx.activity.g gVar3 = (androidx.activity.g) cVar3.f194c;
                    ArrayList arrayList3 = gVar3.f846d;
                    String str3 = (String) cVar3.b;
                    if (!arrayList3.contains(str3) && (num = (Integer) gVar3.b.remove(str3)) != null) {
                        gVar3.f844a.remove(num);
                    }
                    gVar3.f847e.remove(str3);
                    HashMap hashMap3 = gVar3.f;
                    if (hashMap3.containsKey(str3)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + hashMap3.get(str3));
                        hashMap3.remove(str3);
                    }
                    Bundle bundle3 = gVar3.f848g;
                    if (bundle3.containsKey(str3)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle3.getParcelable(str3));
                        bundle3.remove(str3);
                    }
                    if (gVar3.f845c.get(str3) != null) {
                        throw new ClassCastException();
                    }
                    return;
                }
                throw new ClassCastException();
            }
            throw new ClassCastException();
        }
    }

    public final void l() {
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null) {
                oVar.f1345C = true;
                oVar.f1375t.l();
            }
        }
    }

    public final void m() {
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null) {
                oVar.f1375t.m();
            }
        }
    }

    public final boolean n() {
        boolean z2;
        if (this.f1209m >= 1) {
            for (C0058o oVar : this.f1200c.t()) {
                if (oVar != null) {
                    if (!oVar.f1380y) {
                        z2 = oVar.f1375t.n();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.f1209m >= 1) {
            for (C0058o oVar : this.f1200c.t()) {
                if (oVar != null && !oVar.f1380y) {
                    oVar.f1375t.o();
                }
            }
        }
    }

    public final void p(C0058o oVar) {
        if (oVar != null) {
            if (oVar.equals(this.f1200c.j(oVar.f1361e))) {
                oVar.f1373r.getClass();
                boolean G2 = G(oVar);
                Boolean bool = oVar.f1365j;
                if (bool == null || bool.booleanValue() != G2) {
                    oVar.f1365j = Boolean.valueOf(G2);
                    D d2 = oVar.f1375t;
                    d2.W();
                    d2.p(d2.f1213q);
                }
            }
        }
    }

    public final void q() {
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null) {
                oVar.f1375t.q();
            }
        }
    }

    public final boolean r() {
        boolean z2;
        if (this.f1209m < 1) {
            return false;
        }
        boolean z3 = false;
        for (C0058o oVar : this.f1200c.t()) {
            if (oVar != null && F(oVar)) {
                if (!oVar.f1380y) {
                    z2 = oVar.f1375t.r();
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* JADX INFO: finally extract failed */
    public final void s(int i2) {
        try {
            this.b = true;
            for (I i3 : ((HashMap) this.f1200c.f606c).values()) {
                if (i3 != null) {
                    i3.f1254e = i2;
                }
            }
            H(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0051h) it.next()).e();
            }
            this.b = false;
            w(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        String h2 = A.g.h(str, "    ");
        g gVar = this.f1200c;
        gVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) gVar.f606c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (I i10 : hashMap.values()) {
                printWriter.print(str);
                if (i10 != null) {
                    C0058o oVar = i10.f1252c;
                    printWriter.println(oVar);
                    oVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(oVar.f1377v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(oVar.f1378w));
                    printWriter.print(" mTag=");
                    printWriter.println(oVar.f1379x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(oVar.f1358a);
                    printWriter.print(" mWho=");
                    printWriter.print(oVar.f1361e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(oVar.f1372q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(oVar.f1366k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(oVar.f1367l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(oVar.f1368m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(oVar.f1369n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(oVar.f1380y);
                    printWriter.print(" mDetached=");
                    printWriter.print(oVar.f1381z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(oVar.f1344B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(oVar.f1343A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(oVar.f1348G);
                    if (oVar.f1373r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(oVar.f1373r);
                    }
                    if (oVar.f1374s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(oVar.f1374s);
                    }
                    if (oVar.f1376u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(oVar.f1376u);
                    }
                    if (oVar.f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(oVar.f);
                    }
                    if (oVar.b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(oVar.b);
                    }
                    if (oVar.f1359c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(oVar.f1359c);
                    }
                    if (oVar.f1360d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(oVar.f1360d);
                    }
                    C0058o oVar2 = oVar.f1362g;
                    if (oVar2 == null) {
                        D d2 = oVar.f1373r;
                        if (d2 == null || (str2 = oVar.f1363h) == null) {
                            oVar2 = null;
                        } else {
                            oVar2 = d2.f1200c.j(str2);
                        }
                    }
                    if (oVar2 != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(oVar2);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(oVar.f1364i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0057n nVar = oVar.f1349H;
                    if (nVar == null) {
                        z2 = false;
                    } else {
                        z2 = nVar.f1333a;
                    }
                    printWriter.println(z2);
                    C0057n nVar2 = oVar.f1349H;
                    if (nVar2 == null) {
                        i2 = 0;
                    } else {
                        i2 = nVar2.b;
                    }
                    if (i2 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0057n nVar3 = oVar.f1349H;
                        if (nVar3 == null) {
                            i9 = 0;
                        } else {
                            i9 = nVar3.b;
                        }
                        printWriter.println(i9);
                    }
                    C0057n nVar4 = oVar.f1349H;
                    if (nVar4 == null) {
                        i3 = 0;
                    } else {
                        i3 = nVar4.f1334c;
                    }
                    if (i3 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0057n nVar5 = oVar.f1349H;
                        if (nVar5 == null) {
                            i8 = 0;
                        } else {
                            i8 = nVar5.f1334c;
                        }
                        printWriter.println(i8);
                    }
                    C0057n nVar6 = oVar.f1349H;
                    if (nVar6 == null) {
                        i4 = 0;
                    } else {
                        i4 = nVar6.f1335d;
                    }
                    if (i4 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0057n nVar7 = oVar.f1349H;
                        if (nVar7 == null) {
                            i7 = 0;
                        } else {
                            i7 = nVar7.f1335d;
                        }
                        printWriter.println(i7);
                    }
                    C0057n nVar8 = oVar.f1349H;
                    if (nVar8 == null) {
                        i5 = 0;
                    } else {
                        i5 = nVar8.f1336e;
                    }
                    if (i5 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0057n nVar9 = oVar.f1349H;
                        if (nVar9 == null) {
                            i6 = 0;
                        } else {
                            i6 = nVar9.f1336e;
                        }
                        printWriter.println(i6);
                    }
                    if (oVar.D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(oVar.D);
                    }
                    if (oVar.f1346E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(oVar.f1346E);
                    }
                    if (oVar.h() != null) {
                        new c((r) oVar, oVar.d()).r(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + oVar.f1375t + ":");
                    oVar.f1375t.t(A.g.h(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) gVar.b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size3; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(((C0058o) arrayList.get(i11)).toString());
            }
        }
        ArrayList arrayList2 = this.f1202e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i12 = 0; i12 < size2; i12++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(((C0058o) this.f1202e.get(i12)).toString());
            }
        }
        ArrayList arrayList3 = this.f1201d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i13 = 0; i13 < size; i13++) {
                C0044a aVar = (C0044a) this.f1201d.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(h2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1205i.get());
        synchronized (this.f1199a) {
            try {
                int size4 = this.f1199a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i14 = 0; i14 < size4; i14++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i14);
                        printWriter.print(": ");
                        printWriter.println((B) this.f1199a.get(i14));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1210n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1211o);
        if (this.f1212p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1212p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1209m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1221y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1222z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1193A);
        if (this.f1220x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1220x);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0058o oVar = this.f1212p;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1212p)));
            sb.append("}");
        } else {
            r rVar = this.f1210n;
            if (rVar != null) {
                sb.append(rVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1210n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(B b2, boolean z2) {
        if (!z2) {
            if (this.f1210n == null) {
                if (this.f1193A) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.f1221y || this.f1222z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1199a) {
            try {
                if (this.f1210n != null) {
                    this.f1199a.add(b2);
                    P();
                } else if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1210n == null) {
            if (this.f1193A) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1210n.f1386n.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || (!this.f1221y && !this.f1222z)) {
            if (this.f1195C == null) {
                this.f1195C = new ArrayList();
                this.D = new ArrayList();
            }
            this.b = false;
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean w(boolean z2) {
        boolean z3;
        v(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1195C;
            ArrayList arrayList2 = this.D;
            synchronized (this.f1199a) {
                try {
                    if (this.f1199a.isEmpty()) {
                        z3 = false;
                    } else {
                        int size = this.f1199a.size();
                        z3 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z3 |= ((B) this.f1199a.get(i2)).a(arrayList, arrayList2);
                        }
                        this.f1199a.clear();
                        this.f1210n.f1386n.removeCallbacks(this.f1198G);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (!z3) {
                break;
            }
            z4 = true;
            this.b = true;
            try {
                M(this.f1195C, this.D);
            } finally {
                d();
            }
        }
        W();
        if (this.f1194B) {
            this.f1194B = false;
            V();
        }
        ((HashMap) this.f1200c.f606c).values().removeAll(Collections.singleton((Object) null));
        return z4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: androidx.fragment.app.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.Object r5 = r0.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0044a) r5
            boolean r5 = r5.f1284o
            java.util.ArrayList r6 = r1.f1196E
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.f1196E = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r1.f1196E
            N.g r7 = r1.f1200c
            java.util.List r8 = r7.t()
            r6.addAll(r8)
            androidx.fragment.app.o r6 = r1.f1213q
            r9 = r3
            r10 = 0
        L_0x0030:
            r11 = 1
            if (r9 >= r4) goto L_0x0173
            java.lang.Object r12 = r0.get(r9)
            androidx.fragment.app.a r12 = (androidx.fragment.app.C0044a) r12
            java.lang.Object r13 = r2.get(r9)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0126
            java.util.ArrayList r13 = r1.f1196E
            r8 = 0
        L_0x0048:
            java.util.ArrayList r15 = r12.f1272a
            int r14 = r15.size()
            if (r8 >= r14) goto L_0x0121
            java.lang.Object r14 = r15.get(r8)
            androidx.fragment.app.J r14 = (androidx.fragment.app.J) r14
            int r3 = r14.f1255a
            if (r3 == r11) goto L_0x010e
            r16 = 1
            r11 = 2
            r17 = r5
            r5 = 9
            if (r3 == r11) goto L_0x00a1
            r11 = 3
            if (r3 == r11) goto L_0x0088
            r11 = 6
            if (r3 == r11) goto L_0x0088
            r11 = 7
            if (r3 == r11) goto L_0x0083
            r11 = 8
            if (r3 == r11) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            androidx.fragment.app.J r3 = new androidx.fragment.app.J
            r3.<init>(r5, r6)
            r15.add(r8, r3)
            int r8 = r8 + 1
            androidx.fragment.app.o r3 = r14.b
            r6 = r3
        L_0x007e:
            r19 = r9
        L_0x0080:
            r5 = 1
            goto L_0x0117
        L_0x0083:
            r19 = r9
            r5 = 1
            goto L_0x0112
        L_0x0088:
            androidx.fragment.app.o r3 = r14.b
            r13.remove(r3)
            androidx.fragment.app.o r3 = r14.b
            if (r3 != r6) goto L_0x007e
            androidx.fragment.app.J r6 = new androidx.fragment.app.J
            r6.<init>(r5, r3)
            r15.add(r8, r6)
            int r8 = r8 + 1
            r19 = r9
            r5 = 1
            r6 = 0
            goto L_0x0117
        L_0x00a1:
            androidx.fragment.app.o r3 = r14.b
            int r11 = r3.f1378w
            int r18 = r13.size()
            int r18 = r18 + -1
            r5 = r18
            r18 = 0
        L_0x00af:
            if (r5 < 0) goto L_0x00fc
            java.lang.Object r19 = r13.get(r5)
            r20 = r5
            r5 = r19
            androidx.fragment.app.o r5 = (androidx.fragment.app.C0058o) r5
            r19 = r9
            int r9 = r5.f1378w
            if (r9 != r11) goto L_0x00f7
            if (r5 != r3) goto L_0x00c6
            r18 = 1
            goto L_0x00f7
        L_0x00c6:
            if (r5 != r6) goto L_0x00d5
            androidx.fragment.app.J r6 = new androidx.fragment.app.J
            r9 = 9
            r6.<init>(r9, r5)
            r15.add(r8, r6)
            int r8 = r8 + 1
            r6 = 0
        L_0x00d5:
            androidx.fragment.app.J r9 = new androidx.fragment.app.J
            r21 = r6
            r6 = 3
            r9.<init>(r6, r5)
            int r6 = r14.f1256c
            r9.f1256c = r6
            int r6 = r14.f1258e
            r9.f1258e = r6
            int r6 = r14.f1257d
            r9.f1257d = r6
            int r6 = r14.f
            r9.f = r6
            r15.add(r8, r9)
            r13.remove(r5)
            int r8 = r8 + 1
            r6 = r21
        L_0x00f7:
            int r5 = r20 + -1
            r9 = r19
            goto L_0x00af
        L_0x00fc:
            r19 = r9
            if (r18 == 0) goto L_0x0107
            r15.remove(r8)
            int r8 = r8 + -1
            goto L_0x0080
        L_0x0107:
            r5 = 1
            r14.f1255a = r5
            r13.add(r3)
            goto L_0x0117
        L_0x010e:
            r17 = r5
            goto L_0x0083
        L_0x0112:
            androidx.fragment.app.o r3 = r14.b
            r13.add(r3)
        L_0x0117:
            int r8 = r8 + r5
            r3 = r25
            r5 = r17
            r9 = r19
            r11 = 1
            goto L_0x0048
        L_0x0121:
            r17 = r5
            r19 = r9
            goto L_0x0161
        L_0x0126:
            r17 = r5
            r19 = r9
            r5 = 1
            java.util.ArrayList r3 = r1.f1196E
            java.util.ArrayList r8 = r12.f1272a
            int r9 = r8.size()
            int r9 = r9 - r5
        L_0x0134:
            if (r9 < 0) goto L_0x0161
            java.lang.Object r11 = r8.get(r9)
            androidx.fragment.app.J r11 = (androidx.fragment.app.J) r11
            int r13 = r11.f1255a
            if (r13 == r5) goto L_0x0157
            r5 = 3
            if (r13 == r5) goto L_0x0151
            switch(r13) {
                case 6: goto L_0x0151;
                case 7: goto L_0x0158;
                case 8: goto L_0x014f;
                case 9: goto L_0x014c;
                case 10: goto L_0x0147;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x015d
        L_0x0147:
            androidx.lifecycle.m r13 = r11.f1259g
            r11.f1260h = r13
            goto L_0x015d
        L_0x014c:
            androidx.fragment.app.o r6 = r11.b
            goto L_0x015d
        L_0x014f:
            r6 = 0
            goto L_0x015d
        L_0x0151:
            androidx.fragment.app.o r11 = r11.b
            r3.add(r11)
            goto L_0x015d
        L_0x0157:
            r5 = 3
        L_0x0158:
            androidx.fragment.app.o r11 = r11.b
            r3.remove(r11)
        L_0x015d:
            int r9 = r9 + -1
            r5 = 1
            goto L_0x0134
        L_0x0161:
            if (r10 != 0) goto L_0x016a
            boolean r3 = r12.f1276g
            if (r3 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r10 = 0
            goto L_0x016b
        L_0x016a:
            r10 = 1
        L_0x016b:
            int r9 = r19 + 1
            r3 = r25
            r5 = r17
            goto L_0x0030
        L_0x0173:
            r17 = r5
            java.util.ArrayList r3 = r1.f1196E
            r3.clear()
            if (r17 != 0) goto L_0x01af
            int r3 = r1.f1209m
            r5 = 1
            if (r3 < r5) goto L_0x01af
            r3 = r25
        L_0x0183:
            if (r3 >= r4) goto L_0x01af
            java.lang.Object r5 = r0.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0044a) r5
            java.util.ArrayList r5 = r5.f1272a
            int r6 = r5.size()
            r8 = 0
        L_0x0192:
            if (r8 >= r6) goto L_0x01ac
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.fragment.app.J r9 = (androidx.fragment.app.J) r9
            androidx.fragment.app.o r9 = r9.b
            if (r9 == 0) goto L_0x0192
            androidx.fragment.app.D r10 = r9.f1373r
            if (r10 == 0) goto L_0x0192
            androidx.fragment.app.I r9 = r1.f(r9)
            r7.B(r9)
            goto L_0x0192
        L_0x01ac:
            int r3 = r3 + 1
            goto L_0x0183
        L_0x01af:
            r3 = r25
        L_0x01b1:
            r5 = -1
            if (r3 >= r4) goto L_0x0379
            java.lang.Object r6 = r0.get(r3)
            androidx.fragment.app.a r6 = (androidx.fragment.app.C0044a) r6
            java.lang.Object r7 = r2.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x02a8
            r6.c(r5)
            java.util.ArrayList r5 = r6.f1272a
            int r7 = r5.size()
            r8 = 1
            int r7 = r7 - r8
        L_0x01d1:
            if (r7 < 0) goto L_0x0375
            java.lang.Object r9 = r5.get(r7)
            androidx.fragment.app.J r9 = (androidx.fragment.app.J) r9
            androidx.fragment.app.o r10 = r9.b
            if (r10 == 0) goto L_0x0213
            androidx.fragment.app.n r11 = r10.f1349H
            if (r11 != 0) goto L_0x01e2
            goto L_0x01e8
        L_0x01e2:
            androidx.fragment.app.n r11 = r10.f()
            r11.f1333a = r8
        L_0x01e8:
            int r11 = r6.f
            r12 = 8194(0x2002, float:1.1482E-41)
            r13 = 4097(0x1001, float:5.741E-42)
            if (r11 == r13) goto L_0x01fd
            r14 = 4099(0x1003, float:5.744E-42)
            if (r11 == r14) goto L_0x01fb
            if (r11 == r12) goto L_0x01f8
            r12 = 0
            goto L_0x01fd
        L_0x01f8:
            r12 = 4097(0x1001, float:5.741E-42)
            goto L_0x01fd
        L_0x01fb:
            r12 = 4099(0x1003, float:5.744E-42)
        L_0x01fd:
            androidx.fragment.app.n r11 = r10.f1349H
            if (r11 != 0) goto L_0x0204
            if (r12 != 0) goto L_0x0204
            goto L_0x020b
        L_0x0204:
            r10.f()
            androidx.fragment.app.n r11 = r10.f1349H
            r11.f = r12
        L_0x020b:
            r10.f()
            androidx.fragment.app.n r11 = r10.f1349H
            r11.getClass()
        L_0x0213:
            int r11 = r9.f1255a
            androidx.fragment.app.D r12 = r6.f1285p
            switch(r11) {
                case 1: goto L_0x0293;
                case 2: goto L_0x021a;
                case 3: goto L_0x0284;
                case 4: goto L_0x0272;
                case 5: goto L_0x0260;
                case 6: goto L_0x0251;
                case 7: goto L_0x023f;
                case 8: goto L_0x023a;
                case 9: goto L_0x0236;
                case 10: goto L_0x0230;
                default: goto L_0x021a;
            }
        L_0x021a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown cmd: "
            r2.<init>(r3)
            int r3 = r9.f1255a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0230:
            androidx.lifecycle.m r9 = r9.f1259g
            r12.R(r10, r9)
            goto L_0x02a4
        L_0x0236:
            r12.S(r10)
            goto L_0x02a4
        L_0x023a:
            r9 = 0
            r12.S(r9)
            goto L_0x02a4
        L_0x023f:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.Q(r10, r8)
            r12.g(r10)
            goto L_0x02a4
        L_0x0251:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.c(r10)
            goto L_0x02a4
        L_0x0260:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.Q(r10, r8)
            r12.C(r10)
            goto L_0x02a4
        L_0x0272:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.getClass()
            U(r10)
            goto L_0x02a4
        L_0x0284:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.a(r10)
            goto L_0x02a4
        L_0x0293:
            int r11 = r9.f1256c
            int r13 = r9.f1257d
            int r14 = r9.f1258e
            int r9 = r9.f
            r10.y(r11, r13, r14, r9)
            r12.Q(r10, r8)
            r12.L(r10)
        L_0x02a4:
            int r7 = r7 + -1
            goto L_0x01d1
        L_0x02a8:
            r5 = 1
            r6.c(r5)
            java.util.ArrayList r5 = r6.f1272a
            int r7 = r5.size()
            r8 = 0
            r9 = 0
        L_0x02b4:
            if (r9 >= r7) goto L_0x0375
            java.lang.Object r10 = r5.get(r9)
            androidx.fragment.app.J r10 = (androidx.fragment.app.J) r10
            androidx.fragment.app.o r11 = r10.b
            if (r11 == 0) goto L_0x02e3
            androidx.fragment.app.n r12 = r11.f1349H
            if (r12 != 0) goto L_0x02c5
            goto L_0x02cb
        L_0x02c5:
            androidx.fragment.app.n r12 = r11.f()
            r12.f1333a = r8
        L_0x02cb:
            int r12 = r6.f
            androidx.fragment.app.n r13 = r11.f1349H
            if (r13 != 0) goto L_0x02d4
            if (r12 != 0) goto L_0x02d4
            goto L_0x02db
        L_0x02d4:
            r11.f()
            androidx.fragment.app.n r13 = r11.f1349H
            r13.f = r12
        L_0x02db:
            r11.f()
            androidx.fragment.app.n r12 = r11.f1349H
            r12.getClass()
        L_0x02e3:
            int r12 = r10.f1255a
            androidx.fragment.app.D r13 = r6.f1285p
            switch(r12) {
                case 1: goto L_0x0360;
                case 2: goto L_0x02ea;
                case 3: goto L_0x0351;
                case 4: goto L_0x0342;
                case 5: goto L_0x0330;
                case 6: goto L_0x0321;
                case 7: goto L_0x030f;
                case 8: goto L_0x030b;
                case 9: goto L_0x0306;
                case 10: goto L_0x0300;
                default: goto L_0x02ea;
            }
        L_0x02ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown cmd: "
            r2.<init>(r3)
            int r3 = r10.f1255a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0300:
            androidx.lifecycle.m r10 = r10.f1260h
            r13.R(r11, r10)
            goto L_0x0371
        L_0x0306:
            r10 = 0
            r13.S(r10)
            goto L_0x0371
        L_0x030b:
            r13.S(r11)
            goto L_0x0371
        L_0x030f:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.Q(r11, r8)
            r13.c(r11)
            goto L_0x0371
        L_0x0321:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.g(r11)
            goto L_0x0371
        L_0x0330:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.Q(r11, r8)
            U(r11)
            goto L_0x0371
        L_0x0342:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.C(r11)
            goto L_0x0371
        L_0x0351:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.L(r11)
            goto L_0x0371
        L_0x0360:
            int r12 = r10.f1256c
            int r14 = r10.f1257d
            int r15 = r10.f1258e
            int r10 = r10.f
            r11.y(r12, r14, r15, r10)
            r13.Q(r11, r8)
            r13.a(r11)
        L_0x0371:
            int r9 = r9 + 1
            goto L_0x02b4
        L_0x0375:
            int r3 = r3 + 1
            goto L_0x01b1
        L_0x0379:
            int r3 = r4 + -1
            java.lang.Object r3 = r2.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r6 = r25
        L_0x0387:
            if (r6 >= r4) goto L_0x03d3
            java.lang.Object r7 = r0.get(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0044a) r7
            if (r3 == 0) goto L_0x03b3
            java.util.ArrayList r8 = r7.f1272a
            int r8 = r8.size()
            r16 = 1
            int r8 = r8 + -1
        L_0x039b:
            if (r8 < 0) goto L_0x03d0
            java.util.ArrayList r9 = r7.f1272a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.J r9 = (androidx.fragment.app.J) r9
            androidx.fragment.app.o r9 = r9.b
            if (r9 == 0) goto L_0x03b0
            androidx.fragment.app.I r9 = r1.f(r9)
            r9.k()
        L_0x03b0:
            int r8 = r8 + -1
            goto L_0x039b
        L_0x03b3:
            java.util.ArrayList r7 = r7.f1272a
            int r8 = r7.size()
            r9 = 0
        L_0x03ba:
            if (r9 >= r8) goto L_0x03d0
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            androidx.fragment.app.J r10 = (androidx.fragment.app.J) r10
            androidx.fragment.app.o r10 = r10.b
            if (r10 == 0) goto L_0x03ba
            androidx.fragment.app.I r10 = r1.f(r10)
            r10.k()
            goto L_0x03ba
        L_0x03d0:
            int r6 = r6 + 1
            goto L_0x0387
        L_0x03d3:
            int r6 = r1.f1209m
            r7 = 1
            r1.H(r6, r7)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = r25
        L_0x03e0:
            if (r7 >= r4) goto L_0x0410
            java.lang.Object r8 = r0.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0044a) r8
            java.util.ArrayList r8 = r8.f1272a
            int r9 = r8.size()
            r10 = 0
        L_0x03ef:
            if (r10 >= r9) goto L_0x040d
            java.lang.Object r11 = r8.get(r10)
            int r10 = r10 + 1
            androidx.fragment.app.J r11 = (androidx.fragment.app.J) r11
            androidx.fragment.app.o r11 = r11.b
            if (r11 == 0) goto L_0x03ef
            android.view.ViewGroup r11 = r11.D
            if (r11 == 0) goto L_0x03ef
            E0.e r12 = r1.B()
            androidx.fragment.app.h r11 = androidx.fragment.app.C0051h.f(r11, r12)
            r6.add(r11)
            goto L_0x03ef
        L_0x040d:
            int r7 = r7 + 1
            goto L_0x03e0
        L_0x0410:
            java.util.Iterator r6 = r6.iterator()
        L_0x0414:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0460
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.h r7 = (androidx.fragment.app.C0051h) r7
            r7.f1313d = r3
            java.util.ArrayList r8 = r7.b
            monitor-enter(r8)
            r7.g()     // Catch:{ all -> 0x0454 }
            r9 = 0
            r7.f1314e = r9     // Catch:{ all -> 0x0454 }
            java.util.ArrayList r10 = r7.b     // Catch:{ all -> 0x0454 }
            int r10 = r10.size()     // Catch:{ all -> 0x0454 }
            int r10 = r10 + -1
        L_0x0433:
            if (r10 < 0) goto L_0x0459
            java.util.ArrayList r11 = r7.b     // Catch:{ all -> 0x0454 }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x0454 }
            androidx.fragment.app.N r11 = (androidx.fragment.app.N) r11     // Catch:{ all -> 0x0454 }
            androidx.fragment.app.o r12 = r11.f1267c     // Catch:{ all -> 0x0454 }
            android.view.View r12 = r12.f1346E     // Catch:{ all -> 0x0454 }
            int r12 = A.g.c(r12)     // Catch:{ all -> 0x0454 }
            int r13 = r11.f1266a     // Catch:{ all -> 0x0454 }
            r14 = 2
            if (r13 != r14) goto L_0x0456
            if (r12 == r14) goto L_0x0456
            androidx.fragment.app.o r10 = r11.f1267c     // Catch:{ all -> 0x0454 }
            r10.getClass()     // Catch:{ all -> 0x0454 }
            r7.f1314e = r9     // Catch:{ all -> 0x0454 }
            goto L_0x0459
        L_0x0454:
            r0 = move-exception
            goto L_0x045e
        L_0x0456:
            int r10 = r10 + -1
            goto L_0x0433
        L_0x0459:
            monitor-exit(r8)     // Catch:{ all -> 0x0454 }
            r7.c()
            goto L_0x0414
        L_0x045e:
            monitor-exit(r8)     // Catch:{ all -> 0x0454 }
            throw r0
        L_0x0460:
            r3 = r25
        L_0x0462:
            if (r3 >= r4) goto L_0x0482
            java.lang.Object r6 = r0.get(r3)
            androidx.fragment.app.a r6 = (androidx.fragment.app.C0044a) r6
            java.lang.Object r7 = r2.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x047c
            int r7 = r6.f1287r
            if (r7 < 0) goto L_0x047c
            r6.f1287r = r5
        L_0x047c:
            r6.getClass()
            int r3 = r3 + 1
            goto L_0x0462
        L_0x0482:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.D.x(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final C0058o y(int i2) {
        g gVar = this.f1200c;
        ArrayList arrayList = (ArrayList) gVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0058o oVar = (C0058o) arrayList.get(size);
            if (oVar != null && oVar.f1377v == i2) {
                return oVar;
            }
        }
        for (I i3 : ((HashMap) gVar.f606c).values()) {
            if (i3 != null) {
                C0058o oVar2 = i3.f1252c;
                if (oVar2.f1377v == i2) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup z(C0058o oVar) {
        ViewGroup viewGroup = oVar.D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.f1378w <= 0 || !this.f1211o.J()) {
            return null;
        }
        View I2 = this.f1211o.I(oVar.f1378w);
        if (I2 instanceof ViewGroup) {
            return (ViewGroup) I2;
        }
        return null;
    }
}

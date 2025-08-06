package N;

import E.c;
import I.O;
import M0.n;
import Q0.l;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0048e;
import androidx.fragment.app.C0058o;
import androidx.fragment.app.D;
import androidx.fragment.app.F;
import androidx.fragment.app.I;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0071A;
import b0.C0078b;
import b0.Y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import javax.net.ssl.SSLSocket;
import k.C0241f0;
import k.C0267t;
import k.W;
import r.C0472d;
import r.C0473e;
import s.C0475b;
import t.C0481f;
import t0.C0486a;
import z.C0515n;

public final class g implements h, c {

    /* renamed from: e  reason: collision with root package name */
    public static g f604e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f605a;
    public Object b;

    /* renamed from: c  reason: collision with root package name */
    public Object f606c;

    /* renamed from: d  reason: collision with root package name */
    public Object f607d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f605a = i2;
        this.b = obj;
        this.f606c = obj2;
        this.f607d = obj3;
    }

    public static g E(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public void A(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method u2 = u(sSLSocket.getClass());
            if (u2 != null) {
                try {
                    u2.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public void B(I i2) {
        C0058o oVar = i2.f1252c;
        String str = oVar.f1361e;
        HashMap hashMap = (HashMap) this.f606c;
        if (hashMap.get(str) == null) {
            hashMap.put(oVar.f1361e, i2);
            if (D.D(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + oVar);
            }
        }
    }

    public void C(I i2) {
        C0058o oVar = i2.f1252c;
        if (oVar.f1343A) {
            ((F) this.f607d).b(oVar);
        }
        if (((I) ((HashMap) this.f606c).put(oVar.f1361e, (Object) null)) != null && D.D(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVar);
        }
    }

    public boolean D(C0481f fVar, C0472d dVar, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[] iArr = dVar.f4315c0;
        int i2 = iArr[0];
        C0475b bVar = (C0475b) this.f606c;
        bVar.f4440a = i2;
        boolean z7 = true;
        bVar.b = iArr[1];
        bVar.f4441c = dVar.l();
        bVar.f4442d = dVar.i();
        bVar.f4446i = false;
        bVar.f4447j = z2;
        if (bVar.f4440a == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.b == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || dVar.f4296L <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 || dVar.f4296L <= 0.0f) {
            z6 = false;
        } else {
            z6 = true;
        }
        int[] iArr2 = dVar.f4323l;
        if (z5 && iArr2[0] == 4) {
            bVar.f4440a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            bVar.b = 1;
        }
        fVar.a(dVar, bVar);
        dVar.y(bVar.f4443e);
        dVar.v(bVar.f);
        dVar.f4334w = bVar.f4445h;
        int i3 = bVar.f4444g;
        dVar.f4300P = i3;
        if (i3 <= 0) {
            z7 = false;
        }
        dVar.f4334w = z7;
        bVar.f4447j = false;
        return bVar.f4446i;
    }

    public void F() {
        ((TypedArray) this.f606c).recycle();
    }

    public void G(C0473e eVar, int i2, int i3) {
        int i4 = eVar.f4301Q;
        int i5 = eVar.f4302R;
        eVar.f4301Q = 0;
        eVar.f4302R = 0;
        eVar.y(i2);
        eVar.v(i3);
        if (i4 < 0) {
            eVar.f4301Q = 0;
        } else {
            eVar.f4301Q = i4;
        }
        if (i5 < 0) {
            eVar.f4302R = 0;
        } else {
            eVar.f4302R = i5;
        }
        ((C0473e) this.f607d).E();
    }

    public void H(View view) {
        if (((ArrayList) this.f607d).remove(view)) {
            C0071A a2 = (C0071A) this.b;
            Y I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i2 = I2.f1641p;
                RecyclerView recyclerView = a2.f1567a;
                if (recyclerView.L()) {
                    I2.f1642q = i2;
                    recyclerView.f1532p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = O.f393a;
                    I2.f1628a.setImportantForAccessibility(i2);
                }
                I2.f1641p = 0;
            }
        }
    }

    public Uri b() {
        return (Uri) this.f606c;
    }

    public ClipDescription c() {
        return (ClipDescription) this.f607d;
    }

    public Object d() {
        return null;
    }

    public Uri e() {
        return (Uri) this.b;
    }

    public void f(C0058o oVar) {
        if (!((ArrayList) this.b).contains(oVar)) {
            synchronized (((ArrayList) this.b)) {
                ((ArrayList) this.b).add(oVar);
            }
            oVar.f1366k = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + oVar);
    }

    public void g(View view, int i2, boolean z2) {
        int i3;
        RecyclerView recyclerView = ((C0071A) this.b).f1567a;
        if (i2 < 0) {
            i3 = recyclerView.getChildCount();
        } else {
            i3 = v(i2);
        }
        ((C0078b) this.f606c).e(i3, z2);
        if (z2) {
            y(view);
        }
        recyclerView.addView(view, i3);
        RecyclerView.I(view);
    }

    public void h(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int i3;
        RecyclerView recyclerView = ((C0071A) this.b).f1567a;
        if (i2 < 0) {
            i3 = recyclerView.getChildCount();
        } else {
            i3 = v(i2);
        }
        ((C0078b) this.f606c).e(i3, z2);
        if (z2) {
            y(view);
        }
        Y I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (I2.j() || I2.o()) {
                I2.f1635j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
        }
        recyclerView.attachViewToParent(view, i3, layoutParams);
    }

    public void i(int i2) {
        Y I2;
        int v2 = v(i2);
        ((C0078b) this.f606c).f(v2);
        RecyclerView recyclerView = ((C0071A) this.b).f1567a;
        View childAt = recyclerView.getChildAt(v2);
        if (!(childAt == null || (I2 = RecyclerView.I(childAt)) == null)) {
            if (!I2.j() || I2.o()) {
                I2.a(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
        }
        recyclerView.detachViewFromParent(v2);
    }

    public C0058o j(String str) {
        I i2 = (I) ((HashMap) this.f606c).get(str);
        if (i2 != null) {
            return i2.f1252c;
        }
        return null;
    }

    public C0058o k(String str) {
        for (I i2 : ((HashMap) this.f606c).values()) {
            if (i2 != null) {
                C0058o oVar = i2.f1252c;
                if (!str.equals(oVar.f1361e)) {
                    oVar = oVar.f1375t.f1200c.k(str);
                }
                if (oVar != null) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (I i2 : ((HashMap) this.f606c).values()) {
            if (i2 != null) {
                arrayList.add(i2);
            }
        }
        return arrayList;
    }

    public View m(int i2) {
        return ((C0071A) this.b).f1567a.getChildAt(v(i2));
    }

    public int n() {
        return ((C0071A) this.b).f1567a.getChildCount() - ((ArrayList) this.f607d).size();
    }

    public ColorStateList o(int i2) {
        int resourceId;
        ColorStateList g2;
        TypedArray typedArray = (TypedArray) this.f606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (g2 = C0486a.g((Context) this.b, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return g2;
    }

    public Drawable p(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return typedArray.getDrawable(i2);
        }
        return l.v((Context) this.b, resourceId);
    }

    public void q() {
        View view = (View) this.b;
        view.clearAnimation();
        ((ViewGroup) this.f606c).endViewTransition(view);
        ((C0048e) this.f607d).d();
    }

    public Drawable r(int i2) {
        int resourceId;
        Drawable g2;
        if (!((TypedArray) this.f606c).hasValue(i2) || (resourceId = ((TypedArray) this.f606c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0267t a2 = C0267t.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            g2 = a2.f3565a.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface s(int i2, int i3, W w2) {
        int resourceId = ((TypedArray) this.f606c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f607d) == null) {
            this.f607d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f607d;
        ThreadLocal threadLocal = C0515n.f4870a;
        Context context = (Context) this.b;
        if (context.isRestricted()) {
            return null;
        }
        return C0515n.c(context, resourceId, typedValue, i3, w2, true, false);
    }

    public List t() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f605a) {
            case 3:
                return ((C0078b) this.f606c).toString() + ", hidden list:" + ((ArrayList) this.f607d).size();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method u(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f606c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f607d
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0017 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x001b
        L_0x0015:
            r4 = r2
            goto L_0x001b
        L_0x0017:
            goto L_0x001b
        L_0x0019:
            goto L_0x0015
        L_0x001b:
            if (r4 == 0) goto L_0x002e
            java.lang.Object r0 = r3.b
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x002e
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r4
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N.g.u(java.lang.Class):java.lang.reflect.Method");
    }

    public int v(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((C0071A) this.b).f1567a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0078b bVar = (C0078b) this.f606c;
            int b2 = i2 - (i3 - bVar.b(i3));
            if (b2 == 0) {
                while (bVar.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    public View w(int i2) {
        return ((C0071A) this.b).f1567a.getChildAt(i2);
    }

    public int x() {
        return ((C0071A) this.b).f1567a.getChildCount();
    }

    public void y(View view) {
        ((ArrayList) this.f607d).add(view);
        C0071A a2 = (C0071A) this.b;
        Y I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i2 = I2.f1642q;
            View view2 = I2.f1628a;
            if (i2 != -1) {
                I2.f1641p = i2;
            } else {
                WeakHashMap weakHashMap = O.f393a;
                I2.f1641p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = a2.f1567a;
            if (recyclerView.L()) {
                I2.f1642q = 4;
                recyclerView.f1532p0.add(I2);
                return;
            }
            WeakHashMap weakHashMap2 = O.f393a;
            view2.setImportantForAccessibility(4);
        }
    }

    public Object z(SSLSocket sSLSocket, Object... objArr) {
        Method u2 = u(sSLSocket.getClass());
        if (u2 != null) {
            try {
                return u2.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + u2);
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + ((String) this.f606c) + " not supported for object " + sSLSocket);
        }
    }

    public g(int i2) {
        this.f605a = i2;
        switch (i2) {
            case 7:
                this.b = new ArrayList();
                this.f606c = n.f;
                this.f607d = new C0241f0(4);
                return;
            default:
                this.b = new ArrayList();
                this.f606c = new HashMap();
                return;
        }
    }

    public g(C0071A a2) {
        this.f605a = 3;
        this.b = a2;
        this.f606c = new C0078b();
        this.f607d = new ArrayList();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f605a = 0;
        this.b = uri;
        this.f607d = clipDescription;
        this.f606c = uri2;
    }

    public g(Context context, TypedArray typedArray) {
        this.f605a = 5;
        this.b = context;
        this.f606c = typedArray;
    }

    public g(Context context, LocationManager locationManager) {
        this.f605a = 4;
        this.f607d = new Object();
        this.b = context;
        this.f606c = locationManager;
    }

    public g(C0473e eVar) {
        this.f605a = 8;
        this.b = new ArrayList();
        this.f606c = new Object();
        this.f607d = eVar;
    }

    public void a() {
    }
}

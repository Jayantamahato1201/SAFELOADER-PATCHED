package F;

import A.d;
import E0.e;
import I.B;
import I.C0023o;
import I.C0024p;
import I.O;
import I.V;
import I.r0;
import I.t0;
import O.j;
import U0.i;
import Y.a;
import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.emoji2.text.r;
import androidx.emoji2.text.u;
import androidx.fragment.app.C0058o;
import androidx.fragment.app.D;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import b0.H;
import b0.Y;
import b0.e0;
import b0.h0;
import b0.i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.C;
import d1.C0116i;
import d1.G;
import e.C0137h;
import e.o;
import e.x;
import i.C0176a;
import i.C0181f;
import j.C0193C;
import j.C0209m;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n.C0292e;
import n.k;
import y0.l;
import y0.n;

public final class c implements j, C0024p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f193a;
    public Object b;

    /* renamed from: c  reason: collision with root package name */
    public Object f194c;

    public /* synthetic */ c(int i2, boolean z2) {
        this.f193a = i2;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z2) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) == null || uVarArr.length <= 0)) {
                int length = uVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    u uVar = uVarArr[i2];
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((!z2 || spanStart != selectionStart) && ((z2 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                        i2++;
                    } else {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int w(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        if (i4 + 1 > i3) {
            return i5 + 1;
        }
        return i5;
    }

    public static boolean z(G g2, C c2) {
        int i2 = g2.f2251h;
        if (!(i2 == 200 || i2 == 410 || i2 == 414 || i2 == 501 || i2 == 203 || i2 == 204)) {
            if (i2 != 307) {
                if (!(i2 == 308 || i2 == 404 || i2 == 405)) {
                    switch (i2) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (g2.l("Expires") == null && g2.k().f2306c == -1 && !g2.k().f && !g2.k().f2308e) {
                return false;
            }
        }
        if (g2.k().b) {
            return false;
        }
        C0116i iVar = c2.f;
        if (iVar == null) {
            iVar = C0116i.a(c2.f2232c);
            c2.f = iVar;
        }
        if (!iVar.b) {
            return true;
        }
        return false;
    }

    public boolean A(View view) {
        H h2 = (H) this.b;
        int d2 = h2.d();
        int c2 = h2.c();
        int b2 = h2.b(view);
        int a2 = h2.a(view);
        h0 h0Var = (h0) this.f194c;
        h0Var.b = d2;
        h0Var.f1697c = c2;
        h0Var.f1698d = b2;
        h0Var.f1699e = a2;
        h0Var.f1696a = 24579;
        return h0Var.a();
    }

    public void B(int i2, int i3) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i2 < iArr.length) {
            int i4 = i2 + i3;
            s(i4);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill((int[]) this.b, i2, i4, -1);
            ArrayList arrayList = (ArrayList) this.f194c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e0 e0Var = (e0) ((ArrayList) this.f194c).get(size);
                    int i5 = e0Var.f;
                    if (i5 >= i2) {
                        e0Var.f = i5 + i3;
                    }
                }
            }
        }
    }

    public void C(int i2, int i3) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i2 < iArr.length) {
            int i4 = i2 + i3;
            s(i4);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = (int[]) this.b;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f194c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e0 e0Var = (e0) ((ArrayList) this.f194c).get(size);
                    int i5 = e0Var.f;
                    if (i5 >= i2) {
                        if (i5 < i4) {
                            ((ArrayList) this.f194c).remove(size);
                        } else {
                            e0Var.f = i5 - i3;
                        }
                    }
                }
            }
        }
    }

    public void D(C0176a aVar) {
        r rVar = (r) this.b;
        ((ActionMode.Callback) rVar.f1183a).onDestroyActionMode(rVar.b(aVar));
        x xVar = (x) this.f194c;
        if (xVar.f2604w != null) {
            xVar.f2593l.getDecorView().removeCallbacks(xVar.f2605x);
        }
        if (xVar.f2603v != null) {
            V v2 = xVar.f2606y;
            if (v2 != null) {
                v2.b();
            }
            V a2 = O.a(xVar.f2603v);
            a2.a(0.0f);
            xVar.f2606y = a2;
            a2.d(new o(2, this));
        }
        xVar.f2602u = null;
        ViewGroup viewGroup = xVar.f2560A;
        WeakHashMap weakHashMap = O.f393a;
        B.c(viewGroup);
        xVar.J();
    }

    public boolean E(C0176a aVar, C0209m mVar) {
        ViewGroup viewGroup = ((x) this.f194c).f2560A;
        WeakHashMap weakHashMap = O.f393a;
        B.c(viewGroup);
        r rVar = (r) this.b;
        C0181f b2 = rVar.b(aVar);
        k kVar = (k) rVar.f1185d;
        Menu menu = (Menu) kVar.getOrDefault(mVar, (Object) null);
        if (menu == null) {
            menu = new C0193C((Context) rVar.b, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) rVar.f1183a).onPrepareActionMode(b2, menu);
    }

    public void F(j jVar) {
        int i2 = jVar.b;
        Handler handler = (Handler) this.f194c;
        A.j jVar2 = (A.j) this.b;
        if (i2 == 0) {
            handler.post(new a((Object) jVar2, 0, (Object) jVar.f206a));
        } else {
            handler.post(new b((Object) jVar2, i2, 0));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d3, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            r12 = this;
            t.m r0 = new t.m
            r0.<init>()
            int r1 = r14.getAttributeCount()
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x01ec
            java.lang.String r4 = r14.getAttributeName(r3)
            java.lang.String r5 = "id"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e8
            java.lang.String r1 = r14.getAttributeValue(r3)
            java.lang.String r3 = "/"
            boolean r3 = r1.contains(r3)
            r4 = 1
            r6 = -1
            if (r3 == 0) goto L_0x003f
            r3 = 47
            int r3 = r1.indexOf(r3)
            int r3 = r3 + r4
            java.lang.String r3 = r1.substring(r3)
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = r13.getPackageName()
            int r3 = r7.getIdentifier(r3, r5, r8)
            goto L_0x0040
        L_0x003f:
            r3 = -1
        L_0x0040:
            if (r3 != r6) goto L_0x0058
            int r5 = r1.length()
            if (r5 <= r4) goto L_0x0051
            java.lang.String r1 = r1.substring(r4)
            int r3 = java.lang.Integer.parseInt(r1)
            goto L_0x0058
        L_0x0051:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r5 = "error in parsing id"
            android.util.Log.e(r1, r5)
        L_0x0058:
            int r1 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r5 = 0
            r7 = r5
        L_0x005e:
            if (r1 == r4) goto L_0x01e0
            if (r1 == 0) goto L_0x01d0
            java.lang.String r8 = "Constraint"
            r9 = 3
            r10 = 2
            if (r1 == r10) goto L_0x0094
            if (r1 == r9) goto L_0x006c
            goto L_0x01d3
        L_0x006c:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r9 = "ConstraintSet"
            boolean r9 = r9.equals(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r9 == 0) goto L_0x007a
            goto L_0x01e0
        L_0x007a:
            boolean r1 = r1.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x01d3
            java.util.HashMap r1 = r0.f4705c     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r8 = r7.f4622a     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r7 = r5
            goto L_0x01d3
        L_0x008e:
            r13 = move-exception
            goto L_0x01d9
        L_0x0091:
            r13 = move-exception
            goto L_0x01dd
        L_0x0094:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r11 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            switch(r11) {
                case -2025855158: goto L_0x00e3;
                case -1984451626: goto L_0x00d9;
                case -1269513683: goto L_0x00d0;
                case -1238332596: goto L_0x00c6;
                case -71750448: goto L_0x00bc;
                case 1331510167: goto L_0x00b2;
                case 1791837707: goto L_0x00a8;
                case 1803088381: goto L_0x00a0;
                default: goto L_0x009f;
            }     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x009f:
            goto L_0x00ed
        L_0x00a0:
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 0
            goto L_0x00ee
        L_0x00a8:
            java.lang.String r8 = "CustomAttribute"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 7
            goto L_0x00ee
        L_0x00b2:
            java.lang.String r8 = "Barrier"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 2
            goto L_0x00ee
        L_0x00bc:
            java.lang.String r8 = "Guideline"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00c6:
            java.lang.String r8 = "Transform"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 4
            goto L_0x00ee
        L_0x00d0:
            java.lang.String r8 = "PropertySet"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00d9:
            java.lang.String r8 = "Motion"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 6
            goto L_0x00ee
        L_0x00e3:
            java.lang.String r8 = "Layout"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 5
            goto L_0x00ee
        L_0x00ed:
            r9 = -1
        L_0x00ee:
            java.lang.String r1 = "XML parser error must be within a Constraint "
            switch(r9) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01ad;
                case 3: goto L_0x0188;
                case 4: goto L_0x0163;
                case 5: goto L_0x013d;
                case 6: goto L_0x0117;
                case 7: goto L_0x00f5;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x01d3
        L_0x00f5:
            if (r7 == 0) goto L_0x00fe
            java.util.HashMap r1 = r7.f     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.C0477b.a(r13, r14, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x00fe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0117:
            if (r7 == 0) goto L_0x0124
            t.j r1 = r7.f4623c     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x0124:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x013d:
            if (r7 == 0) goto L_0x014a
            t.i r1 = r7.f4624d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x014a:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0163:
            if (r7 == 0) goto L_0x016f
            t.l r1 = r7.f4625e     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x016f:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0188:
            if (r7 == 0) goto L_0x0194
            t.k r1 = r7.b     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x0194:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x01ad:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.h r7 = t.m.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.i r1 = r7.f4624d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.f4656c0 = r4     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01ba:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.h r7 = t.m.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.i r1 = r7.f4624d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.f4652a = r4     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01c7:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            t.h r7 = t.m.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01d0:
            r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x01d3:
            int r1 = r14.next()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x005e
        L_0x01d9:
            r13.printStackTrace()
            goto L_0x01e0
        L_0x01dd:
            r13.printStackTrace()
        L_0x01e0:
            java.lang.Object r13 = r12.f194c
            android.util.SparseArray r13 = (android.util.SparseArray) r13
            r13.put(r3, r0)
            goto L_0x01ec
        L_0x01e8:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.G(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public C0023o H(Y y2, int i2) {
        i0 i0Var;
        C0023o oVar;
        k kVar = (k) this.b;
        int e2 = kVar.e(y2);
        if (e2 >= 0 && (i0Var = (i0) kVar.j(e2)) != null) {
            int i3 = i0Var.f1714a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                i0Var.f1714a = i4;
                if (i2 == 4) {
                    oVar = i0Var.b;
                } else if (i2 == 8) {
                    oVar = i0Var.f1715c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    kVar.i(e2);
                    i0Var.f1714a = 0;
                    i0Var.b = null;
                    i0Var.f1715c = null;
                    i0.f1713d.c(i0Var);
                }
                return oVar;
            }
        }
        return null;
    }

    public void I(Y y2) {
        i0 i0Var = (i0) ((k) this.b).getOrDefault(y2, (Object) null);
        if (i0Var != null) {
            i0Var.f1714a &= -2;
        }
    }

    public void J(Y y2) {
        C0292e eVar = (C0292e) this.f194c;
        int g2 = eVar.g() - 1;
        while (true) {
            if (g2 < 0) {
                break;
            } else if (y2 == eVar.h(g2)) {
                Object[] objArr = eVar.f3687h;
                Object obj = objArr[g2];
                Object obj2 = C0292e.f3685j;
                if (obj != obj2) {
                    objArr[g2] = obj2;
                    eVar.f = true;
                }
            } else {
                g2--;
            }
        }
        i0 i0Var = (i0) ((k) this.b).remove(y2);
        if (i0Var != null) {
            i0Var.f1714a = 0;
            i0Var.b = null;
            i0Var.f1715c = null;
            i0.f1713d.c(i0Var);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void K() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0013 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0013 }
            r0.size()     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r1.f194c     // Catch:{ all -> 0x0013 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0013 }
            r0.size()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0013:
            r0 = move-exception
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.K():void");
    }

    public void a(Y y2, C0023o oVar) {
        k kVar = (k) this.b;
        i0 i0Var = (i0) kVar.getOrDefault(y2, (Object) null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(y2, i0Var);
        }
        i0Var.f1715c = oVar;
        i0Var.f1714a |= 8;
    }

    public t0 c(View view, t0 t0Var) {
        boolean z2;
        int i2;
        int i3;
        View view2 = view;
        t0 t0Var2 = t0Var;
        n nVar = (n) this.f194c;
        int i4 = nVar.f4847a;
        G.j jVar = (G.j) this.b;
        r0 r0Var = t0Var2.f464a;
        d f = r0Var.f(7);
        d f2 = r0Var.f(32);
        int i5 = f.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar.b;
        bottomSheetBehavior.f1895w = i5;
        boolean e2 = l.e(view2);
        int paddingBottom = view2.getPaddingBottom();
        int paddingLeft = view2.getPaddingLeft();
        int paddingRight = view2.getPaddingRight();
        boolean z3 = bottomSheetBehavior.f1887o;
        if (z3) {
            int a2 = t0Var2.a();
            bottomSheetBehavior.f1894v = a2;
            paddingBottom = a2 + nVar.f4848c;
        }
        int i6 = nVar.b;
        boolean z4 = bottomSheetBehavior.f1888p;
        int i7 = f.f4a;
        if (z4) {
            if (e2) {
                i3 = i6;
            } else {
                i3 = i4;
            }
            paddingLeft = i3 + i7;
        }
        boolean z5 = bottomSheetBehavior.f1889q;
        int i8 = f.f5c;
        if (z5) {
            if (!e2) {
                i4 = i6;
            }
            paddingRight = i4 + i8;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f1891s || marginLayoutParams.leftMargin == i7) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i7;
            z2 = true;
        }
        if (bottomSheetBehavior.f1892t && marginLayoutParams.rightMargin != i8) {
            marginLayoutParams.rightMargin = i8;
            z2 = true;
        }
        if (!bottomSheetBehavior.f1893u || marginLayoutParams.topMargin == (i2 = f.b)) {
            z6 = z2;
        } else {
            marginLayoutParams.topMargin = i2;
        }
        if (z6) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = jVar.f246a;
        if (z7) {
            bottomSheetBehavior.f1885m = f2.f6d;
        }
        if (!z3 && !z7) {
            return t0Var2;
        }
        bottomSheetBehavior.I();
        return t0Var2;
    }

    public void d(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void e(boolean z2) {
        D d2 = (D) this.f194c;
        C0137h hVar = d2.f1210n.f1385m;
        C0058o oVar = d2.f1212p;
        if (oVar != null) {
            oVar.j().f1207k.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void f(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void g(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void h(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void i(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void j(boolean z2) {
        D d2 = (D) this.f194c;
        C0137h hVar = d2.f1210n.f1385m;
        C0058o oVar = d2.f1212p;
        if (oVar != null) {
            oVar.j().f1207k.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void k(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void l(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void m(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void n(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void o(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void p(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void q(boolean z2) {
        C0058o oVar = ((D) this.f194c).f1212p;
        if (oVar != null) {
            oVar.j().f1207k.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void r(String str, PrintWriter printWriter) {
        n.l lVar = ((a) this.f194c).f783c;
        if (lVar.f3709h > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lVar.f3709h > 0) {
                if (lVar.f3708g[0] == null) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(lVar.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public void s(int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void t(d1.B r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f194c     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x000c }
            r0.add(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)
            return
        L_0x000a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        L_0x000c:
            r2 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.t(d1.B):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r2 = r1.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f193a
            switch(r0) {
                case 2: goto L_0x0071;
                case 5: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r4.b
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = "null"
            r0.append(r1)
            goto L_0x0067
        L_0x0030:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            int r3 = r2.length()
            if (r3 > 0) goto L_0x0054
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 46
            int r3 = r2.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0054
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L_0x0054:
            r0.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L_0x0067:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bounds{lower="
            r0.<init>(r1)
            java.lang.Object r1 = r4.b
            A.d r1 = (A.d) r1
            r0.append(r1)
            java.lang.String r1 = " upper="
            r0.append(r1)
            java.lang.Object r1 = r4.f194c
            A.d r1 = (A.d) r1
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.toString():java.lang.String");
    }

    public View u(int i2, int i3, int i4, int i5) {
        int i6;
        View view;
        H h2 = (H) this.b;
        int d2 = h2.d();
        int c2 = h2.c();
        if (i3 > i2) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        View view2 = null;
        while (i2 != i3) {
            switch (h2.f1573a) {
                case 0:
                    view = h2.b.u(i2);
                    break;
                default:
                    view = h2.b.u(i2);
                    break;
            }
            int b2 = h2.b(view);
            int a2 = h2.a(view);
            h0 h0Var = (h0) this.f194c;
            h0Var.b = d2;
            h0Var.f1697c = c2;
            h0Var.f1698d = b2;
            h0Var.f1699e = a2;
            if (i4 != 0) {
                h0Var.f1696a = i4;
                if (h0Var.a()) {
                    return view;
                }
            }
            if (i5 != 0) {
                h0Var.f1696a = i5;
                if (h0Var.a()) {
                    view2 = view;
                }
            }
            i2 += i6;
        }
        return view2;
    }

    public void v(d1.B b2) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f194c;
        synchronized (this) {
            try {
                if (arrayDeque.remove(b2)) {
                    K();
                } else {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r6 >= r7) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean x(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.m r13) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r13.f1170c
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L_0x00fe
            java.lang.Object r1 = r9.f194c
            androidx.emoji2.text.d r1 = (androidx.emoji2.text.d) r1
            S.a r4 = r13.b()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L_0x0023
            java.lang.Object r6 = r4.f386d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.f384a
            int r5 = r5 + r4
            short r4 = r6.getShort(r5)
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            r1.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L_0x0032
            if (r4 <= r5) goto L_0x0032
        L_0x002f:
            r10 = 0
            goto L_0x00f7
        L_0x0032:
            java.lang.ThreadLocal r4 = androidx.emoji2.text.d.b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x0042
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L_0x0042:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r3)
        L_0x004b:
            if (r11 >= r12) goto L_0x0056
            char r5 = r10.charAt(r11)
            r4.append(r5)
            int r11 = r11 + r0
            goto L_0x004b
        L_0x0056:
            android.text.TextPaint r10 = r1.f1149a
            java.lang.String r11 = r4.toString()
            java.lang.ThreadLocal r12 = A.f.f7a
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r6) goto L_0x0068
            boolean r10 = A.e.a(r10, r11)
            goto L_0x00f7
        L_0x0068:
            int r12 = r11.length()
            if (r12 != r0) goto L_0x0079
            char r1 = r11.charAt(r3)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L_0x0079
            goto L_0x00bf
        L_0x0079:
            java.lang.String r1 = "󟿽"
            float r4 = r10.measureText(r1)
            java.lang.String r5 = "m"
            float r5 = r10.measureText(r5)
            float r6 = r10.measureText(r11)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x008f
            goto L_0x00b9
        L_0x008f:
            int r8 = r11.length()
            int r8 = r11.codePointCount(r3, r8)
            if (r8 <= r0) goto L_0x00bb
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a2
            goto L_0x00b9
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            if (r5 >= r12) goto L_0x00b5
            int r8 = r11.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r10.measureText(r11, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L_0x00a3
        L_0x00b5:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00bb
        L_0x00b9:
            goto L_0x002f
        L_0x00bb:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00c1
        L_0x00bf:
            r10 = 1
            goto L_0x00f7
        L_0x00c1:
            java.lang.ThreadLocal r4 = A.f.f7a
            java.lang.Object r5 = r4.get()
            H.a r5 = (H.a) r5
            if (r5 != 0) goto L_0x00de
            H.a r5 = new H.a
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L_0x00e8
        L_0x00de:
            android.graphics.Rect r4 = r5.f259a
            r4.setEmpty()
            android.graphics.Rect r4 = r5.b
            r4.setEmpty()
        L_0x00e8:
            android.graphics.Rect r4 = r5.f259a
            r10.getTextBounds(r1, r3, r2, r4)
            android.graphics.Rect r1 = r5.b
            r10.getTextBounds(r11, r3, r12, r1)
            boolean r10 = r4.equals(r1)
            r10 = r10 ^ r0
        L_0x00f7:
            if (r10 == 0) goto L_0x00fb
            r10 = 2
            goto L_0x00fc
        L_0x00fb:
            r10 = 1
        L_0x00fc:
            r13.f1170c = r10
        L_0x00fe:
            int r10 = r13.f1170c
            if (r10 != r2) goto L_0x0103
            return r0
        L_0x0103:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.x(java.lang.CharSequence, int, int, androidx.emoji2.text.m):boolean");
    }

    public void y() {
        ((SparseIntArray) this.b).clear();
    }

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f193a = i2;
        this.b = obj;
        this.f194c = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i2, boolean z2) {
        this.f193a = i2;
        this.f194c = obj;
        this.b = obj2;
    }

    public c(File file) {
        this.f193a = 3;
        Q0.j jVar = Q0.j.f;
        this.b = file;
        this.f194c = jVar;
    }

    public c(androidx.lifecycle.r rVar, K k2) {
        a aVar;
        this.f193a = 5;
        this.b = rVar;
        i.e("store", k2);
        X.a aVar2 = X.a.b;
        i.e("defaultCreationExtras", aVar2);
        Class<a> cls = a.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            i.e("key", concat);
            LinkedHashMap linkedHashMap = k2.f1421a;
            I i2 = (I) linkedHashMap.get(concat);
            if (cls.isInstance(i2)) {
                i.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", i2);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(aVar2.f781a);
                linkedHashMap2.put(J.b, concat);
                try {
                    aVar = new a();
                } catch (AbstractMethodError unused) {
                    aVar = new a();
                }
                i2 = aVar;
                I i3 = (I) linkedHashMap.put(concat, i2);
                if (i3 != null) {
                    i3.a();
                }
            }
            this.f194c = (a) i2;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public c(D d2) {
        this.f193a = 9;
        this.b = new CopyOnWriteArrayList();
        this.f194c = d2;
    }

    public c(Runnable runnable) {
        this.f193a = 1;
        this.f194c = new CopyOnWriteArrayList();
        new HashMap();
        this.b = runnable;
    }

    public c(r rVar, e eVar, androidx.emoji2.text.d dVar) {
        this.f193a = 7;
        this.b = rVar;
        this.f194c = dVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [b0.h0, java.lang.Object] */
    public c(H h2) {
        this.f193a = 12;
        this.b = h2;
        ? obj = new Object();
        obj.f1696a = 0;
        this.f194c = obj;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f193a = 21;
        int size = arrayList.size();
        this.b = new int[size];
        this.f194c = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.b)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f194c)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public c(int i2, int i3) {
        this.f193a = 21;
        this.b = new int[]{i2, i3};
        this.f194c = new float[]{0.0f, 1.0f};
    }

    public c(int i2, int i3, int i4) {
        this.f193a = 21;
        this.b = new int[]{i2, i3, i4};
        this.f194c = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.text.Editable$Factory, T.a] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.widget.EditText r6) {
        /*
            r5 = this;
            r0 = 4
            r5.f193a = r0
            r0 = 0
            r5.<init>()
            r5.b = r6
            T.i r1 = new T.i
            r1.<init>(r6)
            r5.f194c = r1
            r6.addTextChangedListener(r1)
            T.a r1 = T.a.b
            if (r1 != 0) goto L_0x003a
            java.lang.Object r1 = T.a.f706a
            monitor-enter(r1)
            T.a r2 = T.a.b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0036
            T.a r2 = new T.a     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<T.a> r4 = T.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x0031 }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x0031 }
            T.a.f707c = r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            T.a.b = r2     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r6 = move-exception
            goto L_0x0038
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x003a
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r6
        L_0x003a:
            T.a r0 = T.a.b
            r6.setEditableFactory(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.<init>(android.widget.EditText):void");
    }

    public c(Animation animation) {
        this.f193a = 8;
        this.b = animation;
        this.f194c = null;
    }

    public c(Animator animator) {
        this.f193a = 8;
        this.b = null;
        this.f194c = animator;
    }

    public c(int i2) {
        this.f193a = i2;
        switch (i2) {
            case 13:
                this.b = new k();
                this.f194c = new C0292e();
                return;
            case 15:
                new ArrayDeque();
                this.b = new ArrayDeque();
                this.f194c = new ArrayDeque();
                return;
            default:
                this.b = new SparseIntArray();
                this.f194c = new SparseIntArray();
                return;
        }
    }
}

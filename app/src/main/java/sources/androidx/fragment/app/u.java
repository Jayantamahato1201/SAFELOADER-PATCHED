package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public final class u implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final D f1394a;

    public u(D d2) {
        this.f1394a = d2;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: androidx.fragment.app.o} */
    /* JADX WARNING: type inference failed for: r0v14, types: [android.widget.FrameLayout, android.view.View, androidx.fragment.app.FragmentContainerView, android.view.ViewGroup] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r19, java.lang.String r20, android.content.Context r21, android.util.AttributeSet r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r4 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "Fragment "
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 1
            androidx.fragment.app.D r10 = r1.f1394a
            if (r4 == 0) goto L_0x01cf
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>(r2, r3)
            r0.f1238d = r9
            java.lang.String r4 = r3.getClassAttribute()
            int[] r11 = V.a.b
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r11)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = r3.getString(r7)
        L_0x0033:
            java.lang.String r11 = r3.getString(r9)
            r3.recycle()
            int r3 = r0.getId()
            androidx.fragment.app.o r12 = r10.y(r3)
            if (r4 == 0) goto L_0x01a0
            if (r12 != 0) goto L_0x01a0
            java.lang.String r12 = " with tag "
            if (r3 > 0) goto L_0x005f
            if (r11 == 0) goto L_0x0051
            java.lang.String r0 = r12.concat(r11)
            goto L_0x0053
        L_0x0051:
            java.lang.String r0 = ""
        L_0x0053:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r0 = A.g.i(r3, r4, r0)
            r2.<init>(r0)
            throw r2
        L_0x005f:
            androidx.fragment.app.x r3 = r10.A()
            r2.getClassLoader()
            androidx.fragment.app.o r2 = r3.a(r4)
            r2.f1345C = r9
            androidx.fragment.app.r r3 = r2.f1374s
            if (r3 != 0) goto L_0x0072
            r3 = r8
            goto L_0x0074
        L_0x0072:
            e.h r3 = r3.f1384l
        L_0x0074:
            if (r3 == 0) goto L_0x0078
            r2.f1345C = r9
        L_0x0078:
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r10)
            r3.f1284o = r9
            r2.D = r0
            int r4 = r0.getId()
            java.lang.Class r13 = r2.getClass()
            int r14 = r13.getModifiers()
            boolean r15 = r13.isAnonymousClass()
            if (r15 != 0) goto L_0x0185
            boolean r15 = java.lang.reflect.Modifier.isPublic(r14)
            if (r15 == 0) goto L_0x0185
            boolean r15 = r13.isMemberClass()
            if (r15 == 0) goto L_0x00a5
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 == 0) goto L_0x0185
        L_0x00a5:
            java.lang.String r5 = " now "
            java.lang.String r13 = ": was "
            if (r11 == 0) goto L_0x00da
            java.lang.String r14 = r2.f1379x
            if (r14 == 0) goto L_0x00d8
            boolean r14 = r11.equals(r14)
            if (r14 == 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't change tag of fragment "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r2.f1379x
            r3.append(r2)
            r3.append(r5)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x00d8:
            r2.f1379x = r11
        L_0x00da:
            if (r4 == 0) goto L_0x012b
            if (r4 == r6) goto L_0x010c
            int r6 = r2.f1377v
            if (r6 == 0) goto L_0x0107
            if (r6 != r4) goto L_0x00e5
            goto L_0x0107
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Can't change container ID of fragment "
            r3.<init>(r6)
            r3.append(r2)
            r3.append(r13)
            int r2 = r2.f1377v
            r3.append(r2)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0107:
            r2.f1377v = r4
            r2.f1378w = r4
            goto L_0x012b
        L_0x010c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't add fragment "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r2 = " to container view with no id"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x012b:
            androidx.fragment.app.J r4 = new androidx.fragment.app.J
            r4.<init>(r9, r2)
            r3.b(r4)
            androidx.fragment.app.D r4 = r3.f1285p
            r2.f1373r = r4
            boolean r2 = r3.f1276g
            if (r2 != 0) goto L_0x017d
            androidx.fragment.app.r r2 = r4.f1210n
            if (r2 == 0) goto L_0x01a0
            boolean r2 = r4.f1193A
            if (r2 == 0) goto L_0x0144
            goto L_0x01a0
        L_0x0144:
            r4.v(r9)
            java.util.ArrayList r2 = r4.f1195C
            java.util.ArrayList r5 = r4.D
            r3.a(r2, r5)
            r4.b = r9
            java.util.ArrayList r2 = r4.f1195C     // Catch:{ all -> 0x0178 }
            java.util.ArrayList r3 = r4.D     // Catch:{ all -> 0x0178 }
            r4.M(r2, r3)     // Catch:{ all -> 0x0178 }
            r4.d()
            r4.W()
            boolean r2 = r4.f1194B
            if (r2 == 0) goto L_0x0166
            r4.f1194B = r7
            r4.V()
        L_0x0166:
            N.g r2 = r4.f1200c
            java.lang.Object r2 = r2.f606c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Set r3 = java.util.Collections.singleton(r8)
            r2.removeAll(r3)
            goto L_0x01a0
        L_0x0178:
            r0 = move-exception
            r4.d()
            throw r0
        L_0x017d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "This transaction is already being added to the back stack"
            r0.<init>(r2)
            throw r0
        L_0x0185:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r3 = r13.getCanonicalName()
            r2.append(r3)
            java.lang.String r3 = " must be a public static class to be  properly recreated from instance state."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01a0:
            N.g r2 = r10.f1200c
            java.util.ArrayList r2 = r2.l()
            int r3 = r2.size()
        L_0x01aa:
            if (r7 >= r3) goto L_0x01ce
            java.lang.Object r4 = r2.get(r7)
            int r7 = r7 + 1
            androidx.fragment.app.I r4 = (androidx.fragment.app.I) r4
            androidx.fragment.app.o r5 = r4.f1252c
            int r6 = r5.f1378w
            int r8 = r0.getId()
            if (r6 != r8) goto L_0x01aa
            android.view.View r6 = r5.f1346E
            if (r6 == 0) goto L_0x01aa
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x01aa
            r5.D = r0
            r4.b()
            goto L_0x01aa
        L_0x01ce:
            return r0
        L_0x01cf:
            java.lang.String r4 = "fragment"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01db
        L_0x01d7:
            r17 = r8
            goto L_0x03bd
        L_0x01db:
            java.lang.String r0 = "class"
            java.lang.String r0 = r3.getAttributeValue(r8, r0)
            int[] r4 = V.a.f775a
            android.content.res.TypedArray r4 = r2.obtainStyledAttributes(r3, r4)
            if (r0 != 0) goto L_0x01ed
            java.lang.String r0 = r4.getString(r7)
        L_0x01ed:
            int r11 = r4.getResourceId(r9, r6)
            r12 = 2
            java.lang.String r13 = r4.getString(r12)
            r4.recycle()
            if (r0 == 0) goto L_0x01d7
            java.lang.ClassLoader r4 = r2.getClassLoader()
            java.lang.Class r4 = androidx.fragment.app.x.b(r4, r0)     // Catch:{ ClassNotFoundException -> 0x020a }
            java.lang.Class<androidx.fragment.app.o> r14 = androidx.fragment.app.C0058o.class
            boolean r4 = r14.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x020a }
            goto L_0x020c
        L_0x020a:
            r4 = 0
        L_0x020c:
            if (r4 != 0) goto L_0x020f
            goto L_0x01d7
        L_0x020f:
            if (r19 == 0) goto L_0x0215
            int r7 = r19.getId()
        L_0x0215:
            if (r7 != r6) goto L_0x023a
            if (r11 != r6) goto L_0x023a
            if (r13 == 0) goto L_0x021c
            goto L_0x023a
        L_0x021c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L_0x023a:
            if (r11 == r6) goto L_0x0241
            androidx.fragment.app.o r4 = r10.y(r11)
            goto L_0x0242
        L_0x0241:
            r4 = r8
        L_0x0242:
            if (r4 != 0) goto L_0x029d
            if (r13 == 0) goto L_0x029d
            N.g r4 = r10.f1200c
            java.lang.Object r14 = r4.b
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            int r15 = r15 - r9
        L_0x0251:
            if (r15 < 0) goto L_0x0271
            java.lang.Object r16 = r14.get(r15)
            r17 = r8
            r8 = r16
            androidx.fragment.app.o r8 = (androidx.fragment.app.C0058o) r8
            r20 = 2
            if (r8 == 0) goto L_0x026b
            java.lang.String r12 = r8.f1379x
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x026b
        L_0x0269:
            r4 = r8
            goto L_0x02a1
        L_0x026b:
            int r15 = r15 + -1
            r8 = r17
            r12 = 2
            goto L_0x0251
        L_0x0271:
            r17 = r8
            r20 = 2
            java.lang.Object r4 = r4.f606c
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x0281:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x029a
            java.lang.Object r8 = r4.next()
            androidx.fragment.app.I r8 = (androidx.fragment.app.I) r8
            if (r8 == 0) goto L_0x0281
            androidx.fragment.app.o r8 = r8.f1252c
            java.lang.String r12 = r8.f1379x
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0281
            goto L_0x0269
        L_0x029a:
            r4 = r17
            goto L_0x02a1
        L_0x029d:
            r17 = r8
            r20 = 2
        L_0x02a1:
            if (r4 != 0) goto L_0x02a9
            if (r7 == r6) goto L_0x02a9
            androidx.fragment.app.o r4 = r10.y(r7)
        L_0x02a9:
            java.lang.String r6 = "FragmentManager"
            if (r4 != 0) goto L_0x0302
            androidx.fragment.app.x r3 = r10.A()
            r2.getClassLoader()
            androidx.fragment.app.o r4 = r3.a(r0)
            r4.f1368m = r9
            if (r11 == 0) goto L_0x02be
            r2 = r11
            goto L_0x02bf
        L_0x02be:
            r2 = r7
        L_0x02bf:
            r4.f1377v = r2
            r4.f1378w = r7
            r4.f1379x = r13
            r4.f1369n = r9
            r4.f1373r = r10
            androidx.fragment.app.r r2 = r10.f1210n
            r4.f1374s = r2
            e.h r3 = r2.f1385m
            r4.f1345C = r9
            if (r2 != 0) goto L_0x02d6
            r8 = r17
            goto L_0x02d8
        L_0x02d6:
            e.h r8 = r2.f1384l
        L_0x02d8:
            if (r8 == 0) goto L_0x02dc
            r4.f1345C = r9
        L_0x02dc:
            androidx.fragment.app.I r2 = r10.a(r4)
            boolean r3 = androidx.fragment.app.D.D(r20)
            if (r3 == 0) goto L_0x0344
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r7 = " has been inflated via the <fragment> tag: id=0x"
            r3.append(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r11)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r6, r3)
            goto L_0x0344
        L_0x0302:
            boolean r2 = r4.f1369n
            if (r2 != 0) goto L_0x037f
            r4.f1369n = r9
            r4.f1373r = r10
            androidx.fragment.app.r r2 = r10.f1210n
            r4.f1374s = r2
            e.h r3 = r2.f1385m
            r4.f1345C = r9
            if (r2 != 0) goto L_0x0317
            r8 = r17
            goto L_0x0319
        L_0x0317:
            e.h r8 = r2.f1384l
        L_0x0319:
            if (r8 == 0) goto L_0x031d
            r4.f1345C = r9
        L_0x031d:
            androidx.fragment.app.I r2 = r10.f(r4)
            boolean r3 = androidx.fragment.app.D.D(r20)
            if (r3 == 0) goto L_0x0344
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Retained Fragment "
            r3.<init>(r7)
            r3.append(r4)
            java.lang.String r7 = " has been re-attached via the <fragment> tag: id=0x"
            r3.append(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r11)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r6, r3)
        L_0x0344:
            r3 = r19
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4.D = r3
            r2.k()
            r2.j()
            android.view.View r3 = r4.f1346E
            if (r3 == 0) goto L_0x0373
            if (r11 == 0) goto L_0x0359
            r3.setId(r11)
        L_0x0359:
            android.view.View r0 = r4.f1346E
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x0366
            android.view.View r0 = r4.f1346E
            r0.setTag(r13)
        L_0x0366:
            android.view.View r0 = r4.f1346E
            androidx.fragment.app.t r3 = new androidx.fragment.app.t
            r3.<init>(r1, r2)
            r0.addOnAttachStateChangeListener(r3)
            android.view.View r0 = r4.f1346E
            return r0
        L_0x0373:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = " did not create a view."
            java.lang.String r0 = A.g.i(r5, r0, r3)
            r2.<init>(r0)
            throw r2
        L_0x037f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Duplicate id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r11)
            r4.append(r3)
            java.lang.String r3 = ", tag "
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = ", or parent id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r7)
            r4.append(r3)
            java.lang.String r3 = " with another fragment for "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L_0x03bd:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}

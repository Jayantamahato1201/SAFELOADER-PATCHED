package androidx.fragment.app;

import F.c;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final class C0048e extends C0049f {

    /* renamed from: c  reason: collision with root package name */
    public boolean f1307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1308d;

    /* renamed from: e  reason: collision with root package name */
    public c f1309e;

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c4 A[SYNTHETIC, Splitter:B:61:0x00c4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final F.c j(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.f1308d
            if (r0 == 0) goto L_0x0007
            F.c r9 = r8.f1309e
            return r9
        L_0x0007:
            java.lang.Object r0 = r8.f1310a
            androidx.fragment.app.N r0 = (androidx.fragment.app.N) r0
            int r1 = r0.f1266a
            r2 = 2
            r3 = 1
            if (r1 != r2) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r2 = r8.f1307c
            androidx.fragment.app.o r0 = r0.f1267c
            androidx.fragment.app.n r4 = r0.f1349H
            r5 = 0
            if (r4 != 0) goto L_0x001f
            r6 = 0
            goto L_0x0021
        L_0x001f:
            int r6 = r4.f
        L_0x0021:
            if (r2 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x003f
        L_0x0029:
            int r2 = r4.f1335d
            goto L_0x003f
        L_0x002c:
            if (r4 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            int r2 = r4.f1336e
            goto L_0x003f
        L_0x0032:
            if (r1 == 0) goto L_0x003a
            if (r4 != 0) goto L_0x0037
            goto L_0x0027
        L_0x0037:
            int r2 = r4.b
            goto L_0x003f
        L_0x003a:
            if (r4 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            int r2 = r4.f1334c
        L_0x003f:
            r0.y(r5, r5, r5, r5)
            android.view.ViewGroup r4 = r0.D
            r5 = 0
            if (r4 == 0) goto L_0x0055
            r7 = 2131231184(0x7f0801d0, float:1.8078442E38)
            java.lang.Object r4 = r4.getTag(r7)
            if (r4 == 0) goto L_0x0055
            android.view.ViewGroup r4 = r0.D
            r4.setTag(r7, r5)
        L_0x0055:
            android.view.ViewGroup r0 = r0.D
            if (r0 == 0) goto L_0x0061
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0061
            goto L_0x00e0
        L_0x0061:
            if (r2 != 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            r0 = 4097(0x1001, float:5.741E-42)
            if (r6 == r0) goto L_0x0094
            r0 = 4099(0x1003, float:5.744E-42)
            if (r6 == r0) goto L_0x0084
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r6 == r0) goto L_0x0074
            r0 = -1
            r2 = -1
            goto L_0x00a3
        L_0x0074:
            if (r1 == 0) goto L_0x007d
            r0 = 2130837507(0x7f020003, float:1.727997E38)
            r2 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x00a3
        L_0x007d:
            r0 = 2130837508(0x7f020004, float:1.7279972E38)
            r2 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L_0x00a3
        L_0x0084:
            if (r1 == 0) goto L_0x008d
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            r2 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x00a3
        L_0x008d:
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            r2 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L_0x00a3
        L_0x0094:
            if (r1 == 0) goto L_0x009d
            r0 = 2130837511(0x7f020007, float:1.7279978E38)
            r2 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x00a3
        L_0x009d:
            r0 = 2130837512(0x7f020008, float:1.727998E38)
            r2 = 2130837512(0x7f020008, float:1.727998E38)
        L_0x00a3:
            if (r2 == 0) goto L_0x00e0
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r2)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c4
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)     // Catch:{ NotFoundException -> 0x00c2, RuntimeException -> 0x00c4 }
            if (r1 == 0) goto L_0x00e0
            F.c r4 = new F.c     // Catch:{ NotFoundException -> 0x00c2, RuntimeException -> 0x00c4 }
            r4.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00c2, RuntimeException -> 0x00c4 }
        L_0x00c0:
            r5 = r4
            goto L_0x00e0
        L_0x00c2:
            r9 = move-exception
            throw r9
        L_0x00c4:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r2)     // Catch:{ RuntimeException -> 0x00d0 }
            if (r1 == 0) goto L_0x00e0
            F.c r4 = new F.c     // Catch:{ RuntimeException -> 0x00d0 }
            r4.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00d0 }
            goto L_0x00c0
        L_0x00d0:
            r1 = move-exception
            if (r0 != 0) goto L_0x00df
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)
            if (r9 == 0) goto L_0x00e0
            F.c r5 = new F.c
            r5.<init>((android.view.animation.Animation) r9)
            goto L_0x00e0
        L_0x00df:
            throw r1
        L_0x00e0:
            r8.f1309e = r5
            r8.f1308d = r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0048e.j(android.content.Context):F.c");
    }
}

package k;

import A.j;
import android.content.Context;
import android.view.View;
import com.cheatbox.R;
import j.C0209m;
import j.C0217u;
import j.x;

/* renamed from: k.f  reason: case insensitive filesystem */
public final class C0240f extends x {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3457l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0248j f3458m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0240f(C0248j jVar, Context context, C0209m mVar, View view) {
        super(R.attr.MT_Bin, context, view, mVar, true);
        this.f3458m = jVar;
        this.f = 8388613;
        j jVar2 = jVar.f3495w;
        this.f3169h = jVar2;
        C0217u uVar = this.f3170i;
        if (uVar != null) {
            uVar.i(jVar2);
        }
    }

    public final void c() {
        switch (this.f3457l) {
            case 0:
                C0248j jVar = this.f3458m;
                jVar.f3492t = null;
                jVar.getClass();
                super.c();
                return;
            default:
                C0248j jVar2 = this.f3458m;
                C0209m mVar = jVar2.f3476c;
                if (mVar != null) {
                    mVar.c(true);
                }
                jVar2.f3491s = null;
                super.c();
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0240f(k.C0248j r8, android.content.Context r9, j.C0196F r10, android.view.View r11) {
        /*
            r7 = this;
            r0 = 0
            r7.f3457l = r0
            r7.f3458m = r8
            r6 = 0
            r2 = 2130903072(0x7f030020, float:1.7412952E38)
            r1 = r7
            r3 = r9
            r5 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            j.o r9 = r5.f3047A
            int r9 = r9.f3152x
            r10 = 32
            r9 = r9 & r10
            if (r9 != r10) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            k.i r9 = r8.f3481i
            if (r9 != 0) goto L_0x0022
            j.B r9 = r8.f3480h
            android.view.View r9 = (android.view.View) r9
        L_0x0022:
            r1.f3167e = r9
        L_0x0024:
            A.j r8 = r8.f3495w
            r1.f3169h = r8
            j.u r9 = r1.f3170i
            if (r9 == 0) goto L_0x002f
            r9.i(r8)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0240f.<init>(k.j, android.content.Context, j.F, android.view.View):void");
    }
}
